package unl.dswdm.reclamos.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class TipoReclamo {

	// @GeneratedValue(strategy = GenerationType.IDENTITY)

	@Id
	@Hidden // La propiedad no se muestra al usuario. Es un identificador interno
	@GeneratedValue(generator = "system-uuid") // Identificador Universal Único (1)
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	private String id;

	@Column(length = 50)
	@Required
	private String descripcion;

}