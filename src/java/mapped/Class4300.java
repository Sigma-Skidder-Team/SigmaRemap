package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundEvents;

public class Class4300 extends Class4278 {
   private static String[] field20838;
   public int field20839;

   public Class4300(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, String var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13304(var7);
      this.doThis((var0, var1x) -> Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.field27176, 1.0F)));
      this.field20839 = var8;
   }

   @Override
   public void draw(float var1) {
      this.setFont(ResourceRegistry.DefaultClientFont);
      RenderUtil.drawRect(
         (float)this.xA,
         (float)this.yA,
         (float)(this.xA + this.widthA),
         (float)(this.yA + this.heightA),
         MultiUtilities.applyAlpha(this.field20839, !this.isHovered() ? 0.25F : (!this.method13298() ? 0.4F : (!this.method13212() ? 0.5F : 0.6F)))
      );
      RenderUtil.method11429(
         (float)this.xA,
         (float)this.yA,
         (float)(this.xA + this.widthA),
         (float)(this.yA + this.heightA),
         2,
         MultiUtilities.applyAlpha(this.field20839, 0.2F)
      );
      RenderUtil.method11440(
         ResourceRegistry.DefaultClientFont,
         (float)(this.getXA() + this.getWidthA() / 2),
         (float)(this.getYA() + this.getHeightA() / 2),
         this.field20912,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, !this.isHovered() ? 0.5F : 1.0F),
         Class2218.field14492,
         Class2218.field14492
      );
      super.draw(var1);
   }
}
