package mapped;

import java.util.Map;
import java.util.Map.Entry;

public class Class5126 implements Class5119 {
   private final Minecraft field23310;
   private double field23311 = Double.MIN_VALUE;
   private final int field23312 = 12;
   private Class8497 field23313;

   public Class5126(Minecraft var1) {
      this.field23310 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      double var11 = (double) Util.nanoTime();
      if (var11 - this.field23311 > 3.0E9) {
         this.field23311 = var11;
         IntegratedServer var13 = this.field23310.getIntegratedServer();
         if (var13 == null) {
            this.field23313 = null;
         } else {
            this.field23313 = new Class8497(this, var13, var3, var7);
         }
      }

      if (this.field23313 != null) {
         RenderSystem.enableBlend();
         RenderSystem.method27938();
         RenderSystem.lineWidth(2.0F);
         RenderSystem.disableTexture();
         RenderSystem.depthMask(false);
         Map var26 = (Map)Class8497.method30086(this.field23313).getNow((Map)null);
         double var14 = this.field23310.gameRenderer.getActiveRenderInfo().method37504().field18049 * 0.85;

         for (Entry var17 : Class8497.method30087(this.field23313).entrySet()) {
            Class7481 var18 = (Class7481)var17.getKey();
            String var19 = (String)var17.getValue();
            if (var26 != null) {
               var19 = var19 + (String)var26.get(var18);
            }

            String[] var20 = var19.split("\n");
            byte var21 = 0;

            for (String var25 : var20) {
               DebugRenderer.method27461(var25, (double)((var18.field32174 << 4) + 8), var14 + (double)var21, (double)((var18.field32175 << 4) + 8), -1, 0.15F);
               var21 -= 2;
            }
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
      }
   }

   // $VF: synthetic method
   public static Minecraft method15862(Class5126 var0) {
      return var0.field23310;
   }
}
