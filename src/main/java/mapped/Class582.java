package mapped;

public class Class582 implements Runnable {
   private static String[] field2851;
   public final long field2852;
   public final long field2853;
   public final Class2381 field2854;
   public final boolean field2855;
   public final Class3612 field2856;

   public Class582(Class3612 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field2856 = var1;
      this.field2852 = var2;
      this.field2853 = var4;
      this.field2854 = var6;
      this.field2855 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2852; var3 < this.field2853; var3++) {
         long var5 = var3 * Class3612.method12228(this.field2856);

         for (long var7 = 0L; var7 < Class3612.method12229(this.field2856); var7++) {
            Class3612.method12223(this.field2856).method33659(this.field2854, var5 + var7 * Class3612.method12230(this.field2856), this.field2855);
         }
      }
   }
}
