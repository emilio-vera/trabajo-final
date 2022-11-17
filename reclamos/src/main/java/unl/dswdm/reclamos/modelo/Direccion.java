package unl.dswdm.reclamos.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter
@Setter
public class Direccion {

	@Column(length = 30)
	String provincia;

	@Column(length = 30)
	String Calle;

	@Column(length = 20)
	String referencia;

}
