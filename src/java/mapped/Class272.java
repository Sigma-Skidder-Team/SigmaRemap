package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class Class272 extends Class269<Map<ResourceLocation, List<Class1768>>> {
   public final FontResourceManager field1049;

   public Class272(FontResourceManager var1) {
      this.field1049 = var1;
   }

   public Map<ResourceLocation, List<Class1768>> method970(IResourceManager var1, IProfiler var2) {
      var2.startTick();
      Gson var5 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
      Map<ResourceLocation, List<Class1768>> var6 = Maps.newHashMap();

      for (ResourceLocation var8 : var1.method583("font", var0 -> var0.endsWith(".json"))) {
         String var9 = var8.getPath();
         ResourceLocation var10 = new ResourceLocation(var8.getNamespace(), var9.substring("font/".length(), var9.length() - ".json".length()));
         List<Class1768> var11 = var6.computeIfAbsent(var10, var0 -> Lists.newArrayList(new Class1772()));
         var2.startSection(var10::toString);

         try {
            for (JSonShader var13 : var1.method582(var8)) {
               var2.startSection(var13::method7765);

               try (
                       InputStream var14 = var13.getFile();
                       BufferedReader var16 = new BufferedReader(new InputStreamReader(var14, StandardCharsets.UTF_8));
               ) {
                  var2.startSection("reading");
                  JsonArray var18 = JSONUtils.method32785(JSONUtils.<JsonObject>method32796(var5, var16, JsonObject.class), "providers");
                  var2.endStartSection("parsing");

                  for (int var19 = var18.size() - 1; var19 >= 0; var19--) {
                     JsonObject var20 = JSONUtils.getJSONObject(var18.get(var19), "providers[" + var19 + "]");

                     try {
                        String var21 = JSONUtils.getString(var20, "type");
                        Class2038 var22 = Class2038.method8682(var21);
                        var2.startSection(var21);
                        Class1768 var23 = var22.method8683(var20).method24664(var1);
                        if (var23 != null) {
                           var11.add(var23);
                        }

                        var2.endSection();
                     } catch (RuntimeException var51) {
                        FontResourceManager.method6711()
                           .warn("Unable to read definition '{}' in fonts.json in resourcepack: '{}': {}", var10, var13.method7765(), var51.getMessage());
                     }
                  }

                  var2.endSection();
               } catch (RuntimeException var56) {
                  FontResourceManager.method6711()
                     .warn("Unable to load font '{}' in fonts.json in resourcepack: '{}': {}", var10, var13.method7765(), var56.getMessage());
               }

               var2.endSection();
            }
         } catch (IOException var57) {
            FontResourceManager.method6711().warn("Unable to load font '{}' in fonts.json: {}", var10, var57.getMessage());
         }

         var2.startSection("caching");
         IntOpenHashSet var58 = new IntOpenHashSet();

         for (Class1768 var60 : var11) {
            var58.addAll(var60.method7735());
         }

         var58.forEach((int var1x) -> {
            if (var1x != 32) {
               for (Class1768 var5x : Lists.reverse(var11)) {
                  if (var5x.method7734(var1x) != null) {
                     break;
                  }
               }
            }
         });
         var2.endSection();
         var2.endSection();
      }

      var2.endTick();
      return var6;
   }

   public void method971(Map<ResourceLocation, List<Class1768>> var1, IResourceManager var2, IProfiler var3) {
      var3.startTick();
      var3.startSection("closing");
      FontResourceManager.method6712(this.field1049).values().forEach(Class1807::close);
      FontResourceManager.method6712(this.field1049).clear();
      var3.endStartSection("reloading");
      var1.forEach((var1x, var2x) -> {
         Class1807 var5 = new Class1807(FontResourceManager.method6713(this.field1049), var1x);
         var5.method7919(Lists.reverse(var2x));
         FontResourceManager.method6712(this.field1049).put(var1x, var5);
      });
      var3.endSection();
      var3.endTick();
   }

   @Override
   public String method969() {
      return "FontManager";
   }
}
