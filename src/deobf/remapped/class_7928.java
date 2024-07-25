package remapped;

public class class_7928 {
   private static String[] field_40554;
   public float field_40551;
   public float field_40553;
   public float field_40550;
   public float field_40552;

   public class_7928(float var1, float var2, float var3, float var4) {
      this.field_40551 = var1;
      this.field_40553 = var2;
      this.field_40550 = var3;
      this.field_40552 = var4;
   }

   public class_7928(JSONArray var1) {
      this.field_40551 = Float.parseFloat(var1.method_6133(0));
      this.field_40553 = Float.parseFloat(var1.method_6133(1));
      this.field_40550 = Float.parseFloat(var1.method_6133(2));
      this.field_40552 = Float.parseFloat(var1.method_6133(3));
   }

   public JSONArray method_35842() {
      JSONArray var3 = new JSONArray();
      var3.method_6154(0, Float.toString(this.field_40551));
      var3.method_6154(1, Float.toString(this.field_40553));
      var3.method_6154(2, Float.toString(this.field_40550));
      var3.method_6154(3, Float.toString(this.field_40552));
      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1 instanceof class_7928) {
         class_7928 var4 = (class_7928)var1;
         return this.field_40551 == var4.field_40551
            && this.field_40553 == var4.field_40553
            && this.field_40550 == var4.field_40550
            && this.field_40552 == var4.field_40552;
      } else {
         return false;
      }
   }
}
