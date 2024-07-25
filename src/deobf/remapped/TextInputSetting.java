package remapped;

public class TextInputSetting extends Setting<String> {
   public TextInputSetting(String var1, String var2, String var3) {
      super(var1, var2, class_5195.field_26723, var3);
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      this.field_25890 = JSONWriter.saveStringValue(var1, "value", this.getSaveValue());
      return var1;
   }
}
