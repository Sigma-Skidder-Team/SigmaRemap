package remapped;

import java.util.EnumSet;
import java.util.List;

public class class_9110<T extends AbstractRaiderEntity> extends class_3599 {
   private static String[] field_46653;
   private final T field_46652;

   public class_9110(T var1, AbstractRaiderEntity var2) {
      this.field_46651 = var1;
      this.field_46652 = (T)var2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      class_2452 var3 = this.field_46652.method_18589();
      if (this.field_46652.method_18600()
         && !this.field_46652.method_18589().method_11259()
         && this.field_46652.method_21357()
         && !ItemStack.method_27982(this.field_46652.method_26520(class_6943.field_35704), class_2452.method_11292())) {
         AbstractRaiderEntity var4 = var3.method_11282(this.field_46652.method_18592());
         if (var4 == null || !var4.method_37330()) {
            List var5 = this.field_46652
               .world
               .<class_91>method_25869(class_91.class, this.field_46652.method_37241().method_18899(16.0, 8.0, 16.0), AbstractRaiderEntity.method_18599());
            if (!var5.isEmpty()) {
               return this.field_46652.method_26927().method_5616((Entity)var5.get(0), 1.15F);
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void method_16794() {
      if (this.field_46652.method_26927().method_5603().method_12170(this.field_46652.method_37245(), 1.414)) {
         List var3 = this.field_46652
            .world
            .<class_91>method_25869(class_91.class, this.field_46652.method_37241().method_18899(4.0, 4.0, 4.0), AbstractRaiderEntity.method_18599());
         if (!var3.isEmpty()) {
            this.field_46652.method_26902((class_91)var3.get(0));
         }
      }
   }
}
