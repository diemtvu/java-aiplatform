// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/prediction/text_extraction.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public final class TextExtractionPredictionResultProto {
  private TextExtractionPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextExtractionPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextExtractionPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/cloud/aiplatform/v1/schema/pred" +
      "ict/prediction/text_extraction.proto\0224go" +
      "ogle.cloud.aiplatform.v1.schema.predict." +
      "prediction\032\034google/api/annotations.proto" +
      "\"\237\001\n\036TextExtractionPredictionResult\022\013\n\003i" +
      "ds\030\001 \003(\003\022\025\n\rdisplay_names\030\002 \003(\t\022\"\n\032text_" +
      "segment_start_offsets\030\003 \003(\003\022 \n\030text_segm" +
      "ent_end_offsets\030\004 \003(\003\022\023\n\013confidences\030\005 \003" +
      "(\002B\354\002\n8com.google.cloud.aiplatform.v1.sc" +
      "hema.predict.predictionB#TextExtractionP" +
      "redictionResultProtoP\001Z^google.golang.or" +
      "g/genproto/googleapis/cloud/aiplatform/v" +
      "1/schema/predict/prediction;prediction\252\002" +
      "4Google.Cloud.AIPlatform.V1.Schema.Predi" +
      "ct.Prediction\312\0024Google\\Cloud\\AIPlatform\\" +
      "V1\\Schema\\Predict\\Prediction\352\002:Google::C" +
      "loud::AIPlatform::V1::Schema::Predict::P" +
      "redictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextExtractionPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextExtractionPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextExtractionPredictionResult_descriptor,
        new java.lang.String[] { "Ids", "DisplayNames", "TextSegmentStartOffsets", "TextSegmentEndOffsets", "Confidences", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
