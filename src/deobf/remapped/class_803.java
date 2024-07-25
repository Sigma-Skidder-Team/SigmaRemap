package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class class_803 extends class_7807<class_803> {
   private static String[] field_4295;
   private final List<class_7114> field_4296;

   private class_803(List<class_7114> var1) {
      this.field_4296 = var1;
   }

   public static class_803 method_3548(class_8881 var0, int var1, class_1013 var2) {
      return new class_803(ImmutableList.of(var2.method_4482(var0, var1 / 2 - 155, 0, 310)));
   }

   public static class_803 method_3549(class_8881 var0, int var1, class_1013 var2, class_1013 var3) {
      class_7114 var6 = var2.method_4482(var0, var1 / 2 - 155, 0, 150);
      return var3 != null ? new class_803(ImmutableList.of(var6, var3.method_4482(var0, var1 / 2 - 155 + 160, 0, 150))) : new class_803(ImmutableList.of(var6));
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.field_4296.forEach(var5x -> {
         var5x.field_36674 = var3;
         var5x.method_6767(var1, var7, var8, var10);
      });
   }

   @Override
   public List<? extends class_5888> method_41183() {
      return this.field_4296;
   }
}
