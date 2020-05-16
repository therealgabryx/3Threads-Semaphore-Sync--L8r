class Main {
  protected static int shared_res;

  public static void main(String[] args) {
    Semaphore s1 = new Semaphore(0);
    Semaphore s2 = new Semaphore(0);
    Semaphore s3 = new Semaphore(1);

    // LGHX-Workers code implementation using Semaphores

    for (int i = 0; i < 5; i++) {
      Worker1 w1 = new Worker1("Jeff", s1, s2, s3);
      Worker2 w2 = new Worker2("Bob", s1, s2, s3);
      Worker3 w3 = new Worker3("Alex", s1, s2, s3);

      w1.start();
      w2.start();
      w3.start();
    }
  }
}