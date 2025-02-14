package mapped;

import com.mojang.realmsclient.client.RealmsClient;
import net.minecraft.util.text.TranslationTextComponent;

public class Class795 extends Class789 {
   private final long field4153;
   private final Class6130 field4154;
   private final Class815 field4155;

   public Class795(long var1, Class6130 var3, Class815 var4) {
      this.field4153 = var1;
      this.field4154 = var3;
      this.field4155 = var4;
   }

   @Override
   public void run() {
      RealmsClient var3 = RealmsClient.method14543();
      this.method1908(new TranslationTextComponent("mco.minigame.world.starting.screen.title"));

      for (int var4 = 0; var4 < 25; var4++) {
         try {
            if (this.method1909()) {
               return;
            }

            if (var3.method14564(this.field4153, this.field4154.field27464)) {
               method1905(this.field4155);
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

            field4133.error("Couldn't start mini game!");
            this.method1918(var7.toString());
         }
      }
   }
}
