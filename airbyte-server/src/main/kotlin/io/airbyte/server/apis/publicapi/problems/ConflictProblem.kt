/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.server.apis.publicapi.problems

import io.airbyte.commons.server.errors.problems.AbstractThrowableProblem
import io.airbyte.server.apis.publicapi.constants.API_DOC_URL
import io.micronaut.http.HttpStatus
import java.io.Serial
import java.net.URI

/**
 * Thrown when a user attempts to start a sync run while one is already running.
 */
class ConflictProblem(message: String?) : AbstractThrowableProblem(
  TYPE,
  TITLE,
  HttpStatus.CONFLICT,
  message,
) {
  companion object {
    @Serial
    private val serialVersionUID = 1L
    private val TYPE = URI.create("$API_DOC_URL/reference/errors#409-state-conflict")
    private const val TITLE = "state-conflict"
  }
}
