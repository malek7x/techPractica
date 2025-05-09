package com.spring.techpractica.model.entity.techSkills;

import com.spring.techpractica.model.entity.Session;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "CATEGORIES")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

    @Id
    @Column(name = "category_name")
    private String categoryName;

    @ManyToMany(mappedBy = "sessionCategories")
    private List<Session> sessions;

    @ManyToMany(mappedBy = "categories")
    private List<Technology> technologies;
}
