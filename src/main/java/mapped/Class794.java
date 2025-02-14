package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;

public class Class794 extends Class789 {
   private final RealmsServer field4149;
   private final Screen field4150;
   private final boolean field4151;
   private final RealmsMainScreen field4152;

   public Class794(RealmsServer var1, Screen var2, RealmsMainScreen var3, boolean var4) {
      this.field4149 = var1;
      this.field4150 = var2;
      this.field4151 = var4;
      this.field4152 = var3;
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.configure.world.opening"));
      RealmsClient var3 = RealmsClient.method14543();

      for (int var4 = 0; var4 < 25; var4++) {
         if (this.method1909()) {
            return;
         }

         try {
            boolean var5 = var3.method14567(this.field4149.field27443);
            if (var5) {
               if (this.field4150 instanceof Class815) {
                  ((Class815)this.field4150).method2297();
               }

               this.field4149.field27447 = Class2261.field14707;
               if (this.field4151) {
                  this.field4152.method2046(this.field4149, this.field4150);
               } else {
                  method1905(this.field4150);
               }
               break;
            }
         } catch (Class2436 var6) {
            if (this.method1909()) {
               return;
            }

            method1904(var6.field16476);
         } catch (Exception var7) {
            if (this.method1909()) {
               return;
            }

            field4133.error("Failed to open server", var7);
            this.method1918("Failed to open the server");
         }
      }
   }
}
