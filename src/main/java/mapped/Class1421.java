package mapped;

public final class Class1421 implements Runnable {
   private static String[] field7616;
   public final long field7617;
   public final long field7618;
   public final long field7619;
   public final Class2378 field7620;
   public final Class2378 field7621;
   public final long field7622;

   public Class1421(long var1, long var3, long var5, Class2378 var7, Class2378 var8, long var9) {
      this.field7617 = var1;
      this.field7618 = var3;
      this.field7619 = var5;
      this.field7620 = var7;
      this.field7621 = var8;
      this.field7622 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field7617 + this.field7618;
      long var5 = this.field7619;

      while (var5 > 512L) {
         var5 >>= 2;
         Class7796.method26007(var5, this.field7620, var3 - var5, this.field7621, this.field7622 - (var5 >> 1));
      }

      Class7796.method26005(var5, 1L, this.field7620, var3 - var5, this.field7622, this.field7621);
      long var7 = 0L;
      long var9 = this.field7617 - var5;

      for (long var11 = this.field7618 - var5; var11 > 0L; var11 -= var5) {
         long var13 = Class7796.method26003(var5, var11, ++var7, this.field7620, this.field7617, this.field7622, this.field7621);
         Class7796.method26005(var5, var13, this.field7620, var9 + var11, this.field7622, this.field7621);
      }
   }
}
