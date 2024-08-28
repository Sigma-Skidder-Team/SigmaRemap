package mapped;

public class Class496 implements Runnable {
   private static String[] field2343;
   public final int field2344;
   public final int field2345;
   public final float[][] field2346;
   public final boolean field2347;
   public final Class8543 field2348;

   public Class496(Class8543 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field2348 = var1;
      this.field2344 = var2;
      this.field2345 = var3;
      this.field2346 = var4;
      this.field2347 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2344; var3 < this.field2345; var3++) {
         Class8543.method30434(this.field2348).method30933(this.field2346[var3], this.field2347);
      }
   }
}
