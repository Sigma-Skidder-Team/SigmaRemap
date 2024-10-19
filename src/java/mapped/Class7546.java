package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.annotation.Nullable;

public class Class7546 implements Class7544 {
   private ResourceLocation field32365;
   private final List<int[]> field32366;
   private final int field32367;
   private final int field32368;

   public Class7546(ResourceLocation var1, int var2, int var3, List<int[]> var4) {
      this.field32365 = new ResourceLocation(var1.getNamespace(), "textures/" + var1.getPath());
      this.field32365 = Class8259.method28795(this.field32365);
      this.field32366 = var4;
      this.field32367 = var2;
      this.field32368 = var3;
   }

   public static Class7546 method24666(JsonObject var0) {
      int var3 = JSONUtils.getInt(var0, "height", 8);
      int var4 = JSONUtils.method32777(var0, "ascent");
      if (var4 <= var3) {
         ArrayList var5 = Lists.newArrayList();
         JsonArray var6 = JSONUtils.method32785(var0, "chars");

         for (int var7 = 0; var7 < var6.size(); var7++) {
            String var8 = JSONUtils.method32762(var6.get(var7), "chars[" + var7 + "]");
            int[] var9 = var8.codePoints().toArray();
            if (var7 > 0) {
               int var10 = ((int[])var5.get(0)).length;
               if (var9.length != var10) {
                  throw new JsonParseException(
                     "Elements of chars have to be the same length (found: " + var9.length + ", expected: " + var10 + "), pad with space or \\u0000"
                  );
               }
            }

            var5.add(var9);
         }

         if (!var5.isEmpty() && ((int[])var5.get(0)).length != 0) {
            return new Class7546(new ResourceLocation(JSONUtils.getString(var0, "file")), var3, var4, var5);
         } else {
            throw new JsonParseException("Expected to find data in chars, found none.");
         }
      } else {
         throw new JsonParseException("Ascent " + var4 + " higher than height " + var3);
      }
   }

   @Nullable
   @Override
   public Class1768 method24664(IResourceManager var1) {
      try (JSonShader var4 = var1.getShader(this.field32365)) {
         NativeImage var6 = NativeImage.method7880(NativeImage.PixelFormat.field14626, var4.getFile());
         int var7 = var6.method7886();
         int var8 = var6.method7887();
         int var9 = var7 / this.field32366.get(0).length;
         int var10 = var8 / this.field32366.size();
         float var11 = (float)this.field32367 / (float)var10;
         Int2ObjectOpenHashMap var12 = new Int2ObjectOpenHashMap();
         Properties var13 = Class8259.method28791(this.field32365);
         Int2ObjectMap var14 = Class8259.method28792(var13);
         Float var15 = (Float)var14.get(32);
         boolean var16 = Class8259.method28794(var13, "blend", false);
         float var17 = Class8259.method28793(var13, "offsetBold", -1.0F);
         if (var17 < 0.0F) {
            var17 = var9 > 8 ? 0.5F : 1.0F;
         }

         for (int var18 = 0; var18 < this.field32366.size(); var18++) {
            int var19 = 0;

            for (int var23 : this.field32366.get(var18)) {
               int var24 = var19++;
               if (var23 != 0 && var23 != 32) {
                  float var25 = (float)this.method24667(var6, var9, var10, var24, var18);
                  Float var26 = (Float)var14.get(var23);
                  if (var26 != null) {
                     var25 = var26 * ((float)var9 / 8.0F);
                  }

                  Class2055 var27 = (Class2055)var12.put(
                     var23,
                     new Class2055(var11, var6, var24 * var9, var18 * var10, var9, var10, (int)(0.5 + (double)(var25 * var11)) + 1, this.field32368)
                  );
                  if (var27 != null) {
                     Class1771.method7750().warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString(var23), this.field32365);
                  }

                  Class2055 var28 = (Class2055)var12.get(var23);
                  Class2055.method8704(var28, var17);
               }
            }
         }

         Class1771 var40 = new Class1771(var6, var12);
         Class1771.method7751(var40, var16);
         if (var15 != null) {
            Class1771.method7752(var40, var15);
         }

         return var40;
      } catch (IOException var39) {
         throw new RuntimeException(var39.getMessage());
      }
   }

   private int method24667(NativeImage var1, int var2, int var3, int var4, int var5) {
      int var8;
      for (var8 = var2 - 1; var8 >= 0; var8--) {
         int var9 = var4 * var2 + var8;

         for (int var10 = 0; var10 < var3; var10++) {
            int var11 = var5 * var3 + var10;
            if ((var1.method7891(var9, var11) & 255) > 16) {
               return var8 + 1;
            }
         }
      }

      return var8 + 1;
   }
}
