package com.rob.recycleview

import android.content.Context

class Datasource(val context: Context) {
    fun getCarList(): Array<String> {
        return context.resources.getStringArray(R.array.car_array)
    }
}