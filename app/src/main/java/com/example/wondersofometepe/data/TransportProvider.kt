package com.example.wondersofometepe.data

import com.example.wondersofometepe.R

class TransportProvider  {

    companion object {
        val buses = listOf<Transport>(
            Transport("",
                R.drawable.img_bus_ometepe,
                "11:20 am de Moyogalpa para Altagracia",
                "Moyogalapa - Altagracia",
                60,
                RangPrice( 10, 25),
                "Un bus comodo",
                null,
                "RI 501"
                ),
            Transport("",
                R.drawable.img_bus_ometepe,
                "11:20 am de Moyogalpa para Altagracia",
                "Moyogalapa - Altagracia",
                60,
                RangPrice( 10, 25),
                "Un bus comodo",
                null,
                "RI 501"
            ),
            Transport("",
                R.drawable.img_bus_ometepe,
                "11:20 am de Moyogalpa para Altagracia",
                "Moyogalapa - Altagracia",
                60,
                RangPrice( 10, 25),
                "Un bus comodo",
                null,
                "RI 501"
            ),
            Transport("",
                R.drawable.img_bus_ometepe,
                "11:20 am de Moyogalpa para Altagracia",
                "Moyogalapa - Altagracia",
                60,
                RangPrice( 10, 25),
                "Un bus comodo",
                null,
                "RI 501"
            ),
            Transport("",
                R.drawable.img_bus_ometepe,
                "11:20 am de Moyogalpa para Altagracia",
                "Moyogalapa - Altagracia",
                60,
                RangPrice( 10, 25),
                "Un bus comodo",
                null,
                "RI 501"
            ),

        )

        val taxis = listOf<Transport>(
            Transport("",
                R.drawable.img_bus_ometepe,
                "8am a 7pm toda la semana",
                "Todo el municipio de Moyogalpa",
                5,
                RangPrice(50, 250),
                "Taxi de alta disponibilidad y rapides",
                Driver("Kevin", "828282xx", "", R.drawable.icon_account_circle),
                "RI8272"
            ),
            Transport("",
                R.drawable.img_bus_ometepe,
                "8am a 7pm toda la semana",
                "Todo el municipio de Moyogalpa",
                5,
                RangPrice(50, 250),
                "Taxi de alta disponibilidad y rapides",
                Driver("Kevin", "828282xx", "", R.drawable.icon_account_circle),
                "RI8272"
            ),
            Transport("",
                R.drawable.img_bus_ometepe,
                "8am a 7pm toda la semana",
                "Todo el municipio de Moyogalpa",
                5,
                RangPrice(50, 250),
                "Taxi de alta disponibilidad y rapides",
                Driver("Kevin", "828282xx", "", R.drawable.icon_account_circle),
                "RI8272"
            ),
            Transport("",
                R.drawable.img_bus_ometepe,
                "8am a 7pm toda la semana",
                "Todo el municipio de Moyogalpa",
                5,
                RangPrice(50, 250),
                "Taxi de alta disponibilidad y rapides",
                Driver("Kevin", "828282xx", "", R.drawable.icon_account_circle),
                "RI8272"
            )
        )

        val ferrys = listOf<Transport>(
            Transport("",
                R.drawable.ferry,
                "San Jorge 7am a Moyogalapa \n"
                + "Moyogalpa 11:00 a San Jorge",
                "Moyogalpa - San Jorge, Rivas",
                200,
                RangPrice(50, null),
                "Empresa Ferry Ché Guevara les brinda comodidad y seguridad.",
                null,
                null
                )
        )
    }
}