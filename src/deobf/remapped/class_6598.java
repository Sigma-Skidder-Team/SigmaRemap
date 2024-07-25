package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_6598 extends class_6414 {
   private static String[] field_34033;
   private final class_6414 field_34032;
   private static final Map<class_6414, class_6414> field_34034 = Maps.newIdentityHashMap();

   public class_6598(class_6414 var1, class_3073 var2) {
      super(var2);
      this.field_34032 = var1;
      field_34034.put(var1, this);
   }

   public class_6414 method_30381() {
      return this.field_34032;
   }

   public static boolean method_30380(class_2522 var0) {
      return field_34034.containsKey(var0.method_8360());
   }

   private void method_30379(class_6331 var1, BlockPos var2) {
      class_6174 var5 = EntityType.field_34314.method_30484(var1);
      var5.method_37144((double)var2.method_12173() + 0.5, (double)var2.method_12165(), (double)var2.method_12185() + 0.5, 0.0F, 0.0F);
      var1.method_7509(var5);
      var5.method_26909();
   }

   @Override
   public void method_10765(class_2522 var1, class_6331 var2, BlockPos var3, ItemStack var4) {
      super.method_10765(var1, var2, var3, var4);
      if (var2.method_29537().method_1285(class_291.field_1058) && class_2931.method_13423(class_3668.field_17870, var4) == 0) {
         this.method_30379(var2, var3);
      }
   }

   @Override
   public void method_29279(World var1, BlockPos var2, class_2730 var3) {
      if (var1 instanceof class_6331) {
         this.method_30379((class_6331)var1, var2);
      }
   }

   public static class_2522 method_30378(class_6414 var0) {
      return field_34034.get(var0).method_29260();
   }
}
