package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.json.JSONException;

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

   public Class7286 method22984(JSONObject var1) throws Class2455 {
      this.field31262 = var1.method21769("modConfig");
      this.field31263 = var1.method21773("name");
      return this;
   }

   public JSONObject method22985(JSONObject var1) {
      var1.method21806("modConfig", this.field31262);
      var1.method21806("name", this.field31263);
      return var1;
   }

   public JSONObject method22986() {
      return this.field31261;
   }

   public Class7286 method22987(String var1) {
      return new Class7286(var1, this.field31262);
   }

   public void method22988() {
      Class2344 var3 = null;

      try {
         var3 = Class8000.method27332(this.field31262, "mods");
      } catch (Class2499 var10) {
      }

      if (var3 != null) {
         for (int var4 = 0; var4 < var3.method9134(); var4++) {
            JSONObject var5 = var3.method9129(var4);
            String var6 = null;

            try {
               var6 = Class8000.method27330(var5, "name", null);
            } catch (Class2499 var9) {
               Client.getInstance().getLogger().method20357("Invalid name in mod list config");
            }

            for (Module var8 : Client.getInstance().getModuleManager().method14664().values()) {
               if (var8.method15991().equals(var6) && var8.method15993() != ModuleCategory.GUI && var8.method15993() != ModuleCategory.RENDER) {
                  var5.method21806("enabled", "false");
               }
            }
         }
      }
   }

   public void method22989(JSONObject var1, Module var2) {
      Class2344 var5 = null;

      try {
         var5 = Class8000.method27332(this.field31262, "mods");
      } catch (Class2499 var12) {
      }

      boolean var6 = false;
      if (var5 != null) {
         for (int var7 = 0; var7 < var5.method9134(); var7++) {
            JSONObject var8 = var5.method9129(var7);
            String var9 = null;

            try {
               var9 = Class8000.method27330(var8, "name", null);
            } catch (Class2499 var11) {
               Client.getInstance().getLogger().method20357("Invalid name in mod list config");
            }

            if (var2.method15991().equals(var9)) {
               if (var2.method15993() != ModuleCategory.GUI && var2.method15993() != ModuleCategory.RENDER) {
                  var5.method9165(var7, var1);
               }

               var6 = true;
            }
         }
      }

      if (!var6) {
         var5.method9158(var1);
      }
   }

   public JSONObject method22990(Module var1) {
      Class2344 var4 = null;

      try {
         var4 = Class8000.method27332(this.field31262, "mods");
      } catch (Class2499 var10) {
      }

      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method9134(); var5++) {
            JSONObject var6 = var4.method9129(var5);
            String var7 = null;

            try {
               var7 = Class8000.method27330(var6, "name", null);
            } catch (Class2499 var9) {
               Client.getInstance().getLogger().method20357("Invalid name in mod list config");
            }

            if (var1.method15991().equals(var7)) {
               return var6;
            }
         }
      }

      return null;
   }
}
