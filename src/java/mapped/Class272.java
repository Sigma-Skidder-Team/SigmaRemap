package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class Class272 extends Class269<Map<ResourceLocation, List<Class1768>>> {
   public final Class1654 field1049;

   public Class272(Class1654 var1) {
      this.field1049 = var1;
   }

   public Map<ResourceLocation, List<Class1768>> method970(Class191 var1, Class7165 var2) {
      var2.method22501();
      Gson var5 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
      Map<ResourceLocation, List<Class1768>> var6 = Maps.newHashMap();

      for (ResourceLocation var8 : var1.method583("font", var0 -> var0.endsWith(".json"))) {
         String var9 = var8.method8292();
         ResourceLocation var10 = new ResourceLocation(var8.method8293(), var9.substring("font/".length(), var9.length() - ".json".length()));
         List<Class1768> var11 = var6.computeIfAbsent(var10, var0 -> Lists.newArrayList(new Class1772()));
         var2.method22504(var10::toString);

         try {
            for (Class1783 var13 : var1.method582(var8)) {
               var2.method22504(var13::method7765);

               try (
                  InputStream var14 = var13.method7763();
                  BufferedReader var16 = new BufferedReader(new InputStreamReader(var14, StandardCharsets.UTF_8));
               ) {
                  var2.startSection("reading");
                  JsonArray var18 = Class8963.method32785(Class8963.<JsonObject>method32796(var5, var16, JsonObject.class), "providers");
                  var2.endStartSection("parsing");

                  for (int var19 = var18.size() - 1; var19 >= 0; var19--) {
                     JsonObject var20 = Class8963.method32781(var18.get(var19), "providers[" + var19 + "]");

                     try {
                        String var21 = Class8963.method32763(var20, "type");
                        Class2038 var22 = Class2038.method8682(var21);
                        var2.startSection(var21);
                        Class1768 var23 = var22.method8683(var20).method24664(var1);
                        if (var23 != null) {
                           var11.add(var23);
                        }

                        var2.endSection();
                     } catch (RuntimeException var51) {
                        Class1654.method6711()
                           .warn("Unable to read definition '{}' in fonts.json in resourcepack: '{}': {}", var10, var13.method7765(), var51.getMessage());
                     }
                  }

                  var2.endSection();
               } catch (RuntimeException var56) {
                  Class1654.method6711()
                     .warn("Unable to load font '{}' in fonts.json in resourcepack: '{}': {}", var10, var13.method7765(), var56.getMessage());
               }

               var2.endSection();
            }
         } catch (IOException var57) {
            Class1654.method6711().warn("Unable to load font '{}' in fonts.json: {}", var10, var57.getMessage());
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

      var2.method22502();
      return var6;
   }

   public void method971(Map<ResourceLocation, List<Class1768>> var1, Class191 var2, Class7165 var3) {
      var3.method22501();
      var3.startSection("closing");
      Class1654.method6712(this.field1049).values().forEach(Class1807::close);
      Class1654.method6712(this.field1049).clear();
      var3.endStartSection("reloading");
      var1.forEach((var1x, var2x) -> {
         Class1807 var5 = new Class1807(Class1654.method6713(this.field1049), var1x);
         var5.method7919(Lists.reverse(var2x));
         Class1654.method6712(this.field1049).put(var1x, var5);
      });
      var3.endSection();
      var3.method22502();
   }

   @Override
   public String method969() {
      return "FontManager";
   }
}
