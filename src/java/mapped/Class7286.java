package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

public class Class7286 {
   private JSONObject field31261;
   public JSONObject field31262;
   public String field31263;

   public Class7286() {
   }

   public Class7286(String var1, JSONObject var2) {
      this.field31263 = var1;
      this.field31262 = var2;
   }

   public Class7286(String var1, Class7286 var2) {
      this.field31263 = var1;
      this.field31262 = var2.field31262;
   }

   public Class7286 method22984(JSONObject var1) throws JSONException {
      this.field31262 = var1.method21769("modConfig");
      this.field31263 = var1.getString("name");
      return this;
   }

   public JSONObject method22985(JSONObject var1) {
      var1.put("modConfig", this.field31262);
      var1.put("name", this.field31263);
      return var1;
   }

   public JSONObject method22986() {
      return this.field31261;
   }

   public Class7286 method22987(String var1) {
      return new Class7286(var1, this.field31262);
   }

   public void method22988() {
      JSONArray var3 = null;

      try {
         var3 = Class8000.method27332(this.field31262, "mods");
      } catch (JSONException2 var10) {
      }

      if (var3 != null) {
         for (int var4 = 0; var4 < var3.length(); var4++) {
            JSONObject var5 = var3.getJSONObject(var4);
            String var6 = null;

            try {
               var6 = Class8000.method27330(var5, "name", null);
            } catch (JSONException2 var9) {
               Client.getInstance().getLogger().warn("Invalid name in mod list config");
            }

            for (Module var8 : Client.getInstance().getModuleManager().getModuleMap().values()) {
               if (var8.getName().equals(var6) && var8.getAdjustedCategoryBasedOnClientMode() != ModuleCategory.GUI && var8.getAdjustedCategoryBasedOnClientMode() != ModuleCategory.RENDER) {
                  var5.put("enabled", "false");
               }
            }
         }
      }
   }

   public void method22989(JSONObject var1, Module var2) {
      JSONArray var5 = null;

      try {
         var5 = Class8000.method27332(this.field31262, "mods");
      } catch (JSONException2 var12) {
      }

      boolean var6 = false;
      if (var5 != null) {
         for (int var7 = 0; var7 < var5.length(); var7++) {
            JSONObject var8 = var5.getJSONObject(var7);
            String var9 = null;

            try {
               var9 = Class8000.method27330(var8, "name", null);
            } catch (JSONException2 var11) {
               Client.getInstance().getLogger().warn("Invalid name in mod list config");
            }

            if (var2.getName().equals(var9)) {
               if (var2.getAdjustedCategoryBasedOnClientMode() != ModuleCategory.GUI && var2.getAdjustedCategoryBasedOnClientMode() != ModuleCategory.RENDER) {
                  var5.method9165(var7, var1);
               }

               var6 = true;
            }
         }
      }

      if (!var6) {
         var5.put(var1);
      }
   }

   public JSONObject method22990(Module var1) {
      JSONArray var4 = null;

      try {
         var4 = Class8000.method27332(this.field31262, "mods");
      } catch (JSONException2 var10) {
      }

      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length(); var5++) {
            JSONObject var6 = var4.getJSONObject(var5);
            String var7 = null;

            try {
               var7 = Class8000.method27330(var6, "name", null);
            } catch (JSONException2 var9) {
               Client.getInstance().getLogger().warn("Invalid name in mod list config");
            }

            if (var1.getName().equals(var7)) {
               return var6;
            }
         }
      }

      return null;
   }
}
