package remapped;

import java.util.List;

public class class_3865 extends class_3599 {
   private static String[] field_18832;
   private final class_2960 field_18831;

   public class_3865(class_2960 var1) {
      this.field_18831 = var1;
   }

   @Override
   public boolean method_16795() {
      List var3 = this.field_18831
         .world
         .<LivingEntity>method_25869(LivingEntity.class, this.field_18831.method_37241().method_18898(2.0), class_2960.method_13539());
      return !var3.isEmpty();
   }

   @Override
   public void method_16796() {
      class_2960.method_13538(this.field_18831, 1);
      class_2960.method_13535(this.field_18831, 0);
   }

   @Override
   public void method_16793() {
      class_2960.method_13538(this.field_18831, 0);
   }

   @Override
   public boolean method_16799() {
      List var3 = this.field_18831
         .world
         .<LivingEntity>method_25869(LivingEntity.class, this.field_18831.method_37241().method_18898(2.0), class_2960.method_13539());
      return !var3.isEmpty();
   }
}
