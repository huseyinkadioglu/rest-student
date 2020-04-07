package com.huseyink.spring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
@ToString
public class Speech {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column( name = "title" )
    private String title;

    @Column( name = "description" )
    private String description;
    @Column( name = "details" )
    private String details;
    @Column( name = "date" )
    @Temporal( TemporalType.TIMESTAMP )
    private Date date;
    @Column( name = "speech_status" )
    @Enumerated( EnumType.STRING )
    private SpeechStatus speechStatus;


}
