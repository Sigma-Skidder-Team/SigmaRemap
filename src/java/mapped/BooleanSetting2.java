package mapped;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import com.mentalfrostbyte.jello.unmapped.Setting;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooleanSetting2 extends Setting<List<String>> {
   private boolean field26185;

   public BooleanSetting2(String var1, String var2, boolean var3, String... var4) {
      super(var1, var2, SettingType.BOOLEAN2, Arrays.<String>asList(var4));
      this.method18629(var3);
   }

   @Override
   public JSONObject addDataToJSONObject(JSONObject jsonObject) {
      jsonObject.put("name", this.getName());
      jsonObject.put("value", new JSONArray(this.currentValue.toArray()));
      return jsonObject;
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      JSONArray var4 = Class8000.method27332(var1, "value");
      this.currentValue = new ArrayList<String>();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length(); var5++) {
            this.currentValue.add(var4.getString(var5));
         }
      }

      return var1;
   }

   public boolean method18628() {
      return this.field26185;
   }

   public void method18629(boolean var1) {
      this.field26185 = var1;
   }
}
