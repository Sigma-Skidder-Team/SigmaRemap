package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;

public class Class4257 extends Class4247 {
   public UIInput field20639;
   public String field20640;

   public Class4257(IconPanel var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.addToList(this.field20639 = new UIInput(this, "search", 50, 0, var5 - 60, var6 - 2, UIInput.field20741, "", "Search..."));
      this.field20639.method13156(false);
      this.field20639.method13151(var1x -> this.field20640 = this.field20639.method13303());
   }

   @Override
   public void draw(float var1) {
      this.field20639.method13145(true);
      byte var4 = 10;
      RenderUtil.drawRoundedRect(
         (float)(this.xA + var4 / 2),
         (float)(this.yA + var4 / 2),
         (float)(this.widthA - var4),
         (float)(this.heightA - var4),
         9.0F,
         var1 * 0.9F
      );
      RenderUtil.drawRoundedRect(
         (float)(this.xA + var4 / 2),
         (float)(this.yA + var4 / 2),
         (float)(this.widthA - var4),
         (float)(this.heightA - var4),
         30.0F,
         var1 * 0.4F
      );
      RenderUtil.drawRect(
         (float)this.xA,
         (float)this.yA,
         (float)this.widthA,
         (float)this.heightA,
         (float)var4,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.97F)
      );
      RenderUtil.drawImage(
         (float)(this.xA + 20),
         (float)(this.yA + 20),
         20.0F,
         20.0F,
         ResourcesDecrypter.searchPNG,
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.3F)
      );
      ArrayList var5 = this.method13064();
      if (var5.size() > 0 && this.method13067(this.field20640, ((Module)var5.get(0)).getName())) {
         String var6 = ((Module)var5.get(0)).getName();
         String var7 = this.field20640
            + ((Module)var5.get(0)).getName().substring(this.field20640.length(), var6.length())
            + (!((Module)var5.get(0)).isEnabled() ? " - Disabled" : " - Enabled");
         RenderUtil.drawString(
            this.field20639.getFont(),
            (float)(this.xA + 54),
            (float)(this.yA + 14),
            var7,
            ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.25F)
         );
      }

      super.draw(var1);
   }

   public ArrayList<Module> method13064() {
      ArrayList var3 = new ArrayList();
      if (this.field20640 != null && this.field20640.length() != 0) {
         for (Module var5 : Client.getInstance().getModuleManager().getModuleMap().values()) {
            if (this.method13067(this.field20640, var5.getName())) {
               var3.add(var5);
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 257) {
         ArrayList var4 = this.method13064();
         if (var4.size() > 0) {
            ((Module)var4.get(0)).toggle();
         }

         Minecraft.getInstance().displayGuiScreen(null);
      }
   }

   private boolean method13066(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().contains(var1.toLowerCase()) : true;
   }

   private boolean method13067(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().startsWith(var1.toLowerCase()) : true;
   }
}
