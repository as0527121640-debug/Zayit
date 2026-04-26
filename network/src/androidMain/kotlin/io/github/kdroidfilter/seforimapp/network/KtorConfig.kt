package io.github.kdroidfilter.seforimapp.network

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

/**
 * Android implementation: uses OkHttp engine with standard Android SSL.
 */
actual object KtorConfig {
    actual fun createHttpClient(
        json: Json,
    ): HttpClient =
        HttpClient(OkHttp) {
            install(ContentNegotiation) {
                json(json)
            }
        }
}
