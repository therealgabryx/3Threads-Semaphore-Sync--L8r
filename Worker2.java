class Worker2 extends Thread {
  Semaphore s1, s2, s3;
  String name;

  public Worker2(String name, Semaphore s1, Semaphore s2, Semaphore s3) {
    this.name = name;
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  public void run() {
    int wait = 200;

      s1.P();
        Main.shared_res += 3;
        System.out.println("+ Worker #2, " + name + ",  works: [+3] state " + Main.shared_res);
      s2.V();

      try {
        Thread.sleep(wait);
      } catch (Exception e) {}
  }
}