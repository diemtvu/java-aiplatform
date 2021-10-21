// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_endpoint.proto

package com.google.cloud.aiplatform.v1;

public final class IndexEndpointProto {
  private IndexEndpointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployedIndex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedIndex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/aiplatform/v1/index_endpo" +
      "int.proto\022\032google.cloud.aiplatform.v1\032&g" +
      "oogle/cloud/aiplatform/v1/index.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\0322google/cloud/aiplatfo" +
      "rm/v1/machine_resources.proto\032\037google/pr" +
      "otobuf/timestamp.proto\032\034google/api/annot" +
      "ations.proto\"\234\004\n\rIndexEndpoint\022\021\n\004name\030\001" +
      " \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013" +
      "description\030\003 \001(\t\022H\n\020deployed_indexes\030\004 " +
      "\003(\0132).google.cloud.aiplatform.v1.Deploye" +
      "dIndexB\003\340A\003\022\014\n\004etag\030\005 \001(\t\022E\n\006labels\030\006 \003(" +
      "\01325.google.cloud.aiplatform.v1.IndexEndp" +
      "oint.LabelsEntry\0224\n\013create_time\030\007 \001(\0132\032." +
      "google.protobuf.TimestampB\003\340A\003\0224\n\013update" +
      "_time\030\010 \001(\0132\032.google.protobuf.TimestampB" +
      "\003\340A\003\022\027\n\007network\030\t \001(\tB\006\340A\002\340A\005\032-\n\013LabelsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:u\352A" +
      "r\n\'aiplatform.googleapis.com/IndexEndpoi" +
      "nt\022Gprojects/{project}/locations/{locati" +
      "on}/indexEndpoints/{index_endpoint}\"\305\004\n\r" +
      "DeployedIndex\022\017\n\002id\030\001 \001(\tB\003\340A\002\0226\n\005index\030" +
      "\002 \001(\tB\'\340A\002\372A!\n\037aiplatform.googleapis.com" +
      "/Index\022\024\n\014display_name\030\003 \001(\t\0224\n\013create_t" +
      "ime\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340" +
      "A\003\022Q\n\021private_endpoints\030\005 \001(\01321.google.c" +
      "loud.aiplatform.v1.IndexPrivateEndpoints" +
      "B\003\340A\003\0228\n\017index_sync_time\030\006 \001(\0132\032.google." +
      "protobuf.TimestampB\003\340A\003\022P\n\023automatic_res" +
      "ources\030\007 \001(\0132..google.cloud.aiplatform.v" +
      "1.AutomaticResourcesB\003\340A\001\022\"\n\025enable_acce" +
      "ss_logging\030\010 \001(\010B\003\340A\001\022\\\n\032deployed_index_" +
      "auth_config\030\t \001(\01323.google.cloud.aiplatf" +
      "orm.v1.DeployedIndexAuthConfigB\003\340A\001\022\037\n\022r" +
      "eserved_ip_ranges\030\n \003(\tB\003\340A\001\022\035\n\020deployme" +
      "nt_group\030\013 \001(\tB\003\340A\001\"\256\001\n\027DeployedIndexAut" +
      "hConfig\022W\n\rauth_provider\030\001 \001(\0132@.google." +
      "cloud.aiplatform.v1.DeployedIndexAuthCon" +
      "fig.AuthProvider\032:\n\014AuthProvider\022\021\n\taudi" +
      "ences\030\001 \003(\t\022\027\n\017allowed_issuers\030\002 \003(\t\"8\n\025" +
      "IndexPrivateEndpoints\022\037\n\022match_grpc_addr" +
      "ess\030\001 \001(\tB\003\340A\003B\326\001\n\036com.google.cloud.aipl" +
      "atform.v1B\022IndexEndpointProtoP\001ZDgoogle." +
      "golang.org/genproto/googleapis/cloud/aip" +
      "latform/v1;aiplatform\252\002\032Google.Cloud.AIP" +
      "latform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352" +
      "\002\035Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.aiplatform.v1.IndexProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "DeployedIndexes", "Etag", "Labels", "CreateTime", "UpdateTime", "Network", });
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_IndexEndpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IndexEndpoint_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_DeployedIndex_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DeployedIndex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployedIndex_descriptor,
        new java.lang.String[] { "Id", "Index", "DisplayName", "CreateTime", "PrivateEndpoints", "IndexSyncTime", "AutomaticResources", "EnableAccessLogging", "DeployedIndexAuthConfig", "ReservedIpRanges", "DeploymentGroup", });
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor,
        new java.lang.String[] { "AuthProvider", });
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_descriptor =
      internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployedIndexAuthConfig_AuthProvider_descriptor,
        new java.lang.String[] { "Audiences", "AllowedIssuers", });
    internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_IndexPrivateEndpoints_descriptor,
        new java.lang.String[] { "MatchGrpcAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.cloud.aiplatform.v1.IndexProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
