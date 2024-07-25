package remapped;

public class HippieModeValue extends Setting<String> {
   public HippieModeValue(String var1, String var2, String var3) {
      super(var1, var2, SettingType.MODE_GAY, var3);
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      this.field_25890 = JSONWriter.saveStringValue(var1, "value", this.getSaveValue());
      return var1;
   }
}
