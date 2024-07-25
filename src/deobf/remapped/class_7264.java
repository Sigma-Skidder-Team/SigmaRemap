package remapped;

public class class_7264 extends class_1277 {
   private static String[] field_37213;
   private final class_4359 field_37212;

   public class_7264(class_4359 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.field_37212 = var1;
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && this.field_37212.method_20226(this.field_37212.getAttackTarget());
   }

   @Override
   public boolean method_16799() {
      return super.method_16799() && this.field_37212.method_20226(this.field_37212.getAttackTarget());
   }
}
