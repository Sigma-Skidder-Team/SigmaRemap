package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;

public class class_7267 extends class_5920<class_5834> {
   private static String[] field_37217;

   public class_7267() {
      super(
         ImmutableMap.of(
            class_6044.field_30889,
            class_561.field_3319,
            class_6044.field_30874,
            class_561.field_3319,
            class_6044.field_30871,
            class_561.field_3320,
            class_6044.field_30901,
            class_561.field_3320,
            class_6044.field_30861,
            class_561.field_3318
         )
      );
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      class_1150 var5 = var2.method_26525();
      Optional var6 = var5.<class_8150>method_5138(class_6044.field_30871);
      return var1.method_43360().nextInt(100) == 0
         && var6.isPresent()
         && var1.method_29545() == ((class_8150)var6.get()).method_37408()
         && ((class_8150)var6.get()).method_37409().method_12170(var2.method_37245(), 4.0)
         && var5.<List<class_5834>>method_5138(class_6044.field_30901).get().stream().anyMatch(var0 -> EntityType.field_34276.equals(var0.method_37387()));
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      var7.<List<class_5834>>method_5138(class_6044.field_30901)
         .ifPresent(
            var2x -> var2x.stream()
                  .filter(var0x -> EntityType.field_34276.equals(var0x.method_37387()))
                  .filter(var1xx -> var1xx.method_37275(var2) <= 32.0)
                  .findFirst()
                  .ifPresent(var1xx -> {
                     var7.method_5105(class_6044.field_30861, var1xx);
                     var7.method_5105(class_6044.field_30874, new class_4843(var1xx, true));
                     var7.method_5105(class_6044.field_30889, new class_6651(new class_4843(var1xx, false), 0.3F, 1));
                  })
         );
   }
}
