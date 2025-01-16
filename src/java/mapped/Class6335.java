package mapped;

import net.minecraft.util.SoundEvents;

public class Class6335 extends Class6334 {
   private static String[] field27848;

   public Class6335(BeeEntity var1) {
      super(var1, SoundEvents.field26391, SoundCategory.field14734);
      this.field27862 = 0;
   }

   @Override
   public Class6333 method19275() {
      return new Class6336(this.field27846);
   }

   @Override
   public boolean method19276() {
      return !this.field27846.method4369();
   }
}
