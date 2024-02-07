package com.learn.jpa.repo;

import com.learn.jpa.entity.Engine;
import com.learn.jpa.entity.QEngine;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EngineRepoImpl {
    @Autowired
    JPAQueryFactory jpaQueryFactory;

    QEngine engine= QEngine.engine;

    public Engine findById(int id){
        return jpaQueryFactory.selectFrom(engine).where(engine.Id.eq(id)).fetchFirst();
    }


}
