package com.mparticle.internal

import com.mparticle.audience.BaseAudienceTask
import com.mparticle.internal.MParticleApiClient.AliasNetworkResponse
import com.mparticle.internal.MParticleApiClientImpl.MPConfigException
import com.mparticle.internal.MParticleApiClientImpl.MPRampException
import com.mparticle.internal.MParticleApiClientImpl.MPThrottleException
import com.mparticle.internal.database.UploadSettings
import com.mparticle.networking.BaseNetworkConnection
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

open class EmptyApiClient : MParticleApiClient {
    @Throws(IOException::class, MPConfigException::class)
    override fun fetchConfig() {
    }

    @Throws(IOException::class, MPConfigException::class)
    override fun fetchConfig(force: Boolean) {
    }

    @Throws(IOException::class, MParticleApiClientImpl.MPThrottleException::class, MParticleApiClientImpl.MPRampException::class)
    override fun sendMessageBatch(message: String, uploadSettings: UploadSettings): Int {
        return 0
    }

    override fun fetchUserAudience(Task: BaseAudienceTask?, mpId: Long) {
    }

    override fun getCookies(): JSONObject? {
        return null
    }

    @Throws(
        JSONException::class,
        IOException::class,
        MPThrottleException::class,
        MPRampException::class
    )

    override fun sendAliasRequest(request: String, uploadSettings: UploadSettings): AliasNetworkResponse {
        return AliasNetworkResponse(0)
    }

    override fun getRequestHandler(): BaseNetworkConnection? {
        return null
    }

    override fun setRequestHandler(handler: BaseNetworkConnection) {}
}