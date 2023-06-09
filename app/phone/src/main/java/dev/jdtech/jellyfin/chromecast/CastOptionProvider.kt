package dev.jdtech.jellyfin.chromecast

import android.content.Context
import com.google.android.gms.cast.framework.CastOptions
import com.google.android.gms.cast.framework.OptionsProvider
import com.google.android.gms.cast.framework.SessionProvider
import com.google.android.gms.cast.framework.media.CastMediaOptions
import com.google.android.gms.cast.framework.media.NotificationOptions


class CastOptionsProvider : OptionsProvider {

    override fun getCastOptions(context: Context): CastOptions {

        val notificationOptions = NotificationOptions.Builder()
            .setTargetActivityClassName(ExpandedControlsActivity::class.java.name)
            .build()

        val mediaOptions = CastMediaOptions.Builder()
            .setNotificationOptions(notificationOptions)
            .setExpandedControllerActivityClassName(ExpandedControlsActivity::class.java.name)
            .build()

        return CastOptions.Builder()
            .setReceiverApplicationId("49B291C0")
            .setCastMediaOptions(mediaOptions)
            .build()
        //            .setSupportedNamespaces(supportedNamespaces)
    }

    override fun getAdditionalSessionProviders(p0: Context): MutableList<SessionProvider>? {
        return null
    }
}