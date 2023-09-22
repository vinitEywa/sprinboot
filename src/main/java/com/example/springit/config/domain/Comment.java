package com.example.springit.config.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    @ManyToOne
    private Link link;

}
