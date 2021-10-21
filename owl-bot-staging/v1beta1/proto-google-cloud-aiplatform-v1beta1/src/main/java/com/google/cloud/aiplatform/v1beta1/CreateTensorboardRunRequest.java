// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for [TensorboardService.CreateTensorboardRun][google.cloud.aiplatform.v1beta1.TensorboardService.CreateTensorboardRun].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest}
 */
public final class CreateTensorboardRunRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest)
    CreateTensorboardRunRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTensorboardRunRequest.newBuilder() to construct.
  private CreateTensorboardRunRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTensorboardRunRequest() {
    parent_ = "";
    tensorboardRunId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTensorboardRunRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateTensorboardRunRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder subBuilder = null;
            if (tensorboardRun_ != null) {
              subBuilder = tensorboardRun_.toBuilder();
            }
            tensorboardRun_ = input.readMessage(com.google.cloud.aiplatform.v1beta1.TensorboardRun.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tensorboardRun_);
              tensorboardRun_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            tensorboardRunId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateTensorboardRunRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateTensorboardRunRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest.class, com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The resource name of the TensorboardExperiment to create the TensorboardRun
   * in. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the TensorboardExperiment to create the TensorboardRun
   * in. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENSORBOARD_RUN_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboardRun_;
  /**
   * <pre>
   * Required. The TensorboardRun to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tensorboardRun field is set.
   */
  @java.lang.Override
  public boolean hasTensorboardRun() {
    return tensorboardRun_ != null;
  }
  /**
   * <pre>
   * Required. The TensorboardRun to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorboardRun.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardRun getTensorboardRun() {
    return tensorboardRun_ == null ? com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance() : tensorboardRun_;
  }
  /**
   * <pre>
   * Required. The TensorboardRun to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder getTensorboardRunOrBuilder() {
    return getTensorboardRun();
  }

  public static final int TENSORBOARD_RUN_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object tensorboardRunId_;
  /**
   * <pre>
   * Required. The ID to use for the Tensorboard run, which will become the final
   * component of the Tensorboard run's resource name.
   * This value should be 1-128 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string tensorboard_run_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorboardRunId.
   */
  @java.lang.Override
  public java.lang.String getTensorboardRunId() {
    java.lang.Object ref = tensorboardRunId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tensorboardRunId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the Tensorboard run, which will become the final
   * component of the Tensorboard run's resource name.
   * This value should be 1-128 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string tensorboard_run_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tensorboardRunId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTensorboardRunIdBytes() {
    java.lang.Object ref = tensorboardRunId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tensorboardRunId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (tensorboardRun_ != null) {
      output.writeMessage(2, getTensorboardRun());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tensorboardRunId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tensorboardRunId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (tensorboardRun_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTensorboardRun());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tensorboardRunId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tensorboardRunId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest other = (com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasTensorboardRun() != other.hasTensorboardRun()) return false;
    if (hasTensorboardRun()) {
      if (!getTensorboardRun()
          .equals(other.getTensorboardRun())) return false;
    }
    if (!getTensorboardRunId()
        .equals(other.getTensorboardRunId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasTensorboardRun()) {
      hash = (37 * hash) + TENSORBOARD_RUN_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardRun().hashCode();
    }
    hash = (37 * hash) + TENSORBOARD_RUN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTensorboardRunId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for [TensorboardService.CreateTensorboardRun][google.cloud.aiplatform.v1beta1.TensorboardService.CreateTensorboardRun].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest)
      com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateTensorboardRunRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateTensorboardRunRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest.class, com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (tensorboardRunBuilder_ == null) {
        tensorboardRun_ = null;
      } else {
        tensorboardRun_ = null;
        tensorboardRunBuilder_ = null;
      }
      tensorboardRunId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateTensorboardRunRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest result = new com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest(this);
      result.parent_ = parent_;
      if (tensorboardRunBuilder_ == null) {
        result.tensorboardRun_ = tensorboardRun_;
      } else {
        result.tensorboardRun_ = tensorboardRunBuilder_.build();
      }
      result.tensorboardRunId_ = tensorboardRunId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasTensorboardRun()) {
        mergeTensorboardRun(other.getTensorboardRun());
      }
      if (!other.getTensorboardRunId().isEmpty()) {
        tensorboardRunId_ = other.tensorboardRunId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the TensorboardExperiment to create the TensorboardRun
     * in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the TensorboardExperiment to create the TensorboardRun
     * in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the TensorboardExperiment to create the TensorboardRun
     * in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the TensorboardExperiment to create the TensorboardRun
     * in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the TensorboardExperiment to create the TensorboardRun
     * in. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboardRun_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.TensorboardRun, com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder, com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder> tensorboardRunBuilder_;
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tensorboardRun field is set.
     */
    public boolean hasTensorboardRun() {
      return tensorboardRunBuilder_ != null || tensorboardRun_ != null;
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tensorboardRun.
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun getTensorboardRun() {
      if (tensorboardRunBuilder_ == null) {
        return tensorboardRun_ == null ? com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance() : tensorboardRun_;
      } else {
        return tensorboardRunBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTensorboardRun(com.google.cloud.aiplatform.v1beta1.TensorboardRun value) {
      if (tensorboardRunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensorboardRun_ = value;
        onChanged();
      } else {
        tensorboardRunBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTensorboardRun(
        com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunBuilder_ == null) {
        tensorboardRun_ = builderForValue.build();
        onChanged();
      } else {
        tensorboardRunBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTensorboardRun(com.google.cloud.aiplatform.v1beta1.TensorboardRun value) {
      if (tensorboardRunBuilder_ == null) {
        if (tensorboardRun_ != null) {
          tensorboardRun_ =
            com.google.cloud.aiplatform.v1beta1.TensorboardRun.newBuilder(tensorboardRun_).mergeFrom(value).buildPartial();
        } else {
          tensorboardRun_ = value;
        }
        onChanged();
      } else {
        tensorboardRunBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTensorboardRun() {
      if (tensorboardRunBuilder_ == null) {
        tensorboardRun_ = null;
        onChanged();
      } else {
        tensorboardRun_ = null;
        tensorboardRunBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder getTensorboardRunBuilder() {
      
      onChanged();
      return getTensorboardRunFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder getTensorboardRunOrBuilder() {
      if (tensorboardRunBuilder_ != null) {
        return tensorboardRunBuilder_.getMessageOrBuilder();
      } else {
        return tensorboardRun_ == null ?
            com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance() : tensorboardRun_;
      }
    }
    /**
     * <pre>
     * Required. The TensorboardRun to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_run = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.TensorboardRun, com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder, com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder> 
        getTensorboardRunFieldBuilder() {
      if (tensorboardRunBuilder_ == null) {
        tensorboardRunBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.TensorboardRun, com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder, com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>(
                getTensorboardRun(),
                getParentForChildren(),
                isClean());
        tensorboardRun_ = null;
      }
      return tensorboardRunBuilder_;
    }

    private java.lang.Object tensorboardRunId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard run, which will become the final
     * component of the Tensorboard run's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_run_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tensorboardRunId.
     */
    public java.lang.String getTensorboardRunId() {
      java.lang.Object ref = tensorboardRunId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tensorboardRunId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard run, which will become the final
     * component of the Tensorboard run's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_run_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for tensorboardRunId.
     */
    public com.google.protobuf.ByteString
        getTensorboardRunIdBytes() {
      java.lang.Object ref = tensorboardRunId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tensorboardRunId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard run, which will become the final
     * component of the Tensorboard run's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_run_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The tensorboardRunId to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardRunId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tensorboardRunId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard run, which will become the final
     * component of the Tensorboard run's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_run_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTensorboardRunId() {
      
      tensorboardRunId_ = getDefaultInstance().getTensorboardRunId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the Tensorboard run, which will become the final
     * component of the Tensorboard run's resource name.
     * This value should be 1-128 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string tensorboard_run_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for tensorboardRunId to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardRunIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tensorboardRunId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTensorboardRunRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTensorboardRunRequest>() {
    @java.lang.Override
    public CreateTensorboardRunRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateTensorboardRunRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateTensorboardRunRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTensorboardRunRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateTensorboardRunRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

