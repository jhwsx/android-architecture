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

package com.example.android.architecture.blueprints.todoapp.addedittask;

import com.example.android.architecture.blueprints.todoapp.BasePresenter;
import com.example.android.architecture.blueprints.todoapp.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface AddEditTaskContract {

    interface View extends BaseView<Presenter> {
        /**
         * 显示空任务错误
         */
        void showEmptyTaskError();

        /**
         * 显示任务列表
         */
        void showTasksList();

        /**
         * 设置任务标题
         * @param title
         */
        void setTitle(String title);

        /**
         * 设置任务描述
         * @param description
         */
        void setDescription(String description);

        /**
         * 判断 View 是否活跃
         * @return
         */
        boolean isActive();
    }

    interface Presenter extends BasePresenter {
        /**
         * 保存任务
         * @param title
         * @param description
         */
        void saveTask(String title, String description);

        void populateTask();

        /**
         * 是否是数据丢失
         * @return
         */
        boolean isDataMissing();
    }
}
