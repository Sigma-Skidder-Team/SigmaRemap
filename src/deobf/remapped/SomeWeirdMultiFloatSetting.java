package remapped;

public class SomeWeirdMultiFloatSetting extends Setting<class_7928> {
   public SomeWeirdMultiFloatSetting(String var1, String var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, class_5195.field_26721, new class_7928(var3, var4, var5, var6));
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      this.field_25890 = new class_7928(class_3332.method_15293(var1, "value"));
      return var1;
   }

   @Override
   public JSONObjectImpl loadDataFromJson(JSONObjectImpl var1) {
      var1.method_5820("name", this.method_23032());
      var1.method_5820("value", this.method_23031().method_35842());
      return var1;
   }

   public void method_2109(float var1, float var2, float var3, float var4) {
      this.method_2110(var1, var2, var3, var4, true);
   }

   public float[] method_2111() {
      class_7928 var3 = this.method_23031();
      return new float[]{var3.field_40551, var3.field_40553, var3.field_40550, var3.field_40552};
   }

   public void method_2110(float var1, float var2, float var3, float var4, boolean var5) {
      class_7928 var8 = new class_7928(var1, var2, var3, var4);
      if (!this.field_25890.equals(var8)) {
         this.field_25890 = var8;
         if (var5) {
            this.method_23034();
         }
      }
   }
}
