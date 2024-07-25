package remapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9639<T> {
   private static final Logger field_49106 = LogManager.getLogger();
   private static final Gson field_49110 = new Gson();
   private static final int field_49105 = field_49111[5].length();
   private final Function<Identifier, Optional<T>> field_49109;
   private final String field_49108;
   private final String field_49107;

   public class_9639(Function<Identifier, Optional<T>> var1, String var2, String var3) {
      this.field_49109 = var1;
      this.field_49108 = var2;
      this.field_49107 = var3;
   }

   public CompletableFuture<Map<Identifier, class_1079>> method_44502(class_7832 var1, Executor var2) {
      return CompletableFuture.<Map<Identifier, class_1079>>supplyAsync(
         () -> {
            HashMap var4 = Maps.newHashMap();

            for (Identifier var6 : var1.method_35460(this.field_49108, var0 -> var0.endsWith(".json"))) {
               String var7 = var6.method_21456();
               Identifier var8 = new Identifier(var6.method_21461(), var7.substring(this.field_49108.length() + 1, var7.length() - field_49105));

               try {
                  for (class_4038 var10 : var1.method_35457(var6)) {
                     try (
                        InputStream var11 = var10.method_18576();
                        BufferedReader var13 = new BufferedReader(new InputStreamReader(var11, StandardCharsets.UTF_8));
                     ) {
                        JsonObject var15 = class_6539.<JsonObject>method_29801(field_49110, var13, JsonObject.class);
                        if (var15 == null) {
                           field_49106.error(
                              "Couldn't load {} tag list {} from {} in data pack {} as it is empty or null", this.field_49107, var8, var6, var10.method_18579()
                           );
                        } else {
                           var4.computeIfAbsent(var8, var0 -> class_1079.method_4726()).method_4728(var15, var10.method_18579());
                        }
                     } catch (IOException | RuntimeException var59) {
                        field_49106.error("Couldn't read {} tag list {} from {} in data pack {}", this.field_49107, var8, var6, var10.method_18579(), var59);
                     } finally {
                        IOUtils.closeQuietly(var10);
                     }
                  }
               } catch (IOException var61) {
                  field_49106.error("Couldn't read {} tag list {} from {}", this.field_49107, var8, var6, var61);
               }
            }

            return var4;
         },
         var2
      );
   }

   public class_9349<T> method_44503(Map<Identifier, class_1079> var1) {
      HashMap var4 = Maps.newHashMap();
      Function var5 = var4::get;
      Function var6 = var1x -> this.field_49109.apply(var1x).orElse(null);

      while (!var1.isEmpty()) {
         boolean var7 = false;
         Iterator var8 = var1.entrySet().iterator();

         while (var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            Optional var10 = ((class_1079)var9.getValue()).method_4719(var5, var6);
            if (var10.isPresent()) {
               var4.put(var9.getKey(), var10.get());
               var8.remove();
               var7 = true;
            }
         }

         if (!var7) {
            break;
         }
      }

      var1.forEach(
         (var3, var4x) -> field_49106.error(
               "Couldn't load {} tag {} as it is missing following references: {}",
               this.field_49107,
               var3,
               var4x.method_4727(var5, var6).<CharSequence>map(Objects::toString).collect(Collectors.joining(","))
            )
      );
      return class_9349.<T>method_43138(var4);
   }
}
