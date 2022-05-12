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
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

public interface UpdateArtifactRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.UpdateArtifactRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Artifact containing updates.
   * The Artifact's [Artifact.name][google.cloud.aiplatform.v1.Artifact.name] field is used to identify the Artifact to
   * be updated.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the artifact field is set.
   */
  boolean hasArtifact();
  /**
   *
   *
   * <pre>
   * Required. The Artifact containing updates.
   * The Artifact's [Artifact.name][google.cloud.aiplatform.v1.Artifact.name] field is used to identify the Artifact to
   * be updated.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The artifact.
   */
  com.google.cloud.aiplatform.v1.Artifact getArtifact();
  /**
   *
   *
   * <pre>
   * Required. The Artifact containing updates.
   * The Artifact's [Artifact.name][google.cloud.aiplatform.v1.Artifact.name] field is used to identify the Artifact to
   * be updated.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ArtifactOrBuilder getArtifactOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * Functionality of this field is not yet supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * Functionality of this field is not yet supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * Functionality of this field is not yet supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the [Artifact][google.cloud.aiplatform.v1.Artifact] is not found, a new [Artifact][google.cloud.aiplatform.v1.Artifact] is
   * created.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
