package mapped;

public class Class328 implements Runnable {
   private static String[] field1420;
   public final long field1421;
   public final long field1422;
   public final Class2381 field1423;
   public final Class7990 field1424;

   public Class328(Class7990 var1, long var2, long var4, Class2381 var6) {
      this.field1424 = var1;
      this.field1421 = var2;
      this.field1422 = var4;
      this.field1423 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field1421; var3 < this.field1422; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         double var9 = -this.field1423.method9653(var5) * Class7990.method27244(this.field1424).method9653(var7)
            + this.field1423.method9653(var7) * Class7990.method27244(this.field1424).method9653(var5);
         this.field1423
            .method9687(
               var5,
               this.field1423.method9653(var5) * Class7990.method27244(this.field1424).method9653(var5)
                  + this.field1423.method9653(var7) * Class7990.method27244(this.field1424).method9653(var7)
            );
         this.field1423.method9687(var7, var9);
      }
   }
}
