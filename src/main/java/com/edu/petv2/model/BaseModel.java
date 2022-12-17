package com.edu.petv2.model;



import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@Data
@MappedSuperclass
@EqualsAndHashCode
@NoArgsConstructor
public abstract class BaseModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
}
