package work.vuong.instantbundles

import android.app.Application
import android.util.Log

class NosApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("VUONGIE", "Hoi")
    }

    fun getCastHelper(): CastHelper? {
        return try {
            Class.forName("work.vuong.installable.CastHelperImpl").newInstance() as? CastHelper
        } catch (e: Exception) {
            null
        }
    }
}