package mapped;

public class Class539 implements Runnable {
   private static String[] field2580;
   public final long field2581;
   public final long field2582;
   public final Class2385 field2583;
   public final Class2385 field2584;

   public Class539(Class2385 var1, long var2, long var4, Class2385 var6) {
      this.field2584 = var1;
      this.field2581 = var2;
      this.field2582 = var4;
      this.field2583 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field2581; var3 < this.field2582; var3++) {
         this.field2583.method9675(var3, (byte)(1 - this.field2584.method9641(var3)));
      }
   }
}
