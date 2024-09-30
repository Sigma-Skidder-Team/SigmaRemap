package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class JelloForSigmaOptions extends IngameMenuScreen {
   public static Date field4622 = new Date(0L);

   public JelloForSigmaOptions() {
      super(true);
      if (field4622.before(new Date(System.currentTimeMillis() - 3000L))) {
         field4622 = new Date();
         Client.getInstance().getLogger().info("Saving profiles...");

         try {
            Client.getInstance().getModuleManager().getConfigurationManager().saveAndReplaceConfigs();
            Client.getInstance().saveClientData();
         } catch (IOException var4) {
            var4.printStackTrace();
            Client.getInstance().getLogger().warn("Unable to save mod profiles...");
         }
      }
   }

   @Override
   public void init() {
      if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
         this.addButton(
            new Button(
               this.width / 2 - 102,
               this.height - 45,
               204,
               20,
               new StringTextComponent("Jello for Sigma Options"),
               var1 -> this.mc.displayGuiScreen(new Class1309())
            )
         );
      }

      super.init();
      Iterator var3 = this.field4566.iterator();

      while (var3.hasNext()) {
         Widget var4 = (Widget)var3.next();
         if (var4.field6478 == this.height / 4 + 72 + -16) {
            var3.remove();
         }
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
