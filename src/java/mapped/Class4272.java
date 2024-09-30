package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class4272 extends Class4247 {
   public Animation field20703 = new Animation(300, 200, Direction.BACKWARDS);
   private final int field20704;
   private Class4339 field20705;
   public static Class8233 field20706;
   private UILoadingCircle field20707;

   public Class4272(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, 0, ColorHelper.field27961, false);
      UIButton blankButton;
      this.addToList(
         blankButton = new UIButton(this, "blankButton", 25, 0, ResourceRegistry.JelloLightFont20.method23942("Blank"), 30, ColorHelper.field27961, "Blank", ResourceRegistry.JelloLightFont20)
      );
      blankButton.doThis((var1x, var2x) -> {
         ConfigButtonOnClickGui var5x = (ConfigButtonOnClickGui)this.getIcoPanel();
         var5x.method13612();
      });
      UIButton var10;
      this.addToList(
         var10 = new UIButton(
            this,
            "dupeButton",
            var5 - 25 - ResourceRegistry.JelloLightFont20.method23942("Duplicate"),
            0,
            ResourceRegistry.JelloLightFont20.method23942("Duplicate"),
            30,
            ColorHelper.field27961,
            "Duplicate",
            ResourceRegistry.JelloLightFont20
         )
      );
      var10.doThis((var1x, var2x) -> {
         ConfigButtonOnClickGui var5x = (ConfigButtonOnClickGui)this.getIcoPanel();
         var5x.method13610();
      });
      this.addToList(this.field20707 = new UILoadingCircle(this, "loading", (var5 - 30) / 2, 100, 30, 30));
      this.addToList(this.field20705 = new Class4339(this, "defaultProfiles", 0, 40, var5, var6 - 40));
      field20706 = new Class8233(
         var2x -> {
            this.field20707.setEnabled(false);
            ConfigButtonOnClickGui var5x = (ConfigButtonOnClickGui)this.getIcoPanel();

            for (String var7 : var2x) {
               ButtonPanel var8;
               this.field20705
                  .addToList(
                     var8 = new ButtonPanel(
                        this.field20705, "p_" + var7, 0, 0, var5, 30, new ColorHelper(-723724, -2039584, 0, -14671840), var7, ResourceRegistry.JelloLightFont18
                     )
                  );
               var8.doThis((var3x, var4x) -> {
                  this.method13118(true);
                  new Thread(() -> {
                     Client.getInstance();
                     Class6814 var5xx = Client.getInstance().getModuleManager().getConfigurationManager();
                     Configuration var6x = var5xx.getCurrentConfig();
                     Configuration var7x = field20706.method28657(var6x, var7);
                     var5x.method13611(var7x);
                     this.method13118(false);
                  }).start();
               });
            }

            this.field20705.getButton().method13246(new Class7262(1));
         }
      );
      this.field20704 = var6;
   }

   public void method13118(boolean var1) {
      this.field20705.setEnabled(!var1);
      this.field20707.setEnabled(var1);
   }

   public void method13119(boolean var1) {
      this.field20703.changeDirection(!var1 ? Direction.BACKWARDS : Direction.FORWARDS);
   }

   public boolean method13120() {
      return this.field20703.getDirection() == Direction.FORWARDS;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      float var4 = MathUtils.lerp(this.field20703.calcPercent(), 0.1, 0.81, 0.14, 1.0);
      if (this.field20703.getDirection() == Direction.BACKWARDS) {
         var4 = MathUtils.lerp(this.field20703.calcPercent(), 0.61, 0.01, 0.87, 0.16);
      }

      this.setHeightA((int)((float)this.field20704 * var4));
      if (this.field20703.calcPercent() != 0.0F) {
         RenderUtil.drawImage(
            (float)this.xA,
            (float)(this.yA + this.heightA),
            (float)this.widthA,
            50.0F,
            ResourcesDecrypter.shadowBottomPNG,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, this.field20703.calcPercent() * var1 * 0.3F)
         );
         RenderUtil.method11415(this);
         RenderUtil.method11424(
            (float)this.xA, (float)this.yA, (float)this.widthA, (float)this.heightA, MultiUtilities.applyAlpha(-723724, var1)
         );
         if (field20706 != null && Class8233.field35347 != null && Class8233.field35347.isEmpty()) {
            RenderUtil.drawString(
               ResourceRegistry.JelloLightFont14,
               (float)(this.xA + 40),
               (float)(this.yA + 110),
               "No Default Profiles Available",
               ClientColors.MID_GREY.getColor
            );
         }

         super.draw(var1);
         RenderUtil.endScissor();
      }
   }
}
