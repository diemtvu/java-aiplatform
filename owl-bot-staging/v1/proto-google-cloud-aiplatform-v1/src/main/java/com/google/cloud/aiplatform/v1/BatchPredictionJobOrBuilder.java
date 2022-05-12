// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/batch_prediction_job.proto

package com.google.cloud.aiplatform.v1;

public interface BatchPredictionJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchPredictionJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the BatchPredictionJob.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the BatchPredictionJob.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The user-defined name of this BatchPredictionJob.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The user-defined name of this BatchPredictionJob.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The name of the Model resoure that produces the predictions via this job,
   * must share the same ancestor Location.
   * Starting this job has no impact on any existing deployments of the Model
   * and their resources.
   * Exactly one of model and unmanaged_container_model must be set.
   * </pre>
   *
   * <code>string model = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * The name of the Model resoure that produces the predictions via this job,
   * must share the same ancestor Location.
   * Starting this job has no impact on any existing deployments of the Model
   * and their resources.
   * Exactly one of model and unmanaged_container_model must be set.
   * </pre>
   *
   * <code>string model = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Contains model information necessary to perform batch prediction without
   * requiring uploading to model registry.
   * Exactly one of model and unmanaged_container_model must be set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.UnmanagedContainerModel unmanaged_container_model = 28;</code>
   * @return Whether the unmanagedContainerModel field is set.
   */
  boolean hasUnmanagedContainerModel();
  /**
   * <pre>
   * Contains model information necessary to perform batch prediction without
   * requiring uploading to model registry.
   * Exactly one of model and unmanaged_container_model must be set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.UnmanagedContainerModel unmanaged_container_model = 28;</code>
   * @return The unmanagedContainerModel.
   */
  com.google.cloud.aiplatform.v1.UnmanagedContainerModel getUnmanagedContainerModel();
  /**
   * <pre>
   * Contains model information necessary to perform batch prediction without
   * requiring uploading to model registry.
   * Exactly one of model and unmanaged_container_model must be set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.UnmanagedContainerModel unmanaged_container_model = 28;</code>
   */
  com.google.cloud.aiplatform.v1.UnmanagedContainerModelOrBuilder getUnmanagedContainerModelOrBuilder();

  /**
   * <pre>
   * Required. Input configuration of the instances on which predictions are performed.
   * The schema of any single instance may be specified via
   * the [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.InputConfig input_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Required. Input configuration of the instances on which predictions are performed.
   * The schema of any single instance may be specified via
   * the [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.InputConfig input_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputConfig.
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob.InputConfig getInputConfig();
  /**
   * <pre>
   * Required. Input configuration of the instances on which predictions are performed.
   * The schema of any single instance may be specified via
   * the [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.InputConfig input_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   * <pre>
   * The parameters that govern the predictions. The schema of the parameters
   * may be specified via the [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [parameters_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.parameters_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value model_parameters = 5;</code>
   * @return Whether the modelParameters field is set.
   */
  boolean hasModelParameters();
  /**
   * <pre>
   * The parameters that govern the predictions. The schema of the parameters
   * may be specified via the [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [parameters_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.parameters_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value model_parameters = 5;</code>
   * @return The modelParameters.
   */
  com.google.protobuf.Value getModelParameters();
  /**
   * <pre>
   * The parameters that govern the predictions. The schema of the parameters
   * may be specified via the [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [parameters_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.parameters_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value model_parameters = 5;</code>
   */
  com.google.protobuf.ValueOrBuilder getModelParametersOrBuilder();

  /**
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * The schema of any single prediction may be specified as a concatenation
   * of [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * and
   * [prediction_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.OutputConfig output_config = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * The schema of any single prediction may be specified as a concatenation
   * of [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * and
   * [prediction_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.OutputConfig output_config = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputConfig.
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob.OutputConfig getOutputConfig();
  /**
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * The schema of any single prediction may be specified as a concatenation
   * of [Model's][google.cloud.aiplatform.v1.BatchPredictionJob.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1.Model.predict_schemata]
   * [instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * and
   * [prediction_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.OutputConfig output_config = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * The config of resources used by the Model during the batch prediction. If
   * the Model [supports][google.cloud.aiplatform.v1.Model.supported_deployment_resources_types]
   * DEDICATED_RESOURCES this config may be provided (and the job will use these
   * resources), if the Model doesn't support AUTOMATIC_RESOURCES, this config
   * must be provided.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchDedicatedResources dedicated_resources = 7;</code>
   * @return Whether the dedicatedResources field is set.
   */
  boolean hasDedicatedResources();
  /**
   * <pre>
   * The config of resources used by the Model during the batch prediction. If
   * the Model [supports][google.cloud.aiplatform.v1.Model.supported_deployment_resources_types]
   * DEDICATED_RESOURCES this config may be provided (and the job will use these
   * resources), if the Model doesn't support AUTOMATIC_RESOURCES, this config
   * must be provided.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchDedicatedResources dedicated_resources = 7;</code>
   * @return The dedicatedResources.
   */
  com.google.cloud.aiplatform.v1.BatchDedicatedResources getDedicatedResources();
  /**
   * <pre>
   * The config of resources used by the Model during the batch prediction. If
   * the Model [supports][google.cloud.aiplatform.v1.Model.supported_deployment_resources_types]
   * DEDICATED_RESOURCES this config may be provided (and the job will use these
   * resources), if the Model doesn't support AUTOMATIC_RESOURCES, this config
   * must be provided.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchDedicatedResources dedicated_resources = 7;</code>
   */
  com.google.cloud.aiplatform.v1.BatchDedicatedResourcesOrBuilder getDedicatedResourcesOrBuilder();

  /**
   * <pre>
   * Immutable. Parameters configuring the batch behavior. Currently only applicable when
   * [dedicated_resources][google.cloud.aiplatform.v1.BatchPredictionJob.dedicated_resources] are used (in other cases Vertex AI does
   * the tuning itself).
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ManualBatchTuningParameters manual_batch_tuning_parameters = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the manualBatchTuningParameters field is set.
   */
  boolean hasManualBatchTuningParameters();
  /**
   * <pre>
   * Immutable. Parameters configuring the batch behavior. Currently only applicable when
   * [dedicated_resources][google.cloud.aiplatform.v1.BatchPredictionJob.dedicated_resources] are used (in other cases Vertex AI does
   * the tuning itself).
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ManualBatchTuningParameters manual_batch_tuning_parameters = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The manualBatchTuningParameters.
   */
  com.google.cloud.aiplatform.v1.ManualBatchTuningParameters getManualBatchTuningParameters();
  /**
   * <pre>
   * Immutable. Parameters configuring the batch behavior. Currently only applicable when
   * [dedicated_resources][google.cloud.aiplatform.v1.BatchPredictionJob.dedicated_resources] are used (in other cases Vertex AI does
   * the tuning itself).
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ManualBatchTuningParameters manual_batch_tuning_parameters = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.aiplatform.v1.ManualBatchTuningParametersOrBuilder getManualBatchTuningParametersOrBuilder();

  /**
   * <pre>
   * Generate explanation with the batch prediction results.
   * When set to `true`, the batch prediction output changes based on the
   * `predictions_format` field of the
   * [BatchPredictionJob.output_config][google.cloud.aiplatform.v1.BatchPredictionJob.output_config] object:
   *  * `bigquery`: output includes a column named `explanation`. The value
   *    is a struct that conforms to the [Explanation][google.cloud.aiplatform.v1.Explanation] object.
   *  * `jsonl`: The JSON objects on each line include an additional entry
   *    keyed `explanation`. The value of the entry is a JSON object that
   *    conforms to the [Explanation][google.cloud.aiplatform.v1.Explanation] object.
   *  * `csv`: Generating explanations for CSV format is not supported.
   * If this field is set to true, either the [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] or
   * [explanation_spec][google.cloud.aiplatform.v1.BatchPredictionJob.explanation_spec] must be populated.
   * </pre>
   *
   * <code>bool generate_explanation = 23;</code>
   * @return The generateExplanation.
   */
  boolean getGenerateExplanation();

  /**
   * <pre>
   * Explanation configuration for this BatchPredictionJob. Can be
   * specified only if [generate_explanation][google.cloud.aiplatform.v1.BatchPredictionJob.generate_explanation] is set to `true`.
   * This value overrides the value of [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec]. All fields of
   * [explanation_spec][google.cloud.aiplatform.v1.BatchPredictionJob.explanation_spec] are optional in the request. If a field of the
   * [explanation_spec][google.cloud.aiplatform.v1.BatchPredictionJob.explanation_spec] object is not populated, the corresponding field of
   * the [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] object is inherited.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationSpec explanation_spec = 25;</code>
   * @return Whether the explanationSpec field is set.
   */
  boolean hasExplanationSpec();
  /**
   * <pre>
   * Explanation configuration for this BatchPredictionJob. Can be
   * specified only if [generate_explanation][google.cloud.aiplatform.v1.BatchPredictionJob.generate_explanation] is set to `true`.
   * This value overrides the value of [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec]. All fields of
   * [explanation_spec][google.cloud.aiplatform.v1.BatchPredictionJob.explanation_spec] are optional in the request. If a field of the
   * [explanation_spec][google.cloud.aiplatform.v1.BatchPredictionJob.explanation_spec] object is not populated, the corresponding field of
   * the [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] object is inherited.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationSpec explanation_spec = 25;</code>
   * @return The explanationSpec.
   */
  com.google.cloud.aiplatform.v1.ExplanationSpec getExplanationSpec();
  /**
   * <pre>
   * Explanation configuration for this BatchPredictionJob. Can be
   * specified only if [generate_explanation][google.cloud.aiplatform.v1.BatchPredictionJob.generate_explanation] is set to `true`.
   * This value overrides the value of [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec]. All fields of
   * [explanation_spec][google.cloud.aiplatform.v1.BatchPredictionJob.explanation_spec] are optional in the request. If a field of the
   * [explanation_spec][google.cloud.aiplatform.v1.BatchPredictionJob.explanation_spec] object is not populated, the corresponding field of
   * the [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] object is inherited.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationSpec explanation_spec = 25;</code>
   */
  com.google.cloud.aiplatform.v1.ExplanationSpecOrBuilder getExplanationSpecOrBuilder();

  /**
   * <pre>
   * Output only. Information further describing the output of this job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.OutputInfo output_info = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the outputInfo field is set.
   */
  boolean hasOutputInfo();
  /**
   * <pre>
   * Output only. Information further describing the output of this job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.OutputInfo output_info = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The outputInfo.
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob.OutputInfo getOutputInfo();
  /**
   * <pre>
   * Output only. Information further describing the output of this job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BatchPredictionJob.OutputInfo output_info = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob.OutputInfoOrBuilder getOutputInfoOrBuilder();

  /**
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.JobState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.JobState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.JobState getState();

  /**
   * <pre>
   * Output only. Only populated when the job's state is JOB_STATE_FAILED or
   * JOB_STATE_CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Output only. Only populated when the job's state is JOB_STATE_FAILED or
   * JOB_STATE_CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * Output only. Only populated when the job's state is JOB_STATE_FAILED or
   * JOB_STATE_CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * Output only. Partial failures encountered.
   * For example, single files that can't be read.
   * This field never exceeds 20 entries.
   * Status details fields contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.rpc.Status> 
      getPartialFailuresList();
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * For example, single files that can't be read.
   * This field never exceeds 20 entries.
   * Status details fields contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.Status getPartialFailures(int index);
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * For example, single files that can't be read.
   * This field never exceeds 20 entries.
   * Status details fields contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPartialFailuresCount();
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * For example, single files that can't be read.
   * This field never exceeds 20 entries.
   * Status details fields contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getPartialFailuresOrBuilderList();
  /**
   * <pre>
   * Output only. Partial failures encountered.
   * For example, single files that can't be read.
   * This field never exceeds 20 entries.
   * Status details fields contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Information about resources that had been consumed by this job.
   * Provided in real time at best effort basis, as well as a final value
   * once the job completes.
   * Note: This field currently may be not populated for batch predictions that
   * use AutoML Models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ResourcesConsumed resources_consumed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the resourcesConsumed field is set.
   */
  boolean hasResourcesConsumed();
  /**
   * <pre>
   * Output only. Information about resources that had been consumed by this job.
   * Provided in real time at best effort basis, as well as a final value
   * once the job completes.
   * Note: This field currently may be not populated for batch predictions that
   * use AutoML Models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ResourcesConsumed resources_consumed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The resourcesConsumed.
   */
  com.google.cloud.aiplatform.v1.ResourcesConsumed getResourcesConsumed();
  /**
   * <pre>
   * Output only. Information about resources that had been consumed by this job.
   * Provided in real time at best effort basis, as well as a final value
   * once the job completes.
   * Note: This field currently may be not populated for batch predictions that
   * use AutoML Models.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ResourcesConsumed resources_consumed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.ResourcesConsumedOrBuilder getResourcesConsumedOrBuilder();

  /**
   * <pre>
   * Output only. Statistics on completed and failed prediction instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CompletionStats completion_stats = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the completionStats field is set.
   */
  boolean hasCompletionStats();
  /**
   * <pre>
   * Output only. Statistics on completed and failed prediction instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CompletionStats completion_stats = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The completionStats.
   */
  com.google.cloud.aiplatform.v1.CompletionStats getCompletionStats();
  /**
   * <pre>
   * Output only. Statistics on completed and failed prediction instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CompletionStats completion_stats = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.CompletionStatsOrBuilder getCompletionStatsOrBuilder();

  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob for the first time entered the
   * `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob for the first time entered the
   * `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob for the first time entered the
   * `JOB_STATE_RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob entered any of the following states:
   * `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob entered any of the following states:
   * `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob entered any of the following states:
   * `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED`, `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Time when the BatchPredictionJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * The labels with user-defined metadata to organize BatchPredictionJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 19;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The labels with user-defined metadata to organize BatchPredictionJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 19;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The labels with user-defined metadata to organize BatchPredictionJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 19;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The labels with user-defined metadata to organize BatchPredictionJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 19;</code>
   */

  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The labels with user-defined metadata to organize BatchPredictionJobs.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 19;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Customer-managed encryption key options for a BatchPredictionJob. If this
   * is set, then all resources created by the BatchPredictionJob will be
   * encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 24;</code>
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   * <pre>
   * Customer-managed encryption key options for a BatchPredictionJob. If this
   * is set, then all resources created by the BatchPredictionJob will be
   * encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 24;</code>
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();
  /**
   * <pre>
   * Customer-managed encryption key options for a BatchPredictionJob. If this
   * is set, then all resources created by the BatchPredictionJob will be
   * encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 24;</code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();
}
