package com.josevicentesanchez.sprint3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.josevicentesanchez.sprint3.databinding.ViewFighterBinding

class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = ViewFighterBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )
}