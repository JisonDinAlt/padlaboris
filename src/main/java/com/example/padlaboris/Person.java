package com.example.padlaboris;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import java.util.Date;


@Data
@Entity
public class Person {
@Id
private String Id;
private String FirstName;
private String LastName;
@Temporal(javax.persistence.TemporalType.TIMESTAMP)
private Date BirthDate;


}
