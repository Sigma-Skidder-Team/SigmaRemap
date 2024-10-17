package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import lol.ClientColors;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ConfigButtonOnClickGui extends Class4247 {
   private List<ButtonPanel> field21297 = new ArrayList<ButtonPanel>();
   public final Animation field21298;
   public Class4339 field21299;
   public Class4272 field21300;
   private List<Class4351> field21301 = new ArrayList<Class4351>();

   public ConfigButtonOnClickGui(IconPanel var1, String var2, int var3, int var4) {
      super(var1, var2, var3 - 250, var4 - 500, 250, 500, ColorHelper.field27961, false);
      this.field21298 = new Animation(300, 100);
      this.method13292(true);
      this.method13300(false);
      UIButton var7;
      this.addToList(
         var7 = new UIButton(
            this, "addButton", this.widthA - 55, 0, ResourceRegistry.JelloLightFont25.getStringWidth("Add"), 69, ColorHelper.field27961, "+", ResourceRegistry.JelloLightFont25
         )
      );
      var7.doThis((var1x, var2x) -> this.field21300.method13119(true));
      this.addToList(this.field21300 = new Class4272(this, "profile", 0, 69, this.widthA, 200));
      this.field21300.method13292(true);
      this.method13615();
   }

   public void method13610() {
      Client.getInstance();
      Class6814 var3 = Client.getInstance().getModuleManager().getConfigurationManager();
      Configuration var4 = var3.getCurrentConfig();
      int var5 = 1;

      while (var3.method20768(var4.getName + " Copy " + var5)) {
         var5++;
      }

      var3.saveConfig(var4.method22987(var4.getName + " Copy " + var5));
      this.method13222(() -> this.method13615());
      this.field21300.method13119(false);
   }

   public void method13611(Configuration var1) {
      Client.getInstance();
      Class6814 var4 = Client.getInstance().getModuleManager().getConfigurationManager();
      Configuration var5 = var4.getCurrentConfig();
      int var6 = 1;

      while (var4.method20768(var1.getName + " " + var6)) {
         var6++;
      }

      var4.saveConfig(var1.method22987(var1.getName + " " + var6));
      this.method13222(() -> this.method13615());
      this.field21300.method13119(false);
   }

   public void method13612() {
      Client.getInstance();
      Class6814 var3 = Client.getInstance().getModuleManager().getConfigurationManager();
      int var4 = 1;

      while (var3.method20768("New Profile " + var4)) {
         var4++;
      }

      var3.saveConfig(new Configuration("New Profile " + var4, new JSONObject()));
      this.method13222(this::method13615);
      this.field21300.method13119(false);
   }

   public void method13613() {
      this.field21300.field20703.changeDirection(Direction.BACKWARDS);
      if (this.field21298.getDirection() != Direction.BACKWARDS) {
         this.field21298.changeDirection(Direction.BACKWARDS);
      }
   }

   public boolean method13614() {
      return this.field21298.getDirection() == Direction.BACKWARDS && this.field21298.calcPercent() == 0.0F;
   }

   @Override
   public void method13028(int var1, int var2) {
      if (var2 > this.field21300.method13272() + this.field21300.getHeightA()) {
         this.field21300.method13119(false);
      }

      super.method13028(var1, var2);
   }

   public void method13615() {
      int var3 = 0;
      if (this.field21299 != null) {
         var3 = this.field21299.method13513();
         this.method13236(this.field21299);
      }

      this.addToList(this.field21299 = new Class4339(this, "profileScrollView", 10, 80, this.widthA - 20, this.heightA - 80 - 10));
      this.field21299.method13512(var3);
      this.field21301.clear();
      int var4 = 0;
      byte var5 = 70;

      for (Configuration var7 : Client.getInstance().getModuleManager().getConfigurationManager().getAllConfigs()) {
         Class4351 var8 = new Class4351(this, "profile" + var4, 0, var5 * var4, this.field21299.getWidthA(), var5, var7, var4);
         this.field21299.addToList(var8);
         this.field21301.add(var8);
         var4++;
      }

      JelloClickGUI var9 = (JelloClickGUI)this.getIcoPanel();
      var9.method13315();
   }

   public void method13616() {
      int var3 = 0;

      for (Class4351 var5 : this.field21301) {
         var5.setYA(var3);
         var3 += var5.getHeightA();
      }
   }

   @Override
   public void draw(float var1) {
      var1 = this.field21298.calcPercent();
      this.method13616();
      float var4 = MathUtils.lerp(var1, 0.37, 1.48, 0.17, 0.99);
      if (this.field21298.getDirection() == Direction.BACKWARDS) {
         var4 = MathUtils.lerp(var1, 0.38, 0.73, 0.0, 1.0);
      }

      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      this.drawBackground((int)((float)this.widthA * 0.25F * (1.0F - var4)));
      this.method13284((int)((float)this.widthA * 0.14F * (1.0F - var4)));
      super.method13224();
      super.method13225();
      byte var5 = 10;
      int var6 = MultiUtilities.applyAlpha(-723724, QuadraticEasing.easeOutQuad(var1, 0.0F, 1.0F, 1.0F));
      RenderUtil.drawRoundedRect(
         (float)(this.xA + var5 / 2),
         (float)(this.yA + var5 / 2),
         (float)(this.widthA - var5),
         (float)(this.heightA - var5),
         35.0F,
         var1
      );
      RenderUtil.drawRect(
         (float)(this.xA + var5 / 2),
         (float)(this.yA + var5 / 2),
         (float)(this.xA - var5 / 2 + this.widthA),
         (float)(this.yA - var5 / 2 + this.heightA),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.25F)
      );
      RenderUtil.drawRect((float)this.xA, (float)this.yA, (float)this.widthA, (float)this.heightA, (float)var5, var6);
      float var7 = 0.9F + (1.0F - MathUtils.lerp(this.field21300.field20703.calcPercent(), 0.0, 0.96, 0.69, 0.99)) * 0.1F;
      if (this.field21300.field20703.getDirection() == Direction.BACKWARDS) {
         var7 = 0.9F + (1.0F - MathUtils.lerp(this.field21300.field20703.calcPercent(), 0.61, 0.01, 0.87, 0.16)) * 0.1F;
      }

      this.field21299.method13279(var7, var7);
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont25,
         (float)(this.xA + 25),
         (float)(this.yA + 20),
         "Profiles",
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.8F * var1)
      );
      RenderUtil.drawRect(
         (float)(this.xA + 25),
         (float)(this.yA + 69),
         (float)(this.xA + this.widthA - 25),
         (float)(this.yA + 70),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.05F * var1)
      );
      super.draw(var1);
   }
}
