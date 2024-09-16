package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;

public interface Class8457<T extends Container, U extends Screen & IHasContainer<T>> {
   default void method29747(ITextComponent var1, ContainerType<T> var2, Minecraft var3, int var4) {
      Screen var7 = this.method29748((T)var2.method29013(var4, var3.player.inventory), var3.player.inventory, var1);
      var3.player.openContainer = ((IHasContainer)var7).method2628();
      var3.displayGuiScreen(var7);
   }

   U method29748(T var1, PlayerInventory var2, ITextComponent var3);
}
