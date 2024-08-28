package mapped;

public final class Class462 implements Runnable {
   private static String[] field2128;
   public final long field2129;
   public final long field2130;
   public final Class2379 field2131;
   public final long field2132;
   public final Class2379 field2133;
   public final long field2134;

   public Class462(long var1, long var3, Class2379 var5, long var6, Class2379 var8, long var9) {
      this.field2129 = var1;
      this.field2130 = var3;
      this.field2131 = var5;
      this.field2132 = var6;
      this.field2133 = var8;
      this.field2134 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2129; var3 < this.field2130; var3++) {
         this.field2131.method9670(this.field2132 + var3, this.field2133.method9636(this.field2134 + var3));
      }
   }
}
