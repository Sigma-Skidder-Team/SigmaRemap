package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_7375 extends class_5920<class_4612> {
   private static String[] field_37689;
   private final class_6044<class_8150> field_37687;
   private final int field_37684;
   private final int field_37688;
   private final float field_37685;
   private long field_37686;

   public class_7375(class_6044<class_8150> var1, float var2, int var3, int var4) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3319, var1, class_561.field_3320));
      this.field_37687 = var1;
      this.field_37685 = var2;
      this.field_37684 = var3;
      this.field_37688 = var4;
   }

   public boolean method_33591(class_6331 var1, class_4612 var2) {
      Optional var5 = var2.method_26525().<class_8150>method_5138(this.field_37687);
      return var5.isPresent()
         && var1.method_29545() == ((class_8150)var5.get()).method_37408()
         && ((class_8150)var5.get()).method_37409().method_12170(var2.method_37245(), (double)this.field_37688);
   }

   public void method_33590(class_6331 var1, class_4612 var2, long var3) {
      if (var3 > this.field_37686) {
         class_1150 var7 = var2.method_26525();
         Optional var8 = var7.<class_8150>method_5138(this.field_37687);
         var8.ifPresent(var2x -> var7.method_5105(class_6044.field_30889, new class_6651(var2x.method_37409(), this.field_37685, this.field_37684)));
         this.field_37686 = var3 + 80L;
      }
   }
}
