package mapped;

import net.minecraft.network.play.server.SUpdateTileEntityPacket;

public class Class967 extends TileEntity {
   private static String[] field5422;
   private Class112 field5423;

   public Class967() {
      super(Class4387.field21444);
   }

   public Class967(Class112 var1) {
      this();
      this.method4001(var1);
   }

   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.field5325, 11, this.method3777());
   }

   public Class112 method4000() {
      if (this.field5423 == null) {
         this.field5423 = ((Class3250)this.method3775().getBlock()).method11690();
      }

      return this.field5423;
   }

   public void method4001(Class112 var1) {
      this.field5423 = var1;
   }
}
