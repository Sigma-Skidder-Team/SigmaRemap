package mapped;

import com.mentalfrostbyte.jello.gui.screens.JelloClickGUI;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import lol.Texture;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Class4290 extends Class4278 {
   private static String[] field20786;
   public float field20787 = 0.0F;
   public Class2059 field20788 = Class2059.field13418;
   public final int field20789 = 0;
   public final List<ButtonPanel> field20790 = new ArrayList<ButtonPanel>();
   private Texture field20791;

   public Class4290(IconPanel var1, String var2) {
      super(var1, var2, 0, Minecraft.getInstance().mainWindow.getHeight() - 70, Minecraft.getInstance().mainWindow.getWidth(), 110, false);
      this.method13292(true);
      this.method13300(false);
   }

   public float method13159() {
      return 1.0F - this.field20787;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      int var5 = 20;
      if (this.field20788 == Class2059.field13418
         && Math.abs(Minecraft.getInstance().mainWindow.getHeight() - var2) < var5
         && !this.icoPanel.method13239(((JelloClickGUI)this.icoPanel).blurOverlay)) {
         this.field20788 = Class2059.field13416;
      }

      float var6 = 0.05F;
      this.field20787 = this.field20787 + (this.field20788 != Class2059.field13416 ? (this.field20788 != Class2059.field13417 ? 0.0F : -var6) : var6);
      if (!(this.field20787 >= 1.0F)) {
         if (this.field20787 <= 0.0F) {
            this.field20787 = 0.0F;
            this.field20788 = Class2059.field13418;
         }
      } else {
         this.field20787 = 1.0F;
         this.field20788 = Class2059.field13418;
      }

      if (Minecraft.getInstance().mainWindow.getHeight() - var2 > this.getHeightA()) {
         this.field20788 = Class2059.field13417;
      }

      float var7 = EasingFunctions.easeOutBack(this.field20787, 0.0F, 1.0F, 1.0F);
      if (this.field20788 == Class2059.field13417) {
         var7 = EasingFunctions.easeInBack(this.field20787, 0.0F, 1.0F, 1.0F);
      }

      this.setYA(Minecraft.getInstance().mainWindow.getHeight() - (int)((float)this.getHeightA() * var7));
   }

   @Override
   public void draw(float var1) {
      int var4 = 20;
      if (!((double)var1 < 0.6)) {
         RenderUtil.method11465(
            this.xA + var4,
            this.yA + var4,
            this.widthA - var4 * 2,
            this.heightA - var4 * 2,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.9F * var1)
         );
         super.draw(var1);
      }
   }
}
