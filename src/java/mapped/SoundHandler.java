package mapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.minecraft.client.GameSettings;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public class SoundHandler extends Class269<Class8657> {
   public static final Class6647 field1051 = new Class6647("meta:missing_sound", 1.0F, 1.0F, 1, Class2221.field14506, false, false, 16);
   private static final Logger field1052 = LogManager.getLogger();
   private static final Gson field1053 = new GsonBuilder()
      .registerTypeHierarchyAdapter(ITextComponent.class, new ITextComponent.Serializer())
      .registerTypeAdapter(Class9304.class, new Class2569())
      .create();
   private static final TypeToken<Map<String, Class9304>> field1054 = new Class5799();
   private final Map<ResourceLocation, Class6648> field1055 = Maps.newHashMap();
   private final Class4386 field1056;

   public SoundHandler(IResourceManager var1, GameSettings var2) {
      this.field1056 = new Class4386(this, var2, var1);
   }

   public Class8657 method970(IResourceManager var1, IProfiler var2) {
      Class8657 var5 = new Class8657();
      var2.startTick();

      for (String var7 : var1.getResourceNamespaces()) {
         var2.startSection(var7);

         try {
            for (IResource var9 : var1.getAllResources(new ResourceLocation(var7, "sounds.json"))) {
               var2.startSection(var9.getPackName());

               try (
                       InputStream var10 = var9.getInputStream();
                       InputStreamReader var12 = new InputStreamReader(var10, StandardCharsets.UTF_8);
               ) {
                  var2.startSection("parse");
                  Map<String, Class9304> var14 = JSONUtils.method32794(field1053, var12, field1054);
                  var2.endStartSection("register");

                  for (Entry<String, Class9304> var16 : var14.entrySet()) {
                     Class8657.method31157(var5, new ResourceLocation(var7, var16.getKey()), var16.getValue(), var1);
                  }

                  var2.endSection();
               } catch (RuntimeException var46) {
                  field1052.warn("Invalid sounds.json in resourcepack: '{}'", var9.getPackName(), var46);
               }

               var2.endSection();
            }
         } catch (IOException var47) {
         }

         var2.endSection();
      }

      var2.endTick();
      return var5;
   }

   public void method971(Class8657 var1, IResourceManager var2, IProfiler var3) {
      var1.method31156(this.field1055, this.field1056);

      for (ResourceLocation var7 : this.field1055.keySet()) {
         Class6648 var8 = this.field1055.get(var7);
         if (var8.method20300() instanceof TranslationTextComponent) {
            String var9 = ((TranslationTextComponent)var8.method20300()).getKey();
            if (! I18n.method33884(var9)) {
               field1052.debug("Missing subtitle {} for event: {}", var9, var7);
            }
         }
      }

      if (field1052.isDebugEnabled()) {
         for (ResourceLocation var11 : this.field1055.keySet()) {
            if (!Registry.SOUND_EVENT.method9193(var11)) {
               field1052.debug("Not having sound event for: {}", var11);
            }
         }
      }

      this.field1056.method13755();
   }

   private static boolean method996(Class6647 var0, ResourceLocation var1, IResourceManager var2) {
      ResourceLocation var5 = var0.method20292();
      if (var2.hasResource(var5)) {
         return true;
      } else {
         field1052.warn("File {} does not exist, cannot add it to event {}", var5, var1);
         return false;
      }
   }

   @Nullable
   public Class6648 method997(ResourceLocation var1) {
      return this.field1055.get(var1);
   }

   public Collection<ResourceLocation> method998() {
      return this.field1055.keySet();
   }

   public void method999(Class6341 var1) {
      this.field1056.method13771(var1);
   }

   public void method1000(Class6340 var1) {
      this.field1056.method13770(var1);
   }

   public void method1001(Class6340 var1, int var2) {
      this.field1056.method13777(var1, var2);
   }

   public void updateListener(ActiveRenderInfo var1) {
      this.field1056.method13778(var1);
   }

   public void pause() {
      this.field1056.method13775();
   }

   public void stop() {
      this.field1056.method13761();
   }

   public void unloadSounds() {
      this.field1056.method13759();
   }

   public void tick(boolean var1) {
      this.field1056.method13764(var1);
   }

   public void resume() {
      this.field1056.method13776();
   }

   public void method1008(SoundCategory var1, float var2) {
      if (var1 == SoundCategory.field14728 && var2 <= 0.0F) {
         this.stop();
      }

      this.field1056.method13758(var1, var2);
   }

   public void method1009(Class6340 var1) {
      this.field1056.method13760(var1);
   }

   public boolean method1010(Class6340 var1) {
      return this.field1056.method13769(var1);
   }

   public void method1011(Class1270 var1) {
      this.field1056.method13762(var1);
   }

   public void method1012(Class1270 var1) {
      this.field1056.method13763(var1);
   }

   public void method1013(ResourceLocation var1, SoundCategory var2) {
      this.field1056.method13779(var1, var2);
   }

   public String method1014() {
      return this.field1056.method13780();
   }

   // $VF: synthetic method
   public static Logger method1015() {
      return field1052;
   }

   // $VF: synthetic method
   public static boolean method1016(Class6647 var0, ResourceLocation var1, IResourceManager var2) {
      return method996(var0, var1, var2);
   }
}
