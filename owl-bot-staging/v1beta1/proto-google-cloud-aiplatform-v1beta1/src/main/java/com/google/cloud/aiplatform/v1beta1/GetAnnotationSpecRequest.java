// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for [DatasetService.GetAnnotationSpec][google.cloud.aiplatform.v1beta1.DatasetService.GetAnnotationSpec].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest}
 */
public final class GetAnnotationSpecRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest)
    GetAnnotationSpecRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAnnotationSpecRequest.newBuilder() to construct.
  private GetAnnotationSpecRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAnnotationSpecRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAnnotationSpecRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAnnotationSpecRequest(
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

            name_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (readMask_ != null) {
              subBuilder = readMask_.toBuilder();
            }
            readMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(readMask_);
              readMask_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_GetAnnotationSpecRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_GetAnnotationSpecRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest.class, com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The name of the AnnotationSpec resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the AnnotationSpec resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask readMask_;
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   * @return Whether the readMask field is set.
   */
  @java.lang.Override
  public boolean hasReadMask() {
    return readMask_ != null;
  }
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   * @return The readMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getReadMask() {
    return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
  }
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
    return getReadMask();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (readMask_ != null) {
      output.writeMessage(2, getReadMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (readMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReadMask());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest other = (com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasReadMask() != other.hasReadMask()) return false;
    if (hasReadMask()) {
      if (!getReadMask()
          .equals(other.getReadMask())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasReadMask()) {
      hash = (37 * hash) + READ_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getReadMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest prototype) {
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
   * Request message for [DatasetService.GetAnnotationSpec][google.cloud.aiplatform.v1beta1.DatasetService.GetAnnotationSpec].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest)
      com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_GetAnnotationSpecRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_GetAnnotationSpecRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest.class, com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest.newBuilder()
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
      name_ = "";

      if (readMaskBuilder_ == null) {
        readMask_ = null;
      } else {
        readMask_ = null;
        readMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_GetAnnotationSpecRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest build() {
      com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest result = new com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest(this);
      result.name_ = name_;
      if (readMaskBuilder_ == null) {
        result.readMask_ = readMask_;
      } else {
        result.readMask_ = readMaskBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasReadMask()) {
        mergeReadMask(other.getReadMask());
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
      com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The name of the AnnotationSpec resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the AnnotationSpec resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the AnnotationSpec resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the AnnotationSpec resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the AnnotationSpec resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask readMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> readMaskBuilder_;
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     * @return Whether the readMask field is set.
     */
    public boolean hasReadMask() {
      return readMaskBuilder_ != null || readMask_ != null;
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     * @return The readMask.
     */
    public com.google.protobuf.FieldMask getReadMask() {
      if (readMaskBuilder_ == null) {
        return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      } else {
        return readMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     */
    public Builder setReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readMask_ = value;
        onChanged();
      } else {
        readMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     */
    public Builder setReadMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (readMaskBuilder_ == null) {
        readMask_ = builderForValue.build();
        onChanged();
      } else {
        readMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     */
    public Builder mergeReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (readMask_ != null) {
          readMask_ =
            com.google.protobuf.FieldMask.newBuilder(readMask_).mergeFrom(value).buildPartial();
        } else {
          readMask_ = value;
        }
        onChanged();
      } else {
        readMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     */
    public Builder clearReadMask() {
      if (readMaskBuilder_ == null) {
        readMask_ = null;
        onChanged();
      } else {
        readMask_ = null;
        readMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getReadMaskBuilder() {
      
      onChanged();
      return getReadMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
      if (readMaskBuilder_ != null) {
        return readMaskBuilder_.getMessageOrBuilder();
      } else {
        return readMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      }
    }
    /**
     * <pre>
     * Mask specifying which fields to read.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getReadMaskFieldBuilder() {
      if (readMaskBuilder_ == null) {
        readMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getReadMask(),
                getParentForChildren(),
                isClean());
        readMask_ = null;
      }
      return readMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest)
  private static final com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAnnotationSpecRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetAnnotationSpecRequest>() {
    @java.lang.Override
    public GetAnnotationSpecRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAnnotationSpecRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAnnotationSpecRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAnnotationSpecRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GetAnnotationSpecRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

