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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_object_detection.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLImageObjectDetectionProto {
  private AutoMLImageObjectDetectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nagoogle/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_image_obj"
          + "ect_detection.proto\022=google.cloud.aiplat"
          + "form.v1beta1.schema.trainingjob.definiti"
          + "on\032\034google/api/annotations.proto\"\202\002\n\032Aut"
          + "oMlImageObjectDetection\022o\n\006inputs\030\001 \001(\0132"
          + "_.google.cloud.aiplatform.v1beta1.schema"
          + ".trainingjob.definition.AutoMlImageObjec"
          + "tDetectionInputs\022s\n\010metadata\030\002 \001(\0132a.goo"
          + "gle.cloud.aiplatform.v1beta1.schema.trai"
          + "ningjob.definition.AutoMlImageObjectDete"
          + "ctionMetadata\"\227\003\n AutoMlImageObjectDetec"
          + "tionInputs\022}\n\nmodel_type\030\001 \001(\0162i.google."
          + "cloud.aiplatform.v1beta1.schema.training"
          + "job.definition.AutoMlImageObjectDetectio"
          + "nInputs.ModelType\022\037\n\027budget_milli_node_h"
          + "ours\030\002 \001(\003\022\036\n\026disable_early_stopping\030\003 \001"
          + "(\010\"\262\001\n\tModelType\022\032\n\026MODEL_TYPE_UNSPECIFI"
          + "ED\020\000\022\031\n\025CLOUD_HIGH_ACCURACY_1\020\001\022\027\n\023CLOUD"
          + "_LOW_LATENCY_1\020\002\022\033\n\027MOBILE_TF_LOW_LATENC"
          + "Y_1\020\003\022\031\n\025MOBILE_TF_VERSATILE_1\020\004\022\035\n\031MOBI"
          + "LE_TF_HIGH_ACCURACY_1\020\005\"\305\002\n\"AutoMlImageO"
          + "bjectDetectionMetadata\022\035\n\025cost_milli_nod"
          + "e_hours\030\001 \001(\003\022\226\001\n\026successful_stop_reason"
          + "\030\002 \001(\0162v.google.cloud.aiplatform.v1beta1"
          + ".schema.trainingjob.definition.AutoMlIma"
          + "geObjectDetectionMetadata.SuccessfulStop"
          + "Reason\"g\n\024SuccessfulStopReason\022&\n\"SUCCES"
          + "SFUL_STOP_REASON_UNSPECIFIED\020\000\022\022\n\016BUDGET"
          + "_REACHED\020\001\022\023\n\017MODEL_CONVERGED\020\002B\317\001\nAcom."
          + "google.cloud.aiplatform.v1beta1.schema.t"
          + "rainingjob.definitionB\037AutoMLImageObject"
          + "DetectionProtoP\001Zggoogle.golang.org/genp"
          + "roto/googleapis/cloud/aiplatform/v1beta1"
          + "/schema/trainingjob/definition;definitio"
          + "nb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetection_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionInputs_descriptor,
            new java.lang.String[] {
              "ModelType", "BudgetMilliNodeHours", "DisableEarlyStopping",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageObjectDetectionMetadata_descriptor,
            new java.lang.String[] {
              "CostMilliNodeHours", "SuccessfulStopReason",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
