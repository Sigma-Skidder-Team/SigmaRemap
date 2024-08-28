package mapped;

public class Class9147 {
   private static String[] field42023;
   private int field42024;
   private int field42025;

   public Class9147(int var1) {
      this.field42024 = var1;
      this.field42025 = var1;
   }

   public synchronized int method34165() {
      return this.field42025++;
   }

   public synchronized void method34166() {
      this.field42025 = this.field42024;
   }

   public int method34167() {
      return this.field42025;
   }
}
