package mapped;

public final class Class1629 implements Runnable {
   private static String[] field8831;
   public final long field8832;
   public final long field8833;
   public final Class2377 field8834;
   public final long field8835;
   public final Class2377 field8836;
   public final long field8837;

   public Class1629(long var1, long var3, Class2377 var5, long var6, Class2377 var8, long var9) {
      this.field8832 = var1;
      this.field8833 = var3;
      this.field8834 = var5;
      this.field8835 = var6;
      this.field8836 = var8;
      this.field8837 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8832; var3 < this.field8833; var3++) {
         this.field8834.method9704(this.field8835 + var3, this.field8836.method9700(this.field8837 + var3));
      }
   }
}
