package remapped;

import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_7253 extends class_8285 {
   private static String[] field_37164;

   public class_7253(class_4612 var1, double var2) {
      super(var1, var2, 240, false);
   }

   @Nullable
   @Override
   public class_1343 method_38233() {
      float var3 = this.field_42465.field_41768.field_33033.nextFloat();
      if (!(this.field_42465.field_41768.field_33033.nextFloat() < 0.3F)) {
         class_1343 var4;
         if (!(var3 < 0.7F)) {
            var4 = this.method_33150();
            if (var4 == null) {
               var4 = this.method_33154();
            }
         } else {
            var4 = this.method_33154();
            if (var4 == null) {
               var4 = this.method_33150();
            }
         }

         return var4 != null ? var4 : this.method_33149();
      } else {
         return this.method_33149();
      }
   }

   @Nullable
   private class_1343 method_33149() {
      return class_3425.method_15834(this.field_42465, 10, 7);
   }

   @Nullable
   private class_1343 method_33154() {
      class_6331 var3 = (class_6331)this.field_42465.field_41768;
      List var4 = var3.<class_7666>method_29583(class_6629.field_34276, this.field_42465.method_37241().method_18898(32.0), this::method_33153);
      if (!var4.isEmpty()) {
         class_7666 var5 = (class_7666)var4.get(this.field_42465.field_41768.field_33033.nextInt(var4.size()));
         class_1343 var6 = var5.method_37245();
         return class_3425.method_15838(this.field_42465, 10, 7, var6);
      } else {
         return null;
      }
   }

   @Nullable
   private class_1343 method_33150() {
      class_6979 var3 = this.method_33151();
      if (var3 != null) {
         class_1331 var4 = this.method_33152(var3);
         return var4 != null ? class_3425.method_15838(this.field_42465, 10, 7, class_1343.method_6200(var4)) : null;
      } else {
         return null;
      }
   }

   @Nullable
   private class_6979 method_33151() {
      class_6331 var3 = (class_6331)this.field_42465.field_41768;
      List var4 = class_6979.method_31906(class_6979.method_31923(this.field_42465), 2)
         .filter(var1 -> var3.method_28956(var1) == 0)
         .collect(Collectors.toList());
      return !var4.isEmpty() ? (class_6979)var4.get(var3.field_33033.nextInt(var4.size())) : null;
   }

   @Nullable
   private class_1331 method_33152(class_6979 var1) {
      class_6331 var4 = (class_6331)this.field_42465.field_41768;
      class_1489 var5 = var4.method_28969();
      List var6 = var5.method_6877(var0 -> true, var1.method_31892(), 8, class_8122.field_41618)
         .<class_1331>map(class_8009::method_36337)
         .collect(Collectors.toList());
      return !var6.isEmpty() ? (class_1331)var6.get(var4.field_33033.nextInt(var6.size())) : null;
   }

   private boolean method_33153(class_7666 var1) {
      return var1.method_34697(this.field_42465.field_41768.method_29546());
   }
}
