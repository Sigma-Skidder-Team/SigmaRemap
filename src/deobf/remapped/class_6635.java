package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;

public class class_6635 extends class_4785<class_6635> {
   private class_895 field_34353;
   public final MinecraftClient field_34349;
   public final class_266 field_34351;
   private final class_3178 field_34352;
   private final class_7107 field_34348;
   private final class_416 field_34350;
   private final class_7107 field_34347;
   private final class_416 field_34345;

   public class_6635(MinecraftClient var1, class_895 var2, class_266 var3, class_3178 var4) {
      this.field_34349 = var1;
      this.field_34351 = var3;
      this.field_34352 = var4;
      this.field_34353 = var2;
      this.field_34348 = method_30497(var1, var4.method_14644());
      this.field_34350 = method_30499(var1, var4.method_14649());
      this.field_34347 = method_30497(var1, class_895.method_3850());
      this.field_34345 = method_30499(var1, var4.method_14657().method_9603());
   }

   private static class_7107 method_30497(MinecraftClient var0, ITextComponent var1) {
      int var4 = var0.textRenderer.method_45379(var1);
      if (var4 <= 157) {
         return var1.func_241878_f();
      } else {
         ITextProperties var5 = ITextProperties.func_240655_a_(
            var0.textRenderer.method_45399(var1, 157 - var0.textRenderer.method_45395("...")), ITextProperties.func_240652_a_("...")
         );
         return LanguageMap.getInstance().func_241870_a(var5);
      }
   }

   private static class_416 method_30499(MinecraftClient var0, ITextComponent var1) {
      return class_416.method_2069(var0.textRenderer, var1, 157, 2);
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      class_2057 var13 = this.field_34352.method_14657();
      if (!var13.method_9602()) {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_2089.method_9774(var1, var4 - 1, var3 - 1, var4 + var5 - 9, var3 + var6 + 1, -8978432);
      }

      this.field_34349.method_8577().method_35674(this.field_34352.method_14642());
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_2089.method_9778(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      class_7107 var14 = this.field_34348;
      class_416 var15 = this.field_34350;
      if (this.method_30498() && (this.field_34349.field_9577.field_45570 || var9)) {
         this.field_34349.method_8577().method_35674(class_895.method_3851());
         class_2089.method_9774(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         int var16 = var7 - var4;
         int var17 = var8 - var3;
         if (!this.field_34352.method_14657().method_9602()) {
            var14 = this.field_34347;
            var15 = this.field_34345;
         }

         if (!this.field_34352.method_14650()) {
            if (this.field_34352.method_14643()) {
               if (var16 >= 16) {
                  class_2089.method_9778(var1, var4, var3, 32.0F, 0.0F, 32, 32, 256, 256);
               } else {
                  class_2089.method_9778(var1, var4, var3, 32.0F, 32.0F, 32, 32, 256, 256);
               }
            }

            if (this.field_34352.method_14648()) {
               if (var16 < 32 && var16 > 16 && var17 < 16) {
                  class_2089.method_9778(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  class_2089.method_9778(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (this.field_34352.method_14653()) {
               if (var16 < 32 && var16 > 16 && var17 > 16) {
                  class_2089.method_9778(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  class_2089.method_9778(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
               }
            }
         } else if (var16 >= 32) {
            class_2089.method_9778(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
         } else {
            class_2089.method_9778(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
         }
      }

      this.field_34349.textRenderer.method_45402(var1, var14, (float)(var4 + 32 + 2), (float)(var3 + 1), 16777215);
      var15.method_2074(var1, var4 + 32 + 2, var3 + 12, 10, 8421504);
   }

   private boolean method_30498() {
      return !this.field_34352.method_14656() || !this.field_34352.method_14646();
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      double var8 = var1 - (double)this.field_34353.method_36229();
      double var10 = var3 - (double)this.field_34353.method_36224(this.field_34353.method_41183().indexOf(this));
      if (this.method_30498() && var8 <= 32.0) {
         if (this.field_34352.method_14650()) {
            class_2057 var12 = this.field_34352.method_14657();
            if (!var12.method_9602()) {
               ITextComponent var13 = var12.method_9605();
               this.field_34349.method_8609(new class_9640(var1x -> {
                  this.field_34349.method_8609(this.field_34351);
                  if (var1x) {
                     this.field_34352.method_14641();
                  }
               }, class_895.method_3852(), var13));
            } else {
               this.field_34352.method_14641();
            }

            return true;
         }

         if (var8 < 16.0 && this.field_34352.method_14643()) {
            this.field_34352.method_14655();
            return true;
         }

         if (var8 > 16.0 && var10 < 16.0 && this.field_34352.method_14648()) {
            this.field_34352.method_14647();
            return true;
         }

         if (var8 > 16.0 && var10 > 16.0 && this.field_34352.method_14653()) {
            this.field_34352.method_14652();
            return true;
         }
      }

      return false;
   }
}
