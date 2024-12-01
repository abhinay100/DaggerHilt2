package com.example.daggerhilt

import androidx.lifecycle.ViewModel
import com.example.daggerhilt.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository:  Lazy<MyRepository>
): ViewModel() {

    init {
        repository.get()
    }
}