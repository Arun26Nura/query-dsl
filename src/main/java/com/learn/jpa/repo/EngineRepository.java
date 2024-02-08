package com.learn.jpa.repo;

import com.learn.jpa.entity.Engine;
import com.learn.jpa.entity.QEngine;
import com.learn.jpa.entity.QMotorcycle;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EngineRepository {
    @Autowired
    JPAQueryFactory jpaQueryFactory;

    QEngine engine= QEngine.engine;
    QMotorcycle motorcycle= QMotorcycle.motorcycle;

    public Engine findById(int id){
        return jpaQueryFactory.selectFrom(engine).where(engine.Id.eq(id)).fetchFirst();
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
