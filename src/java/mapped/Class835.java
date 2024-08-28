package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import net.minecraft.util.text.StringTextComponent;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class Class835 extends Class834 {
   public static Date field4622 = new Date(0L);

   public Class835() {
      super(true);
      if (field4622.before(new Date(System.currentTimeMillis() - 3000L))) {
         field4622 = new Date();
         Client.getInstance().getLogger().info("Saving profiles...");

         try {
            Client.getInstance().getModuleManager().method14667().method20769();
            Client.getInstance().method19924();
         } catch (IOException var4) {
            var4.printStackTrace();
            Client.getInstance().getLogger().warn("Unable to save mod profiles...");
         }
      }
   }

   @Override
   public void method1921() {
      if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
         this.method2455(
            new Class1206(
               this.field4564 / 2 - 102,
               this.field4565 - 45,
               204,
               20,
               new StringTextComponent("Jello for Sigma Options"),
               var1 -> this.field4562.displayGuiScreen(new Class1309())
            )
         );
      }

      super.method1921();
      Iterator var3 = this.field4566.iterator();

      while (var3.hasNext()) {
         Class1197 var4 = (Class1197)var3.next();
         if (var4.field6478 == this.field4565 / 4 + 72 + -16) {
            var3.remove();
         }
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean method2472() {
      return false;
   }
}
