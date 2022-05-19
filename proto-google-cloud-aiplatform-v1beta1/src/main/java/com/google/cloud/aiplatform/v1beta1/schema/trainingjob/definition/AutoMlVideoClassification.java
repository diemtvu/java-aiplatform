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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

/**
 *
 *
 * <pre>
 * A TrainingJob that trains and uploads an AutoML Video Classification Model.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification}
 */
public final class AutoMlVideoClassification extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification)
    AutoMlVideoClassificationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoMlVideoClassification.newBuilder() to construct.
  private AutoMlVideoClassification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoMlVideoClassification() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoMlVideoClassification();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AutoMlVideoClassification(
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
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                      .AutoMlVideoClassificationInputs.Builder
                  subBuilder = null;
              if (inputs_ != null) {
                subBuilder = inputs_.toBuilder();
              }
              inputs_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                          .AutoMlVideoClassificationInputs.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inputs_);
                inputs_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
        .AutoMLVideoClassificationProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
        .AutoMLVideoClassificationProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassification.class,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassification.Builder.class);
  }

  public static final int INPUTS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassificationInputs
      inputs_;
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
   * </code>
   *
   * @return Whether the inputs field is set.
   */
  @java.lang.Override
  public boolean hasInputs() {
    return inputs_ != null;
  }
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
   * </code>
   *
   * @return The inputs.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassificationInputs
      getInputs() {
    return inputs_ == null
        ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassificationInputs.getDefaultInstance()
        : inputs_;
  }
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassificationInputsOrBuilder
      getInputsOrBuilder() {
    return getInputs();
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
    if (inputs_ != null) {
      output.writeMessage(1, getInputs());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inputs_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInputs());
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
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassification)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification
        other =
            (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoClassification)
                obj;

    if (hasInputs() != other.hasInputs()) return false;
    if (hasInputs()) {
      if (!getInputs().equals(other.getInputs())) return false;
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
    if (hasInputs()) {
      hash = (37 * hash) + INPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getInputs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification
          prototype) {
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
   * A TrainingJob that trains and uploads an AutoML Video Classification Model.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification)
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoClassificationProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoClassificationProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoClassification.class,
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoClassification.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification.newBuilder()
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
      if (inputsBuilder_ == null) {
        inputs_ = null;
      } else {
        inputs_ = null;
        inputsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoClassificationProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassification
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassification
        build() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassification
        buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification
          result =
              new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoClassification(this);
      if (inputsBuilder_ == null) {
        result.inputs_ = inputs_;
      } else {
        result.inputs_ = inputsBuilder_.build();
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
      if (other
          instanceof
          com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoClassification) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoClassification)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification
            other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoClassification.getDefaultInstance()) return this;
      if (other.hasInputs()) {
        mergeInputs(other.getInputs());
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
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification
          parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoClassification)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassificationInputs
        inputs_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs.Builder,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputsOrBuilder>
        inputsBuilder_;
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     *
     * @return Whether the inputs field is set.
     */
    public boolean hasInputs() {
      return inputsBuilder_ != null || inputs_ != null;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     *
     * @return The inputs.
     */
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassificationInputs
        getInputs() {
      if (inputsBuilder_ == null) {
        return inputs_ == null
            ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs.getDefaultInstance()
            : inputs_;
      } else {
        return inputsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     */
    public Builder setInputs(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs
            value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputs_ = value;
        onChanged();
      } else {
        inputsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     */
    public Builder setInputs(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs.Builder
            builderForValue) {
      if (inputsBuilder_ == null) {
        inputs_ = builderForValue.build();
        onChanged();
      } else {
        inputsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     */
    public Builder mergeInputs(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs
            value) {
      if (inputsBuilder_ == null) {
        if (inputs_ != null) {
          inputs_ =
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoClassificationInputs.newBuilder(inputs_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          inputs_ = value;
        }
        onChanged();
      } else {
        inputsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     */
    public Builder clearInputs() {
      if (inputsBuilder_ == null) {
        inputs_ = null;
        onChanged();
      } else {
        inputs_ = null;
        inputsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassificationInputs.Builder
        getInputsBuilder() {

      onChanged();
      return getInputsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassificationInputsOrBuilder
        getInputsOrBuilder() {
      if (inputsBuilder_ != null) {
        return inputsBuilder_.getMessageOrBuilder();
      } else {
        return inputs_ == null
            ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs.getDefaultInstance()
            : inputs_;
      }
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassificationInputs inputs = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputs.Builder,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoClassificationInputsOrBuilder>
        getInputsFieldBuilder() {
      if (inputsBuilder_ == null) {
        inputsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoClassificationInputs,
                com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoClassificationInputs.Builder,
                com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoClassificationInputsOrBuilder>(
                getInputs(), getParentForChildren(), isClean());
        inputs_ = null;
      }
      return inputsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification)
  private static final com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoClassification();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoClassification
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlVideoClassification> PARSER =
      new com.google.protobuf.AbstractParser<AutoMlVideoClassification>() {
        @java.lang.Override
        public AutoMlVideoClassification parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AutoMlVideoClassification(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AutoMlVideoClassification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlVideoClassification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoClassification
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
