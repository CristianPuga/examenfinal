package com.hackathongestamp2020.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ventas")
public class RestVentas {

    @Autowired
    private VentasRepository repository;

    @GetMapping
    List<Ventas> all() {
        return repository.findAll();
    }
/*
    @PostMapping
    Ventas newPokemon(@Valid @RequestBody Ventas ventas) {
        return repository.save(ventas);
    }
*/
    @GetMapping("/{id}")
    Optional<Ventas> one(@PathVariable String id) {

        return repository.findById(id);
               // .orElseThrow(() -> new VentasNotFoundException(id));
    }

/*
    @PutMapping("/{id}")
    Ventas replacePokemon(@Valid @RequestBody Ventas ventas, @PathVariable String id) {


        return repository.findById(id);
                .map(ventas -> {
                    ventas.name=pokemon.name;
                    ventas.type=pokemon.type;
                    return repository.save(pokemon);
                })
                .orElseGet(() -> {
                    pokemon.id=id;
                    return repository.save(pokemon);
                });


    }
*/
    /*@DeleteMapping("/{id}")
    Ventas deletePokemon(@PathVariable String id) {
        Optional<Ventas> ventas = repository.findById(id);
        repository.deleteById(id);
        return ventas.get();
    }
*/
}
