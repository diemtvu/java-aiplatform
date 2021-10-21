// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/feature_selector.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Matcher for Features of an EntityType by Feature ID.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.IdMatcher}
 */
public final class IdMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.IdMatcher)
    IdMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdMatcher.newBuilder() to construct.
  private IdMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdMatcher() {
    ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IdMatcher(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            ids_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ids_ = ids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_IdMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_IdMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.IdMatcher.class, com.google.cloud.aiplatform.v1.IdMatcher.Builder.class);
  }

  public static final int IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList ids_;
  /**
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the ids.
   */
  public com.google.protobuf.ProtocolStringList
      getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of ids.
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  public java.lang.String getIds(int index) {
    return ids_.get(index);
  }
  /**
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  public com.google.protobuf.ByteString
      getIdsBytes(int index) {
    return ids_.getByteString(index);
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
    for (int i = 0; i < ids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ids_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += computeStringSizeNoTag(ids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdsList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.IdMatcher)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.IdMatcher other = (com.google.cloud.aiplatform.v1.IdMatcher) obj;

    if (!getIdsList()
        .equals(other.getIdsList())) return false;
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
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.IdMatcher parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.IdMatcher prototype) {
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
   * Matcher for Features of an EntityType by Feature ID.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.IdMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.IdMatcher)
      com.google.cloud.aiplatform.v1.IdMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_IdMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_IdMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.IdMatcher.class, com.google.cloud.aiplatform.v1.IdMatcher.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.IdMatcher.newBuilder()
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
      ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeatureSelectorProto.internal_static_google_cloud_aiplatform_v1_IdMatcher_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.IdMatcher getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.IdMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.IdMatcher build() {
      com.google.cloud.aiplatform.v1.IdMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.IdMatcher buildPartial() {
      com.google.cloud.aiplatform.v1.IdMatcher result = new com.google.cloud.aiplatform.v1.IdMatcher(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ids_ = ids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ids_ = ids_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.IdMatcher) {
        return mergeFrom((com.google.cloud.aiplatform.v1.IdMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.IdMatcher other) {
      if (other == com.google.cloud.aiplatform.v1.IdMatcher.getDefaultInstance()) return this;
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
        }
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
      com.google.cloud.aiplatform.v1.IdMatcher parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.IdMatcher) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ids_ = new com.google.protobuf.LazyStringArrayList(ids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the ids.
     */
    public com.google.protobuf.ProtocolStringList
        getIdsList() {
      return ids_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of ids.
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The ids at the given index.
     */
    public java.lang.String getIds(int index) {
      return ids_.get(index);
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the ids at the given index.
     */
    public com.google.protobuf.ByteString
        getIdsBytes(int index) {
      return ids_.getByteString(index);
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
      ids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The ids to add.
     * @return This builder for chaining.
     */
    public Builder addIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
      ids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The ids to add.
     * @return This builder for chaining.
     */
    public Builder addAllIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The following are accepted as `ids`:
     *  * A single-element list containing only `*`, which selects all Features
     *  in the target EntityType, or
     *  * A list containing only Feature IDs, which selects only Features with
     *  those IDs in the target EntityType.
     * </pre>
     *
     * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the ids to add.
     * @return This builder for chaining.
     */
    public Builder addIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureIdsIsMutable();
      ids_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.IdMatcher)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.IdMatcher)
  private static final com.google.cloud.aiplatform.v1.IdMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.IdMatcher();
  }

  public static com.google.cloud.aiplatform.v1.IdMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdMatcher>
      PARSER = new com.google.protobuf.AbstractParser<IdMatcher>() {
    @java.lang.Override
    public IdMatcher parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IdMatcher(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IdMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.IdMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

