// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.xsgj.proto.user;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xsgj_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xsgj_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xsgj_UserId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xsgj_UserId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\004xsgj\"5\n\010UserInfo\022\n\n\002id\030\001 \001" +
      "(\005\022\014\n\004name\030\002 \001(\t\022\017\n\007opendId\030\003 \001(\t\"\024\n\006Use" +
      "rId\022\n\n\002id\030\001 \001(\0052D\n\017UserInfoService\0221\n\017ge" +
      "tUserInfoById\022\014.xsgj.UserId\032\016.xsgj.UserI" +
      "nfo\"\000B(\n\023com.xsgj.proto.userB\tUserProtoP" +
      "\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_xsgj_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xsgj_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xsgj_UserInfo_descriptor,
        new java.lang.String[] { "Id", "Name", "OpendId", });
    internal_static_xsgj_UserId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_xsgj_UserId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xsgj_UserId_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}