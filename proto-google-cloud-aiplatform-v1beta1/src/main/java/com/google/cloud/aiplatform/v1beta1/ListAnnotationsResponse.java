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
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [DatasetService.ListAnnotations][google.cloud.aiplatform.v1beta1.DatasetService.ListAnnotations].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListAnnotationsResponse}
 */
public final class ListAnnotationsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListAnnotationsResponse)
    ListAnnotationsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAnnotationsResponse.newBuilder() to construct.
  private ListAnnotationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAnnotationsResponse() {
    annotations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAnnotationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListAnnotationsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                annotations_ =
                    new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Annotation>();
                mutable_bitField0_ |= 0x00000001;
              }
              annotations_.add(
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.Annotation.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        annotations_ = java.util.Collections.unmodifiableList(annotations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListAnnotationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListAnnotationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse.Builder.class);
  }

  public static final int ANNOTATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Annotation> annotations_;
  /**
   *
   *
   * <pre>
   * A list of Annotations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Annotation> getAnnotationsList() {
    return annotations_;
  }
  /**
   *
   *
   * <pre>
   * A list of Annotations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.AnnotationOrBuilder>
      getAnnotationsOrBuilderList() {
    return annotations_;
  }
  /**
   *
   *
   * <pre>
   * A list of Annotations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
   */
  @java.lang.Override
  public int getAnnotationsCount() {
    return annotations_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of Annotations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Annotation getAnnotations(int index) {
    return annotations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of Annotations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.AnnotationOrBuilder getAnnotationsOrBuilder(
      int index) {
    return annotations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < annotations_.size(); i++) {
      output.writeMessage(1, annotations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < annotations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, annotations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse) obj;

    if (!getAnnotationsList().equals(other.getAnnotationsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getAnnotationsCount() > 0) {
      hash = (37 * hash) + ANNOTATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse prototype) {
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
   * Response message for [DatasetService.ListAnnotations][google.cloud.aiplatform.v1beta1.DatasetService.ListAnnotations].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListAnnotationsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListAnnotationsResponse)
      com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListAnnotationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListAnnotationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAnnotationsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (annotationsBuilder_ == null) {
        annotations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        annotationsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListAnnotationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (annotationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          annotations_ = java.util.Collections.unmodifiableList(annotations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotations_ = annotations_;
      } else {
        result.annotations_ = annotationsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse.getDefaultInstance())
        return this;
      if (annotationsBuilder_ == null) {
        if (!other.annotations_.isEmpty()) {
          if (annotations_.isEmpty()) {
            annotations_ = other.annotations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotationsIsMutable();
            annotations_.addAll(other.annotations_);
          }
          onChanged();
        }
      } else {
        if (!other.annotations_.isEmpty()) {
          if (annotationsBuilder_.isEmpty()) {
            annotationsBuilder_.dispose();
            annotationsBuilder_ = null;
            annotations_ = other.annotations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnnotationsFieldBuilder()
                    : null;
          } else {
            annotationsBuilder_.addAllMessages(other.annotations_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Annotation> annotations_ =
        java.util.Collections.emptyList();

    private void ensureAnnotationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotations_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Annotation>(annotations_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Annotation,
            com.google.cloud.aiplatform.v1beta1.Annotation.Builder,
            com.google.cloud.aiplatform.v1beta1.AnnotationOrBuilder>
        annotationsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Annotation> getAnnotationsList() {
      if (annotationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotations_);
      } else {
        return annotationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public int getAnnotationsCount() {
      if (annotationsBuilder_ == null) {
        return annotations_.size();
      } else {
        return annotationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Annotation getAnnotations(int index) {
      if (annotationsBuilder_ == null) {
        return annotations_.get(index);
      } else {
        return annotationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder setAnnotations(int index, com.google.cloud.aiplatform.v1beta1.Annotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.set(index, value);
        onChanged();
      } else {
        annotationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder setAnnotations(
        int index, com.google.cloud.aiplatform.v1beta1.Annotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder addAnnotations(com.google.cloud.aiplatform.v1beta1.Annotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.add(value);
        onChanged();
      } else {
        annotationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder addAnnotations(int index, com.google.cloud.aiplatform.v1beta1.Annotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.add(index, value);
        onChanged();
      } else {
        annotationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder addAnnotations(
        com.google.cloud.aiplatform.v1beta1.Annotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.add(builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder addAnnotations(
        int index, com.google.cloud.aiplatform.v1beta1.Annotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder addAllAnnotations(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Annotation> values) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, annotations_);
        onChanged();
      } else {
        annotationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder clearAnnotations() {
      if (annotationsBuilder_ == null) {
        annotations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public Builder removeAnnotations(int index) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.remove(index);
        onChanged();
      } else {
        annotationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Annotation.Builder getAnnotationsBuilder(int index) {
      return getAnnotationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.AnnotationOrBuilder getAnnotationsOrBuilder(
        int index) {
      if (annotationsBuilder_ == null) {
        return annotations_.get(index);
      } else {
        return annotationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.AnnotationOrBuilder>
        getAnnotationsOrBuilderList() {
      if (annotationsBuilder_ != null) {
        return annotationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotations_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Annotation.Builder addAnnotationsBuilder() {
      return getAnnotationsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Annotation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Annotation.Builder addAnnotationsBuilder(int index) {
      return getAnnotationsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Annotation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of Annotations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Annotation annotations = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Annotation.Builder>
        getAnnotationsBuilderList() {
      return getAnnotationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Annotation,
            com.google.cloud.aiplatform.v1beta1.Annotation.Builder,
            com.google.cloud.aiplatform.v1beta1.AnnotationOrBuilder>
        getAnnotationsFieldBuilder() {
      if (annotationsBuilder_ == null) {
        annotationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Annotation,
                com.google.cloud.aiplatform.v1beta1.Annotation.Builder,
                com.google.cloud.aiplatform.v1beta1.AnnotationOrBuilder>(
                annotations_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        annotations_ = null;
      }
      return annotationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListAnnotationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListAnnotationsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAnnotationsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAnnotationsResponse>() {
        @java.lang.Override
        public ListAnnotationsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListAnnotationsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListAnnotationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAnnotationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListAnnotationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
