package controller;

import model.Motocicleta;
import service.MotocicletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/motocicletas")
public class MotocicletaController {

    @Autowired
    private MotocicletaService motocicletaService;

    // Obtener todas las motocicletas
    @GetMapping
    public List<Motocicleta> getAllMotocicletas() {
        return motocicletaService.getAllMotocicletas();
    }

    // Crear una nueva motocicleta
    @PostMapping
    public Motocicleta createMotocicleta(@RequestBody Motocicleta motocicleta) {
        return motocicletaService.saveMotocicleta(motocicleta);
    }

    // Actualizar una motocicleta por su ID
    @PutMapping("/{id}")
    public ResponseEntity<Motocicleta> updateMotocicleta(@PathVariable String id, @RequestBody Motocicleta motocicletaDetails) {
        Optional<Motocicleta> updatedMotocicleta = motocicletaService.updateMotocicleta(id, motocicletaDetails);
        return updatedMotocicleta.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar una motocicleta por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMotocicleta(@PathVariable String id) {
        motocicletaService.deleteMotocicleta(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar una motocicleta por su placa
    @GetMapping("/placa/{placa}")
    public ResponseEntity<Motocicleta> getByPlaca(@PathVariable String placa) {
        Optional<Motocicleta> motocicleta = motocicletaService.findByPlaca(placa);
        return motocicleta.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Obtener todas las motocicletas con un cilindraje específico
    @GetMapping("/cilindraje/{cilindraje}")
    public List<Motocicleta> getByCilindraje(@PathVariable int cilindraje) {
        return motocicletaService.findByCilindraje(cilindraje);
    }
}
