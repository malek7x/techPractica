package com.spring.techpractica.maper;

import com.spring.techpractica.dto.session.SessionCreatorRequest;
import com.spring.techpractica.dto.session.SessionResponse;
import com.spring.techpractica.model.entity.Session;
import com.spring.techpractica.model.entity.techSkills.Technology;

import java.util.ArrayList;
import java.util.List;

public class SessionMapper {

    private SessionMapper() {
    }

    public static Session sessionCreatorToSession(SessionCreatorRequest sessionCreatorRequest) {

        return Session.builder()
                .sessionName(sessionCreatorRequest.getNameSession())
                .sessionDescription(sessionCreatorRequest.getDescriptionSession())
                .isPrivate(sessionCreatorRequest.isPrivateSession())
                .sessionCategories(new ArrayList<>())
                .sessionRequests(new ArrayList<>())
                .sessionRequirements(new ArrayList<>())
                .sessionMembers(new ArrayList<>())
                .timestampList(new ArrayList<>())
                .sessionTechnologies(new ArrayList<>())
                .build();
    }

    public static SessionResponse sessionToSessionResponse(Session session) {
        return SessionResponse.
                builder()
                .sessionName(session.getSessionName())
                .sessionDescription(session.getSessionDescription())
                .category(session.getSessionCategories().getFirst().getCategoryName())
                .technologies(session.getSessionTechnologies().stream()
                        .map(Technology::getTechnologyName).toList())
                .build();
    }

    public static List<SessionResponse> sessionsToSessionResponses(List<Session> sessions) {
        return sessions.
                stream()
                .map(SessionMapper::sessionToSessionResponse)
                .toList();
    }

}
