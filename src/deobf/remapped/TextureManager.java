package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextureManager implements class_2231, class_72, AutoCloseable {
   private static final Logger field_40363 = LogManager.getLogger();
   public static final Identifier field_40364 = new Identifier("");
   private final Map<Identifier, class_8143> field_40366 = Maps.newHashMap();
   private final Set<class_72> field_40359 = Sets.newHashSet();
   private final Map<String, Integer> field_40360 = Maps.newHashMap();
   private final class_7832 field_40365;
   private class_8143 field_40362;
   private Identifier field_40361;

   public TextureManager(class_7832 var1) {
      this.field_40365 = var1;
   }

   public void bindTexture(Identifier var1) {
      if (RenderSystem.method_16366()) {
         this.method_35686(var1);
      } else {
         RenderSystem.method_16474(() -> this.method_35686(var1));
      }
   }

   private void method_35686(Identifier var1) {
      if (Config.method_14373()) {
         var1 = class_1322.method_6042(var1);
      }

      Object var4 = this.field_40366.get(var1);
      if (var4 == null) {
         var4 = new class_1809(var1);
         this.method_35682(var1, (class_8143)var4);
      }

      if (!Config.method_14424()) {
         ((class_8143)var4).method_37048();
      } else {
         class_7977.method_36161((class_8143)var4);
      }

      this.field_40362 = (class_8143)var4;
      this.field_40361 = var1;
   }

   public void method_35682(Identifier var1, class_8143 var2) {
      var2 = this.method_35685(var1, var2);
      class_8143 var5 = this.field_40366.put(var1, var2);
      if (var5 != var2) {
         if (var5 != null && var5 != class_2008.method_9325()) {
            this.field_40359.remove(var5);
            this.method_35680(var1, var5);
         }

         if (var2 instanceof class_72) {
            this.field_40359.add((class_72)var2);
         }
      }
   }

   private void method_35680(Identifier var1, class_8143 var2) {
      if (var2 != class_2008.method_9325()) {
         try {
            var2.close();
         } catch (Exception var6) {
            field_40363.warn("Failed to close texture {}", var1, var6);
         }
      }

      var2.method_37052();
   }

   private class_8143 method_35685(Identifier var1, class_8143 var2) {
      try {
         var2.method_37053(this.field_40365);
         return var2;
      } catch (IOException var8) {
         if (var1 != field_40364) {
            field_40363.warn("Failed to load texture: {}", var1, var8);
         }

         return class_2008.method_9325();
      } catch (Throwable var9) {
         class_159 var6 = class_159.method_643(var9, "Registering texture");
         class_6544 var7 = var6.method_639("Resource location being registered");
         var7.method_29850("Resource location", var1);
         var7.method_29851("Texture object class", () -> var2.getClass().getName());
         throw new class_3297(var6);
      }
   }

   @Nullable
   public class_8143 method_35679(Identifier var1) {
      return this.field_40366.get(var1);
   }

   public Identifier method_35684(String var1, class_7884 var2) {
      Integer var5 = this.field_40360.get(var1);
      if (var5 != null) {
         var5 = var5 + 1;
      } else {
         var5 = 1;
      }

      this.field_40360.put(var1, var5);
      Identifier var6 = new Identifier(String.format("dynamic/%s_%d", var1, var5));
      this.method_35682(var6, var2);
      return var6;
   }

   public CompletableFuture<Void> method_35676(Identifier var1, Executor var2) {
      if (this.field_40366.containsKey(var1)) {
         return CompletableFuture.<Void>completedFuture((Void)null);
      } else {
         class_3774 var5 = new class_3774(this.field_40365, var1, var2);
         this.field_40366.put(var1, var5);
         return var5.method_17467().thenRunAsync(() -> this.method_35682(var1, var5), TextureManager::method_35681);
      }
   }

   private static void method_35681(Runnable var0) {
      MinecraftClient.getInstance().execute(() -> RenderSystem.method_16474(var0::run));
   }

   @Override
   public void method_80() {
      for (class_72 var4 : this.field_40359) {
         var4.method_80();
      }
   }

   public void method_35678(Identifier var1) {
      class_8143 var4 = this.method_35679(var1);
      if (var4 != null) {
         this.field_40366.remove(var1);
         class_4970.method_22838(var4.method_37055());
      }
   }

   @Override
   public void close() {
      this.field_40366.forEach(this::method_35680);
      this.field_40366.clear();
      this.field_40359.clear();
      this.field_40360.clear();
   }

   @Override
   public CompletableFuture<Void> method_10277(class_6895 var1, class_7832 var2, class_3492 var3, class_3492 var4, Executor var5, Executor var6) {
      Config.method_14277("*** Reloading textures ***");
      Config.method_14280("Resource packs: " + Config.method_14384());
      Iterator var9 = this.field_40366.keySet().iterator();

      while (var9.hasNext()) {
         Identifier var10 = (Identifier)var9.next();
         String var11 = var10.method_21456();
         if (var11.startsWith("optifine/") || class_5052.method_23285(var10)) {
            class_8143 var12 = this.field_40366.get(var10);
            if (var12 instanceof class_8143) {
               var12.method_37052();
            }

            var9.remove();
         }
      }

      class_5052.method_23268();
      return CompletableFuture.allOf(class_1876.method_8397(this, var5), this.method_35676(class_7114.field_36678, var5))
         .<Void>thenCompose(var1::method_31587)
         .thenAcceptAsync(var3x -> {
            class_2008.method_9325();
            class_7039.method_32337(this.field_40365);
            HashSet var6x = new HashSet<Entry<Identifier, class_8143>>(this.field_40366.entrySet());
            Iterator var7 = var6x.iterator();

            while (var7.hasNext()) {
               Entry var8 = (Entry)var7.next();
               Identifier var9x = (Identifier)var8.getKey();
               class_8143 var10x = (class_8143)var8.getValue();
               if (var10x == class_2008.method_9325() && !var9x.equals(class_2008.method_9327())) {
                  var7.remove();
               } else {
                  var10x.method_37054(this, var2, var9x, var6);
               }
            }
         }, var0 -> RenderSystem.method_16474(var0::run));
   }

   public class_8143 method_35675() {
      return this.field_40362;
   }

   public Identifier method_35683() {
      return this.field_40361;
   }
}
