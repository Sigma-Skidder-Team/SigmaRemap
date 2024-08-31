package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1158 extends Class1156 {
   private static final ITextComponent field6304 = new TranslationTextComponent("lanServer.title");
   private static final ITextComponent field6305 = new TranslationTextComponent("selectServer.hiddenAddress");
   private final MultiplayerScreen field6306;
   public final Minecraft field6307;
   public final Class9162 field6308;
   private long field6309;

   public Class1158(MultiplayerScreen var1, Class9162 var2) {
      this.field6306 = var1;
      this.field6308 = var2;
      this.field6307 = Minecraft.getInstance();
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.field6307.fontRenderer.func_243248_b(var1, field6304, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      this.field6307.fontRenderer.method38801(var1, this.field6308.method34207(), (float)(var4 + 32 + 3), (float)(var3 + 12), 8421504);
      if (!this.field6307.gameSettings.field44587) {
         this.field6307.fontRenderer.method38801(var1, this.field6308.method34208(), (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      } else {
         this.field6307.fontRenderer.func_243248_b(var1, field6305, (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      this.field6306.method6238(this);
      if (Util.milliTime() - this.field6309 < 250L) {
         this.field6306.method6236();
      }

      this.field6309 = Util.milliTime();
      return false;
   }

   public Class9162 method5555() {
      return this.field6308;
   }
}
