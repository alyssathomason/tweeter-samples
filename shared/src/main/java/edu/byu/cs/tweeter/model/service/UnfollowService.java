package edu.byu.cs.tweeter.model.service;

import java.io.IOException;

import edu.byu.cs.tweeter.model.net.TweeterRemoteException;
import edu.byu.cs.tweeter.model.service.request.UnfollowRequest;
import edu.byu.cs.tweeter.model.service.response.UnfollowResponse;

/**
 * Contains the business logic to support the Unfollow operation.
 */
public interface UnfollowService {

    UnfollowResponse unfollow(UnfollowRequest request) throws IOException, TweeterRemoteException;

}
