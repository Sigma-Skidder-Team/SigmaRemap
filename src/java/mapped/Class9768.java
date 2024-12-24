package mapped;

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

import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9768<T> {
   private static final Logger field45702 = LogManager.getLogger();
   private static final Gson field45703 = new Gson();
   private static final int field45704 = ".json".length();
   private final Function<ResourceLocation, Optional<T>> field45705;
   private final String field45706;
   private final String field45707;

   public Class9768(Function<ResourceLocation, Optional<T>> var1, String var2, String var3) {
      this.field45705 = var1;
      this.field45706 = var2;
      this.field45707 = var3;
   }

   public CompletableFuture<Map<ResourceLocation, Class6879>> method38419(IResourceManager var1, Executor var2) {
      return CompletableFuture.<Map<ResourceLocation, Class6879>>supplyAsync(
         () -> {
            Map<ResourceLocation, Class6879> var4 = Maps.newHashMap();

            for (ResourceLocation var6 : var1.method583(this.field45706, var0 -> var0.endsWith(".json"))) {
               String var7 = var6.getPath();
               ResourceLocation var8 = new ResourceLocation(var6.getNamespace(), var7.substring(this.field45706.length() + 1, var7.length() - field45704));

               try {
                  for (JSonShader var10 : var1.method582(var6)) {
                     try (
                             InputStream var11 = var10.getFile();
                             BufferedReader var13 = new BufferedReader(new InputStreamReader(var11, StandardCharsets.UTF_8));
                     ) {
                        JsonObject var15 = JSONUtils.<JsonObject>method32796(field45703, var13, JsonObject.class);
                        if (var15 == null) {
                           field45702.error(
                              "Couldn't load {} tag list {} from {} in data pack {} as it is empty or null", this.field45707, var8, var6, var10.method7765()
                           );
                        } else {
                           var4.computeIfAbsent(var8, var0 -> Class6879.method20942()).method20950(var15, var10.method7765());
                        }
                     } catch (IOException | RuntimeException var59) {
                        field45702.error("Couldn't read {} tag list {} from {} in data pack {}", this.field45707, var8, var6, var10.method7765(), var59);
                     } finally {
                        IOUtils.closeQuietly(var10);
                     }
                  }
               } catch (IOException var61) {
                  field45702.error("Couldn't read {} tag list {} from {}", this.field45707, var8, var6, var61);
               }
            }

            return var4;
         },
         var2
      );
   }

   public ITagCollection<T> method38420(Map<ResourceLocation, Class6879> var1) {
      HashMap var4 = Maps.newHashMap();
      Function var5 = var4::get;
      Function<ResourceLocation, T> var6 = var1x -> this.field45705.apply(var1x).orElse(null);

      while (!var1.isEmpty()) {
         boolean var7 = false;
         Iterator var8 = var1.entrySet().iterator();

         while (var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            Optional var10 = ((Class6879)var9.getValue()).method20947(var5, var6);
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
         (var3, var4x) -> field45702.error(
               "Couldn't load {} tag {} as it is missing following references: {}",
               this.field45707,
               var3,
               var4x.method20949(var5, var6).<CharSequence>map(Objects::toString).collect(Collectors.joining(","))
            )
      );
      return ITagCollection.<T>method27142(var4);
   }
}
