package com.CoffeeCoding.CoffeeCodingAPI.mapper;

import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.MapperModelContext;
import com.github.dozermapper.core.MappingException;

public class DozerMapper {
    private static final Mapper mapper = new Mapper() {
        @Override
        public <T> T map(Object o, Class<T> aClass) throws MappingException {
            return null;
        }

        @Override
        public void map(Object o, Object o1) throws MappingException {

        }

        @Override
        public <T> T map(Object o, Class<T> aClass, String s) throws MappingException {
            return null;
        }

        @Override
        public void map(Object o, Object o1, String s) throws MappingException {

        }

        @Override
        public MapperModelContext getMapperModelContext() {
            return null;
        }
    };
}
