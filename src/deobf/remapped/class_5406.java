package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.io.IOUtils;

public class class_5406 extends class_8143 {
   private String field_27580;

   public class_5406(String var1) {
      this.field_27580 = var1;
   }

   @Override
   public void method_37053(class_7832 var1) throws IOException {
      this.method_37052();
      InputStream var4 = class_6588.method_30208(this.field_27580);
      if (var4 == null) {
         throw new FileNotFoundException("Shader texture not found: " + this.field_27580);
      } else {
         try {
            class_5797 var5 = class_5797.method_26230(var4);
            class_9051 var6 = method_24601(this.field_27580, new class_9051(false, false));
            class_4970.method_22840(this.method_37055(), var5.method_26228(), var5.method_26253());
            var5.method_26259(0, 0, 0, 0, 0, var5.method_26228(), var5.method_26253(), var6.method_41588(), var6.method_41589(), false, true);
         } finally {
            IOUtils.closeQuietly(var4);
         }
      }
   }

   public static class_9051 method_24601(String var0, class_9051 var1) {
      String var4 = var0 + ".mcmeta";
      String var5 = "texture";
      InputStream var6 = class_6588.method_30208(var4);
      if (var6 != null) {
         BufferedReader var7 = new BufferedReader(new InputStreamReader(var6));

         class_9051 var11;
         try {
            JsonObject var8 = new JsonParser().parse(var7).getAsJsonObject();
            JsonObject var18 = var8.getAsJsonObject(var5);
            if (var18 == null) {
               return var1;
            }

            class_9051 var10 = class_9051.field_46357.method_33694(var18);
            if (var10 != null) {
               return var10;
            }

            var11 = var1;
         } catch (RuntimeException var16) {
            class_1910.method_8669("Error reading metadata: " + var4);
            class_1910.method_8669("" + var16.getClass().getName() + ": " + var16.getMessage());
            return var1;
         } finally {
            IOUtils.closeQuietly(var7);
            IOUtils.closeQuietly(var6);
         }

         return var11;
      } else {
         return var1;
      }
   }
}
