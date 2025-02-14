package mapped;

public class Class602 implements Runnable {
   private static String[] field2972;
   public final int field2973;
   public final int field2974;
   public final double[][] field2975;
   public final boolean field2976;
   public final Class9055 field2977;

   public Class602(Class9055 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field2977 = var1;
      this.field2973 = var2;
      this.field2974 = var3;
      this.field2975 = var4;
      this.field2976 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2973; var3 < this.field2974; var3++) {
         Class9055.method33698(this.field2977).method33660(this.field2975[var3], this.field2976);
      }
   }
}
