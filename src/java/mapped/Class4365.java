package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.network.Account;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import net.minecraft.client.Minecraft;

public class Class4365 extends Class4247 {
   public float field21334 = 0.0F;
   private final int field21335 = 10;
   private final int field21336 = 60;
   public int field21337;
   public int field21338;
   public int field21339;
   public int field21340;
   private Account account;

   public Class4365(IconPanel var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, ColorHelper.field27961, var7, false);
      this.font = ResourceRegistry.JelloLightFont20;
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field21337 = var1;
      this.field21338 = var2;
   }

   @Override
   public void draw(float var1) {
      this.account = Client.getInstance().getNetworkManager().account;
      String var4 = "Log in";
      Texture var5 = ResourcesDecrypter.accountPNG;
      if (this.account != null) {
         var4 = this.account.username;
      }

      this.setWidth(this.font.method23942(var4) + 50 + 60);
      this.setX(Minecraft.getInstance().mainWindow.getWidth() - this.width - 20);
      boolean var6 = this.field21337 >= this.x && this.field21338 <= this.y + this.getHeight();
      this.field21334 = Math.max(0.0F, Math.min(1.0F, this.field21334 + (!var6 ? -0.1F : 0.1F)));
      RenderUtil.drawRoundedRect(
         (float)this.x, (float)this.y, (float)this.getWidth(), (float)this.getHeight(), 20.0F, this.field21334 * 0.2F * var1
      );
      RenderUtil.drawRect(
         (float)this.x,
         (float)this.y,
         (float)(this.x + this.getWidth()),
         (float)(this.y + this.getHeight()),
         ColorUtils.applyAlpha(ClientColors.DULL_GREEN.getColor, (0.2F * this.field21334 + (!this.method13212() ? 0.0F : 0.2F)) * var1)
      );
      float var7 = (float)(this.x + this.width - 60 - 10);
      float var8 = (float)(this.y + 10);
      RenderUtil.method11449(
         (float)(this.x + this.width - 60 - 10),
         (float)(this.y + 10),
         60.0F,
         60.0F,
         var5,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, (0.5F + 0.5F * this.field21334) * var1)
      );
      RenderUtil.drawString(
         this.font,
         (float)(this.x + this.width - 90 - this.font.method23942(var4)),
         (float)(this.y + 27),
         var4,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, (0.5F + 0.5F * this.field21334) * var1)
      );
      super.draw(var1);
   }
}
