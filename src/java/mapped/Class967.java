package mapped;

import net.minecraft.block.BedBlock;
import net.minecraft.item.DyeColor;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class Class967 extends TileEntity {
   private static String[] field5422;
   private DyeColor field5423;

   public Class967() {
      super(TileEntityType.field21444);
   }

   public Class967(DyeColor var1) {
      this();
      this.method4001(var1);
   }

   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.pos, 11, this.method3777());
   }

   public DyeColor method4000() {
      if (this.field5423 == null) {
         this.field5423 = ((BedBlock)this.getBlockState().getBlock()).method11690();
      }

      return this.field5423;
   }

   public void method4001(DyeColor var1) {
      this.field5423 = var1;
   }
}
