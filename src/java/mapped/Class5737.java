package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class Class5737 extends Class5715<PaintingEntity> {
   private static String[] field25158;

   public Class5737(EntityRendererManager var1) {
      super(var1);
   }

   public void method17853(PaintingEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.method35293(Class7680.field32900.method25286(180.0F - var2));
      Class9078 var9 = var1.field5496;
      float var10 = 0.0625F;
      var4.method35292(0.0625F, 0.0625F, 0.0625F);
      Class5422 var11 = var5.method25597(RenderType.getEntitySolid(this.method17843(var1)));
      PaintingSpriteUploader var12 = Minecraft.getInstance().getPaintingSpriteUploader();
      this.method17919(var4, var11, var1, var9.method33825(), var9.method33826(), var12.method1020(var9), var12.method1021());
      var4.method35295();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(PaintingEntity var1) {
      return Minecraft.getInstance().getPaintingSpriteUploader().method1021().method7466().method1100();
   }

   private void method17919(MatrixStack var1, Class5422 var2, PaintingEntity var3, int var4, int var5, TextureAtlasSprite var6, TextureAtlasSprite var7) {
      Class8892 var10 = var1.method35296();
      Class9367 var11 = var10.method32361();
      Class8967 var12 = var10.method32362();
      float var13 = (float)(-var4) / 2.0F;
      float var14 = (float)(-var5) / 2.0F;
      float var15 = 0.5F;
      float var16 = var7.method7459();
      float var17 = var7.method7460();
      float var18 = var7.method7462();
      float var19 = var7.method7463();
      float var20 = var7.method7459();
      float var21 = var7.method7460();
      float var22 = var7.method7462();
      float var23 = var7.method7464(1.0);
      float var24 = var7.method7459();
      float var25 = var7.method7461(1.0);
      float var26 = var7.method7462();
      float var27 = var7.method7463();
      int var28 = var4 / 16;
      int var29 = var5 / 16;
      double var30 = 16.0 / (double)var28;
      double var32 = 16.0 / (double)var29;

      for (int var34 = 0; var34 < var28; var34++) {
         for (int var35 = 0; var35 < var29; var35++) {
            float var36 = var13 + (float)((var34 + 1) * 16);
            float var37 = var13 + (float)(var34 * 16);
            float var38 = var14 + (float)((var35 + 1) * 16);
            float var39 = var14 + (float)(var35 * 16);
            int var40 = MathHelper.floor(var3.getPosX());
            int var41 = MathHelper.floor(var3.getPosY() + (double)((var38 + var39) / 2.0F / 16.0F));
            int var42 = MathHelper.floor(var3.getPosZ());
            Direction var43 = var3.method3386();
            if (var43 == Direction.NORTH) {
               var40 = MathHelper.floor(var3.getPosX() + (double)((var36 + var37) / 2.0F / 16.0F));
            }

            if (var43 == Direction.WEST) {
               var42 = MathHelper.floor(var3.getPosZ() - (double)((var36 + var37) / 2.0F / 16.0F));
            }

            if (var43 == Direction.SOUTH) {
               var40 = MathHelper.floor(var3.getPosX() - (double)((var36 + var37) / 2.0F / 16.0F));
            }

            if (var43 == Direction.EAST) {
               var42 = MathHelper.floor(var3.getPosZ() + (double)((var36 + var37) / 2.0F / 16.0F));
            }

            int var44 = WorldRenderer.method944(var3.world, new BlockPos(var40, var41, var42));
            float var45 = var6.method7461(var30 * (double)(var28 - var34));
            float var46 = var6.method7461(var30 * (double)(var28 - (var34 + 1)));
            float var47 = var6.method7464(var32 * (double)(var29 - var35));
            float var48 = var6.method7464(var32 * (double)(var29 - (var35 + 1)));
            this.method17920(var11, var12, var2, var36, var39, var46, var47, -0.5F, 0, 0, -1, var44);
            this.method17920(var11, var12, var2, var37, var39, var45, var47, -0.5F, 0, 0, -1, var44);
            this.method17920(var11, var12, var2, var37, var38, var45, var48, -0.5F, 0, 0, -1, var44);
            this.method17920(var11, var12, var2, var36, var38, var46, var48, -0.5F, 0, 0, -1, var44);
            this.method17920(var11, var12, var2, var36, var38, var16, var18, 0.5F, 0, 0, 1, var44);
            this.method17920(var11, var12, var2, var37, var38, var17, var18, 0.5F, 0, 0, 1, var44);
            this.method17920(var11, var12, var2, var37, var39, var17, var19, 0.5F, 0, 0, 1, var44);
            this.method17920(var11, var12, var2, var36, var39, var16, var19, 0.5F, 0, 0, 1, var44);
            this.method17920(var11, var12, var2, var36, var38, var20, var22, -0.5F, 0, 1, 0, var44);
            this.method17920(var11, var12, var2, var37, var38, var21, var22, -0.5F, 0, 1, 0, var44);
            this.method17920(var11, var12, var2, var37, var38, var21, var23, 0.5F, 0, 1, 0, var44);
            this.method17920(var11, var12, var2, var36, var38, var20, var23, 0.5F, 0, 1, 0, var44);
            this.method17920(var11, var12, var2, var36, var39, var20, var22, 0.5F, 0, -1, 0, var44);
            this.method17920(var11, var12, var2, var37, var39, var21, var22, 0.5F, 0, -1, 0, var44);
            this.method17920(var11, var12, var2, var37, var39, var21, var23, -0.5F, 0, -1, 0, var44);
            this.method17920(var11, var12, var2, var36, var39, var20, var23, -0.5F, 0, -1, 0, var44);
            this.method17920(var11, var12, var2, var36, var38, var25, var26, 0.5F, -1, 0, 0, var44);
            this.method17920(var11, var12, var2, var36, var39, var25, var27, 0.5F, -1, 0, 0, var44);
            this.method17920(var11, var12, var2, var36, var39, var24, var27, -0.5F, -1, 0, 0, var44);
            this.method17920(var11, var12, var2, var36, var38, var24, var26, -0.5F, -1, 0, 0, var44);
            this.method17920(var11, var12, var2, var37, var38, var25, var26, -0.5F, 1, 0, 0, var44);
            this.method17920(var11, var12, var2, var37, var39, var25, var27, -0.5F, 1, 0, 0, var44);
            this.method17920(var11, var12, var2, var37, var39, var24, var27, 0.5F, 1, 0, 0, var44);
            this.method17920(var11, var12, var2, var37, var38, var24, var26, 0.5F, 1, 0, 0, var44);
         }
      }
   }

   private void method17920(
      Class9367 var1, Class8967 var2, Class5422 var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      var3.method17040(var1, var4, var5, var8)
         .color(255, 255, 255, 255)
         .method17027(var6, var7)
         .method17035(Class213.field798)
         .method17034(var12)
         .method17041(var2, (float)var9, (float)var10, (float)var11)
         .endVertex();
   }
}
