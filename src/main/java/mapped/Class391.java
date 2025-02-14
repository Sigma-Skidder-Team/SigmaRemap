package mapped;

public class Class391 implements Runnable {
   private static String[] field1660;
   public final long field1661;
   public final long field1662;
   public final long field1663;
   public final Class2378 field1664;
   public final Class8276 field1665;

   public Class391(Class8276 var1, long var2, long var4, long var6, Class2378 var8) {
      this.field1665 = var1;
      this.field1661 = var2;
      this.field1662 = var4;
      this.field1663 = var6;
      this.field1664 = var8;
   }

   @Override
   public void run() {
      long var3 = this.field1661 + Class8276.method28933(this.field1665) - 1L;

      for (long var5 = this.field1662; var5 < this.field1663; var5++) {
         long var7 = this.field1661 + var5;
         float var9 = this.field1664.method9651(var7);
         long var10 = var3 - var5;
         this.field1664.method9685(var7, this.field1664.method9651(var10));
         this.field1664.method9685(var10, var9);
      }
   }
}
