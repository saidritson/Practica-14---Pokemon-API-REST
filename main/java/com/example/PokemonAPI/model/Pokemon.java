package com.example.PokemonAPI.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "el nombre es obligatorio")
    @Size(min = 2, max = 10, message = "no cumple con la cantidad de caracteres")
    private String nombre;

    @NotBlank(message = "debe ser obligatorio y no puede ser nulo")
    private String tipo;
    @NotNull(message = "el nivel debe ser obligatorio y no puede ser nulo")
    @Min(value = 1, message = "el nivel minimo debe ser 1")
    @Max(value = 1000, message = "debe ser hasta 1000")
    private Integer nivel;
    @Min(value = 0, message = "no puede ser negativo el ataque")
    private Integer ataque;
    @Min(value = 0, message = "no puede ser negativo la defensa")
    private Integer defensa;
    @Size(max = 255, message = "no puede exceder los 255 caracteres")
    private String descripcion;
    @URL(message = "la imagen debe ser una URL")
    private String imagenUrl;
//    @Email(message = "el formato del correo debe ser valido")
//    private String correoEntrenador;

}