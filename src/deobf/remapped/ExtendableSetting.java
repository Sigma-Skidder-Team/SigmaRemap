package remapped;

import java.util.Arrays;
import java.util.List;

public abstract class ExtendableSetting extends Setting<Boolean> {
   public List<Setting> children;

   public ExtendableSetting(String var1, String var2, SettingType var3, boolean expanded, List<Setting> var5) {
      super(var1, var2, var3, expanded);
      this.children = var5;
   }

   public ExtendableSetting(String var1, String var2, SettingType var3, boolean var4, Setting... var5) {
      this(var1, var2, var3, var4, Arrays.<Setting>asList(var5));
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      JSONArray var4 = JSONWriter.saveStringValue2ig(var1, this.getName());
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method_6142(); var5++) {
            JSONObjectImpl var6 = var4.method_6143(var5);
            String var7 = JSONWriter.saveStringValue(var1, "name", null);

            for (Setting var9 : this.method_9875()) {
               if (var9.getName().equals(var7)) {
                  var9.saveDataToJson(var6);
                  break;
               }
            }
         }
      }

      this.field_25890 = JSONWriter.saveBooleanValue(var1, "value", this.getSaveValue());
      return var1;
   }

   @Override
   public JSONObjectImpl loadDataFromJson(JSONObjectImpl var1) {
      JSONArray var4 = new JSONArray();

      for (Setting var6 : this.method_9875()) {
         var4.method_6159(var6.loadDataFromJson(new JSONObjectImpl()));
      }

      var1.method_5820("children", var4);
      var1.method_5820("name", this.getName());
      return super.loadDataFromJson(var1);
   }

   public List<Setting> method_9875() {
      return this.children;
   }
}
