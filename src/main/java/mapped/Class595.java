package mapped;

public class Class595 implements Runnable {
   private static String[] field2925;
   public final long field2926;
   public final long field2927;
   public final Class2378 field2928;
   public final long field2929;
   public final boolean field2930;
   public final Class8543 field2931;

   public Class595(Class8543 var1, long var2, long var4, Class2378 var6, long var7, boolean var9) {
      this.field2931 = var1;
      this.field2926 = var2;
      this.field2927 = var4;
      this.field2928 = var6;
      this.field2929 = var7;
      this.field2930 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2926; var3 < this.field2927; var3++) {
         Class8543.method30434(this.field2931).method30936(this.field2928, var3 * this.field2929, this.field2930);
      }
   }
}
