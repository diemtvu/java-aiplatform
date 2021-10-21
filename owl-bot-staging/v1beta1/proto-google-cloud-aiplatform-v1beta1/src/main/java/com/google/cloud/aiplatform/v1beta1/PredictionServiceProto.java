// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1beta1/predic" +
      "tion_service.proto\022\037google.cloud.aiplatf" +
      "orm.v1beta1\032\034google/api/annotations.prot" +
      "o\032\027google/api/client.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/httpbody" +
      ".proto\032\031google/api/resource.proto\0321googl" +
      "e/cloud/aiplatform/v1beta1/explanation.p" +
      "roto\032\034google/protobuf/struct.proto\"\252\001\n\016P" +
      "redictRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n" +
      "\"aiplatform.googleapis.com/Endpoint\022.\n\ti" +
      "nstances\030\002 \003(\0132\026.google.protobuf.ValueB\003" +
      "\340A\002\022*\n\nparameters\030\003 \001(\0132\026.google.protobu" +
      "f.Value\"\262\001\n\017PredictResponse\022+\n\013predictio" +
      "ns\030\001 \003(\0132\026.google.protobuf.Value\022\031\n\021depl" +
      "oyed_model_id\030\002 \001(\t\0226\n\005model\030\003 \001(\tB\'\340A\003\372" +
      "A!\n\037aiplatform.googleapis.com/Model\022\037\n\022m" +
      "odel_display_name\030\004 \001(\tB\003\340A\003\"z\n\021RawPredi" +
      "ctRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n\"aip" +
      "latform.googleapis.com/Endpoint\022\'\n\thttp_" +
      "body\030\002 \001(\0132\024.google.api.HttpBody\"\242\002\n\016Exp" +
      "lainRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n\"a" +
      "iplatform.googleapis.com/Endpoint\022.\n\tins" +
      "tances\030\002 \003(\0132\026.google.protobuf.ValueB\003\340A" +
      "\002\022*\n\nparameters\030\004 \001(\0132\026.google.protobuf." +
      "Value\022[\n\031explanation_spec_override\030\005 \001(\013" +
      "28.google.cloud.aiplatform.v1beta1.Expla" +
      "nationSpecOverride\022\031\n\021deployed_model_id\030" +
      "\003 \001(\t\"\235\001\n\017ExplainResponse\022B\n\014explanation" +
      "s\030\001 \003(\0132,.google.cloud.aiplatform.v1beta" +
      "1.Explanation\022\031\n\021deployed_model_id\030\002 \001(\t" +
      "\022+\n\013predictions\030\003 \003(\0132\026.google.protobuf." +
      "Value2\344\005\n\021PredictionService\022\327\001\n\007Predict\022" +
      "/.google.cloud.aiplatform.v1beta1.Predic" +
      "tRequest\0320.google.cloud.aiplatform.v1bet" +
      "a1.PredictResponse\"i\202\323\344\223\002C\">/v1beta1/{en" +
      "dpoint=projects/*/locations/*/endpoints/" +
      "*}:predict:\001*\332A\035endpoint,instances,param" +
      "eters\022\271\001\n\nRawPredict\0222.google.cloud.aipl" +
      "atform.v1beta1.RawPredictRequest\032\024.googl" +
      "e.api.HttpBody\"a\202\323\344\223\002F\"A/v1beta1/{endpoi" +
      "nt=projects/*/locations/*/endpoints/*}:r" +
      "awPredict:\001*\332A\022endpoint,http_body\022\351\001\n\007Ex" +
      "plain\022/.google.cloud.aiplatform.v1beta1." +
      "ExplainRequest\0320.google.cloud.aiplatform" +
      ".v1beta1.ExplainResponse\"{\202\323\344\223\002C\">/v1bet" +
      "a1/{endpoint=projects/*/locations/*/endp" +
      "oints/*}:explain:\001*\332A/endpoint,instances" +
      ",parameters,deployed_model_id\032M\312A\031aiplat" +
      "form.googleapis.com\322A.https://www.google" +
      "apis.com/auth/cloud-platformB\363\001\n#com.goo" +
      "gle.cloud.aiplatform.v1beta1B\026Prediction" +
      "ServiceProtoP\001ZIgoogle.golang.org/genpro" +
      "to/googleapis/cloud/aiplatform/v1beta1;a" +
      "iplatform\252\002\037Google.Cloud.AIPlatform.V1Be" +
      "ta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"" +
      "Google::Cloud::AIPlatform::V1beta1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.HttpBodyProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Instances", "Parameters", });
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor,
        new java.lang.String[] { "Predictions", "DeployedModelId", "Model", "ModelDisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor,
        new java.lang.String[] { "Endpoint", "HttpBody", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Instances", "Parameters", "ExplanationSpecOverride", "DeployedModelId", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor,
        new java.lang.String[] { "Explanations", "DeployedModelId", "Predictions", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
