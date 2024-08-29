package mapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public abstract class Class281 extends Class269<Map<ResourceLocation, JsonElement>> {
   private static final Logger field1070 = LogManager.getLogger();
   private static final int field1071 = ".json".length();
   private final Gson field1072;
   private final String field1073;

   public Class281(Gson var1, String var2) {
      this.field1072 = var1;
      this.field1073 = var2;
   }

   public Map<ResourceLocation, JsonElement> method970(IResourceManager var1, IProfiler var2) {
      HashMap<ResourceLocation, JsonElement> var5 = Maps.newHashMap();
      int var6 = this.field1073.length() + 1;

      for (ResourceLocation var8 : var1.method583(this.field1073, var0 -> var0.endsWith(".json"))) {
         String var9 = var8.getPath();
         ResourceLocation var10 = new ResourceLocation(var8.getNamespace(), var9.substring(var6, var9.length() - field1071));

         try (
            Class1783 var11 = var1.method580(var8);
            InputStream var13 = var11.method7763();
            BufferedReader var15 = new BufferedReader(new InputStreamReader(var13, StandardCharsets.UTF_8));
         ) {
            JsonElement var17 = JSONUtils.method32796(this.field1072, var15, JsonElement.class);
            if (var17 != null) {
               JsonElement var18 = var5.put(var10, var17);
               if (var18 != null) {
                  throw new IllegalStateException("Duplicate data file ignored with ID " + var10);
               }
            } else {
               field1070.error("Couldn't load data file {} from {} as it's null or empty", var10, var8);
            }
         } catch (IOException | JsonParseException | IllegalArgumentException var70) {
            field1070.error("Couldn't parse data file {} from {}", var10, var8, var70);
         }
      }

      return var5;
   }
}
