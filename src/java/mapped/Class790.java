package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class790 extends Class789 {
   private final long field4135;
   private final int field4136;
   private final Runnable field4137;

   public Class790(long var1, int var3, Runnable var4) {
      this.field4135 = var1;
      this.field4136 = var3;
      this.field4137 = var4;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();
      this.method1908(new TranslationTextComponent("mco.minigame.world.slot.screen.title"));

      for (int var4 = 0; var4 < 25; var4++) {
         try {
            if (this.method1909()) {
               return;
            }

            if (var3.method14561(this.field4135, this.field4136)) {
               this.field4137.run();
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

            field4133.error("Couldn't switch world!");
            this.method1918(var7.toString());
         }
      }
   }
}
