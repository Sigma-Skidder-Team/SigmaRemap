package mapped;

public class Class1396 implements Runnable {
   private static String[] field7462;
   public final long field7463;
   public final int field7464;
   public final long field7465;
   public final int field7466;
   public final Class2378 field7467;
   public final boolean field7468;
   public final Class7941 field7469;

   public Class1396(Class7941 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field7469 = var1;
      this.field7463 = var2;
      this.field7464 = var4;
      this.field7465 = var5;
      this.field7466 = var7;
      this.field7467 = var8;
      this.field7468 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field7463);
      if (this.field7464 != -1) {
         if (Class7941.method26774(this.field7469) <= 2L) {
            if (Class7941.method26774(this.field7469) == 2L) {
               for (long var4 = this.field7465; var4 < Class7941.method26772(this.field7469); var4 += (long)this.field7466) {
                  long var6 = var4 * Class7941.method26773(this.field7469);

                  for (long var8 = 0L; var8 < Class7941.method26775(this.field7469); var8++) {
                     long var12 = var8 * Class7941.method26771(this.field7469) + var6;
                     var3.method9685(var8, this.field7467.method9651(var12));
                     var3.method9685(Class7941.method26775(this.field7469) + var8, this.field7467.method9651(var12 + 1L));
                  }

                  Class7941.method26770(this.field7469).method28931(var3, 0L, this.field7468);
                  Class7941.method26770(this.field7469).method28931(var3, Class7941.method26775(this.field7469), this.field7468);

                  for (long var22 = 0L; var22 < Class7941.method26775(this.field7469); var22++) {
                     long var30 = var22 * Class7941.method26771(this.field7469) + var6;
                     this.field7467.method9685(var30, var3.method9651(var22));
                     this.field7467.method9685(var30 + 1L, var3.method9651(Class7941.method26775(this.field7469) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field7465; var16 < Class7941.method26772(this.field7469); var16 += (long)this.field7466) {
               long var19 = var16 * Class7941.method26773(this.field7469);

               for (long var23 = 0L; var23 < Class7941.method26774(this.field7469); var23 += 4L) {
                  for (long var10 = 0L; var10 < Class7941.method26775(this.field7469); var10++) {
                     long var31 = var10 * Class7941.method26771(this.field7469) + var19 + var23;
                     long var14 = Class7941.method26775(this.field7469) + var10;
                     var3.method9685(var10, this.field7467.method9651(var31));
                     var3.method9685(var14, this.field7467.method9651(var31 + 1L));
                     var3.method9685(var14 + Class7941.method26775(this.field7469), this.field7467.method9651(var31 + 2L));
                     var3.method9685(var14 + 2L * Class7941.method26775(this.field7469), this.field7467.method9651(var31 + 3L));
                  }

                  Class7941.method26770(this.field7469).method28931(var3, 0L, this.field7468);
                  Class7941.method26770(this.field7469).method28931(var3, Class7941.method26775(this.field7469), this.field7468);
                  Class7941.method26770(this.field7469).method28931(var3, 2L * Class7941.method26775(this.field7469), this.field7468);
                  Class7941.method26770(this.field7469).method28931(var3, 3L * Class7941.method26775(this.field7469), this.field7468);

                  for (long var27 = 0L; var27 < Class7941.method26775(this.field7469); var27++) {
                     long var32 = var27 * Class7941.method26771(this.field7469) + var19 + var23;
                     long var37 = Class7941.method26775(this.field7469) + var27;
                     this.field7467.method9685(var32, var3.method9651(var27));
                     this.field7467.method9685(var32 + 1L, var3.method9651(var37));
                     this.field7467.method9685(var32 + 2L, var3.method9651(var37 + Class7941.method26775(this.field7469)));
                     this.field7467.method9685(var32 + 3L, var3.method9651(var37 + 2L * Class7941.method26775(this.field7469)));
                  }
               }
            }
         }
      } else if (Class7941.method26774(this.field7469) <= 2L) {
         if (Class7941.method26774(this.field7469) == 2L) {
            for (long var17 = this.field7465; var17 < Class7941.method26772(this.field7469); var17 += (long)this.field7466) {
               long var20 = var17 * Class7941.method26773(this.field7469);

               for (long var24 = 0L; var24 < Class7941.method26775(this.field7469); var24++) {
                  long var33 = var24 * Class7941.method26771(this.field7469) + var20;
                  var3.method9685(var24, this.field7467.method9651(var33));
                  var3.method9685(Class7941.method26775(this.field7469) + var24, this.field7467.method9651(var33 + 1L));
               }

               Class7941.method26770(this.field7469).method28927(var3, 0L, this.field7468);
               Class7941.method26770(this.field7469).method28927(var3, Class7941.method26775(this.field7469), this.field7468);

               for (long var25 = 0L; var25 < Class7941.method26775(this.field7469); var25++) {
                  long var34 = var25 * Class7941.method26771(this.field7469) + var20;
                  this.field7467.method9685(var34, var3.method9651(var25));
                  this.field7467.method9685(var34 + 1L, var3.method9651(Class7941.method26775(this.field7469) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field7465; var18 < Class7941.method26772(this.field7469); var18 += (long)this.field7466) {
            long var21 = var18 * Class7941.method26773(this.field7469);

            for (long var26 = 0L; var26 < Class7941.method26774(this.field7469); var26 += 4L) {
               for (long var28 = 0L; var28 < Class7941.method26775(this.field7469); var28++) {
                  long var35 = var28 * Class7941.method26771(this.field7469) + var21 + var26;
                  long var38 = Class7941.method26775(this.field7469) + var28;
                  var3.method9685(var28, this.field7467.method9651(var35));
                  var3.method9685(var38, this.field7467.method9651(var35 + 1L));
                  var3.method9685(var38 + Class7941.method26775(this.field7469), this.field7467.method9651(var35 + 2L));
                  var3.method9685(var38 + 2L * Class7941.method26775(this.field7469), this.field7467.method9651(var35 + 3L));
               }

               Class7941.method26770(this.field7469).method28927(var3, 0L, this.field7468);
               Class7941.method26770(this.field7469).method28927(var3, Class7941.method26775(this.field7469), this.field7468);
               Class7941.method26770(this.field7469).method28927(var3, 2L * Class7941.method26775(this.field7469), this.field7468);
               Class7941.method26770(this.field7469).method28927(var3, 3L * Class7941.method26775(this.field7469), this.field7468);

               for (long var29 = 0L; var29 < Class7941.method26775(this.field7469); var29++) {
                  long var36 = var29 * Class7941.method26771(this.field7469) + var21 + var26;
                  long var39 = Class7941.method26775(this.field7469) + var29;
                  this.field7467.method9685(var36, var3.method9651(var29));
                  this.field7467.method9685(var36 + 1L, var3.method9651(var39));
                  this.field7467.method9685(var36 + 2L, var3.method9651(var39 + Class7941.method26775(this.field7469)));
                  this.field7467.method9685(var36 + 3L, var3.method9651(var39 + 2L * Class7941.method26775(this.field7469)));
               }
            }
         }
      }
   }
}
