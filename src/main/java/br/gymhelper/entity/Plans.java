package br.gymhelper.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plans")
public class Plans {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="exercise")
    private String exercise;
    @Column(name ="reps")
    private Integer reps;
    @Column(name ="series")
    private Integer series;
    @Column(name ="scale")
    private String scale;
    @Column(name ="description")
    private String description;

}
