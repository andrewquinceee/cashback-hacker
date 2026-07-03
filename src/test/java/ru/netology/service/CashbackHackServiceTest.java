package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500WhenAmountIs2500() {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(2500);
        assertEquals(actual, expected);
    }
}