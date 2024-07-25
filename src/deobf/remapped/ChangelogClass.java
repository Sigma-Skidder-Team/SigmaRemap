package remapped;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class ChangelogClass extends class_7038 {
   public class_2440 field_5072 = new class_2440(380, 200, class_4043.field_19618);
   public class_2612 field_5070;
   private static JSONArray field_5071;

   public ChangelogClass(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method_32105(false);
      this.field_5070 = new class_2612(this, "scroll", 100, 200, var5 - 200, var6 - 200);
      this.field_5070.method_11848(true);
      this.method_32150(this.field_5070);
      new Thread(() -> this.method_4332(this.method_4331())).start();
   }

   public void method_4332(JSONArray var1) {
      if (var1 != null) {
         this.method_32167().method_32102(new class_4910(this, var1));
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.field_5070 != null) {
         if (this.method_32140() && this.method_32126()) {
            for (class_7038 var9 : this.field_5070.method_11850().method_32134()) {
               class_4113 var10 = (class_4113)var9;
               var10.field_20042.method_11119(class_4043.field_19620);
               if ((double)var10.field_20042.method_11123() < 0.5) {
                  break;
               }
            }
         } else {
            for (class_7038 var6 : this.field_5070.method_11850().method_32134()) {
               class_4113 var7 = (class_4113)var6;
               var7.field_20042.method_11119(class_4043.field_19618);
            }
         }
      }
   }

   @Override
   public void method_32178(float var1) {
      this.field_5072.method_11119(!this.method_32140() ? class_4043.field_19618 : class_4043.field_19620);
      var1 *= this.field_5072.method_11123();
      float var4 = class_5181.method_23766(this.field_5072.method_11123(), 0.17, 1.0, 0.51, 1.0);
      if (this.field_5072.method_11128() == class_4043.field_19618) {
         var4 = 1.0F;
      }

      this.method_32124((int)(150.0F * (1.0F - var4)));
      this.method_32130();
      class_73.method_87(class_5320.field_27140, 100.0F, 100.0F, "Changelog", class_314.method_1444(class_1255.field_6918.field_6917, var1));
      class_3384 var10000 = class_5320.field_27141;
      StringBuilder var10003 = new StringBuilder().append("You're currently using Sigma ");
      SigmaMainClass.method_3328();
      class_73.method_87(
         var10000, 100.0F, 150.0F, var10003.append(SigmaMainClass.field_3957).toString(), class_314.method_1444(class_1255.field_6918.field_6917, 0.6F * var1)
      );
      super.method_32178(var1);
   }

   public JSONArray method_4331() {
      if (field_5071 != null) {
         return field_5071;
      } else {
         try {
            HttpGet var3 = new HttpGet("https://jelloconnect.sigmaclient.info/changelog.php?v=" + SigmaMainClass.field_3957);
            CloseableHttpResponse var4 = HttpClients.createDefault().execute(var3);
            HttpEntity var5 = var4.getEntity();
            if (var5 != null) {
               JSONArray var9;
               try (InputStream var6 = var5.getContent()) {
                  String var8 = IOUtils.toString(var6, "UTF-8");
                  var9 = field_5071 = new JSONArray(var8);
               }

               return var9;
            }
         } catch (IOException var21) {
            var21.printStackTrace();
         }

         return null;
      }
   }
}
