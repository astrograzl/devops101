package com.gfa.devops.models.art;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "praxs")
public class Practixing implements Activity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;
    private String link;
    private String title;
    private String description;
    private Timestamp begin;
    private Timestamp finish;
    public long getDuration() {
        return this.finish.getTime() - this.begin.getTime();
    }
}
