package remapped;

import javax.annotation.Nullable;

public class class_5832 extends class_1871 {
   private static String[] field_29592;
   private class_1343 field_29593;

   public class_5832(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23473() {
      if (this.field_29593 == null) {
         this.field_29593 = this.field_9479.method_37245();
      }
   }

   @Override
   public boolean method_23472() {
      return true;
   }

   @Override
   public void method_23469() {
      this.field_29593 = null;
   }

   @Override
   public float method_23470() {
      return 1.0F;
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return this.field_29593;
   }

   @Override
   public class_8978<class_5832> method_23464() {
      return class_8978.field_46000;
   }
}
