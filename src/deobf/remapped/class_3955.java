package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class_3955 extends class_6127<class_5834> {
   private static String[] field_19178;
   private static final ImmutableMap<class_6629<?>, Float> field_19177 = ImmutableMap.builder()
      .put(class_6629.field_34211, 8.0F)
      .put(class_6629.field_34296, 12.0F)
      .put(class_6629.field_34266, 8.0F)
      .put(class_6629.field_34270, 12.0F)
      .put(class_6629.field_34265, 15.0F)
      .put(class_6629.field_34318, 12.0F)
      .put(class_6629.field_34277, 8.0F)
      .put(class_6629.field_34255, 10.0F)
      .put(class_6629.field_34244, 10.0F)
      .put(class_6629.field_34297, 8.0F)
      .put(class_6629.field_34227, 8.0F)
      .build();

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30896);
   }

   @Override
   public void method_28154(class_6331 var1, class_5834 var2) {
      var2.method_26525().method_5106(class_6044.field_30896, this.method_18276(var2));
   }

   private Optional<class_5834> method_18276(class_5834 var1) {
      return this.method_18278(var1)
         .<class_5834>flatMap(
            var2 -> var2.stream()
                  .filter(this::method_18277)
                  .filter(var2x -> this.method_18275(var1, var2x))
                  .min((var2x, var3) -> this.method_18274(var1, var2x, var3))
         );
   }

   private Optional<List<class_5834>> method_18278(class_5834 var1) {
      return var1.method_26525().<List<class_5834>>method_5138(class_6044.field_30901);
   }

   private int method_18274(class_5834 var1, class_5834 var2, class_5834 var3) {
      return class_9299.method_42847(var2.method_37275(var1) - var3.method_37275(var1));
   }

   private boolean method_18275(class_5834 var1, class_5834 var2) {
      float var5 = (Float)field_19177.get(var2.method_37387());
      return var2.method_37275(var1) <= (double)(var5 * var5);
   }

   private boolean method_18277(class_5834 var1) {
      return field_19177.containsKey(var1.method_37387());
   }
}