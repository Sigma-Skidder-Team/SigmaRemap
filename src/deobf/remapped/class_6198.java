package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.function.Predicate;

public class class_6198 extends class_5920<LivingEntity> {
   private static String[] field_31660;
   private final EntityType<?> field_31658;
   private final int field_31661;
   private final Predicate<LivingEntity> field_31659;
   private final Predicate<LivingEntity> field_31662;

   public class_6198(EntityType<?> var1, int var2, Predicate<LivingEntity> var3, Predicate<LivingEntity> var4) {
      super(
         ImmutableMap.of(
            class_6044.field_30874, class_561.field_3319, class_6044.field_30861, class_561.field_3318, class_6044.field_30901, class_561.field_3320
         )
      );
      this.field_31658 = var1;
      this.field_31661 = var2 * var2;
      this.field_31659 = var4;
      this.field_31662 = var3;
   }

   public class_6198(EntityType<?> var1, int var2) {
      this(var1, var2, var0 -> true, var0 -> true);
   }

   @Override
   public boolean method_27088(class_6331 var1, LivingEntity var2) {
      return this.field_31662.test(var2) && this.method_28341(var2).stream().anyMatch(this::method_28342);
   }

   @Override
   public void method_27080(class_6331 var1, LivingEntity var2, long var3) {
      super.method_27080(var1, var2, var3);
      class_1150 var7 = var2.method_26525();
      var7.<List<LivingEntity>>method_5138(class_6044.field_30901)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(var2xx -> var2xx.method_37275(var2) <= (double)this.field_31661)
                  .filter(this::method_28342)
                  .findFirst()
                  .ifPresent(var1xx -> {
                     var7.method_5105(class_6044.field_30861, var1xx);
                     var7.method_5105(class_6044.field_30874, new class_4843(var1xx, true));
                  })
         );
   }

   private boolean method_28342(LivingEntity var1) {
      return this.field_31658.equals(var1.getType()) && this.field_31659.test(var1);
   }

   private List<LivingEntity> method_28341(LivingEntity var1) {
      return var1.method_26525().<List<LivingEntity>>method_5138(class_6044.field_30901).get();
   }
}
