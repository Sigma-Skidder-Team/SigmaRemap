package mapped;

public class Class1569 implements Runnable {
   private static String[] field8483;
   public final long field8484;
   public final int field8485;
   public final long field8486;
   public final int field8487;
   public final Class2381 field8488;
   public final boolean field8489;
   public final Class3612 field8490;

   public Class1569(Class3612 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field8490 = var1;
      this.field8484 = var2;
      this.field8485 = var4;
      this.field8486 = var5;
      this.field8487 = var7;
      this.field8488 = var8;
      this.field8489 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field8484);
      if (this.field8485 != -1) {
         for (long var4 = this.field8486; var4 < Class3612.method12232(this.field8490); var4 += (long)this.field8487) {
            long var6 = var4 * Class3612.method12228(this.field8490);

            for (long var8 = 0L; var8 < Class3612.method12229(this.field8490); var8++) {
               Class3612.method12223(this.field8490).method33663(this.field8488, var6 + var8 * Class3612.method12230(this.field8490), this.field8489);
            }

            if (Class3612.method12231(this.field8490) <= 2L) {
               if (Class3612.method12231(this.field8490) == 2L) {
                  for (long var19 = 0L; var19 < Class3612.method12229(this.field8490); var19++) {
                     long var29 = var6 + var19 * Class3612.method12230(this.field8490);
                     var3.method9687(var19, this.field8488.method9653(var29));
                     var3.method9687(Class3612.method12229(this.field8490) + var19, this.field8488.method9653(var29 + 1L));
                  }

                  Class3612.method12225(this.field8490).method33663(var3, 0L, this.field8489);
                  Class3612.method12225(this.field8490).method33663(var3, Class3612.method12229(this.field8490), this.field8489);

                  for (long var20 = 0L; var20 < Class3612.method12229(this.field8490); var20++) {
                     long var30 = var6 + var20 * Class3612.method12230(this.field8490);
                     this.field8488.method9687(var30, var3.method9653(var20));
                     this.field8488.method9687(var30 + 1L, var3.method9653(Class3612.method12229(this.field8490) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < Class3612.method12231(this.field8490); var18 += 4L) {
                  for (long var10 = 0L; var10 < Class3612.method12229(this.field8490); var10++) {
                     long var12 = var6 + var10 * Class3612.method12230(this.field8490) + var18;
                     long var14 = Class3612.method12229(this.field8490) + var10;
                     var3.method9687(var10, this.field8488.method9653(var12));
                     var3.method9687(var14, this.field8488.method9653(var12 + 1L));
                     var3.method9687(var14 + Class3612.method12229(this.field8490), this.field8488.method9653(var12 + 2L));
                     var3.method9687(var14 + 2L * Class3612.method12229(this.field8490), this.field8488.method9653(var12 + 3L));
                  }

                  Class3612.method12225(this.field8490).method33663(var3, 0L, this.field8489);
                  Class3612.method12225(this.field8490).method33663(var3, Class3612.method12229(this.field8490), this.field8489);
                  Class3612.method12225(this.field8490).method33663(var3, 2L * Class3612.method12229(this.field8490), this.field8489);
                  Class3612.method12225(this.field8490).method33663(var3, 3L * Class3612.method12229(this.field8490), this.field8489);

                  for (long var25 = 0L; var25 < Class3612.method12229(this.field8490); var25++) {
                     long var28 = var6 + var25 * Class3612.method12230(this.field8490) + var18;
                     long var35 = Class3612.method12229(this.field8490) + var25;
                     this.field8488.method9687(var28, var3.method9653(var25));
                     this.field8488.method9687(var28 + 1L, var3.method9653(var35));
                     this.field8488.method9687(var28 + 2L, var3.method9653(var35 + Class3612.method12229(this.field8490)));
                     this.field8488.method9687(var28 + 3L, var3.method9653(var35 + 2L * Class3612.method12229(this.field8490)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field8486; var16 < Class3612.method12232(this.field8490); var16 += (long)this.field8487) {
            long var17 = var16 * Class3612.method12228(this.field8490);

            for (long var21 = 0L; var21 < Class3612.method12229(this.field8490); var21++) {
               Class3612.method12223(this.field8490).method33659(this.field8488, var17 + var21 * Class3612.method12230(this.field8490), this.field8489);
            }

            if (Class3612.method12231(this.field8490) <= 2L) {
               if (Class3612.method12231(this.field8490) == 2L) {
                  for (long var23 = 0L; var23 < Class3612.method12229(this.field8490); var23++) {
                     long var33 = var17 + var23 * Class3612.method12230(this.field8490);
                     var3.method9687(var23, this.field8488.method9653(var33));
                     var3.method9687(Class3612.method12229(this.field8490) + var23, this.field8488.method9653(var33 + 1L));
                  }

                  Class3612.method12225(this.field8490).method33659(var3, 0L, this.field8489);
                  Class3612.method12225(this.field8490).method33659(var3, Class3612.method12229(this.field8490), this.field8489);

                  for (long var24 = 0L; var24 < Class3612.method12229(this.field8490); var24++) {
                     long var34 = var17 + var24 * Class3612.method12230(this.field8490);
                     this.field8488.method9687(var34, var3.method9653(var24));
                     this.field8488.method9687(var34 + 1L, var3.method9653(Class3612.method12229(this.field8490) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < Class3612.method12231(this.field8490); var22 += 4L) {
                  for (long var26 = 0L; var26 < Class3612.method12229(this.field8490); var26++) {
                     long var31 = var17 + var26 * Class3612.method12230(this.field8490) + var22;
                     long var36 = Class3612.method12229(this.field8490) + var26;
                     var3.method9687(var26, this.field8488.method9653(var31));
                     var3.method9687(var36, this.field8488.method9653(var31 + 1L));
                     var3.method9687(var36 + Class3612.method12229(this.field8490), this.field8488.method9653(var31 + 2L));
                     var3.method9687(var36 + 2L * Class3612.method12229(this.field8490), this.field8488.method9653(var31 + 3L));
                  }

                  Class3612.method12225(this.field8490).method33659(var3, 0L, this.field8489);
                  Class3612.method12225(this.field8490).method33659(var3, Class3612.method12229(this.field8490), this.field8489);
                  Class3612.method12225(this.field8490).method33659(var3, 2L * Class3612.method12229(this.field8490), this.field8489);
                  Class3612.method12225(this.field8490).method33659(var3, 3L * Class3612.method12229(this.field8490), this.field8489);

                  for (long var27 = 0L; var27 < Class3612.method12229(this.field8490); var27++) {
                     long var32 = var17 + var27 * Class3612.method12230(this.field8490) + var22;
                     long var37 = Class3612.method12229(this.field8490) + var27;
                     this.field8488.method9687(var32, var3.method9653(var27));
                     this.field8488.method9687(var32 + 1L, var3.method9653(var37));
                     this.field8488.method9687(var32 + 2L, var3.method9653(var37 + Class3612.method12229(this.field8490)));
                     this.field8488.method9687(var32 + 3L, var3.method9653(var37 + 2L * Class3612.method12229(this.field8490)));
                  }
               }
            }
         }
      }
   }
}
