package service;

import model.Motocicleta;
import repository.MotocicletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotocicletaService {
    
    @Autowired
    private MotocicletaRepository motocicletaRepository;

    // Obtener todas las motocicletas
    public List<Motocicleta> getAllMotocicletas() {
        return motocicletaRepository.findAll();
    }

    // Crear una nueva motocicleta
    public Motocicleta saveMotocicleta(Motocicleta motocicleta) {
        return motocicletaRepository.save(motocicleta);
    }

    // Actualizar una motocicleta por su ID
    public Optional<Motocicleta> updateMotocicleta(String id, Motocicleta motocicletaDetails) {
        return motocicletaRepository.findById(id).map(motocicleta -> {
            motocicleta.setMarcaMotocicleta(motocicletaDetails.getMarcaMotocicleta());
            motocicleta.setPlacaMotocicleta(motocicletaDetails.getPlacaMotocicleta());
            motocicleta.setCilindrajeMotocicleta(motocicletaDetails.getCilindrajeMotocicleta());
            motocicleta.setPrecioMotocicleta(motocicletaDetails.getPrecioMotocicleta());
            motocicleta.setColorMotocicleta(motocicletaDetails.getColorMotocicleta());
            return motocicletaRepository.save(motocicleta);
        });
    }

    // Eliminar una motocicleta por su ID
    public void deleteMotocicleta(String id) {
        motocicletaRepository.deleteById(id);
    }

    // Buscar una motocicleta por su placa
    public Optional<Motocicleta> findByPlaca(String placa) {
        return motocicletaRepository.findByPlacaMotocicleta(placa);
    }

    // Obtener todas las motocicletas con un cilindraje específico
    public List<Motocicleta> findByCilindraje(int cilindraje) {
        return motocicletaRepository.findByCilindrajeMotocicleta(cilindraje);
    }
}