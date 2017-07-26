package com.xsgj.proto.user;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: user.proto")
public final class UserInfoServiceGrpc {

  private UserInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "xsgj.UserInfoService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.xsgj.proto.user.UserId,
      com.xsgj.proto.user.UserInfo> METHOD_GET_USER_INFO_BY_ID =
      io.grpc.MethodDescriptor.<com.xsgj.proto.user.UserId, com.xsgj.proto.user.UserInfo>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "xsgj.UserInfoService", "getUserInfoById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.xsgj.proto.user.UserId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.xsgj.proto.user.UserInfo.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserInfoServiceStub newStub(io.grpc.Channel channel) {
    return new UserInfoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserInfoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserInfoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class UserInfoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getUserInfoById(com.xsgj.proto.user.UserId request,
        io.grpc.stub.StreamObserver<com.xsgj.proto.user.UserInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_INFO_BY_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_USER_INFO_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.xsgj.proto.user.UserId,
                com.xsgj.proto.user.UserInfo>(
                  this, METHODID_GET_USER_INFO_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserInfoServiceStub extends io.grpc.stub.AbstractStub<UserInfoServiceStub> {
    private UserInfoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInfoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInfoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getUserInfoById(com.xsgj.proto.user.UserId request,
        io.grpc.stub.StreamObserver<com.xsgj.proto.user.UserInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO_BY_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserInfoServiceBlockingStub extends io.grpc.stub.AbstractStub<UserInfoServiceBlockingStub> {
    private UserInfoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInfoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.xsgj.proto.user.UserInfo getUserInfoById(com.xsgj.proto.user.UserId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_INFO_BY_ID, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserInfoServiceFutureStub extends io.grpc.stub.AbstractStub<UserInfoServiceFutureStub> {
    private UserInfoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInfoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInfoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xsgj.proto.user.UserInfo> getUserInfoById(
        com.xsgj.proto.user.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO_BY_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_INFO_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserInfoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserInfoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INFO_BY_ID:
          serviceImpl.getUserInfoById((com.xsgj.proto.user.UserId) request,
              (io.grpc.stub.StreamObserver<com.xsgj.proto.user.UserInfo>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class UserInfoServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xsgj.proto.user.UserProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserInfoServiceDescriptorSupplier())
              .addMethod(METHOD_GET_USER_INFO_BY_ID)
              .build();
        }
      }
    }
    return result;
  }
}
