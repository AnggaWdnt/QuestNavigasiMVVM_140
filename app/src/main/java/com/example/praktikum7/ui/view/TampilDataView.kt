package com.example.praktikum7.ui.view

import DataSiswa
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TampilDataView(uiState: DataSiswa, onBackButton: () -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TampilData(param = "Nama", argu = uiState.nama)
        TampilData(param = "Jenis Kelamin", argu = uiState.gender)
        TampilData(param = "Alamat", argu = uiState.alamat)

        Button(onClick = onBackButton) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun TampilData(
    param : String, argu : String
){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.8f))
            Text(text = ": ",
                modifier = Modifier.weight(0.2f))
            Text(text = argu,
                modifier = Modifier.weight(2f))
        }
    }
}
