class Worker3 extends Thread {
  Semaphore s1, s2, s3;
  String name;

  public Worker3(String name, Semaphore s1, Semaphore s2, Semaphore s3) {
    this.name = name;
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  public void run() {
      s2.P();
        Main.shared_res -= 7;
        System.out.println("- Worker #3, " + name + ", works: [-7] state " + Main.shared_res);
        System.out.println("\n[i] Shared res. state: " + Main.shared_res + " - Prod. END\n\n");
      s3.V();
  }
}