// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/prediction/text_sentiment.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

/**
 * <pre>
 * Prediction output format for Text Sentiment
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult}
 */
public final class TextSentimentPredictionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult)
    TextSentimentPredictionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextSentimentPredictionResult.newBuilder() to construct.
  private TextSentimentPredictionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextSentimentPredictionResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextSentimentPredictionResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TextSentimentPredictionResult(
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

            sentiment_ = input.readInt32();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextSentimentPredictionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextSentimentPredictionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult.class, com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult.Builder.class);
  }

  public static final int SENTIMENT_FIELD_NUMBER = 1;
  private int sentiment_;
  /**
   * <pre>
   * The integer sentiment labels between 0 (inclusive) and sentimentMax label
   * (inclusive), while 0 maps to the least positive sentiment and
   * sentimentMax maps to the most positive one. The higher the score is, the
   * more positive the sentiment in the text snippet is. Note: sentimentMax is
   * an integer value between 1 (inclusive) and 10 (inclusive).
   * </pre>
   *
   * <code>int32 sentiment = 1;</code>
   * @return The sentiment.
   */
  @java.lang.Override
  public int getSentiment() {
    return sentiment_;
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
    if (sentiment_ != 0) {
      output.writeInt32(1, sentiment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sentiment_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, sentiment_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult other = (com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult) obj;

    if (getSentiment()
        != other.getSentiment()) return false;
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
    hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
    hash = (53 * hash) + getSentiment();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult prototype) {
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
   * Prediction output format for Text Sentiment
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult)
      com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextSentimentPredictionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextSentimentPredictionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult.class, com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult.newBuilder()
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
      sentiment_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TextSentimentPredictionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult build() {
      com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult buildPartial() {
      com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult result = new com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult(this);
      result.sentiment_ = sentiment_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult) {
        return mergeFrom((com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult other) {
      if (other == com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult.getDefaultInstance()) return this;
      if (other.getSentiment() != 0) {
        setSentiment(other.getSentiment());
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
      com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sentiment_ ;
    /**
     * <pre>
     * The integer sentiment labels between 0 (inclusive) and sentimentMax label
     * (inclusive), while 0 maps to the least positive sentiment and
     * sentimentMax maps to the most positive one. The higher the score is, the
     * more positive the sentiment in the text snippet is. Note: sentimentMax is
     * an integer value between 1 (inclusive) and 10 (inclusive).
     * </pre>
     *
     * <code>int32 sentiment = 1;</code>
     * @return The sentiment.
     */
    @java.lang.Override
    public int getSentiment() {
      return sentiment_;
    }
    /**
     * <pre>
     * The integer sentiment labels between 0 (inclusive) and sentimentMax label
     * (inclusive), while 0 maps to the least positive sentiment and
     * sentimentMax maps to the most positive one. The higher the score is, the
     * more positive the sentiment in the text snippet is. Note: sentimentMax is
     * an integer value between 1 (inclusive) and 10 (inclusive).
     * </pre>
     *
     * <code>int32 sentiment = 1;</code>
     * @param value The sentiment to set.
     * @return This builder for chaining.
     */
    public Builder setSentiment(int value) {
      
      sentiment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The integer sentiment labels between 0 (inclusive) and sentimentMax label
     * (inclusive), while 0 maps to the least positive sentiment and
     * sentimentMax maps to the most positive one. The higher the score is, the
     * more positive the sentiment in the text snippet is. Note: sentimentMax is
     * an integer value between 1 (inclusive) and 10 (inclusive).
     * </pre>
     *
     * <code>int32 sentiment = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSentiment() {
      
      sentiment_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult)
  private static final com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult();
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextSentimentPredictionResult>
      PARSER = new com.google.protobuf.AbstractParser<TextSentimentPredictionResult>() {
    @java.lang.Override
    public TextSentimentPredictionResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TextSentimentPredictionResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextSentimentPredictionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextSentimentPredictionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.predict.prediction.TextSentimentPredictionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

