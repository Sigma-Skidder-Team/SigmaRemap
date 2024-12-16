package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public abstract class Class6338 implements Class6340 {
   public Class6647 field27853;
   public final SoundCategory field27854;
   public final ResourceLocation field27855;
   public float field27856 = 1.0F;
   public float field27857 = 1.0F;
   public double field27858;
   public double field27859;
   public double field27860;
   public boolean field27861;
   public int field27862;
   public Class2279 field27863 = Class2279.field14846;
   public boolean field27864;
   public boolean field27865;

   public Class6338(SoundEvent var1, SoundCategory var2) {
      this(var1.method36383(), var2);
   }

   public Class6338(ResourceLocation var1, SoundCategory var2) {
      this.field27855 = var1;
      this.field27854 = var2;
   }

   @Override
   public ResourceLocation method19279() {
      return this.field27855;
   }

   @Override
   public Class6648 method19280(SoundHandler var1) {
      Class6648 var4 = var1.method997(this.field27855);
      if (var4 != null) {
         this.field27853 = var4.method20290();
      } else {
         this.field27853 = SoundHandler.field1051;
      }

      return var4;
   }

   @Override
   public Class6647 method19281() {
      return this.field27853;
   }

   @Override
   public SoundCategory method19282() {
      return this.field27854;
   }

   @Override
   public boolean method19283() {
      return this.field27861;
   }

   @Override
   public int method19284() {
      return this.field27862;
   }

   @Override
   public float method19285() {
      return this.field27856 * this.field27853.method20293();
   }

   @Override
   public float method19286() {
      return this.field27857 * this.field27853.method20294();
   }

   @Override
   public double method19287() {
      return this.field27858;
   }

   @Override
   public double method19288() {
      return this.field27859;
   }

   @Override
   public double method19289() {
      return this.field27860;
   }

   @Override
   public Class2279 method19290() {
      return this.field27863;
   }

   @Override
   public boolean method19291() {
      return this.field27865;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.field27855 + "]";
   }
}
