package mapped;

public class Class392 implements Runnable {
   private static String[] field1666;
   public final long field1667;
   public final long field1668;
   public final Class2381 field1669;
   public final boolean field1670;
   public final Class3612 field1671;

   public Class392(Class3612 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field1671 = var1;
      this.field1667 = var2;
      this.field1668 = var4;
      this.field1669 = var6;
      this.field1670 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field1667; var3 < this.field1668; var3++) {
         long var5 = var3 * (long)Class3612.method12220(this.field1671);

         for (long var7 = 0L; var7 < Class3612.method12229(this.field1671); var7++) {
            Class3612.method12223(this.field1671).method33663(this.field1669, var5 + var7 * (long)Class3612.method12222(this.field1671), this.field1670);
         }
      }
   }
}
