package remapped;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_3634 extends class_2840<Map<Identifier, List<class_3293>>> {
   public class_3634(class_950 var1) {
      this.field_17739 = var1;
   }

   public Map<Identifier, List<class_3293>> method_16944(class_7832 var1, class_3492 var2) {
      var2.method_16059();
      Gson var5 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
      HashMap var6 = Maps.newHashMap();

      for (Identifier var8 : var1.method_35460("font", var0 -> var0.endsWith(".json"))) {
         String var9 = var8.method_21456();
         Identifier var10 = new Identifier(var8.method_21461(), var9.substring("font/".length(), var9.length() - ".json".length()));
         List var11 = var6.computeIfAbsent(var10, var0 -> Lists.newArrayList(new class_3293[]{new class_8365()}));
         var2.method_16057(var10::toString);

         try {
            for (class_4038 var13 : var1.method_35457(var8)) {
               var2.method_16057(var13::method_18579);

               try (
                  InputStream var14 = var13.method_18576();
                  BufferedReader var16 = new BufferedReader(new InputStreamReader(var14, StandardCharsets.UTF_8));
               ) {
                  var2.method_16056("reading");
                  JsonArray var18 = class_6539.method_29787(class_6539.<JsonObject>method_29801(var5, var16, JsonObject.class), "providers");
                  var2.method_16050("parsing");

                  for (int var19 = var18.size() - 1; var19 >= 0; var19--) {
                     JsonObject var20 = class_6539.method_29782(var18.get(var19), "providers[" + var19 + "]");

                     try {
                        String var21 = class_6539.method_29796(var20, "type");
                        class_2397 var22 = class_2397.method_10928(var21);
                        var2.method_16056(var21);
                        class_3293 var23 = var22.method_10926(var20).method_16786(var1);
                        if (var23 != null) {
                           var11.add(var23);
                        }

                        var2.method_16054();
                     } catch (RuntimeException var51) {
                        class_950.method_4194()
                           .warn("Unable to read definition '{}' in fonts.json in resourcepack: '{}': {}", var10, var13.method_18579(), var51.getMessage());
                     }
                  }

                  var2.method_16054();
               } catch (RuntimeException var56) {
                  class_950.method_4194()
                     .warn("Unable to load font '{}' in fonts.json in resourcepack: '{}': {}", var10, var13.method_18579(), var56.getMessage());
               }

               var2.method_16054();
            }
         } catch (IOException var57) {
            class_950.method_4194().warn("Unable to load font '{}' in fonts.json: {}", var10, var57.getMessage());
         }

         var2.method_16056("caching");
         IntOpenHashSet var58 = new IntOpenHashSet();

         for (class_3293 var60 : var11) {
            var58.addAll(var60.method_15108());
         }

         var58.forEach(var1x -> {
            if (var1x != 32) {
               for (class_3293 var5x : Lists.reverse(var11)) {
                  if (var5x.method_15109(var1x) != null) {
                     break;
                  }
               }
            }
         });
         var2.method_16054();
         var2.method_16054();
      }

      var2.method_16052();
      return var6;
   }

   public void method_16943(Map<Identifier, List<class_3293>> var1, class_7832 var2, class_3492 var3) {
      var3.method_16059();
      var3.method_16056("closing");
      class_950.method_4193(this.field_17739).values().forEach(class_6988::close);
      class_950.method_4193(this.field_17739).clear();
      var3.method_16050("reloading");
      var1.forEach((var1x, var2x) -> {
         class_6988 var5 = new class_6988(class_950.method_4188(this.field_17739), var1x);
         var5.method_31979(Lists.reverse(var2x));
         class_950.method_4193(this.field_17739).put(var1x, var5);
      });
      var3.method_16054();
      var3.method_16052();
   }

   @Override
   public String method_10276() {
      return "FontManager";
   }
}
