package com.spring.techpractica.dto.session;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SessionCreatorRequest {

    private String nameSession;

    private String descriptionSession;

    private boolean isPrivateSession;

    private String category;


    private List<String> technologies;


    private List<String> fields;

}
