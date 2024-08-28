package mapped;

public class Class741 implements Runnable {
   private static String[] field3843;
   public final long field3844;
   public final int field3845;
   public final long field3846;
   public final int field3847;
   public final Class2381 field3848;
   public final boolean field3849;
   public final Class9055 field3850;

   public Class741(Class9055 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field3850 = var1;
      this.field3844 = var2;
      this.field3845 = var4;
      this.field3846 = var5;
      this.field3847 = var7;
      this.field3848 = var8;
      this.field3849 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field3844);
      if (Class9055.method33701(this.field3850) <= 2L) {
         if (Class9055.method33701(this.field3850) == 2L) {
            for (long var4 = 0L; var4 < Class9055.method33702(this.field3850); var4++) {
               long var8 = var4 * Class9055.method33701(this.field3850) + 2L * this.field3846;
               var3.method9687(var4, this.field3848.method9653(var8));
               var3.method9687(var4 + Class9055.method33702(this.field3850), this.field3848.method9653(var8 + 1L));
            }

            if (this.field3845 != -1) {
               Class9055.method33700(this.field3850).method33663(var3, 0L, this.field3849);
               Class9055.method33700(this.field3850).method33663(var3, Class9055.method33702(this.field3850), this.field3849);
            } else {
               Class9055.method33700(this.field3850).method33659(var3, 0L, this.field3849);
               Class9055.method33700(this.field3850).method33659(var3, Class9055.method33702(this.field3850), this.field3849);
            }

            for (long var12 = 0L; var12 < Class9055.method33702(this.field3850); var12++) {
               long var18 = var12 * Class9055.method33701(this.field3850) + 2L * this.field3846;
               this.field3848.method9687(var18, var3.method9653(var12));
               this.field3848.method9687(var18 + 1L, var3.method9653(var12 + Class9055.method33702(this.field3850)));
            }
         }
      } else if (this.field3845 != -1) {
         for (long var13 = 4L * this.field3846; var13 < Class9055.method33701(this.field3850); var13 += (long)(4 * this.field3847)) {
            for (long var6 = 0L; var6 < Class9055.method33702(this.field3850); var6++) {
               long var19 = var6 * Class9055.method33701(this.field3850) + var13;
               long var10 = Class9055.method33702(this.field3850) + var6;
               var3.method9687(var6, this.field3848.method9653(var19));
               var3.method9687(var10, this.field3848.method9653(var19 + 1L));
               var3.method9687(var10 + Class9055.method33702(this.field3850), this.field3848.method9653(var19 + 2L));
               var3.method9687(var10 + 2L * Class9055.method33702(this.field3850), this.field3848.method9653(var19 + 3L));
            }

            Class9055.method33700(this.field3850).method33663(var3, 0L, this.field3849);
            Class9055.method33700(this.field3850).method33663(var3, Class9055.method33702(this.field3850), this.field3849);
            Class9055.method33700(this.field3850).method33663(var3, 2L * Class9055.method33702(this.field3850), this.field3849);
            Class9055.method33700(this.field3850).method33663(var3, 3L * Class9055.method33702(this.field3850), this.field3849);

            for (long var15 = 0L; var15 < Class9055.method33702(this.field3850); var15++) {
               long var20 = var15 * Class9055.method33701(this.field3850) + var13;
               long var23 = Class9055.method33702(this.field3850) + var15;
               this.field3848.method9687(var20, var3.method9653(var15));
               this.field3848.method9687(var20 + 1L, var3.method9653(var23));
               this.field3848.method9687(var20 + 2L, var3.method9653(var23 + Class9055.method33702(this.field3850)));
               this.field3848.method9687(var20 + 3L, var3.method9653(var23 + 2L * Class9055.method33702(this.field3850)));
            }
         }
      } else {
         for (long var14 = 4L * this.field3846; var14 < Class9055.method33701(this.field3850); var14 += (long)(4 * this.field3847)) {
            for (long var16 = 0L; var16 < Class9055.method33702(this.field3850); var16++) {
               long var21 = var16 * Class9055.method33701(this.field3850) + var14;
               long var24 = Class9055.method33702(this.field3850) + var16;
               var3.method9687(var16, this.field3848.method9653(var21));
               var3.method9687(var24, this.field3848.method9653(var21 + 1L));
               var3.method9687(var24 + Class9055.method33702(this.field3850), this.field3848.method9653(var21 + 2L));
               var3.method9687(var24 + 2L * Class9055.method33702(this.field3850), this.field3848.method9653(var21 + 3L));
            }

            Class9055.method33700(this.field3850).method33659(var3, 0L, this.field3849);
            Class9055.method33700(this.field3850).method33659(var3, Class9055.method33702(this.field3850), this.field3849);
            Class9055.method33700(this.field3850).method33659(var3, 2L * Class9055.method33702(this.field3850), this.field3849);
            Class9055.method33700(this.field3850).method33659(var3, 3L * Class9055.method33702(this.field3850), this.field3849);

            for (long var17 = 0L; var17 < Class9055.method33702(this.field3850); var17++) {
               long var22 = var17 * Class9055.method33701(this.field3850) + var14;
               long var25 = Class9055.method33702(this.field3850) + var17;
               this.field3848.method9687(var22, var3.method9653(var17));
               this.field3848.method9687(var22 + 1L, var3.method9653(var25));
               this.field3848.method9687(var22 + 2L, var3.method9653(var25 + Class9055.method33702(this.field3850)));
               this.field3848.method9687(var22 + 3L, var3.method9653(var25 + 2L * Class9055.method33702(this.field3850)));
            }
         }
      }
   }
}
