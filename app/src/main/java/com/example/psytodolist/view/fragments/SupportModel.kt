package com.example.psytodolist.view.fragments

import android.animation.ObjectAnimator
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import com.example.psytodolist.R
import com.example.psytodolist.viewmodel.NoteViewModel
import kotlinx.android.synthetic.main.fragment_add_notes.*
import kotlinx.android.synthetic.main.fragment_support_model.*


class SupportModel : BaseFragment() {
    private var noteViewModel: NoteViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_support_model, container, false)

        return mView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        animation()

        clickBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val dialog = AlertDialog.Builder(requireContext())

                dialog.setTitle("Метод Лестница")
                    .setMessage("Этот метод позволяет улучшить производительность, и улучшить жизнь. Вы точно хотите перейти по сыллке?")
                    .setPositiveButton("Да") { dialog, whichButton ->
                        // DO YOUR STAFF
                    }
                    .setNegativeButton("Нет") { dialog, whichButton ->
                        // DO YOUR STAFF
                        // dialog.close()
                    }

                dialog.show()
            }
        })
    }


    private fun animation() {
        val animation = ObjectAnimator.ofInt(
            onboarding_activity_progress_bar2,
            "progress",
            0,
            48
        ) // see this max value coming back here, we animate towards that value
        animation.duration = 5000 // in milliseconds
        animation.interpolator = DecelerateInterpolator()
        animation.start()
    }


}
