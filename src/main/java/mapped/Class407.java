package mapped;

public final class Class407 implements Runnable {
   private static String[] field1765;
   public final long field1766;
   public final long field1767;
   public final Class2380 field1768;
   public final long field1769;
   public final Class2380 field1770;
   public final long field1771;

   public Class407(long var1, long var3, Class2380 var5, long var6, Class2380 var8, long var9) {
      this.field1766 = var1;
      this.field1767 = var3;
      this.field1768 = var5;
      this.field1769 = var6;
      this.field1770 = var8;
      this.field1771 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field1766; var3 < this.field1767; var3++) {
         this.field1768.method9714(this.field1769 + var3, this.field1770.method9710(this.field1771 + var3));
      }
   }
}
