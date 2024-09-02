package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Properties;

public class Class7156 {
   private ResourceLocation field30738;
   private int field30739 = 0;
   private int field30740 = 2;
   private boolean field30741;
   private static final int field30742 = 2;
   private static final int field30743 = 0;
   private static final int field30744 = 1;
   private static final int field30745 = 2;

   public Class7156(ResourceLocation var1, int var2, int var3, boolean var4) {
      this.field30738 = var1;
      this.field30739 = var2;
      this.field30740 = var3;
      this.field30741 = var4;
   }

   public static Class7156 method22324(String var0, int var1, Properties var2) {
      ResourceLocation var5 = new ResourceLocation(var0);
      int var6 = method22326(method22325("scaleMode", var1, var2));
      int var7 = var6 != 0 ? 1 : 2;
      int var8 = method22327(method22325("scale", var1, var2), var7);
      boolean var9 = Class7944.method26901(method22325("center", var1, var2), false);
      return new Class7156(var5, var6, var8, var9);
   }

   private static String method22325(String var0, int var1, Properties var2) {
      if (var2 != null) {
         String var5 = var2.getProperty("dim" + var1 + "." + var0);
         return var5 == null ? var2.getProperty(var0) : var5;
      } else {
         return null;
      }
   }

   private static int method22326(String var0) {
      if (var0 != null) {
         var0 = var0.toLowerCase().trim();
         if (!var0.equals("fixed")) {
            if (!var0.equals("full")) {
               if (!var0.equals("stretch")) {
                  Class8703.method31390("Invalid scale mode: " + var0);
                  return 0;
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static int method22327(String var0, int var1) {
      if (var0 != null) {
         var0 = var0.trim();
         int var4 = Class7944.method26899(var0, -1);
         if (var4 >= 1) {
            return var4;
         } else {
            Class8703.method31390("Invalid scale: " + var0);
            return var1;
         }
      } else {
         return var1;
      }
   }

   public void method22328(int var1, int var2) {
      GlStateManager.method23699();
      GlStateManager.method23780();
      Tessellator var5 = Tessellator.getInstance();
      BufferBuilder var6 = var5.getBuffer();
      Class7944.method26861().bindTexture(this.field30738);
      GlStateManager.method23843(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = (float)(16 * this.field30740);
      float var8 = (float)var1 / var7;
      float var9 = (float)var2 / var7;
      float var10 = 0.0F;
      float var11 = 0.0F;
      if (this.field30741) {
         var10 = (var7 - (float)var1) / (var7 * 2.0F);
         var11 = (var7 - (float)var2) / (var7 * 2.0F);
      }

      switch (this.field30739) {
         case 1:
            var7 = (float)Math.max(var1, var2);
            var8 = (float)(this.field30740 * var1) / var7;
            var9 = (float)(this.field30740 * var2) / var7;
            if (this.field30741) {
               var10 = (float)this.field30740 * (var7 - (float)var1) / (var7 * 2.0F);
               var11 = (float)this.field30740 * (var7 - (float)var2) / (var7 * 2.0F);
            }
            break;
         case 2:
            var8 = (float)this.field30740;
            var9 = (float)this.field30740;
            var10 = 0.0F;
            var11 = 0.0F;
      }

      var6.begin(7, DefaultVertexFormats.field43346);
      var6.pos(0.0, (double)var2, 0.0).tex(var10, var11 + var9).color(255, 255, 255, 255).endVertex();
      var6.pos((double)var1, (double)var2, 0.0).tex(var10 + var8, var11 + var9).color(255, 255, 255, 255).endVertex();
      var6.pos((double)var1, 0.0, 0.0).tex(var10 + var8, var11).color(255, 255, 255, 255).endVertex();
      var6.pos(0.0, 0.0, 0.0).tex(var10, var11).color(255, 255, 255, 255).endVertex();
      var5.draw();
   }
}
