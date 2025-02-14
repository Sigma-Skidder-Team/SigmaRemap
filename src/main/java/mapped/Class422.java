package mapped;

public class Class422 implements Runnable {
   private static String[] field1862;
   public final long field1863;
   public final long field1864;
   public final Class2378 field1865;
   public final boolean field1866;
   public final Class7941 field1867;

   public Class422(Class7941 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field1867 = var1;
      this.field1863 = var2;
      this.field1864 = var4;
      this.field1865 = var6;
      this.field1866 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field1863; var3 < this.field1864; var3++) {
         long var5 = var3 * (long)Class7941.method26763(this.field1867);

         for (long var7 = 0L; var7 < Class7941.method26772(this.field1867); var7++) {
            Class7941.method26766(this.field1867).method28931(this.field1865, var5 + var7 * (long)Class7941.method26765(this.field1867), this.field1866);
         }
      }
   }
}
