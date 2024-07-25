package remapped;

import java.util.Map;
import java.util.Set;

public class class_3060 extends class_4171 {
   private class_6670 field_15024 = null;

   public class_3060(class_6670 var1) {
      super(var1);
      this.field_15024 = var1;
   }

   @Override
   public void method_19344(
      class_7966 var1, class_2565 var2, int var3, class_8145 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      this.method_13966(var4, var1, var2, var3, class_5367.field_27381);
   }

   public void method_13966(class_8145 var1, class_7966 var2, class_2565 var3, int var4, int var5) {
      if (class_3111.method_14274() && var1 instanceof class_9716) {
         class_9716 var8 = (class_9716)var1;
         class_2344 var9 = this.field_15024.method_11447();
         class_2614.method_11859(var9, var8, var2, var3, var4, var5);
      }
   }

   public static void method_13967(Map var0) {
      Set var3 = var0.keySet();
      boolean var4 = false;

      for (Object var6 : var3) {
         Object var7 = var0.get(var6);
         if (var7 instanceof class_6670) {
            class_6670 var8 = (class_6670)var7;
            var8.method_29100(new class_3060(var8));
            var4 = true;
         }
      }

      if (!var4) {
         class_3111.method_14317("PlayerItemsLayer not registered");
      }
   }
}
