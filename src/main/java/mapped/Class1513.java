package mapped;

public final class Class1513 implements Runnable {
   private static String[] field8182;
   public final long field8183;
   public final long field8184;
   public final Class2381 field8185;
   public final long field8186;
   public final Class2381 field8187;
   public final long field8188;

   public Class1513(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9) {
      this.field8183 = var1;
      this.field8184 = var3;
      this.field8185 = var5;
      this.field8186 = var6;
      this.field8187 = var8;
      this.field8188 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8183; var3 < this.field8184; var3++) {
         this.field8185.method9687(this.field8186 + var3, this.field8187.method9653(this.field8188 + var3));
      }
   }
}
