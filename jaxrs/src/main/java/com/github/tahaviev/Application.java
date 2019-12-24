package com.github.tahaviev;

import com.github.tahaviev.api.TestApiImpl;

import java.util.Collections;
import java.util.Set;

public final class Application extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Collections.singleton(TestApiImpl.class);
    }

}
