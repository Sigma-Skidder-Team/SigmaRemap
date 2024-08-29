package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Class7832 {
   private static final float field33623 = 1.0E-6F;
   private static final Random field33624 = new Random(0L);

   public static IBakedModel method26230(String var0, int var1) {
      TextureAtlasSprite var4 = Class7944.method26969().method1106(var0);
      return method26231(var4, var1);
   }

   public static IBakedModel method26231(TextureAtlasSprite var0, int var1) {
      ArrayList var4 = new ArrayList();
      Direction[] var5 = Direction.field685;
      HashMap var6 = new HashMap();

      for (int var7 = 0; var7 < var5.length; var7++) {
         Direction var8 = var5[var7];
         ArrayList var9 = new ArrayList();
         var9.add(method26233(var8, var0, var1));
         var6.put(var8, var9);
      }

      Class6391 var10 = Class6391.field27973;
      return new Class7206(var4, var6, true, true, true, var0, Class9264.field42603, var10);
   }

   public static IBakedModel method26232(IBakedModel var0, IBakedModel var1) {
      ArrayList var4 = new ArrayList();
      var4.addAll(var0.method22619((BlockState)null, (Direction)null, field33624));
      var4.addAll(var1.method22619((BlockState)null, (Direction)null, field33624));
      Direction[] var5 = Direction.field685;
      HashMap var6 = new HashMap();

      for (int var7 = 0; var7 < var5.length; var7++) {
         Direction var8 = var5[var7];
         ArrayList var9 = new ArrayList();
         var9.addAll(var0.method22619((BlockState)null, var8, field33624));
         var9.addAll(var1.method22619((BlockState)null, var8, field33624));
         var6.put(var8, var9);
      }

      boolean var13 = var0.method22620();
      boolean var14 = var0.method22623();
      TextureAtlasSprite var15 = var0.getParticleTexture();
      Class9264 var10 = var0.method22625();
      Class6391 var11 = var0.method22626();
      return new Class7206(var4, var6, var13, var14, true, var15, var10, var11);
   }

   public static Class8557 method26233(Direction var0, TextureAtlasSprite var1, int var2) {
      Class7680 var5 = new Class7680(0.0F, 0.0F, 0.0F);
      Class7680 var6 = new Class7680(16.0F, 16.0F, 16.0F);
      Class9840 var7 = new Class9840(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Class9163 var8 = new Class9163(var0, var2, "#" + var0.method257(), var7);
      Class1901 var9 = Class1901.field11159;
      Object var10 = null;
      boolean var11 = true;
      ResourceLocation var12 = var1.method7465();
      Class9155 var13 = new Class9155();
      return var13.method34175(var5, var6, var8, var1, var0, var9, (Class7360)var10, var11, var12);
   }

   public static IBakedModel method26234(String var0, String var1, String var2) {
      AtlasTexture var5 = Class7944.method26969();
      TextureAtlasSprite var6 = var5.method1106(var1);
      TextureAtlasSprite var7 = var5.method1106(var2);
      return method26235(var0, var6, var7);
   }

   public static IBakedModel method26235(String var0, TextureAtlasSprite var1, TextureAtlasSprite var2) {
      if (var1 != null && var2 != null) {
         ModelManager var5 = Class7944.method26825();
         if (var5 == null) {
            return null;
         } else {
            Class1997 var6 = new Class1997(var0, "");
            IBakedModel var7 = var5.method1023(var6);
            if (var7 != null && var7 != var5.getMissingModel()) {
               IBakedModel var8 = Class9842.method38900(var7);
               Direction[] var9 = Direction.field685;

               for (int var10 = 0; var10 < var9.length; var10++) {
                  Direction var11 = var9[var10];
                  List var12 = var8.method22619((BlockState)null, var11, field33624);
                  method26236(var12, var1, var2);
               }

               List var13 = var8.method22619((BlockState)null, (Direction)null, field33624);
               method26236(var13, var1, var2);
               return var8;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static void method26236(List<Class8557> var0, TextureAtlasSprite var1, TextureAtlasSprite var2) {
      ArrayList var5 = new ArrayList();

      for (Object var7 : var0) {
         if (((Class8557)var7).method30516() == var1) {
            var7 = new Class8558((Class8557)var7, var2);
         }

         var5.add(var7);
      }

      var0.clear();
      var0.addAll(var5);
   }

   public static void method26237(Class7680 var0) {
      var0.method25275(method26238(var0.method25269()), method26238(var0.method25270()), method26238(var0.method25271()));
   }

   private static float method26238(float var0) {
      if (var0 > -1.0E-6F && var0 < 1.0E-6F) {
         return 0.0F;
      } else {
         return var0 > 0.999999F && var0 < 1.000001F ? 1.0F : var0;
      }
   }

   public static Class6488 method26239(Class6488 var0, Class2260 var1, BlockPos var2) {
      int var5 = var2.getX();
      int var6 = var2.getZ();
      long var7 = (long)(var5 * 3129871) ^ (long)var6 * 116129781L;
      var7 = var7 * var7 * 42317861L + var7 * 11L;
      double var9 = ((double)((float)(var7 >> 16 & 15L) / 15.0F) - 0.5) * 0.5;
      double var11 = ((double)((float)(var7 >> 24 & 15L) / 15.0F) - 0.5) * 0.5;
      double var13 = 0.0;
      if (var1 == Class2260.field14704) {
         var13 = ((double)((float)(var7 >> 20 & 15L) / 15.0F) - 1.0) * 0.2;
      }

      return var0.method19667(var9, var13, var11);
   }
}
