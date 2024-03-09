package app.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) {
        if (Objects.equals(name, "")) {
            return ResponseEntity.badRequest().body("Name is required");
        }
        return ResponseEntity.ok(name);
    }

    @PostMapping
    public ResponseEntity<String> helloPost(@RequestBody String username) {
        if (Objects.equals(username, "")) {
            return ResponseEntity.badRequest().body("Name is required");
        }
        return ResponseEntity.ok(username);
    }
}
