package mapped;

public class Class1602 implements Runnable {
   private static String[] field8678;
   public final long field8679;
   public final long field8680;
   public final Class2385 field8681;
   public final Class2385 field8682;
   public final Class2385 field8683;

   public Class1602(Class2385 var1, long var2, long var4, Class2385 var6, Class2385 var7) {
      this.field8683 = var1;
      this.field8679 = var2;
      this.field8680 = var4;
      this.field8681 = var6;
      this.field8682 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field8679; var3 < this.field8680; var3++) {
         this.field8681.method9675(var3, (byte)(this.field8683.method9641(var3) & this.field8682.method9641(var3)));
      }
   }
}
