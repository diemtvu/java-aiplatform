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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Example-based explainability that returns the nearest neighbors from the
 * provided dataset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.Examples}
 */
public final class Examples extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.Examples)
    ExamplesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Examples.newBuilder() to construct.
  private Examples(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Examples() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Examples();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Examples(
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
          case 10:
            {
              com.google.cloud.aiplatform.v1beta1.GcsSource.Builder subBuilder = null;
              if (gcsSource_ != null) {
                subBuilder = gcsSource_.toBuilder();
              }
              gcsSource_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.GcsSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gcsSource_);
                gcsSource_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Value.Builder subBuilder = null;
              if (nearestNeighborSearchConfig_ != null) {
                subBuilder = nearestNeighborSearchConfig_.toBuilder();
              }
              nearestNeighborSearchConfig_ =
                  input.readMessage(com.google.protobuf.Value.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(nearestNeighborSearchConfig_);
                nearestNeighborSearchConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              neighborCount_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1beta1_Examples_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.Examples.class,
            com.google.cloud.aiplatform.v1beta1.Examples.Builder.class);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.GcsSource gcsSource_;
  /**
   *
   *
   * <pre>
   * The Cloud Storage location for the input instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return gcsSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The Cloud Storage location for the input instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GcsSource getGcsSource() {
    return gcsSource_ == null
        ? com.google.cloud.aiplatform.v1beta1.GcsSource.getDefaultInstance()
        : gcsSource_;
  }
  /**
   *
   *
   * <pre>
   * The Cloud Storage location for the input instances.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    return getGcsSource();
  }

  public static final int NEAREST_NEIGHBOR_SEARCH_CONFIG_FIELD_NUMBER = 2;
  private com.google.protobuf.Value nearestNeighborSearchConfig_;
  /**
   *
   *
   * <pre>
   * The configuration for the generated index, the semantics are the same as
   * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
   * </pre>
   *
   * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
   *
   * @return Whether the nearestNeighborSearchConfig field is set.
   */
  @java.lang.Override
  public boolean hasNearestNeighborSearchConfig() {
    return nearestNeighborSearchConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * The configuration for the generated index, the semantics are the same as
   * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
   * </pre>
   *
   * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
   *
   * @return The nearestNeighborSearchConfig.
   */
  @java.lang.Override
  public com.google.protobuf.Value getNearestNeighborSearchConfig() {
    return nearestNeighborSearchConfig_ == null
        ? com.google.protobuf.Value.getDefaultInstance()
        : nearestNeighborSearchConfig_;
  }
  /**
   *
   *
   * <pre>
   * The configuration for the generated index, the semantics are the same as
   * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
   * </pre>
   *
   * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getNearestNeighborSearchConfigOrBuilder() {
    return getNearestNeighborSearchConfig();
  }

  public static final int NEIGHBOR_COUNT_FIELD_NUMBER = 3;
  private int neighborCount_;
  /**
   *
   *
   * <pre>
   * The number of neighbors to return.
   * </pre>
   *
   * <code>int32 neighbor_count = 3;</code>
   *
   * @return The neighborCount.
   */
  @java.lang.Override
  public int getNeighborCount() {
    return neighborCount_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (gcsSource_ != null) {
      output.writeMessage(1, getGcsSource());
    }
    if (nearestNeighborSearchConfig_ != null) {
      output.writeMessage(2, getNearestNeighborSearchConfig());
    }
    if (neighborCount_ != 0) {
      output.writeInt32(3, neighborCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcsSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcsSource());
    }
    if (nearestNeighborSearchConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getNearestNeighborSearchConfig());
    }
    if (neighborCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, neighborCount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.Examples)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.Examples other =
        (com.google.cloud.aiplatform.v1beta1.Examples) obj;

    if (hasGcsSource() != other.hasGcsSource()) return false;
    if (hasGcsSource()) {
      if (!getGcsSource().equals(other.getGcsSource())) return false;
    }
    if (hasNearestNeighborSearchConfig() != other.hasNearestNeighborSearchConfig()) return false;
    if (hasNearestNeighborSearchConfig()) {
      if (!getNearestNeighborSearchConfig().equals(other.getNearestNeighborSearchConfig()))
        return false;
    }
    if (getNeighborCount() != other.getNeighborCount()) return false;
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
    if (hasGcsSource()) {
      hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGcsSource().hashCode();
    }
    if (hasNearestNeighborSearchConfig()) {
      hash = (37 * hash) + NEAREST_NEIGHBOR_SEARCH_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getNearestNeighborSearchConfig().hashCode();
    }
    hash = (37 * hash) + NEIGHBOR_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getNeighborCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.Examples prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Example-based explainability that returns the nearest neighbors from the
   * provided dataset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.Examples}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.Examples)
      com.google.cloud.aiplatform.v1beta1.ExamplesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_Examples_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.Examples.class,
              com.google.cloud.aiplatform.v1beta1.Examples.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.Examples.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }
      if (nearestNeighborSearchConfigBuilder_ == null) {
        nearestNeighborSearchConfig_ = null;
      } else {
        nearestNeighborSearchConfig_ = null;
        nearestNeighborSearchConfigBuilder_ = null;
      }
      neighborCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_Examples_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Examples getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.Examples.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Examples build() {
      com.google.cloud.aiplatform.v1beta1.Examples result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Examples buildPartial() {
      com.google.cloud.aiplatform.v1beta1.Examples result =
          new com.google.cloud.aiplatform.v1beta1.Examples(this);
      if (gcsSourceBuilder_ == null) {
        result.gcsSource_ = gcsSource_;
      } else {
        result.gcsSource_ = gcsSourceBuilder_.build();
      }
      if (nearestNeighborSearchConfigBuilder_ == null) {
        result.nearestNeighborSearchConfig_ = nearestNeighborSearchConfig_;
      } else {
        result.nearestNeighborSearchConfig_ = nearestNeighborSearchConfigBuilder_.build();
      }
      result.neighborCount_ = neighborCount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.Examples) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.Examples) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.Examples other) {
      if (other == com.google.cloud.aiplatform.v1beta1.Examples.getDefaultInstance()) return this;
      if (other.hasGcsSource()) {
        mergeGcsSource(other.getGcsSource());
      }
      if (other.hasNearestNeighborSearchConfig()) {
        mergeNearestNeighborSearchConfig(other.getNearestNeighborSearchConfig());
      }
      if (other.getNeighborCount() != 0) {
        setNeighborCount(other.getNeighborCount());
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
      com.google.cloud.aiplatform.v1beta1.Examples parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.Examples) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.GcsSource gcsSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.GcsSource,
            com.google.cloud.aiplatform.v1beta1.GcsSource.Builder,
            com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     *
     * @return Whether the gcsSource field is set.
     */
    public boolean hasGcsSource() {
      return gcsSourceBuilder_ != null || gcsSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     *
     * @return The gcsSource.
     */
    public com.google.cloud.aiplatform.v1beta1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        return gcsSource_ == null
            ? com.google.cloud.aiplatform.v1beta1.GcsSource.getDefaultInstance()
            : gcsSource_;
      } else {
        return gcsSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.aiplatform.v1beta1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsSource_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(
        com.google.cloud.aiplatform.v1beta1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.aiplatform.v1beta1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (gcsSource_ != null) {
          gcsSource_ =
              com.google.cloud.aiplatform.v1beta1.GcsSource.newBuilder(gcsSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gcsSource_ = value;
        }
        onChanged();
      } else {
        gcsSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
        onChanged();
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GcsSource.Builder getGcsSourceBuilder() {

      onChanged();
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if (gcsSourceBuilder_ != null) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        return gcsSource_ == null
            ? com.google.cloud.aiplatform.v1beta1.GcsSource.getDefaultInstance()
            : gcsSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Storage location for the input instances.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.GcsSource,
            com.google.cloud.aiplatform.v1beta1.GcsSource.Builder,
            com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.GcsSource,
                com.google.cloud.aiplatform.v1beta1.GcsSource.Builder,
                com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder>(
                getGcsSource(), getParentForChildren(), isClean());
        gcsSource_ = null;
      }
      return gcsSourceBuilder_;
    }

    private com.google.protobuf.Value nearestNeighborSearchConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        nearestNeighborSearchConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     *
     * @return Whether the nearestNeighborSearchConfig field is set.
     */
    public boolean hasNearestNeighborSearchConfig() {
      return nearestNeighborSearchConfigBuilder_ != null || nearestNeighborSearchConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     *
     * @return The nearestNeighborSearchConfig.
     */
    public com.google.protobuf.Value getNearestNeighborSearchConfig() {
      if (nearestNeighborSearchConfigBuilder_ == null) {
        return nearestNeighborSearchConfig_ == null
            ? com.google.protobuf.Value.getDefaultInstance()
            : nearestNeighborSearchConfig_;
      } else {
        return nearestNeighborSearchConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     */
    public Builder setNearestNeighborSearchConfig(com.google.protobuf.Value value) {
      if (nearestNeighborSearchConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nearestNeighborSearchConfig_ = value;
        onChanged();
      } else {
        nearestNeighborSearchConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     */
    public Builder setNearestNeighborSearchConfig(
        com.google.protobuf.Value.Builder builderForValue) {
      if (nearestNeighborSearchConfigBuilder_ == null) {
        nearestNeighborSearchConfig_ = builderForValue.build();
        onChanged();
      } else {
        nearestNeighborSearchConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     */
    public Builder mergeNearestNeighborSearchConfig(com.google.protobuf.Value value) {
      if (nearestNeighborSearchConfigBuilder_ == null) {
        if (nearestNeighborSearchConfig_ != null) {
          nearestNeighborSearchConfig_ =
              com.google.protobuf.Value.newBuilder(nearestNeighborSearchConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          nearestNeighborSearchConfig_ = value;
        }
        onChanged();
      } else {
        nearestNeighborSearchConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     */
    public Builder clearNearestNeighborSearchConfig() {
      if (nearestNeighborSearchConfigBuilder_ == null) {
        nearestNeighborSearchConfig_ = null;
        onChanged();
      } else {
        nearestNeighborSearchConfig_ = null;
        nearestNeighborSearchConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     */
    public com.google.protobuf.Value.Builder getNearestNeighborSearchConfigBuilder() {

      onChanged();
      return getNearestNeighborSearchConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     */
    public com.google.protobuf.ValueOrBuilder getNearestNeighborSearchConfigOrBuilder() {
      if (nearestNeighborSearchConfigBuilder_ != null) {
        return nearestNeighborSearchConfigBuilder_.getMessageOrBuilder();
      } else {
        return nearestNeighborSearchConfig_ == null
            ? com.google.protobuf.Value.getDefaultInstance()
            : nearestNeighborSearchConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The configuration for the generated index, the semantics are the same as
     * [metadata][google.cloud.aiplatform.v1beta1.Index.metadata] and should match NearestNeighborSearchConfig.
     * </pre>
     *
     * <code>.google.protobuf.Value nearest_neighbor_search_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value,
            com.google.protobuf.Value.Builder,
            com.google.protobuf.ValueOrBuilder>
        getNearestNeighborSearchConfigFieldBuilder() {
      if (nearestNeighborSearchConfigBuilder_ == null) {
        nearestNeighborSearchConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Value,
                com.google.protobuf.Value.Builder,
                com.google.protobuf.ValueOrBuilder>(
                getNearestNeighborSearchConfig(), getParentForChildren(), isClean());
        nearestNeighborSearchConfig_ = null;
      }
      return nearestNeighborSearchConfigBuilder_;
    }

    private int neighborCount_;
    /**
     *
     *
     * <pre>
     * The number of neighbors to return.
     * </pre>
     *
     * <code>int32 neighbor_count = 3;</code>
     *
     * @return The neighborCount.
     */
    @java.lang.Override
    public int getNeighborCount() {
      return neighborCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of neighbors to return.
     * </pre>
     *
     * <code>int32 neighbor_count = 3;</code>
     *
     * @param value The neighborCount to set.
     * @return This builder for chaining.
     */
    public Builder setNeighborCount(int value) {

      neighborCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of neighbors to return.
     * </pre>
     *
     * <code>int32 neighbor_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNeighborCount() {

      neighborCount_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.Examples)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.Examples)
  private static final com.google.cloud.aiplatform.v1beta1.Examples DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.Examples();
  }

  public static com.google.cloud.aiplatform.v1beta1.Examples getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Examples> PARSER =
      new com.google.protobuf.AbstractParser<Examples>() {
        @java.lang.Override
        public Examples parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Examples(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Examples> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Examples> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Examples getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
