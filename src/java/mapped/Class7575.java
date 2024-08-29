package mapped;

import net.minecraft.util.math.BlockPos;

public class Class7575 extends Class7574 {
   private static String[] field32528;
   public final Class992 field32529;

   public Class7575(Class992 var1) {
      this.field32529 = var1;
   }

   @Override
   public void method24785(int var1) {
      this.field32529.world.method6786(this.field32529, (byte)var1);
   }

   @Override
   public World method24786() {
      return this.field32529.world;
   }

   @Override
   public BlockPos method24787() {
      return this.field32529.getPosition();
   }
}
