package unl.dswdm.reclamos.modelo;

import java.io.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Usuario extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Hidden // La propiedad no se muestra al usuario. Es un identificador interno
	@GeneratedValue(generator = "system-uuid") // Identificador Universal Único (1)
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	private String id;

	@Column(length = 32)
	@Required
	private String codigoUsuario;
}
