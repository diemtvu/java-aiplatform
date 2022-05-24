// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

package com.google.cloud.aiplatform.v1beta1;

public interface MachineSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.MachineSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The type of the machine.
   * See the [list of machine types supported for
   * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
   * See the [list of machine types supported for custom
   * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
   * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this field is optional, and the default
   * value is `n1-standard-2`. For [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or as part of
   * [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec] this field is required.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   * <pre>
   * Immutable. The type of the machine.
   * See the [list of machine types supported for
   * prediction](https://cloud.google.com/vertex-ai/docs/predictions/configure-compute#machine-types)
   * See the [list of machine types supported for custom
   * training](https://cloud.google.com/vertex-ai/docs/training/configure-compute#machine-types).
   * For [DeployedModel][google.cloud.aiplatform.v1beta1.DeployedModel] this field is optional, and the default
   * value is `n1-standard-2`. For [BatchPredictionJob][google.cloud.aiplatform.v1beta1.BatchPredictionJob] or as part of
   * [WorkerPoolSpec][google.cloud.aiplatform.v1beta1.WorkerPoolSpec] this field is required.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString
      getMachineTypeBytes();

  /**
   * <pre>
   * Immutable. The type of accelerator(s) that may be attached to the machine as per
   * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for acceleratorType.
   */
  int getAcceleratorTypeValue();
  /**
   * <pre>
   * Immutable. The type of accelerator(s) that may be attached to the machine as per
   * [accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.AcceleratorType accelerator_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The acceleratorType.
   */
  com.google.cloud.aiplatform.v1beta1.AcceleratorType getAcceleratorType();

  /**
   * <pre>
   * The number of accelerators to attach to the machine.
   * </pre>
   *
   * <code>int32 accelerator_count = 3;</code>
   * @return The acceleratorCount.
   */
  int getAcceleratorCount();
}
