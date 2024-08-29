package mapped;

import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Setting;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public abstract class Class6006 extends Setting<Boolean> {
   public List<Setting> field26189;

   public Class6006(String var1, String var2, Class2314 var3, boolean var4, List<Setting> var5) {
      super(var1, var2, var3, var4);
      this.field26189 = var5;
   }

   public Class6006(String var1, String var2, Class2314 var3, boolean var4, Setting... var5) {
      this(var1, var2, var3, var4, Arrays.<Setting>asList(var5));
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      JSONArray var4 = Class8000.method27332(var1, this.getName());
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length(); var5++) {
            JSONObject var6 = var4.getJSONObject(var5);
            String var7 = Class8000.method27330(var1, "name", null);

            for (Setting var9 : this.method18635()) {
               if (var9.getName().equals(var7)) {
                  var9.method18610(var6);
                  break;
               }
            }
         }
      }

      this.currentValue = Class8000.method27324(var1, "value", this.method18624());
      return var1;
   }

   @Override
   public JSONObject addDataToJSONObject(JSONObject jsonObject) {
      JSONArray var4 = new JSONArray();

      for (Setting var6 : this.method18635()) {
         var4.put(var6.addDataToJSONObject(new JSONObject()));
      }

      jsonObject.put("children", var4);
      jsonObject.put("name", this.getName());
      return super.addDataToJSONObject(jsonObject);
   }

   public List<Setting> method18635() {
      return this.field26189;
   }
}
