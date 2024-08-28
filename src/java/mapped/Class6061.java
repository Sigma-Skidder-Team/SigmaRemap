package mapped;

import javax.annotation.Nullable;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4427;
import org.apache.commons.lang3.tuple.Pair;

public class Class6061 {
   private static final ResourceLocation field26298 = new ResourceLocation("textures/misc/underwater.png");

   public static void method18789(Minecraft var0, MatrixStack var1) {
      RenderSystem.method27817();
      ClientPlayerEntity var4 = var0.player;
      if (!var4.field5052) {
         if (Class9299.field42849.method20214() && Class9299.field42822.method20214()) {
            Pair var8 = method18791(var4);
            if (var8 != null) {
               Object var6 = Class9299.method35071(Class9299.field42984);
               if (!Class9299.field42849.method20218(var4, var1, var6, var8.getLeft(), var8.getRight())) {
                  Class1713 var7 = (Class1713)Class9299.method35070(
                     var0.method1553().method806(), Class9299.field42822, var8.getLeft(), var0.world, var8.getRight()
                  );
                  method18792(var0, var7, var1);
               }
            }
         } else {
            Class7380 var5 = method18790(var4);
            if (var5 != null) {
               method18792(var0, var0.method1553().method806().method38152(var5), var1);
            }
         }
      }

      if (!var0.player.method2800()) {
         if (var0.player.method3263(Class8953.field40469) && !Class9299.field42851.method20218(var4, var1)) {
            method18793(var0, var1);
         }

         if (var0.player.method3327() && !Class9299.field42850.method20218(var4, var1)) {
            method18794(var0, var1);
         }
      }

      RenderSystem.disableAlphaTest();
   }

   @Nullable
   private static Class7380 method18790(PlayerEntity var0) {
      Pair var3 = method18791(var0);
      return var3 != null ? (Class7380)var3.getLeft() : null;
   }

   private static Pair<Class7380, BlockPos> method18791(PlayerEntity var0) {
      Mutable var3 = new Mutable();

      for (int var4 = 0; var4 < 8; var4++) {
         double var5 = var0.getPosX() + (double)(((float)((var4 >> 0) % 2) - 0.5F) * var0.method3429() * 0.8F);
         double var7 = var0.method3442() + (double)(((float)((var4 >> 1) % 2) - 0.5F) * 0.1F);
         double var9 = var0.getPosZ() + (double)(((float)((var4 >> 2) % 2) - 0.5F) * var0.method3429() * 0.8F);
         var3.method8373(var5, var7, var9);
         Class7380 var11 = var0.field5024.method6738(var3);
         if (var11.method23397() != Class1855.field9885 && var11.method23438(var0.field5024, var3)) {
            return Pair.of(var11, var3.method8353());
         }
      }

      return null;
   }

   private static void method18792(Minecraft var0, Class1713 var1, MatrixStack var2) {
      if (Class4501.method14213()) {
         Class4501.method14215(var1);
      }

      var0.getTextureManager().bindTexture(var1.method7466().method1100());
      Class5425 var5 = Class9352.method35409().method35411();
      float var6 = 0.1F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -1.0F;
      float var10 = 1.0F;
      float var11 = -0.5F;
      float var12 = var1.method7459();
      float var13 = var1.method7460();
      float var14 = var1.method7462();
      float var15 = var1.method7463();
      Class9367 var16 = var2.method35296().method32361();
      var5.method17063(7, Class9337.field43345);
      var5.method17040(var16, -1.0F, -1.0F, -0.5F).method17033(0.1F, 0.1F, 0.1F, 1.0F).method17027(var13, var15).method17031();
      var5.method17040(var16, 1.0F, -1.0F, -0.5F).method17033(0.1F, 0.1F, 0.1F, 1.0F).method17027(var12, var15).method17031();
      var5.method17040(var16, 1.0F, 1.0F, -0.5F).method17033(0.1F, 0.1F, 0.1F, 1.0F).method17027(var12, var14).method17031();
      var5.method17040(var16, -1.0F, 1.0F, -0.5F).method17033(0.1F, 0.1F, 0.1F, 1.0F).method17027(var13, var14).method17031();
      var5.method17065();
      Class4395.method13895(var5);
   }

