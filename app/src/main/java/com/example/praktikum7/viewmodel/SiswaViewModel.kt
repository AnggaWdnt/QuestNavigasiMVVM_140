package com.example.praktikum7.viewmodel

import DataSiswa
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update



class SiswaViewModel : ViewModel() {

    // Request
    private val _statusUI = MutableStateFlow(DataSiswa())

    // Response
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun setDataSiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2],
                email = ls[3],
                notelepon = ls[4],
                nim = ls[5]
            )
        }
    }
}