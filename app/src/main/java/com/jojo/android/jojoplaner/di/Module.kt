package com.jojo.android.jojoplaner.di

import com.jojo.android.jojoplaner.data.repository.PlanRepositoryImp
import com.jojo.android.jojoplaner.domain.repository.PlanRepository
import com.jojo.android.jojoplaner.presentation.viewModel.PlanViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object Module {

    val applicationModule = module {

        //Repositories
        single<PlanRepository> { PlanRepositoryImp() }


        //ViewModels
        viewModel {
            PlanViewModel(get())
        }
    }
}