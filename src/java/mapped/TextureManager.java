package mapped;

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

import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextureManager implements Class268, Class288, AutoCloseable {
   private static final Logger field1093 = LogManager.getLogger();
   public static final ResourceLocation field1094 = new ResourceLocation("");
   private final Map<ResourceLocation, Class290> field1095 = Maps.newHashMap();
   private final Set<Class288> field1096 = Sets.newHashSet();
   private final Map<String, Integer> field1097 = Maps.newHashMap();
   private final IResourceManager field1098;
   private Class290 field1099;
   private ResourceLocation field1100;

   public TextureManager(IResourceManager var1) {
      this.field1098 = var1;
   }

   public void bindTexture(ResourceLocation var1) {
      if (RenderSystem.isOnRenderThread()) {
         this.method1072(var1);
      } else {
         RenderSystem.method27810(() -> this.method1072(var1));
      }
   }

   private void method1072(ResourceLocation var1) {
      if (Class7944.method26974()) {
         var1 = Class7050.method21963(var1);
      }

      Object var4 = this.field1095.get(var1);
      if (var4 == null) {
         var4 = new Class293(var1);
         this.method1073(var1, (Class290)var4);
      }

      if (!Class7944.method26921()) {
         ((Class290)var4).method1133();
      } else {
         Class9336.method35315((Class290)var4);
      }

      this.field1099 = (Class290)var4;
      this.field1100 = var1;
   }

   public void method1073(ResourceLocation var1, Class290 var2) {
      var2 = this.method1075(var1, var2);
      Class290 var5 = this.field1095.put(var1, var2);
      if (var5 != var2) {
         if (var5 != null && var5 != Class1714.method7515()) {
            this.field1096.remove(var5);
            this.method1074(var1, var5);
         }

         if (var2 instanceof Class288) {
            this.field1096.add((Class288)var2);
         }
      }
   }

   private void method1074(ResourceLocation var1, Class290 var2) {
      if (var2 != Class1714.method7515()) {
         try {
            var2.close();
         } catch (Exception var6) {
            field1093.warn("Failed to close texture {}", var1, var6);
         }
      }

      var2.method1132();
   }

   private Class290 method1075(ResourceLocation var1, Class290 var2) {
      try {
         var2.method1090(this.field1098);
         return var2;
      } catch (IOException var8) {
         if (var1 != field1094) {
            field1093.warn("Failed to load texture: {}", var1, var8);
         }

         return Class1714.method7515();
      } catch (Throwable var9) {
         CrashReport var6 = CrashReport.makeCrashReport(var9, "Registering texture");
         CrashReportCategory var7 = var6.makeCategory("Resource location being registered");
         var7.addDetail("Resource location", var1);
         var7.addDetail("Texture object class", () -> var2.getClass().getName());
         throw new ReportedException(var6);
      }
   }

   @Nullable
   public Class290 getTexture(ResourceLocation var1) {
      return this.field1095.get(var1);
   }

   public ResourceLocation method1077(String var1, Class291 var2) {
      Integer var5 = this.field1097.get(var1);
      if (var5 != null) {
         var5 = var5 + 1;
      } else {
         var5 = 1;
      }

      this.field1097.put(var1, var5);
      ResourceLocation var6 = new ResourceLocation(String.format("dynamic/%s_%d", var1, var5));
      this.method1073(var6, var2);
      return var6;
   }

   public CompletableFuture<Void> method1078(ResourceLocation var1, Executor var2) {
      if (this.field1095.containsKey(var1)) {
         return CompletableFuture.<Void>completedFuture((Void)null);
      } else {
         Class295 var5 = new Class295(this.field1098, var1, var2);
         this.field1095.put(var1, var5);
         return var5.method1165().thenRunAsync(() -> this.method1073(var1, var5), TextureManager::method1079);
      }
   }

   private static void method1079(Runnable var0) {
      Minecraft.getInstance().execute(() -> RenderSystem.method27810(var0::run));
   }

   @Override
   public void tick() {
      for (Class288 var4 : this.field1096) {
         var4.tick();
      }
   }

   public void method1081(ResourceLocation var1) {
      Class290 var4 = this.getTexture(var1);
      if (var4 != null) {
         this.field1095.remove(var1);
         Class8535.method30367(var4.getGlTextureId());
      }
   }

   @Override
   public void close() {
      this.field1095.forEach(this::method1074);
      this.field1095.clear();
      this.field1096.clear();
      this.field1097.clear();
   }

   @Override
   public CompletableFuture<Void> method777(Class7121 var1, IResourceManager var2, IProfiler var3, IProfiler var4, Executor var5, Executor var6) {
      Class7944.method26810("*** Reloading textures ***");
      Class7944.method26815("Resource packs: " + Class7944.method26870());
      Iterator var9 = this.field1095.keySet().iterator();

      while (var9.hasNext()) {
         ResourceLocation var10 = (ResourceLocation)var9.next();
         String var11 = var10.getPath();
         if (var11.startsWith("optifine/") || Class8564.method30606(var10)) {
            Class290 var12 = this.field1095.get(var10);
            if (var12 instanceof Class290) {
               var12.method1132();
            }

            var9.remove();
         }
      }

      Class8564.method30599();
      return CompletableFuture.allOf(MainMenuScreen.method2595(this, var5), this.method1078(Widget.field6474, var5))
         .<Void>thenCompose(var1::method22225)
         .thenAcceptAsync(var3x -> {
            Class1714.method7515();
            RealmsMainScreen.method2061(this.field1098);
            HashSet var6x = new HashSet<Entry<ResourceLocation, Class290>>(this.field1095.entrySet());
            Iterator var7 = var6x.iterator();

            while (var7.hasNext()) {
               Entry var8 = (Entry)var7.next();
               ResourceLocation var9x = (ResourceLocation)var8.getKey();
               Class290 var10x = (Class290)var8.getValue();
               if (var10x == Class1714.method7515() && !var9x.equals(Class1714.method7513())) {
                  var7.remove();
               } else {
                  var10x.method1134(this, var2, var9x, var6);
               }
            }
         }, var0 -> RenderSystem.method27810(var0::run));
   }

   public Class290 method1082() {
      return this.field1099;
   }

   public ResourceLocation method1083() {
      return this.field1100;
   }
}
