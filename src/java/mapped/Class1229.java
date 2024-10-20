package mapped;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.util.text.StringTextComponent;

public class Class1229 extends OptionButton implements Class1230 {
   private static String[] field6511;

   public Class1229(int var1, int var2, int var3, int var4, AbstractOption var5, String var6, IPressable var7) {
      super(var1, var2, var3, var4, var5, new StringTextComponent(var6), var7);
   }

   @Override
   public AbstractOption method5811() {
      return this.method5809();
   }
}
