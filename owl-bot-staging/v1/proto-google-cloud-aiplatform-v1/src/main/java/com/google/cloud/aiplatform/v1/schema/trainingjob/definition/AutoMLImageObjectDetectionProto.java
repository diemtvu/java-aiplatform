// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_image_object_detection.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLImageObjectDetectionProto {
  private AutoMLImageObjectDetectionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\\google/cloud/aiplatform/v1/schema/trai" +
      "ningjob/definition/automl_image_object_d" +
      "etection.proto\0228google.cloud.aiplatform." +
      "v1.schema.trainingjob.definition\032\034google" +
      "/api/annotations.proto\"\370\001\n\032AutoMlImageOb" +
      "jectDetection\022j\n\006inputs\030\001 \001(\0132Z.google.c" +
      "loud.aiplatform.v1.schema.trainingjob.de" +
      "finition.AutoMlImageObjectDetectionInput" +
      "s\022n\n\010metadata\030\002 \001(\0132\\.google.cloud.aipla" +
      "tform.v1.schema.trainingjob.definition.A" +
      "utoMlImageObjectDetectionMetadata\"\222\003\n Au" +
      "toMlImageObjectDetectionInputs\022x\n\nmodel_" +
      "type\030\001 \001(\0162d.google.cloud.aiplatform.v1." +
      "schema.trainingjob.definition.AutoMlImag" +
      "eObjectDetectionInputs.ModelType\022\037\n\027budg" +
      "et_milli_node_hours\030\002 \001(\003\022\036\n\026disable_ear" +
      "ly_stopping\030\003 \001(\010\"\262\001\n\tModelType\022\032\n\026MODEL" +
      "_TYPE_UNSPECIFIED\020\000\022\031\n\025CLOUD_HIGH_ACCURA" +
      "CY_1\020\001\022\027\n\023CLOUD_LOW_LATENCY_1\020\002\022\033\n\027MOBIL" +
      "E_TF_LOW_LATENCY_1\020\003\022\031\n\025MOBILE_TF_VERSAT" +
      "ILE_1\020\004\022\035\n\031MOBILE_TF_HIGH_ACCURACY_1\020\005\"\300" +
      "\002\n\"AutoMlImageObjectDetectionMetadata\022\035\n" +
      "\025cost_milli_node_hours\030\001 \001(\003\022\221\001\n\026success" +
      "ful_stop_reason\030\002 \001(\0162q.google.cloud.aip" +
      "latform.v1.schema.trainingjob.definition" +
      ".AutoMlImageObjectDetectionMetadata.Succ" +
      "essfulStopReason\"g\n\024SuccessfulStopReason" +
      "\022&\n\"SUCCESSFUL_STOP_REASON_UNSPECIFIED\020\000" +
      "\022\022\n\016BUDGET_REACHED\020\001\022\023\n\017MODEL_CONVERGED\020" +
      "\002B\305\001\n<com.google.cloud.aiplatform.v1.sch" +
      "ema.trainingjob.definitionB\037AutoMLImageO" +
      "bjectDetectionProtoP\001Zbgoogle.golang.org" +
      "/genproto/googleapis/cloud/aiplatform/v1" +
      "/schema/trainingjob/definition;definitio" +
      "nb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor,
        new java.lang.String[] { "Inputs", "Metadata", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor,
        new java.lang.String[] { "ModelType", "BudgetMilliNodeHours", "DisableEarlyStopping", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor,
        new java.lang.String[] { "CostMilliNodeHours", "SuccessfulStopReason", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
