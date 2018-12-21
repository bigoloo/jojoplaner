package com.jojo.android.jojoplaner.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jojo.android.jojoplaner.data.models.Plan
import com.jojo.android.jojoplaner.domain.repository.PlanRepository

class PlanViewModel constructor(val planRepository: PlanRepository) : ViewModel() {

    val planList = MutableLiveData<List<Plan>>()

}