package mapped;

import net.minecraft.util.SoundEvents;

public class Class6336 extends Class6334 {
   private static String[] field27849;

   public Class6336(BeeEntity var1) {
      super(var1, SoundEvents.field26392, SoundCategory.field14734);
   }

   @Override
   public Class6333 method19275() {
      return new Class6335(this.field27846);
   }

   @Override
   public boolean method19276() {
      return this.field27846.method4369();
   }
}
