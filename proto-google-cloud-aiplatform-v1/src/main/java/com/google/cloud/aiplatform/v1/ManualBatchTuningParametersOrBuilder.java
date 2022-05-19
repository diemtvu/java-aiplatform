/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/manual_batch_tuning_parameters.proto

package com.google.cloud.aiplatform.v1;

public interface ManualBatchTuningParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ManualBatchTuningParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The number of the records (e.g. instances) of the operation given in
   * each batch to a machine replica. Machine type, and size of a single
   * record should be considered when setting this parameter, higher value
   * speeds up the batch operation's execution, but too high value will result
   * in a whole batch not fitting in a machine's memory, and the whole
   * operation will fail.
   * The default value is 4.
   * </pre>
   *
   * <code>int32 batch_size = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The batchSize.
   */
  int getBatchSize();
}
