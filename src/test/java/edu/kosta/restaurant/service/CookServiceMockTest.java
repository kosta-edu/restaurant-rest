package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.Cook;
import edu.kosta.restaurant.service.CookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CookServiceMockTest {

    @Mock
    CookService cookService;

    @Mock
    Cook cook;

    @Test
    void createService() {
        assertNotNull(cookService);
    }

    @Test
    public void whenTest(){
        when(cook.getFirstName()).thenReturn("SungYeol");
        when(cook.getLastName()).thenReturn("Yun");
        assertTrue("SungYeol" == cook.getFirstName());
        assertTrue("Yun" == cook.getLastName());
    }

    @Test
    public void throwTest(){
        doThrow(new IllegalArgumentException()).when(cook).setFirstName(eq("SungYeol"));

        assertThrows(IllegalArgumentException.class, () -> {
            cook.setFirstName("SungYeol");
        });
    }

    @Test
    public void example(){
        cook.setFirstName("SungYeol");
        cook.setLastName("Yun");
        // n번 호출했는지 체크
        verify(cook, times(1)).setFirstName(any(String.class)); // success
        // 호출 안했는지 체크
        verify(cook, never()).getFirstName(); // success
        // verify(cook, never()).setFirstName(eq("SungYeol")); // fail
        // 최소한 1번 이상 호출했는지 체크
        verify(cook, atLeastOnce()).setFirstName(any(String.class)); // success
        // 2번 이하 호출 했는지 체크
        verify(cook, atMost(2)).setFirstName(any(String.class)); // success
        // 2번 이상 호출 했는지 체크
        // verify(cook, atLeast(2)).setFirstName(any(String.class)); // fail
        // 지정된 시간(millis)안으로 메소드를 호출 했는지 체크
        verify(cook, timeout(100)).setFirstName(any(String.class)); // success
        // 지정된 시간(millis)안으로 1번 이상 메소드를 호출 했는지 체크
        verify(cook, timeout(100).atLeast(1)).setFirstName(any(String.class)); // success
    }

}