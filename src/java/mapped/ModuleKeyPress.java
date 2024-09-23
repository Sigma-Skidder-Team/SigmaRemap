package mapped;

import java.lang.reflect.InvocationTargetException;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.impl.MouseHoverEvent;
import com.mentalfrostbyte.jello.gui.GuiManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class ModuleKeyPress {
   private static String[] field35740;
   private static final Minecraft field35741 = Minecraft.getInstance();

   public static void press(int key) {
      if (Client.getInstance().getClientMode() != ClientMode.NOADDONS) {
         if (key != -1) {
            for (Class7957 var5 : Client.getInstance().getModuleManager().method14668().method13733(key)) {
               if (var5 != null && var5.method27052()) {
                  switch (Class8614.field38740[var5.method27055().ordinal()]) {
                     case 1:
                        var5.method27058().toggle();
                        break;
                     case 2:
                        try {
                           Screen var6 = var5.method27057()
                              .getDeclaredConstructor(ITextComponent.class)
                              .newInstance(new StringTextComponent(GuiManager.field41338.get(var5.method27057())));
                           if (Client.getInstance().getGuiManager().method33484(var6)) {
                              field35741.displayGuiScreen(var6);
                           }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException var7) {
                           var7.printStackTrace();
                        }
                  }
               }
            }
         }
      }
   }

   public static void method29127(int var0) {
      MouseHoverEvent var3 = new MouseHoverEvent(var0);
      Client.getInstance().getEventManager().call(var3);
   }
}
