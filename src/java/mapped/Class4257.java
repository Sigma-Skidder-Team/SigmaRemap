package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;

public class Class4257 extends Class4247 {
   public Class4281 field20639;
   public String field20640;

   public Class4257(Class4305 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.method13230(this.field20639 = new Class4281(this, "search", 50, 0, var5 - 60, var6 - 2, Class4281.field20741, "", "Search..."));
      this.field20639.method13156(false);
      this.field20639.method13151(var1x -> this.field20640 = this.field20639.method13303());
   }

   @Override
   public void method13027(float var1) {
      this.field20639.method13145(true);
      byte var4 = 10;
      RenderUtil.method11463(
         (float)(this.field20895 + var4 / 2),
         (float)(this.field20896 + var4 / 2),
         (float)(this.field20897 - var4),
         (float)(this.field20898 - var4),
         9.0F,
         var1 * 0.9F
      );
      RenderUtil.method11463(
         (float)(this.field20895 + var4 / 2),
         (float)(this.field20896 + var4 / 2),
         (float)(this.field20897 - var4),
         (float)(this.field20898 - var4),
         30.0F,
         var1 * 0.4F
      );
      RenderUtil.method11475(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         (float)var4,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.97F)
      );
      RenderUtil.method11449(
         (float)(this.field20895 + 20),
         (float)(this.field20896 + 20),
         20.0F,
         20.0F,
         ResourcesDecrypter.searchPNG,
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.3F)
      );
      ArrayList var5 = this.method13064();
      if (var5.size() > 0 && this.method13067(this.field20640, ((Module)var5.get(0)).getName())) {
         String var6 = ((Module)var5.get(0)).getName();
         String var7 = this.field20640
            + ((Module)var5.get(0)).getName().substring(this.field20640.length(), var6.length())
            + (!((Module)var5.get(0)).isEnabled() ? " - Disabled" : " - Enabled");
         RenderUtil.method11439(
            this.field20639.method13305(),
            (float)(this.field20895 + 54),
            (float)(this.field20896 + 14),
            var7,
            Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.25F)
         );
      }

      super.method13027(var1);
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
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 257) {
         ArrayList var4 = this.method13064();
         if (var4.size() > 0) {
            ((Module)var4.get(0)).method16000();
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
