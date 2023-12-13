package org.example.incrementrInThreads;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

class CounterThread implements Runnable {
    private final AtomicInteger counter;

    CounterThread(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (counter) {
                int currentValue = counter.get();
                if (currentValue >= IncrementInTreads.MAX_COUNT) {
                    break;
                }

                int newValue = currentValue + 1;
                counter.set(newValue);

                System.out.println(
                        "Current Value: " + currentValue +
                                ", New Value: " + newValue +
                                ", Thread Id: " + Thread.currentThread().getId()
                );

                try (FileWriter fileWriter = new FileWriter(IncrementInTreads.FILE_NAME)) {
                    fileWriter.write(String.valueOf(newValue));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            Thread.yield();
        }
    }
}
