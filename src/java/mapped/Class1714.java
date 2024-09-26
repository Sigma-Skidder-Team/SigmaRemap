package mapped;

import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

public final class Class1714 extends TextureAtlasSprite {
   private static final ResourceLocation field9360 = new ResourceLocation("missingno");
   private static DynamicTexture field9361;
   private static final LazyValue<Class1806> field9362 = new LazyValue<Class1806>(() -> {
      Class1806 var2 = new Class1806(16, 16, false);

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            if (!(var5 < 8 ^ var6 < 8)) {
               var2.method7890(var6, var5, -16777216);
            } else {
               var2.method7890(var6, var5, -524040);
            }
         }
      }

      var2.method7908();
      return var2;
   });
   private static final Class9431 field9325 = new Class9431(
      field9360, 16, 16, new Class7788(Lists.newArrayList(new Class9704[]{new Class9704(0, -1)}), 16, 16, 1, false)
   );

   public Class1714(AtlasTexture var1, Class9431 var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, var7, method7516(var2.method36196(), var2.method36197()));
   }

   private Class1714(AtlasTexture var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, field9325, var2, var3, var4, var5, var6, field9362.getValue());
   }

   public static Class1714 method7512(AtlasTexture var0, int var1, int var2, int var3, int var4, int var5) {
      return new Class1714(var0, var1, var2, var3, var4, var5);
   }

   public static ResourceLocation method7513() {
      return field9360;
   }

   public static Class9431 method7514() {
      return field9325;
   }

   @Override
   public void close() {
      super.close();
   }

   public static DynamicTexture method7515() {
      if (field9361 == null) {
         field9361 = new DynamicTexture(field9362.getValue());
         Minecraft.getInstance().getTextureManager().method1073(field9360, field9361);
      }

      return field9361;
   }

   private static Class1806 method7516(int var0, int var1) {
      int var4 = var0 / 2;
      int var5 = var1 / 2;
      Class1806 var6 = new Class1806(var0, var1, false);
      int var7 = -16777216;
      int var8 = -524040;

      for (int var9 = 0; var9 < var1; var9++) {
         for (int var10 = 0; var10 < var0; var10++) {
            if (!(var9 < var5 ^ var10 < var4)) {
               var6.method7890(var10, var9, var7);
            } else {
               var6.method7890(var10, var9, var8);
            }
         }
      }

      return var6;
   }
}
