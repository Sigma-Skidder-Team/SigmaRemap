package remapped;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;
import org.lwjgl.opengl.GL11;

public class class_4770 extends class_446 {
   public static class_590 field_23117 = new class_590(
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_6206.field_31724,
      class_6206.field_31726
   );
   public String field_23120 = null;
   private AbstractClientPlayerEntity field_23122;
   private MinecraftClient field_23121 = MinecraftClient.getInstance();
   private static ClientWorld field_23116;
   public class_7309 field_23119;
   private class_7884 field_23118;
   private class_9298 field_23115;

   public class_4770(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, field_23117, false);
      this.field_23120 = var7;
   }

   public class_3492 method_21986() {
      class_3284 var3 = new class_3284(this);
      return new class_4929(() -> 0L, var3, false);
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_23119 != null) {
         GL11.glEnable(2929);
         class_2083.method_9718();
         RenderSystem.disableDepthTest();
         RenderSystem.method_16438();
         RenderSystem.translatef((float)(this.field_36270 + this.field_36278 / 2), (float)(this.field_36261 - this.field_36257 / 4), -200.0F);
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
         RenderSystem.method_16410(180.0F, 1.0F, 0.0F, 0.0F);
         RenderSystem.method_16410(180.0F, 0.0F, 0.0F, 1.0F);
         float var4 = (float)(this.field_23121.window.method_43163() - this.method_32129() - this.field_23121.window.method_43163() / 2);
         float var5 = (float)(this.field_23121.window.method_43166() - this.method_32189() - this.field_23121.window.method_43166() / 2);
         float var6 = (float)Math.atan((double)(var4 / (float)(this.field_23121.window.method_43163() / 2))) * 20.0F;
         float var7 = (float)Math.atan((double)(var5 / (float)(this.field_23121.window.method_43166() / 2))) * 20.0F;
         RenderSystem.method_16410(-var6, 1.0F, 0.0F, 0.0F);
         RenderSystem.method_16410(-var7, 0.0F, 1.0F, 0.0F);
         UUID var8 = UUID.fromString(this.field_23119.method_33322().equals("steve") ? "123e4567-e89b-12d3-a456-556642440000" : this.field_23119.method_33322());
         if (field_23116 == null) {
            class_784 var9 = new class_784(class_423.field_1789, false, false);
            field_23116 = new ClientWorld(
               this.field_23121.method_8614(), var9, World.field_33048, class_8760.field_44823, 1, this::method_21986, null, false, 0L
            );
         }

         GameProfile var20 = new GameProfile(var8, this.field_23119.method_33321());
         if (this.field_23115 == null || !this.field_23115.method_19839().getString().equals(this.field_23119.method_33321())) {
            this.field_23115 = new class_9298(field_23116, new GameProfile(var8, this.field_23119.method_33321()));
            this.field_23115.field_49385 = new class_753(new class_5902(var20, 0, GameType.CREATIVE, this.field_23115.method_19839()));
         }

         this.field_23115.method_37377(var8);
         float var10 = (float)(System.currentTimeMillis() % 1750L) / 278.52115F;
         var10 = (float)Math.sin((double)var10);
         float var11 = (float)(System.currentTimeMillis() % 14000L) / 2228.1692F;
         var11 = (float)Math.sin((double)var11);
         float var12 = (float)(System.currentTimeMillis() % 30000L) / 4774.648F;
         var12 = (float)Math.sin((double)var12);
         new class_3169(0.0F, false);
         new class_6670(this.field_23121.method_8587());
         class_3758 var15 = MinecraftClient.getInstance().method_8589().method_13796();
         new class_7966();
         RenderSystem.method_16438();
         this.field_23121.method_8587().method_28136(false);
         class_2083.method_9717();
         RenderSystem.method_16389();
         RenderSystem.enableDepthTest();
         GL11.glLightModelfv(2899, new float[]{0.7F, 0.7F, 0.7F, 1.0F});
         if (this.field_23121.method_8587().camera == null) {
            this.field_23121.method_8587().camera = new Camera();
         }

         this.field_23115.field_29643 = var10 * 0.5F;
         class_3431.method_15860(0, 390, 160, 0.0F, 0.0F, this.field_23115);
         this.field_23121.method_8587().method_28136(true);
         RenderSystem.method_16489();
         RenderSystem.method_16489();
         class_2083.method_9719();
         RenderSystem.method_16443();
         RenderSystem.method_16492(33985);
         RenderSystem.method_16354();
         RenderSystem.method_16492(33984);
         GL11.glDisable(2929);
         if (this.field_23119.method_33345() != null) {
            Object var17 = null;

            try {
               var17 = class_6568.method_30015("sf", this.field_23119.method_33345());
            } catch (IOException var19) {
               var19.printStackTrace();
            }
         }
      }
   }

   public void method_21985(class_7309 var1) {
      this.field_23119 = var1;
      this.field_23118 = null;
   }
}
