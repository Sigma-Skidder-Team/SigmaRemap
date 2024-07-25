package remapped;

import java.util.List;
import java.util.Random;

public class class_2090 extends class_7733 {
   private static String[] field_10508;

   public class_2090(int var1, Random var2, class_9616 var3, class_240 var4) {
      super(class_2746.field_13401, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
   }

   public class_2090(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13401, var2);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      class_240 var6 = this.method_32518();
      if (var6 != class_240.field_818 && var6 != class_240.field_804) {
         this.method_39335((class_4960)var1, var2, var3, 1, 1);
      } else {
         this.method_39331((class_4960)var1, var2, var3, 1, 1);
      }
   }

   public static class_2090 method_9791(List<class_7060> var0, Random var1, int var2, int var3, int var4, class_240 var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_2090(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32511(var1, var5, 0, 0, 0, 4, 4, 4, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 1, 1, 0);
      class_240 var10 = this.method_32518();
      if (var10 != class_240.field_818 && var10 != class_240.field_804) {
         this.method_32500(var1, var5, 4, 1, 1, 4, 3, 3, field_36439, field_36439, false);
      } else {
         this.method_32500(var1, var5, 0, 1, 1, 0, 3, 3, field_36439, field_36439, false);
      }

      return true;
   }
}
