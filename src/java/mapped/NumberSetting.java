package mapped;

import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Setting;
import totalcross.json.JSONObject;

public class NumberSetting<T extends Number> extends Setting<Float> {
   private Class<? extends T> type;
   private float minimum;
   private float maximum;
   private float increment;

   public NumberSetting(String name, String description, float defaultValue, Class<? extends T> type, float minimum, float maximum, float increment) {
      super(name, description, Class2314.field15852, defaultValue);
      this.type = type;
      this.minimum = minimum;
      this.maximum = maximum;
      this.increment = increment;
   }

   public int method18636() {
      if (this.increment != 1.0F) {
         String var3 = Float.toString(Math.abs(this.getIncrement()));
         int var4 = var3.indexOf(46);
         return var3.length() - var4 - 1;
      } else {
         return 0;
      }
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.currentValue = Class8000.method27328(var1, "value", this.method18624());
      return var1;
   }

   public float getMin() {
      return this.minimum;
   }

   public void setMin(float var1) {
      this.minimum = var1;
   }

   public float getMax() {
      return this.maximum;
   }

   public void setMax(float var1) {
      this.maximum = var1;
   }

   public float getIncrement() {
      return this.increment;
   }

   public void setIncrement(float var1) {
      this.increment = var1;
   }
}
