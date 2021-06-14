// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

public interface BigQueryDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.BigQueryDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. BigQuery URI to a project or table, up to 2000 characters long.
   * When only the project is specified, the Dataset and Table is created.
   * When the full table reference is specified, the Dataset must exist and
   * table must not exist.
   * Accepted forms:
   * *  BigQuery path. For example:
   * `bq://projectId` or `bq://projectId.bqDatasetId.bqTableId`.
   * </pre>
   *
   * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputUri.
   */
  java.lang.String getOutputUri();
  /**
   * <pre>
   * Required. BigQuery URI to a project or table, up to 2000 characters long.
   * When only the project is specified, the Dataset and Table is created.
   * When the full table reference is specified, the Dataset must exist and
   * table must not exist.
   * Accepted forms:
   * *  BigQuery path. For example:
   * `bq://projectId` or `bq://projectId.bqDatasetId.bqTableId`.
   * </pre>
   *
   * <code>string output_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outputUri.
   */
  com.google.protobuf.ByteString
      getOutputUriBytes();
}
