package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Screen;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import net.minecraft.client.Minecraft;

public class SnakeGameScreen extends Screen {
   public Minecraft field21044 = Minecraft.getInstance();
   public TimerUtil field21045 = new TimerUtil();
   public Class4297 field21046;
   public Animation field21047;
   public int field21048;
   public int field21049 = 14;

   public SnakeGameScreen() {
      super("SnakeGameScreen");
      this.method13300(false);
      this.field21045.start();
      this.field21047 = new Animation(200, 0);
      ColorUtils.method17739();
      byte var3 = 48;
      byte var4 = 27;
      byte var5 = 14;
      int var6 = var3 * var5;
      int var7 = var4 * var5;
      this.addToList(this.field21046 = new Class4297(this, "snake", (this.field20897 - var6) / 2, (this.method13269() - var7) / 2 + 30, var3, 27, var5));
   }

   @Override
   public void draw(float var1) {
      var1 = this.field21047.calcPercent();
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      RenderUtil.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var5)
      );
      super.method13224();
      RenderUtil.method11463(
         (float)this.field21046.method13263(),
         (float)this.field21046.method13265(),
         (float)this.field21046.method13267(),
         (float)this.field21046.method13269(),
         40.0F,
         var1
      );
      RenderUtil.method11475(
         (float)(this.field21046.method13263() - 20),
         (float)(this.field21046.method13265() - 20),
         (float)(this.field21046.method13267() + 40),
         (float)(this.field21046.method13269() + 40),
         14.0F,
         ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      super.draw(var1);
      int var6 = (this.field20897 - this.field21046.method13267()) / 2;
      int var7 = (this.field20898 - this.field21046.method13269()) / 2;
      RenderUtil.drawString(ResourceRegistry.JelloMediumFont40, (float)var6, (float)(var7 - 60), "Snake", ClientColors.LIGHT_GREYISH_BLUE.getColor);
      this.field21048 = Math.max(this.field21046.method13179(), this.field21048);
      String var8 = "Max: " + this.field21048 + "   |   Score: " + this.field21046.method13179();
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont20,
         (float)(var6 + this.field21046.method13267() - ResourceRegistry.JelloLightFont20.method23942(var8)),
         (float)(var7 - 50),
         var8,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F)
      );
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         ColorUtils.method17742();
         Minecraft.getInstance().displayGuiScreen(null);
      }
   }
}
