package com.oreilly.persistence.dao;

import java.util.Collection;
import com.oreilly.persistence.entities.Officer;

public interface OfficerDAO {
    Officer save(Officer officer);
    Officer findOne(Integer id);
    Collection<Officer> findAll();
    Long count();
    void delete(Officer officer);
    boolean exists(Integer id);
}
