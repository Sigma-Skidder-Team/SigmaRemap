package remapped;

public abstract class class_1829 extends class_4612 {
   public class_1829(class_6629<? extends class_1829> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6359, 0.0F);
   }

   @Override
   public boolean method_26509() {
      return true;
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13578;
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return var1.method_6677(this);
   }

   @Override
   public int method_26850() {
      return 120;
   }

   @Override
   public int method_26427(class_704 var1) {
      return 1 + this.world.field_33033.nextInt(3);
   }

   public void method_8085(int var1) {
      if (this.method_37330() && !this.method_37134()) {
         this.method_37192(var1 - 1);
         if (this.method_37229() == -20) {
            this.method_37192(0);
            this.attackEntityFrom(DamageSource.field_31671, 2.0F);
         }
      } else {
         this.method_37192(300);
      }
   }

   @Override
   public void method_37219() {
      int var3 = this.method_37229();
      super.method_37219();
      this.method_8085(var3);
   }

   @Override
   public boolean method_37107() {
      return false;
   }

   @Override
   public boolean method_26887(class_704 var1) {
      return false;
   }
}
