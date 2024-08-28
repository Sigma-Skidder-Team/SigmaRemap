package mapped;

public class Class777 implements Runnable {
   private static String[] field4051;
   public final long field4052;
   public final long field4053;
   public final Class2381 field4054;
   public final boolean field4055;
   public final Class9055 field4056;

   public Class777(Class9055 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field4056 = var1;
      this.field4052 = var2;
      this.field4053 = var4;
      this.field4054 = var6;
      this.field4055 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field4052; var3 < this.field4053; var3++) {
         Class9055.method33698(this.field4056).method33663(this.field4054, var3 * Class9055.method33701(this.field4056), this.field4055);
      }
   }
}
