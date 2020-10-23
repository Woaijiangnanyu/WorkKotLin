package com.study.gjl.workkotlin.policy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.study.gjl.workkotlin.R

class PolicyRectifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_policy_rectify)
        val linkTv = findViewById<TextView>(R.id.link_policy)
        linkTv.movementMethod = LinkMovementMethod.getInstance();
    }
}