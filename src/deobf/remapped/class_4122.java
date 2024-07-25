package remapped;

import java.util.List;
import java.util.Random;

public class class_4122 extends class_8549 {
   private final boolean field_20084;

   public class_4122(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13426, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
      this.field_20084 = var3.method_44398() > 6;
   }

   public class_4122(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13426, var2);
      this.field_20084 = var2.getBoolean("Tall");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("Tall", this.field_20084);
   }

   public static class_4122 method_19137(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if (!method_39332(var9) || class_7060.method_32502(var0, var9) != null) {
         var9 = class_9616.method_44386(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if (!method_39332(var9) || class_7060.method_32502(var0, var9) != null) {
            return null;
         }
      }

      return new class_4122(var6, var1, var9, var5);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      byte var10 = 11;
      if (!this.field_20084) {
         var10 = 6;
      }

      this.method_32511(var1, var5, 0, 0, 0, 13, var10 - 1, 14, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 4, 1, 0);
      this.method_32506(var1, var5, var4, 0.07F, 2, 1, 1, 11, 4, 13, class_4783.field_23718.method_29260(), class_4783.field_23718.method_29260(), false, false);
      boolean var11 = true;
      byte var12 = 12;

      for (int var13 = 1; var13 <= 13; var13++) {
         if ((var13 - 1) % 4 != 0) {
            this.method_32500(var1, var5, 1, 1, var13, 1, 4, var13, class_4783.field_23313.method_29260(), class_4783.field_23313.method_29260(), false);
            this.method_32500(var1, var5, 12, 1, var13, 12, 4, var13, class_4783.field_23313.method_29260(), class_4783.field_23313.method_29260(), false);
            if (this.field_20084) {
               this.method_32500(var1, var5, 1, 6, var13, 1, 9, var13, class_4783.field_23313.method_29260(), class_4783.field_23313.method_29260(), false);
               this.method_32500(var1, var5, 12, 6, var13, 12, 9, var13, class_4783.field_23313.method_29260(), class_4783.field_23313.method_29260(), false);
            }
         } else {
            this.method_32500(var1, var5, 1, 1, var13, 1, 4, var13, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
            this.method_32500(var1, var5, 12, 1, var13, 12, 4, var13, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
            this.method_32529(var1, class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_804), 2, 3, var13, var5);
            this.method_32529(var1, class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_809), 11, 3, var13, var5);
            if (this.field_20084) {
               this.method_32500(var1, var5, 1, 6, var13, 1, 9, var13, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
               this.method_32500(var1, var5, 12, 6, var13, 12, 9, var13, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
            }
         }
      }

      for (byte var22 = 3; var22 < 12; var22 += 2) {
         this.method_32500(var1, var5, 3, 1, var22, 4, 3, var22, class_4783.field_23313.method_29260(), class_4783.field_23313.method_29260(), false);
         this.method_32500(var1, var5, 6, 1, var22, 7, 3, var22, class_4783.field_23313.method_29260(), class_4783.field_23313.method_29260(), false);
         this.method_32500(var1, var5, 9, 1, var22, 10, 3, var22, class_4783.field_23313.method_29260(), class_4783.field_23313.method_29260(), false);
      }

      if (this.field_20084) {
         this.method_32500(var1, var5, 1, 5, 1, 3, 5, 13, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
         this.method_32500(var1, var5, 10, 5, 1, 12, 5, 13, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
         this.method_32500(var1, var5, 4, 5, 1, 9, 5, 2, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
         this.method_32500(var1, var5, 4, 5, 12, 9, 5, 13, class_4783.field_23893.method_29260(), class_4783.field_23893.method_29260(), false);
         this.method_32529(var1, class_4783.field_23893.method_29260(), 9, 5, 11, var5);
         this.method_32529(var1, class_4783.field_23893.method_29260(), 8, 5, 11, var5);
         this.method_32529(var1, class_4783.field_23893.method_29260(), 9, 5, 10, var5);
         class_2522 var23 = class_4783.field_23778
            .method_29260()
            .method_10308(class_3821.field_49664, Boolean.valueOf(true))
            .method_10308(class_3821.field_49667, Boolean.valueOf(true));
         class_2522 var14 = class_4783.field_23778
            .method_29260()
            .method_10308(class_3821.field_49671, Boolean.valueOf(true))
            .method_10308(class_3821.field_49670, Boolean.valueOf(true));
         this.method_32500(var1, var5, 3, 6, 3, 3, 6, 11, var14, var14, false);
         this.method_32500(var1, var5, 10, 6, 3, 10, 6, 9, var14, var14, false);
         this.method_32500(var1, var5, 4, 6, 2, 9, 6, 2, var23, var23, false);
         this.method_32500(var1, var5, 4, 6, 12, 7, 6, 12, var23, var23, false);
         this.method_32529(
            var1,
            class_4783.field_23778
               .method_29260()
               .method_10308(class_3821.field_49671, Boolean.valueOf(true))
               .method_10308(class_3821.field_49667, Boolean.valueOf(true)),
            3,
            6,
            2,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23778
               .method_29260()
               .method_10308(class_3821.field_49670, Boolean.valueOf(true))
               .method_10308(class_3821.field_49667, Boolean.valueOf(true)),
            3,
            6,
            12,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23778
               .method_29260()
               .method_10308(class_3821.field_49671, Boolean.valueOf(true))
               .method_10308(class_3821.field_49664, Boolean.valueOf(true)),
            10,
            6,
            2,
            var5
         );

         for (int var15 = 0; var15 <= 2; var15++) {
            this.method_32529(
               var1,
               class_4783.field_23778
                  .method_29260()
                  .method_10308(class_3821.field_49670, Boolean.valueOf(true))
                  .method_10308(class_3821.field_49664, Boolean.valueOf(true)),
               8 + var15,
               6,
               12 - var15,
               var5
            );
            if (var15 != 2) {
               this.method_32529(
                  var1,
                  class_4783.field_23778
                     .method_29260()
                     .method_10308(class_3821.field_49671, Boolean.valueOf(true))
                     .method_10308(class_3821.field_49667, Boolean.valueOf(true)),
                  8 + var15,
                  6,
                  11 - var15,
                  var5
               );
            }
         }

         class_2522 var24 = class_4783.field_23748.method_29260().method_10308(class_5613.field_28506, Direction.field_800);
         this.method_32529(var1, var24, 10, 1, 13, var5);
         this.method_32529(var1, var24, 10, 2, 13, var5);
         this.method_32529(var1, var24, 10, 3, 13, var5);
         this.method_32529(var1, var24, 10, 4, 13, var5);
         this.method_32529(var1, var24, 10, 5, 13, var5);
         this.method_32529(var1, var24, 10, 6, 13, var5);
         this.method_32529(var1, var24, 10, 7, 13, var5);
         byte var16 = 7;
         byte var17 = 7;
         class_2522 var18 = class_4783.field_23778.method_29260().method_10308(class_3821.field_49667, Boolean.valueOf(true));
         this.method_32529(var1, var18, 6, 9, 7, var5);
         class_2522 var19 = class_4783.field_23778.method_29260().method_10308(class_3821.field_49664, Boolean.valueOf(true));
         this.method_32529(var1, var19, 7, 9, 7, var5);
         this.method_32529(var1, var18, 6, 8, 7, var5);
         this.method_32529(var1, var19, 7, 8, 7, var5);
         class_2522 var20 = var14.method_10308(class_3821.field_49664, Boolean.valueOf(true)).method_10308(class_3821.field_49667, Boolean.valueOf(true));
         this.method_32529(var1, var20, 6, 7, 7, var5);
         this.method_32529(var1, var20, 7, 7, 7, var5);
         this.method_32529(var1, var18, 5, 7, 7, var5);
         this.method_32529(var1, var19, 8, 7, 7, var5);
         this.method_32529(var1, var18.method_10308(class_3821.field_49671, Boolean.valueOf(true)), 6, 7, 6, var5);
         this.method_32529(var1, var18.method_10308(class_3821.field_49670, Boolean.valueOf(true)), 6, 7, 8, var5);
         this.method_32529(var1, var19.method_10308(class_3821.field_49671, Boolean.valueOf(true)), 7, 7, 6, var5);
         this.method_32529(var1, var19.method_10308(class_3821.field_49670, Boolean.valueOf(true)), 7, 7, 8, var5);
         class_2522 var21 = class_4783.field_23521.method_29260();
         this.method_32529(var1, var21, 5, 8, 7, var5);
         this.method_32529(var1, var21, 8, 8, 7, var5);
         this.method_32529(var1, var21, 6, 8, 6, var5);
         this.method_32529(var1, var21, 6, 8, 8, var5);
         this.method_32529(var1, var21, 7, 8, 6, var5);
         this.method_32529(var1, var21, 7, 8, 8, var5);
      }

      this.method_32525(var1, var5, var4, 3, 3, 5, class_5931.field_30133);
      if (this.field_20084) {
         this.method_32529(var1, field_36439, 12, 9, 1, var5);
         this.method_32525(var1, var5, var4, 12, 8, 1, class_5931.field_30133);
      }

      return true;
   }
}
