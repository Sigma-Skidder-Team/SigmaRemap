package mapped;

public final class Class329 implements Runnable {
   private static String[] field1425;
   public final long field1426;
   public final long field1427;
   public final Class2384 field1428;
   public final long field1429;
   public final Class2384 field1430;
   public final long field1431;

   public Class329(long var1, long var3, Class2384 var5, long var6, Class2384 var8, long var9) {
      this.field1426 = var1;
      this.field1427 = var3;
      this.field1428 = var5;
      this.field1429 = var6;
      this.field1430 = var8;
      this.field1431 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field1426; var3 < this.field1427; var3++) {
         this.field1428.method9670(this.field1429 + var3, this.field1430.method9636(this.field1431 + var3));
      }
   }
}
