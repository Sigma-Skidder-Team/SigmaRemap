package mapped;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1770 implements Class1768 {
   private static final Logger field9586 = LogManager.getLogger();
   private final IResourceManager field9587;
   private final byte[] field9588;
   private final String field9589;
   private final Map<ResourceLocation, NativeImage> field9590 = Maps.newHashMap();

   public Class1770(IResourceManager var1, byte[] var2, String var3) {
      this.field9587 = var1;
      this.field9588 = var2;
      this.field9589 = var3;

      for (int var6 = 0; var6 < 256; var6++) {
         int var7 = var6 * 256;
         ResourceLocation var8 = this.method7743(var7);

         try (
                 JSonShader var9 = this.field9587.getShader(var8);
                 NativeImage var11 = NativeImage.method7880(NativeImage.PixelFormat.field14626, var9.getFile());
         ) {
            if (var11.method7886() == 256 && var11.method7887() == 256) {
               for (int var13 = 0; var13 < 256; var13++) {
                  byte var14 = var2[var7 + var13];
                  if (var14 != 0 && method7745(var14) > method7746(var14)) {
                     var2[var7 + var13] = 0;
                  }
               }
               continue;
            }
         } catch (IOException var45) {
         }

         Arrays.fill(var2, var7, var7 + 256, (byte)0);
      }
   }

   @Override
   public void close() {
      this.field9590.values().forEach(NativeImage::close);
   }

   private ResourceLocation method7743(int var1) {
      ResourceLocation var4 = new ResourceLocation(String.format(this.field9589, String.format("%02x", var1 / 256)));
      return new ResourceLocation(var4.getNamespace(), "textures/" + var4.getPath());
   }

   @Nullable
   @Override
   public Class2051 method7734(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         byte var4 = this.field9588[var1];
         if (var4 != 0) {
            NativeImage var5 = this.field9590.computeIfAbsent(this.method7743(var1), this::method7744);
            if (var5 != null) {
               int var6 = method7745(var4);
               return new Class2057(var1 % 16 * 16 + var6, (var1 & 0xFF) / 16 * 16, method7746(var4) - var6, 16, var5);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public IntSet method7735() {
      IntOpenHashSet var3 = new IntOpenHashSet();

      for (int var4 = 0; var4 < 65535; var4++) {
         if (this.field9588[var4] != 0) {
            var3.add(var4);
         }
      }

      return var3;
   }

   @Nullable
   private NativeImage method7744(ResourceLocation var1) {
      try (JSonShader var4 = this.field9587.getShader(var1)) {
         return NativeImage.method7880(NativeImage.PixelFormat.field14626, var4.getFile());
      } catch (IOException var18) {
         field9586.error("Couldn't load texture {}", var1, var18);
         return null;
      }
   }

   private static int method7745(byte var0) {
      return var0 >> 4 & 15;
   }

   private static int method7746(byte var0) {
      return (var0 & 15) + 1;
   }

   // $VF: synthetic method
   public static Logger method7747() {
      return field9586;
   }
}
