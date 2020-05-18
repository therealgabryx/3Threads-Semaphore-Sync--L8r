class Worker1 extends Thread {
  Semaphore s1, s2, s3;
  String name;

  public Worker1(String name, Semaphore s1, Semaphore s2, Semaphore s3) {
    this.name = name;
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  public void run() {
      s3.P();
        Main.shared_res = 0;
        System.out.println("\n[i] Shared res. state: " + Main.shared_res + " - Prod. START\n");
        Main.shared_res += 4;
        System.out.println("+ Worker #1, " + name + ", works: [+4] state " + Main.shared_res);
      s1.V();
  }
}