package mapped;

import net.minecraft.client.util.Util;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

public class Class576 implements Runnable {
   public final JSONArray field2812;
   public final ChangelogScreen field2813;

   public Class576(ChangelogScreen var1, JSONArray var2) {
      this.field2813 = var1;
      this.field2812 = var2;
   }

   @Override
   public void run() {
      int var3 = 75;

      for (int var4 = 0; var4 < this.field2812.length(); var4++) {
         JSONObject var5 = this.field2812.getJSONObject(var4);
         Class4330 var6 = null;
         if (var5.has("url")) {
            Util.getOSType().method8181(var5.getString("url"));
         }

         this.field2813.field21184.getButton().method13233(var6 = new Class4330(this.field2813.field21184, "changelog" + var4, var5));
         var6.setYA(var3);
         var3 += var6.getHeightA();
      }
   }
}
