package remapped;

import java.util.List;
import java.util.Random;

public class class_8608 extends class_6315 {
   private static String[] field_44151;

   public class_8608(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13437, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_8608(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13437, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 2, 0, false);
      this.method_28785((class_1695)var1, var2, var3, 0, 2, false);
      this.method_28786((class_1695)var1, var2, var3, 0, 2, false);
   }

   public static class_8608 method_39567(List<class_7060> var0, int var1, int var2, int var3, Direction var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -2, 0, 0, 7, 9, 7, var4);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_8608(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 0, 0, 0, 6, 1, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 6, 7, 6, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 1, 6, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 6, 1, 6, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 5, 2, 0, 6, 6, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 5, 2, 6, 6, 6, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 0, 6, 1, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 5, 0, 6, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 2, 0, 6, 6, 1, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 2, 5, 6, 6, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49664, Boolean.valueOf(true))
         .method_10308(class_3821.field_49667, Boolean.valueOf(true));
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      this.method_32500(var1, var5, 2, 6, 0, 4, 6, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 0, 4, 5, 0, var10, var10, false);
      this.method_32500(var1, var5, 2, 6, 6, 4, 6, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 6, 4, 5, 6, var10, var10, false);
      this.method_32500(var1, var5, 0, 6, 2, 0, 6, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 2, 0, 5, 4, var11, var11, false);
      this.method_32500(var1, var5, 6, 6, 2, 6, 6, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 5, 2, 6, 5, 4, var11, var11, false);

      for (int var12 = 0; var12 <= 6; var12++) {
         for (int var13 = 0; var13 <= 6; var13++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var12, -1, var13, var5);
         }
      }

      return true;
   }
}
