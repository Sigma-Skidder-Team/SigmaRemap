package mapped;

public class Class1601 implements Runnable {
   private static String[] field8670;
   public final long field8671;
   public final int field8672;
   public final long field8673;
   public final int field8674;
   public final Class2381 field8675;
   public final boolean field8676;
   public final Class8832 field8677;

   public Class1601(Class8832 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field8677 = var1;
      this.field8671 = var2;
      this.field8672 = var4;
      this.field8673 = var5;
      this.field8674 = var7;
      this.field8675 = var8;
      this.field8676 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field8671);
      if (this.field8672 != -1) {
         if (Class8832.method31964(this.field8677) <= 2L) {
            if (Class8832.method31964(this.field8677) == 2L) {
               for (long var4 = this.field8673; var4 < Class8832.method31963(this.field8677); var4 += (long)this.field8674) {
                  long var6 = var4 * Class8832.method31967(this.field8677);

                  for (long var8 = 0L; var8 < Class8832.method31965(this.field8677); var8++) {
                     long var12 = var8 * Class8832.method31966(this.field8677) + var6;
                     var3.method9687(var8, this.field8675.method9653(var12));
                     var3.method9687(Class8832.method31965(this.field8677) + var8, this.field8675.method9653(var12 + 1L));
                  }

                  Class8832.method31962(this.field8677).method33653(var3, 0L, this.field8676);
                  Class8832.method31962(this.field8677).method33653(var3, Class8832.method31965(this.field8677), this.field8676);

                  for (long var22 = 0L; var22 < Class8832.method31965(this.field8677); var22++) {
                     long var30 = var22 * Class8832.method31966(this.field8677) + var6;
                     this.field8675.method9687(var30, var3.method9653(var22));
                     this.field8675.method9687(var30 + 1L, var3.method9653(Class8832.method31965(this.field8677) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field8673; var16 < Class8832.method31963(this.field8677); var16 += (long)this.field8674) {
               long var19 = var16 * Class8832.method31967(this.field8677);

               for (long var23 = 0L; var23 < Class8832.method31964(this.field8677); var23 += 4L) {
                  for (long var10 = 0L; var10 < Class8832.method31965(this.field8677); var10++) {
                     long var31 = var10 * Class8832.method31966(this.field8677) + var19 + var23;
                     long var14 = Class8832.method31965(this.field8677) + var10;
                     var3.method9687(var10, this.field8675.method9653(var31));
                     var3.method9687(var14, this.field8675.method9653(var31 + 1L));
                     var3.method9687(var14 + Class8832.method31965(this.field8677), this.field8675.method9653(var31 + 2L));
                     var3.method9687(var14 + 2L * Class8832.method31965(this.field8677), this.field8675.method9653(var31 + 3L));
                  }

                  Class8832.method31962(this.field8677).method33653(var3, 0L, this.field8676);
                  Class8832.method31962(this.field8677).method33653(var3, Class8832.method31965(this.field8677), this.field8676);
                  Class8832.method31962(this.field8677).method33653(var3, 2L * Class8832.method31965(this.field8677), this.field8676);
                  Class8832.method31962(this.field8677).method33653(var3, 3L * Class8832.method31965(this.field8677), this.field8676);

                  for (long var27 = 0L; var27 < Class8832.method31965(this.field8677); var27++) {
                     long var32 = var27 * Class8832.method31966(this.field8677) + var19 + var23;
                     long var37 = Class8832.method31965(this.field8677) + var27;
                     this.field8675.method9687(var32, var3.method9653(var27));
                     this.field8675.method9687(var32 + 1L, var3.method9653(var37));
                     this.field8675.method9687(var32 + 2L, var3.method9653(var37 + Class8832.method31965(this.field8677)));
                     this.field8675.method9687(var32 + 3L, var3.method9653(var37 + 2L * Class8832.method31965(this.field8677)));
                  }
               }
            }
         }
      } else if (Class8832.method31964(this.field8677) <= 2L) {
         if (Class8832.method31964(this.field8677) == 2L) {
            for (long var17 = this.field8673; var17 < Class8832.method31963(this.field8677); var17 += (long)this.field8674) {
               long var20 = var17 * Class8832.method31967(this.field8677);

               for (long var24 = 0L; var24 < Class8832.method31965(this.field8677); var24++) {
                  long var33 = var24 * Class8832.method31966(this.field8677) + var20;
                  var3.method9687(var24, this.field8675.method9653(var33));
                  var3.method9687(Class8832.method31965(this.field8677) + var24, this.field8675.method9653(var33 + 1L));
               }

               Class8832.method31962(this.field8677).method33649(var3, 0L);
               Class8832.method31962(this.field8677).method33649(var3, Class8832.method31965(this.field8677));

               for (long var25 = 0L; var25 < Class8832.method31965(this.field8677); var25++) {
                  long var34 = var25 * Class8832.method31966(this.field8677) + var20;
                  this.field8675.method9687(var34, var3.method9653(var25));
                  this.field8675.method9687(var34 + 1L, var3.method9653(Class8832.method31965(this.field8677) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field8673; var18 < Class8832.method31963(this.field8677); var18 += (long)this.field8674) {
            long var21 = var18 * Class8832.method31967(this.field8677);

            for (long var26 = 0L; var26 < Class8832.method31964(this.field8677); var26 += 4L) {
               for (long var28 = 0L; var28 < Class8832.method31965(this.field8677); var28++) {
                  long var35 = var28 * Class8832.method31966(this.field8677) + var21 + var26;
                  long var38 = Class8832.method31965(this.field8677) + var28;
                  var3.method9687(var28, this.field8675.method9653(var35));
                  var3.method9687(var38, this.field8675.method9653(var35 + 1L));
                  var3.method9687(var38 + Class8832.method31965(this.field8677), this.field8675.method9653(var35 + 2L));
                  var3.method9687(var38 + 2L * Class8832.method31965(this.field8677), this.field8675.method9653(var35 + 3L));
               }

               Class8832.method31962(this.field8677).method33649(var3, 0L);
               Class8832.method31962(this.field8677).method33649(var3, Class8832.method31965(this.field8677));
               Class8832.method31962(this.field8677).method33649(var3, 2L * Class8832.method31965(this.field8677));
               Class8832.method31962(this.field8677).method33649(var3, 3L * Class8832.method31965(this.field8677));

               for (long var29 = 0L; var29 < Class8832.method31965(this.field8677); var29++) {
                  long var36 = var29 * Class8832.method31966(this.field8677) + var21 + var26;
                  long var39 = Class8832.method31965(this.field8677) + var29;
                  this.field8675.method9687(var36, var3.method9653(var29));
                  this.field8675.method9687(var36 + 1L, var3.method9653(var39));
                  this.field8675.method9687(var36 + 2L, var3.method9653(var39 + Class8832.method31965(this.field8677)));
                  this.field8675.method9687(var36 + 3L, var3.method9653(var39 + 2L * Class8832.method31965(this.field8677)));
               }
            }
         }
      }
   }
}
