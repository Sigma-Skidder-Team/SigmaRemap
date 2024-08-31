package mapped;

import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1345 extends Class789 {
   private final RealmsServer field7167;
   private final Class815 field7168;

   public Class1345(RealmsServer var1, Class815 var2) {
      this.field7167 = var1;
      this.field7168 = var2;
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.configure.world.closing"));
      Class4624 var3 = Class4624.method14543();

      for (int var4 = 0; var4 < 25; var4++) {
         if (this.method1909()) {
            return;
         }

         try {
            boolean var5 = var3.method14568(this.field7167.field27443);
            if (var5) {
               this.field7168.method2297();
               this.field7167.field27447 = Class2261.field14706;
               method1905(this.field7168);
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

            field4133.error("Failed to close server", var7);
            this.method1918("Failed to close the server");
         }
      }
   }
}
