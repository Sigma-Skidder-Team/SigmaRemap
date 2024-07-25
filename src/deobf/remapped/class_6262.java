package remapped;

import java.util.List;
import java.util.Random;

public class class_6262 extends class_462 {
   private final boolean field_32003;
   private final boolean field_32000;
   private boolean field_32004;
   private final int field_32001;

   public class_6262(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13447, var2);
      this.field_32003 = var2.getBoolean("hr");
      this.field_32000 = var2.getBoolean("sc");
      this.field_32004 = var2.getBoolean("hps");
      this.field_32001 = var2.method_25947("Num");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("hr", this.field_32003);
      var1.putBoolean("sc", this.field_32000);
      var1.putBoolean("hps", this.field_32004);
      var1.putInt("Num", this.field_32001);
   }

   public class_6262(int var1, Random var2, class_9616 var3, Direction var4, class_1143 var5) {
      super(class_2746.field_13447, var1, var5);
      this.method_32519(var4);
      this.field_36435 = var3;
      this.field_32003 = var2.nextInt(3) == 0;
      this.field_32000 = !this.field_32003 && var2.nextInt(23) == 0;
      if (this.method_32518().method_1029() != class_9249.field_47219) {
         this.field_32001 = var3.method_44393() / 5;
      } else {
         this.field_32001 = var3.method_44387() / 5;
      }
   }

   public static class_9616 method_28564(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5) {
      class_9616 var8 = new class_9616(var2, var3, var4, var2, var3 + 3 - 1, var4);

      int var9;
      for (var9 = var1.nextInt(3) + 2; var9 > 0; var9--) {
         int var10 = var9 * 5;
         switch (var5) {
            case field_818:
            default:
               var8.field_48991 = var2 + 3 - 1;
               var8.field_48992 = var4 - (var10 - 1);
               break;
            case field_800:
               var8.field_48991 = var2 + 3 - 1;
               var8.field_48994 = var4 + var10 - 1;
               break;
            case field_809:
               var8.field_48996 = var2 - (var10 - 1);
               var8.field_48994 = var4 + 3 - 1;
               break;
            case field_804:
               var8.field_48991 = var2 + var10 - 1;
               var8.field_48994 = var4 + 3 - 1;
         }

         if (class_7060.method_32502(var0, var8) == null) {
            break;
         }
      }

      return var9 > 0 ? var8 : null;
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      int var6 = this.method_32515();
      int var7 = var3.nextInt(4);
      Direction var8 = this.method_32518();
      if (var8 != null) {
         switch (var8) {
            case field_818:
            default:
               if (var7 <= 1) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48996,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48992 - 1,
                     var8,
                     var6
                  );
               } else if (var7 == 2) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48996 - 1,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48992,
                     Direction.field_809,
                     var6
                  );
               } else {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48991 + 1,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48992,
                     Direction.field_804,
                     var6
                  );
               }
               break;
            case field_800:
               if (var7 <= 1) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48996,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48994 + 1,
                     var8,
                     var6
                  );
               } else if (var7 == 2) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48996 - 1,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48994 - 3,
                     Direction.field_809,
                     var6
                  );
               } else {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48991 + 1,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48994 - 3,
                     Direction.field_804,
                     var6
                  );
               }
               break;
            case field_809:
               if (var7 <= 1) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48996 - 1,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48992,
                     var8,
                     var6
                  );
               } else if (var7 == 2) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48996,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48992 - 1,
                     Direction.field_818,
                     var6
                  );
               } else {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48996,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48994 + 1,
                     Direction.field_800,
                     var6
                  );
               }
               break;
            case field_804:
               if (var7 <= 1) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48991 + 1,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48992,
                     var8,
                     var6
                  );
               } else if (var7 == 2) {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48991 - 3,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48992 - 1,
                     Direction.field_818,
                     var6
                  );
               } else {
                  class_1087.method_4766(
                     var1,
                     var2,
                     var3,
                     this.field_36435.field_48991 - 3,
                     this.field_36435.field_48995 - 1 + var3.nextInt(3),
                     this.field_36435.field_48994 + 1,
                     Direction.field_800,
                     var6
                  );
               }
         }
      }

      if (var6 < 8) {
         if (var8 != Direction.field_818 && var8 != Direction.field_800) {
            for (int var11 = this.field_36435.field_48996 + 3; var11 + 3 <= this.field_36435.field_48991; var11 += 5) {
               int var12 = var3.nextInt(5);
               if (var12 == 0) {
                  class_1087.method_4766(var1, var2, var3, var11, this.field_36435.field_48995, this.field_36435.field_48992 - 1, Direction.field_818, var6 + 1);
               } else if (var12 == 1) {
                  class_1087.method_4766(var1, var2, var3, var11, this.field_36435.field_48995, this.field_36435.field_48994 + 1, Direction.field_800, var6 + 1);
               }
            }
         } else {
            for (int var9 = this.field_36435.field_48992 + 3; var9 + 3 <= this.field_36435.field_48994; var9 += 5) {
               int var10 = var3.nextInt(5);
               if (var10 == 0) {
                  class_1087.method_4766(var1, var2, var3, this.field_36435.field_48996 - 1, this.field_36435.field_48995, var9, Direction.field_809, var6 + 1);
               } else if (var10 == 1) {
                  class_1087.method_4766(var1, var2, var3, this.field_36435.field_48991 + 1, this.field_36435.field_48995, var9, Direction.field_804, var6 + 1);
               }
            }
         }
      }
   }

   @Override
   public boolean method_32525(class_700 var1, class_9616 var2, Random var3, int var4, int var5, int var6, Identifier var7) {
      BlockPos var10 = new BlockPos(this.method_32530(var4, var6), this.method_32507(var5), this.method_32523(var4, var6));
      if (var2.method_44395(var10) && var1.method_28262(var10).method_8345() && !var1.method_28262(var10.method_6100()).method_8345()) {
         class_2522 var11 = class_4783.field_23540
            .method_29260()
            .method_10308(class_2399.field_11970, !var3.nextBoolean() ? class_3665.field_17831 : class_3665.field_17829);
         this.method_32529(var1, var11, var4, var5, var6, var2);
         class_5340 var12 = new class_5340(
            var1.method_7066(), (double)var10.method_12173() + 0.5, (double)var10.method_12165() + 0.5, (double)var10.method_12185() + 0.5
         );
         var12.method_1297(var7, var3.nextLong());
         var1.method_7509(var12);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      if (this.method_32503(var1, var5)) {
         return false;
      } else {
         boolean var10 = false;
         byte var11 = 2;
         boolean var12 = false;
         byte var13 = 2;
         int var14 = this.field_32001 * 5 - 1;
         class_2522 var15 = this.method_2213();
         this.method_32500(var1, var5, 0, 0, 0, 2, 1, var14, field_36439, field_36439, false);
         this.method_32506(var1, var5, var4, 0.8F, 0, 2, 0, 2, 2, var14, field_36439, field_36439, false, false);
         if (this.field_32000) {
            this.method_32506(var1, var5, var4, 0.6F, 0, 0, 0, 2, 1, var14, class_4783.field_23718.method_29260(), field_36439, false, true);
         }

         for (int var16 = 0; var16 < this.field_32001; var16++) {
            int var17 = 2 + var16 * 5;
            this.method_28565(var1, var5, 0, 0, var17, 2, 2, var4);
            this.method_28563(var1, var5, var4, 0.1F, 0, 2, var17 - 1);
            this.method_28563(var1, var5, var4, 0.1F, 2, 2, var17 - 1);
            this.method_28563(var1, var5, var4, 0.1F, 0, 2, var17 + 1);
            this.method_28563(var1, var5, var4, 0.1F, 2, 2, var17 + 1);
            this.method_28563(var1, var5, var4, 0.05F, 0, 2, var17 - 2);
            this.method_28563(var1, var5, var4, 0.05F, 2, 2, var17 - 2);
            this.method_28563(var1, var5, var4, 0.05F, 0, 2, var17 + 2);
            this.method_28563(var1, var5, var4, 0.05F, 2, 2, var17 + 2);
            if (var4.nextInt(100) == 0) {
               this.method_32525(var1, var5, var4, 2, 0, var17 - 1, class_5931.field_30128);
            }

            if (var4.nextInt(100) == 0) {
               this.method_32525(var1, var5, var4, 0, 0, var17 + 1, class_5931.field_30128);
            }

            if (this.field_32000 && !this.field_32004) {
               int var18 = this.method_32507(0);
               int var19 = var17 - 1 + var4.nextInt(3);
               int var20 = this.method_32530(1, var19);
               int var21 = this.method_32523(1, var19);
               BlockPos var22 = new BlockPos(var20, var18, var21);
               if (var5.method_44395(var22) && this.method_32522(var1, 1, 0, var19, var5)) {
                  this.field_32004 = true;
                  var1.method_7513(var22, class_4783.field_23617.method_29260(), 2);
                  class_3757 var23 = var1.method_28260(var22);
                  if (var23 instanceof class_1896) {
                     ((class_1896)var23).method_8621().method_16253(EntityType.field_34272);
                  }
               }
            }
         }

         for (int var24 = 0; var24 <= 2; var24++) {
            for (int var26 = 0; var26 <= var14; var26++) {
               byte var28 = -1;
               class_2522 var30 = this.method_32514(var1, var24, -1, var26, var5);
               if (var30.method_8345() && this.method_32522(var1, var24, -1, var26, var5)) {
                  byte var32 = -1;
                  this.method_32529(var1, var15, var24, -1, var26, var5);
               }
            }
         }

         if (this.field_32003) {
            class_2522 var25 = class_4783.field_23540.method_29260().method_10308(class_2399.field_11970, class_3665.field_17829);

            for (int var27 = 0; var27 <= var14; var27++) {
               class_2522 var29 = this.method_32514(var1, 1, -1, var27, var5);
               if (!var29.method_8345()
                  && var29.method_8321(var1, new BlockPos(this.method_32530(1, var27), this.method_32507(-1), this.method_32523(1, var27)))) {
                  float var31 = !this.method_32522(var1, 1, 0, var27, var5) ? 0.9F : 0.7F;
                  this.method_32524(var1, var5, var4, var31, 1, 0, var27, var25);
               }
            }
         }

         return true;
      }
   }

   private void method_28565(class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6, int var7, Random var8) {
      if (this.method_2214(var1, var2, var3, var7, var6, var5)) {
         class_2522 var11 = this.method_2213();
         class_2522 var12 = this.method_2215();
         this.method_32500(
            var1, var2, var3, var4, var5, var3, var6 - 1, var5, var12.method_10308(class_3821.field_49664, Boolean.valueOf(true)), field_36439, false
         );
         this.method_32500(
            var1, var2, var7, var4, var5, var7, var6 - 1, var5, var12.method_10308(class_3821.field_49667, Boolean.valueOf(true)), field_36439, false
         );
         if (var8.nextInt(4) != 0) {
            this.method_32500(var1, var2, var3, var6, var5, var7, var6, var5, var11, field_36439, false);
            this.method_32524(
               var1,
               var2,
               var8,
               0.05F,
               var3 + 1,
               var6,
               var5 - 1,
               class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_818)
            );
            this.method_32524(
               var1,
               var2,
               var8,
               0.05F,
               var3 + 1,
               var6,
               var5 + 1,
               class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_800)
            );
         } else {
            this.method_32500(var1, var2, var3, var6, var5, var3, var6, var5, var11, field_36439, false);
            this.method_32500(var1, var2, var7, var6, var5, var7, var6, var5, var11, field_36439, false);
         }
      }
   }

   private void method_28563(class_700 var1, class_9616 var2, Random var3, float var4, int var5, int var6, int var7) {
      if (this.method_32522(var1, var5, var6, var7, var2)) {
         this.method_32524(var1, var2, var3, var4, var5, var6, var7, class_4783.field_23718.method_29260());
      }
   }
}
