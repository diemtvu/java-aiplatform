// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ExplanationProto {
  private ExplanationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1beta1/explan" +
      "ation.proto\022\037google.cloud.aiplatform.v1b" +
      "eta1\032\037google/api/field_behavior.proto\032:g" +
      "oogle/cloud/aiplatform/v1beta1/explanati" +
      "on_metadata.proto\032(google/cloud/aiplatfo" +
      "rm/v1beta1/io.proto\032\034google/protobuf/str" +
      "uct.proto\032\034google/api/annotations.proto\"" +
      "V\n\013Explanation\022G\n\014attributions\030\001 \003(\0132,.g" +
      "oogle.cloud.aiplatform.v1beta1.Attributi" +
      "onB\003\340A\003\"`\n\020ModelExplanation\022L\n\021mean_attr" +
      "ibutions\030\001 \003(\0132,.google.cloud.aiplatform" +
      ".v1beta1.AttributionB\003\340A\003\"\211\002\n\013Attributio" +
      "n\022\"\n\025baseline_output_value\030\001 \001(\001B\003\340A\003\022\"\n" +
      "\025instance_output_value\030\002 \001(\001B\003\340A\003\0229\n\024fea" +
      "ture_attributions\030\003 \001(\0132\026.google.protobu" +
      "f.ValueB\003\340A\003\022\031\n\014output_index\030\004 \003(\005B\003\340A\003\022" +
      " \n\023output_display_name\030\005 \001(\tB\003\340A\003\022 \n\023app" +
      "roximation_error\030\006 \001(\001B\003\340A\003\022\030\n\013output_na" +
      "me\030\007 \001(\tB\003\340A\003\"\257\001\n\017ExplanationSpec\022O\n\npar" +
      "ameters\030\001 \001(\01326.google.cloud.aiplatform." +
      "v1beta1.ExplanationParametersB\003\340A\002\022K\n\010me" +
      "tadata\030\002 \001(\01324.google.cloud.aiplatform.v" +
      "1beta1.ExplanationMetadataB\003\340A\002\"\202\003\n\025Expl" +
      "anationParameters\022a\n\033sampled_shapley_att" +
      "ribution\030\001 \001(\0132:.google.cloud.aiplatform" +
      ".v1beta1.SampledShapleyAttributionH\000\022k\n " +
      "integrated_gradients_attribution\030\002 \001(\0132?" +
      ".google.cloud.aiplatform.v1beta1.Integra" +
      "tedGradientsAttributionH\000\022L\n\020xrai_attrib" +
      "ution\030\003 \001(\01320.google.cloud.aiplatform.v1" +
      "beta1.XraiAttributionH\000\022\r\n\005top_k\030\004 \001(\005\0222" +
      "\n\016output_indices\030\005 \001(\0132\032.google.protobuf" +
      ".ListValueB\010\n\006method\"4\n\031SampledShapleyAt" +
      "tribution\022\027\n\npath_count\030\001 \001(\005B\003\340A\002\"\210\001\n\036I" +
      "ntegratedGradientsAttribution\022\027\n\nstep_co" +
      "unt\030\001 \001(\005B\003\340A\002\022M\n\022smooth_grad_config\030\002 \001" +
      "(\01321.google.cloud.aiplatform.v1beta1.Smo" +
      "othGradConfig\"y\n\017XraiAttribution\022\027\n\nstep" +
      "_count\030\001 \001(\005B\003\340A\002\022M\n\022smooth_grad_config\030" +
      "\002 \001(\01321.google.cloud.aiplatform.v1beta1." +
      "SmoothGradConfig\"\256\001\n\020SmoothGradConfig\022\025\n" +
      "\013noise_sigma\030\001 \001(\002H\000\022Q\n\023feature_noise_si" +
      "gma\030\002 \001(\01322.google.cloud.aiplatform.v1be" +
      "ta1.FeatureNoiseSigmaH\000\022\032\n\022noisy_sample_" +
      "count\030\003 \001(\005B\024\n\022GradientNoiseSigma\"\246\001\n\021Fe" +
      "atureNoiseSigma\022\\\n\013noise_sigma\030\001 \003(\0132G.g" +
      "oogle.cloud.aiplatform.v1beta1.FeatureNo" +
      "iseSigma.NoiseSigmaForFeature\0323\n\024NoiseSi" +
      "gmaForFeature\022\014\n\004name\030\001 \001(\t\022\r\n\005sigma\030\002 \001" +
      "(\002\"\265\001\n\027ExplanationSpecOverride\022J\n\nparame" +
      "ters\030\001 \001(\01326.google.cloud.aiplatform.v1b" +
      "eta1.ExplanationParameters\022N\n\010metadata\030\002" +
      " \001(\0132<.google.cloud.aiplatform.v1beta1.E" +
      "xplanationMetadataOverride\"\312\002\n\033Explanati" +
      "onMetadataOverride\022]\n\006inputs\030\001 \003(\0132H.goo" +
      "gle.cloud.aiplatform.v1beta1.Explanation" +
      "MetadataOverride.InputsEntryB\003\340A\002\032H\n\025Inp" +
      "utMetadataOverride\022/\n\017input_baselines\030\001 " +
      "\003(\0132\026.google.protobuf.Value\032\201\001\n\013InputsEn" +
      "try\022\013\n\003key\030\001 \001(\t\022a\n\005value\030\002 \001(\0132R.google" +
      ".cloud.aiplatform.v1beta1.ExplanationMet" +
      "adataOverride.InputMetadataOverride:\0028\001B" +
      "\204\001\n#com.google.cloud.aiplatform.v1beta1B" +
      "\020ExplanationProtoP\001ZIgoogle.golang.org/g" +
      "enproto/googleapis/cloud/aiplatform/v1be" +
      "ta1;aiplatformb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor,
        new java.lang.String[] { "Attributions", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor,
        new java.lang.String[] { "MeanAttributions", });
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor,
        new java.lang.String[] { "BaselineOutputValue", "InstanceOutputValue", "FeatureAttributions", "OutputIndex", "OutputDisplayName", "ApproximationError", "OutputName", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor,
        new java.lang.String[] { "Parameters", "Metadata", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor,
        new java.lang.String[] { "SampledShapleyAttribution", "IntegratedGradientsAttribution", "XraiAttribution", "TopK", "OutputIndices", "Method", });
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor,
        new java.lang.String[] { "PathCount", });
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_IntegratedGradientsAttribution_descriptor,
        new java.lang.String[] { "StepCount", "SmoothGradConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_XraiAttribution_descriptor,
        new java.lang.String[] { "StepCount", "SmoothGradConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_SmoothGradConfig_descriptor,
        new java.lang.String[] { "NoiseSigma", "FeatureNoiseSigma", "NoisySampleCount", "GradientNoiseSigma", });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor,
        new java.lang.String[] { "NoiseSigma", });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor,
        new java.lang.String[] { "Name", "Sigma", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpecOverride_descriptor,
        new java.lang.String[] { "Parameters", "Metadata", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor,
        new java.lang.String[] { "Inputs", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputMetadataOverride_descriptor,
        new java.lang.String[] { "InputBaselines", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadataOverride_InputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
