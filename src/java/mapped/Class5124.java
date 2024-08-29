package mapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class Class5124 implements Class5119 {
   private static String[] field23304;
   private final Minecraft field23305;

   public Class5124(Minecraft var1) {
      this.field23305 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      ClientWorld var11 = this.field23305.world;
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      RenderSystem.disableTexture();
      BlockPos var12 = new BlockPos(var3, var5, var7);
      LongOpenHashSet var13 = new LongOpenHashSet();

      for (BlockPos var15 : BlockPos.method8359(var12.method8336(-10, -10, -10), var12.method8336(10, 10, 10))) {
         int var16 = var11.method7020(Class1977.field12881, var15);
         float var17 = (float)(15 - var16) / 15.0F * 0.5F + 0.16F;
         int var18 = MathHelper.method37818(var17, 0.9F, 0.9F);
         long var19 = Class2002.method8419(var15.method8332());
         if (var13.add(var19)) {
            DebugRenderer.method27461(
               var11.method6883().method7348().method639(Class1977.field12881, Class2002.method8393(var19)),
               (double)(Class2002.method8407(var19) * 16 + 8),
               (double)(Class2002.method8408(var19) * 16 + 8),
               (double)(Class2002.method8409(var19) * 16 + 8),
               16711680,
               0.3F
            );
         }

         if (var16 != 15) {
            DebugRenderer.method27460(
               String.valueOf(var16), (double)var15.getX() + 0.5, (double)var15.getY() + 0.25, (double)var15.getZ() + 0.5, var18
            );
         }
      }

      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
