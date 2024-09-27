package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.util.Random;

public class Class5718 extends Class5715<Class1007> {
   public static final ResourceLocation field25106 = new ResourceLocation("textures/entity/end_crystal/end_crystal_beam.png");
   private static final ResourceLocation field25107 = new ResourceLocation("textures/entity/enderdragon/dragon_exploding.png");
   private static final ResourceLocation field25108 = new ResourceLocation("textures/entity/enderdragon/dragon.png");
   private static final ResourceLocation field25109 = new ResourceLocation("textures/entity/enderdragon/dragon_eyes.png");
   private static final RenderType field25110 = RenderType.getEntityCutoutNoCull(field25108);
   private static final RenderType field25111 = RenderType.method14321(field25108);
   private static final RenderType field25112 = RenderType.method14325(field25109);
   private static final RenderType field25113 = RenderType.getEntitySmoothCutout(field25106);
   private static final float field25114 = (float)(Math.sqrt(3.0) / 2.0);
   private final Class2875 field25115 = new Class2875();

   public Class5718(EntityRendererManager var1) {
      super(var1);
      this.field25098 = 0.5F;
   }

   public void method17853(Class1007 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      float var9 = (float)var1.method4317(7, var3)[0];
      float var10 = (float)(var1.method4317(5, var3)[1] - var1.method4317(10, var3)[1]);
      var4.rotate(Vector3f.YP.rotationDegrees(-var9));
      var4.rotate(Vector3f.XP.rotationDegrees(var10 * 10.0F));
      var4.translate(0.0, 0.0, 1.0);
      var4.method35292(-1.0F, -1.0F, 1.0F);
      var4.translate(0.0, -1.501F, 0.0);
      boolean var11 = var1.hurtTime > 0;
      this.field25115.method10997(var1, 0.0F, 0.0F, var3);
      if (var1.field5635 <= 0) {
         Class5422 var12 = var5.method25597(field25110);
         this.field25115.method11016(var4, var12, var6, Class213.method731(0.0F, var11), 1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         float var22 = (float)var1.field5635 / 200.0F;
         Class5422 var13 = var5.method25597(RenderType.method14324(field25107, var22));
         this.field25115.method11016(var4, var13, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
         Class5422 var14 = var5.method25597(field25111);
         this.field25115.method11016(var4, var14, var6, Class213.method731(0.0F, var11), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      Class5422 var23 = var5.method25597(field25112);
      if (Config.isShaders()) {
         Shaders.method33081();
      }

      Config.method26874().field1020 = true;
      this.field25115.method11016(var4, var23, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      Config.method26874().field1020 = false;
      if (Config.isShaders()) {
         Shaders.method33082();
      }

      if (var1.field5635 > 0) {
         float var24 = ((float)var1.field5635 + var3) / 200.0F;
         float var26 = Math.min(!(var24 > 0.8F) ? 0.0F : (var24 - 0.8F) / 0.2F, 1.0F);
         Random var15 = new Random(432L);
         Class5422 var16 = var5.method25597(RenderType.method14341());
         var4.push();
         var4.translate(0.0, -1.0, -2.0);

         for (int var17 = 0; (float)var17 < (var24 + var24 * var24) / 2.0F * 60.0F; var17++) {
            var4.rotate(Vector3f.XP.rotationDegrees(var15.nextFloat() * 360.0F));
            var4.rotate(Vector3f.YP.rotationDegrees(var15.nextFloat() * 360.0F));
            var4.rotate(Vector3f.ZP.rotationDegrees(var15.nextFloat() * 360.0F));
            var4.rotate(Vector3f.XP.rotationDegrees(var15.nextFloat() * 360.0F));
            var4.rotate(Vector3f.YP.rotationDegrees(var15.nextFloat() * 360.0F));
            var4.rotate(Vector3f.ZP.rotationDegrees(var15.nextFloat() * 360.0F + var24 * 90.0F));
            float var18 = var15.nextFloat() * 20.0F + 5.0F + var26 * 10.0F;
            float var19 = var15.nextFloat() * 2.0F + 1.0F + var26 * 2.0F;
            Matrix4f var20 = var4.getLast().getMatrix();
            int var21 = (int)(255.0F * (1.0F - var26));
            method17902(var16, var20, var21);
            method17903(var16, var20, var18, var19);
            method17904(var16, var20, var18, var19);
            method17902(var16, var20, var21);
            method17904(var16, var20, var18, var19);
            method17905(var16, var20, var18, var19);
            method17902(var16, var20, var21);
            method17905(var16, var20, var18, var19);
            method17903(var16, var20, var18, var19);
         }

         var4.pop();
      }

      var4.pop();
      if (var1.field5637 != null) {
         var4.push();
         float var25 = (float)(var1.field5637.getPosX() - MathHelper.lerp((double)var3, var1.prevPosX, var1.getPosX()));
         float var27 = (float)(var1.field5637.getPosY() - MathHelper.lerp((double)var3, var1.prevPosY, var1.getPosY()));
         float var28 = (float)(var1.field5637.getPosZ() - MathHelper.lerp((double)var3, var1.prevPosZ, var1.getPosZ()));
         method17906(var25, var27 + Class5723.method17909(var1.field5637, var3), var28, var3, var1.ticksExisted, var4, var5, var6);
         var4.pop();
      }

      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   private static void method17902(Class5422 var0, Matrix4f var1, int var2) {
      var0.pos(var1, 0.0F, 0.0F, 0.0F).color(255, 255, 255, var2).endVertex();
      var0.pos(var1, 0.0F, 0.0F, 0.0F).color(255, 255, 255, var2).endVertex();
   }

   private static void method17903(Class5422 var0, Matrix4f var1, float var2, float var3) {
      var0.pos(var1, -field25114 * var3, var2, -0.5F * var3).color(255, 0, 255, 0).endVertex();
   }

   private static void method17904(Class5422 var0, Matrix4f var1, float var2, float var3) {
      var0.pos(var1, field25114 * var3, var2, -0.5F * var3).color(255, 0, 255, 0).endVertex();
   }

   private static void method17905(Class5422 var0, Matrix4f var1, float var2, float var3) {
      var0.pos(var1, 0.0F, var2, 1.0F * var3).color(255, 0, 255, 0).endVertex();
   }

   public static void method17906(float var0, float var1, float var2, float var3, int var4, MatrixStack var5, Class7733 var6, int var7) {
      float var10 = MathHelper.method37765(var0 * var0 + var2 * var2);
      float var11 = MathHelper.method37765(var0 * var0 + var1 * var1 + var2 * var2);
      var5.push();
      var5.translate(0.0, 2.0, 0.0);
      var5.rotate(Vector3f.YP.method25285((float)(-Math.atan2((double)var2, (double)var0)) - (float) (Math.PI / 2)));
      var5.rotate(Vector3f.XP.method25285((float)(-Math.atan2((double)var10, (double)var1)) - (float) (Math.PI / 2)));
      Class5422 var12 = var6.method25597(field25113);
      float var13 = 0.0F - ((float)var4 + var3) * 0.01F;
      float var14 = MathHelper.method37765(var0 * var0 + var1 * var1 + var2 * var2) / 32.0F - ((float)var4 + var3) * 0.01F;
      byte var15 = 8;
      float var16 = 0.0F;
      float var17 = 0.75F;
      float var18 = 0.0F;
      Class8892 var19 = var5.getLast();
      Matrix4f var20 = var19.getMatrix();
      Class8967 var21 = var19.method32362();

      for (int var22 = 1; var22 <= 8; var22++) {
         float var23 = MathHelper.sin((float)var22 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var24 = MathHelper.cos((float)var22 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var25 = (float)var22 / 8.0F;
         var12.pos(var20, var16 * 0.2F, var17 * 0.2F, 0.0F)
            .color(0, 0, 0, 255)
            .tex(var18, var13)
            .method17035(Class213.field798)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var12.pos(var20, var16, var17, var11)
            .color(255, 255, 255, 255)
            .tex(var18, var14)
            .method17035(Class213.field798)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var12.pos(var20, var23, var24, var11)
            .color(255, 255, 255, 255)
            .tex(var25, var14)
            .method17035(Class213.field798)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var12.pos(var20, var23 * 0.2F, var24 * 0.2F, 0.0F)
            .color(0, 0, 0, 255)
            .tex(var25, var13)
            .method17035(Class213.field798)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var16 = var23;
         var17 = var24;
         var18 = var25;
      }

      var5.pop();
   }

   public ResourceLocation method17843(Class1007 var1) {
      return field25108;
   }
}
