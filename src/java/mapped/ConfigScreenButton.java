package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;

public class ConfigScreenButton extends ButtonPanel {
   private static String[] field20593;

   public ConfigScreenButton(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void draw(float var1) {
      this.method13260().get(0).method20320(this, this.screen);
      super.draw(var1);
   }
}
