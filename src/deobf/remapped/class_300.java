package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;

public class class_300 extends class_5920<class_7666> {
   private static String[] field_1097;
   private final class_6044<List<class_8150>> field_1100;
   private final class_6044<class_8150> field_1096;
   private final float field_1101;
   private final int field_1095;
   private final int field_1098;
   private long field_1102;
   private class_8150 field_1099;

   public class_300(class_6044<List<class_8150>> var1, float var2, int var3, int var4, class_6044<class_8150> var5) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3319, var1, class_561.field_3320, var5, class_561.field_3320));
      this.field_1100 = var1;
      this.field_1101 = var2;
      this.field_1095 = var3;
      this.field_1098 = var4;
      this.field_1096 = var5;
   }

   public boolean method_1350(class_6331 var1, class_7666 var2) {
      Optional var5 = var2.method_26525().<List<class_8150>>method_5138(this.field_1100);
      Optional var6 = var2.method_26525().<class_8150>method_5138(this.field_1096);
      if (var5.isPresent() && var6.isPresent()) {
         List var7 = (List)var5.get();
         if (!var7.isEmpty()) {
            this.field_1099 = (class_8150)var7.get(var1.method_43360().nextInt(var7.size()));
            return this.field_1099 != null
               && var1.method_29545() == this.field_1099.method_37408()
               && ((class_8150)var6.get()).method_37409().method_12170(var2.method_37245(), (double)this.field_1098);
         }
      }

      return false;
   }

   public void method_1349(class_6331 var1, class_7666 var2, long var3) {
      if (var3 > this.field_1102 && this.field_1099 != null) {
         var2.method_26525().method_5105(class_6044.field_30889, new class_6651(this.field_1099.method_37409(), this.field_1101, this.field_1095));
         this.field_1102 = var3 + 100L;
      }
   }
}
