// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/cluster/v1/bigtable_cluster_service_messages.proto

package com.google.bigtable.admin.cluster.v1;

/**
 * Protobuf type {@code google.bigtable.admin.cluster.v1.CreateClusterRequest}
 *
 * <pre>
 * Request message for BigtableClusterService.CreateCluster.
 * </pre>
 */
public  final class CreateClusterRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.cluster.v1.CreateClusterRequest)
    CreateClusterRequestOrBuilder {
  // Use CreateClusterRequest.newBuilder() to construct.
  private CreateClusterRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private CreateClusterRequest() {
    name_ = "";
    clusterId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateClusterRequest(
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
            com.google.protobuf.ByteString bs = input.readBytes();

            name_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            clusterId_ = bs;
            break;
          }
          case 26: {
            com.google.bigtable.admin.cluster.v1.Cluster.Builder subBuilder = null;
            if (cluster_ != null) {
              subBuilder = cluster_.toBuilder();
            }
            cluster_ = input.readMessage(com.google.bigtable.admin.cluster.v1.Cluster.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cluster_);
              cluster_ = subBuilder.buildPartial();
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
    return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.cluster.v1.CreateClusterRequest.class, com.google.bigtable.admin.cluster.v1.CreateClusterRequest.Builder.class);
  }

  public static final com.google.protobuf.Parser<CreateClusterRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateClusterRequest>() {
    public CreateClusterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateClusterRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClusterRequest> getParserForType() {
    return PARSER;
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the zone in which to create the cluster.
   * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
   * </pre>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the zone in which to create the cluster.
   * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
   * </pre>
   */
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

  public static final int CLUSTER_ID_FIELD_NUMBER = 2;
  private java.lang.Object clusterId_;
  /**
   * <code>optional string cluster_id = 2;</code>
   *
   * <pre>
   * The id to be used when referring to the new cluster within its zone,
   * e.g. just the "test-cluster" section of the full name
   * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
   * </pre>
   */
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        clusterId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string cluster_id = 2;</code>
   *
   * <pre>
   * The id to be used when referring to the new cluster within its zone,
   * e.g. just the "test-cluster" section of the full name
   * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
   * </pre>
   */
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_FIELD_NUMBER = 3;
  private com.google.bigtable.admin.cluster.v1.Cluster cluster_;
  /**
   * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
   *
   * <pre>
   * The cluster to create.
   * The "name", "delete_time", and "current_operation" fields must be left
   * blank.
   * </pre>
   */
  public boolean hasCluster() {
    return cluster_ != null;
  }
  /**
   * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
   *
   * <pre>
   * The cluster to create.
   * The "name", "delete_time", and "current_operation" fields must be left
   * blank.
   * </pre>
   */
  public com.google.bigtable.admin.cluster.v1.Cluster getCluster() {
    return cluster_ == null ? com.google.bigtable.admin.cluster.v1.Cluster.getDefaultInstance() : cluster_;
  }
  /**
   * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
   *
   * <pre>
   * The cluster to create.
   * The "name", "delete_time", and "current_operation" fields must be left
   * blank.
   * </pre>
   */
  public com.google.bigtable.admin.cluster.v1.ClusterOrBuilder getClusterOrBuilder() {
    return getCluster();
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
    if (!getNameBytes().isEmpty()) {
      output.writeBytes(1, getNameBytes());
    }
    if (!getClusterIdBytes().isEmpty()) {
      output.writeBytes(2, getClusterIdBytes());
    }
    if (cluster_ != null) {
      output.writeMessage(3, getCluster());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getNameBytes());
    }
    if (!getClusterIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getClusterIdBytes());
    }
    if (cluster_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCluster());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.bigtable.admin.cluster.v1.CreateClusterRequest prototype) {
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
   * Protobuf type {@code google.bigtable.admin.cluster.v1.CreateClusterRequest}
   *
   * <pre>
   * Request message for BigtableClusterService.CreateCluster.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.cluster.v1.CreateClusterRequest)
      com.google.bigtable.admin.cluster.v1.CreateClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.cluster.v1.CreateClusterRequest.class, com.google.bigtable.admin.cluster.v1.CreateClusterRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.cluster.v1.CreateClusterRequest.newBuilder()
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
      name_ = "";

      clusterId_ = "";

      if (clusterBuilder_ == null) {
        cluster_ = null;
      } else {
        cluster_ = null;
        clusterBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.cluster.v1.BigtableClusterServiceMessagesProto.internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_descriptor;
    }

    public com.google.bigtable.admin.cluster.v1.CreateClusterRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.cluster.v1.CreateClusterRequest.getDefaultInstance();
    }

    public com.google.bigtable.admin.cluster.v1.CreateClusterRequest build() {
      com.google.bigtable.admin.cluster.v1.CreateClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.cluster.v1.CreateClusterRequest buildPartial() {
      com.google.bigtable.admin.cluster.v1.CreateClusterRequest result = new com.google.bigtable.admin.cluster.v1.CreateClusterRequest(this);
      result.name_ = name_;
      result.clusterId_ = clusterId_;
      if (clusterBuilder_ == null) {
        result.cluster_ = cluster_;
      } else {
        result.cluster_ = clusterBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.cluster.v1.CreateClusterRequest) {
        return mergeFrom((com.google.bigtable.admin.cluster.v1.CreateClusterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.cluster.v1.CreateClusterRequest other) {
      if (other == com.google.bigtable.admin.cluster.v1.CreateClusterRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (other.hasCluster()) {
        mergeCluster(other.getCluster());
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
      com.google.bigtable.admin.cluster.v1.CreateClusterRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.cluster.v1.CreateClusterRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the zone in which to create the cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the zone in which to create the cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
     * </pre>
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
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the zone in which to create the cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
     * </pre>
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
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the zone in which to create the cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
     * </pre>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * The unique name of the zone in which to create the cluster.
     * Values are of the form projects/&lt;project&gt;/zones/&lt;zone&gt;
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <code>optional string cluster_id = 2;</code>
     *
     * <pre>
     * The id to be used when referring to the new cluster within its zone,
     * e.g. just the "test-cluster" section of the full name
     * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
     * </pre>
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clusterId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string cluster_id = 2;</code>
     *
     * <pre>
     * The id to be used when referring to the new cluster within its zone,
     * e.g. just the "test-cluster" section of the full name
     * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
     * </pre>
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string cluster_id = 2;</code>
     *
     * <pre>
     * The id to be used when referring to the new cluster within its zone,
     * e.g. just the "test-cluster" section of the full name
     * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
     * </pre>
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string cluster_id = 2;</code>
     *
     * <pre>
     * The id to be used when referring to the new cluster within its zone,
     * e.g. just the "test-cluster" section of the full name
     * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
     * </pre>
     */
    public Builder clearClusterId() {
      
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string cluster_id = 2;</code>
     *
     * <pre>
     * The id to be used when referring to the new cluster within its zone,
     * e.g. just the "test-cluster" section of the full name
     * "projects/&lt;project&gt;/zones/&lt;zone&gt;/clusters/test-cluster".
     * </pre>
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
      return this;
    }

    private com.google.bigtable.admin.cluster.v1.Cluster cluster_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.bigtable.admin.cluster.v1.Cluster, com.google.bigtable.admin.cluster.v1.Cluster.Builder, com.google.bigtable.admin.cluster.v1.ClusterOrBuilder> clusterBuilder_;
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public boolean hasCluster() {
      return clusterBuilder_ != null || cluster_ != null;
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public com.google.bigtable.admin.cluster.v1.Cluster getCluster() {
      if (clusterBuilder_ == null) {
        return cluster_ == null ? com.google.bigtable.admin.cluster.v1.Cluster.getDefaultInstance() : cluster_;
      } else {
        return clusterBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public Builder setCluster(com.google.bigtable.admin.cluster.v1.Cluster value) {
      if (clusterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cluster_ = value;
        onChanged();
      } else {
        clusterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public Builder setCluster(
        com.google.bigtable.admin.cluster.v1.Cluster.Builder builderForValue) {
      if (clusterBuilder_ == null) {
        cluster_ = builderForValue.build();
        onChanged();
      } else {
        clusterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public Builder mergeCluster(com.google.bigtable.admin.cluster.v1.Cluster value) {
      if (clusterBuilder_ == null) {
        if (cluster_ != null) {
          cluster_ =
            com.google.bigtable.admin.cluster.v1.Cluster.newBuilder(cluster_).mergeFrom(value).buildPartial();
        } else {
          cluster_ = value;
        }
        onChanged();
      } else {
        clusterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public Builder clearCluster() {
      if (clusterBuilder_ == null) {
        cluster_ = null;
        onChanged();
      } else {
        cluster_ = null;
        clusterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public com.google.bigtable.admin.cluster.v1.Cluster.Builder getClusterBuilder() {
      
      onChanged();
      return getClusterFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    public com.google.bigtable.admin.cluster.v1.ClusterOrBuilder getClusterOrBuilder() {
      if (clusterBuilder_ != null) {
        return clusterBuilder_.getMessageOrBuilder();
      } else {
        return cluster_ == null ?
            com.google.bigtable.admin.cluster.v1.Cluster.getDefaultInstance() : cluster_;
      }
    }
    /**
     * <code>optional .google.bigtable.admin.cluster.v1.Cluster cluster = 3;</code>
     *
     * <pre>
     * The cluster to create.
     * The "name", "delete_time", and "current_operation" fields must be left
     * blank.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.bigtable.admin.cluster.v1.Cluster, com.google.bigtable.admin.cluster.v1.Cluster.Builder, com.google.bigtable.admin.cluster.v1.ClusterOrBuilder> 
        getClusterFieldBuilder() {
      if (clusterBuilder_ == null) {
        clusterBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.bigtable.admin.cluster.v1.Cluster, com.google.bigtable.admin.cluster.v1.Cluster.Builder, com.google.bigtable.admin.cluster.v1.ClusterOrBuilder>(
                getCluster(),
                getParentForChildren(),
                isClean());
        cluster_ = null;
      }
      return clusterBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.cluster.v1.CreateClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.cluster.v1.CreateClusterRequest)
  private static final com.google.bigtable.admin.cluster.v1.CreateClusterRequest defaultInstance;static {
    defaultInstance = new com.google.bigtable.admin.cluster.v1.CreateClusterRequest();
  }

  public static com.google.bigtable.admin.cluster.v1.CreateClusterRequest getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.bigtable.admin.cluster.v1.CreateClusterRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

}

