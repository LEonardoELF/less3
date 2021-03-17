package org.hse.example;

import org.hse.example.service.NearestTicketsBuilder;
import org.hse.example.service.TicketCounterServiceImpl;
import org.hse.example.service.TicketService;
import org.hse.example.service.TicketServiceBuilder;

/**
 * Реализация примера со счастливыми билетами
 */
public class TicketsExample {

    /**
     * Точка входа
     *
     * @param args строка аргументов. В настоящее время не используется
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TicketServiceBuilder builder = () -> 6;

        builder.build().doWork().printResult();
    }

}
