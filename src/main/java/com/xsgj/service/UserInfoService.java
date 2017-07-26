package com.xsgj.service;

import com.xsgj.proto.user.UserId;
import com.xsgj.proto.user.UserInfo;
import com.xsgj.proto.user.UserInfoServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * Created by Ido on 2017/7/26.
 */
public class UserInfoService extends UserInfoServiceGrpc.UserInfoServiceImplBase {
    @Override
    public void getUserInfoById(UserId request, StreamObserver<UserInfo> responseObserver) {
        super.getUserInfoById(request, responseObserver);
    }
}
