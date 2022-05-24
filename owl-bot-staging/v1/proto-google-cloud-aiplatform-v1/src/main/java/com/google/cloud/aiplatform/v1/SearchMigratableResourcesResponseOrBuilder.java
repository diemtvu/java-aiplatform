// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/migration_service.proto

package com.google.cloud.aiplatform.v1;

public interface SearchMigratableResourcesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SearchMigratableResourcesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.MigratableResource> 
      getMigratableResourcesList();
  /**
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  com.google.cloud.aiplatform.v1.MigratableResource getMigratableResources(int index);
  /**
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  int getMigratableResourcesCount();
  /**
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder> 
      getMigratableResourcesOrBuilderList();
  /**
   * <pre>
   * All migratable resources that can be migrated to the
   * location specified in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MigratableResource migratable_resources = 1;</code>
   */
  com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder getMigratableResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * The standard next-page token.
   * The migratable_resources may not fill page_size in
   * SearchMigratableResourcesRequest even when there are subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The standard next-page token.
   * The migratable_resources may not fill page_size in
   * SearchMigratableResourcesRequest even when there are subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
