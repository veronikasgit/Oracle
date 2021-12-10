package com.company.oracle

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

private const val LAST_PREDICTION_TEXT = "text"

class OracleFragment : Fragment() {

    lateinit var oracleImageView: ImageView
    lateinit var oracleButton: Button
    lateinit var horoscope2022Intent: Button

    private val predictionsList: List<Int> = listOf(
        R.drawable.prediction1,
        R.drawable.prediction2,
        R.drawable.prediction3,
        R.drawable.prediction4,
        R.drawable.prediction5,
        R.drawable.prediction6,
        R.drawable.prediction7
    )

    var lastPredictionRes = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_oracle, container, false)

        oracleImageView = view.findViewById(R.id.oracle_image_view)
        oracleButton = view.findViewById(R.id.oracle_button)
        horoscope2022Intent = view.findViewById(R.id.horoscope_2022_intent)

        if (savedInstanceState != null)
            oracleImageView.setImageResource(savedInstanceState.getInt(LAST_PREDICTION_TEXT))

        oracleButton.setOnClickListener {
            lastPredictionRes = predictionsList.random()
            oracleImageView.setImageResource(lastPredictionRes)
        }

        horoscope2022Intent.setOnClickListener {
            val link = Uri.parse("https://2022newyear.ru/goroskop-2022")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }
}

