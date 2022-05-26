package com.example.wondersofometepe.data

data class Transport (val foto: String,
                      val fotoUri: Int,
                      val schedule: String,
                      val route: String,
                      val maxPassenger: Int,
                      val rangePrice: RangPrice,
                      val description: String,
                      val driver: Driver?, //para los taxi y caponeras
                      val licese: String?
)