package remapped;

public class class_825 implements class_6839, class_2194 {
   private class_6839 field_4357;
   private boolean field_4355;
   private float field_4354;

   public class_825(class_6839 var1) {
      this.field_4357 = var1;
   }

   @Override
   public float method_31353() {
      if (!this.field_4355) {
         this.field_4354 = this.field_4357.method_31353();
         this.field_4355 = true;
      }

      return this.field_4354;
   }

   public void 蕃挐蚳亟웨䣓() {
      this.field_4355 = false;
   }

   @Override
   public class_8848 method_18450() {
      return class_8848.field_45248;
   }

   @Override
   public String toString() {
      return "cached(" + this.field_4357 + ")";
   }
}
