package mapped;

import com.mentalfrostbyte.jello.unmapped.SettingType;
import com.mentalfrostbyte.jello.unmapped.Setting;
import totalcross.json.JSONObject;

public class InputSetting extends Setting<String> {
   public InputSetting(String var1, String var2, String var3) {
      super(var1, var2, SettingType.INPUT, var3);
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.currentValue = Class8000.method27330(var1, "value", this.method18624());
      return var1;
   }
}
