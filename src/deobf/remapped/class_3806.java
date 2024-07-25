package remapped;

import java.util.List;
import java.util.Random;

public class class_3806 extends class_6315 {
   private static String[] field_18633;

   public class_3806(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13406, var1);
      this.method_32519(var4);
      this.field_36435 = var3;
   }

   public class_3806(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13406, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 5, 3, true);
   }

   public static class_3806 method_17721(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      return method_28781(var9) && class_7060.method_32502(var0, var9) == null ? new class_3806(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
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
      this.method_32500(var1, var5, 5, 8, 0, 7, 8, 0, class_4783.field_23587.method_29260(), class_4783.field_23587.method_29260(), false);
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49664, Boolean.valueOf(true))
         .method_10308(class_3821.field_49667, Boolean.valueOf(true));
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));

      for (byte var12 = 1; var12 <= 11; var12 += 2) {
         this.method_32500(var1, var5, var12, 10, 0, var12, 11, 0, var10, var10, false);
         this.method_32500(var1, var5, var12, 10, 12, var12, 11, 12, var10, var10, false);
         this.method_32500(var1, var5, 0, 10, var12, 0, 11, var12, var11, var11, false);
         this.method_32500(var1, var5, 12, 10, var12, 12, 11, var12, var11, var11, false);
         this.method_32529(var1, class_4783.field_23484.method_29260(), var12, 13, 0, var5);
         this.method_32529(var1, class_4783.field_23484.method_29260(), var12, 13, 12, var5);
         this.method_32529(var1, class_4783.field_23484.method_29260(), 0, 13, var12, var5);
         this.method_32529(var1, class_4783.field_23484.method_29260(), 12, 13, var12, var5);
         if (var12 != 11) {
            this.method_32529(var1, var10, var12 + 1, 13, 0, var5);
            this.method_32529(var1, var10, var12 + 1, 13, 12, var5);
            this.method_32529(var1, var11, 0, 13, var12 + 1, var5);
            this.method_32529(var1, var11, 12, 13, var12 + 1, var5);
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

      for (byte var14 = 3; var14 <= 9; var14 += 2) {
         this.method_32500(
            var1,
            var5,
            1,
            7,
            var14,
            1,
            8,
            var14,
            var11.method_10308(class_3821.field_49664, Boolean.valueOf(true)),
            var11.method_10308(class_3821.field_49664, Boolean.valueOf(true)),
            false
         );
         this.method_32500(
            var1,
            var5,
            11,
            7,
            var14,
            11,
            8,
            var14,
            var11.method_10308(class_3821.field_49667, Boolean.valueOf(true)),
            var11.method_10308(class_3821.field_49667, Boolean.valueOf(true)),
            false
         );
      }

      this.method_32500(var1, var5, 4, 2, 0, 8, 2, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 4, 12, 2, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 0, 0, 8, 1, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 0, 9, 8, 1, 12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 0, 4, 3, 1, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 9, 0, 4, 12, 1, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var15 = 4; var15 <= 8; var15++) {
         for (int var13 = 0; var13 <= 2; var13++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var15, -1, var13, var5);
            this.method_32499(var1, class_4783.field_23484.method_29260(), var15, -1, 12 - var13, var5);
         }
      }

      for (int var16 = 0; var16 <= 2; var16++) {
         for (int var18 = 4; var18 <= 8; var18++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var16, -1, var18, var5);
            this.method_32499(var1, class_4783.field_23484.method_29260(), 12 - var16, -1, var18, var5);
         }
      }

      this.method_32500(var1, var5, 5, 5, 5, 7, 5, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 1, 6, 6, 4, 6, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32529(var1, class_4783.field_23484.method_29260(), 6, 0, 6, var5);
      this.method_32529(var1, class_4783.field_23811.method_29260(), 6, 5, 6, var5);
      class_1331 var17 = new class_1331(this.method_32530(6, 6), this.method_32507(5), this.method_32523(6, 6));
      if (var5.method_44395(var17)) {
         var1.method_43362().method_14011(var17, class_8532.field_43675, 0);
      }

      return true;
   }
}
