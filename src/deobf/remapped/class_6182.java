package remapped;

import java.util.List;
import java.util.Random;

public class class_6182 extends class_6315 {
   private static String[] field_31598;

   public class_6182(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13424, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_6182(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13424, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 1, 0, true);
   }

   public static class_6182 method_28308(List<class_7060> var0, int var1, int var2, int var3, Direction var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -1, 0, 0, 5, 7, 5, var4);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_6182(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 0, 0, 0, 4, 1, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 4, 5, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      this.method_32500(var1, var5, 0, 2, 0, 0, 5, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 2, 0, 4, 5, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 3, 1, 0, 4, 1, var10, var10, false);
      this.method_32500(var1, var5, 0, 3, 3, 0, 4, 3, var10, var10, false);
      this.method_32500(var1, var5, 4, 3, 1, 4, 4, 1, var10, var10, false);
      this.method_32500(var1, var5, 4, 3, 3, 4, 4, 3, var10, var10, false);
      this.method_32500(var1, var5, 0, 6, 0, 4, 6, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var11 = 0; var11 <= 4; var11++) {
         for (int var12 = 0; var12 <= 4; var12++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var11, -1, var12, var5);
         }
      }

      return true;
   }
}
