package mapped;

public class Class1492 implements Runnable {
   private static String[] field8037;
   public final long field8038;
   public final long field8039;
   public final long field8040;
   public final Class2381 field8041;
   public final long field8042;
   public final long field8043;
   public final Class9615 field8044;

   public Class1492(Class9615 var1, long var2, long var4, long var6, Class2381 var8, long var9, long var11) {
      this.field8044 = var1;
      this.field8038 = var2;
      this.field8039 = var4;
      this.field8040 = var6;
      this.field8041 = var8;
      this.field8042 = var9;
      this.field8043 = var11;
   }

   @Override
   public void run() {
      for (long var3 = this.field8038; var3 < this.field8039; var3++) {
         long var5 = var3 * this.field8040;
         long var7 = (Class9615.method37426(this.field8044) - var3) * this.field8040;
         long var9 = var5 + Class9615.method37428(this.field8044);
         this.field8041.method9687(var9, this.field8041.method9653(var7 + 1L));
         this.field8041.method9687(var9 + 1L, -this.field8041.method9653(var7));
      }

      for (long var15 = this.field8038; var15 < this.field8039; var15++) {
         long var17 = var15 * this.field8040;
         long var21 = (Class9615.method37426(this.field8044) - var15 + 1L) * this.field8040;

         for (long var11 = Class9615.method37428(this.field8044) + 2L; var11 < this.field8040; var11 += 2L) {
            long var19 = var21 - var11;
            long var13 = var17 + var11;
            this.field8041.method9687(var13, this.field8041.method9653(var19));
            this.field8041.method9687(var13 + 1L, -this.field8041.method9653(var19 + 1L));
         }
      }

      for (long var16 = this.field8042; var16 < this.field8043; var16++) {
         long var22 = (Class9615.method37426(this.field8044) - var16) % Class9615.method37426(this.field8044) * this.field8040;
         long var24 = var16 * this.field8040;

         for (long var23 = 0L; var23 < this.field8040; var23 += 2L) {
            long var18 = var22 + (this.field8040 - var23) % this.field8040;
            long var20 = var24 + var23;
            this.field8041.method9687(var18, this.field8041.method9653(var20));
            this.field8041.method9687(var18 + 1L, -this.field8041.method9653(var20 + 1L));
         }
      }
   }
}
