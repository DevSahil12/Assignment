package com.example.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/bfhl")
public class Controller {

    private final ServiceData serviceData;

    public Controller(ServiceData serviceData) {
        this.serviceData = serviceData;
    }

    @GetMapping
    public ResponseEntity<?> getOperationCode() {
        return ResponseEntity.ok().body("{ \"operation_code\": 1 }");
    }

    @PostMapping
    public ResponseEntity<ResponseData> processData(@RequestBody RequestData requestData) {
        return ResponseEntity.ok((ResponseData) serviceData.processData(requestData));
    }
}
