/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.architecture.blueprints.todoapp.tasks;

import android.support.annotation.NonNull;

import com.example.android.architecture.blueprints.todoapp.BasePresenter;
import com.example.android.architecture.blueprints.todoapp.BaseView;
import com.example.android.architecture.blueprints.todoapp.data.Task;

import java.util.List;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface TasksContract {

    interface View extends BaseView<Presenter> {
        /**
         * 设置加载指示器
         * @param active boolean true表示显示加载指示器 false表示不显示加载指示器
         */
        void setLoadingIndicator(boolean active);

        /**
         * 显示任务列表
         * @param tasks 任务列表
         */
        void showTasks(List<Task> tasks);

        /**
         * 显示添加任务页面
         */
        void showAddTask();

        /**
         * 显示任务详情页面
         * @param taskId 任务id
         */
        void showTaskDetailsUi(String taskId);

        /**
         * 显示完成任务的标记
         */
        void showTaskMarkedComplete();

        /**
         * 显示激活任务的标记
         */
        void showTaskMarkedActive();

        /**
         * 显示完成任务清理
         */
        void showCompletedTasksCleared();

        /**
         * 显示加载任务错误
         */
        void showLoadingTasksError();

        /**
         * 显示没有任务
         */
        void showNoTasks();

        /**
         * 显示活跃的过滤标签
         */
        void showActiveFilterLabel();

        /**
         * 显示完成的过滤标签
         */
        void showCompletedFilterLabel();

        /**
         * 显示所有的过滤标签
         */
        void showAllFilterLabel();

        /**
         * 显示没有活跃的任务
         */
        void showNoActiveTasks();

        /**
         * 显示没有完成的任务
         */
        void showNoCompletedTasks();

        /**
         * 显示成功保存任务的信息
         */
        void showSuccessfullySavedMessage();

        /**
         * 判断 View 是否活跃
         * @return
         */
        boolean isActive();

        /**
         * 显示过滤任务的弹出菜单
         */
        void showFilteringPopUpMenu();
    }

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        /**
         * 加载任务列表
         * @param forceUpdate 强制刷新标记 true 表示强制刷新 false 表示不强制刷新
         */
        void loadTasks(boolean forceUpdate);

        /**
         * 添加新的任务
         */
        void addNewTask();

        /**
         * 打开任务详情
         * @param requestedTask
         */
        void openTaskDetails(@NonNull Task requestedTask);

        /**
         * 标记完成任务
         * @param completedTask 完成的任务对象
         */
        void completeTask(@NonNull Task completedTask);

        /**
         * 标记激活任务
         * @param activeTask 激活的任务对象
         */
        void activateTask(@NonNull Task activeTask);

        /**
         * 清除完成的任务
         */
        void clearCompletedTasks();

        /**
         * 设置任务过滤类型
         * @param requestType
         */
        void setFiltering(TasksFilterType requestType);

        /**
         * 获取任务过滤类型
         * @return
         */
        TasksFilterType getFiltering();
    }
}
