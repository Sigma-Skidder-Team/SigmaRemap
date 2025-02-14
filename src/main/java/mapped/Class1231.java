package mapped;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.OptionSlider;
import net.minecraft.client.settings.SliderPercentageOption;

public class Class1231 extends OptionSlider implements Class1230 {
   private static String[] field6578;
   private AbstractOption field6579 = null;

   public Class1231(int var1, int var2, int var3, SliderPercentageOption var4) {
      super(Minecraft.getInstance().gameSettings, var2, var3, 200, 20, var4);
      this.field6579 = var4;
   }

   @Override
   public AbstractOption method5811() {
      return this.field6579;
   }
}
