package com.gerardo.microservicio.Util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="Microservicio", url="http://localhost:8080")
public interface MicroServiceUtil {
    @GetMapping("/productos")
    String getAll();
}
