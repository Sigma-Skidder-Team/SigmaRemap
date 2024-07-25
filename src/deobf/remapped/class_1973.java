package remapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class class_1973 {
   private final Identifier[] field_10002 = new Identifier[6];

   public class_1973(Identifier var1) {
      for (int var4 = 0; var4 < 6; var4++) {
         this.field_10002[var4] = new Identifier(var1.method_21461(), var1.method_21456() + '_' + var4 + ".png");
      }
   }

   public void method_9074(MinecraftClient var1, float var2, float var3, float var4) {
      class_8042 var7 = class_8042.method_36499();
      class_9633 var8 = var7.method_36501();
      RenderSystem.method_16463(5889);
      RenderSystem.method_16438();
      RenderSystem.method_16476();
      RenderSystem.method_16358(class_8107.method_36820(85.0, (float)var1.getMainWindow().method_43178() / (float)var1.getMainWindow().method_43198(), 0.05F, 10.0F));
      RenderSystem.method_16463(5888);
      RenderSystem.method_16438();
      RenderSystem.method_16476();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.method_16410(180.0F, 1.0F, 0.0F, 0.0F);
      RenderSystem.enableBlend();
      RenderSystem.method_16458();
      RenderSystem.method_16393();
      RenderSystem.method_16387(false);
      RenderSystem.defaultBlendFunc();
      byte var9 = 2;

      for (int var10 = 0; var10 < 4; var10++) {
         RenderSystem.method_16438();
         float var11 = ((float)(var10 % 2) / 2.0F - 0.5F) / 256.0F;
         float var12 = ((float)(var10 / 2) / 2.0F - 0.5F) / 256.0F;
         float var13 = 0.0F;
         RenderSystem.method_16413(var11, var12, 0.0F);
         RenderSystem.method_16410(var2, 1.0F, 0.0F, 0.0F);
         RenderSystem.method_16410(var3, 0.0F, 1.0F, 0.0F);

         for (int var14 = 0; var14 < 6; var14++) {
            var1.getTextureManager().bindTexture(this.field_10002[var14]);
            var8.method_44471(7, class_7985.field_40905);
            int var15 = Math.round(255.0F * var4) / (var10 + 1);
            if (var14 == 0) {
               var8.method_35761(-1.0, -1.0, 1.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, 1.0, 1.0).method_35745(0.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, 1.0, 1.0).method_35745(1.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, -1.0, 1.0).method_35745(1.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
            }

            if (var14 == 1) {
               var8.method_35761(1.0, -1.0, 1.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, 1.0, 1.0).method_35745(0.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, 1.0, -1.0).method_35745(1.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, -1.0, -1.0).method_35745(1.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
            }

            if (var14 == 2) {
               var8.method_35761(1.0, -1.0, -1.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, 1.0, -1.0).method_35745(0.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, 1.0, -1.0).method_35745(1.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, -1.0, -1.0).method_35745(1.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
            }

            if (var14 == 3) {
               var8.method_35761(-1.0, -1.0, -1.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, 1.0, -1.0).method_35745(0.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, 1.0, 1.0).method_35745(1.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, -1.0, 1.0).method_35745(1.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
            }

            if (var14 == 4) {
               var8.method_35761(-1.0, -1.0, -1.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, -1.0, 1.0).method_35745(0.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, -1.0, 1.0).method_35745(1.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, -1.0, -1.0).method_35745(1.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
            }

            if (var14 == 5) {
               var8.method_35761(-1.0, 1.0, 1.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(-1.0, 1.0, -1.0).method_35745(0.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, 1.0, -1.0).method_35745(1.0F, 1.0F).method_35743(255, 255, 255, var15).method_35735();
               var8.method_35761(1.0, 1.0, 1.0).method_35745(1.0F, 0.0F).method_35743(255, 255, 255, var15).method_35735();
            }

            var7.method_36500();
         }

         RenderSystem.method_16489();
         RenderSystem.method_16405(true, true, true, false);
      }

      RenderSystem.method_16405(true, true, true, true);
      RenderSystem.method_16463(5889);
      RenderSystem.method_16489();
      RenderSystem.method_16463(5888);
      RenderSystem.method_16489();
      RenderSystem.method_16387(true);
      RenderSystem.method_16361();
      RenderSystem.enableDepthTest();
   }

   public CompletableFuture<Void> method_9075(TextureManager var1, Executor var2) {
      CompletableFuture[] var5 = new CompletableFuture[6];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = var1.method_35676(this.field_10002[var6], var2);
      }

      return CompletableFuture.allOf(var5);
   }
}
