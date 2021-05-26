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
// source: google/cloud/aiplatform/v1beta1/pipeline_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class Pipeline {
  private Pipeline() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/pipeli"
          + "ne_job.proto\022\037google.cloud.aiplatform.v1"
          + "beta1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032.google/cloud/"
          + "aiplatform/v1beta1/artifact.proto\032-googl"
          + "e/cloud/aiplatform/v1beta1/context.proto"
          + "\0325google/cloud/aiplatform/v1beta1/encryp"
          + "tion_spec.proto\032/google/cloud/aiplatform"
          + "/v1beta1/execution.proto\0324google/cloud/a"
          + "iplatform/v1beta1/pipeline_state.proto\032+"
          + "google/cloud/aiplatform/v1beta1/value.pr"
          + "oto\032\034google/protobuf/struct.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\027google/rpc/s"
          + "tatus.proto\032\034google/api/annotations.prot"
          + "o\"\277\t\n\013PipelineJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014"
          + "display_name\030\002 \001(\t\0224\n\013create_time\030\003 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\0223\n\nstar"
          + "t_time\030\004 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\0221\n\010end_time\030\005 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0223\n\rpipeli"
          + "ne_spec\030\007 \001(\0132\027.google.protobuf.StructB\003"
          + "\340A\002\022B\n\005state\030\010 \001(\0162..google.cloud.aiplat"
          + "form.v1beta1.PipelineStateB\003\340A\003\022K\n\njob_d"
          + "etail\030\t \001(\01322.google.cloud.aiplatform.v1"
          + "beta1.PipelineJobDetailB\003\340A\003\022&\n\005error\030\n "
          + "\001(\0132\022.google.rpc.StatusB\003\340A\003\022H\n\006labels\030\013"
          + " \003(\01328.google.cloud.aiplatform.v1beta1.P"
          + "ipelineJob.LabelsEntry\022R\n\016runtime_config"
          + "\030\014 \001(\0132:.google.cloud.aiplatform.v1beta1"
          + ".PipelineJob.RuntimeConfig\022H\n\017encryption"
          + "_spec\030\020 \001(\0132/.google.cloud.aiplatform.v1"
          + "beta1.EncryptionSpec\022\027\n\017service_account\030"
          + "\021 \001(\t\0224\n\007network\030\022 \001(\tB#\372A \n\036compute.goo"
          + "gleapis.com/Network\032\355\001\n\rRuntimeConfig\022^\n"
          + "\nparameters\030\001 \003(\0132J.google.cloud.aiplatf"
          + "orm.v1beta1.PipelineJob.RuntimeConfig.Pa"
          + "rametersEntry\022!\n\024gcs_output_directory\030\002 "
          + "\001(\tB\003\340A\002\032Y\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t"
          + "\0225\n\005value\030\002 \001(\0132&.google.cloud.aiplatfor"
          + "m.v1beta1.Value:\0028\001\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:o\352Al\n%aiplatf"
          + "orm.googleapis.com/PipelineJob\022Cprojects"
          + "/{project}/locations/{location}/pipeline"
          + "Jobs/{pipeline_job}\"\371\001\n\021PipelineJobDetai"
          + "l\022G\n\020pipeline_context\030\001 \001(\0132(.google.clo"
          + "ud.aiplatform.v1beta1.ContextB\003\340A\003\022K\n\024pi"
          + "peline_run_context\030\002 \001(\0132(.google.cloud."
          + "aiplatform.v1beta1.ContextB\003\340A\003\022N\n\014task_"
          + "details\030\003 \003(\01323.google.cloud.aiplatform."
          + "v1beta1.PipelineTaskDetailB\003\340A\003\"\240\t\n\022Pipe"
          + "lineTaskDetail\022\024\n\007task_id\030\001 \001(\003B\003\340A\003\022\033\n\016"
          + "parent_task_id\030\014 \001(\003B\003\340A\003\022\026\n\ttask_name\030\002"
          + " \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\0223\n\nstart_time\030\004 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n\010"
          + "end_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\022Y\n\017executor_detail\030\006 \001(\0132;.googl"
          + "e.cloud.aiplatform.v1beta1.PipelineTaskE"
          + "xecutorDetailB\003\340A\003\022M\n\005state\030\007 \001(\01629.goog"
          + "le.cloud.aiplatform.v1beta1.PipelineTask"
          + "Detail.StateB\003\340A\003\022B\n\texecution\030\010 \001(\0132*.g"
          + "oogle.cloud.aiplatform.v1beta1.Execution"
          + "B\003\340A\003\022&\n\005error\030\t \001(\0132\022.google.rpc.Status"
          + "B\003\340A\003\022T\n\006inputs\030\n \003(\0132?.google.cloud.aip"
          + "latform.v1beta1.PipelineTaskDetail.Input"
          + "sEntryB\003\340A\003\022V\n\007outputs\030\013 \003(\0132@.google.cl"
          + "oud.aiplatform.v1beta1.PipelineTaskDetai"
          + "l.OutputsEntryB\003\340A\003\032Q\n\014ArtifactList\022A\n\ta"
          + "rtifacts\030\001 \003(\0132).google.cloud.aiplatform"
          + ".v1beta1.ArtifactB\003\340A\003\032o\n\013InputsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022O\n\005value\030\002 \001(\0132@.google.cloud"
          + ".aiplatform.v1beta1.PipelineTaskDetail.A"
          + "rtifactList:\0028\001\032p\n\014OutputsEntry\022\013\n\003key\030\001"
          + " \001(\t\022O\n\005value\030\002 \001(\0132@.google.cloud.aipla"
          + "tform.v1beta1.PipelineTaskDetail.Artifac"
          + "tList:\0028\001\"\246\001\n\005State\022\025\n\021STATE_UNSPECIFIED"
          + "\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\r\n\tSUCCEEDE"
          + "D\020\003\022\022\n\016CANCEL_PENDING\020\004\022\016\n\nCANCELLING\020\005\022"
          + "\r\n\tCANCELLED\020\006\022\n\n\006FAILED\020\007\022\013\n\007SKIPPED\020\010\022"
          + "\021\n\rNOT_TRIGGERED\020\t\"\366\003\n\032PipelineTaskExecu"
          + "torDetail\022l\n\020container_detail\030\001 \001(\0132K.go"
          + "ogle.cloud.aiplatform.v1beta1.PipelineTa"
          + "skExecutorDetail.ContainerDetailB\003\340A\003H\000\022"
          + "o\n\021custom_job_detail\030\002 \001(\0132K.google.clou"
          + "d.aiplatform.v1beta1.PipelineTaskExecuto"
          + "rDetail.CustomJobDetailB\005\030\001\340A\003H\000\032\234\001\n\017Con"
          + "tainerDetail\022=\n\010main_job\030\001 \001(\tB+\340A\003\372A%\n#"
          + "aiplatform.googleapis.com/CustomJob\022J\n\025p"
          + "re_caching_check_job\030\002 \001(\tB+\340A\003\372A%\n#aipl"
          + "atform.googleapis.com/CustomJob\032O\n\017Custo"
          + "mJobDetail\0228\n\003job\030\001 \001(\tB+\340A\003\372A%\n#aiplatf"
          + "orm.googleapis.com/CustomJob:\002\030\001B\t\n\007deta"
          + "ilsB\315\001\n#com.google.cloud.aiplatform.v1be"
          + "ta1B\010PipelineP\001ZIgoogle.golang.org/genpr"
          + "oto/googleapis/cloud/aiplatform/v1beta1;"
          + "aiplatform\352AN\n\036compute.googleapis.com/Ne"
          + "twork\022,projects/{project}/global/network"
          + "s/{network}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ArtifactProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ContextProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExecutionProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "PipelineSpec",
              "State",
              "JobDetail",
              "Error",
              "Labels",
              "RuntimeConfig",
              "EncryptionSpec",
              "ServiceAccount",
              "Network",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor,
            new java.lang.String[] {
              "Parameters", "GcsOutputDirectory",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_descriptor,
            new java.lang.String[] {
              "PipelineContext", "PipelineRunContext", "TaskDetails",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor,
            new java.lang.String[] {
              "TaskId",
              "ParentTaskId",
              "TaskName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "ExecutorDetail",
              "State",
              "Execution",
              "Error",
              "Inputs",
              "Outputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_descriptor,
            new java.lang.String[] {
              "Artifacts",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor,
            new java.lang.String[] {
              "ContainerDetail", "CustomJobDetail", "Details",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_descriptor,
            new java.lang.String[] {
              "MainJob", "PreCachingCheckJob",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor,
            new java.lang.String[] {
              "Job",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ArtifactProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ContextProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExecutionProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}