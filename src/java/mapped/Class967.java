package mapped;

import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;

public class Class967 extends TileEntity {
   private static String[] field5422;
   private Class112 field5423;

   public Class967() {
      super(TileEntityType.field21444);
   }

   public Class967(Class112 var1) {
      this();
      this.method4001(var1);
   }

   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.pos, 11, this.method3777());
   }

   public Class112 method4000() {
      if (this.field5423 == null) {
         this.field5423 = ((BedBlock)this.getBlockState().getBlock()).method11690();
      }

      return this.field5423;
   }

   public void method4001(Class112 var1) {
      this.field5423 = var1;
   }
}
