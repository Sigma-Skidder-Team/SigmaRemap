package remapped;

public class class_7830 implements Runnable {
   private static String[] field_39720;

   public class_7830(class_573 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_39719 = var1;
      this.field_39724 = var2;
      this.field_39722 = var4;
      this.field_39723 = var5;
      this.field_39718 = var7;
      this.field_39721 = var8;
      this.field_39717 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_39724);
      if (this.field_39722 != -1) {
         for (long var4 = this.field_39723; var4 < class_573.method_2725(this.field_39719); var4 += (long)this.field_39718) {
            long var6 = var4 * class_573.method_2731(this.field_39719);

            for (long var8 = 0L; var8 < class_573.method_2715(this.field_39719); var8++) {
               class_573.method_2736(this.field_39719).method_44818(this.field_39721, var6 + var8 * class_573.method_2726(this.field_39719), this.field_39717);
            }

            if (class_573.method_2735(this.field_39719) <= 2L) {
               if (class_573.method_2735(this.field_39719) == 2L) {
                  for (long var19 = 0L; var19 < class_573.method_2715(this.field_39719); var19++) {
                     long var29 = var6 + var19 * class_573.method_2726(this.field_39719);
                     var3.method_36114(var19, this.field_39721.method_36107(var29));
                     var3.method_36114(class_573.method_2715(this.field_39719) + var19, this.field_39721.method_36107(var29 + 1L));
                  }

                  class_573.method_2711(this.field_39719).method_44818(var3, 0L, this.field_39717);
                  class_573.method_2711(this.field_39719).method_44818(var3, class_573.method_2715(this.field_39719), this.field_39717);

                  for (long var20 = 0L; var20 < class_573.method_2715(this.field_39719); var20++) {
                     long var30 = var6 + var20 * class_573.method_2726(this.field_39719);
                     this.field_39721.method_36114(var30, var3.method_36107(var20));
                     this.field_39721.method_36114(var30 + 1L, var3.method_36107(class_573.method_2715(this.field_39719) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < class_573.method_2735(this.field_39719); var18 += 4L) {
                  for (long var10 = 0L; var10 < class_573.method_2715(this.field_39719); var10++) {
                     long var12 = var6 + var10 * class_573.method_2726(this.field_39719) + var18;
                     long var14 = class_573.method_2715(this.field_39719) + var10;
                     var3.method_36114(var10, this.field_39721.method_36107(var12));
                     var3.method_36114(var14, this.field_39721.method_36107(var12 + 1L));
                     var3.method_36114(var14 + class_573.method_2715(this.field_39719), this.field_39721.method_36107(var12 + 2L));
                     var3.method_36114(var14 + 2L * class_573.method_2715(this.field_39719), this.field_39721.method_36107(var12 + 3L));
                  }

                  class_573.method_2711(this.field_39719).method_44818(var3, 0L, this.field_39717);
                  class_573.method_2711(this.field_39719).method_44818(var3, class_573.method_2715(this.field_39719), this.field_39717);
                  class_573.method_2711(this.field_39719).method_44818(var3, 2L * class_573.method_2715(this.field_39719), this.field_39717);
                  class_573.method_2711(this.field_39719).method_44818(var3, 3L * class_573.method_2715(this.field_39719), this.field_39717);

                  for (long var25 = 0L; var25 < class_573.method_2715(this.field_39719); var25++) {
                     long var28 = var6 + var25 * class_573.method_2726(this.field_39719) + var18;
                     long var35 = class_573.method_2715(this.field_39719) + var25;
                     this.field_39721.method_36114(var28, var3.method_36107(var25));
                     this.field_39721.method_36114(var28 + 1L, var3.method_36107(var35));
                     this.field_39721.method_36114(var28 + 2L, var3.method_36107(var35 + class_573.method_2715(this.field_39719)));
                     this.field_39721.method_36114(var28 + 3L, var3.method_36107(var35 + 2L * class_573.method_2715(this.field_39719)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field_39723; var16 < class_573.method_2725(this.field_39719); var16 += (long)this.field_39718) {
            long var17 = var16 * class_573.method_2731(this.field_39719);

            for (long var21 = 0L; var21 < class_573.method_2715(this.field_39719); var21++) {
               class_573.method_2736(this.field_39719)
                  .method_44813(this.field_39721, var17 + var21 * class_573.method_2726(this.field_39719), this.field_39717);
            }

            if (class_573.method_2735(this.field_39719) <= 2L) {
               if (class_573.method_2735(this.field_39719) == 2L) {
                  for (long var23 = 0L; var23 < class_573.method_2715(this.field_39719); var23++) {
                     long var33 = var17 + var23 * class_573.method_2726(this.field_39719);
                     var3.method_36114(var23, this.field_39721.method_36107(var33));
                     var3.method_36114(class_573.method_2715(this.field_39719) + var23, this.field_39721.method_36107(var33 + 1L));
                  }

                  class_573.method_2711(this.field_39719).method_44813(var3, 0L, this.field_39717);
                  class_573.method_2711(this.field_39719).method_44813(var3, class_573.method_2715(this.field_39719), this.field_39717);

                  for (long var24 = 0L; var24 < class_573.method_2715(this.field_39719); var24++) {
                     long var34 = var17 + var24 * class_573.method_2726(this.field_39719);
                     this.field_39721.method_36114(var34, var3.method_36107(var24));
                     this.field_39721.method_36114(var34 + 1L, var3.method_36107(class_573.method_2715(this.field_39719) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < class_573.method_2735(this.field_39719); var22 += 4L) {
                  for (long var26 = 0L; var26 < class_573.method_2715(this.field_39719); var26++) {
                     long var31 = var17 + var26 * class_573.method_2726(this.field_39719) + var22;
                     long var36 = class_573.method_2715(this.field_39719) + var26;
                     var3.method_36114(var26, this.field_39721.method_36107(var31));
                     var3.method_36114(var36, this.field_39721.method_36107(var31 + 1L));
                     var3.method_36114(var36 + class_573.method_2715(this.field_39719), this.field_39721.method_36107(var31 + 2L));
                     var3.method_36114(var36 + 2L * class_573.method_2715(this.field_39719), this.field_39721.method_36107(var31 + 3L));
                  }

                  class_573.method_2711(this.field_39719).method_44813(var3, 0L, this.field_39717);
                  class_573.method_2711(this.field_39719).method_44813(var3, class_573.method_2715(this.field_39719), this.field_39717);
                  class_573.method_2711(this.field_39719).method_44813(var3, 2L * class_573.method_2715(this.field_39719), this.field_39717);
                  class_573.method_2711(this.field_39719).method_44813(var3, 3L * class_573.method_2715(this.field_39719), this.field_39717);

                  for (long var27 = 0L; var27 < class_573.method_2715(this.field_39719); var27++) {
                     long var32 = var17 + var27 * class_573.method_2726(this.field_39719) + var22;
                     long var37 = class_573.method_2715(this.field_39719) + var27;
                     this.field_39721.method_36114(var32, var3.method_36107(var27));
                     this.field_39721.method_36114(var32 + 1L, var3.method_36107(var37));
                     this.field_39721.method_36114(var32 + 2L, var3.method_36107(var37 + class_573.method_2715(this.field_39719)));
                     this.field_39721.method_36114(var32 + 3L, var3.method_36107(var37 + 2L * class_573.method_2715(this.field_39719)));
                  }
               }
            }
         }
      }
   }
}
