package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class Class292 extends Class290 {
   private String field1134;

   public Class292(String var1) {
      this.field1134 = var1;
   }

   @Override
   public void method1090(IResourceManager var1) throws IOException {
      this.method1132();
      InputStream var4 = Shaders.method33138(this.field1134);
      if (var4 == null) {
         throw new FileNotFoundException("Shader texture not found: " + this.field1134);
      } else {
         try {
            Class1806 var5 = Class1806.method7879(var4);
            Class9620 var6 = method1144(this.field1134, new Class9620(false, false));
            Class8535.method30368(this.method1131(), var5.method7886(), var5.method7887());
            var5.method7895(0, 0, 0, 0, 0, var5.method7886(), var5.method7887(), var6.method37495(), var6.method37496(), false, true);
         } finally {
            IOUtils.closeQuietly(var4);
         }
      }
   }

   public static Class9620 method1144(String var0, Class9620 var1) {
      String var4 = var0 + ".mcmeta";
      String var5 = "texture";
      InputStream var6 = Shaders.method33138(var4);
      if (var6 != null) {
         BufferedReader var7 = new BufferedReader(new InputStreamReader(var6));

         Class9620 var11;
         try {
            JsonObject var8 = new JsonParser().parse(var7).getAsJsonObject();
            JsonObject var18 = var8.getAsJsonObject(var5);
            if (var18 == null) {
               return var1;
            }

            Class9620 var10 = Class9620.field44993.method22519(var18);
            if (var10 != null) {
               return var10;
            }

            var11 = var1;
         } catch (RuntimeException var16) {
            Class7399.method23633("Error reading metadata: " + var4);
            Class7399.method23633("" + var16.getClass().getName() + ": " + var16.getMessage());
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
