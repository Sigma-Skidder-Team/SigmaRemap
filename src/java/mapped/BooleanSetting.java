package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.SettingType;
import com.mentalfrostbyte.jello.settings.Setting;
import totalcross.json.JSONObject;

public class BooleanSetting extends Setting<Boolean> {
   public boolean field26186 = false;

   public BooleanSetting(String name, String description, boolean value) {
      super(name, description, SettingType.BOOLEAN, value);
   }

   public BooleanSetting method18630() {
      this.field26186 = true;
      return this;
   }

   @Override
   public void clearPremiumModes() {
      this.field26186 = false;
   }

   @Override
   public boolean hasPremiumSettings() {
      return this.field26186;
   }

   public void updateCurrentValue(Boolean value, boolean notify) {
      if (this.field26186 && notify) {
         Client.getInstance().getNotificationManager().post(new Notification("Premium", "Not yet available for free version"));
      }

      super.updateCurrentValue(value, notify);
   }

   public Boolean getCurrentValue() {
      return !this.field26186 ? this.currentValue : this.defaultValue;
   }

   @Override
   public JSONObject loadCurrentValueFromJSONObject(JSONObject jsonObject) {
      this.currentValue = CJsonUtils.getBooleanOrDefault(jsonObject, "value", this.getDefaultValue());
      return jsonObject;
   }
}
