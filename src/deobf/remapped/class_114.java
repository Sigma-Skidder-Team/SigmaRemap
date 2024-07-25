package remapped;

import java.util.List;
import java.util.Random;

public class class_114 extends class_6315 {
   private static String[] field_282;

   public class_114(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13400, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_114(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13400, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28784((class_1695)var1, var2, var3, 1, 0, true);
      this.method_28785((class_1695)var1, var2, var3, 0, 1, true);
      this.method_28786((class_1695)var1, var2, var3, 0, 1, true);
   }

   public static class_114 method_342(List<class_7060> var0, int var1, int var2, int var3, Direction var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -1, 0, 0, 5, 7, 5, var4);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_114(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 0, 0, 0, 4, 1, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 4, 5, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 0, 5, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 2, 0, 4, 5, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 4, 0, 5, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 2, 4, 4, 5, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 6, 0, 4, 6, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var10 = 0; var10 <= 4; var10++) {
         for (int var11 = 0; var11 <= 4; var11++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var10, -1, var11, var5);
         }
      }

      return true;
   }
}
