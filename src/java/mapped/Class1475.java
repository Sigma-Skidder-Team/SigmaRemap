package mapped;

public class Class1475 implements Runnable {
   private static String[] field7931;
   public final long field7932;
   public final int field7933;
   public final long field7934;
   public final int field7935;
   public final Class2378 field7936;
   public final boolean field7937;
   public final Class7821 field7938;

   public Class1475(Class7821 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field7938 = var1;
      this.field7932 = var2;
      this.field7933 = var4;
      this.field7934 = var5;
      this.field7935 = var7;
      this.field7936 = var8;
      this.field7937 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field7932);
      if (Class7821.method26153(this.field7938) <= 2L) {
         if (Class7821.method26153(this.field7938) == 2L) {
            for (long var4 = 0L; var4 < Class7821.method26154(this.field7938); var4++) {
               long var8 = var4 * Class7821.method26153(this.field7938) + 2L * this.field7934;
               var3.method9685(var4, this.field7936.method9651(var8));
               var3.method9685(var4 + Class7821.method26154(this.field7938), this.field7936.method9651(var8 + 1L));
            }

            if (this.field7933 != -1) {
               Class7821.method26152(this.field7938).method28462(var3, 0L, this.field7937);
               Class7821.method26152(this.field7938).method28462(var3, Class7821.method26154(this.field7938), this.field7937);
            } else {
               Class7821.method26152(this.field7938).method28458(var3, 0L);
               Class7821.method26152(this.field7938).method28458(var3, Class7821.method26154(this.field7938));
            }

            for (long var12 = 0L; var12 < Class7821.method26154(this.field7938); var12++) {
               long var18 = var12 * Class7821.method26153(this.field7938) + 2L * this.field7934;
               this.field7936.method9685(var18, var3.method9651(var12));
               this.field7936.method9685(var18 + 1L, var3.method9651(var12 + Class7821.method26154(this.field7938)));
            }
         }
      } else if (this.field7933 != -1) {
         for (long var13 = 4L * this.field7934; var13 < Class7821.method26153(this.field7938); var13 += (long)(4 * this.field7935)) {
            for (long var6 = 0L; var6 < Class7821.method26154(this.field7938); var6++) {
               long var19 = var6 * Class7821.method26153(this.field7938) + var13;
               long var10 = Class7821.method26154(this.field7938) + var6;
               var3.method9685(var6, this.field7936.method9651(var19));
               var3.method9685(var10, this.field7936.method9651(var19 + 1L));
               var3.method9685(var10 + Class7821.method26154(this.field7938), this.field7936.method9651(var19 + 2L));
               var3.method9685(var10 + 2L * Class7821.method26154(this.field7938), this.field7936.method9651(var19 + 3L));
            }

            Class7821.method26152(this.field7938).method28462(var3, 0L, this.field7937);
            Class7821.method26152(this.field7938).method28462(var3, Class7821.method26154(this.field7938), this.field7937);
            Class7821.method26152(this.field7938).method28462(var3, 2L * Class7821.method26154(this.field7938), this.field7937);
            Class7821.method26152(this.field7938).method28462(var3, 3L * Class7821.method26154(this.field7938), this.field7937);

            for (long var15 = 0L; var15 < Class7821.method26154(this.field7938); var15++) {
               long var20 = var15 * Class7821.method26153(this.field7938) + var13;
               long var23 = Class7821.method26154(this.field7938) + var15;
               this.field7936.method9685(var20, var3.method9651(var15));
               this.field7936.method9685(var20 + 1L, var3.method9651(var23));
               this.field7936.method9685(var20 + 2L, var3.method9651(var23 + Class7821.method26154(this.field7938)));
               this.field7936.method9685(var20 + 3L, var3.method9651(var23 + 2L * Class7821.method26154(this.field7938)));
            }
         }
      } else {
         for (long var14 = 4L * this.field7934; var14 < Class7821.method26153(this.field7938); var14 += (long)(4 * this.field7935)) {
            for (long var16 = 0L; var16 < Class7821.method26154(this.field7938); var16++) {
               long var21 = var16 * Class7821.method26153(this.field7938) + var14;
               long var24 = Class7821.method26154(this.field7938) + var16;
               var3.method9685(var16, this.field7936.method9651(var21));
               var3.method9685(var24, this.field7936.method9651(var21 + 1L));
               var3.method9685(var24 + Class7821.method26154(this.field7938), this.field7936.method9651(var21 + 2L));
               var3.method9685(var24 + 2L * Class7821.method26154(this.field7938), this.field7936.method9651(var21 + 3L));
            }

            Class7821.method26152(this.field7938).method28458(var3, 0L);
            Class7821.method26152(this.field7938).method28458(var3, Class7821.method26154(this.field7938));
            Class7821.method26152(this.field7938).method28458(var3, 2L * Class7821.method26154(this.field7938));
            Class7821.method26152(this.field7938).method28458(var3, 3L * Class7821.method26154(this.field7938));

            for (long var17 = 0L; var17 < Class7821.method26154(this.field7938); var17++) {
               long var22 = var17 * Class7821.method26153(this.field7938) + var14;
               long var25 = Class7821.method26154(this.field7938) + var17;
               this.field7936.method9685(var22, var3.method9651(var17));
               this.field7936.method9685(var22 + 1L, var3.method9651(var25));
               this.field7936.method9685(var22 + 2L, var3.method9651(var25 + Class7821.method26154(this.field7938)));
               this.field7936.method9685(var22 + 3L, var3.method9651(var25 + 2L * Class7821.method26154(this.field7938)));
            }
         }
      }
   }
}
