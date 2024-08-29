package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

public class Class3383 extends Class3381 {
   private static String[] field18982;
   public static final Class8551 field18987 = Class8820.field39699;
   private static final Map<Class1665, List<Class9018>> field18988 = new WeakHashMap<Class1665, List<Class9018>>();

   public Class3383(AbstractBlock var1) {
      super(var1, Class7437.field32000);
      this.method11578(this.field18612.method35393().method23465(field18987, Boolean.valueOf(true)));
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      for (Direction var11 : Direction.values()) {
         var2.notifyNeighborsOfStateChange(var3.method8349(var11), this);
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5) {
         for (Direction var11 : Direction.values()) {
            var2.notifyNeighborsOfStateChange(var3.method8349(var11), this);
         }
      }
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method23463(field18987) && Direction.field673 != var4 ? 15 : 0;
   }

   public boolean method11981(World var1, BlockPos var2, BlockState var3) {
      return var1.method6778(var2.down(), Direction.DOWN);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      boolean var7 = this.method11981(var2, var3, var1);
      List var8 = field18988.get(var2);

      while (var8 != null && !var8.isEmpty() && var2.method6783() - Class9018.method33352((Class9018)var8.get(0)) > 60L) {
         var8.remove(0);
      }

      if (!var1.<Boolean>method23463(field18987)) {
         if (!var7 && !method11982(var2, var3, false)) {
            var2.setBlockState(var3, var1.method23465(field18987, Boolean.valueOf(true)), 3);
         }
      } else if (var7) {
         var2.setBlockState(var3, var1.method23465(field18987, Boolean.valueOf(false)), 3);
         if (method11982(var2, var3, true)) {
            var2.playEvent(1502, var3, 0);
            var2.method6860().method20726(var3, var2.getBlockState(var3).getBlock(), 160);
         }
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (var1.<Boolean>method23463(field18987) == this.method11981(var2, var3, var1) && !var2.method6860().method20720(var3, this)) {
         var2.method6860().method20726(var3, this, 2);
      }
   }

   @Override
   public int method11515(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var4 != Direction.DOWN ? 0 : var1.method23402(var2, var3, var4);
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18987)) {
         double var7 = (double)var3.getX() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var9 = (double)var3.getY() + 0.7 + (var4.nextDouble() - 0.5) * 0.2;
         double var11 = (double)var3.getZ() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         var2.method6746(this.field18984, var7, var9, var11, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18987);
   }

   private static boolean method11982(World var0, BlockPos var1, boolean var2) {
      List var5 = field18988.computeIfAbsent(var0, var0x -> Lists.newArrayList());
      if (var2) {
         var5.add(new Class9018(var1.method8353(), var0.method6783()));
      }

      int var6 = 0;

      for (int var7 = 0; var7 < var5.size(); var7++) {
         Class9018 var8 = (Class9018)var5.get(var7);
         if (Class9018.method33353(var8).equals(var1)) {
            if (++var6 >= 8) {
               return true;
            }
         }
      }

      return false;
   }
}
