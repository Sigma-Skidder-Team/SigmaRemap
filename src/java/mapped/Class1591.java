package mapped;

public class Class1591 implements Runnable {
   private static String[] field8620;
   public final long field8621;
   public final long field8622;
   public final Class2385 field8623;
   public final Class2385 field8624;
   public final Class2385 field8625;

   public Class1591(Class2385 var1, long var2, long var4, Class2385 var6, Class2385 var7) {
      this.field8625 = var1;
      this.field8621 = var2;
      this.field8622 = var4;
      this.field8623 = var6;
      this.field8624 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field8621; var3 < this.field8622; var3++) {
         this.field8623.method9675(var3, (byte)(this.field8625.method9641(var3) | this.field8624.method9641(var3)));
      }
   }
}
