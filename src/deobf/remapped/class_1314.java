package remapped;

import javax.annotation.Nullable;

public class class_1314 extends class_3558 {
   private static String[] field_7254;

   private class_1314(class_2547 var1) {
      super(var1);
      this.field_7253 = var1;
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() ? !this.field_7253.method_26480(Effects.field_19740) : false;
   }

   @Override
   public int method_16545() {
      return 20;
   }

   @Override
   public int method_16541() {
      return 340;
   }

   @Override
   public void method_16543() {
      this.field_7253.method_26558(new class_2250(Effects.field_19740, 1200));
   }

   @Nullable
   @Override
   public class_8461 method_16540() {
      return class_463.field_2791;
   }

   @Override
   public class_248 method_16544() {
      return class_248.field_875;
   }
}
