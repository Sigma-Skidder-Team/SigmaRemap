package mapped;

public class Class1574 implements Runnable {
   private static String[] field8515;
   public final long field8516;
   public final int field8517;
   public final int field8518;
   public final long field8519;
   public final Class2381 field8520;
   public final boolean field8521;
   public final Class9615 field8522;

   public Class1574(Class9615 var1, long var2, int var4, int var5, long var6, Class2381 var8, boolean var9) {
      this.field8522 = var1;
      this.field8516 = var2;
      this.field8517 = var4;
      this.field8518 = var5;
      this.field8519 = var6;
      this.field8520 = var8;
      this.field8521 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field8516);
      if (this.field8517 != -1) {
         if (Class9615.method37428(this.field8522) <= (long)(4 * this.field8518)) {
            if (Class9615.method37428(this.field8522) != (long)(4 * this.field8518)) {
               if (Class9615.method37428(this.field8522) == (long)(2 * this.field8518)) {
                  for (long var4 = 0L; var4 < Class9615.method37426(this.field8522); var4++) {
                     long var8 = var4 * Class9615.method37428(this.field8522) + 2L * this.field8519;
                     long var10 = 2L * var4;
                     var3.method9687(var10, this.field8520.method9653(var8));
                     var3.method9687(var10 + 1L, this.field8520.method9653(var8 + 1L));
                  }

                  Class9615.method37425(this.field8522).method27169(var3, 0L, this.field8521);

                  for (long var18 = 0L; var18 < Class9615.method37426(this.field8522); var18++) {
                     long var30 = var18 * Class9615.method37428(this.field8522) + 2L * this.field8519;
                     long var41 = 2L * var18;
                     this.field8520.method9687(var30, var3.method9653(var41));
                     this.field8520.method9687(var30 + 1L, var3.method9653(var41 + 1L));
                  }
               }
            } else {
               for (long var19 = 0L; var19 < Class9615.method37426(this.field8522); var19++) {
                  long var31 = var19 * Class9615.method37428(this.field8522) + 4L * this.field8519;
                  long var42 = 2L * var19;
                  long var12 = 2L * Class9615.method37426(this.field8522) + 2L * var19;
                  var3.method9687(var42, this.field8520.method9653(var31));
                  var3.method9687(var42 + 1L, this.field8520.method9653(var31 + 1L));
                  var3.method9687(var12, this.field8520.method9653(var31 + 2L));
                  var3.method9687(var12 + 1L, this.field8520.method9653(var31 + 3L));
               }

               Class9615.method37425(this.field8522).method27169(var3, 0L, this.field8521);
               Class9615.method37425(this.field8522).method27169(var3, 2L * Class9615.method37426(this.field8522), this.field8521);

               for (long var20 = 0L; var20 < Class9615.method37426(this.field8522); var20++) {
                  long var32 = var20 * Class9615.method37428(this.field8522) + 4L * this.field8519;
                  long var43 = 2L * var20;
                  long var52 = 2L * Class9615.method37426(this.field8522) + 2L * var20;
                  this.field8520.method9687(var32, var3.method9653(var43));
                  this.field8520.method9687(var32 + 1L, var3.method9653(var43 + 1L));
                  this.field8520.method9687(var32 + 2L, var3.method9653(var52));
                  this.field8520.method9687(var32 + 3L, var3.method9653(var52 + 1L));
               }
            }
         } else {
            for (long var21 = 8L * this.field8519; var21 < Class9615.method37428(this.field8522); var21 += (long)(8 * this.field8518)) {
               for (long var6 = 0L; var6 < Class9615.method37426(this.field8522); var6++) {
                  long var33 = var6 * Class9615.method37428(this.field8522) + var21;
                  long var44 = 2L * var6;
                  long var53 = 2L * Class9615.method37426(this.field8522) + 2L * var6;
                  long var14 = var53 + 2L * Class9615.method37426(this.field8522);
                  long var16 = var14 + 2L * Class9615.method37426(this.field8522);
                  var3.method9687(var44, this.field8520.method9653(var33));
                  var3.method9687(var44 + 1L, this.field8520.method9653(var33 + 1L));
                  var3.method9687(var53, this.field8520.method9653(var33 + 2L));
                  var3.method9687(var53 + 1L, this.field8520.method9653(var33 + 3L));
                  var3.method9687(var14, this.field8520.method9653(var33 + 4L));
                  var3.method9687(var14 + 1L, this.field8520.method9653(var33 + 5L));
                  var3.method9687(var16, this.field8520.method9653(var33 + 6L));
                  var3.method9687(var16 + 1L, this.field8520.method9653(var33 + 7L));
               }

               Class9615.method37425(this.field8522).method27169(var3, 0L, this.field8521);
               Class9615.method37425(this.field8522).method27169(var3, 2L * Class9615.method37426(this.field8522), this.field8521);
               Class9615.method37425(this.field8522).method27169(var3, 4L * Class9615.method37426(this.field8522), this.field8521);
               Class9615.method37425(this.field8522).method27169(var3, 6L * Class9615.method37426(this.field8522), this.field8521);

               for (long var27 = 0L; var27 < Class9615.method37426(this.field8522); var27++) {
                  long var34 = var27 * Class9615.method37428(this.field8522) + var21;
                  long var45 = 2L * var27;
                  long var54 = 2L * Class9615.method37426(this.field8522) + 2L * var27;
                  long var59 = var54 + 2L * Class9615.method37426(this.field8522);
                  long var62 = var59 + 2L * Class9615.method37426(this.field8522);
                  this.field8520.method9687(var34, var3.method9653(var45));
                  this.field8520.method9687(var34 + 1L, var3.method9653(var45 + 1L));
                  this.field8520.method9687(var34 + 2L, var3.method9653(var54));
                  this.field8520.method9687(var34 + 3L, var3.method9653(var54 + 1L));
                  this.field8520.method9687(var34 + 4L, var3.method9653(var59));
                  this.field8520.method9687(var34 + 5L, var3.method9653(var59 + 1L));
                  this.field8520.method9687(var34 + 6L, var3.method9653(var62));
                  this.field8520.method9687(var34 + 7L, var3.method9653(var62 + 1L));
               }
            }
         }
      } else if (Class9615.method37428(this.field8522) <= (long)(4 * this.field8518)) {
         if (Class9615.method37428(this.field8522) != (long)(4 * this.field8518)) {
            if (Class9615.method37428(this.field8522) == (long)(2 * this.field8518)) {
               for (long var22 = 0L; var22 < Class9615.method37426(this.field8522); var22++) {
                  long var35 = var22 * Class9615.method37428(this.field8522) + 2L * this.field8519;
                  long var46 = 2L * var22;
                  var3.method9687(var46, this.field8520.method9653(var35));
                  var3.method9687(var46 + 1L, this.field8520.method9653(var35 + 1L));
               }

               Class9615.method37425(this.field8522).method27165(var3, 0L);

               for (long var23 = 0L; var23 < Class9615.method37426(this.field8522); var23++) {
                  long var36 = var23 * Class9615.method37428(this.field8522) + 2L * this.field8519;
                  long var47 = 2L * var23;
                  this.field8520.method9687(var36, var3.method9653(var47));
                  this.field8520.method9687(var36 + 1L, var3.method9653(var47 + 1L));
               }
            }
         } else {
            for (long var24 = 0L; var24 < Class9615.method37426(this.field8522); var24++) {
               long var37 = var24 * Class9615.method37428(this.field8522) + 4L * this.field8519;
               long var48 = 2L * var24;
               long var55 = 2L * Class9615.method37426(this.field8522) + 2L * var24;
               var3.method9687(var48, this.field8520.method9653(var37));
               var3.method9687(var48 + 1L, this.field8520.method9653(var37 + 1L));
               var3.method9687(var55, this.field8520.method9653(var37 + 2L));
               var3.method9687(var55 + 1L, this.field8520.method9653(var37 + 3L));
            }

            Class9615.method37425(this.field8522).method27165(var3, 0L);
            Class9615.method37425(this.field8522).method27165(var3, 2L * Class9615.method37426(this.field8522));

            for (long var25 = 0L; var25 < Class9615.method37426(this.field8522); var25++) {
               long var38 = var25 * Class9615.method37428(this.field8522) + 4L * this.field8519;
               long var49 = 2L * var25;
               long var56 = 2L * Class9615.method37426(this.field8522) + 2L * var25;
               this.field8520.method9687(var38, var3.method9653(var49));
               this.field8520.method9687(var38 + 1L, var3.method9653(var49 + 1L));
               this.field8520.method9687(var38 + 2L, var3.method9653(var56));
               this.field8520.method9687(var38 + 3L, var3.method9653(var56 + 1L));
            }
         }
      } else {
         for (long var26 = 8L * this.field8519; var26 < Class9615.method37428(this.field8522); var26 += (long)(8 * this.field8518)) {
            for (long var28 = 0L; var28 < Class9615.method37426(this.field8522); var28++) {
               long var39 = var28 * Class9615.method37428(this.field8522) + var26;
               long var50 = 2L * var28;
               long var57 = 2L * Class9615.method37426(this.field8522) + 2L * var28;
               long var60 = var57 + 2L * Class9615.method37426(this.field8522);
               long var63 = var60 + 2L * Class9615.method37426(this.field8522);
               var3.method9687(var50, this.field8520.method9653(var39));
               var3.method9687(var50 + 1L, this.field8520.method9653(var39 + 1L));
               var3.method9687(var57, this.field8520.method9653(var39 + 2L));
               var3.method9687(var57 + 1L, this.field8520.method9653(var39 + 3L));
               var3.method9687(var60, this.field8520.method9653(var39 + 4L));
               var3.method9687(var60 + 1L, this.field8520.method9653(var39 + 5L));
               var3.method9687(var63, this.field8520.method9653(var39 + 6L));
               var3.method9687(var63 + 1L, this.field8520.method9653(var39 + 7L));
            }

            Class9615.method37425(this.field8522).method27165(var3, 0L);
            Class9615.method37425(this.field8522).method27165(var3, 2L * Class9615.method37426(this.field8522));
            Class9615.method37425(this.field8522).method27165(var3, 4L * Class9615.method37426(this.field8522));
            Class9615.method37425(this.field8522).method27165(var3, 6L * Class9615.method37426(this.field8522));

            for (long var29 = 0L; var29 < Class9615.method37426(this.field8522); var29++) {
               long var40 = var29 * Class9615.method37428(this.field8522) + var26;
               long var51 = 2L * var29;
               long var58 = 2L * Class9615.method37426(this.field8522) + 2L * var29;
               long var61 = var58 + 2L * Class9615.method37426(this.field8522);
               long var64 = var61 + 2L * Class9615.method37426(this.field8522);
               this.field8520.method9687(var40, var3.method9653(var51));
               this.field8520.method9687(var40 + 1L, var3.method9653(var51 + 1L));
               this.field8520.method9687(var40 + 2L, var3.method9653(var58));
               this.field8520.method9687(var40 + 3L, var3.method9653(var58 + 1L));
               this.field8520.method9687(var40 + 4L, var3.method9653(var61));
               this.field8520.method9687(var40 + 5L, var3.method9653(var61 + 1L));
               this.field8520.method9687(var40 + 6L, var3.method9653(var64));
               this.field8520.method9687(var40 + 7L, var3.method9653(var64 + 1L));
            }
         }
      }
   }
}
