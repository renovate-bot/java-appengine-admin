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
// source: google/appengine/v1/deploy.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Options for the build operations performed as a part of the version
 * deployment. Only applicable for App Engine flexible environment when creating
 * a version using source code directly.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CloudBuildOptions}
 */
public final class CloudBuildOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CloudBuildOptions)
    CloudBuildOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudBuildOptions.newBuilder() to construct.
  private CloudBuildOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudBuildOptions() {
    appYamlPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudBuildOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CloudBuildOptions(
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
              java.lang.String s = input.readStringRequireUtf8();

              appYamlPath_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (cloudBuildTimeout_ != null) {
                subBuilder = cloudBuildTimeout_.toBuilder();
              }
              cloudBuildTimeout_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cloudBuildTimeout_);
                cloudBuildTimeout_ = subBuilder.buildPartial();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.DeployProto
        .internal_static_google_appengine_v1_CloudBuildOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.DeployProto
        .internal_static_google_appengine_v1_CloudBuildOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CloudBuildOptions.class,
            com.google.appengine.v1.CloudBuildOptions.Builder.class);
  }

  public static final int APP_YAML_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object appYamlPath_;
  /**
   *
   *
   * <pre>
   * Path to the yaml file used in deployment, used to determine runtime
   * configuration details.
   * Required for flexible environment builds.
   * See https://cloud.google.com/appengine/docs/standard/python/config/appref
   * for more details.
   * </pre>
   *
   * <code>string app_yaml_path = 1;</code>
   *
   * @return The appYamlPath.
   */
  @java.lang.Override
  public java.lang.String getAppYamlPath() {
    java.lang.Object ref = appYamlPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appYamlPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Path to the yaml file used in deployment, used to determine runtime
   * configuration details.
   * Required for flexible environment builds.
   * See https://cloud.google.com/appengine/docs/standard/python/config/appref
   * for more details.
   * </pre>
   *
   * <code>string app_yaml_path = 1;</code>
   *
   * @return The bytes for appYamlPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAppYamlPathBytes() {
    java.lang.Object ref = appYamlPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      appYamlPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLOUD_BUILD_TIMEOUT_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration cloudBuildTimeout_;
  /**
   *
   *
   * <pre>
   * The Cloud Build timeout used as part of any dependent builds performed by
   * version creation. Defaults to 10 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
   *
   * @return Whether the cloudBuildTimeout field is set.
   */
  @java.lang.Override
  public boolean hasCloudBuildTimeout() {
    return cloudBuildTimeout_ != null;
  }
  /**
   *
   *
   * <pre>
   * The Cloud Build timeout used as part of any dependent builds performed by
   * version creation. Defaults to 10 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
   *
   * @return The cloudBuildTimeout.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getCloudBuildTimeout() {
    return cloudBuildTimeout_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : cloudBuildTimeout_;
  }
  /**
   *
   *
   * <pre>
   * The Cloud Build timeout used as part of any dependent builds performed by
   * version creation. Defaults to 10 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getCloudBuildTimeoutOrBuilder() {
    return getCloudBuildTimeout();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appYamlPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appYamlPath_);
    }
    if (cloudBuildTimeout_ != null) {
      output.writeMessage(2, getCloudBuildTimeout());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appYamlPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appYamlPath_);
    }
    if (cloudBuildTimeout_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCloudBuildTimeout());
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
    if (!(obj instanceof com.google.appengine.v1.CloudBuildOptions)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CloudBuildOptions other =
        (com.google.appengine.v1.CloudBuildOptions) obj;

    if (!getAppYamlPath().equals(other.getAppYamlPath())) return false;
    if (hasCloudBuildTimeout() != other.hasCloudBuildTimeout()) return false;
    if (hasCloudBuildTimeout()) {
      if (!getCloudBuildTimeout().equals(other.getCloudBuildTimeout())) return false;
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
    hash = (37 * hash) + APP_YAML_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getAppYamlPath().hashCode();
    if (hasCloudBuildTimeout()) {
      hash = (37 * hash) + CLOUD_BUILD_TIMEOUT_FIELD_NUMBER;
      hash = (53 * hash) + getCloudBuildTimeout().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CloudBuildOptions parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.CloudBuildOptions prototype) {
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
   * Options for the build operations performed as a part of the version
   * deployment. Only applicable for App Engine flexible environment when creating
   * a version using source code directly.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CloudBuildOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CloudBuildOptions)
      com.google.appengine.v1.CloudBuildOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_CloudBuildOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_CloudBuildOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CloudBuildOptions.class,
              com.google.appengine.v1.CloudBuildOptions.Builder.class);
    }

    // Construct using com.google.appengine.v1.CloudBuildOptions.newBuilder()
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
      appYamlPath_ = "";

      if (cloudBuildTimeoutBuilder_ == null) {
        cloudBuildTimeout_ = null;
      } else {
        cloudBuildTimeout_ = null;
        cloudBuildTimeoutBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_CloudBuildOptions_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.CloudBuildOptions getDefaultInstanceForType() {
      return com.google.appengine.v1.CloudBuildOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.CloudBuildOptions build() {
      com.google.appengine.v1.CloudBuildOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.CloudBuildOptions buildPartial() {
      com.google.appengine.v1.CloudBuildOptions result =
          new com.google.appengine.v1.CloudBuildOptions(this);
      result.appYamlPath_ = appYamlPath_;
      if (cloudBuildTimeoutBuilder_ == null) {
        result.cloudBuildTimeout_ = cloudBuildTimeout_;
      } else {
        result.cloudBuildTimeout_ = cloudBuildTimeoutBuilder_.build();
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
      if (other instanceof com.google.appengine.v1.CloudBuildOptions) {
        return mergeFrom((com.google.appengine.v1.CloudBuildOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CloudBuildOptions other) {
      if (other == com.google.appengine.v1.CloudBuildOptions.getDefaultInstance()) return this;
      if (!other.getAppYamlPath().isEmpty()) {
        appYamlPath_ = other.appYamlPath_;
        onChanged();
      }
      if (other.hasCloudBuildTimeout()) {
        mergeCloudBuildTimeout(other.getCloudBuildTimeout());
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
      com.google.appengine.v1.CloudBuildOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.CloudBuildOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appYamlPath_ = "";
    /**
     *
     *
     * <pre>
     * Path to the yaml file used in deployment, used to determine runtime
     * configuration details.
     * Required for flexible environment builds.
     * See https://cloud.google.com/appengine/docs/standard/python/config/appref
     * for more details.
     * </pre>
     *
     * <code>string app_yaml_path = 1;</code>
     *
     * @return The appYamlPath.
     */
    public java.lang.String getAppYamlPath() {
      java.lang.Object ref = appYamlPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appYamlPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to the yaml file used in deployment, used to determine runtime
     * configuration details.
     * Required for flexible environment builds.
     * See https://cloud.google.com/appengine/docs/standard/python/config/appref
     * for more details.
     * </pre>
     *
     * <code>string app_yaml_path = 1;</code>
     *
     * @return The bytes for appYamlPath.
     */
    public com.google.protobuf.ByteString getAppYamlPathBytes() {
      java.lang.Object ref = appYamlPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        appYamlPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to the yaml file used in deployment, used to determine runtime
     * configuration details.
     * Required for flexible environment builds.
     * See https://cloud.google.com/appengine/docs/standard/python/config/appref
     * for more details.
     * </pre>
     *
     * <code>string app_yaml_path = 1;</code>
     *
     * @param value The appYamlPath to set.
     * @return This builder for chaining.
     */
    public Builder setAppYamlPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      appYamlPath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to the yaml file used in deployment, used to determine runtime
     * configuration details.
     * Required for flexible environment builds.
     * See https://cloud.google.com/appengine/docs/standard/python/config/appref
     * for more details.
     * </pre>
     *
     * <code>string app_yaml_path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAppYamlPath() {

      appYamlPath_ = getDefaultInstance().getAppYamlPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to the yaml file used in deployment, used to determine runtime
     * configuration details.
     * Required for flexible environment builds.
     * See https://cloud.google.com/appengine/docs/standard/python/config/appref
     * for more details.
     * </pre>
     *
     * <code>string app_yaml_path = 1;</code>
     *
     * @param value The bytes for appYamlPath to set.
     * @return This builder for chaining.
     */
    public Builder setAppYamlPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      appYamlPath_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration cloudBuildTimeout_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        cloudBuildTimeoutBuilder_;
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     *
     * @return Whether the cloudBuildTimeout field is set.
     */
    public boolean hasCloudBuildTimeout() {
      return cloudBuildTimeoutBuilder_ != null || cloudBuildTimeout_ != null;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     *
     * @return The cloudBuildTimeout.
     */
    public com.google.protobuf.Duration getCloudBuildTimeout() {
      if (cloudBuildTimeoutBuilder_ == null) {
        return cloudBuildTimeout_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : cloudBuildTimeout_;
      } else {
        return cloudBuildTimeoutBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     */
    public Builder setCloudBuildTimeout(com.google.protobuf.Duration value) {
      if (cloudBuildTimeoutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cloudBuildTimeout_ = value;
        onChanged();
      } else {
        cloudBuildTimeoutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     */
    public Builder setCloudBuildTimeout(com.google.protobuf.Duration.Builder builderForValue) {
      if (cloudBuildTimeoutBuilder_ == null) {
        cloudBuildTimeout_ = builderForValue.build();
        onChanged();
      } else {
        cloudBuildTimeoutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     */
    public Builder mergeCloudBuildTimeout(com.google.protobuf.Duration value) {
      if (cloudBuildTimeoutBuilder_ == null) {
        if (cloudBuildTimeout_ != null) {
          cloudBuildTimeout_ =
              com.google.protobuf.Duration.newBuilder(cloudBuildTimeout_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cloudBuildTimeout_ = value;
        }
        onChanged();
      } else {
        cloudBuildTimeoutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     */
    public Builder clearCloudBuildTimeout() {
      if (cloudBuildTimeoutBuilder_ == null) {
        cloudBuildTimeout_ = null;
        onChanged();
      } else {
        cloudBuildTimeout_ = null;
        cloudBuildTimeoutBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getCloudBuildTimeoutBuilder() {

      onChanged();
      return getCloudBuildTimeoutFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getCloudBuildTimeoutOrBuilder() {
      if (cloudBuildTimeoutBuilder_ != null) {
        return cloudBuildTimeoutBuilder_.getMessageOrBuilder();
      } else {
        return cloudBuildTimeout_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : cloudBuildTimeout_;
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Build timeout used as part of any dependent builds performed by
     * version creation. Defaults to 10 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cloud_build_timeout = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getCloudBuildTimeoutFieldBuilder() {
      if (cloudBuildTimeoutBuilder_ == null) {
        cloudBuildTimeoutBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getCloudBuildTimeout(), getParentForChildren(), isClean());
        cloudBuildTimeout_ = null;
      }
      return cloudBuildTimeoutBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CloudBuildOptions)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CloudBuildOptions)
  private static final com.google.appengine.v1.CloudBuildOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CloudBuildOptions();
  }

  public static com.google.appengine.v1.CloudBuildOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudBuildOptions> PARSER =
      new com.google.protobuf.AbstractParser<CloudBuildOptions>() {
        @java.lang.Override
        public CloudBuildOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CloudBuildOptions(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CloudBuildOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudBuildOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.CloudBuildOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
