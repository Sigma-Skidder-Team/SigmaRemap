package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3205 extends Class3200 {
   public static final VoxelShape field18528 = Block.method11539(2.0, 0.0, 6.0, 4.0, 7.0, 10.0);
   public static final VoxelShape field18529 = Block.method11539(12.0, 0.0, 6.0, 14.0, 7.0, 10.0);
   public static final VoxelShape field18530 = Block.method11539(2.0, 7.0, 5.0, 4.0, 13.0, 11.0);
   public static final VoxelShape field18531 = Block.method11539(12.0, 7.0, 5.0, 14.0, 13.0, 11.0);
   public static final VoxelShape field18532 = VoxelShapes.method27431(field18528, field18530);
   public static final VoxelShape field18533 = VoxelShapes.method27431(field18529, field18531);
   public static final VoxelShape field18534 = VoxelShapes.method27431(field18532, field18533);
   public static final VoxelShape field18535 = VoxelShapes.method27431(field18534, Block.method11539(4.0, 4.0, 2.0, 12.0, 16.0, 14.0));
   public static final VoxelShape field18536 = Block.method11539(6.0, 0.0, 2.0, 10.0, 7.0, 4.0);
   public static final VoxelShape field18537 = Block.method11539(6.0, 0.0, 12.0, 10.0, 7.0, 14.0);
   public static final VoxelShape field18538 = Block.method11539(5.0, 7.0, 2.0, 11.0, 13.0, 4.0);
   public static final VoxelShape field18539 = Block.method11539(5.0, 7.0, 12.0, 11.0, 13.0, 14.0);
   public static final VoxelShape field18540 = VoxelShapes.method27431(field18536, field18538);
   public static final VoxelShape field18541 = VoxelShapes.method27431(field18537, field18539);
   public static final VoxelShape field18542 = VoxelShapes.method27431(field18540, field18541);
   public static final VoxelShape field18543 = VoxelShapes.method27431(field18542, Block.method11539(2.0, 4.0, 4.0, 14.0, 16.0, 12.0));
   public static final VoxelShape field18544 = Block.method11539(2.0, 6.0, 0.0, 4.0, 10.0, 7.0);
   public static final VoxelShape field18545 = Block.method11539(12.0, 6.0, 0.0, 14.0, 10.0, 7.0);
   public static final VoxelShape field18546 = Block.method11539(2.0, 5.0, 7.0, 4.0, 11.0, 13.0);
   public static final VoxelShape field18547 = Block.method11539(12.0, 5.0, 7.0, 14.0, 11.0, 13.0);
   public static final VoxelShape field18548 = VoxelShapes.method27431(field18544, field18546);
   public static final VoxelShape field18549 = VoxelShapes.method27431(field18545, field18547);
   public static final VoxelShape field18550 = VoxelShapes.method27431(field18548, field18549);
   public static final VoxelShape field18551 = VoxelShapes.method27431(field18550, Block.method11539(4.0, 2.0, 4.0, 12.0, 14.0, 16.0));
   public static final VoxelShape field18552 = Block.method11539(2.0, 6.0, 7.0, 4.0, 10.0, 16.0);
   public static final VoxelShape field18553 = Block.method11539(12.0, 6.0, 7.0, 14.0, 10.0, 16.0);
   public static final VoxelShape field18554 = Block.method11539(2.0, 5.0, 3.0, 4.0, 11.0, 9.0);
   public static final VoxelShape field18555 = Block.method11539(12.0, 5.0, 3.0, 14.0, 11.0, 9.0);
   public static final VoxelShape field18556 = VoxelShapes.method27431(field18552, field18554);
   public static final VoxelShape field18557 = VoxelShapes.method27431(field18553, field18555);
   public static final VoxelShape field18558 = VoxelShapes.method27431(field18556, field18557);
   public static final VoxelShape field18559 = VoxelShapes.method27431(field18558, Block.method11539(4.0, 2.0, 0.0, 12.0, 14.0, 12.0));
   public static final VoxelShape field18560 = Block.method11539(7.0, 6.0, 2.0, 16.0, 10.0, 4.0);
   public static final VoxelShape field18561 = Block.method11539(7.0, 6.0, 12.0, 16.0, 10.0, 14.0);
   public static final VoxelShape field18562 = Block.method11539(3.0, 5.0, 2.0, 9.0, 11.0, 4.0);
   public static final VoxelShape field18563 = Block.method11539(3.0, 5.0, 12.0, 9.0, 11.0, 14.0);
   public static final VoxelShape field18564 = VoxelShapes.method27431(field18560, field18562);
   public static final VoxelShape field18565 = VoxelShapes.method27431(field18561, field18563);
   public static final VoxelShape field18566 = VoxelShapes.method27431(field18564, field18565);
   public static final VoxelShape field18567 = VoxelShapes.method27431(field18566, Block.method11539(0.0, 2.0, 4.0, 12.0, 14.0, 12.0));
   public static final VoxelShape field18568 = Block.method11539(0.0, 6.0, 2.0, 9.0, 10.0, 4.0);
   public static final VoxelShape field18569 = Block.method11539(0.0, 6.0, 12.0, 9.0, 10.0, 14.0);
   public static final VoxelShape field18570 = Block.method11539(7.0, 5.0, 2.0, 13.0, 11.0, 4.0);
   public static final VoxelShape field18571 = Block.method11539(7.0, 5.0, 12.0, 13.0, 11.0, 14.0);
   public static final VoxelShape field18572 = VoxelShapes.method27431(field18568, field18570);
   public static final VoxelShape field18573 = VoxelShapes.method27431(field18569, field18571);
   public static final VoxelShape field18574 = VoxelShapes.method27431(field18572, field18573);
   public static final VoxelShape field18575 = VoxelShapes.method27431(field18574, Block.method11539(4.0, 2.0, 4.0, 16.0, 14.0, 12.0));
   public static final VoxelShape field18576 = Block.method11539(2.0, 9.0, 6.0, 4.0, 16.0, 10.0);
   public static final VoxelShape field18577 = Block.method11539(12.0, 9.0, 6.0, 14.0, 16.0, 10.0);
   public static final VoxelShape field18578 = Block.method11539(2.0, 3.0, 5.0, 4.0, 9.0, 11.0);
   public static final VoxelShape field18579 = Block.method11539(12.0, 3.0, 5.0, 14.0, 9.0, 11.0);
   public static final VoxelShape field18580 = VoxelShapes.method27431(field18576, field18578);
   public static final VoxelShape field18581 = VoxelShapes.method27431(field18577, field18579);
   public static final VoxelShape field18582 = VoxelShapes.method27431(field18580, field18581);
   public static final VoxelShape field18583 = VoxelShapes.method27431(field18582, Block.method11539(4.0, 0.0, 2.0, 12.0, 12.0, 14.0));
   public static final VoxelShape field18584 = Block.method11539(6.0, 9.0, 2.0, 10.0, 16.0, 4.0);
   public static final VoxelShape field18585 = Block.method11539(6.0, 9.0, 12.0, 10.0, 16.0, 14.0);
   public static final VoxelShape field18586 = Block.method11539(5.0, 3.0, 2.0, 11.0, 9.0, 4.0);
   public static final VoxelShape field18587 = Block.method11539(5.0, 3.0, 12.0, 11.0, 9.0, 14.0);
   public static final VoxelShape field18588 = VoxelShapes.method27431(field18584, field18586);
   public static final VoxelShape field18589 = VoxelShapes.method27431(field18585, field18587);
   public static final VoxelShape field18590 = VoxelShapes.method27431(field18588, field18589);
   public static final VoxelShape field18591 = VoxelShapes.method27431(field18590, Block.method11539(2.0, 0.0, 4.0, 14.0, 12.0, 12.0));
   private static final ITextComponent field18592 = new TranslationTextComponent("container.grindstone_title");

   public Class3205(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18484, Direction.NORTH).method23465(field18500, Class103.field314));
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   private VoxelShape method11527(BlockState var1) {
      Direction var4 = var1.<Direction>method23463(field18484);
      switch (Class7707.field33093[var1.<Class103>method23463(field18500).ordinal()]) {
         case 1:
            if (var4 != Direction.NORTH && var4 != Direction.SOUTH) {
               return field18543;
            }

            return field18535;
         case 2:
            if (var4 == Direction.NORTH) {
               return field18559;
            } else if (var4 == Direction.SOUTH) {
               return field18551;
            } else {
               if (var4 == Direction.EAST) {
                  return field18575;
               }

               return field18567;
            }
         case 3:
            if (var4 != Direction.NORTH && var4 != Direction.SOUTH) {
               return field18591;
            }

            return field18583;
         default:
            return field18543;
      }
   }

   @Override
   public VoxelShape method11502(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return this.method11527(var1);
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return this.method11527(var1);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return true;
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40176);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5815(var2x, var3x, Class8786.method31714(var2, var3)), field18592);
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18484, var2.method252(var1.<Direction>method23463(field18484)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18484)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18484, field18500);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
