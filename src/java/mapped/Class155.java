package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class Class155 implements ILootCondition {
   private static String[] field506;
   private final Class8576 field507;
   private final BlockPos field508;

   public Class155(Class8576 var1, BlockPos var2) {
      this.field507 = var1;
      this.field508 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38607;
   }

   public boolean test(LootContext var1) {
      Vector3d var4 = var1.<Vector3d>method26081(Class9525.field44335);
      return var4 != null
         && this.field507
            .method30650(
               var1.method26090(),
               var4.method11320() + (double)this.field508.getX(),
               var4.method11321() + (double)this.field508.getY(),
               var4.method11322() + (double)this.field508.getZ()
            );
   }

   public static Class7519 method467(Class8912 var0) {
      return () -> new Class155(var0.method32580(), BlockPos.ZERO);
   }

   public static Class7519 method468(Class8912 var0, BlockPos var1) {
      return () -> new Class155(var0.method32580(), var1);
   }

   // $VF: synthetic method
   public static Class8576 method471(Class155 var0) {
      return var0.field507;
   }

   // $VF: synthetic method
   public static BlockPos method472(Class155 var0) {
      return var0.field508;
   }
}
