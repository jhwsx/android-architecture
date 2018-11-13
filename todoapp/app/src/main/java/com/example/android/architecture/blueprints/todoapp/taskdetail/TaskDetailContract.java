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

package com.example.android.architecture.blueprints.todoapp.taskdetail;

import com.example.android.architecture.blueprints.todoapp.BasePresenter;
import com.example.android.architecture.blueprints.todoapp.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface TaskDetailContract {

    interface View extends BaseView<Presenter> {
        /**
         * 设置加载指示器
         * @param active
         */
        void setLoadingIndicator(boolean active);

        /**
         * 显示缺少任务
         */
        void showMissingTask();

        /**
         * 隐藏标题
         */
        void hideTitle();

        /**
         * 显示标题
         * @param title
         */
        void showTitle(String title);

        /**
         * 隐藏描述
         */
        void hideDescription();

        /**
         * 显示描述
         * @param description
         */
        void showDescription(String description);

        /**
         * 显示完成状态
         * @param complete
         */
        void showCompletionStatus(boolean complete);

        /**
         * 显示编辑任务页面
         * @param taskId
         */
        void showEditTask(String taskId);

        /**
         * 显示任务删除
         */
        void showTaskDeleted();

        /**
         * 显示任务标记完成
         */
        void showTaskMarkedComplete();

        /**
         * 显示任务标记活跃
         */
        void showTaskMarkedActive();

        /**
         * 判断 View 是否活跃
         * @return
         */
        boolean isActive();
    }

    interface Presenter extends BasePresenter {
        /**
         * 编辑任务
         */
        void editTask();

        /**
         * 删除任务
         */
        void deleteTask();

        /**
         * 标记完成任务
         */
        void completeTask();

        /**
         * 激活任务
         */
        void activateTask();
    }
}
