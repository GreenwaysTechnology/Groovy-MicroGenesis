package com.microgenesis.oo

class Task {
    private void startMicroTask() {
        println(Thread.currentThread().getName());
    }
    public void startTask() {
        Thread thread = null;
        thread = new Thread(new Runnable() {
            @Override
            void run() {
                //thread logic
                println Thread.currentThread().getName();
            }
        });
        thread.start();
        //method reference operator to eleminate the above code.
        thread = new Thread(this::startMicroTask)
        thread.start();

    }

}
