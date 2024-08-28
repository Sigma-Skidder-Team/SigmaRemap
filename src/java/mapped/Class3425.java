package mapped;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class3425 extends Block {
   private static String[] field19162;
   public static final Class8551 field19163 = Class8820.field39704;
   public static final Class8551 field19164 = Class8820.field39682;
   public static final Class8551 field19165 = Class8820.field39685;
   public static final Class8551 field19166 = Class3392.field19019;
   public static final Class8551 field19167 = Class3392.field19020;
   public static final Class8551 field19168 = Class3392.field19021;
   public static final Class8551 field19169 = Class3392.field19022;
   private static final Map<Direction, Class8551> field19170 = Class3238.field18685;
   public static final Class6408 field19171 = Block.method11539(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   public static final Class6408 field19172 = Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final Class3459 field19173;

   public Class3425(Class3459 var1, Class7929 var2) {
      super(var2);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19163, Boolean.valueOf(false))
            .method23465(field19164, Boolean.valueOf(false))
            .method23465(field19165, Boolean.valueOf(false))
            .method23465(field19166, Boolean.valueOf(false))
            .method23465(field19167, Boolean.valueOf(false))
            .method23465(field19168, Boolean.valueOf(false))
            .method23465(field19169, Boolean.valueOf(false))
      );
      this.field19173 = var1;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return !var1.<Boolean>method23463(field19164) ? field19172 : field19171;
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      return this.method11579()
         .method23465(field19166, Boolean.valueOf(this.method12082(var4.method6738(var5.method8341()), Direction.NORTH)))
         .method23465(field19167, Boolean.valueOf(this.method12082(var4.method6738(var5.method8347()), Direction.EAST)))
         .method23465(field19168, Boolean.valueOf(this.method12082(var4.method6738(var5.method8343()), Direction.SOUTH)))
         .method23465(field19169, Boolean.valueOf(this.method12082(var4.method6738(var5.method8345()), Direction.WEST)));
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !var2.method544().method324()
         ? super.method11491(var1, var2, var3, var4, var5, var6)
         : var1.method23465(field19170.get(var2), Boolean.valueOf(this.method12082(var3, var2)));
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var4.method23448(var1.method23383())) {
         this.method12080(var2, var3, var1);
      }
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var5 && !var1.method23448(var4.method23383())) {
         this.method12080(var2, var3, var1.method23465(field19163, Boolean.valueOf(true)));
      }
   }

   @Override
   public void method11574(Class1655 var1, BlockPos var2, Class7380 var3, PlayerEntity var4) {
      if (!var1.field9020 && !var4.method3090().method32105() && var4.method3090().method32107() == Class8514.field37956) {
         var1.method6725(var2, var3.method23465(field19165, Boolean.valueOf(true)), 4);
      }

      super.method11574(var1, var2, var3, var4);
   }

   private void method12080(Class1655 var1, BlockPos var2, Class7380 var3) {
      for (Direction var9 : new Direction[]{Direction.SOUTH, Direction.WEST}) {
         for (int var10 = 1; var10 < 42; var10++) {
            BlockPos var11 = var2.method8350(var9, var10);
            Class7380 var12 = var1.method6738(var11);
            if (var12.method23448(this.field19173)) {
               if (var12.<Direction>method23463(Class3459.field19281) == var9.method536()) {
                  this.field19173.method12134(var1, var11, var12, false, true, var10, var3);
               }
               break;
            }

            if (!var12.method23448(this)) {
               break;
            }
         }
      }
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      if (!var2.field9020 && !var1.<Boolean>method23463(field19163)) {
         this.method12081(var2, var3);
      }
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var2.method6738(var3).<Boolean>method23463(field19163)) {
         this.method12081(var2, var3);
      }
   }

   private void method12081(Class1655 var1, BlockPos var2) {
      Class7380 var5 = var1.method6738(var2);
      boolean var6 = var5.<Boolean>method23463(field19163);
      boolean var7 = false;
      List<Entity> var8 = var1.method7181(null, var5.method23412(var1, var2).method19514().method19668(var2));
      if (!var8.isEmpty()) {
         for (Entity var10 : var8) {
            if (!var10.method3371()) {
               var7 = true;
               break;
            }
         }
      }

      if (var7 != var6) {
         var5 = var5.method23465(field19163, Boolean.valueOf(var7));
         var1.method6725(var2, var5, 3);
         this.method12080(var1, var2, var5);
      }

      if (var7) {
         var1.method6860().method20726(new BlockPos(var2), this, 10);
      }
   }

   public boolean method12082(Class7380 var1, Direction var2) {
      Block var5 = var1.method23383();
      return var5 != this.field19173 ? var5 == this : var1.<Direction>method23463(Class3459.field19281) == var2.method536();
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      switch (Class7246.field31110[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19168))
               .method23465(field19167, var1.<Boolean>method23463(field19169))
               .method23465(field19168, var1.<Boolean>method23463(field19166))
               .method23465(field19169, var1.<Boolean>method23463(field19167));
         case 2:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19167))
               .method23465(field19167, var1.<Boolean>method23463(field19168))
               .method23465(field19168, var1.<Boolean>method23463(field19169))
               .method23465(field19169, var1.<Boolean>method23463(field19166));
         case 3:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19169))
               .method23465(field19167, var1.<Boolean>method23463(field19166))
               .method23465(field19168, var1.<Boolean>method23463(field19167))
               .method23465(field19169, var1.<Boolean>method23463(field19168));
         default:
            return var1;
      }
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      switch (Class7246.field31111[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19166, var1.<Boolean>method23463(field19168)).method23465(field19168, var1.<Boolean>method23463(field19166));
         case 2:
            return var1.method23465(field19167, var1.<Boolean>method23463(field19169)).method23465(field19169, var1.<Boolean>method23463(field19167));
         default:
            return super.method11501(var1, var2);
      }
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19163, field19164, field19165, field19166, field19167, field19169, field19168);
   }
}
