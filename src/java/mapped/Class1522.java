package mapped;

public final class Class1522 implements Runnable {
   private static String[] field8242;
   public final long field8243;
   public final long field8244;
   public final Class2374 field8245;
   public final long field8246;
   public final Class2374 field8247;
   public final long field8248;

   public Class1522(long var1, long var3, Class2374 var5, long var6, Class2374 var8, long var9) {
      this.field8243 = var1;
      this.field8244 = var3;
      this.field8245 = var5;
      this.field8246 = var6;
      this.field8247 = var8;
      this.field8248 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8243; var3 < this.field8244; var3++) {
         this.field8245.method9675(this.field8246 + var3, this.field8247.method9641(this.field8248 + var3));
      }
   }
}
