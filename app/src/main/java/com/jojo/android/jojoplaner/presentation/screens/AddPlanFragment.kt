package com.jojo.android.jojoplaner.presentation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jojo.android.jojoplaner.R
import com.jojo.android.jojoplaner.presentation.viewModel.PlanViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddPlanFragment : Fragment() {

    val planViewModel: PlanViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_add_plan, container, false)
    }

}
