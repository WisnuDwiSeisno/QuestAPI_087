package com.example.onlinedatabase

import android.app.Application
import com.example.onlinedatabase.Repository.AppContainer
import com.example.onlinedatabase.Repository.MahasiswaContainer


class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container= MahasiswaContainer()
    }
}