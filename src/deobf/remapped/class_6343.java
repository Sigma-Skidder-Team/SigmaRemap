package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6343 extends class_2269 {
   private static final ITextComponent field_32388 = new TranslationTextComponent("lanServer.title");
   private static final ITextComponent field_32387 = new TranslationTextComponent("selectServer.hiddenAddress");
   private final class_4145 field_32390;
   public final MinecraftClient field_32392;
   public final class_7295 field_32391;
   private long field_32393;

   public class_6343(class_4145 var1, class_7295 var2) {
      this.field_32390 = var1;
      this.field_32391 = var2;
      this.field_32392 = MinecraftClient.getInstance();
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.field_32392.textRenderer.method_45378(var1, field_32388, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      this.field_32392.textRenderer.method_45385(var1, this.field_32391.method_33291(), (float)(var4 + 32 + 3), (float)(var3 + 12), 8421504);
      if (!this.field_32392.gameOptions.field_45513) {
         this.field_32392.textRenderer.method_45385(var1, this.field_32391.method_33293(), (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      } else {
         this.field_32392.textRenderer.method_45378(var1, field_32387, (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      this.field_32390.method_19234(this);
      if (Util.getMeasuringTimeMs() - this.field_32393 < 250L) {
         this.field_32390.method_19235();
      }

      this.field_32393 = Util.getMeasuringTimeMs();
      return false;
   }

   public class_7295 method_29022() {
      return this.field_32391;
   }
}
