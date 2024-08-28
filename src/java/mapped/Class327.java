package mapped;

public final class Class327 implements Runnable {
   private static String[] field1413;
   public final long field1414;
   public final long field1415;
   public final Class2376 field1416;
   public final long field1417;
   public final Class2376 field1418;
   public final long field1419;

   public Class327(long var1, long var3, Class2376 var5, long var6, Class2376 var8, long var9) {
      this.field1414 = var1;
      this.field1415 = var3;
      this.field1416 = var5;
      this.field1417 = var6;
      this.field1418 = var8;
      this.field1419 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field1414; var3 < this.field1415; var3++) {
         this.field1416.method9681(this.field1417 + var3, this.field1418.method9647(this.field1419 + var3));
      }
   }
}
