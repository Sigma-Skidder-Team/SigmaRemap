package remapped;

public class SomeWeirdIntegerSetting extends Setting<Integer> {
   private String[] field_37032;

   public SomeWeirdIntegerSetting(String var1, String var2, Integer var3, String... var4) {
      super(var1, var2, class_5195.field_26720, var3);
      this.field_37032 = var4;
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      this.field_25890 = JSONWriter.saveIntValue(var1, "value", this.getSaveValue());
      return var1;
   }

   public String[] method_32991() {
      return this.field_37032;
   }
}
