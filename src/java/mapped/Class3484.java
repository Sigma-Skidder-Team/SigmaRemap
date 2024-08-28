package mapped;

import java.util.Random;

public class Class3484 extends Class3194 implements Class3196 {
   private static String[] field19341;
   public static final Class8554 field19342 = Class8820.field39740;
   private static final Class6408 field19343 = Block.method11539(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final Class6408 field19344 = Block.method11539(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public Class3484(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19342, Integer.valueOf(0)));
   }

   @Override
   public ItemStack method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return new ItemStack(Class8514.field38170);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      if (var1.<Integer>method23463(field19342) != 0) {
         return var1.<Integer>method23463(field19342) >= 3 ? super.method11483(var1, var2, var3, var4) : field19344;
      } else {
         return field19343;
      }
   }

   @Override
   public boolean method11499(Class7380 var1) {
      return var1.<Integer>method23463(field19342) < 3;
   }

   @Override
   public void method11484(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>method23463(field19342);
      if (var7 < 3 && var4.nextInt(5) == 0 && var2.method7021(var3.method8311(), 0) >= 9) {
         var2.method6725(var3, var1.method23465(field19342, Integer.valueOf(var7 + 1)), 2);
      }
   }

   @Override
   public void method11523(Class7380 var1, World var2, BlockPos var3, Entity var4) {
      if (var4 instanceof Class880 && var4.method3204() != Class8992.field41033 && var4.method3204() != Class8992.field41009) {
         var4.method2928(var1, new Vector3d(0.8F, 0.75, 0.8F));
         if (!var2.field9020 && var1.<Integer>method23463(field19342) > 0 && (var4.field5048 != var4.getPosX() || var4.field5050 != var4.getPosZ())) {
            double var7 = Math.abs(var4.getPosX() - var4.field5048);
            double var9 = Math.abs(var4.getPosZ() - var4.field5050);
            if (var7 >= 0.003F || var9 >= 0.003F) {
               var4.method2741(Class8654.field39012, 1.0F);
            }
         }
      }
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      int var9 = var1.<Integer>method23463(field19342);
      boolean var10 = var9 == 3;
      if (!var10 && var4.getHeldItem(var5).method32107() == Class8514.field37934) {
         return ActionResultType.field14820;
      } else if (var9 <= 1) {
         return super.method11505(var1, var2, var3, var4, var5, var6);
      } else {
         int var11 = 1 + var2.field9016.nextInt(2);
         method11557(var2, var3, new ItemStack(Class8514.field38170, var11 + (!var10 ? 0 : 1)));
         var2.method6742((PlayerEntity)null, var3, Class6067.field27144, Class2266.field14732, 1.0F, 0.8F + var2.field9016.nextFloat() * 0.4F);
         var2.method6725(var3, var1.method23465(field19342, Integer.valueOf(1)), 2);
         return ActionResultType.method9002(var2.field9020);
      }
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19342);
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      return var3.<Integer>method23463(field19342) < 3;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, Class7380 var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, Class7380 var4) {
      int var7 = Math.min(3, var4.<Integer>method23463(field19342) + 1);
      var1.method6725(var3, var4.method23465(field19342, Integer.valueOf(var7)), 2);
   }
}
