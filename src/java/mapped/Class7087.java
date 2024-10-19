package mapped;

import net.minecraft.nbt.FloatNBT;
import net.minecraft.nbt.ListNBT;

public class Class7087 {
   private static String[] field30493;
   public final float field30494;
   public final float field30495;
   public final float field30496;

   public Class7087(float var1, float var2, float var3) {
      this.field30494 = !Float.isInfinite(var1) && !Float.isNaN(var1) ? var1 % 360.0F : 0.0F;
      this.field30495 = !Float.isInfinite(var2) && !Float.isNaN(var2) ? var2 % 360.0F : 0.0F;
      this.field30496 = !Float.isInfinite(var3) && !Float.isNaN(var3) ? var3 % 360.0F : 0.0F;
   }

   public Class7087(ListNBT var1) {
      this(var1.getFloat(0), var1.getFloat(1), var1.getFloat(2));
   }

   public ListNBT method22012() {
      ListNBT var3 = new ListNBT();
      var3.add(FloatNBT.valueOf(this.field30494));
      var3.add(FloatNBT.valueOf(this.field30495));
      var3.add(FloatNBT.valueOf(this.field30496));
      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class7087)) {
         return false;
      } else {
         Class7087 var4 = (Class7087)var1;
         return this.field30494 == var4.field30494 && this.field30495 == var4.field30495 && this.field30496 == var4.field30496;
      }
   }

   public float method22013() {
      return this.field30494;
   }

   public float method22014() {
      return this.field30495;
   }

   public float method22015() {
      return this.field30496;
   }
}
