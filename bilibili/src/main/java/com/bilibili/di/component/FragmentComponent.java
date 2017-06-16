package com.bilibili.di.component;

import android.app.Activity;

import com.bilibili.di.module.FragmentModule;
import com.bilibili.di.scope.PerFragment;
import com.bilibili.ui.main.MainFragment;
import com.bilibili.ui.test.fragment.NewsFragment;
import com.bilibili.ui.test.fragment.NewsPageFragment;

import dagger.Component;

/**
 * Created by jiayiyang on 17/4/14.
 */

@Component(dependencies = ApiComponent.class, modules = FragmentModule.class)
@PerFragment
public interface FragmentComponent {

    Activity getActivity();

    void inject(NewsFragment newsFragment);

    void inject(NewsPageFragment newsPageFragment);

    void inject(MainFragment mainFragment);

}