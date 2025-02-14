package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class Class963 extends TileEntity {
   private int field5394;

   public Class963() {
      super(TileEntityType.field21438);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.putInt("OutputSignal", this.field5394);
      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5394 = var2.getInt("OutputSignal");
   }

   public int method3930() {
      return this.field5394;
   }

   public void method3931(int var1) {
      this.field5394 = var1;
   }
}
