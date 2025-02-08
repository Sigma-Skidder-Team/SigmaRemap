package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import net.minecraft.command.CommandSource;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITagCollection;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;

public class Class301 implements IFutureReloadListener {
   private static final Logger field1159 = LogManager.getLogger();
   private static final int field1160 = "functions/".length();
   private static final int field1161 = ".mcfunction".length();
   private volatile Map<ResourceLocation, Class7744> field1162 = ImmutableMap.of();
   private final Class9768<Class7744> field1163 = new Class9768<Class7744>(this::method1177, "tags/functions", "function");
   private volatile ITagCollection<Class7744> field1164 = ITagCollection.<Class7744>getEmptyTagCollection();
   private final int field1165;
   private final CommandDispatcher<CommandSource> field1166;

   public Optional<Class7744> method1177(ResourceLocation var1) {
      return Optional.<Class7744>ofNullable(this.field1162.get(var1));
   }

   public Map<ResourceLocation, Class7744> method1178() {
      return this.field1162;
   }

   public ITagCollection<Class7744> method1179() {
      return this.field1164;
   }

   public ITag<Class7744> method1180(ResourceLocation var1) {
      return this.field1164.method27132(var1);
   }

   public Class301(int var1, CommandDispatcher<CommandSource> var2) {
      this.field1165 = var1;
      this.field1166 = var2;
   }

   @Override
   public CompletableFuture<Void> reload(IStage var1, IResourceManager var2, IProfiler var3, IProfiler var4, Executor var5, Executor var6) {
      CompletableFuture<Map<ResourceLocation, Class6879>> var9 = this.field1163.method38419(var2, var5);
      CompletableFuture<Map> var10 = CompletableFuture.supplyAsync(
            () -> var2.getAllResourceLocations("functions", var0x -> var0x.endsWith(".mcfunction")), var5
         )
         .thenCompose(
            var3x -> {
               Map<ResourceLocation, CompletableFuture<Class7744>> var6x = Maps.newHashMap();
               CommandSource var7 = new CommandSource(
                  ICommandSource.field5189,
                  Vector3d.ZERO,
                  Vector2f.ZERO,
                       null,
                  this.field1165,
                  "",
                  StringTextComponent.EMPTY,
                       null,
                       null
               );

               for (ResourceLocation var9x : var3x) {
                  String var10x = var9x.getPath();
                  ResourceLocation var11 = new ResourceLocation(var9x.getNamespace(), var10x.substring(field1160, var10x.length() - field1161));
                  var6x.put(var11, CompletableFuture.supplyAsync(() -> {
                     List var7x = method1181(var2, var9x);
                     return Class7744.method25654(var11, this.field1166, var7, var7x);
                  }, var5));
               }

               CompletableFuture[] var12 = var6x.values().toArray(new CompletableFuture[0]);
               return CompletableFuture.allOf(var12).handle((var1xx, var2xx) -> var6x);
            }
         );
      return var9.thenCombine(var10, Pair::of).thenCompose(var1::markCompleteAwaitingOthers).thenAcceptAsync(var1x -> {
         Map<ResourceLocation, CompletableFuture<Class7744>> var4x = var1x.getSecond();
         Builder<ResourceLocation,  Class7744> var5x = ImmutableMap.builder();
         var4x.forEach((var1xx, var2x) -> var2x.handle((var2xx, var3x) -> {
               if (var3x == null) {
                  var5x.put(var1xx, var2xx);
               } else {
                  field1159.error("Failed to load function {}", var1xx, var3x);
               }

               return null;
            }).join());
         this.field1162 = var5x.build();
         this.field1164 = this.field1163.method38420((Map<ResourceLocation, Class6879>)var1x.getFirst());
      }, var6);
   }

   private static List<String> method1181(IResourceManager var0, ResourceLocation var1) {
      try (IResource var4 = var0.getResource(var1)) {
         return IOUtils.readLines(var4.getInputStream(), StandardCharsets.UTF_8);
      } catch (IOException var18) {
         throw new CompletionException(var18);
      }
   }
}
