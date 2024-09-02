package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public final class Class6696 {
   private static String[] field29320;
   private BlockState field29321;
   private BlockState field29322;
   private Direction field29323;
   private int field29324;

   private Class6696(BlockState var1, BlockState var2, Direction var3) {
      this.field29321 = var1;
      this.field29322 = var2;
      this.field29323 = var3;
   }

   private void method20421(BlockState var1, BlockState var2, Direction var3) {
      this.field29321 = var1;
      this.field29322 = var2;
      this.field29323 = var3;
      this.field29324 = 0;
   }

   public Class6696 method20422() {
      return new Class6696(this.field29321, this.field29322, this.field29323);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class6696)) {
            return false;
         } else {
            Class6696 var4 = (Class6696)var1;
            return this.field29321 == var4.field29321 && this.field29322 == var4.field29322 && this.field29323 == var4.field29323;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      if (this.field29324 == 0) {
         this.field29324 = 31 * this.field29324 + this.field29321.hashCode();
         this.field29324 = 31 * this.field29324 + this.field29322.hashCode();
         this.field29324 = 31 * this.field29324 + this.field29323.hashCode();
      }

      return this.field29324;
   }

   // $VF: synthetic method
   public Class6696(BlockState var1, BlockState var2, Direction var3, Class9 var4) {
      this(var1, var2, var3);
   }
}
