package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.BeaconScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * class PowerButton extends BeaconScreen.Button
 */
public class Class1205 extends Class1201 {
   private final Effect field6506;
   private final TextureAtlasSprite field6507;
   private final boolean field6508;
   private final ITextComponent field6509;
   public final BeaconScreen field6510;

   public Class1205(BeaconScreen var1, int var2, int var3, Effect var4, boolean var5) {
      super(var2, var3);
      this.field6510 = var1;
      this.field6506 = var4;
      this.field6507 = Minecraft.getInstance().getPotionSpriteUploader().method1022(var4);
      this.field6508 = var5;
      this.field6509 = this.method5763(var4, var5);
   }

   private ITextComponent method5763(Effect var1, boolean var2) {
      TranslationTextComponent var5 = new TranslationTextComponent(var1.getName());
      if (!var2 && var1 != Effects.REGENERATION) {
         var5.appendString(" II");
      }

      return var5;
   }

   @Override
   public void method5759() {
      if (!this.method5761()) {
         if (!this.field6508) {
            BeaconScreen.method2702(this.field6510, this.field6506);
         } else {
            BeaconScreen.method2701(this.field6510, this.field6506);
         }

         BeaconScreen.method2714(this.field6510).clear();
         BeaconScreen.method2715(this.field6510).clear();
         this.field6510.init();
         this.field6510.tick();
      }
   }

   @Override
   public void method5738(MatrixStack var1, int var2, int var3) {
      this.field6510.method2459(var1, this.field6509, var2, var3);
   }

   @Override
   public void method5760(MatrixStack var1) {
      Minecraft.getInstance().getTextureManager().bindTexture(this.field6507.getAtlasTexture().getTextureLocation());
      method5695(var1, this.field6477 + 2, this.field6478 + 2, this.method5702(), 18, 18, this.field6507);
   }
}
