package xloproject001.xloProject001.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xloproject001.xloProject001.model.Color;
import xloproject001.xloProject001.repositories.ColorRepository;

@Repository
public interface SqlColorRepository extends ColorRepository, JpaRepository<Color, Integer> {
}
