// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_segmentation.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface AutoMlImageSegmentationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The actual training cost of creating this model, expressed in
   * milli node hours, i.e. 1,000 value in this field means 1 node hour.
   * Guaranteed to not exceed inputs.budgetMilliNodeHours.
   * </pre>
   *
   * <code>int64 cost_milli_node_hours = 1;</code>
   * @return The costMilliNodeHours.
   */
  long getCostMilliNodeHours();

  /**
   * <pre>
   * For successful job completions, this is the reason why the job has
   * finished.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
   * @return The enum numeric value on the wire for successfulStopReason.
   */
  int getSuccessfulStopReasonValue();
  /**
   * <pre>
   * For successful job completions, this is the reason why the job has
   * finished.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
   * @return The successfulStopReason.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageSegmentationMetadata.SuccessfulStopReason getSuccessfulStopReason();
}
