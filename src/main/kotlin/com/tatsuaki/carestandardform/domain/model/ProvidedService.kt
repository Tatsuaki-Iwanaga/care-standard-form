package com.tatsuaki.carestandardform.domain.model

import java.time.LocalTime

data class ProvidedService(var from: LocalTime, var to: LocalTime, var careService: CareService, var office: Office, var provideDaysPlan: Set<Int>, var provideDaysResult: Set<Int>) {

    fun getPlanDay(day: Int?) : String {
        return if(day == null) "" else if(provideDaysPlan.contains(day.toInt())) "1" else ""
    }

    fun getResultDay(day: Int?) : String {
        return if(day == null) "" else  if(provideDaysResult.contains(day.toInt())) "1" else ""
    }
}
