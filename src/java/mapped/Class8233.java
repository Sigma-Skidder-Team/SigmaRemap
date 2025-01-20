package mapped;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.module.Module;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

public class Class8233 {
   public static List<String> field35347;
   public Class6353 field35348;

   public Class8233(Class6353 var1) {
      this.field35348 = var1;
      new Thread(() -> {
         if (field35347 == null) {
            field35347 = this.getOnlineConfigs();
         }

         var1.method19340(field35347);
      }).start();
   }

   public List<String> getOnlineConfigs() {
      return Collections.EMPTY_LIST;
   }

   public String method28655(String var1) {
      try {
         return URLEncoder.encode(var1, "UTF-8");
      } catch (UnsupportedEncodingException var5) {
         return var1;
      }
   }

   public JSONObject getJSONObject(String var1) {
      return new JSONObject();
   }

   public Configuration method28657(Configuration var1, String var2) {
      Configuration var5 = new Configuration(var2, var1);
      Configuration var6 = null;
       try {
          var5.method22988();
          var6 = new Configuration("settings", this.getJSONObject(var2).getJSONObject("modConfig"));
       } catch (JSONException e) {
           throw new RuntimeException(e);
       }

       for (Module var8 : Client.getInstance().moduleManager.getModuleMap().values()) {
         JSONObject var9 = var6.method22990(var8);
         if (var9 != null) {
            var5.method22989(var9, var8);
         }
      }

      return var5;
   }
}
