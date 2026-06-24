package com.example.PokemonAPI.controller;

import com.example.PokemonAPI.model.Pokemon;
import com.example.PokemonAPI.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemones")
public class PokemonController {


    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> obtenerTodos(){
        return pokemonService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Pokemon obtenerporID(@PathVariable  Long id){
    return pokemonService.obtenerporID(id);
    }

    @PostMapping
    public Pokemon crearPokemon(@RequestBody Pokemon pokemon){
       return pokemonService.crearPokemon(pokemon);
    }

    @PostMapping("/{id}")
    public Pokemon editarPokemon(@PathVariable Long id, @RequestBody Pokemon pokemon){
    return pokemonService.actualizarPokemonCompleto(id, pokemon);
    }

  
}
