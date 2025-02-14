package mapped;

public class Class621 implements Runnable {
   private static String[] field3087;
   public final long field3088;
   public final long field3089;
   public final Class2381 field3090;
   public final boolean field3091;
   public final Class9055 field3092;

   public Class621(Class9055 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field3092 = var1;
      this.field3088 = var2;
      this.field3089 = var4;
      this.field3090 = var6;
      this.field3091 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field3088; var3 < this.field3089; var3++) {
         Class9055.method33698(this.field3092).method33659(this.field3090, var3 * Class9055.method33701(this.field3092), this.field3091);
      }
   }
}
