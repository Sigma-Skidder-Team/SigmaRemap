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

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.CustomGuis;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextureManager implements IFutureReloadListener, Class288, AutoCloseable {
   private static final Logger field1093 = LogManager.getLogger();
   public static final ResourceLocation RESOURCE_LOCATION_EMPTY = new ResourceLocation("");
   private final Map<ResourceLocation, Texture> field1095 = Maps.newHashMap();
   private final Set<Class288> field1096 = Sets.newHashSet();
   private final Map<String, Integer> field1097 = Maps.newHashMap();
   private final IResourceManager field1098;
   private Texture field1099;
   private ResourceLocation field1100;

   public TextureManager(IResourceManager var1) {
      this.field1098 = var1;
   }

   public void bindTexture(ResourceLocation var1) {
      if (RenderSystem.isOnRenderThread()) {
         this.method1072(var1);
      } else {
         RenderSystem.recordRenderCall(() -> this.method1072(var1));
      }
   }

   private void method1072(ResourceLocation var1) {
      if (Config.method26974()) {
         var1 = CustomGuis.method21963(var1);
      }

      Object var4 = this.field1095.get(var1);
      if (var4 == null) {
         var4 = new Class293(var1);
         this.loadTexture(var1, (Texture)var4);
      }

      if (!Config.isShaders()) {
         ((Texture)var4).method1133();
      } else {
         Class9336.method35315((Texture)var4);
      }

      this.field1099 = (Texture)var4;
      this.field1100 = var1;
   }

   public void loadTexture(ResourceLocation var1, Texture var2) {
      var2 = this.method1075(var1, var2);
      Texture var5 = this.field1095.put(var1, var2);
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

   private void method1074(ResourceLocation var1, Texture var2) {
      if (var2 != Class1714.method7515()) {
         try {
            var2.close();
         } catch (Exception var6) {
            field1093.warn("Failed to close texture {}", var1, var6);
         }
      }

      var2.method1132();
   }

   private Texture method1075(ResourceLocation var1, Texture var2) {
      try {
         var2.method1090(this.field1098);
         return var2;
      } catch (IOException var8) {
         if (var1 != RESOURCE_LOCATION_EMPTY) {
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
   public Texture getTexture(ResourceLocation var1) {
      return this.field1095.get(var1);
   }

   public ResourceLocation method1077(String var1, DynamicTexture var2) {
      Integer var5 = this.field1097.get(var1);
      if (var5 != null) {
         var5 = var5 + 1;
      } else {
         var5 = 1;
      }

      this.field1097.put(var1, var5);
      ResourceLocation var6 = new ResourceLocation(String.format("dynamic/%s_%d", var1, var5));
      this.loadTexture(var6, var2);
      return var6;
   }

   public CompletableFuture<Void> method1078(ResourceLocation var1, Executor var2) {
      if (this.field1095.containsKey(var1)) {
         return CompletableFuture.<Void>completedFuture((Void)null);
      } else {
         Class295 var5 = new Class295(this.field1098, var1, var2);
         this.field1095.put(var1, var5);
         return var5.method1165().thenRunAsync(() -> this.loadTexture(var1, var5), TextureManager::method1079);
      }
   }

   private static void method1079(Runnable var0) {
      Minecraft.getInstance().execute(() -> RenderSystem.recordRenderCall(var0::run));
   }

   @Override
   public void tick() {
      for (Class288 var4 : this.field1096) {
         var4.tick();
      }
   }

   public void method1081(ResourceLocation var1) {
      Texture var4 = this.getTexture(var1);
      if (var4 != null) {
         this.field1095.remove(var1);
         TextureUtil.releaseTextureId(var4.getGlTextureId());
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
   public CompletableFuture<Void> reload(IStage var1, IResourceManager var2, IProfiler var3, IProfiler var4, Executor var5, Executor var6) {
      Config.method26810("*** Reloading textures ***");
      Config.method26815("Resource packs: " + Config.method26870());
      Iterator var9 = this.field1095.keySet().iterator();

      while (var9.hasNext()) {
         ResourceLocation var10 = (ResourceLocation)var9.next();
         String var11 = var10.getPath();
         if (var11.startsWith("optifine/") || EmissiveTextures.method30606(var10)) {
            Texture var12 = this.field1095.get(var10);
            if (var12 instanceof Texture) {
               var12.method1132();
            }

            var9.remove();
         }
      }

      EmissiveTextures.method30599();
      return CompletableFuture.allOf(VanillaMainMenuScreen.method2595(this, var5), this.method1078(Widget.WIDGETS_LOCATION, var5))
         .<Void>thenCompose(var1::markCompleteAwaitingOthers)
         .thenAcceptAsync(var3x -> {
            Class1714.method7515();
            RealmsMainScreen.method2061(this.field1098);
            HashSet var6x = new HashSet<Entry<ResourceLocation, Texture>>(this.field1095.entrySet());
            Iterator var7 = var6x.iterator();

            while (var7.hasNext()) {
               Entry var8 = (Entry)var7.next();
               ResourceLocation var9x = (ResourceLocation)var8.getKey();
               Texture var10x = (Texture)var8.getValue();
               if (var10x == Class1714.method7515() && !var9x.equals(Class1714.method7513())) {
                  var7.remove();
               } else {
                  var10x.method1134(this, var2, var9x, var6);
               }
            }
         }, var0 -> RenderSystem.recordRenderCall(var0::run));
   }

   public Texture method1082() {
      return this.field1099;
   }

   public ResourceLocation method1083() {
      return this.field1100;
   }
}
