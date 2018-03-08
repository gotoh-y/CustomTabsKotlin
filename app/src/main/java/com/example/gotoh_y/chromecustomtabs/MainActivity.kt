package com.example.gotoh_y.chromecustomtabs

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.customtabs.CustomTabsIntent
import org.chromium.customtabsclient.shared.CustomTabsHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val packageName = CustomTabsHelper.getPackageNameToUse(this)
        var url = "https://www.besta.fin-lab.net/"
        var customTabsIntent : CustomTabsIntent = CustomTabsIntent.Builder()
                .setShowTitle(true).build()
        customTabsIntent.intent.`package` = packageName
        customTabsIntent.launchUrl(this, Uri.parse(url))

    }
}
