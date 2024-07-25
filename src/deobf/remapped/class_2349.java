package remapped;

import java.util.List;
import java.util.Random;

public class class_2349 extends class_6315 {
   private static String[] field_11723;

   public class_2349(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13402, var1);
      this.method_32519(var4);
      this.field_36435 = var3;
   }

   public class_2349(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13402, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 1, 3, false);
   }

   public static class_2349 method_10752(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return method_28781(var9) && class_7060.method_32502(var0, var9) == null ? new class_2349(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 0, 3, 0, 4, 4, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 5, 0, 3, 7, 18, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 0, 0, 5, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 5, 0, 4, 5, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 4, 2, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 13, 4, 2, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 0, 0, 4, 1, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 0, 15, 4, 1, 18, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var10 = 0; var10 <= 4; var10++) {
         for (int var11 = 0; var11 <= 2; var11++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var10, -1, var11, var5);
            this.method_32499(var1, class_4783.field_23484.method_29260(), var10, -1, 18 - var11, var5);
         }
      }

      class_2522 var13 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      class_2522 var14 = var13.method_10308(class_3821.field_49667, Boolean.valueOf(true));
      class_2522 var12 = var13.method_10308(class_3821.field_49664, Boolean.valueOf(true));
      this.method_32500(var1, var5, 0, 1, 1, 0, 4, 1, var14, var14, false);
      this.method_32500(var1, var5, 0, 3, 4, 0, 4, 4, var14, var14, false);
      this.method_32500(var1, var5, 0, 3, 14, 0, 4, 14, var14, var14, false);
      this.method_32500(var1, var5, 0, 1, 17, 0, 4, 17, var14, var14, false);
      this.method_32500(var1, var5, 4, 1, 1, 4, 4, 1, var12, var12, false);
      this.method_32500(var1, var5, 4, 3, 4, 4, 4, 4, var12, var12, false);
      this.method_32500(var1, var5, 4, 3, 14, 4, 4, 14, var12, var12, false);
      this.method_32500(var1, var5, 4, 1, 17, 4, 4, 17, var12, var12, false);
      return true;
   }
}
