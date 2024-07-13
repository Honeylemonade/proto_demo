// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: video_info.proto
// Protobuf Java Version: 4.27.2

public final class VideoInfo {
  private VideoInfo() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      VideoInfo.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VideoFeatureOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VideoFeature)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 author_gender = 1;</code>
     * @return Whether the authorGender field is set.
     */
    boolean hasAuthorGender();
    /**
     * <code>optional int32 author_gender = 1;</code>
     * @return The authorGender.
     */
    int getAuthorGender();

    /**
     * <code>optional int64 channel_id = 2;</code>
     * @return Whether the channelId field is set.
     */
    boolean hasChannelId();
    /**
     * <code>optional int64 channel_id = 2;</code>
     * @return The channelId.
     */
    long getChannelId();
  }
  /**
   * Protobuf type {@code VideoFeature}
   */
  public static final class VideoFeature extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:VideoFeature)
      VideoFeatureOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        VideoFeature.class.getName());
    }
    // Use VideoFeature.newBuilder() to construct.
    private VideoFeature(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private VideoFeature() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return VideoInfo.internal_static_VideoFeature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VideoInfo.internal_static_VideoFeature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VideoInfo.VideoFeature.class, VideoInfo.VideoFeature.Builder.class);
    }

    private int bitField0_;
    public static final int AUTHOR_GENDER_FIELD_NUMBER = 1;
    private int authorGender_ = 0;
    /**
     * <code>optional int32 author_gender = 1;</code>
     * @return Whether the authorGender field is set.
     */
    @java.lang.Override
    public boolean hasAuthorGender() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 author_gender = 1;</code>
     * @return The authorGender.
     */
    @java.lang.Override
    public int getAuthorGender() {
      return authorGender_;
    }

    public static final int CHANNEL_ID_FIELD_NUMBER = 2;
    private long channelId_ = 0L;
    /**
     * <code>optional int64 channel_id = 2;</code>
     * @return Whether the channelId field is set.
     */
    @java.lang.Override
    public boolean hasChannelId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 channel_id = 2;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public long getChannelId() {
      return channelId_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, authorGender_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(2, channelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, authorGender_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, channelId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof VideoInfo.VideoFeature)) {
        return super.equals(obj);
      }
      VideoInfo.VideoFeature other = (VideoInfo.VideoFeature) obj;

      if (hasAuthorGender() != other.hasAuthorGender()) return false;
      if (hasAuthorGender()) {
        if (getAuthorGender()
            != other.getAuthorGender()) return false;
      }
      if (hasChannelId() != other.hasChannelId()) return false;
      if (hasChannelId()) {
        if (getChannelId()
            != other.getChannelId()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAuthorGender()) {
        hash = (37 * hash) + AUTHOR_GENDER_FIELD_NUMBER;
        hash = (53 * hash) + getAuthorGender();
      }
      if (hasChannelId()) {
        hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getChannelId());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static VideoInfo.VideoFeature parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VideoInfo.VideoFeature parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VideoInfo.VideoFeature parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VideoInfo.VideoFeature parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VideoInfo.VideoFeature parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static VideoInfo.VideoFeature parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VideoInfo.VideoFeature parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static VideoInfo.VideoFeature parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static VideoInfo.VideoFeature parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static VideoInfo.VideoFeature parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static VideoInfo.VideoFeature parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static VideoInfo.VideoFeature parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(VideoInfo.VideoFeature prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code VideoFeature}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VideoFeature)
        VideoInfo.VideoFeatureOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return VideoInfo.internal_static_VideoFeature_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return VideoInfo.internal_static_VideoFeature_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                VideoInfo.VideoFeature.class, VideoInfo.VideoFeature.Builder.class);
      }

      // Construct using VideoInfo.VideoFeature.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        authorGender_ = 0;
        channelId_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return VideoInfo.internal_static_VideoFeature_descriptor;
      }

      @java.lang.Override
      public VideoInfo.VideoFeature getDefaultInstanceForType() {
        return VideoInfo.VideoFeature.getDefaultInstance();
      }

      @java.lang.Override
      public VideoInfo.VideoFeature build() {
        VideoInfo.VideoFeature result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public VideoInfo.VideoFeature buildPartial() {
        VideoInfo.VideoFeature result = new VideoInfo.VideoFeature(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(VideoInfo.VideoFeature result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.authorGender_ = authorGender_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.channelId_ = channelId_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof VideoInfo.VideoFeature) {
          return mergeFrom((VideoInfo.VideoFeature)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(VideoInfo.VideoFeature other) {
        if (other == VideoInfo.VideoFeature.getDefaultInstance()) return this;
        if (other.hasAuthorGender()) {
          setAuthorGender(other.getAuthorGender());
        }
        if (other.hasChannelId()) {
          setChannelId(other.getChannelId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                authorGender_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                channelId_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int authorGender_ ;
      /**
       * <code>optional int32 author_gender = 1;</code>
       * @return Whether the authorGender field is set.
       */
      @java.lang.Override
      public boolean hasAuthorGender() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 author_gender = 1;</code>
       * @return The authorGender.
       */
      @java.lang.Override
      public int getAuthorGender() {
        return authorGender_;
      }
      /**
       * <code>optional int32 author_gender = 1;</code>
       * @param value The authorGender to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorGender(int value) {

        authorGender_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 author_gender = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorGender() {
        bitField0_ = (bitField0_ & ~0x00000001);
        authorGender_ = 0;
        onChanged();
        return this;
      }

      private long channelId_ ;
      /**
       * <code>optional int64 channel_id = 2;</code>
       * @return Whether the channelId field is set.
       */
      @java.lang.Override
      public boolean hasChannelId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int64 channel_id = 2;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public long getChannelId() {
        return channelId_;
      }
      /**
       * <code>optional int64 channel_id = 2;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(long value) {

        channelId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 channel_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        channelId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:VideoFeature)
    }

    // @@protoc_insertion_point(class_scope:VideoFeature)
    private static final VideoInfo.VideoFeature DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new VideoInfo.VideoFeature();
    }

    public static VideoInfo.VideoFeature getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VideoFeature>
        PARSER = new com.google.protobuf.AbstractParser<VideoFeature>() {
      @java.lang.Override
      public VideoFeature parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<VideoFeature> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VideoFeature> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public VideoInfo.VideoFeature getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VideoFeature_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_VideoFeature_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020video_info.proto\"d\n\014VideoFeature\022\032\n\rau" +
      "thor_gender\030\001 \001(\005H\000\210\001\001\022\027\n\nchannel_id\030\002 \001" +
      "(\003H\001\210\001\001B\020\n\016_author_genderB\r\n\013_channel_id" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VideoFeature_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VideoFeature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_VideoFeature_descriptor,
        new java.lang.String[] { "AuthorGender", "ChannelId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
