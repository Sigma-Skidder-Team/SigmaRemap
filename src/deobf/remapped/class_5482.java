package remapped;

public class class_5482 implements class_6839 {
   private class_2966 field_27921;
   private class_3999[] field_27922;
   private int field_27919 = -1;

   public class_5482(class_2966 var1, class_3999[] var2) {
      this.field_27921 = var1;
      this.field_27922 = var2;
   }

   @Override
   public float method_31353() {
      class_3999[] var3 = this.field_27922;
      switch (this.field_27921) {
         case field_14596:
            class_3999 var4 = var3[0];
            if (!(var4 instanceof class_4570)) {
               float var5 = method_24902(var3, 0);
               float var6 = var3.length > 1 ? method_24902(var3, 1) : 1.0F;
               float var7 = var3.length > 2 ? method_24902(var3, 2) : var6;
               if (this.field_27919 < 0) {
                  this.field_27919 = class_9454.method_43720();
               }

               return class_9454.method_43723(this.field_27919, var5, var6, var7);
            }
         default:
            return this.field_27921.method_13560(this.field_27922);
      }
   }

   private static float method_24902(class_3999[] var0, int var1) {
      class_6839 var4 = (class_6839)var0[var1];
      return var4.method_31353();
   }

   @Override
   public String toString() {
      return "" + this.field_27921 + "()";
   }
}
