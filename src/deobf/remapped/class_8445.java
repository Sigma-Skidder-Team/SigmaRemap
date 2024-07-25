package remapped;

import java.util.List;
import java.util.Random;

public class class_8445 extends class_6315 {
   private static String[] field_43198;

   public class_8445(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13405, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_8445(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13405, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28786((class_1695)var1, var2, var3, 6, 2, false);
   }

   public static class_8445 method_38843(List<class_7060> var0, int var1, int var2, int var3, int var4, Direction var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -2, 0, 0, 7, 11, 7, var5);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_8445(var4, var8, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_32500(var1, var5, 0, 0, 0, 6, 1, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 6, 10, 6, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 1, 8, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 5, 2, 0, 6, 8, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 1, 0, 8, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 2, 1, 6, 8, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 2, 6, 5, 8, 6, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49664, Boolean.valueOf(true))
         .method_10308(class_3821.field_49667, Boolean.valueOf(true));
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      this.method_32500(var1, var5, 0, 3, 2, 0, 5, 4, var11, var11, false);
      this.method_32500(var1, var5, 6, 3, 2, 6, 5, 2, var11, var11, false);
      this.method_32500(var1, var5, 6, 3, 4, 6, 5, 4, var11, var11, false);
      this.method_32529(var1, class_4783.field_23484.method_29260(), 5, 2, 5, var5);
      this.method_32500(var1, var5, 4, 2, 5, 4, 3, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 3, 2, 5, 3, 4, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 2, 5, 2, 5, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 2, 5, 1, 6, 5, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 7, 1, 5, 7, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 8, 2, 6, 8, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 2, 6, 0, 4, 8, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 2, 5, 0, 4, 5, 0, var10, var10, false);

      for (int var12 = 0; var12 <= 6; var12++) {
         for (int var13 = 0; var13 <= 6; var13++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var12, -1, var13, var5);
         }
      }

      return true;
   }
}
