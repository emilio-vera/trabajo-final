package unl.dswdm.reclamos.modelo;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Reclamo {

	@Id
	@Hidden // La propiedad no se muestra al usuario. Es un identificador interno
	@GeneratedValue(generator = "system-uuid") // Identificador Universal �nico (1)
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	private String id;

	@ManyToOne( // La referencia se almacena como una relaci�n en la base de datos
			fetch = FetchType.LAZY, // La referencia se carga bajo demanda
			optional = true) // La referencia puede estar sin valor
	@DescriptionsList // As� la referencia se visualiza usando un combo
	TipoReclamo tipoReclamo;

	@ManyToOne( // La referencia se almacena como una relaci�n en la base de datos
			fetch = FetchType.LAZY, // La referencia se carga bajo demanda
			optional = true) // La referencia puede estar sin valor
	@DescriptionsList(descriptionProperties = "nombres") // As� la referencia se visualiza usando un combo
	Cliente cliente;

	@ManyToOne( // La referencia se almacena como una relaci�n en la base de datos
			fetch = FetchType.LAZY, // La referencia se carga bajo demanda
			optional = true) // La referencia puede estar sin valor
	@DescriptionsList(descriptionProperties = "codigoUsuario") // As� la referencia se visualiza usando un combo
	Usuario usuario;

	private Date fechaReclamo;

	@Column(length = 32)
	@TextArea
	private String comentario;

}
