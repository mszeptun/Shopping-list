package com.szeptun.shoppinglist.di

import com.szeptun.shoppinglist.ui.Lists.ListsFragment
import com.szeptun.shoppinglist.ui.ShoppingList.ShoppingListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [ListsFragmentModule::class])
    abstract fun bindListFragment(): ListsFragment
}