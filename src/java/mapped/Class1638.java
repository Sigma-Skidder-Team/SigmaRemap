package mapped;

public final class Class1638 implements Runnable {
   private static String[] field8891;
   public final long field8892;
   public final long field8893;
   public final long field8894;
   public final Class2381 field8895;
   public final Class2381 field8896;
   public final long field8897;

   public Class1638(long var1, long var3, long var5, Class2381 var7, Class2381 var8, long var9) {
      this.field8892 = var1;
      this.field8893 = var3;
      this.field8894 = var5;
      this.field8895 = var7;
      this.field8896 = var8;
      this.field8897 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field8892 + this.field8893;
      long var5 = this.field8894;

      while (var5 > 512L) {
         var5 >>= 2;
         Class7796.method25949(var5, this.field8895, var3 - var5, this.field8896, this.field8897 - (var5 >> 1));
      }

      Class7796.method25947(var5, 1L, this.field8895, var3 - var5, this.field8897, this.field8896);
      long var7 = 0L;
      long var9 = this.field8892 - var5;

      for (long var11 = this.field8893 - var5; var11 > 0L; var11 -= var5) {
         long var13 = Class7796.method25945(var5, var11, ++var7, this.field8895, this.field8892, this.field8897, this.field8896);
         Class7796.method25947(var5, var13, this.field8895, var9 + var11, this.field8897, this.field8896);
      }
   }
}
