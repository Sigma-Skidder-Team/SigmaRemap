package remapped;

public class class_5035 implements Runnable {
   private static String[] field_26056;

   public class_5035(class_9035 var1, long var2, int var4, int var5, long var6, class_1702 var8, boolean var9) {
      this.field_26057 = var1;
      this.field_26058 = var2;
      this.field_26054 = var4;
      this.field_26051 = var5;
      this.field_26052 = var6;
      this.field_26053 = var8;
      this.field_26055 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_26058);
      if (this.field_26054 != -1) {
         if (class_9035.method_41456(this.field_26057) <= (long)(4 * this.field_26051)) {
            if (class_9035.method_41456(this.field_26057) != (long)(4 * this.field_26051)) {
               if (class_9035.method_41456(this.field_26057) == (long)(2 * this.field_26051)) {
                  for (long var4 = 0L; var4 < class_9035.method_41453(this.field_26057); var4++) {
                     long var8 = var4 * class_9035.method_41456(this.field_26057) + 2L * this.field_26052;
                     long var10 = 2L * var4;
                     var3.method_36114(var10, this.field_26053.method_36107(var8));
                     var3.method_36114(var10 + 1L, this.field_26053.method_36107(var8 + 1L));
                  }

                  class_9035.method_41455(this.field_26057).method_15033(var3, 0L, this.field_26055);

                  for (long var18 = 0L; var18 < class_9035.method_41453(this.field_26057); var18++) {
                     long var30 = var18 * class_9035.method_41456(this.field_26057) + 2L * this.field_26052;
                     long var41 = 2L * var18;
                     this.field_26053.method_36114(var30, var3.method_36107(var41));
                     this.field_26053.method_36114(var30 + 1L, var3.method_36107(var41 + 1L));
                  }
               }
            } else {
               for (long var19 = 0L; var19 < class_9035.method_41453(this.field_26057); var19++) {
                  long var31 = var19 * class_9035.method_41456(this.field_26057) + 4L * this.field_26052;
                  long var42 = 2L * var19;
                  long var12 = 2L * class_9035.method_41453(this.field_26057) + 2L * var19;
                  var3.method_36114(var42, this.field_26053.method_36107(var31));
                  var3.method_36114(var42 + 1L, this.field_26053.method_36107(var31 + 1L));
                  var3.method_36114(var12, this.field_26053.method_36107(var31 + 2L));
                  var3.method_36114(var12 + 1L, this.field_26053.method_36107(var31 + 3L));
               }

               class_9035.method_41455(this.field_26057).method_15033(var3, 0L, this.field_26055);
               class_9035.method_41455(this.field_26057).method_15033(var3, 2L * class_9035.method_41453(this.field_26057), this.field_26055);

               for (long var20 = 0L; var20 < class_9035.method_41453(this.field_26057); var20++) {
                  long var32 = var20 * class_9035.method_41456(this.field_26057) + 4L * this.field_26052;
                  long var43 = 2L * var20;
                  long var52 = 2L * class_9035.method_41453(this.field_26057) + 2L * var20;
                  this.field_26053.method_36114(var32, var3.method_36107(var43));
                  this.field_26053.method_36114(var32 + 1L, var3.method_36107(var43 + 1L));
                  this.field_26053.method_36114(var32 + 2L, var3.method_36107(var52));
                  this.field_26053.method_36114(var32 + 3L, var3.method_36107(var52 + 1L));
               }
            }
         } else {
            for (long var21 = 8L * this.field_26052; var21 < class_9035.method_41456(this.field_26057); var21 += (long)(8 * this.field_26051)) {
               for (long var6 = 0L; var6 < class_9035.method_41453(this.field_26057); var6++) {
                  long var33 = var6 * class_9035.method_41456(this.field_26057) + var21;
                  long var44 = 2L * var6;
                  long var53 = 2L * class_9035.method_41453(this.field_26057) + 2L * var6;
                  long var14 = var53 + 2L * class_9035.method_41453(this.field_26057);
                  long var16 = var14 + 2L * class_9035.method_41453(this.field_26057);
                  var3.method_36114(var44, this.field_26053.method_36107(var33));
                  var3.method_36114(var44 + 1L, this.field_26053.method_36107(var33 + 1L));
                  var3.method_36114(var53, this.field_26053.method_36107(var33 + 2L));
                  var3.method_36114(var53 + 1L, this.field_26053.method_36107(var33 + 3L));
                  var3.method_36114(var14, this.field_26053.method_36107(var33 + 4L));
                  var3.method_36114(var14 + 1L, this.field_26053.method_36107(var33 + 5L));
                  var3.method_36114(var16, this.field_26053.method_36107(var33 + 6L));
                  var3.method_36114(var16 + 1L, this.field_26053.method_36107(var33 + 7L));
               }

               class_9035.method_41455(this.field_26057).method_15033(var3, 0L, this.field_26055);
               class_9035.method_41455(this.field_26057).method_15033(var3, 2L * class_9035.method_41453(this.field_26057), this.field_26055);
               class_9035.method_41455(this.field_26057).method_15033(var3, 4L * class_9035.method_41453(this.field_26057), this.field_26055);
               class_9035.method_41455(this.field_26057).method_15033(var3, 6L * class_9035.method_41453(this.field_26057), this.field_26055);

               for (long var27 = 0L; var27 < class_9035.method_41453(this.field_26057); var27++) {
                  long var34 = var27 * class_9035.method_41456(this.field_26057) + var21;
                  long var45 = 2L * var27;
                  long var54 = 2L * class_9035.method_41453(this.field_26057) + 2L * var27;
                  long var59 = var54 + 2L * class_9035.method_41453(this.field_26057);
                  long var62 = var59 + 2L * class_9035.method_41453(this.field_26057);
                  this.field_26053.method_36114(var34, var3.method_36107(var45));
                  this.field_26053.method_36114(var34 + 1L, var3.method_36107(var45 + 1L));
                  this.field_26053.method_36114(var34 + 2L, var3.method_36107(var54));
                  this.field_26053.method_36114(var34 + 3L, var3.method_36107(var54 + 1L));
                  this.field_26053.method_36114(var34 + 4L, var3.method_36107(var59));
                  this.field_26053.method_36114(var34 + 5L, var3.method_36107(var59 + 1L));
                  this.field_26053.method_36114(var34 + 6L, var3.method_36107(var62));
                  this.field_26053.method_36114(var34 + 7L, var3.method_36107(var62 + 1L));
               }
            }
         }
      } else if (class_9035.method_41456(this.field_26057) <= (long)(4 * this.field_26051)) {
         if (class_9035.method_41456(this.field_26057) != (long)(4 * this.field_26051)) {
            if (class_9035.method_41456(this.field_26057) == (long)(2 * this.field_26051)) {
               for (long var22 = 0L; var22 < class_9035.method_41453(this.field_26057); var22++) {
                  long var35 = var22 * class_9035.method_41456(this.field_26057) + 2L * this.field_26052;
                  long var46 = 2L * var22;
                  var3.method_36114(var46, this.field_26053.method_36107(var35));
                  var3.method_36114(var46 + 1L, this.field_26053.method_36107(var35 + 1L));
               }

               class_9035.method_41455(this.field_26057).method_15027(var3, 0L);

               for (long var23 = 0L; var23 < class_9035.method_41453(this.field_26057); var23++) {
                  long var36 = var23 * class_9035.method_41456(this.field_26057) + 2L * this.field_26052;
                  long var47 = 2L * var23;
                  this.field_26053.method_36114(var36, var3.method_36107(var47));
                  this.field_26053.method_36114(var36 + 1L, var3.method_36107(var47 + 1L));
               }
            }
         } else {
            for (long var24 = 0L; var24 < class_9035.method_41453(this.field_26057); var24++) {
               long var37 = var24 * class_9035.method_41456(this.field_26057) + 4L * this.field_26052;
               long var48 = 2L * var24;
               long var55 = 2L * class_9035.method_41453(this.field_26057) + 2L * var24;
               var3.method_36114(var48, this.field_26053.method_36107(var37));
               var3.method_36114(var48 + 1L, this.field_26053.method_36107(var37 + 1L));
               var3.method_36114(var55, this.field_26053.method_36107(var37 + 2L));
               var3.method_36114(var55 + 1L, this.field_26053.method_36107(var37 + 3L));
            }

            class_9035.method_41455(this.field_26057).method_15027(var3, 0L);
            class_9035.method_41455(this.field_26057).method_15027(var3, 2L * class_9035.method_41453(this.field_26057));

            for (long var25 = 0L; var25 < class_9035.method_41453(this.field_26057); var25++) {
               long var38 = var25 * class_9035.method_41456(this.field_26057) + 4L * this.field_26052;
               long var49 = 2L * var25;
               long var56 = 2L * class_9035.method_41453(this.field_26057) + 2L * var25;
               this.field_26053.method_36114(var38, var3.method_36107(var49));
               this.field_26053.method_36114(var38 + 1L, var3.method_36107(var49 + 1L));
               this.field_26053.method_36114(var38 + 2L, var3.method_36107(var56));
               this.field_26053.method_36114(var38 + 3L, var3.method_36107(var56 + 1L));
            }
         }
      } else {
         for (long var26 = 8L * this.field_26052; var26 < class_9035.method_41456(this.field_26057); var26 += (long)(8 * this.field_26051)) {
            for (long var28 = 0L; var28 < class_9035.method_41453(this.field_26057); var28++) {
               long var39 = var28 * class_9035.method_41456(this.field_26057) + var26;
               long var50 = 2L * var28;
               long var57 = 2L * class_9035.method_41453(this.field_26057) + 2L * var28;
               long var60 = var57 + 2L * class_9035.method_41453(this.field_26057);
               long var63 = var60 + 2L * class_9035.method_41453(this.field_26057);
               var3.method_36114(var50, this.field_26053.method_36107(var39));
               var3.method_36114(var50 + 1L, this.field_26053.method_36107(var39 + 1L));
               var3.method_36114(var57, this.field_26053.method_36107(var39 + 2L));
               var3.method_36114(var57 + 1L, this.field_26053.method_36107(var39 + 3L));
               var3.method_36114(var60, this.field_26053.method_36107(var39 + 4L));
               var3.method_36114(var60 + 1L, this.field_26053.method_36107(var39 + 5L));
               var3.method_36114(var63, this.field_26053.method_36107(var39 + 6L));
               var3.method_36114(var63 + 1L, this.field_26053.method_36107(var39 + 7L));
            }

            class_9035.method_41455(this.field_26057).method_15027(var3, 0L);
            class_9035.method_41455(this.field_26057).method_15027(var3, 2L * class_9035.method_41453(this.field_26057));
            class_9035.method_41455(this.field_26057).method_15027(var3, 4L * class_9035.method_41453(this.field_26057));
            class_9035.method_41455(this.field_26057).method_15027(var3, 6L * class_9035.method_41453(this.field_26057));

            for (long var29 = 0L; var29 < class_9035.method_41453(this.field_26057); var29++) {
               long var40 = var29 * class_9035.method_41456(this.field_26057) + var26;
               long var51 = 2L * var29;
               long var58 = 2L * class_9035.method_41453(this.field_26057) + 2L * var29;
               long var61 = var58 + 2L * class_9035.method_41453(this.field_26057);
               long var64 = var61 + 2L * class_9035.method_41453(this.field_26057);
               this.field_26053.method_36114(var40, var3.method_36107(var51));
               this.field_26053.method_36114(var40 + 1L, var3.method_36107(var51 + 1L));
               this.field_26053.method_36114(var40 + 2L, var3.method_36107(var58));
               this.field_26053.method_36114(var40 + 3L, var3.method_36107(var58 + 1L));
               this.field_26053.method_36114(var40 + 4L, var3.method_36107(var61));
               this.field_26053.method_36114(var40 + 5L, var3.method_36107(var61 + 1L));
               this.field_26053.method_36114(var40 + 6L, var3.method_36107(var64));
               this.field_26053.method_36114(var40 + 7L, var3.method_36107(var64 + 1L));
            }
         }
      }
   }
}
