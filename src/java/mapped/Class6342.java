package mapped;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class Class6342 extends Class6333 {
   private static String[] field27867;
   private final ClientPlayerEntity field27868;
   private int field27869;

   public Class6342(ClientPlayerEntity var1) {
      super(SoundEvents.field26331, SoundCategory.field14736);
      this.field27868 = var1;
      this.repeat = true;
      this.repeatDelay = 0;
      this.volume = 1.0F;
      this.priority = true;
      this.global = true;
   }

   @Override
   public void method19269() {
      if (!this.field27868.removed && this.field27869 >= 0) {
         if (!this.field27868.canSwim()) {
            this.field27869 -= 2;
         } else {
            this.field27869++;
         }

         this.field27869 = Math.min(this.field27869, 40);
         this.volume = Math.max(0.0F, Math.min((float)this.field27869 / 40.0F, 1.0F));
      } else {
         this.method19271();
      }
   }
}
