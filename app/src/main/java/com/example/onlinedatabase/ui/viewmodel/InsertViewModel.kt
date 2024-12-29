package com.example.onlinedatabase.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.onlinedatabase.Repository.MahasiswaRepository


class InsertViewModel(private val mhs: MahasiswaRepository) : ViewModel() {
}


data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent()
)


data class InsertUiEvent(
    val nim: String = "",
    val nama: String = "",
    val alamat: String = "",
    val jenisKelamin: String = "",
    val kelas: String = "",
    val angkatan: String = "",
)
