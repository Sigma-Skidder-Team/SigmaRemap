package mapped;

public class Class623 implements Runnable {
   private static String[] field3101;
   public final long field3102;
   public final int field3103;
   public final int field3104;
   public final long field3105;
   public final Class2378 field3106;
   public final boolean field3107;
   public final Class8543 field3108;

   public Class623(Class8543 var1, long var2, int var4, int var5, long var6, Class2378 var8, boolean var9) {
      this.field3108 = var1;
      this.field3102 = var2;
      this.field3103 = var4;
      this.field3104 = var5;
      this.field3105 = var6;
      this.field3106 = var8;
      this.field3107 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field3102);
      if (this.field3103 != -1) {
         if (Class8543.method30439(this.field3108) <= (long)(4 * this.field3104)) {
            if (Class8543.method30439(this.field3108) != (long)(4 * this.field3104)) {
               if (Class8543.method30439(this.field3108) == (long)(2 * this.field3104)) {
                  for (long var4 = 0L; var4 < Class8543.method30437(this.field3108); var4++) {
                     long var8 = var4 * Class8543.method30439(this.field3108) + 2L * this.field3105;
                     long var10 = 2L * var4;
                     var3.method9687(var10, (double)this.field3106.method9651(var8));
                     var3.method9687(var10 + 1L, (double)this.field3106.method9651(var8 + 1L));
                  }

                  Class8543.method30436(this.field3108).method30936(var3, 0L, this.field3107);

                  for (long var18 = 0L; var18 < Class8543.method30437(this.field3108); var18++) {
                     long var30 = var18 * Class8543.method30439(this.field3108) + 2L * this.field3105;
                     long var41 = 2L * var18;
                     this.field3106.method9687(var30, (double)var3.method9651(var41));
                     this.field3106.method9687(var30 + 1L, (double)var3.method9651(var41 + 1L));
                  }
               }
            } else {
               for (long var19 = 0L; var19 < Class8543.method30437(this.field3108); var19++) {
                  long var31 = var19 * Class8543.method30439(this.field3108) + 4L * this.field3105;
                  long var42 = 2L * var19;
                  long var12 = 2L * Class8543.method30437(this.field3108) + 2L * var19;
                  var3.method9687(var42, (double)this.field3106.method9651(var31));
                  var3.method9687(var42 + 1L, (double)this.field3106.method9651(var31 + 1L));
                  var3.method9687(var12, (double)this.field3106.method9651(var31 + 2L));
                  var3.method9687(var12 + 1L, (double)this.field3106.method9651(var31 + 3L));
               }

               Class8543.method30436(this.field3108).method30936(var3, 0L, this.field3107);
               Class8543.method30436(this.field3108).method30936(var3, 2L * Class8543.method30437(this.field3108), this.field3107);

               for (long var20 = 0L; var20 < Class8543.method30437(this.field3108); var20++) {
                  long var32 = var20 * Class8543.method30439(this.field3108) + 4L * this.field3105;
                  long var43 = 2L * var20;
                  long var52 = 2L * Class8543.method30437(this.field3108) + 2L * var20;
                  this.field3106.method9687(var32, (double)var3.method9651(var43));
                  this.field3106.method9687(var32 + 1L, (double)var3.method9651(var43 + 1L));
                  this.field3106.method9687(var32 + 2L, (double)var3.method9651(var52));
                  this.field3106.method9687(var32 + 3L, (double)var3.method9651(var52 + 1L));
               }
            }
         } else {
            for (long var21 = 8L * this.field3105; var21 < Class8543.method30439(this.field3108); var21 += (long)(8 * this.field3104)) {
               for (long var6 = 0L; var6 < Class8543.method30437(this.field3108); var6++) {
                  long var33 = var6 * Class8543.method30439(this.field3108) + var21;
                  long var44 = 2L * var6;
                  long var53 = 2L * Class8543.method30437(this.field3108) + 2L * var6;
                  long var14 = var53 + 2L * Class8543.method30437(this.field3108);
                  long var16 = var14 + 2L * Class8543.method30437(this.field3108);
                  var3.method9687(var44, (double)this.field3106.method9651(var33));
                  var3.method9687(var44 + 1L, (double)this.field3106.method9651(var33 + 1L));
                  var3.method9687(var53, (double)this.field3106.method9651(var33 + 2L));
                  var3.method9687(var53 + 1L, (double)this.field3106.method9651(var33 + 3L));
                  var3.method9687(var14, (double)this.field3106.method9651(var33 + 4L));
                  var3.method9687(var14 + 1L, (double)this.field3106.method9651(var33 + 5L));
                  var3.method9687(var16, (double)this.field3106.method9651(var33 + 6L));
                  var3.method9687(var16 + 1L, (double)this.field3106.method9651(var33 + 7L));
               }

               Class8543.method30436(this.field3108).method30936(var3, 0L, this.field3107);
               Class8543.method30436(this.field3108).method30936(var3, 2L * Class8543.method30437(this.field3108), this.field3107);
               Class8543.method30436(this.field3108).method30936(var3, 4L * Class8543.method30437(this.field3108), this.field3107);
               Class8543.method30436(this.field3108).method30936(var3, 6L * Class8543.method30437(this.field3108), this.field3107);

               for (long var27 = 0L; var27 < Class8543.method30437(this.field3108); var27++) {
                  long var34 = var27 * Class8543.method30439(this.field3108) + var21;
                  long var45 = 2L * var27;
                  long var54 = 2L * Class8543.method30437(this.field3108) + 2L * var27;
                  long var59 = var54 + 2L * Class8543.method30437(this.field3108);
                  long var62 = var59 + 2L * Class8543.method30437(this.field3108);
                  this.field3106.method9687(var34, (double)var3.method9651(var45));
                  this.field3106.method9687(var34 + 1L, (double)var3.method9651(var45 + 1L));
                  this.field3106.method9687(var34 + 2L, (double)var3.method9651(var54));
                  this.field3106.method9687(var34 + 3L, (double)var3.method9651(var54 + 1L));
                  this.field3106.method9687(var34 + 4L, (double)var3.method9651(var59));
                  this.field3106.method9687(var34 + 5L, (double)var3.method9651(var59 + 1L));
                  this.field3106.method9687(var34 + 6L, (double)var3.method9651(var62));
                  this.field3106.method9687(var34 + 7L, (double)var3.method9651(var62 + 1L));
               }
            }
         }
      } else if (Class8543.method30439(this.field3108) <= (long)(4 * this.field3104)) {
         if (Class8543.method30439(this.field3108) != (long)(4 * this.field3104)) {
            if (Class8543.method30439(this.field3108) == (long)(2 * this.field3104)) {
               for (long var22 = 0L; var22 < Class8543.method30437(this.field3108); var22++) {
                  long var35 = var22 * Class8543.method30439(this.field3108) + 2L * this.field3105;
                  long var46 = 2L * var22;
                  var3.method9687(var46, (double)this.field3106.method9651(var35));
                  var3.method9687(var46 + 1L, (double)this.field3106.method9651(var35 + 1L));
               }

               Class8543.method30436(this.field3108).method30932(var3, 0L);

               for (long var23 = 0L; var23 < Class8543.method30437(this.field3108); var23++) {
                  long var36 = var23 * Class8543.method30439(this.field3108) + 2L * this.field3105;
                  long var47 = 2L * var23;
                  this.field3106.method9687(var36, (double)var3.method9651(var47));
                  this.field3106.method9687(var36 + 1L, (double)var3.method9651(var47 + 1L));
               }
            }
         } else {
            for (long var24 = 0L; var24 < Class8543.method30437(this.field3108); var24++) {
               long var37 = var24 * Class8543.method30439(this.field3108) + 4L * this.field3105;
               long var48 = 2L * var24;
               long var55 = 2L * Class8543.method30437(this.field3108) + 2L * var24;
               var3.method9687(var48, (double)this.field3106.method9651(var37));
               var3.method9687(var48 + 1L, (double)this.field3106.method9651(var37 + 1L));
               var3.method9687(var55, (double)this.field3106.method9651(var37 + 2L));
               var3.method9687(var55 + 1L, (double)this.field3106.method9651(var37 + 3L));
            }

            Class8543.method30436(this.field3108).method30932(var3, 0L);
            Class8543.method30436(this.field3108).method30932(var3, 2L * Class8543.method30437(this.field3108));

            for (long var25 = 0L; var25 < Class8543.method30437(this.field3108); var25++) {
               long var38 = var25 * Class8543.method30439(this.field3108) + 4L * this.field3105;
               long var49 = 2L * var25;
               long var56 = 2L * Class8543.method30437(this.field3108) + 2L * var25;
               this.field3106.method9687(var38, (double)var3.method9651(var49));
               this.field3106.method9687(var38 + 1L, (double)var3.method9651(var49 + 1L));
               this.field3106.method9687(var38 + 2L, (double)var3.method9651(var56));
               this.field3106.method9687(var38 + 3L, (double)var3.method9651(var56 + 1L));
            }
         }
      } else {
         for (long var26 = 8L * this.field3105; var26 < Class8543.method30439(this.field3108); var26 += (long)(8 * this.field3104)) {
            for (long var28 = 0L; var28 < Class8543.method30437(this.field3108); var28++) {
               long var39 = var28 * Class8543.method30439(this.field3108) + var26;
               long var50 = 2L * var28;
               long var57 = 2L * Class8543.method30437(this.field3108) + 2L * var28;
               long var60 = var57 + 2L * Class8543.method30437(this.field3108);
               long var63 = var60 + 2L * Class8543.method30437(this.field3108);
               var3.method9687(var50, (double)this.field3106.method9651(var39));
               var3.method9687(var50 + 1L, (double)this.field3106.method9651(var39 + 1L));
               var3.method9687(var57, (double)this.field3106.method9651(var39 + 2L));
               var3.method9687(var57 + 1L, (double)this.field3106.method9651(var39 + 3L));
               var3.method9687(var60, (double)this.field3106.method9651(var39 + 4L));
               var3.method9687(var60 + 1L, (double)this.field3106.method9651(var39 + 5L));
               var3.method9687(var63, (double)this.field3106.method9651(var39 + 6L));
               var3.method9687(var63 + 1L, (double)this.field3106.method9651(var39 + 7L));
            }

            Class8543.method30436(this.field3108).method30932(var3, 0L);
            Class8543.method30436(this.field3108).method30932(var3, 2L * Class8543.method30437(this.field3108));
            Class8543.method30436(this.field3108).method30932(var3, 4L * Class8543.method30437(this.field3108));
            Class8543.method30436(this.field3108).method30932(var3, 6L * Class8543.method30437(this.field3108));

            for (long var29 = 0L; var29 < Class8543.method30437(this.field3108); var29++) {
               long var40 = var29 * Class8543.method30439(this.field3108) + var26;
               long var51 = 2L * var29;
               long var58 = 2L * Class8543.method30437(this.field3108) + 2L * var29;
               long var61 = var58 + 2L * Class8543.method30437(this.field3108);
               long var64 = var61 + 2L * Class8543.method30437(this.field3108);
               this.field3106.method9687(var40, (double)var3.method9651(var51));
               this.field3106.method9687(var40 + 1L, (double)var3.method9651(var51 + 1L));
               this.field3106.method9687(var40 + 2L, (double)var3.method9651(var58));
               this.field3106.method9687(var40 + 3L, (double)var3.method9651(var58 + 1L));
               this.field3106.method9687(var40 + 4L, (double)var3.method9651(var61));
               this.field3106.method9687(var40 + 5L, (double)var3.method9651(var61 + 1L));
               this.field3106.method9687(var40 + 6L, (double)var3.method9651(var64));
               this.field3106.method9687(var40 + 7L, (double)var3.method9651(var64 + 1L));
            }
         }
      }
   }
}
