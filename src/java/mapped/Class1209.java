package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.StringTextComponent;

public class Class1209 extends Class1206 {
   private static String[] field6511;
   private final boolean field6521;
   private final boolean field6522;

   public Class1209(int var1, int var2, boolean var3, Class7192 var4, boolean var5) {
      super(var1, var2, 23, 13, StringTextComponent.EMPTY, var4);
      this.field6521 = var3;
      this.field6522 = var5;
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Minecraft.getInstance().getTextureManager().bindTexture(Class870.field4820);
      byte var7 = 0;
      short var8 = 192;
      if (this.method5737()) {
         var7 += 23;
      }

      if (!this.field6521) {
         var8 += 13;
      }

      this.method5696(var1, this.field6477, this.field6478, var7, var8, 23, 13);
   }

   @Override
   public void method5739(SoundHandler var1) {
      if (this.field6522) {
         var1.method1000(MinecraftSoundManager.playSoundWithCustomPitch(Sounds.field26414, 1.0F));
      }
   }
}
