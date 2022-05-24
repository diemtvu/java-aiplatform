// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/endpoint.proto

package com.google.cloud.aiplatform.v1;

public final class EndpointProto {
  private EndpointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/aiplatform/v1/endpoint.pr" +
      "oto\022\032google.cloud.aiplatform.v1\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\0320google/cloud/aiplatform/v1/" +
      "encryption_spec.proto\032,google/cloud/aipl" +
      "atform/v1/explanation.proto\032#google/clou" +
      "d/aiplatform/v1/io.proto\0322google/cloud/a" +
      "iplatform/v1/machine_resources.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"\356\007\n\010Endpoi" +
      "nt\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 " +
      "\001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022G\n\017deploye" +
      "d_models\030\004 \003(\0132).google.cloud.aiplatform" +
      ".v1.DeployedModelB\003\340A\003\022M\n\rtraffic_split\030" +
      "\005 \003(\01326.google.cloud.aiplatform.v1.Endpo" +
      "int.TrafficSplitEntry\022\014\n\004etag\030\006 \001(\t\022@\n\006l" +
      "abels\030\007 \003(\01320.google.cloud.aiplatform.v1" +
      ".Endpoint.LabelsEntry\0224\n\013create_time\030\010 \001" +
      "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u" +
      "pdate_time\030\t \001(\0132\032.google.protobuf.Times" +
      "tampB\003\340A\003\022C\n\017encryption_spec\030\n \001(\0132*.goo" +
      "gle.cloud.aiplatform.v1.EncryptionSpec\0224" +
      "\n\007network\030\r \001(\tB#\372A \n\036compute.googleapis" +
      ".com/Network\022*\n\036enable_private_service_c" +
      "onnect\030\021 \001(\010B\002\030\001\022g\n\037model_deployment_mon" +
      "itoring_job\030\016 \001(\tB>\340A\003\372A8\n6aiplatform.go" +
      "ogleapis.com/ModelDeploymentMonitoringJo" +
      "b\022p\n\'predict_request_response_logging_co" +
      "nfig\030\022 \001(\0132?.google.cloud.aiplatform.v1." +
      "PredictRequestResponseLoggingConfig\0323\n\021T" +
      "rafficSplitEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002" +
      " \001(\005:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001:e\352Ab\n\"aiplatform.googlea" +
      "pis.com/Endpoint\022<projects/{project}/loc" +
      "ations/{location}/endpoints/{endpoint}\"\312" +
      "\004\n\rDeployedModel\022M\n\023dedicated_resources\030" +
      "\007 \001(\0132..google.cloud.aiplatform.v1.Dedic" +
      "atedResourcesH\000\022M\n\023automatic_resources\030\010" +
      " \001(\0132..google.cloud.aiplatform.v1.Automa" +
      "ticResourcesH\000\022\017\n\002id\030\001 \001(\tB\003\340A\005\0226\n\005model" +
      "\030\002 \001(\tB\'\340A\002\372A!\n\037aiplatform.googleapis.co" +
      "m/Model\022\024\n\014display_name\030\003 \001(\t\0224\n\013create_" +
      "time\030\006 \001(\0132\032.google.protobuf.TimestampB\003" +
      "\340A\003\022E\n\020explanation_spec\030\t \001(\0132+.google.c" +
      "loud.aiplatform.v1.ExplanationSpec\022\027\n\017se" +
      "rvice_account\030\013 \001(\t\022!\n\031disable_container" +
      "_logging\030\017 \001(\010\022\035\n\025enable_access_logging\030" +
      "\r \001(\010\022L\n\021private_endpoints\030\016 \001(\0132,.googl" +
      "e.cloud.aiplatform.v1.PrivateEndpointsB\003" +
      "\340A\003B\026\n\024prediction_resources\"\217\001\n\020PrivateE" +
      "ndpoints\022\035\n\020predict_http_uri\030\001 \001(\tB\003\340A\003\022" +
      "\035\n\020explain_http_uri\030\002 \001(\tB\003\340A\003\022\034\n\017health" +
      "_http_uri\030\003 \001(\tB\003\340A\003\022\037\n\022service_attachme" +
      "nt\030\004 \001(\tB\003\340A\003\"\234\001\n#PredictRequestResponse" +
      "LoggingConfig\022\017\n\007enabled\030\001 \001(\010\022\025\n\rsampli" +
      "ng_rate\030\002 \001(\001\022M\n\024bigquery_destination\030\003 " +
      "\001(\0132/.google.cloud.aiplatform.v1.BigQuer" +
      "yDestinationB\321\001\n\036com.google.cloud.aiplat" +
      "form.v1B\rEndpointProtoP\001ZDgoogle.golang." +
      "org/genproto/googleapis/cloud/aiplatform" +
      "/v1;aiplatform\252\002\032Google.Cloud.AIPlatform" +
      ".V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Googl" +
      "e::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "DeployedModels", "TrafficSplit", "Etag", "Labels", "CreateTime", "UpdateTime", "EncryptionSpec", "Network", "EnablePrivateServiceConnect", "ModelDeploymentMonitoringJob", "PredictRequestResponseLoggingConfig", });
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor,
        new java.lang.String[] { "DedicatedResources", "AutomaticResources", "Id", "Model", "DisplayName", "CreateTime", "ExplanationSpec", "ServiceAccount", "DisableContainerLogging", "EnableAccessLogging", "PrivateEndpoints", "PredictionResources", });
    internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor,
        new java.lang.String[] { "PredictHttpUri", "ExplainHttpUri", "HealthHttpUri", "ServiceAttachment", });
    internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor,
        new java.lang.String[] { "Enabled", "SamplingRate", "BigqueryDestination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
