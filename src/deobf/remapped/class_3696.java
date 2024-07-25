package remapped;

public class class_3696 implements class_8350, class_2194 {
   private class_8350 field_18107;
   private boolean field_18106;
   private float[] field_18104;

   public class_3696(class_8350 var1) {
      this.field_18107 = var1;
   }

   @Override
   public float[] method_38444() {
      if (!this.field_18106) {
         this.field_18104 = this.field_18107.method_38444();
         this.field_18106 = true;
      }

      return this.field_18104;
   }

   public void 蕃挐蚳亟웨䣓() {
      this.field_18106 = false;
   }

   @Override
   public class_8848 method_18450() {
      return class_8848.field_45248;
   }

   @Override
   public String toString() {
      return "cached(" + this.field_18107 + ")";
   }
}
