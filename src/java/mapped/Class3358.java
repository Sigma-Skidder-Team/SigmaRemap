package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public class Class3358 extends Class3357 {
   private static String[] field18902;
   private static final Class6226 field18903 = new Class6218();

   public Class3358(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class6226 method11933(ItemStack var1) {
      return field18903;
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class972();
   }

   @Override
   public void method11932(ServerWorld var1, BlockPos var2) {
      Class2957 var5 = new Class2957(var1, var2);
      Class971 var6 = var5.<Class971>method11325();
      int var7 = var6.method4022();
      if (var7 >= 0) {
         ItemStack var8 = var6.method3618(var7);
         if (!var8.isEmpty()) {
            Direction var9 = var1.getBlockState(var2).<Direction>method23463(field18899);
            Class920 var10 = Class936.method3715(var1, var2.method8349(var9));
            ItemStack var12;
            if (var10 != null) {
               var12 = Class936.method3708(var6, var10, var8.copy().method32106(1), var9.method536());
               if (!var12.isEmpty()) {
                  var12 = var8.copy();
               } else {
                  var12 = var8.copy();
                  var12.method32182(1);
               }
            } else {
               var12 = field18903.method19196(var5, var8);
            }

            var6.method3621(var7, var12);
         }
      } else {
         var1.playEvent(1001, var2, 0);
      }
   }
}
