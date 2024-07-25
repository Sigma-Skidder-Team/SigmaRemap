package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class class_5695 extends class_5837 {
   private static String[] field_28844;
   private static final Map<Identifier, class_4503> field_28845 = Maps.newHashMap();
   private final class_4382 field_28846;
   private final class_3374 field_28843;

   private class_5695(class_7279[] var1, class_4382 var2, class_3374 var3) {
      super(var1);
      this.field_28846 = var2;
      this.field_28843 = var3;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26400;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44670);
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      ItemStack var5 = var2.<ItemStack>method_12698(class_8712.field_44670);
      if (var5 != null) {
         int var6 = class_2931.method_13423(this.field_28846, var5);
         int var7 = this.field_28843.method_15564(var2.method_12693(), var1.method_27997(), var6);
         var1.method_28017(var7);
      }

      return var1;
   }

   public static class_5363<?> method_25769(class_4382 var0, float var1, int var2) {
      return method_26628(var3 -> new class_5695(var3, var0, new class_9813(var2, var1)));
   }

   public static class_5363<?> method_25768(class_4382 var0) {
      return method_26628(var1 -> new class_5695(var1, var0, new class_7488(null)));
   }

   public static class_5363<?> method_25764(class_4382 var0) {
      return method_26628(var1 -> new class_5695(var1, var0, new class_56(1)));
   }

   public static class_5363<?> method_25765(class_4382 var0, int var1) {
      return method_26628(var2 -> new class_5695(var2, var0, new class_56(var1)));
   }

   static {
      field_28845.put(class_9813.field_49739, class_9813::method_45237);
      field_28845.put(class_7488.field_38217, class_7488::method_34049);
      field_28845.put(class_56.field_41, class_56::method_12);
   }
}
