// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/prediction/classification.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public final class ClassificationPredictionResultProto {
  private ClassificationPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/cloud/aiplatform/v1/schema/pred" +
      "ict/prediction/classification.proto\0224goo" +
      "gle.cloud.aiplatform.v1.schema.predict.p" +
      "rediction\032\034google/api/annotations.proto\"" +
      "Y\n\036ClassificationPredictionResult\022\013\n\003ids" +
      "\030\001 \003(\003\022\025\n\rdisplay_names\030\002 \003(\t\022\023\n\013confide" +
      "nces\030\003 \003(\002B\354\002\n8com.google.cloud.aiplatfo" +
      "rm.v1.schema.predict.predictionB#Classif" +
      "icationPredictionResultProtoP\001Z^google.g" +
      "olang.org/genproto/googleapis/cloud/aipl" +
      "atform/v1/schema/predict/prediction;pred" +
      "iction\252\0024Google.Cloud.AIPlatform.V1.Sche" +
      "ma.Predict.Prediction\312\0024Google\\Cloud\\AIP" +
      "latform\\V1\\Schema\\Predict\\Prediction\352\002:G" +
      "oogle::Cloud::AIPlatform::V1::Schema::Pr" +
      "edict::Predictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_descriptor,
        new java.lang.String[] { "Ids", "DisplayNames", "Confidences", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
