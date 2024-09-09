package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.SoundEvent;

public class Class6332 extends Class6333 {
   private static String[] field27843;
   private final Entity field27844;

   public Class6332(SoundEvent var1, Class2266 var2, Entity var3) {
      this(var1, var2, 1.0F, 1.0F, var3);
   }

   public Class6332(SoundEvent var1, Class2266 var2, float var3, float var4, Entity var5) {
      super(var1, var2);
      this.field27856 = var3;
      this.field27857 = var4;
      this.field27844 = var5;
      this.field27858 = (double)((float)this.field27844.getPosX());
      this.field27859 = (double)((float)this.field27844.getPosY());
      this.field27860 = (double)((float)this.field27844.getPosZ());
   }

   @Override
   public boolean method19268() {
      return !this.field27844.isSilent();
   }

   @Override
   public void method19269() {
      if (!this.field27844.removed) {
         this.field27858 = (double)((float)this.field27844.getPosX());
         this.field27859 = (double)((float)this.field27844.getPosY());
         this.field27860 = (double)((float)this.field27844.getPosZ());
      } else {
         this.method19271();
      }
   }
}
