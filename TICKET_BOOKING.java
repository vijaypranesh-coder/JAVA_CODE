class ReservationThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ticket"+i+"Reservation in progress...: ");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Reservation thread interrupted.");
        }
    }
}

class StatusThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ticket" +i+ "Confirmed");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Status thread interrupted.");
        }
    }
}

public class Experiments {

    public static void main(String[] args) {

        ReservationThread r = new ReservationThread();

        StatusThread s = new StatusThread();
        Thread th = new Thread(s);

        r.start();
        th.start();
    }
}