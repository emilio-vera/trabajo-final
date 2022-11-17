package unl.dswdm.reclamos.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@MappedSuperclass
@Getter
@Setter
public class Persona {

	@Column(length = 16)
	private String identificacion;

	@Column(length = 50)
	@Required
	private String nombres;

	@Column(length = 50)
	@Required
	private String primerApellido;

	@Column(length = 50)
	@Required
	private String segundoApellido;

	@Column(length = 10)
	private String telefono;

	@Column(length = 100)
	private String correo;

}
