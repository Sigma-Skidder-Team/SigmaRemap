package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

public class Class8233 {
   public static List<String> field35347;
   public Class6353 field35348;

   public Class8233(Class6353 var1) {
      this.field35348 = var1;
      new Thread(() -> {
         if (field35347 == null) {
            field35347 = this.method28654();
         }

         var1.method19340(field35347);
      }).start();
   }

   public List<String> method28654() {
      try {
         HttpGet var3 = new HttpGet("https://jelloconnect.sigmaclient.info/profiles.php?v=" + Client.VERSION);
         CloseableHttpResponse var4 = HttpClients.createDefault().execute(var3);
         HttpEntity var5 = var4.getEntity();
         if (var5 != null) {
            ArrayList var24;
            try (InputStream var6 = var5.getContent()) {
               String var8 = IOUtils.toString(var6, "UTF-8");
               JSONArray var9 = new JSONArray(var8);
               ArrayList var10 = new ArrayList();

               for (int var11 = 0; var11 < var9.length(); var11++) {
                  var10.add(var9.getString(var11));
               }

               var24 = var10;
            }

            return var24;
         }
      } catch (IOException var23) {
         var23.printStackTrace();
      }

      return Collections.EMPTY_LIST;
   }

   public String method28655(String var1) {
      try {
         return URLEncoder.encode(var1, "UTF-8");
      } catch (UnsupportedEncodingException var5) {
         return var1;
      }
   }

   public JSONObject method28656(String var1) {
      try {
         HttpGet var4 = new HttpGet("https://jelloconnect.sigmaclient.info/profiles/" + this.method28655(var1) + ".profile?v=" + Client.VERSION);
         CloseableHttpResponse var5 = HttpClients.createDefault().execute(var4);
         HttpEntity var6 = var5.getEntity();
         if (var6 != null) {
            JSONObject var10;
            try (InputStream var7 = var6.getContent()) {
               String var9 = IOUtils.toString(var7, "UTF-8");
               var10 = new JSONObject(var9);
            }

            return var10;
         }
      } catch (IOException var22) {
         var22.printStackTrace();
      }

      return new JSONObject();
   }

   public Class7286 method28657(Class7286 var1, String var2) {
      Class7286 var5 = new Class7286(var2, var1);
      var5.method22988();
      Class7286 var6 = new Class7286("settings", this.method28656(var2).method21769("modConfig"));

      for (Module var8 : Client.getInstance().getModuleManager().method14664().values()) {
         JSONObject var9 = var6.method22990(var8);
         if (var9 != null) {
            var5.method22989(var9, var8);
         }
      }

      return var5;
   }
}
