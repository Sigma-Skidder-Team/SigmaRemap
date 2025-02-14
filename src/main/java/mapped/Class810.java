package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.realms.RealmsScreen;

import javax.annotation.Nullable;

public class Class810 extends RealmsScreen {
   private static String[] field4337;
   private Screen field4338;

   public void method2209(Screen var1) {
      this.field4338 = var1;
      Minecraft.getInstance().displayGuiScreen(new RealmsMainScreen(this));
   }

   @Nullable
   public RealmsScreen method2210(Screen var1) {
      this.field4338 = var1;
      return new Class816();
   }

   @Override
   public void init() {
      Minecraft.getInstance().displayGuiScreen(this.field4338);
   }
}
