package mapped;

public final class Class483 implements Runnable {
   private static String[] field2263;
   public final long field2264;
   public final long field2265;
   public final long field2266;
   public final Class2378 field2267;
   public final Class2378 field2268;
   public final long field2269;

   public Class483(long var1, long var3, long var5, Class2378 var7, Class2378 var8, long var9) {
      this.field2264 = var1;
      this.field2265 = var3;
      this.field2266 = var5;
      this.field2267 = var7;
      this.field2268 = var8;
      this.field2269 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field2264 + this.field2265;
      long var5 = 1L;
      long var7 = this.field2266;

      while (var7 > 512L) {
         var7 >>= 2;
         var5 <<= 2;
         Class7796.method26009(var7, this.field2267, var3 - var7, this.field2268, this.field2269 - var7);
      }

      Class7796.method26005(var7, 0L, this.field2267, var3 - var7, this.field2269, this.field2268);
      var5 >>= 1;
      long var9 = this.field2264 - var7;

      for (long var11 = this.field2265 - var7; var11 > 0L; var11 -= var7) {
         long var13 = Class7796.method26003(var7, var11, ++var5, this.field2267, this.field2264, this.field2269, this.field2268);
         Class7796.method26005(var7, var13, this.field2267, var9 + var11, this.field2269, this.field2268);
      }
   }
}
