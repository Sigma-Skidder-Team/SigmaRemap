package remapped;

import java.util.List;
import java.util.Random;

public class class_4535 extends class_6315 {
   private static String[] field_22115;

   public class_4535(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13427, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_4535(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13427, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 1, 0, true);
   }

   public static class_4535 method_21055(List<class_7060> var0, int var1, int var2, int var3, Direction var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -1, -7, 0, 5, 14, 10, var4);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_4535(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      class_2522 var10 = class_4783.field_23204.method_29260().method_10308(class_3049.field_14946, Direction.field_800);
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));

      for (int var12 = 0; var12 <= 9; var12++) {
         int var13 = Math.max(1, 7 - var12);
         int var14 = Math.min(Math.max(var13 + 5, 14 - var12), 13);
         int var15 = var12;
         this.method_32500(var1, var5, 0, 0, var12, 4, var13, var12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
         this.method_32500(
            var1, var5, 1, var13 + 1, var12, 3, var14 - 1, var12, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false
         );
         if (var12 <= 6) {
            this.method_32529(var1, var10, 1, var13 + 1, var12, var5);
            this.method_32529(var1, var10, 2, var13 + 1, var12, var5);
            this.method_32529(var1, var10, 3, var13 + 1, var12, var5);
         }

         this.method_32500(var1, var5, 0, var14, var12, 4, var14, var12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
         this.method_32500(
            var1, var5, 0, var13 + 1, var12, 0, var14 - 1, var12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false
         );
         this.method_32500(
            var1, var5, 4, var13 + 1, var12, 4, var14 - 1, var12, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false
         );
         if ((var12 & 1) == 0) {
            this.method_32500(var1, var5, 0, var13 + 2, var12, 0, var13 + 3, var12, var11, var11, false);
            this.method_32500(var1, var5, 4, var13 + 2, var12, 4, var13 + 3, var12, var11, var11, false);
         }

         for (int var16 = 0; var16 <= 4; var16++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var16, -1, var15, var5);
         }
      }

      return true;
   }
}
