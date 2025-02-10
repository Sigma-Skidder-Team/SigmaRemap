package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.module.Module;
import net.minecraft.client.gui.screen.Screen;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

public class Class7957 {
   private int field34204 = -1;
   private Object field34205;

   public Class7957(JSONObject var1) {
      this.method27050(var1);
   }

   public Class7957(int var1, Module var2) {
      this.field34204 = var1;
      this.field34205 = var2;
   }

   public Class7957(int var1, Class<? extends Screen> var2) {
      this.field34204 = var1;
      this.field34205 = var2;
   }

   public void method27050(JSONObject var1) {
      if (var1.has("target")) {
         try {
            if (var1.has("key")) {
               this.field34204 = var1.getInt("key");
            }

            if (var1.has("type")) {
               String var4 = var1.getString("type");
               switch (var4) {
                  case "mod":
                     for (Module var7 : Client.getInstance().moduleManager.getModuleMap().values()) {
                        if (var1.getString("target").equals(var7.getName())) {
                           this.field34205 = var7;
                        }
                     }
                  case "screen":
                     Class var8 = Client.getInstance().guiManager.method33477(var1.getString("target"));
                     if (var8 != null) {
                        this.field34205 = var8;
                     }
               }
            }
         } catch (JSONException e) {
            throw new RuntimeException(e);
         }
      }
   }

   public JSONObject method27051() {
      JSONObject var3 = new JSONObject();
      switch (Class8251.field35450[this.method27055().ordinal()]) {
         case 1:
            var3.put("type", "mod");
            var3.put("target", ((Module) this.field34205).getName());
            break;
         case 2:
            var3.put("type", "screen");
            var3.put("target", Client.getInstance().guiManager.getNameForTarget((Class<? extends Screen>) this.field34205));
      }

      var3.put("key", this.field34204);
      return var3;
   }

   public boolean method27052() {
      return this.field34205 != null;
   }

   public int method27053() {
      return this.field34204;
   }

   public void method27054(int var1) {
      this.field34204 = var1;
   }

   public Class2067 method27055() {
      return !(this.field34205 instanceof Module) ? Class2067.field13470 : Class2067.field13469;
   }

   public Object method27056() {
      return this.field34205;
   }

   public Class<? extends Screen> method27057() {
      return (Class<? extends Screen>) this.field34205;
   }

   public Module method27058() {
      return (Module) this.field34205;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (var1 instanceof Class7957) {
            Class7957 var4 = (Class7957) var1;
            return this.method27056().equals(var4.method27056());
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
