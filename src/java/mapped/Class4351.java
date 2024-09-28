package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

import java.io.IOException;

public class Class4351 extends Class4278 {
   public IconPanel field21263;
   public Animation field21264;
   public Animation field21265;
   public Animation field21266;
   public Class7286 field21267;
   public UIInput field21268;
   public int field21269;
   public final int field21270;
   public final int field21271;
   public boolean field21272 = false;

   public Class4351(IconPanel var1, String var2, int var3, int var4, int var5, int var6, Class7286 var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21270 = (int)((float)var5 * 0.8F);
      this.field21267 = var7;
      this.field21271 = var6;
      ColorHelper var11 = ColorHelper.field27961.method19415();
      var11.method19406(-11371052);
      var11.method19404(-12096331);
      var11.method19410(ClientColors.LIGHT_GREYISH_BLUE.getColor);
      ColorHelper var12 = ColorHelper.field27961.method19415();
      var12.method19406(-3254955);
      var12.method19404(-4700859);
      var12.method19410(ClientColors.LIGHT_GREYISH_BLUE.getColor);
      this.addToList(this.field21263 = new Class4284(this, "edit", var5 - this.field21270, 0, this.field21270, var6));
      Class4243 var13;
      this.field21263.addToList(var13 = new Class4243(this.field21263, "rename", 0, 0, this.field21270 / 2, var6, var11, "Rename"));
      Class4243 var14;
      this.field21263.addToList(var14 = new Class4243(this.field21263, "remove", this.field21270 / 2, 0, this.field21270 / 2, var6, var12, "Delete"));
      this.field21263.method13296(false);
      ColorHelper var15 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.DEEP_TEAL.getColor, Class2218.field14488, Class2218.field14492);
      this.addToList(this.field21268 = new UIInput(this, "profileName", 16, 8, this.getWidthA() - 60, 50, var15, var7.field31263));
      this.field21268.method13156(false);
      this.field21268.setFont(ResourceRegistry.JelloLightFont24);
      this.field21268.setEnabled(false);
      this.field21268.method13253((var2x, var3x) -> {
         if (this.field21268.method13297() && var3x == 257) {
            this.field21268.setEnabled(false);
            this.field21268.method13145(false);
            if (Client.getInstance().getModuleManager().method14667().method20768(this.field21268.method13303())) {
               return;
            }

            var7.field31263 = this.field21268.method13303();

            try {
               Client.getInstance().getModuleManager().method14667().method20769();
            } catch (IOException var7x) {
            }
         }
      });
      var13.setFont(ResourceRegistry.JelloLightFont18);
      var14.setFont(ResourceRegistry.JelloLightFont18);
      var13.setSize((var0, var1x) -> var0.setWidthA(Math.round((float)var1x.getWidthA() / 2.0F)));
      var14.setSize((var0, var1x) -> {
         var0.setXA(Math.round((float)var1x.getWidthA() / 2.0F));
         var0.setWidthA(Math.round((float)var1x.getWidthA() / 2.0F));
      });
      var14.doThis((var1x, var2x) -> this.field21266.changeDirection(Direction.FORWARDS));
      var13.doThis((var1x, var2x) -> {
         this.field21265.changeDirection(Direction.BACKWARDS);
         this.field21268.setEnabled(true);
         this.field21268.method13148();
      });
      this.field21263.setWidthA(0);
      this.field21263.method13284(this.field21270);
      this.field21264 = new Animation(100, 100, Direction.BACKWARDS);
      this.field21265 = new Animation(290, 290, Direction.BACKWARDS);
      this.field21266 = new Animation(200, 100, Direction.BACKWARDS);
      this.doThis((var1x, var2x) -> {
         if (var2x != 1) {
            this.field21265.changeDirection(Direction.BACKWARDS);
            if (this.field21265.calcPercent() == 0.0F) {
               Client.getInstance().getModuleManager().method14667().method20771(this.field21267);
               Client.getInstance().getSoundManager().play("switch");
               ConfigButtonOnClickGui var5x = (ConfigButtonOnClickGui)this.getIcoPanel().getIcoPanel().getIcoPanel();
               var5x.method13222(() -> var5x.method13615());

               for (Module var7x : Client.getInstance().getModuleManager().getModuleMap().values()) {
                  if (!Client.getInstance().getNetworkManager().isPremium()) {
                     var7x.method15998(false);
                  }
               }
            }
         } else {
            this.field21265.changeDirection(Direction.FORWARDS);
         }
      });
   }

   @Override
   public void method13028(int var1, int var2) {
      if (!this.field21268.method13297() && this.field21268.method13287()) {
         this.field21268.setEnabled(false);
         this.field21268.method13145(false);
         this.field21267.field31263 = this.field21268.method13303();

         try {
            Client.getInstance().getModuleManager().method14667().method20769();
         } catch (IOException var6) {
         }
      }

      this.field21264.changeDirection(this.method13114(var1, var2) ? Direction.FORWARDS : Direction.BACKWARDS);
      if (!this.method13114(var1, var2)) {
         this.field21265.changeDirection(Direction.BACKWARDS);
      }

      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      if (this.field21266.calcPercent() == 1.0F && !this.field21272) {
         this.field21272 = true;
         ConfigButtonOnClickGui var4 = (ConfigButtonOnClickGui)this.getIcoPanel().getIcoPanel().getIcoPanel();
         Client.getInstance().getModuleManager().method14667().method20764(this.field21267);
         var4.method13222(() -> var4.method13615());
      }

      float var8 = MathUtils.lerp(this.field21266.calcPercent(), 0.1, 0.81, 0.14, 1.0);
      this.setHeightA(Math.round((1.0F - var8) * (float)this.field21271));
      var1 *= 1.0F - this.field21266.calcPercent();
      float var5 = MathUtils.lerp(this.field21265.calcPercent(), 0.28, 1.26, 0.33, 1.04);
      if (this.field21265.getDirection().equals(Direction.BACKWARDS)) {
         var5 = Class8056.method27663(this.field21265.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      this.field21263.method13296(this.field21265.calcPercent() == 1.0F);
      this.field21263.setWidthA(Math.max(0, (int)((float)this.field21270 * var5)));
      this.field21263.method13284((int)((float)this.field21270 * (1.0F - var5)));
      RenderUtil.method11415(this);
      float var6 = this.method13212() && this.field21265.getDirection().equals(Direction.BACKWARDS) ? 0.03F : 0.0F;
      RenderUtil.method11424(
         (float)this.xA,
         (float)this.yA,
         (float)this.widthA,
         (float)this.heightA,
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.04F * this.field21264.calcPercent() + var6)
      );
      if (!this.field21268.method13297()) {
         RenderUtil.drawString(
            ResourceRegistry.JelloLightFont24,
            (float)(this.xA + 20) - var5 * (float)this.widthA,
            (float)(this.yA + 18),
            this.field21267.field31263,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.9F * var1)
         );
      }

      this.field21268.method13284(Math.round(-var5 * (float)this.widthA));
      if (Client.getInstance().getModuleManager().method14667().method20770() == this.field21267) {
         RenderUtil.drawImage(
            (float)(this.getXA() + this.getWidthA() - 35) - var5 * (float)this.widthA,
            (float)(this.getYA() + 27),
            17.0F,
            13.0F,
            ResourcesDecrypter.activePNG,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, (1.0F - this.field21265.calcPercent()) * var1)
         );
      }

      super.draw(var1);
      RenderUtil.endScissor();
   }
}
