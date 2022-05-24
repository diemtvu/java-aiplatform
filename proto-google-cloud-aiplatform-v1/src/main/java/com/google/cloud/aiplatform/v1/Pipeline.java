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
// source: google/cloud/aiplatform/v1/pipeline_job.proto

package com.google.cloud.aiplatform.v1;

public final class Pipeline {
  private Pipeline() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1/pipeline_jo"
          + "b.proto\022\032google.cloud.aiplatform.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032)google/cloud/aiplatform"
          + "/v1/artifact.proto\032(google/cloud/aiplatf"
          + "orm/v1/context.proto\0320google/cloud/aipla"
          + "tform/v1/encryption_spec.proto\032*google/c"
          + "loud/aiplatform/v1/execution.proto\032/goog"
          + "le/cloud/aiplatform/v1/pipeline_state.pr"
          + "oto\032&google/cloud/aiplatform/v1/value.pr"
          + "oto\032\034google/protobuf/struct.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\027google/rpc/s"
          + "tatus.proto\"\275\013\n\013PipelineJob\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\003\022\024\n\014display_name\030\002 \001(\t\0224\n\013create_t"
          + "ime\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\0223\n\nstart_time\030\004 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\0221\n\010end_time\030\005 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0224\n\013update_tim"
          + "e\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\022.\n\rpipeline_spec\030\007 \001(\0132\027.google.protobu"
          + "f.Struct\022=\n\005state\030\010 \001(\0162).google.cloud.a"
          + "iplatform.v1.PipelineStateB\003\340A\003\022F\n\njob_d"
          + "etail\030\t \001(\0132-.google.cloud.aiplatform.v1"
          + ".PipelineJobDetailB\003\340A\003\022&\n\005error\030\n \001(\0132\022"
          + ".google.rpc.StatusB\003\340A\003\022C\n\006labels\030\013 \003(\0132"
          + "3.google.cloud.aiplatform.v1.PipelineJob"
          + ".LabelsEntry\022M\n\016runtime_config\030\014 \001(\01325.g"
          + "oogle.cloud.aiplatform.v1.PipelineJob.Ru"
          + "ntimeConfig\022C\n\017encryption_spec\030\020 \001(\0132*.g"
          + "oogle.cloud.aiplatform.v1.EncryptionSpec"
          + "\022\027\n\017service_account\030\021 \001(\t\0224\n\007network\030\022 \001"
          + "(\tB#\372A \n\036compute.googleapis.com/Network\022"
          + "\024\n\014template_uri\030\023 \001(\t\022T\n\021template_metada"
          + "ta\030\024 \001(\01324.google.cloud.aiplatform.v1.Pi"
          + "pelineTemplateMetadataB\003\340A\003\032\235\003\n\rRuntimeC"
          + "onfig\022]\n\nparameters\030\001 \003(\0132E.google.cloud"
          + ".aiplatform.v1.PipelineJob.RuntimeConfig"
          + ".ParametersEntryB\002\030\001\022!\n\024gcs_output_direc"
          + "tory\030\002 \001(\tB\003\340A\002\022d\n\020parameter_values\030\003 \003("
          + "\0132J.google.cloud.aiplatform.v1.PipelineJ"
          + "ob.RuntimeConfig.ParameterValuesEntry\032T\n"
          + "\017ParametersEntry\022\013\n\003key\030\001 \001(\t\0220\n\005value\030\002"
          + " \001(\0132!.google.cloud.aiplatform.v1.Value:"
          + "\0028\001\032N\n\024ParameterValuesEntry\022\013\n\003key\030\001 \001(\t"
          + "\022%\n\005value\030\002 \001(\0132\026.google.protobuf.Value:"
          + "\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001:o\352Al\n%aiplatform.googleapis.c"
          + "om/PipelineJob\022Cprojects/{project}/locat"
          + "ions/{location}/pipelineJobs/{pipeline_j"
          + "ob}\"+\n\030PipelineTemplateMetadata\022\017\n\007versi"
          + "on\030\003 \001(\t\"\352\001\n\021PipelineJobDetail\022B\n\020pipeli"
          + "ne_context\030\001 \001(\0132#.google.cloud.aiplatfo"
          + "rm.v1.ContextB\003\340A\003\022F\n\024pipeline_run_conte"
          + "xt\030\002 \001(\0132#.google.cloud.aiplatform.v1.Co"
          + "ntextB\003\340A\003\022I\n\014task_details\030\003 \003(\0132..googl"
          + "e.cloud.aiplatform.v1.PipelineTaskDetail"
          + "B\003\340A\003\"\235\013\n\022PipelineTaskDetail\022\024\n\007task_id\030"
          + "\001 \001(\003B\003\340A\003\022\033\n\016parent_task_id\030\014 \001(\003B\003\340A\003\022"
          + "\026\n\ttask_name\030\002 \001(\tB\003\340A\003\0224\n\013create_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0223\n"
          + "\nstart_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0221\n\010end_time\030\005 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\022T\n\017executor_detail"
          + "\030\006 \001(\01326.google.cloud.aiplatform.v1.Pipe"
          + "lineTaskExecutorDetailB\003\340A\003\022H\n\005state\030\007 \001"
          + "(\01624.google.cloud.aiplatform.v1.Pipeline"
          + "TaskDetail.StateB\003\340A\003\022=\n\texecution\030\010 \001(\013"
          + "2%.google.cloud.aiplatform.v1.ExecutionB"
          + "\003\340A\003\022&\n\005error\030\t \001(\0132\022.google.rpc.StatusB"
          + "\003\340A\003\022d\n\024pipeline_task_status\030\r \003(\0132A.goo"
          + "gle.cloud.aiplatform.v1.PipelineTaskDeta"
          + "il.PipelineTaskStatusB\003\340A\003\022O\n\006inputs\030\n \003"
          + "(\0132:.google.cloud.aiplatform.v1.Pipeline"
          + "TaskDetail.InputsEntryB\003\340A\003\022Q\n\007outputs\030\013"
          + " \003(\0132;.google.cloud.aiplatform.v1.Pipeli"
          + "neTaskDetail.OutputsEntryB\003\340A\003\032\274\001\n\022Pipel"
          + "ineTaskStatus\0224\n\013update_time\030\001 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\022H\n\005state\030\002 \001"
          + "(\01624.google.cloud.aiplatform.v1.Pipeline"
          + "TaskDetail.StateB\003\340A\003\022&\n\005error\030\003 \001(\0132\022.g"
          + "oogle.rpc.StatusB\003\340A\003\032L\n\014ArtifactList\022<\n"
          + "\tartifacts\030\001 \003(\0132$.google.cloud.aiplatfo"
          + "rm.v1.ArtifactB\003\340A\003\032j\n\013InputsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022J\n\005value\030\002 \001(\0132;.google.cloud.ai"
          + "platform.v1.PipelineTaskDetail.ArtifactL"
          + "ist:\0028\001\032k\n\014OutputsEntry\022\013\n\003key\030\001 \001(\t\022J\n\005"
          + "value\030\002 \001(\0132;.google.cloud.aiplatform.v1"
          + ".PipelineTaskDetail.ArtifactList:\0028\001\"\246\001\n"
          + "\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PENDING"
          + "\020\001\022\013\n\007RUNNING\020\002\022\r\n\tSUCCEEDED\020\003\022\022\n\016CANCEL"
          + "_PENDING\020\004\022\016\n\nCANCELLING\020\005\022\r\n\tCANCELLED\020"
          + "\006\022\n\n\006FAILED\020\007\022\013\n\007SKIPPED\020\010\022\021\n\rNOT_TRIGGE"
          + "RED\020\t\"\354\003\n\032PipelineTaskExecutorDetail\022g\n\020"
          + "container_detail\030\001 \001(\0132F.google.cloud.ai"
          + "platform.v1.PipelineTaskExecutorDetail.C"
          + "ontainerDetailB\003\340A\003H\000\022j\n\021custom_job_deta"
          + "il\030\002 \001(\0132F.google.cloud.aiplatform.v1.Pi"
          + "pelineTaskExecutorDetail.CustomJobDetail"
          + "B\005\030\001\340A\003H\000\032\234\001\n\017ContainerDetail\022=\n\010main_jo"
          + "b\030\001 \001(\tB+\340A\003\372A%\n#aiplatform.googleapis.c"
          + "om/CustomJob\022J\n\025pre_caching_check_job\030\002 "
          + "\001(\tB+\340A\003\372A%\n#aiplatform.googleapis.com/C"
          + "ustomJob\032O\n\017CustomJobDetail\0228\n\003job\030\001 \001(\t"
          + "B+\340A\003\372A%\n#aiplatform.googleapis.com/Cust"
          + "omJob:\002\030\001B\t\n\007detailsB\235\002\n\036com.google.clou"
          + "d.aiplatform.v1B\010PipelineP\001ZDgoogle.gola"
          + "ng.org/genproto/googleapis/cloud/aiplatf"
          + "orm/v1;aiplatform\252\002\032Google.Cloud.AIPlatf"
          + "orm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Go"
          + "ogle::Cloud::AIPlatform::V1\352AN\n\036compute."
          + "googleapis.com/Network\022,projects/{projec"
          + "t}/global/networks/{network}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ContextProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ValueProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor,
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
              "TemplateUri",
              "TemplateMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor,
            new java.lang.String[] {
              "Parameters", "GcsOutputDirectory", "ParameterValues",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor,
            new java.lang.String[] {
              "PipelineContext", "PipelineRunContext", "TaskDetails",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor,
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
              "PipelineTaskStatus",
              "Inputs",
              "Outputs",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor,
            new java.lang.String[] {
              "UpdateTime", "State", "Error",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor,
            new java.lang.String[] {
              "Artifacts",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor,
            new java.lang.String[] {
              "ContainerDetail", "CustomJobDetail", "Details",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor,
            new java.lang.String[] {
              "MainJob", "PreCachingCheckJob",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor,
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
    com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ContextProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
