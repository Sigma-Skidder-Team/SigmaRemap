package mapped;

import net.minecraft.util.SoundEvents;

public class Class8077 implements IAmbientSoundHandler {
   private static String[] field34715;
   private final ClientPlayerEntity field34716;
   private final SoundHandler field34717;
   private int field34718 = 0;

   public Class8077(ClientPlayerEntity var1, SoundHandler var2) {
      this.field34716 = var1;
      this.field34717 = var2;
   }

   @Override
   public void tick() {
      this.field34718--;
      if (this.field34718 <= 0 && this.field34716.canSwim()) {
         float var3 = this.field34716.world.rand.nextFloat();
         if (!(var3 < 1.0E-4F)) {
            if (!(var3 < 0.001F)) {
               if (var3 < 0.01F) {
                  this.field34718 = 0;
                  this.field34717.play(new Class6346(this.field34716, SoundEvents.field26332));
               }
            } else {
               this.field34718 = 0;
               this.field34717.play(new Class6346(this.field34716, SoundEvents.field26333));
            }
         } else {
            this.field34718 = 0;
            this.field34717.play(new Class6346(this.field34716, SoundEvents.field26334));
         }
      }
   }
}
