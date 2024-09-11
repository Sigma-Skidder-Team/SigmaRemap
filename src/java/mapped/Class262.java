package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class Class262<T extends Class1086> extends Class219<T, Class2870<T>> {
   private Class7219 field923;
   private static final ResourceLocation field924 = new ResourceLocation("textures/entity/cow/red_mushroom.png");
   private static final ResourceLocation field925 = new ResourceLocation("textures/entity/cow/brown_mushroom.png");
   private static boolean field926 = false;
   private static boolean field927 = false;

   public Class262(Class5714<T, Class2870<T>> class5714) {
      super(class5714);
      this.field923 = new Class7219(class5714.method17881());
      this.field923.method22684(16, 16);
      this.field923.field31032 = 8.0f;
      this.field923.field31034 = 8.0f;
      this.field923.field31036 = MathHelper.field45210 / 4.0f;
      int[][] nArrayArray = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
      this.field923.method22691(nArrayArray, -10.0f, 0.0f, 0.0f, 20.0f, 16.0f, 0.0f, 0.0f);
      int[][] nArrayArray2 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
      this.field923.method22691(nArrayArray2, 0.0f, 0.0f, -10.0f, 0.0f, 16.0f, 20.0f, 0.0f);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.isChild() && !var4.isInvisible()) {
         BlockRendererDispatcher var13 = Minecraft.getInstance().getBlockRendererDispatcher();
         BlockState var14 = var4.method5037().method8934();
         ResourceLocation var15 = this.method852(var14);
         Class5422 var16 = null;
         if (var15 != null) {
            var16 = var2.method25597(RenderType.getEntityCutout(var15));
         }

         int var17 = Class5712.method17883(var4, 0.0F);
         var1.push();
         var1.translate(0.2F, -0.35F, 0.5);
         var1.rotate(Vector3f.YP.rotationDegrees(-48.0F));
         var1.method35292(-1.0F, -1.0F, 1.0F);
         var1.translate(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method814(var14, var1, var2, var3, var17);
         } else {
            this.field923.method22680(var1, var16, var3, var17);
         }

         var1.pop();
         var1.push();
         var1.translate(0.2F, -0.35F, 0.5);
         var1.rotate(Vector3f.YP.rotationDegrees(42.0F));
         var1.translate(0.1F, 0.0, -0.6F);
         var1.rotate(Vector3f.YP.rotationDegrees(-48.0F));
         var1.method35292(-1.0F, -1.0F, 1.0F);
         var1.translate(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method814(var14, var1, var2, var3, var17);
         } else {
            this.field923.method22680(var1, var16, var3, var17);
         }

         var1.pop();
         var1.push();
         this.method825().method11191().method22682(var1);
         var1.translate(0.0, -0.7F, -0.2F);
         var1.rotate(Vector3f.YP.rotationDegrees(-78.0F));
         var1.method35292(-1.0F, -1.0F, 1.0F);
         var1.translate(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method814(var14, var1, var2, var3, var17);
         } else {
            this.field923.method22680(var1, var16, var3, var17);
         }

         var1.pop();
      }
   }

   private ResourceLocation method852(BlockState var1) {
      Block var4 = var1.getBlock();
      if (var4 == Blocks.RED_MUSHROOM && field926) {
         return field924;
      } else {
         return var4 == Blocks.BROWN_MUSHROOM && field927 ? field925 : null;
      }
   }

   public static void method853() {
      field926 = Class7944.method26866(field924);
      field927 = Class7944.method26866(field925);
   }
}
