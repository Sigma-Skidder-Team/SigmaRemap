package mapped;

public class Class1394 implements Runnable {
   private static String[] field7448;
   public final long field7449;
   public final long field7450;
   public final Class2385 field7451;
   public final Class2385 field7452;
   public final Class2385 field7453;

   public Class1394(Class2385 var1, long var2, long var4, Class2385 var6, Class2385 var7) {
      this.field7453 = var1;
      this.field7449 = var2;
      this.field7450 = var4;
      this.field7451 = var6;
      this.field7452 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field7449; var3 < this.field7450; var3++) {
         this.field7451.method9675(var3, (byte)(this.field7453.method9641(var3) ^ this.field7452.method9641(var3)));
      }
   }
}
