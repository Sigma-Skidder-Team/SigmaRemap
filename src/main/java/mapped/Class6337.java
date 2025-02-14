package mapped;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;

public class Class6337 extends Class6333 {
   private static String[] field27850;
   private int field27851;
   private int field27852;

   public Class6337(SoundEvent var1) {
      super(var1, SoundCategory.field14736);
      this.field27861 = true;
      this.field27862 = 0;
      this.field27856 = 1.0F;
      this.field27865 = true;
   }

   @Override
   public void method19269() {
      if (this.field27852 < 0) {
         this.method19271();
      }

      this.field27852 = this.field27852 + this.field27851;
      this.field27856 = MathHelper.clamp((float)this.field27852 / 40.0F, 0.0F, 1.0F);
   }

   public void method19277() {
      this.field27852 = Math.min(this.field27852, 40);
      this.field27851 = -1;
   }

   public void method19278() {
      this.field27852 = Math.max(0, this.field27852);
      this.field27851 = 1;
   }
}
