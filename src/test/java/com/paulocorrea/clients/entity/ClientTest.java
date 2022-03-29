package com.paulocorrea.clients.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static java.time.Month.JUNE;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class ClientTest {

    @Test
    public void shouldCalculateClientAge() {
        var client = new Client();
        client.setBirthDate(LocalDate.of(1989, JUNE, 19));
        assertEquals(32, client.getAge());
    }
}