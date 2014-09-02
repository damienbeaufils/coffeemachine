package com.octo.tdd.coffeemachine;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SomeServiceTests {

    @Test
    public void someMethod_ShouldReturnTrue() {
        // Given
        SomeService someService = new SomeServiceImpl();

        // When
        boolean result = someService.someMethod();

        // Then
        assertThat(result).isEqualTo(true);
    }

}
