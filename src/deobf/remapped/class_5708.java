package remapped;

public class class_5708 extends class_8145 {
   private static String[] field_28885;
   public final class_2770 field_28882;
   public final String field_28884;
   private final class_6097 field_28883;

   public class_5708(class_2770 var1, String var2, float var3, float var4) {
      super(var1.method_37387(), var1.field_41768);
      this.field_28883 = class_6097.method_27938(var3, var4);
      this.method_37187();
      this.field_28882 = var1;
      this.field_28884 = var2;
   }

   @Override
   public void method_37329() {
   }

   @Override
   public void method_37314(class_5734 var1) {
   }

   @Override
   public void method_37376(class_5734 var1) {
   }

   @Override
   public boolean method_37167() {
      return true;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      return !this.method_37180(var1) ? this.field_28882.method_12621(this, var1, var2) : false;
   }

   @Override
   public boolean method_37171(class_8145 var1) {
      return this == var1 || this.field_28882 == var1;
   }

   @Override
   public class_6310<?> method_37142() {
      throw new UnsupportedOperationException();
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      return this.field_28883;
   }
}
