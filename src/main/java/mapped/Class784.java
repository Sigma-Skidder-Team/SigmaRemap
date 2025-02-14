package mapped;

public final class Class784 implements Runnable {
   private static String[] field4101;
   public final long field4102;
   public final long field4103;
   public final Class2378 field4104;
   public final long field4105;
   public final Class2378 field4106;
   public final long field4107;

   public Class784(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9) {
      this.field4102 = var1;
      this.field4103 = var3;
      this.field4104 = var5;
      this.field4105 = var6;
      this.field4106 = var8;
      this.field4107 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field4102; var3 < this.field4103; var3++) {
         this.field4104.method9685(this.field4105 + var3, this.field4106.method9651(this.field4107 + var3));
      }
   }
}
