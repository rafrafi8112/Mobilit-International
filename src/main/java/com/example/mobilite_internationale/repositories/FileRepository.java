package com.example.mobilite_internationale.repositories;

import com.example.mobilite_internationale.entities.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File,Integer> {
}
