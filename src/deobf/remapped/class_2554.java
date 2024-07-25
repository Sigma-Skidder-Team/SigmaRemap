package remapped;

public class class_2554 implements class_8350 {
   private class_2966 field_12640;
   private class_3999[] field_12638;

   public class_2554(class_2966 var1, class_3999[] var2) {
      this.field_12640 = var1;
      this.field_12638 = var2;
   }

   @Override
   public float[] method_38444() {
      return this.field_12640.method_13566(this.field_12638);
   }

   @Override
   public String toString() {
      return "" + this.field_12640 + "()";
   }
}
