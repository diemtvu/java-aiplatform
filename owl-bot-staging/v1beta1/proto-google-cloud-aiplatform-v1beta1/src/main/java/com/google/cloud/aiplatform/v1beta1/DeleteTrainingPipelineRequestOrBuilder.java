// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DeleteTrainingPipelineRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeleteTrainingPipelineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the TrainingPipeline resource to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/trainingPipelines/{training_pipeline}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the TrainingPipeline resource to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/trainingPipelines/{training_pipeline}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
