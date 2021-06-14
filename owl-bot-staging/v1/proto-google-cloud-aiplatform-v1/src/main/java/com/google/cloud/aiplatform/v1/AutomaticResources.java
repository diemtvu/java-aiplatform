// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/machine_resources.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * A description of resources that to large degree are decided by Vertex AI,
 * and require only a modest additional configuration.
 * Each Model supporting these resources documents its specific guidelines.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.AutomaticResources}
 */
public final class AutomaticResources extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.AutomaticResources)
    AutomaticResourcesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutomaticResources.newBuilder() to construct.
  private AutomaticResources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutomaticResources() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutomaticResources();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AutomaticResources(
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
          case 8: {

            minReplicaCount_ = input.readInt32();
            break;
          }
          case 16: {

            maxReplicaCount_ = input.readInt32();
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
    return com.google.cloud.aiplatform.v1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1_AutomaticResources_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1_AutomaticResources_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.AutomaticResources.class, com.google.cloud.aiplatform.v1.AutomaticResources.Builder.class);
  }

  public static final int MIN_REPLICA_COUNT_FIELD_NUMBER = 1;
  private int minReplicaCount_;
  /**
   * <pre>
   * Immutable. The minimum number of replicas this DeployedModel will be always deployed
   * on. If traffic against it increases, it may dynamically be deployed onto
   * more replicas up to [max_replica_count][google.cloud.aiplatform.v1.AutomaticResources.max_replica_count], and as traffic decreases, some
   * of these extra replicas may be freed.
   * If the requested value is too large, the deployment will error.
   * </pre>
   *
   * <code>int32 min_replica_count = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The minReplicaCount.
   */
  @java.lang.Override
  public int getMinReplicaCount() {
    return minReplicaCount_;
  }

  public static final int MAX_REPLICA_COUNT_FIELD_NUMBER = 2;
  private int maxReplicaCount_;
  /**
   * <pre>
   * Immutable. The maximum number of replicas this DeployedModel may be deployed on when
   * the traffic against it increases. If the requested value is too large,
   * the deployment will error, but if deployment succeeds then the ability
   * to scale the model to that many replicas is guaranteed (barring service
   * outages). If traffic against the DeployedModel increases beyond what its
   * replicas at maximum may handle, a portion of the traffic will be dropped.
   * If this value is not provided, a no upper bound for scaling under heavy
   * traffic will be assume, though Vertex AI may be unable to scale beyond
   * certain replica number.
   * </pre>
   *
   * <code>int32 max_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The maxReplicaCount.
   */
  @java.lang.Override
  public int getMaxReplicaCount() {
    return maxReplicaCount_;
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
    if (minReplicaCount_ != 0) {
      output.writeInt32(1, minReplicaCount_);
    }
    if (maxReplicaCount_ != 0) {
      output.writeInt32(2, maxReplicaCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minReplicaCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, minReplicaCount_);
    }
    if (maxReplicaCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxReplicaCount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.AutomaticResources)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.AutomaticResources other = (com.google.cloud.aiplatform.v1.AutomaticResources) obj;

    if (getMinReplicaCount()
        != other.getMinReplicaCount()) return false;
    if (getMaxReplicaCount()
        != other.getMaxReplicaCount()) return false;
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
    hash = (37 * hash) + MIN_REPLICA_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinReplicaCount();
    hash = (37 * hash) + MAX_REPLICA_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxReplicaCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.AutomaticResources parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.AutomaticResources prototype) {
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
   * A description of resources that to large degree are decided by Vertex AI,
   * and require only a modest additional configuration.
   * Each Model supporting these resources documents its specific guidelines.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.AutomaticResources}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.AutomaticResources)
      com.google.cloud.aiplatform.v1.AutomaticResourcesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1_AutomaticResources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1_AutomaticResources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.AutomaticResources.class, com.google.cloud.aiplatform.v1.AutomaticResources.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.AutomaticResources.newBuilder()
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
      minReplicaCount_ = 0;

      maxReplicaCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto.internal_static_google_cloud_aiplatform_v1_AutomaticResources_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AutomaticResources getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.AutomaticResources.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AutomaticResources build() {
      com.google.cloud.aiplatform.v1.AutomaticResources result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AutomaticResources buildPartial() {
      com.google.cloud.aiplatform.v1.AutomaticResources result = new com.google.cloud.aiplatform.v1.AutomaticResources(this);
      result.minReplicaCount_ = minReplicaCount_;
      result.maxReplicaCount_ = maxReplicaCount_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.AutomaticResources) {
        return mergeFrom((com.google.cloud.aiplatform.v1.AutomaticResources)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.AutomaticResources other) {
      if (other == com.google.cloud.aiplatform.v1.AutomaticResources.getDefaultInstance()) return this;
      if (other.getMinReplicaCount() != 0) {
        setMinReplicaCount(other.getMinReplicaCount());
      }
      if (other.getMaxReplicaCount() != 0) {
        setMaxReplicaCount(other.getMaxReplicaCount());
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
      com.google.cloud.aiplatform.v1.AutomaticResources parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.AutomaticResources) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int minReplicaCount_ ;
    /**
     * <pre>
     * Immutable. The minimum number of replicas this DeployedModel will be always deployed
     * on. If traffic against it increases, it may dynamically be deployed onto
     * more replicas up to [max_replica_count][google.cloud.aiplatform.v1.AutomaticResources.max_replica_count], and as traffic decreases, some
     * of these extra replicas may be freed.
     * If the requested value is too large, the deployment will error.
     * </pre>
     *
     * <code>int32 min_replica_count = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The minReplicaCount.
     */
    @java.lang.Override
    public int getMinReplicaCount() {
      return minReplicaCount_;
    }
    /**
     * <pre>
     * Immutable. The minimum number of replicas this DeployedModel will be always deployed
     * on. If traffic against it increases, it may dynamically be deployed onto
     * more replicas up to [max_replica_count][google.cloud.aiplatform.v1.AutomaticResources.max_replica_count], and as traffic decreases, some
     * of these extra replicas may be freed.
     * If the requested value is too large, the deployment will error.
     * </pre>
     *
     * <code>int32 min_replica_count = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The minReplicaCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinReplicaCount(int value) {
      
      minReplicaCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The minimum number of replicas this DeployedModel will be always deployed
     * on. If traffic against it increases, it may dynamically be deployed onto
     * more replicas up to [max_replica_count][google.cloud.aiplatform.v1.AutomaticResources.max_replica_count], and as traffic decreases, some
     * of these extra replicas may be freed.
     * If the requested value is too large, the deployment will error.
     * </pre>
     *
     * <code>int32 min_replica_count = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinReplicaCount() {
      
      minReplicaCount_ = 0;
      onChanged();
      return this;
    }

    private int maxReplicaCount_ ;
    /**
     * <pre>
     * Immutable. The maximum number of replicas this DeployedModel may be deployed on when
     * the traffic against it increases. If the requested value is too large,
     * the deployment will error, but if deployment succeeds then the ability
     * to scale the model to that many replicas is guaranteed (barring service
     * outages). If traffic against the DeployedModel increases beyond what its
     * replicas at maximum may handle, a portion of the traffic will be dropped.
     * If this value is not provided, a no upper bound for scaling under heavy
     * traffic will be assume, though Vertex AI may be unable to scale beyond
     * certain replica number.
     * </pre>
     *
     * <code>int32 max_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The maxReplicaCount.
     */
    @java.lang.Override
    public int getMaxReplicaCount() {
      return maxReplicaCount_;
    }
    /**
     * <pre>
     * Immutable. The maximum number of replicas this DeployedModel may be deployed on when
     * the traffic against it increases. If the requested value is too large,
     * the deployment will error, but if deployment succeeds then the ability
     * to scale the model to that many replicas is guaranteed (barring service
     * outages). If traffic against the DeployedModel increases beyond what its
     * replicas at maximum may handle, a portion of the traffic will be dropped.
     * If this value is not provided, a no upper bound for scaling under heavy
     * traffic will be assume, though Vertex AI may be unable to scale beyond
     * certain replica number.
     * </pre>
     *
     * <code>int32 max_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The maxReplicaCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxReplicaCount(int value) {
      
      maxReplicaCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The maximum number of replicas this DeployedModel may be deployed on when
     * the traffic against it increases. If the requested value is too large,
     * the deployment will error, but if deployment succeeds then the ability
     * to scale the model to that many replicas is guaranteed (barring service
     * outages). If traffic against the DeployedModel increases beyond what its
     * replicas at maximum may handle, a portion of the traffic will be dropped.
     * If this value is not provided, a no upper bound for scaling under heavy
     * traffic will be assume, though Vertex AI may be unable to scale beyond
     * certain replica number.
     * </pre>
     *
     * <code>int32 max_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxReplicaCount() {
      
      maxReplicaCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.AutomaticResources)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.AutomaticResources)
  private static final com.google.cloud.aiplatform.v1.AutomaticResources DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.AutomaticResources();
  }

  public static com.google.cloud.aiplatform.v1.AutomaticResources getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutomaticResources>
      PARSER = new com.google.protobuf.AbstractParser<AutomaticResources>() {
    @java.lang.Override
    public AutomaticResources parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AutomaticResources(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AutomaticResources> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutomaticResources> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.AutomaticResources getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

