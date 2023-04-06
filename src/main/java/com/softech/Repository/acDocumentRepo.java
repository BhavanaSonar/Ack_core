package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.acDocuments;

@Repository
public interface acDocumentRepo extends JpaRepository<acDocuments, Long> {

}
