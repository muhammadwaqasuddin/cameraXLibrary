package com.example.cameraxlibrary

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import kotlin.text.Typography.dagger

@AndroidEntryPoint
class CameraActivity : ComponentActivity(), CameraHost {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            VirtualBackgroundApp(this)
        }
    }

    override fun finishWithResult(uri: Uri) {
        setResult(RESULT_OK, Intent().apply { data = uri })
        finish()
    }

    override fun finishWithCancel(reason: String) {
        setResult(
            Activity.RESULT_CANCELED,
            Intent().putExtra("reason", reason)
        )
        finish()
    }
}
