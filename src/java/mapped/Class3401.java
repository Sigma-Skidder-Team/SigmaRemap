package mapped;

import java.util.Random;
import net.minecraft.util.text.ITextComponent;

public class Class3401 extends Block {
   private static String[] field19059;
   public static final Class8552<Class113> field19060 = Class8820.field39712;
   public static final Class6408 field19061 = Block.method11539(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   public static final Class6408 field19062 = Block.method11539(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public Class3401(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19060, Class113.field413));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      switch (Class9111.field41872[var1.<Class113>method23463(field19060).ordinal()]) {
         case 1:
            return field19062;
         case 2:
         default:
            return field19061;
      }
   }

   @Override
   public void method11484(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method6812().method36878() && var2.method6789().method17135(Class5462.field24226) && var4.nextInt(2000) < var2.method6997().method8905()) {
         while (var2.method6738(var3).method23448(this)) {
            var3 = var3.method8313();
         }

         if (var2.method6738(var3).method23385(var2, var3, Class8992.field41110)) {
            Entity var7 = Class8992.field41110
               .method33201(var2, (Class39)null, (ITextComponent)null, (PlayerEntity)null, var3.method8311(), Class2202.field14394, false, false);
            if (var7 != null) {
               var7.method3218();
            }
         }
      }
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      Class113 var9 = var2.method544();
      Class113 var10 = var1.<Class113>method23463(field19060);
      boolean var11 = var10 != var9 && var9.method324();
      return !var11 && !var3.method23448(this) && !new Class7473(var4, var5, var10).method24205()
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11523(Class7380 var1, World var2, BlockPos var3, Entity var4) {
      if (!var4.method3328() && !var4.method3329() && var4.method3367()) {
         var4.method3323(var3);
      }
   }

   @Override
   public void method11512(Class7380 var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(100) == 0) {
         var2.method6745(
            (double)var3.method8304() + 0.5,
            (double)var3.getY() + 0.5,
            (double)var3.method8306() + 0.5,
            Class6067.field26976,
            Class2266.field14732,
            0.5F,
            var4.nextFloat() * 0.4F + 0.8F,
            false
         );
      }

      for (int var7 = 0; var7 < 4; var7++) {
         double var8 = (double)var3.method8304() + var4.nextDouble();
         double var10 = (double)var3.getY() + var4.nextDouble();
         double var12 = (double)var3.method8306() + var4.nextDouble();
         double var14 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var16 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var18 = ((double)var4.nextFloat() - 0.5) * 0.5;
         int var20 = var4.nextInt(2) * 2 - 1;
         if (!var2.method6738(var3.method8345()).method23448(this) && !var2.method6738(var3.method8347()).method23448(this)) {
            var8 = (double)var3.method8304() + 0.5 + 0.25 * (double)var20;
            var14 = (double)(var4.nextFloat() * 2.0F * (float)var20);
         } else {
            var12 = (double)var3.method8306() + 0.5 + 0.25 * (double)var20;
            var18 = (double)(var4.nextFloat() * 2.0F * (float)var20);
         }

         var2.method6746(Class7940.field34090, var8, var10, var12, var14, var16, var18);
      }
   }

   @Override
   public ItemStack method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      switch (Class9111.field41873[var2.ordinal()]) {
         case 1:
         case 2:
            switch (Class9111.field41872[var1.<Class113>method23463(field19060).ordinal()]) {
               case 1:
                  return var1.method23465(field19060, Class113.field413);
               case 2:
                  return var1.method23465(field19060, Class113.field415);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19060);
   }
}