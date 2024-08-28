package mapped;

public class Class606 implements Runnable {
   private static String[] field2990;
   public final long field2991;
   public final int field2992;
   public final long field2993;
   public final int field2994;
   public final Class2381 field2995;
   public final boolean field2996;
   public final Class3612 field2997;

   public Class606(Class3612 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field2997 = var1;
      this.field2991 = var2;
      this.field2992 = var4;
      this.field2993 = var5;
      this.field2994 = var7;
      this.field2995 = var8;
      this.field2996 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field2991);
      if (this.field2992 != -1) {
         if (Class3612.method12231(this.field2997) <= 2L) {
            if (Class3612.method12231(this.field2997) == 2L) {
               for (long var4 = this.field2993; var4 < Class3612.method12229(this.field2997); var4 += (long)this.field2994) {
                  long var6 = var4 * Class3612.method12230(this.field2997);

                  for (long var8 = 0L; var8 < Class3612.method12232(this.field2997); var8++) {
                     long var12 = var8 * Class3612.method12228(this.field2997) + var6;
                     var3.method9687(var8, this.field2995.method9653(var12));
                     var3.method9687(Class3612.method12232(this.field2997) + var8, this.field2995.method9653(var12 + 1L));
                  }

                  Class3612.method12227(this.field2997).method33663(var3, 0L, this.field2996);
                  Class3612.method12227(this.field2997).method33663(var3, Class3612.method12232(this.field2997), this.field2996);

                  for (long var22 = 0L; var22 < Class3612.method12232(this.field2997); var22++) {
                     long var30 = var22 * Class3612.method12228(this.field2997) + var6;
                     this.field2995.method9687(var30, var3.method9653(var22));
                     this.field2995.method9687(var30 + 1L, var3.method9653(Class3612.method12232(this.field2997) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field2993; var16 < Class3612.method12229(this.field2997); var16 += (long)this.field2994) {
               long var19 = var16 * Class3612.method12230(this.field2997);

               for (long var23 = 0L; var23 < Class3612.method12231(this.field2997); var23 += 4L) {
                  for (long var10 = 0L; var10 < Class3612.method12232(this.field2997); var10++) {
                     long var31 = var10 * Class3612.method12228(this.field2997) + var19 + var23;
                     long var14 = Class3612.method12232(this.field2997) + var10;
                     var3.method9687(var10, this.field2995.method9653(var31));
                     var3.method9687(var14, this.field2995.method9653(var31 + 1L));
                     var3.method9687(var14 + Class3612.method12232(this.field2997), this.field2995.method9653(var31 + 2L));
                     var3.method9687(var14 + 2L * Class3612.method12232(this.field2997), this.field2995.method9653(var31 + 3L));
                  }

                  Class3612.method12227(this.field2997).method33663(var3, 0L, this.field2996);
                  Class3612.method12227(this.field2997).method33663(var3, Class3612.method12232(this.field2997), this.field2996);
                  Class3612.method12227(this.field2997).method33663(var3, 2L * Class3612.method12232(this.field2997), this.field2996);
                  Class3612.method12227(this.field2997).method33663(var3, 3L * Class3612.method12232(this.field2997), this.field2996);

                  for (long var27 = 0L; var27 < Class3612.method12232(this.field2997); var27++) {
                     long var32 = var27 * Class3612.method12228(this.field2997) + var19 + var23;
                     long var37 = Class3612.method12232(this.field2997) + var27;
                     this.field2995.method9687(var32, var3.method9653(var27));
                     this.field2995.method9687(var32 + 1L, var3.method9653(var37));
                     this.field2995.method9687(var32 + 2L, var3.method9653(var37 + Class3612.method12232(this.field2997)));
                     this.field2995.method9687(var32 + 3L, var3.method9653(var37 + 2L * Class3612.method12232(this.field2997)));
                  }
               }
            }
         }
      } else if (Class3612.method12231(this.field2997) <= 2L) {
         if (Class3612.method12231(this.field2997) == 2L) {
            for (long var17 = this.field2993; var17 < Class3612.method12229(this.field2997); var17 += (long)this.field2994) {
               long var20 = var17 * Class3612.method12230(this.field2997);

               for (long var24 = 0L; var24 < Class3612.method12232(this.field2997); var24++) {
                  long var33 = var24 * Class3612.method12228(this.field2997) + var20;
                  var3.method9687(var24, this.field2995.method9653(var33));
                  var3.method9687(Class3612.method12232(this.field2997) + var24, this.field2995.method9653(var33 + 1L));
               }

               Class3612.method12227(this.field2997).method33659(var3, 0L, this.field2996);
               Class3612.method12227(this.field2997).method33659(var3, Class3612.method12232(this.field2997), this.field2996);

               for (long var25 = 0L; var25 < Class3612.method12232(this.field2997); var25++) {
                  long var34 = var25 * Class3612.method12228(this.field2997) + var20;
                  this.field2995.method9687(var34, var3.method9653(var25));
                  this.field2995.method9687(var34 + 1L, var3.method9653(Class3612.method12232(this.field2997) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field2993; var18 < Class3612.method12229(this.field2997); var18 += (long)this.field2994) {
            long var21 = var18 * Class3612.method12230(this.field2997);

            for (long var26 = 0L; var26 < Class3612.method12231(this.field2997); var26 += 4L) {
               for (long var28 = 0L; var28 < Class3612.method12232(this.field2997); var28++) {
                  long var35 = var28 * Class3612.method12228(this.field2997) + var21 + var26;
                  long var38 = Class3612.method12232(this.field2997) + var28;
                  var3.method9687(var28, this.field2995.method9653(var35));
                  var3.method9687(var38, this.field2995.method9653(var35 + 1L));
                  var3.method9687(var38 + Class3612.method12232(this.field2997), this.field2995.method9653(var35 + 2L));
                  var3.method9687(var38 + 2L * Class3612.method12232(this.field2997), this.field2995.method9653(var35 + 3L));
               }

               Class3612.method12227(this.field2997).method33659(var3, 0L, this.field2996);
               Class3612.method12227(this.field2997).method33659(var3, Class3612.method12232(this.field2997), this.field2996);
               Class3612.method12227(this.field2997).method33659(var3, 2L * Class3612.method12232(this.field2997), this.field2996);
               Class3612.method12227(this.field2997).method33659(var3, 3L * Class3612.method12232(this.field2997), this.field2996);

               for (long var29 = 0L; var29 < Class3612.method12232(this.field2997); var29++) {
                  long var36 = var29 * Class3612.method12228(this.field2997) + var21 + var26;
                  long var39 = Class3612.method12232(this.field2997) + var29;
                  this.field2995.method9687(var36, var3.method9653(var29));
                  this.field2995.method9687(var36 + 1L, var3.method9653(var39));
                  this.field2995.method9687(var36 + 2L, var3.method9653(var39 + Class3612.method12232(this.field2997)));
                  this.field2995.method9687(var36 + 3L, var3.method9653(var39 + 2L * Class3612.method12232(this.field2997)));
               }
            }
         }
      }
   }
}
