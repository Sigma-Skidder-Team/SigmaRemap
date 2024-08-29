package mapped;

import net.minecraft.util.math.BlockPos;

public class Class8266 {
   public final BlockPos field35530;
   public final BlockState field35531;
   public final CompoundNBT field35532;

   public Class8266(BlockPos var1, BlockState var2, CompoundNBT var3) {
      this.field35530 = var1;
      this.field35531 = var2;
      this.field35532 = var3;
   }

   @Override
   public String toString() {
      return String.format("<StructureBlockInfo | %s | %s | %s>", this.field35530, this.field35531, this.field35532);
   }
}
