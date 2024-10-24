package mapped;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class Class6346 extends Class6333 {
   private static String[] field27879;
   private final ClientPlayerEntity field27880;

   public Class6346(ClientPlayerEntity var1, SoundEvent var2) {
      super(var2, SoundCategory.field14736);
      this.field27880 = var1;
      this.repeat = false;
      this.repeatDelay = 0;
      this.volume = 1.0F;
      this.priority = true;
      this.global = true;
   }

   @Override
   public void method19269() {
      if (this.field27880.removed || !this.field27880.canSwim()) {
         this.method19271();
      }
   }
}
