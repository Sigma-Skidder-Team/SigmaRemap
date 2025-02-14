package mapped;

public class Class423 implements Runnable {
   private static String[] field1868;
   public final long field1869;
   public final long field1870;
   public final Class2381 field1871;
   public final boolean field1872;
   public final Class9055 field1873;

   public Class423(Class9055 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field1873 = var1;
      this.field1869 = var2;
      this.field1870 = var4;
      this.field1871 = var6;
      this.field1872 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class9055.method33702(this.field1873), false);

      for (long var4 = this.field1869; var4 < this.field1870; var4++) {
         for (long var6 = 0L; var6 < Class9055.method33702(this.field1873); var6++) {
            var3.method9687(var6, this.field1871.method9653(var6 * Class9055.method33701(this.field1873) + var4));
         }

         Class9055.method33700(this.field1873).method33657(var3, this.field1872);

         for (long var8 = 0L; var8 < Class9055.method33702(this.field1873); var8++) {
            this.field1871.method9687(var8 * Class9055.method33701(this.field1873) + var4, var3.method9653(var8));
         }
      }
   }
}
