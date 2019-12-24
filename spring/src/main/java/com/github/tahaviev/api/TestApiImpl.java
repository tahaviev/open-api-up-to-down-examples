package com.github.tahaviev.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class TestApiImpl implements TestApi {

    @Override
    public ResponseEntity<String> testOperationId() {
        return ResponseEntity.ok("Hello world");
    }

}
