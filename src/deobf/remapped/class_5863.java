package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_5863 extends class_5920<class_4612> {
   private static String[] field_29791;
   private final class_6044<class_8150> field_29792;
   private long field_29794;
   private final int field_29790;
   private float field_29793;

   public class_5863(class_6044<class_8150> var1, float var2, int var3) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3319, var1, class_561.field_3320));
      this.field_29792 = var1;
      this.field_29793 = var2;
      this.field_29790 = var3;
   }

   public boolean method_26715(class_6331 var1, class_4612 var2) {
      Optional var5 = var2.method_26525().<class_8150>method_5138(this.field_29792);
      return var5.isPresent()
         && var1.method_29545() == ((class_8150)var5.get()).method_37408()
         && ((class_8150)var5.get()).method_37409().method_12170(var2.method_37245(), (double)this.field_29790);
   }

   public void method_26714(class_6331 var1, class_4612 var2, long var3) {
      if (var3 > this.field_29794) {
         Optional var7 = Optional.<class_1343>ofNullable(class_3425.method_15834(var2, 8, 6));
         var2.method_26525().method_5106(class_6044.field_30889, var7.map(var1x -> new class_6651(var1x, this.field_29793, 1)));
         this.field_29794 = var3 + 180L;
      }
   }
}
