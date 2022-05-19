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
 * Preset configuration for example-based explanations
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.Preset}
 */
public final class Preset extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.Preset)
    PresetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Preset.newBuilder() to construct.
  private Preset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Preset() {
    query_ = 0;
    modality_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Preset();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Preset(
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
          case 8:
            {
              int rawValue = input.readEnum();
              bitField0_ |= 0x00000001;
              query_ = rawValue;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              modality_ = rawValue;
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
        .internal_static_google_cloud_aiplatform_v1beta1_Preset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1beta1_Preset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.Preset.class,
            com.google.cloud.aiplatform.v1beta1.Preset.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1beta1.Preset.Query}
   */
  public enum Query implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * More precise neighbors as a trade-off against slower response.
     * This is also the default value (field-number 0).
     * </pre>
     *
     * <code>PRECISE = 0;</code>
     */
    PRECISE(0),
    /**
     *
     *
     * <pre>
     * Faster response as a trade-off against less precise neighbors.
     * </pre>
     *
     * <code>FAST = 1;</code>
     */
    FAST(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * More precise neighbors as a trade-off against slower response.
     * This is also the default value (field-number 0).
     * </pre>
     *
     * <code>PRECISE = 0;</code>
     */
    public static final int PRECISE_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Faster response as a trade-off against less precise neighbors.
     * </pre>
     *
     * <code>FAST = 1;</code>
     */
    public static final int FAST_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Query valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Query forNumber(int value) {
      switch (value) {
        case 0:
          return PRECISE;
        case 1:
          return FAST;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Query> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Query> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Query>() {
          public Query findValueByNumber(int number) {
            return Query.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.Preset.getDescriptor().getEnumTypes().get(0);
    }

    private static final Query[] VALUES = values();

    public static Query valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Query(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.Preset.Query)
  }

  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for different modalities
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1beta1.Preset.Modality}
   */
  public enum Modality implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should not be set. Added as a recommended best practice for enums
     * </pre>
     *
     * <code>MODALITY_UNSPECIFIED = 0;</code>
     */
    MODALITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * IMAGE modality
     * </pre>
     *
     * <code>IMAGE = 1;</code>
     */
    IMAGE(1),
    /**
     *
     *
     * <pre>
     * TEXT modality
     * </pre>
     *
     * <code>TEXT = 2;</code>
     */
    TEXT(2),
    /**
     *
     *
     * <pre>
     * TABULAR modality
     * </pre>
     *
     * <code>TABULAR = 3;</code>
     */
    TABULAR(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should not be set. Added as a recommended best practice for enums
     * </pre>
     *
     * <code>MODALITY_UNSPECIFIED = 0;</code>
     */
    public static final int MODALITY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * IMAGE modality
     * </pre>
     *
     * <code>IMAGE = 1;</code>
     */
    public static final int IMAGE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * TEXT modality
     * </pre>
     *
     * <code>TEXT = 2;</code>
     */
    public static final int TEXT_VALUE = 2;
    /**
     *
     *
     * <pre>
     * TABULAR modality
     * </pre>
     *
     * <code>TABULAR = 3;</code>
     */
    public static final int TABULAR_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Modality valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Modality forNumber(int value) {
      switch (value) {
        case 0:
          return MODALITY_UNSPECIFIED;
        case 1:
          return IMAGE;
        case 2:
          return TEXT;
        case 3:
          return TABULAR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Modality> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Modality> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Modality>() {
          public Modality findValueByNumber(int number) {
            return Modality.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.Preset.getDescriptor().getEnumTypes().get(1);
    }

    private static final Modality[] VALUES = values();

    public static Modality valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Modality(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.Preset.Modality)
  }

  private int bitField0_;
  public static final int QUERY_FIELD_NUMBER = 1;
  private int query_;
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
   *
   * @return Whether the query field is set.
   */
  @java.lang.Override
  public boolean hasQuery() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
   *
   * @return The enum numeric value on the wire for query.
   */
  @java.lang.Override
  public int getQueryValue() {
    return query_;
  }
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for query speed-precision trade-off
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
   *
   * @return The query.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Preset.Query getQuery() {
    @SuppressWarnings("deprecation")
    com.google.cloud.aiplatform.v1beta1.Preset.Query result =
        com.google.cloud.aiplatform.v1beta1.Preset.Query.valueOf(query_);
    return result == null ? com.google.cloud.aiplatform.v1beta1.Preset.Query.UNRECOGNIZED : result;
  }

  public static final int MODALITY_FIELD_NUMBER = 2;
  private int modality_;
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for different modalities
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Preset.Modality modality = 2;</code>
   *
   * @return The enum numeric value on the wire for modality.
   */
  @java.lang.Override
  public int getModalityValue() {
    return modality_;
  }
  /**
   *
   *
   * <pre>
   * Preset option controlling parameters for different modalities
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Preset.Modality modality = 2;</code>
   *
   * @return The modality.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Preset.Modality getModality() {
    @SuppressWarnings("deprecation")
    com.google.cloud.aiplatform.v1beta1.Preset.Modality result =
        com.google.cloud.aiplatform.v1beta1.Preset.Modality.valueOf(modality_);
    return result == null
        ? com.google.cloud.aiplatform.v1beta1.Preset.Modality.UNRECOGNIZED
        : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, query_);
    }
    if (modality_
        != com.google.cloud.aiplatform.v1beta1.Preset.Modality.MODALITY_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, modality_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, query_);
    }
    if (modality_
        != com.google.cloud.aiplatform.v1beta1.Preset.Modality.MODALITY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, modality_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.Preset)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.Preset other =
        (com.google.cloud.aiplatform.v1beta1.Preset) obj;

    if (hasQuery() != other.hasQuery()) return false;
    if (hasQuery()) {
      if (query_ != other.query_) return false;
    }
    if (modality_ != other.modality_) return false;
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
    if (hasQuery()) {
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + query_;
    }
    hash = (37 * hash) + MODALITY_FIELD_NUMBER;
    hash = (53 * hash) + modality_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.Preset prototype) {
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
   * Preset configuration for example-based explanations
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.Preset}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.Preset)
      com.google.cloud.aiplatform.v1beta1.PresetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_Preset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_Preset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.Preset.class,
              com.google.cloud.aiplatform.v1beta1.Preset.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.Preset.newBuilder()
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
      query_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      modality_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_Preset_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Preset getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.Preset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Preset build() {
      com.google.cloud.aiplatform.v1beta1.Preset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Preset buildPartial() {
      com.google.cloud.aiplatform.v1beta1.Preset result =
          new com.google.cloud.aiplatform.v1beta1.Preset(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.query_ = query_;
      result.modality_ = modality_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.Preset) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.Preset) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.Preset other) {
      if (other == com.google.cloud.aiplatform.v1beta1.Preset.getDefaultInstance()) return this;
      if (other.hasQuery()) {
        setQuery(other.getQuery());
      }
      if (other.modality_ != 0) {
        setModalityValue(other.getModalityValue());
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
      com.google.cloud.aiplatform.v1beta1.Preset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.Preset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int query_ = 0;
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for query speed-precision trade-off
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
     *
     * @return Whether the query field is set.
     */
    @java.lang.Override
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for query speed-precision trade-off
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
     *
     * @return The enum numeric value on the wire for query.
     */
    @java.lang.Override
    public int getQueryValue() {
      return query_;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for query speed-precision trade-off
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
     *
     * @param value The enum numeric value on the wire for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryValue(int value) {
      bitField0_ |= 0x00000001;
      query_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for query speed-precision trade-off
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
     *
     * @return The query.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Preset.Query getQuery() {
      @SuppressWarnings("deprecation")
      com.google.cloud.aiplatform.v1beta1.Preset.Query result =
          com.google.cloud.aiplatform.v1beta1.Preset.Query.valueOf(query_);
      return result == null
          ? com.google.cloud.aiplatform.v1beta1.Preset.Query.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for query speed-precision trade-off
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
     *
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(com.google.cloud.aiplatform.v1beta1.Preset.Query value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      query_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for query speed-precision trade-off
     * </pre>
     *
     * <code>optional .google.cloud.aiplatform.v1beta1.Preset.Query query = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      bitField0_ = (bitField0_ & ~0x00000001);
      query_ = 0;
      onChanged();
      return this;
    }

    private int modality_ = 0;
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for different modalities
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Preset.Modality modality = 2;</code>
     *
     * @return The enum numeric value on the wire for modality.
     */
    @java.lang.Override
    public int getModalityValue() {
      return modality_;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for different modalities
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Preset.Modality modality = 2;</code>
     *
     * @param value The enum numeric value on the wire for modality to set.
     * @return This builder for chaining.
     */
    public Builder setModalityValue(int value) {

      modality_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for different modalities
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Preset.Modality modality = 2;</code>
     *
     * @return The modality.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.Preset.Modality getModality() {
      @SuppressWarnings("deprecation")
      com.google.cloud.aiplatform.v1beta1.Preset.Modality result =
          com.google.cloud.aiplatform.v1beta1.Preset.Modality.valueOf(modality_);
      return result == null
          ? com.google.cloud.aiplatform.v1beta1.Preset.Modality.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for different modalities
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Preset.Modality modality = 2;</code>
     *
     * @param value The modality to set.
     * @return This builder for chaining.
     */
    public Builder setModality(com.google.cloud.aiplatform.v1beta1.Preset.Modality value) {
      if (value == null) {
        throw new NullPointerException();
      }

      modality_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preset option controlling parameters for different modalities
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Preset.Modality modality = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModality() {

      modality_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.Preset)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.Preset)
  private static final com.google.cloud.aiplatform.v1beta1.Preset DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.Preset();
  }

  public static com.google.cloud.aiplatform.v1beta1.Preset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Preset> PARSER =
      new com.google.protobuf.AbstractParser<Preset>() {
        @java.lang.Override
        public Preset parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Preset(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Preset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Preset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Preset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
