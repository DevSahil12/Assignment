package com.example.api;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ServiceData {

    public ResponseData processData(RequestData requestData) {
        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        for (String item : requestData.getData()) {
            if (item.matches("\\d+")) {
                numbers.add(item);
            } else if (item.matches("[a-zA-Z]")) {
                alphabets.add(item);
            }
        }

        List<String> highestAlphabet = alphabets.isEmpty() ? Collections.emptyList() :
                List.of(Collections.max(alphabets, String.CASE_INSENSITIVE_ORDER));

        return new ResponseData(
                true,
                "john_doe_17091999",
                "john@xyz.com",
                "ABCD123",
                numbers,
                alphabets,
                highestAlphabet
        );
    }
}
