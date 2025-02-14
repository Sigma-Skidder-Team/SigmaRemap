package mapped;

public class Class645 implements Runnable {
   private static String[] field3225;
   public final long field3226;
   public final long field3227;
   public final Class2378 field3228;
   public final long field3229;
   public final Class2378 field3230;
   public final Class8431 field3231;

   public Class645(Class8431 var1, long var2, long var4, Class2378 var6, long var7, Class2378 var9) {
      this.field3231 = var1;
      this.field3226 = var2;
      this.field3227 = var4;
      this.field3228 = var6;
      this.field3229 = var7;
      this.field3230 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3226; var3 < this.field3227; var3++) {
         long var5 = 2L * var3;
         float var7 = this.field3228.method9651(this.field3229 + var3);
         this.field3230.method9685(var5, Class8431.method29642(this.field3231).method9651(var5) * var7);
         this.field3230.method9685(var5 + 1L, -Class8431.method29642(this.field3231).method9651(var5 + 1L) * var7);
      }
   }
}
