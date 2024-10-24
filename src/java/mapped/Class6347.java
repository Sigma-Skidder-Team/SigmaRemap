package mapped;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class Class6347 extends Class6333 {
   private static String[] field27881;
   private final Class1105 field27882;

   public Class6347(Class1105 var1) {
      super(SoundEvents.field26645, SoundCategory.field14733);
      this.field27882 = var1;
      this.attenuationType = AttenuationType.field14845;
      this.repeat = true;
      this.repeatDelay = 0;
   }

   @Override
   public boolean method19268() {
      return !this.field27882.isSilent();
   }

   @Override
   public void method19269() {
      if (!this.field27882.removed && this.field27882.method4232() == null) {
         this.x = (double)((float)this.field27882.getPosX());
         this.y = (double)((float)this.field27882.getPosY());
         this.z = (double)((float)this.field27882.getPosZ());
         float var3 = this.field27882.method5310(0.0F);
         this.volume = 0.0F + 1.0F * var3 * var3;
         this.pitch = 0.7F + 0.5F * var3;
      } else {
         this.method19271();
      }
   }
}
