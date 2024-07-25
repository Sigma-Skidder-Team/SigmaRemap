package remapped;

public abstract class class_2550 extends class_8388 implements class_3713 {
   private static final class_7821<class_6098> field_12631 = class_8073.<class_6098>method_36641(class_2550.class, class_2734.field_13357);

   public class_2550(class_6629<? extends class_2550> var1, class_6486 var2) {
      super(var1, var2);
   }

   public class_2550(class_6629<? extends class_2550> var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6486 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
   }

   public class_2550(class_6629<? extends class_2550> var1, class_5834 var2, double var3, double var5, double var7, class_6486 var9) {
      super(var1, var2, var3, var5, var7, var9);
   }

   public void method_11601(class_6098 var1) {
      if (var1.method_27960() != class_4897.field_24352 || var1.method_28002()) {
         this.method_37372().method_36633(field_12631, class_9665.<class_6098>method_44659(var1.method_27973(), var0 -> var0.method_28017(1)));
      }
   }

   public class_6098 method_11600() {
      return this.method_37372().<class_6098>method_36640(field_12631);
   }

   @Override
   public class_6098 method_17246() {
      class_6098 var3 = this.method_11600();
      return !var3.method_28022() ? var3 : new class_6098(class_4897.field_24352);
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_12631, class_6098.field_31203);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      class_6098 var4 = this.method_11600();
      if (!var4.method_28022()) {
         var1.method_25946("Item", var4.method_27998(new class_5734()));
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      class_6098 var4 = class_6098.method_28015(var1.method_25937("Item"));
      this.method_11601(var4);
   }
}
