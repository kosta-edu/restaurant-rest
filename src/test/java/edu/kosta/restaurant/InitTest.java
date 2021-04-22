package edu.kosta.restaurant;

import org.junit.jupiter.api.*;

public class InitTest {

    @BeforeAll
    static void setup() {
        System.out.println("BeforeAll");
    }
    @BeforeEach
    void init() {
        System.out.println("BeforeEach");
    }

    @AfterAll
    static void done() {
        System.out.println("AfterAll");
    }
    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @DisplayName("실행")
    @Test
    void run() {
        System.out.println("Run");
    }

    @DisplayName("넘어가기")
    @Test
    @Disabled
    void ignore() {
        System.out.println("Ignore");
    }

}
