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
      class_3542.method_16463(5889);
      class_3542.method_16438();
      class_3542.method_16476();
      class_3542.method_16358(class_8107.method_36820(85.0, (float)var1.method_8552().method_43178() / (float)var1.method_8552().method_43198(), 0.05F, 10.0F));
      class_3542.method_16463(5888);
      class_3542.method_16438();
      class_3542.method_16476();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16410(180.0F, 1.0F, 0.0F, 0.0F);
      class_3542.method_16488();
      class_3542.method_16458();
      class_3542.method_16393();
      class_3542.method_16387(false);
      class_3542.method_16437();
      byte var9 = 2;

      for (int var10 = 0; var10 < 4; var10++) {
         class_3542.method_16438();
         float var11 = ((float)(var10 % 2) / 2.0F - 0.5F) / 256.0F;
         float var12 = ((float)(var10 / 2) / 2.0F - 0.5F) / 256.0F;
         float var13 = 0.0F;
         class_3542.method_16413(var11, var12, 0.0F);
         class_3542.method_16410(var2, 1.0F, 0.0F, 0.0F);
         class_3542.method_16410(var3, 0.0F, 1.0F, 0.0F);

         for (int var14 = 0; var14 < 6; var14++) {
            var1.method_8577().method_35674(this.field_10002[var14]);
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

         class_3542.method_16489();
         class_3542.method_16405(true, true, true, false);
      }

      class_3542.method_16405(true, true, true, true);
      class_3542.method_16463(5889);
      class_3542.method_16489();
      class_3542.method_16463(5888);
      class_3542.method_16489();
      class_3542.method_16387(true);
      class_3542.method_16361();
      class_3542.method_16428();
   }

   public CompletableFuture<Void> method_9075(TextureManager var1, Executor var2) {
      CompletableFuture[] var5 = new CompletableFuture[6];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = var1.method_35676(this.field_10002[var6], var2);
      }

      return CompletableFuture.allOf(var5);
   }
}
