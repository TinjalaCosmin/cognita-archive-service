package com.hybridco.cognitaarchiveservice;

import com.hybridco.cognitaarchiveservice.test.Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    private Service service;

    @Test
    void tester() {
        when(service.get()).thenReturn("helllo");
        var test = service.get();
        assertThat(test).isEqualTo("helllo");
    }
}
