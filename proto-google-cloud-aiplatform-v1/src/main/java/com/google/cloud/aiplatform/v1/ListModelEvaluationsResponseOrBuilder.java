/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListModelEvaluationsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListModelEvaluationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.ModelEvaluation> getModelEvaluationsList();
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ModelEvaluation getModelEvaluations(int index);
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  int getModelEvaluationsCount();
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder>
      getModelEvaluationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ModelEvaluation model_evaluations = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ModelEvaluationOrBuilder getModelEvaluationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1.ListModelEvaluationsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
