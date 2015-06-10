package com.nwchecker.server.service;

import java.util.List;


public interface PageTrackingService {
    void addTrack(String username, String viewName, String sessionId);

    String getPathByUsername(String username);

    String getSessionByUsername(String username);
}