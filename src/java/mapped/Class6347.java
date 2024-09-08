package mapped;

import net.minecraft.util.SoundEvents;

public class Class6347 extends Class6333 {
   private static String[] field27881;
   private final Class1105 field27882;

   public Class6347(Class1105 var1) {
      super(SoundEvents.field26645, Class2266.field14733);
      this.field27882 = var1;
      this.field27863 = Class2279.field14845;
      this.field27861 = true;
      this.field27862 = 0;
   }

   @Override
   public boolean method19268() {
      return !this.field27882.method3245();
   }

   @Override
   public void method19269() {
      if (!this.field27882.removed && this.field27882.method4232() == null) {
         this.field27858 = (double)((float)this.field27882.getPosX());
         this.field27859 = (double)((float)this.field27882.getPosY());
         this.field27860 = (double)((float)this.field27882.getPosZ());
         float var3 = this.field27882.method5310(0.0F);
         this.field27856 = 0.0F + 1.0F * var3 * var3;
         this.field27857 = 0.7F + 0.5F * var3;
      } else {
         this.method19271();
      }
   }
}
