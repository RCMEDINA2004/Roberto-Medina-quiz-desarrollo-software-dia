package repository;


import model.Motocicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface MotocicletaRepository extends JpaRepository<Motocicleta, String> {
    Optional<Motocicleta> findByPlacaMotocicleta(String placaMotocicleta);
    List<Motocicleta> findByCilindrajeMotocicleta(int cilindrajeMotocicleta);
}

