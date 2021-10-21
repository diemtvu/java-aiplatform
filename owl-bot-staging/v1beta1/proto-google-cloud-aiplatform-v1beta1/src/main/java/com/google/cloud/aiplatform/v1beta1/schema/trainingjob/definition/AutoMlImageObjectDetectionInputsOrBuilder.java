// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_object_detection.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface AutoMlImageObjectDetectionInputsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();
  /**
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType model_type = 1;</code>
   * @return The modelType.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionInputs.ModelType getModelType();

  /**
   * <pre>
   * The training budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour. The actual
   * metadata.costMilliNodeHours will be equal or less than this value.
   * If further model training ceases to provide any improvements, it will
   * stop without using the full budget and the metadata.successfulStopReason
   * will be `model-converged`.
   * Note, node_hour  = actual_hour * number_of_nodes_involved.
   * For modelType `cloud`(default), the budget must be between 20,000
   * and 900,000 milli node hours, inclusive. The default value is 216,000
   * which represents one day in wall time, considering 9 nodes are used.
   * For model types `mobile-tf-low-latency-1`, `mobile-tf-versatile-1`,
   * `mobile-tf-high-accuracy-1`
   * the training budget must be between 1,000 and 100,000 milli node hours,
   * inclusive. The default value is 24,000 which represents one day in
   * wall time on a single node that is used.
   * </pre>
   *
   * <code>int64 budget_milli_node_hours = 2;</code>
   * @return The budgetMilliNodeHours.
   */
  long getBudgetMilliNodeHours();

  /**
   * <pre>
   * Use the entire training budget. This disables the early stopping feature.
   * When false the early stopping feature is enabled, which means that AutoML
   * Image Object Detection might stop training before the entire training
   * budget has been used.
   * </pre>
   *
   * <code>bool disable_early_stopping = 3;</code>
   * @return The disableEarlyStopping.
   */
  boolean getDisableEarlyStopping();
}
