package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_4849 extends class_5837 {
   private final class_6414 field_24181;
   private final Set<class_5019<?>> field_24182;

   private class_4849(class_7279[] var1, class_6414 var2, Set<class_5019<?>> var3) {
      super(var1);
      this.field_24181 = var2;
      this.field_24182 = var3;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26401;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(class_8712.field_44677);
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      class_2522 var5 = var2.<class_2522>method_12698(class_8712.field_44677);
      if (var5 != null) {
         class_5734 var6 = var1.method_27994();
         class_5734 var7;
         if (!var6.method_25939("BlockStateTag", 10)) {
            var7 = new class_5734();
            var6.method_25946("BlockStateTag", var7);
         } else {
            var7 = var6.method_25937("BlockStateTag");
         }

         this.field_24182
            .stream()
            .filter(var5::method_10307)
            .forEach(var2x -> var7.method_25941(var2x.method_23109(), method_22321(var5, (class_5019<?>)var2x)));
      }

      return var1;
   }

   public static class_4000 method_22320(class_6414 var0) {
      return new class_4000(var0, null);
   }

   private static <T extends Comparable<T>> String method_22321(class_2522 var0, class_5019<T> var1) {
      Comparable var4 = var0.<Comparable>method_10313(var1);
      return var1.method_23110((T)var4);
   }
}
