package mapped;

public class Class1606 implements Runnable {
   private static String[] field8700;
   public final long field8701;
   public final long field8702;
   public final long field8703;
   public final long field8704;
   public final Class2378 field8705;
   public final Class8630 field8706;

   public Class1606(Class8630 var1, long var2, long var4, long var6, long var8, Class2378 var10) {
      this.field8706 = var1;
      this.field8701 = var2;
      this.field8702 = var4;
      this.field8703 = var6;
      this.field8704 = var8;
      this.field8705 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field8701; var3 < this.field8702; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field8703 + (this.field8704 - var5) % this.field8704;
         this.field8705.method9685(var7, this.field8705.method9651(this.field8703 + var5));
         this.field8705.method9685(var7 + 1L, -this.field8705.method9651(this.field8703 + var5 + 1L));
      }
   }
}
