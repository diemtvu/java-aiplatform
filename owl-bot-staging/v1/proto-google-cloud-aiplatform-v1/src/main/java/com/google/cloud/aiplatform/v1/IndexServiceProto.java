// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_service.proto

package com.google.cloud.aiplatform.v1;

public final class IndexServiceProto {
  private IndexServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1/index_servi" +
      "ce.proto\022\032google.cloud.aiplatform.v1\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032&google/" +
      "cloud/aiplatform/v1/index.proto\032*google/" +
      "cloud/aiplatform/v1/operation.proto\032#goo" +
      "gle/longrunning/operations.proto\032 google" +
      "/protobuf/field_mask.proto\"\206\001\n\022CreateInd" +
      "exRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locat" +
      "ions.googleapis.com/Location\0225\n\005index\030\002 " +
      "\001(\0132!.google.cloud.aiplatform.v1.IndexB\003" +
      "\340A\002\"\346\001\n\034CreateIndexOperationMetadata\022N\n\020" +
      "generic_metadata\030\001 \001(\01324.google.cloud.ai" +
      "platform.v1.GenericOperationMetadata\022v\n*" +
      "nearest_neighbor_search_operation_metada" +
      "ta\030\002 \001(\0132B.google.cloud.aiplatform.v1.Ne" +
      "arestNeighborSearchOperationMetadata\"H\n\017" +
      "GetIndexRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037a" +
      "iplatform.googleapis.com/Index\"\265\001\n\022ListI" +
      "ndexesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!l" +
      "ocations.googleapis.com/Location\022\016\n\006filt" +
      "er\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_toke" +
      "n\030\004 \001(\t\022-\n\tread_mask\030\005 \001(\0132\032.google.prot" +
      "obuf.FieldMask\"b\n\023ListIndexesResponse\0222\n" +
      "\007indexes\030\001 \003(\0132!.google.cloud.aiplatform" +
      ".v1.Index\022\027\n\017next_page_token\030\002 \001(\t\"|\n\022Up" +
      "dateIndexRequest\0225\n\005index\030\001 \001(\0132!.google" +
      ".cloud.aiplatform.v1.IndexB\003\340A\002\022/\n\013updat" +
      "e_mask\030\002 \001(\0132\032.google.protobuf.FieldMask" +
      "\"\346\001\n\034UpdateIndexOperationMetadata\022N\n\020gen" +
      "eric_metadata\030\001 \001(\01324.google.cloud.aipla" +
      "tform.v1.GenericOperationMetadata\022v\n*nea" +
      "rest_neighbor_search_operation_metadata\030" +
      "\002 \001(\0132B.google.cloud.aiplatform.v1.Neare" +
      "stNeighborSearchOperationMetadata\"K\n\022Del" +
      "eteIndexRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037a" +
      "iplatform.googleapis.com/Index\"\311\006\n&Neare" +
      "stNeighborSearchOperationMetadata\022{\n\030con" +
      "tent_validation_stats\030\001 \003(\0132Y.google.clo" +
      "ud.aiplatform.v1.NearestNeighborSearchOp" +
      "erationMetadata.ContentValidationStats\022\030" +
      "\n\020data_bytes_count\030\002 \001(\003\032\262\003\n\013RecordError" +
      "\022r\n\nerror_type\030\001 \001(\0162^.google.cloud.aipl" +
      "atform.v1.NearestNeighborSearchOperation" +
      "Metadata.RecordError.RecordErrorType\022\025\n\r" +
      "error_message\030\002 \001(\t\022\026\n\016source_gcs_uri\030\003 " +
      "\001(\t\022\024\n\014embedding_id\030\004 \001(\t\022\022\n\nraw_record\030" +
      "\005 \001(\t\"\325\001\n\017RecordErrorType\022\032\n\026ERROR_TYPE_" +
      "UNSPECIFIED\020\000\022\016\n\nEMPTY_LINE\020\001\022\027\n\023INVALID" +
      "_JSON_SYNTAX\020\002\022\026\n\022INVALID_CSV_SYNTAX\020\003\022\027" +
      "\n\023INVALID_AVRO_SYNTAX\020\004\022\030\n\024INVALID_EMBED" +
      "DING_ID\020\005\022\033\n\027EMBEDDING_SIZE_MISMATCH\020\006\022\025" +
      "\n\021NAMESPACE_MISSING\020\007\032\322\001\n\026ContentValidat" +
      "ionStats\022\026\n\016source_gcs_uri\030\001 \001(\t\022\032\n\022vali" +
      "d_record_count\030\002 \001(\003\022\034\n\024invalid_record_c" +
      "ount\030\003 \001(\003\022f\n\016partial_errors\030\004 \003(\0132N.goo" +
      "gle.cloud.aiplatform.v1.NearestNeighborS" +
      "earchOperationMetadata.RecordError2\242\010\n\014I" +
      "ndexService\022\317\001\n\013CreateIndex\022..google.clo" +
      "ud.aiplatform.v1.CreateIndexRequest\032\035.go" +
      "ogle.longrunning.Operation\"q\202\323\344\223\0024\"+/v1/" +
      "{parent=projects/*/locations/*}/indexes:" +
      "\005index\332A\014parent,index\312A%\n\005Index\022\034CreateI" +
      "ndexOperationMetadata\022\226\001\n\010GetIndex\022+.goo" +
      "gle.cloud.aiplatform.v1.GetIndexRequest\032" +
      "!.google.cloud.aiplatform.v1.Index\":\202\323\344\223" +
      "\002-\022+/v1/{name=projects/*/locations/*/ind" +
      "exes/*}\332A\004name\022\254\001\n\013ListIndexes\022..google." +
      "cloud.aiplatform.v1.ListIndexesRequest\032/" +
      ".google.cloud.aiplatform.v1.ListIndexesR" +
      "esponse\"<\202\323\344\223\002-\022+/v1/{parent=projects/*/" +
      "locations/*}/indexes\332A\006parent\022\332\001\n\013Update" +
      "Index\022..google.cloud.aiplatform.v1.Updat" +
      "eIndexRequest\032\035.google.longrunning.Opera" +
      "tion\"|\202\323\344\223\002:21/v1/{index.name=projects/*" +
      "/locations/*/indexes/*}:\005index\332A\021index,u" +
      "pdate_mask\312A%\n\005Index\022\034UpdateIndexOperati" +
      "onMetadata\022\313\001\n\013DeleteIndex\022..google.clou" +
      "d.aiplatform.v1.DeleteIndexRequest\032\035.goo" +
      "gle.longrunning.Operation\"m\202\323\344\223\002-*+/v1/{" +
      "name=projects/*/locations/*/indexes/*}\332A" +
      "\004name\312A0\n\025google.protobuf.Empty\022\027DeleteO" +
      "perationMetadata\032M\312A\031aiplatform.googleap" +
      "is.com\322A.https://www.googleapis.com/auth" +
      "/cloud-platformB\325\001\n\036com.google.cloud.aip" +
      "latform.v1B\021IndexServiceProtoP\001ZDgoogle." +
      "golang.org/genproto/googleapis/cloud/aip" +
      "latform/v1;aiplatform\252\002\032Google.Cloud.AIP" +
      "latform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352" +
      "\002\035Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.IndexProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor,
        new java.lang.String[] { "Parent", "Index", });
    internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", "NearestNeighborSearchOperationMetadata", });
    internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", "ReadMask", });
    internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor,
        new java.lang.String[] { "Indexes", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor,
        new java.lang.String[] { "Index", "UpdateMask", });
    internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", "NearestNeighborSearchOperationMetadata", });
    internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor,
        new java.lang.String[] { "ContentValidationStats", "DataBytesCount", });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor =
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor,
        new java.lang.String[] { "ErrorType", "ErrorMessage", "SourceGcsUri", "EmbeddingId", "RawRecord", });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor =
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor,
        new java.lang.String[] { "SourceGcsUri", "ValidRecordCount", "InvalidRecordCount", "PartialErrors", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IndexProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
