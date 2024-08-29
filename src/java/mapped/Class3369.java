package mapped;

import javax.annotation.Nullable;

public class Class3369 extends Class3241 {
   private static String[] field18942;
   public static final Class8553 field18943 = Class3198.field18484;
   public static final Class8552<Class85> field18944 = Class8820.field39725;
   public static final Class8551 field18945 = Class8820.field39704;
   private static final Class6408 field18946 = Block.method11539(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final Class6408 field18947 = Block.method11539(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final Class6408 field18948 = Block.method11539(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final Class6408 field18949 = Block.method11539(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final Class6408 field18950 = Class8022.method27431(field18949, field18948);
   private static final Class6408 field18951 = Class8022.method27431(field18950, Block.method11539(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final Class6408 field18952 = Class8022.method27431(field18950, Block.method11539(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final Class6408 field18953 = Class8022.method27431(field18950, Block.method11539(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final Class6408 field18954 = Class8022.method27431(field18950, Block.method11539(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final Class6408 field18955 = Class8022.method27431(field18950, Block.method11539(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final Class6408 field18956 = Class8022.method27431(field18950, Block.method11539(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final Class6408 field18957 = Class8022.method27431(field18950, Block.method11539(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));

   public Class3369(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18943, Direction.NORTH)
            .method23465(field18944, Class85.field212)
            .method23465(field18945, Boolean.valueOf(false))
      );
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3);
      if (var9 != var1.<Boolean>method23463(field18945)) {
         if (var9) {
            this.method11962(var2, var3, (Direction)null);
         }

         var2.method6725(var3, var1.method23465(field18945, Boolean.valueOf(var9)), 3);
      }
   }

   @Override
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, Class882 var4) {
      Entity var7 = var4.method3460();
      PlayerEntity var8 = !(var7 instanceof PlayerEntity) ? null : (PlayerEntity)var7;
      this.method11960(var1, var2, var3, var8, true);
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      return !this.method11960(var2, var1, var6, var4, true) ? ActionResultType.field14820 : ActionResultType.method9002(var2.field9020);
   }

   public boolean method11960(World var1, BlockState var2, BlockRayTraceResult var3, PlayerEntity var4, boolean var5) {
      Direction var8 = var3.getFace();
      BlockPos var9 = var3.getPos();
      boolean var10 = !var5 || this.method11961(var2, var8, var3.method31419().field18049 - (double)var9.getY());
      if (!var10) {
         return false;
      } else {
         boolean var11 = this.method11962(var1, var9, var8);
         if (var11 && var4 != null) {
            var4.method2911(Class8876.field40172);
         }

         return true;
      }
   }

   private boolean method11961(BlockState var1, Direction var2, double var3) {
      if (var2.method544() != Class113.field414 && !(var3 > 0.8124F)) {
         Direction var7 = var1.<Direction>method23463(field18943);
         Class85 var8 = var1.<Class85>method23463(field18944);
         switch (Class7106.field30622[var8.ordinal()]) {
            case 1:
               return var7.method544() == var2.method544();
            case 2:
            case 3:
               return var7.method544() != var2.method544();
            case 4:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean method11962(World var1, BlockPos var2, Direction var3) {
      TileEntity var6 = var1.getTileEntity(var2);
      if (!var1.field9020 && var6 instanceof Class966) {
         if (var3 == null) {
            var3 = var1.getBlockState(var2).<Direction>method23463(field18943);
         }

         ((Class966)var6).method3991(var3);
         var1.method6742((PlayerEntity)null, var2, Class6067.field26400, Class2266.field14732, 2.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   private Class6408 method11963(BlockState var1) {
      Direction var4 = var1.<Direction>method23463(field18943);
      Class85 var5 = var1.<Class85>method23463(field18944);
      if (var5 != Class85.field212) {
         if (var5 != Class85.field213) {
            if (var5 != Class85.field215) {
               if (var4 != Direction.NORTH) {
                  if (var4 != Direction.SOUTH) {
                     return var4 != Direction.EAST ? field18953 : field18954;
                  } else {
                     return field18956;
                  }
               } else {
                  return field18955;
               }
            } else {
               return var4 != Direction.NORTH && var4 != Direction.SOUTH ? field18952 : field18951;
            }
         } else {
            return field18957;
         }
      } else {
         return var4 != Direction.NORTH && var4 != Direction.SOUTH ? field18947 : field18946;
      }
   }

   @Override
   public Class6408 method11502(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.method11963(var1);
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.method11963(var1);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      Direction var4 = var1.method18354();
      BlockPos var5 = var1.method18345();
      World var6 = var1.method18360();
      Class113 var7 = var4.method544();
      if (var7 != Class113.field414) {
         boolean var8 = var7 == Class113.field413
               && var6.getBlockState(var5.method8345()).method23454(var6, var5.method8345(), Direction.EAST)
               && var6.getBlockState(var5.method8347()).method23454(var6, var5.method8347(), Direction.WEST)
            || var7 == Class113.field415
               && var6.getBlockState(var5.method8341()).method23454(var6, var5.method8341(), Direction.SOUTH)
               && var6.getBlockState(var5.method8343()).method23454(var6, var5.method8343(), Direction.NORTH);
         BlockState var9 = this.method11579().method23465(field18943, var4.method536()).method23465(field18944, !var8 ? Class85.field214 : Class85.field215);
         if (var9.method23443(var1.method18360(), var1.method18345())) {
            return var9;
         }

         boolean var10 = var6.getBlockState(var5.method8313()).method23454(var6, var5.method8313(), Direction.field673);
         var9 = var9.method23465(field18944, !var10 ? Class85.field213 : Class85.field212);
         if (var9.method23443(var1.method18360(), var1.method18345())) {
            return var9;
         }
      } else {
         BlockState var11 = this.method11579()
            .method23465(field18944, var4 != Direction.DOWN ? Class85.field212 : Class85.field213)
            .method23465(field18943, var1.method18350());
         if (var11.method23443(var1.method18360(), var5)) {
            return var11;
         }
      }

      return null;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      Class85 var9 = var1.<Class85>method23463(field18944);
      Direction var10 = method11964(var1).method536();
      if (var10 == var2 && !var1.method23443(var4, var5) && var9 != Class85.field215) {
         return Blocks.AIR.method11579();
      } else {
         if (var2.method544() == var1.<Direction>method23463(field18943).method544()) {
            if (var9 == Class85.field215 && !var3.method23454(var4, var6, var2)) {
               return var1.method23465(field18944, Class85.field214).method23465(field18943, var2.method536());
            }

            if (var9 == Class85.field214 && var10.method536() == var2 && var3.method23454(var4, var6, var1.<Direction>method23463(field18943))) {
               return var1.method23465(field18944, Class85.field215);
            }
         }

         return super.method11491(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      Direction var6 = method11964(var1).method536();
      return var6 != Direction.field673 ? Class3200.method11508(var2, var3, var6) : Block.method11548(var2, var3.method8311(), Direction.DOWN);
   }

   private static Direction method11964(BlockState var0) {
      switch (Class7106.field30622[var0.<Class85>method23463(field18944).ordinal()]) {
         case 1:
            return Direction.field673;
         case 4:
            return Direction.DOWN;
         default:
            return var0.<Direction>method23463(field18943).method536();
      }
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15863;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18943, field18944, field18945);
   }

   @Nullable
   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class966();
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
