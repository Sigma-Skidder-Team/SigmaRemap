package remapped;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

public class class_3230<T extends AbstractRaiderEntity> extends class_3599 {
   private static String[] field_16075;
   private final T field_16076;

   public class_3230(T var1) {
      this.field_16076 = (T)var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      return this.field_16076.method_17809() == null
         && !this.field_16076.method_37151()
         && this.field_16076.method_18600()
         && !this.field_16076.method_18589().method_11259()
         && !((class_6331)this.field_16076.world).method_28994(this.field_16076.method_37075());
   }

   @Override
   public boolean method_16799() {
      return this.field_16076.method_18600()
         && !this.field_16076.method_18589().method_11259()
         && this.field_16076.world instanceof class_6331
         && !((class_6331)this.field_16076.world).method_28994(this.field_16076.method_37075());
   }

   @Override
   public void method_16794() {
      if (this.field_16076.method_18600()) {
         class_2452 var3 = this.field_16076.method_18589();
         if (this.field_16076.field_41697 % 20 == 0) {
            this.method_14794(var3);
         }

         if (!this.field_16076.method_21379()) {
            class_1343 var4 = class_3425.method_15837(this.field_16076, 15, 4, class_1343.method_6200(var3.method_11269()));
            if (var4 != null) {
               this.field_16076.method_26927().method_5595(var4.field_7336, var4.field_7333, var4.field_7334, 1.0);
            }
         }
      }
   }

   private void method_14794(class_2452 var1) {
      if (var1.method_11306()) {
         HashSet var4 = Sets.newHashSet();
         List var5 = this.field_16076
            .world
            .<AbstractRaiderEntity>method_25869(
               AbstractRaiderEntity.class, this.field_16076.method_37241().method_18898(16.0), var1x -> !var1x.method_18600() && class_8996.method_41275(var1x, var1)
            );
         var4.addAll(var5);

         for (AbstractRaiderEntity var7 : var4) {
            var1.method_11275(var1.method_11262(), var7, (BlockPos)null, true);
         }
      }
   }
}
