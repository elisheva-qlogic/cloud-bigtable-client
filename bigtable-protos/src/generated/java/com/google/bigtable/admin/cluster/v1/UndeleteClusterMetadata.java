// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/cluster/v1/bigtable_cluster_service_messages.proto

package com.google.bigtable.admin.cluster.v1;

/**
 * Protobuf type {@code google.bigtable.admin.cluster.v1.UndeleteClusterMetadata}
 *
 * <pre>
 * Metadata type for the operation returned by
 * BigtableClusterService.UndeleteCluster.
 * </pre>
 */
public  final class UndeleteClusterMetadata extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.cluster.v1.UndeleteClusterMetadata)
    UndeleteClusterMetadataOrBuilder {
  // Use UndeleteClusterMetadata.newBuilder() to construct.
  private UndeleteClusterMetadata(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private UndeleteClusterMetadata() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UndeleteClusterMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (requestTime_ != null) {
              subBuilder = requestTime_.toBuilder();
            }
            requestTime_ = input.readMessage(com.google.protobuf.Timestamp.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(requestTime_);
              requestTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (finishTime_ != null) {
              subBuilder = finishTime_.toBuilder();
            }
            finishTime_ = input.readMessage(com.google.protobuf.Timestamp.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(finishTime_);
              finishTime_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata.class, com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata.Builder.class);
  }

  public static final com.google.protobuf.Parser<UndeleteClusterMetadata> PARSER =
      new com.google.protobuf.AbstractParser<UndeleteClusterMetadata>() {
    public UndeleteClusterMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UndeleteClusterMetadata(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<UndeleteClusterMetadata> getParserForType() {
    return PARSER;
  }

  public static final int REQUEST_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp requestTime_;
  /**
   * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   */
  public boolean hasRequestTime() {
    return requestTime_ != null;
  }
  /**
   * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   */
  public com.google.protobuf.Timestamp getRequestTime() {
    return requestTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestTime_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   */
  public com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder() {
    return getRequestTime();
  }

  public static final int FINISH_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp finishTime_;
  /**
   * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
   *
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   */
  public boolean hasFinishTime() {
    return finishTime_ != null;
  }
  /**
   * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
   *
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   */
  public com.google.protobuf.Timestamp getFinishTime() {
    return finishTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : finishTime_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
   *
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   */
  public com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder() {
    return getFinishTime();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (requestTime_ != null) {
      output.writeMessage(1, getRequestTime());
    }
    if (finishTime_ != null) {
      output.writeMessage(2, getFinishTime());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (requestTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequestTime());
    }
    if (finishTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFinishTime());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.admin.cluster.v1.UndeleteClusterMetadata}
   *
   * <pre>
   * Metadata type for the operation returned by
   * BigtableClusterService.UndeleteCluster.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.cluster.v1.UndeleteClusterMetadata)
      com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata.class, com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata.Builder.class);
    }

    // Construct using com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (requestTimeBuilder_ == null) {
        requestTime_ = null;
      } else {
        requestTime_ = null;
        requestTimeBuilder_ = null;
      }
      if (finishTimeBuilder_ == null) {
        finishTime_ = null;
      } else {
        finishTime_ = null;
        finishTimeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_descriptor;
    }

    public com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata getDefaultInstanceForType() {
      return com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata.getDefaultInstance();
    }

    public com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata build() {
      com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata buildPartial() {
      com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata result = new com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata(this);
      if (requestTimeBuilder_ == null) {
        result.requestTime_ = requestTime_;
      } else {
        result.requestTime_ = requestTimeBuilder_.build();
      }
      if (finishTimeBuilder_ == null) {
        result.finishTime_ = finishTime_;
      } else {
        result.finishTime_ = finishTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata) {
        return mergeFrom((com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata other) {
      if (other == com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata.getDefaultInstance()) return this;
      if (other.hasRequestTime()) {
        mergeRequestTime(other.getRequestTime());
      }
      if (other.hasFinishTime()) {
        mergeFinishTime(other.getFinishTime());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp requestTime_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> requestTimeBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public boolean hasRequestTime() {
      return requestTimeBuilder_ != null || requestTime_ != null;
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public com.google.protobuf.Timestamp getRequestTime() {
      if (requestTimeBuilder_ == null) {
        return requestTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestTime_;
      } else {
        return requestTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public Builder setRequestTime(com.google.protobuf.Timestamp value) {
      if (requestTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestTime_ = value;
        onChanged();
      } else {
        requestTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public Builder setRequestTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (requestTimeBuilder_ == null) {
        requestTime_ = builderForValue.build();
        onChanged();
      } else {
        requestTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public Builder mergeRequestTime(com.google.protobuf.Timestamp value) {
      if (requestTimeBuilder_ == null) {
        if (requestTime_ != null) {
          requestTime_ =
            com.google.protobuf.Timestamp.newBuilder(requestTime_).mergeFrom(value).buildPartial();
        } else {
          requestTime_ = value;
        }
        onChanged();
      } else {
        requestTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public Builder clearRequestTime() {
      if (requestTimeBuilder_ == null) {
        requestTime_ = null;
        onChanged();
      } else {
        requestTime_ = null;
        requestTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public com.google.protobuf.Timestamp.Builder getRequestTimeBuilder() {
      
      onChanged();
      return getRequestTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    public com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder() {
      if (requestTimeBuilder_ != null) {
        return requestTimeBuilder_.getMessageOrBuilder();
      } else {
        return requestTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : requestTime_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
     *
     * <pre>
     * The time at which the original request was received.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getRequestTimeFieldBuilder() {
      if (requestTimeBuilder_ == null) {
        requestTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getRequestTime(),
                getParentForChildren(),
                isClean());
        requestTime_ = null;
      }
      return requestTimeBuilder_;
    }

    private com.google.protobuf.Timestamp finishTime_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> finishTimeBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public boolean hasFinishTime() {
      return finishTimeBuilder_ != null || finishTime_ != null;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public com.google.protobuf.Timestamp getFinishTime() {
      if (finishTimeBuilder_ == null) {
        return finishTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : finishTime_;
      } else {
        return finishTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public Builder setFinishTime(com.google.protobuf.Timestamp value) {
      if (finishTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        finishTime_ = value;
        onChanged();
      } else {
        finishTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public Builder setFinishTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (finishTimeBuilder_ == null) {
        finishTime_ = builderForValue.build();
        onChanged();
      } else {
        finishTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public Builder mergeFinishTime(com.google.protobuf.Timestamp value) {
      if (finishTimeBuilder_ == null) {
        if (finishTime_ != null) {
          finishTime_ =
            com.google.protobuf.Timestamp.newBuilder(finishTime_).mergeFrom(value).buildPartial();
        } else {
          finishTime_ = value;
        }
        onChanged();
      } else {
        finishTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public Builder clearFinishTime() {
      if (finishTimeBuilder_ == null) {
        finishTime_ = null;
        onChanged();
      } else {
        finishTime_ = null;
        finishTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public com.google.protobuf.Timestamp.Builder getFinishTimeBuilder() {
      
      onChanged();
      return getFinishTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    public com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder() {
      if (finishTimeBuilder_ != null) {
        return finishTimeBuilder_.getMessageOrBuilder();
      } else {
        return finishTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : finishTime_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
     *
     * <pre>
     * The time at which this operation failed or was completed successfully.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getFinishTimeFieldBuilder() {
      if (finishTimeBuilder_ == null) {
        finishTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getFinishTime(),
                getParentForChildren(),
                isClean());
        finishTime_ = null;
      }
      return finishTimeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.cluster.v1.UndeleteClusterMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.cluster.v1.UndeleteClusterMetadata)
  private static final com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata defaultInstance;static {
    defaultInstance = new com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata();
  }

  public static com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.bigtable.admin.cluster.v1.UndeleteClusterMetadata getDefaultInstanceForType() {
    return defaultInstance;
  }

}

