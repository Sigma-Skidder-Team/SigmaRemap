package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class ModListViewPanel extends Class4339 implements Class4342 {
   public final ModuleCategory category;
   private List<ButtonPanel> moduleButtons = new ArrayList<ButtonPanel>();
   private boolean field21216;
   private boolean field21217;
   private float field21218 = 1.0F;

   public ModListViewPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ModuleCategory var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.category = var7;
      this.field21217 = true;
      ((JelloClickGUIPanels)var1).field21195 = 1.0F;
      this.field21217 = true;
      this.method13300(false);
      this.method13511();
   }

   public void method13511() {
      int offset = 0;

      for (Module module : Client.getInstance().getModuleManager().getModulesByCategory(this.category)) {
         int clr = ColorUtils.applyAlpha(-3487030, 0.0F);
         ColorHelper var12 = new ColorHelper(!module.isEnabled() ? 1895167477 : -14047489, !module.isEnabled() ? clr : -14042881)
            .setTextColor(!module.isEnabled() ? ClientColors.DEEP_TEAL.getColor : ClientColors.LIGHT_GREYISH_BLUE.getColor);
         var12.method19412(Class2218.field14488);
         ButtonPanel moduleButton;
         this.getButtons()
            .addToList(
               moduleButton = new ButtonPanel(
                  this.getButtons(), module.getName() + "Button", 0, offset * 30, this.getWidth(), 30, var12, module.getName(), ResourceRegistry.JelloLightFont20
               )
            );
         if (!module.isEnabled()) {
            moduleButton.setX(22);
         } else {
            moduleButton.setX(30);
         }

         this.moduleButtons.add(moduleButton);
         moduleButton.doThis(
            (inButton, mouse) -> {
               ButtonPanel butt = (ButtonPanel)inButton;
               if (mouse != 0) {
                  if (mouse == 1) {
                     JelloClickGUIPanels clickGUIPanels = (JelloClickGUIPanels)this.getIconPanel();
                     clickGUIPanels.showSettingGUI(module);
                  }
               } else {
                  module.toggle();
                  ColorHelper colorHelper = new ColorHelper(!module.isEnabled() ? 1895167477 : -14047489, !module.isEnabled() ? clr : -14042881)
                     .setTextColor(!module.isEnabled() ? ClientColors.DEEP_TEAL.getColor : ClientColors.LIGHT_GREYISH_BLUE.getColor);
                  if (!module.isEnabled()) {
                     butt.setX(22);
                  } else {
                     butt.setX(30);
                  }

                  colorHelper.method19412(Class2218.field14488);
                  butt.method13308(colorHelper);
               }
            }
         );
         moduleButton.method13261(new Class6666());
         offset++;
      }

      this.getButtons().method13246(new Class7262(1));
   }

   private float method13523() {
      return this.field21218 * this.field21218 * (3.0F - 2.0F * this.field21218);
   }

   private float method13524(float var1, float var2, float var3, float var4) {
      var1 /= var4 / 2.0F;
      if (!(var1 < 1.0F)) {
         var1--;
         return -var3 / 2.0F * (var1 * (var1 - 2.0F) - 1.0F) + var2;
      } else {
         return var3 / 2.0F * var1 * var1 + var2;
      }
   }
   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      JelloClickGUIPanels var5 = (JelloClickGUIPanels)this.iconPanel;
      float var6 = (float)(0.07F * (60.0 / (double) Minecraft.getFps()));
      this.field21218 = this.field21218 + (!this.method13525() ? 0.0F : (!this.field21217 ? var6 : -var6));
      this.field21218 = Math.max(0.0F, Math.min(1.0F, this.field21218));
      var5.field21195 = this.method13524(this.field21218, 0.0F, 1.0F, 1.0F);
      if (this.method13525()) {
         this.method13288(true);
         if (!(var5.field21195 <= 0.0F)) {
            if (var5.field21195 >= 1.0F) {
               this.field21216 = false;
               this.field21217 = true;
               this.method13292(true);
               this.method13145(true);
               this.method13296(true);
               var5.field21195 = 1.0F;
            }
         } else {
            this.field21216 = false;
            this.field21217 = false;
            this.method13292(false);
            this.method13145(false);
            this.method13296(false);
            var5.field21195 = 0.0F;
         }
      }
   }

   @Override
   public void draw(float var1) {
      this.method13225();
      super.draw(var1 * ((JelloClickGUIPanels)this.iconPanel).field21195);
   }

   @Override
   public boolean method13525() {
      return this.field21216;
   }

   @Override
   public void method13526() {
      this.field21216 = true;
   }

   @Override
   public boolean method13527() {
      return this.field21217;
   }

   @Override
   public void method13528(boolean var1) {
      if (var1 != this.method13527()) {
         this.method13526();
      }
   }

   public int method13529(Module var1) {
      int var4 = 0;

      for (ButtonPanel var6 : this.moduleButtons) {
         var4++;
         if (var6.method13257().equals(var1.getName() + "Button")) {
            break;
         }
      }

      return var4 * 30;
   }
}
