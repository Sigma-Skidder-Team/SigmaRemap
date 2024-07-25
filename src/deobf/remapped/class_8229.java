package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8229 implements class_2231 {
   private static final Logger field_42251 = LogManager.getLogger();
   private static final int field_42252 = "functions/".length();
   private static final int field_42253 = field_42254[5].length();
   private volatile Map<class_4639, class_2581> field_42250 = ImmutableMap.of();
   private final class_9639<class_2581> field_42249 = new class_9639<class_2581>(this::method_37679, "tags/functions", "function");
   private volatile class_9349<class_2581> field_42255 = class_9349.<class_2581>method_43146();
   private final int field_42257;
   private final CommandDispatcher<class_9155> field_42256;

   public Optional<class_2581> method_37679(class_4639 var1) {
      return Optional.<class_2581>ofNullable(this.field_42250.get(var1));
   }

   public Map<class_4639, class_2581> method_37681() {
      return this.field_42250;
   }

   public class_9349<class_2581> method_37682() {
      return this.field_42255;
   }

   public class_2307<class_2581> method_37680(class_4639 var1) {
      return this.field_42255.method_43145(var1);
   }

   public class_8229(int var1, CommandDispatcher<class_9155> var2) {
      this.field_42257 = var1;
      this.field_42256 = var2;
   }

   @Override
   public CompletableFuture<Void> method_10277(class_6895 var1, class_7832 var2, class_3492 var3, class_3492 var4, Executor var5, Executor var6) {
      CompletableFuture var9 = this.field_42249.method_44502(var2, var5);
      CompletableFuture var10 = CompletableFuture.<Collection<class_4639>>supplyAsync(
            () -> var2.method_35460("functions", var0x -> var0x.endsWith(".mcfunction")), var5
         )
         .<Map>thenCompose(
            var3x -> {
               HashMap var6x = Maps.newHashMap();
               class_9155 var7 = new class_9155(
                  class_5801.field_29295,
                  class_1343.field_7335,
                  class_4895.field_24322,
                  (class_6331)null,
                  this.field_42257,
                  "",
                  StringTextComponent.EMPTY,
                  (class_341)null,
                  (class_8145)null
               );

               for (class_4639 var9x : var3x) {
                  String var10x = var9x.method_21456();
                  class_4639 var11 = new class_4639(var9x.method_21461(), var10x.substring(field_42252, var10x.length() - field_42253));
                  var6x.put(var11, CompletableFuture.<class_2581>supplyAsync(() -> {
                     List var7x = method_37678(var2, var9x);
                     return class_2581.method_11750(var11, this.field_42256, var7, var7x);
                  }, var5));
               }

               CompletableFuture[] var12 = var6x.values().<CompletableFuture>toArray(new CompletableFuture[0]);
               return CompletableFuture.allOf(var12).<Map>handle((var1xx, var2xx) -> var6x);
            }
         );
      return var9.thenCombine(var10, Pair::of).<Pair>thenCompose(var1::method_31587).thenAcceptAsync(var1x -> {
         Map var4x = (Map)var1x.getSecond();
         Builder var5x = ImmutableMap.builder();
         var4x.forEach((var1xx, var2x) -> var2x.handle((var2xx, var3x) -> {
               if (var3x == null) {
                  var5x.put(var1xx, var2xx);
               } else {
                  field_42251.error("Failed to load function {}", var1xx, var3x);
               }

               return null;
            }).join());
         this.field_42250 = var5x.build();
         this.field_42255 = this.field_42249.method_44503((Map<class_4639, class_1079>)var1x.getFirst());
      }, var6);
   }

   private static List<String> method_37678(class_7832 var0, class_4639 var1) {
      try (class_4038 var4 = var0.method_35458(var1)) {
         return IOUtils.readLines(var4.method_18576(), StandardCharsets.UTF_8);
      } catch (IOException var18) {
         throw new CompletionException(var18);
      }
   }
}
