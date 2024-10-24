package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class Class6332 extends Class6333 {
   private static String[] field27843;
   private final Entity field27844;

   public Class6332(SoundEvent var1, SoundCategory var2, Entity var3) {
      this(var1, var2, 1.0F, 1.0F, var3);
   }

   public Class6332(SoundEvent var1, SoundCategory var2, float var3, float var4, Entity var5) {
      super(var1, var2);
      this.volume = var3;
      this.pitch = var4;
      this.field27844 = var5;
      this.x = (double)((float)this.field27844.getPosX());
      this.y = (double)((float)this.field27844.getPosY());
      this.z = (double)((float)this.field27844.getPosZ());
   }

   @Override
   public boolean method19268() {
      return !this.field27844.isSilent();
   }

   @Override
   public void method19269() {
      if (!this.field27844.removed) {
         this.x = (double)((float)this.field27844.getPosX());
         this.y = (double)((float)this.field27844.getPosY());
         this.z = (double)((float)this.field27844.getPosZ());
      } else {
         this.method19271();
      }
   }
}
