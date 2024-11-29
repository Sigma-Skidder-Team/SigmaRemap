package mapped;

import net.minecraft.util.SoundEvent;

public class Class6346 extends Class6333 {
   private static String[] field27879;
   private final ClientPlayerEntity field27880;

   public Class6346(ClientPlayerEntity var1, SoundEvent var2) {
      super(var2, Class2266.field14736);
      this.field27880 = var1;
      this.field27861 = false;
      this.field27862 = 0;
      this.field27856 = 1.0F;
      this.field27864 = true;
      this.field27865 = true;
   }

   @Override
   public void method19269() {
      if (this.field27880.removed || !this.field27880.canSwim()) {
         this.method19271();
      }
   }
}
