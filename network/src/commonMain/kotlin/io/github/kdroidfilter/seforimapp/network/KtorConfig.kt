package io.github.kdroidfilter.seforimapp.network

import io.ktor.client.*
import kotlinx.serialization.json.Json

/**
 * Provides a configured Ktor HttpClient.
 * Platform-specific implementations handle engine and SSL configuration.
 */
expect object KtorConfig {
    /**
     * Creates a Ktor HttpClient configured for the current platform.
     *
     * @param json Custom JSON configuration (default: ignoreUnknownKeys + isLenient)
     * @return Configured HttpClient instance
     */
    fun createHttpClient(
        json: Json,
    ): HttpClient
}
