package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class BrainFreezeGui extends Class4278 {
   private static String[] field20736;
   private List<Class8854> field20738 = new ArrayList<Class8854>();
   private Class9715 field20739 = new Class9715();
   public Class2422 field20740 = new Class2422();

   public BrainFreezeGui(CustomGuiScreen var1, String var2) {
      super(var1, var2, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight(), false);
      this.method13145(false);
      this.method13296(false);
      this.method13292(false);
      this.method13294(true);
      this.method13300(false);
   }

   @Override
   public void method13145(boolean var1) {
      super.method13145(false);
   }

   @Override
   public void updatePanelDimensions(int newHeight, int newWidth) {
      super.updatePanelDimensions(newHeight, newWidth);
   }

   @Override
   public void draw(float partialTicks) {
      int var4 = Minecraft.getInstance().mainWindow.getScaledWidth();
      int var5 = Minecraft.getInstance().mainWindow.getScaledHeight();
      int var6 = var4 / 2;

      boolean var7;
      for (var7 = false; this.field20738.size() < var6; var7 = true) {
         this.field20738.add(new Class8854((float)this.field20740.nextInt(var4), (float)this.field20740.nextInt(var5)));
      }

      while (this.field20738.size() > var6) {
         this.field20738.remove(0);
         var7 = true;
      }

      if (var7) {
         for (int var8 = 0; var8 < this.field20738.size(); var8++) {
            this.field20738.get(var8).field40027 = (float)this.field20740.nextInt(var4);
            this.field20738.get(var8).field40028 = (float)this.field20740.nextInt(var5);
         }
      }

      this.field20739.method38061();

      for (Class8854 var9 : this.field20738) {
         var9.method32236(this.field20739);
         if (!(var9.field40027 < 0.0F)) {
            if (var9.field40027 > (float)var4) {
               var9.field40027 = 0.0F;
            }
         } else {
            var9.field40027 = (float)var4;
         }

         if (!(var9.field40028 < 0.0F)) {
            if (var9.field40028 > (float)var5) {
               var9.field40028 = 0.0F;
            }
         } else {
            var9.field40028 = (float)var5;
         }

         var9.method32235(partialTicks);
      }

      super.draw(partialTicks);
   }
}
