package remapped;

public abstract class class_3429 extends class_9506 implements class_3713 {
   private static final class_7821<class_6098> field_16861 = class_8073.<class_6098>method_36641(class_3429.class, class_2734.field_13357);

   public class_3429(class_6629<? extends class_3429> var1, World var2) {
      super(var1, var2);
   }

   public class_3429(class_6629<? extends class_3429> var1, double var2, double var4, double var6, World var8) {
      super(var1, var2, var4, var6, var8);
   }

   public class_3429(class_6629<? extends class_3429> var1, class_5834 var2, World var3) {
      super(var1, var2, var3);
   }

   public void method_15852(class_6098 var1) {
      if (var1.method_27960() != this.method_15854() || var1.method_28002()) {
         this.method_37372().method_36633(field_16861, Util.<class_6098>method_44659(var1.method_27973(), var0 -> var0.method_28017(1)));
      }
   }

   public abstract class_2451 method_15854();

   public class_6098 method_15853() {
      return this.method_37372().<class_6098>method_36640(field_16861);
   }

   @Override
   public class_6098 method_17246() {
      class_6098 var3 = this.method_15853();
      return !var3.method_28022() ? var3 : new class_6098(this.method_15854());
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_16861, class_6098.field_31203);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      class_6098 var4 = this.method_15853();
      if (!var4.method_28022()) {
         var1.method_25946("Item", var4.method_27998(new class_5734()));
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      class_6098 var4 = class_6098.method_28015(var1.method_25937("Item"));
      this.method_15852(var4);
   }
}
