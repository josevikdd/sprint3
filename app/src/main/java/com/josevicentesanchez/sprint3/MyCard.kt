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

    var name: String
        get() = binding.name.text.toString()
        set(value) {
            binding.name.text = value
        }

    var surname: String
        get() = binding.surname.text.toString()
        set(value) {
            binding.surname.text = value
        }

    var textVote: String
        get() = binding.vote.text.toString()
        set(value) {
            binding.vote.text = value
        }

    fun setOnAccionClickListener(listener: () -> Unit) {

        binding.vote.setOnClickListener {
            listener()
        }
    }

    fun setProfileImage(profileImg: Int) {
        binding.profile.setImageResource(profileImg)
    }

    fun setBodyImage(bodyImg: Int) {
        binding.picture.setImageResource(bodyImg)
    }
}