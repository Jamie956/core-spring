package org.example.circular_references2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService3 {

    @Autowired
    private TestService1 testService1;

    public void test3() {
    }
}