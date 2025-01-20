package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.gui.screens.JelloChatPanel;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;

public class Class4269 extends Class4247 {
   public UIInput field20694;

   public Class4269(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, ColorHelper.field27961, "", false);
      this.font = ResourceRegistry.JelloLightFont20;
      this.addToList(this.field20694 = new UIInput(this, "chat", 14, 0, var5 - 28, var6, UIInput.field20741, "", "Chat..."));
      this.field20694.method13156(false);
      this.field20694.setFont(ResourceRegistry.JelloLightFont20);
      this.field20694.method13145(true);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      super.method13225();
      RenderUtil.method11467(this.xA, this.yA, this.widthA, this.heightA, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1));
      super.draw(var1);
   }

   @Override
   public void keyPressed(int keyCode) {
      super.keyPressed(keyCode);
      if (keyCode == 257) {
         ((JelloChatPanel)this.getScreen()).method13359(this.field20694.getTypedText());
         Client.getInstance().getNetworkManager().field38429.method29515("SF4FSERFERF", this.field20694.getTypedText());
         this.field20694.method13304("");
         this.field20694.method13145(true);
      }
   }
}
