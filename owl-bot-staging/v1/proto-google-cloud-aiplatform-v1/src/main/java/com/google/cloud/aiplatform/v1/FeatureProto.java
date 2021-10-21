// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/feature.proto

package com.google.cloud.aiplatform.v1;

public final class FeatureProto {
  private FeatureProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/feature.pro" +
      "to\022\032google.cloud.aiplatform.v1\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\0329google/cloud/aiplatform/v1/f" +
      "eature_monitoring_stats.proto\032\037google/pr" +
      "otobuf/timestamp.proto\032\034google/api/annot" +
      "ations.proto\"\257\005\n\007Feature\022\021\n\004name\030\001 \001(\tB\003" +
      "\340A\005\022\023\n\013description\030\002 \001(\t\022I\n\nvalue_type\030\003" +
      " \001(\0162-.google.cloud.aiplatform.v1.Featur" +
      "e.ValueTypeB\006\340A\002\340A\005\0224\n\013create_time\030\004 \001(\013" +
      "2\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upd" +
      "ate_time\030\005 \001(\0132\032.google.protobuf.Timesta" +
      "mpB\003\340A\003\022D\n\006labels\030\006 \003(\0132/.google.cloud.a" +
      "iplatform.v1.Feature.LabelsEntryB\003\340A\001\022\014\n" +
      "\004etag\030\007 \001(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001\"\244\001\n\tValueType\022\032\n\026VALU" +
      "E_TYPE_UNSPECIFIED\020\000\022\010\n\004BOOL\020\001\022\016\n\nBOOL_A" +
      "RRAY\020\002\022\n\n\006DOUBLE\020\003\022\020\n\014DOUBLE_ARRAY\020\004\022\t\n\005" +
      "INT64\020\t\022\017\n\013INT64_ARRAY\020\n\022\n\n\006STRING\020\013\022\020\n\014" +
      "STRING_ARRAY\020\014\022\t\n\005BYTES\020\r:\232\001\352A\226\001\n!aiplat" +
      "form.googleapis.com/Feature\022qprojects/{p" +
      "roject}/locations/{location}/featurestor" +
      "es/{featurestore}/entityTypes/{entity_ty" +
      "pe}/features/{feature}B\320\001\n\036com.google.cl" +
      "oud.aiplatform.v1B\014FeatureProtoP\001ZDgoogl" +
      "e.golang.org/genproto/googleapis/cloud/a" +
      "iplatform/v1;aiplatform\252\002\032Google.Cloud.A" +
      "IPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V" +
      "1\352\002\035Google::Cloud::AIPlatform::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.FeatureMonitoringStatsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_Feature_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Feature_descriptor,
        new java.lang.String[] { "Name", "Description", "ValueType", "CreateTime", "UpdateTime", "Labels", "Etag", });
    internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_Feature_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