   private static void method18793(Minecraft var0, MatrixStack var1) {
      RenderSystem.enableTexture();
      var0.getTextureManager().bindTexture(field26298);
      if (Class4501.method14213()) {
         Class4501.method14219(var0.getTextureManager().method1076(field26298).method1131());
      }

      Class5425 var4 = Class9352.method35409().method35411();
      float var5 = var0.player.method3267();
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      float var6 = 4.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -1.0F;
      float var10 = 1.0F;
      float var11 = -0.5F;
      float var12 = -var0.player.field5031 / 64.0F;
      float var13 = var0.player.field5032 / 64.0F;
      Class9367 var14 = var1.method35296().method32361();
      var4.method17063(7, Class9337.field43345);
      var4.method17040(var14, -1.0F, -1.0F, -0.5F).method17033(var5, var5, var5, 0.1F).method17027(4.0F + var12, 4.0F + var13).method17031();
      var4.method17040(var14, 1.0F, -1.0F, -0.5F).method17033(var5, var5, var5, 0.1F).method17027(0.0F + var12, 4.0F + var13).method17031();
      var4.method17040(var14, 1.0F, 1.0F, -0.5F).method17033(var5, var5, var5, 0.1F).method17027(0.0F + var12, 0.0F + var13).method17031();
      var4.method17040(var14, -1.0F, 1.0F, -0.5F).method17033(var5, var5, var5, 0.1F).method17027(4.0F + var12, 0.0F + var13).method17031();
      var4.method17065();
      Class4395.method13895(var4);
      RenderSystem.disableBlend();
   }

   private static void method18794(Minecraft var0, MatrixStack var1) {
      Class5425 var4 = Class9352.method35409().method35411();
      RenderSystem.depthFunc(519);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      RenderSystem.enableTexture();
      Class1713 var5 = Class8968.field40509.method26198();
      if (Class4501.method14213()) {
         Class4501.method14215(var5);
      }

      var0.getTextureManager().bindTexture(var5.method7466().method1100());
      float var6 = var5.method7459();
      float var7 = var5.method7460();
      float var8 = (var6 + var7) / 2.0F;
      float var9 = var5.method7462();
      float var10 = var5.method7463();
      float var11 = (var9 + var10) / 2.0F;
      float var12 = var5.method7471();
      float var13 = MathHelper.method37821(var12, var6, var8);
      float var14 = MathHelper.method37821(var12, var7, var8);
      float var15 = MathHelper.method37821(var12, var9, var11);
      float var16 = MathHelper.method37821(var12, var10, var11);
      float var17 = 1.0F;
      Class4427 var18 = new Class4427(0.9F);
      Client.getInstance().getEventManager().call(var18);

      for (int var19 = 0; var19 < 2; var19++) {
         var1.method35294();
         float var20 = -0.5F;
         float var21 = 0.5F;
         float var22 = -0.5F;
         float var23 = 0.5F;
         float var24 = -0.5F;
         var1.method35291((double)((float)(-(var19 * 2 - 1)) * 0.24F), -0.3F, 0.0);
         var1.method35293(Class7680.field32900.method25286((float)(var19 * 2 - 1) * 10.0F));
         Class9367 var25 = var1.method35296().method32361();
         var4.method17063(7, Class9337.field43345);
         var4.method17040(var25, -0.5F, -0.5F, -0.5F).method17033(1.0F, 1.0F, 1.0F, var18.method13975()).method17027(var14, var16).method17031();
         var4.method17040(var25, 0.5F, -0.5F, -0.5F).method17033(1.0F, 1.0F, 1.0F, var18.method13975()).method17027(var13, var16).method17031();
         var4.method17040(var25, 0.5F, 0.5F, -0.5F).method17033(1.0F, 1.0F, 1.0F, var18.method13975()).method17027(var13, var15).method17031();
         var4.method17040(var25, -0.5F, 0.5F, -0.5F).method17033(1.0F, 1.0F, 1.0F, var18.method13975()).method17027(var14, var15).method17031();
         var4.method17065();
         Class4395.method13895(var4);
         var1.method35295();
      }

      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
   }
}
