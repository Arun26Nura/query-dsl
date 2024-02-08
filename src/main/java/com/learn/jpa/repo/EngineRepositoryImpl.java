package com.learn.jpa.repo;

import com.learn.jpa.entity.Engine;
import com.learn.jpa.entity.QEngine;
import com.learn.jpa.entity.QMotorcycle;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EngineRepositoryImpl extends SimpleJpaRepository<Engine,Integer>  {
    @Autowired
    JPAQueryFactory jpaQueryFactory;

    QEngine engine= QEngine.engine;
    QMotorcycle motorcycle= QMotorcycle.motorcycle;

    public EngineRepositoryImpl( EntityManager entityManager) {
        super(Engine.class, entityManager);
    }


    public List<String> findByType(String type, String modelName){
        return  jpaQueryFactory
                .select(Projections.constructor(String.class,engine.capacity))
                .from(engine,motorcycle)
                .join(motorcycle.engine)
                .where(engine.engineType.eq(type).and(motorcycle.modelName.eq(modelName)))
                .fetch();

    }





}
