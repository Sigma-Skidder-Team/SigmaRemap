package mapped;

public class Class420 implements Runnable {
   private static String[] field1850;
   public final long field1851;
   public final long field1852;
   public final Class2381 field1853;
   public final boolean field1854;
   public final Class9055 field1855;

   public Class420(Class9055 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field1855 = var1;
      this.field1851 = var2;
      this.field1852 = var4;
      this.field1853 = var6;
      this.field1854 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class9055.method33702(this.field1855), false);

      for (long var4 = this.field1851; var4 < this.field1852; var4++) {
         for (long var6 = 0L; var6 < Class9055.method33702(this.field1855); var6++) {
            var3.method9687(var6, this.field1853.method9653(var6 * Class9055.method33701(this.field1855) + var4));
         }

         Class9055.method33700(this.field1855).method33661(var3, this.field1854);

         for (long var8 = 0L; var8 < Class9055.method33702(this.field1855); var8++) {
            this.field1853.method9687(var8 * Class9055.method33701(this.field1855) + var4, var3.method9653(var8));
         }
      }
   }
}
