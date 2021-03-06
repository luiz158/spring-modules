package com.ninjaapp.students.dao;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: Daniel
 */
@Target( {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD} )
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface RepositoryQualifier {
    RepositoryType repositoryType();
}
