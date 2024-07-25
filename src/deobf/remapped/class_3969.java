package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class class_3969 {
   public static List<String> field_19214;
   public class_575 field_19212;

   public class_3969(class_575 var1) {
      this.field_19212 = var1;
      new Thread(() -> {
         if (field_19214 == null) {
            field_19214 = this.method_18323();
         }

         var1.method_2743(field_19214);
      }).start();
   }

   public List<String> method_18323() {
      try {
         HttpGet var3 = new HttpGet("https://jelloconnect.sigmaclient.info/profiles.php?v=" + SigmaMainClass.clientVersion);
         CloseableHttpResponse var4 = HttpClients.createDefault().execute(var3);
         HttpEntity var5 = var4.getEntity();
         if (var5 != null) {
            ArrayList var24;
            try (InputStream var6 = var5.getContent()) {
               String var8 = IOUtils.toString(var6, "UTF-8");
               JSONArray var9 = new JSONArray(var8);
               ArrayList var10 = new ArrayList();

               for (int var11 = 0; var11 < var9.method_6142(); var11++) {
                  var10.add(var9.method_6133(var11));
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

   public String method_18326(String var1) {
      try {
         return URLEncoder.encode(var1, "UTF-8");
      } catch (UnsupportedEncodingException var5) {
         return var1;
      }
   }

   public JSONObjectImpl method_18325(String var1) {
      try {
         HttpGet var4 = new HttpGet("https://jelloconnect.sigmaclient.info/profiles/" + this.method_18326(var1) + ".profile?v=" + SigmaMainClass.clientVersion);
         CloseableHttpResponse var5 = HttpClients.createDefault().execute(var4);
         HttpEntity var6 = var5.getEntity();
         if (var6 != null) {
            JSONObjectImpl var10;
            try (InputStream var7 = var6.getContent()) {
               String var9 = IOUtils.toString(var7, "UTF-8");
               var10 = new JSONObjectImpl(var9);
            }

            return var10;
         }
      } catch (IOException var22) {
         var22.printStackTrace();
      }

      return new JSONObjectImpl();
   }

   public class_1675 method_18327(class_1675 var1, String var2) {
      class_1675 var5 = new class_1675(var2, var1);
      var5.method_7503();
      class_1675 var6 = new class_1675("settings", this.method_18325(var2).method_5848("modConfig"));

      for (Module var8 : SigmaMainClass.getInstance().getModuleManager().method_843().values()) {
         JSONObjectImpl var9 = var6.method_7501(var8);
         if (var9 != null) {
            var5.method_7502(var9, var8);
         }
      }

      return var5;
   }
}
