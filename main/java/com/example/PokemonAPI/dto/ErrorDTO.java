package com.example.PokemonAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorDTO {
   private String message;
   private List<String> details;
   private LocalDateTime fecha;



}
