package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class Class3469 extends Class3468 {
   private static String[] field19316;
   public static final Class8551 field19317 = Class8820.field39704;
   private final Class2275 field19318;

   public Class3469(Class2275 var1, AbstractBlock var2) {
      super(var2);
      this.method11578(this.field18612.method35393().method23465(field19317, Boolean.valueOf(false)));
      this.field19318 = var1;
   }

   @Override
   public int method12158(BlockState var1) {
      return !var1.<Boolean>method23463(field19317) ? 0 : 15;
   }

   @Override
   public BlockState method12159(BlockState var1, int var2) {
      return var1.method23465(field19317, Boolean.valueOf(var2 > 0));
   }

   @Override
   public void method12154(Class1660 var1, BlockPos var2) {
      if (this.field19004 != Class8649.field38956 && this.field19004 != Class8649.field38957) {
         var1.method6742((PlayerEntity)null, var2, Sounds.field27136, Class2266.field14732, 0.3F, 0.6F);
      } else {
         var1.method6742((PlayerEntity)null, var2, Sounds.field27269, Class2266.field14732, 0.3F, 0.8F);
      }
   }

   @Override
   public void method12155(Class1660 var1, BlockPos var2) {
      if (this.field19004 != Class8649.field38956 && this.field19004 != Class8649.field38957) {
         var1.method6742((PlayerEntity)null, var2, Sounds.field27135, Class2266.field14732, 0.3F, 0.5F);
      } else {
         var1.method6742((PlayerEntity)null, var2, Sounds.field27268, Class2266.field14732, 0.3F, 0.7F);
      }
   }

   @Override
   public int method12157(World var1, BlockPos var2) {
      AxisAlignedBB var5 = field19315.method19668(var2);
      List<Entity> var6;
      switch (Class7415.field31771[this.field19318.ordinal()]) {
         case 1:
            var6 = var1.method7181(null, var5);
            break;
         case 2:
            var6 = var1.method7182(LivingEntity.class, var5);
            break;
         default:
            return 0;
      }

      if (!var6.isEmpty()) {
         for (Entity var8 : var6) {
            if (!var8.method3371()) {
               return 15;
            }
         }
      }

      return 0;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19317);
   }
}
