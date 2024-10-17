package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.screens.JelloMainMenuScreen;
import com.mentalfrostbyte.jello.network.Class9507;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import lol.ClientColors;
import totalcross.json.JSONArray;

public class RedeemKeyScreen extends IconPanel {
   public String field21135 = "";
   public Animation field21136 = new Animation(380, 200, Direction.BACKWARDS);
   private static JSONArray field21137;
   private UIInput field21138;

   public RedeemKeyScreen(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      UIInput var9;
      this.addToList(var9 = new UIInput(this, "redeemBox", 100, 200, 350, 50, UIInput.field20742, "", "Premium Code"));
      UIButton var10;
      this.addToList(
         var10 = new UIButton(
            this,
            "redeembtn",
            100,
            290,
            80,
            30,
            new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.LIGHT_GREYISH_BLUE.getColor),
            "Redeem",
            ResourceRegistry.JelloLightFont20
         )
      );
      this.addToList(this.field21138 = new UIInput(this, "captcha", 195, 290, 75, 35, UIInput.field20742, "", "Captcha"));
      this.field21138.setFont(ResourceRegistry.JelloLightFont18);
      this.field21138.setEnabled(false);
      var10.doThis((var2x, var3x) -> new Thread(() -> {
            Class9507 var4x = Client.getInstance().getNetworkManager().method30452();
            if (var4x != null) {
               var4x.method36706(this.field21138.getTypedText());
            }

            this.field21135 = Client.getInstance().getNetworkManager().redeemPremium(var9.getTypedText(), Client.getInstance().getNetworkManager().method30452());
            if (this.field21135 == null) {
               this.field21135 = "";
            }

            if (Client.getInstance().getNetworkManager().isPremium()) {
               this.method13222(() -> ((JelloMainMenuScreen)this.getIcoPanel()).method13340());
            }
         }).start());
   }

   @Override
   public void draw(float var1) {
      this.field21136.changeDirection(!this.isHovered() ? Direction.BACKWARDS : Direction.FORWARDS);
      var1 = 1.0F;
      var1 *= this.field21136.calcPercent();
      float var4 = MathUtils.lerp(this.field21136.calcPercent(), 0.17, 1.0, 0.51, 1.0);
      if (this.field21136.getDirection() == Direction.BACKWARDS) {
         var4 = 1.0F;
      }

      this.drawBackground((int)(150.0F * (1.0F - var4)));
      this.method13225();
      Class9507 var5 = Client.getInstance().getNetworkManager().method30452();
      if (var5 != null) {
         this.field21138.setEnabled(var5.method36702());
         if (var5.method36701() != null) {
            RenderUtil.startScissor((float)(this.xA + 295), (float)(this.yA + 280), 190.0F, 50.0F);
            RenderUtil.drawImage(
               (float)(this.xA + 316),
               (float)(this.yA + 280),
               190.0F,
               190.0F,
               var5.method36701(),
               MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
            );
            RenderUtil.endScissor();
         }
      }

      RenderUtil.drawString(ResourceRegistry.JelloLightFont36, 100.0F, 100.0F, "Redeem Premium", MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1));
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont25,
         100.0F,
         150.0F,
         "Visit http://sigmaclient.info for more info",
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F * var1)
      );
      RenderUtil.drawString(ResourceRegistry.JelloLightFont18, 100.0F, 263.0F, this.field21135, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F * var1));
      super.draw(var1);
   }
}
