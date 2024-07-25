package remapped;

import java.util.List;
import java.util.Random;

public class class_235 extends class_6315 {
   private static String[] field_758;

   public class_235(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13445, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_235(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13445, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 5, 3, true);
      this.method_28784((class_1695)var1, var2, var3, 5, 11, true);
   }

   public static class_235 method_992(List<class_7060> var0, int var1, int var2, int var3, Direction var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -5, -3, 0, 13, 14, 13, var4);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_235(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_32500(var1, var5, 0, 3, 0, 12, 4, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 0, 12, 13, 12, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 0, 1, 12, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 11, 5, 0, 12, 12, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 11, 4, 12, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 8, 5, 11, 10, 12, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 5, 9, 11, 7, 12, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 0, 4, 12, 1, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 8, 5, 0, 10, 12, 1, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 5, 9, 0, 7, 12, 1, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 11, 2, 10, 12, 10, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49664, Boolean.valueOf(true))
         .method_10308(class_3821.field_49667, Boolean.valueOf(true));
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      class_2522 var12 = var11.method_10308(class_3821.field_49664, Boolean.valueOf(true));
      class_2522 var13 = var11.method_10308(class_3821.field_49667, Boolean.valueOf(true));

      for (byte var14 = 1; var14 <= 11; var14 += 2) {
         this.method_32500(var1, var5, var14, 10, 0, var14, 11, 0, var10, var10, false);
         this.method_32500(var1, var5, var14, 10, 12, var14, 11, 12, var10, var10, false);
         this.method_32500(var1, var5, 0, 10, var14, 0, 11, var14, var11, var11, false);
         this.method_32500(var1, var5, 12, 10, var14, 12, 11, var14, var11, var11, false);
         this.method_32529(var1, class_4783.field_23484.method_29260(), var14, 13, 0, var5);
         this.method_32529(var1, class_4783.field_23484.method_29260(), var14, 13, 12, var5);
         this.method_32529(var1, class_4783.field_23484.method_29260(), 0, 13, var14, var5);
         this.method_32529(var1, class_4783.field_23484.method_29260(), 12, 13, var14, var5);
         if (var14 != 11) {
            this.method_32529(var1, var10, var14 + 1, 13, 0, var5);
            this.method_32529(var1, var10, var14 + 1, 13, 12, var5);
            this.method_32529(var1, var11, 0, 13, var14 + 1, var5);
            this.method_32529(var1, var11, 12, 13, var14 + 1, var5);
         }
      }

      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49671, Boolean.valueOf(true))
            .method_10308(class_3821.field_49667, Boolean.valueOf(true)),
         0,
         13,
         0,
         var5
      );
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49670, Boolean.valueOf(true))
            .method_10308(class_3821.field_49667, Boolean.valueOf(true)),
         0,
         13,
         12,
         var5
      );
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49670, Boolean.valueOf(true))
            .method_10308(class_3821.field_49664, Boolean.valueOf(true)),
         12,
         13,
         12,
         var5
      );
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49671, Boolean.valueOf(true))
            .method_10308(class_3821.field_49664, Boolean.valueOf(true)),
         12,
         13,
         0,
         var5
      );

      for (byte var19 = 3; var19 <= 9; var19 += 2) {
         this.method_32500(var1, var5, 1, 7, var19, 1, 8, var19, var12, var12, false);
         this.method_32500(var1, var5, 11, 7, var19, 11, 8, var19, var13, var13, false);
      }

      class_2522 var20 = class_4783.field_23204.method_29260().method_10308(class_3049.field_14946, Direction.field_818);

      for (int var15 = 0; var15 <= 6; var15++) {
         int var16 = var15 + 4;

         for (int var17 = 5; var17 <= 7; var17++) {
            this.method_32529(var1, var20, var17, 5 + var15, var16, var5);
         }

         if (var16 >= 5 && var16 <= 8) {
            this.method_32500(var1, var5, 5, 5, var16, 7, var15 + 4, var16, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
         } else if (var16 >= 9 && var16 <= 10) {
            this.method_32500(var1, var5, 5, 8, var16, 7, var15 + 4, var16, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
         }

         if (var15 >= 1) {
            this.method_32500(
               var1, var5, 5, 6 + var15, var16, 7, 9 + var15, var16, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false
            );
         }
      }

      for (int var21 = 5; var21 <= 7; var21++) {
         this.method_32529(var1, var20, var21, 12, 11, var5);
      }

      this.method_32500(var1, var5, 5, 6, 7, 5, 7, 7, var13, var13, false);
      this.method_32500(var1, var5, 7, 6, 7, 7, 7, 7, var12, var12, false);
      this.method_32500(var1, var5, 5, 13, 12, 7, 13, 12, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 2, 3, 5, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 9, 3, 5, 10, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 4, 2, 5, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 9, 5, 2, 10, 5, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 9, 5, 9, 10, 5, 10, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 10, 5, 4, 10, 5, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      class_2522 var22 = var20.method_10308(class_3049.field_14946, Direction.field_804);
      class_2522 var23 = var20.method_10308(class_3049.field_14946, Direction.field_809);
      this.method_32529(var1, var23, 4, 5, 2, var5);
      this.method_32529(var1, var23, 4, 5, 3, var5);
      this.method_32529(var1, var23, 4, 5, 9, var5);
      this.method_32529(var1, var23, 4, 5, 10, var5);
      this.method_32529(var1, var22, 8, 5, 2, var5);
      this.method_32529(var1, var22, 8, 5, 3, var5);
      this.method_32529(var1, var22, 8, 5, 9, var5);
      this.method_32529(var1, var22, 8, 5, 10, var5);
      this.method_32500(var1, var5, 3, 4, 4, 4, 4, 8, class_4783.field_23784.method_29260(), class_4783.field_23784.method_29260(), false);
      this.method_32500(var1, var5, 8, 4, 4, 9, 4, 8, class_4783.field_23784.method_29260(), class_4783.field_23784.method_29260(), false);
      this.method_32500(var1, var5, 3, 5, 4, 4, 5, 8, class_4783.field_23522.method_29260(), class_4783.field_23522.method_29260(), false);
      this.method_32500(var1, var5, 8, 5, 4, 9, 5, 8, class_4783.field_23522.method_29260(), class_4783.field_23522.method_29260(), false);
      this.method_32500(var1, var5, 4, 2, 0, 8, 2, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 4, 12, 2, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 0, 0, 8, 1, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 0, 9, 8, 1, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 0, 4, 3, 1, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 9, 0, 4, 12, 1, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var24 = 4; var24 <= 8; var24++) {
         for (int var18 = 0; var18 <= 2; var18++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var24, -1, var18, var5);
            this.method_32499(var1, class_4783.field_23484.method_29260(), var24, -1, 12 - var18, var5);
         }
      }

      for (int var25 = 0; var25 <= 2; var25++) {
         for (int var26 = 4; var26 <= 8; var26++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var25, -1, var26, var5);
            this.method_32499(var1, class_4783.field_23484.method_29260(), 12 - var25, -1, var26, var5);
         }
      }

      return true;
   }
}
