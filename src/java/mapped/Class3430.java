package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.RailShape;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3430 extends Class3429 {
   private static String[] field19190;
   public static final EnumProperty<RailShape> field19191 = BlockStateProperties.field39736;

   public Class3430(Properties var1) {
      super(false, var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19191, RailShape.field247));
   }

   @Override
   public void method12091(BlockState var1, World var2, BlockPos var3, Block var4) {
      if (var4.getDefaultState().method23401() && new Class9435(var2, var3, var1).method36240() == 3) {
         this.method12092(var2, var3, var1, false);
      }
   }

   @Override
   public Property<RailShape> method12093() {
      return field19191;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      switch (Class8191.field35214[var2.ordinal()]) {
         case 1:
            switch (Class8191.field35213[var1.<RailShape>get(field19191).ordinal()]) {
               case 1:
                  return var1.with(field19191, RailShape.field250);
               case 2:
                  return var1.with(field19191, RailShape.field249);
               case 3:
                  return var1.with(field19191, RailShape.field252);
               case 4:
                  return var1.with(field19191, RailShape.field251);
               case 5:
                  return var1.with(field19191, RailShape.field255);
               case 6:
                  return var1.with(field19191, RailShape.field256);
               case 7:
                  return var1.with(field19191, RailShape.field253);
               case 8:
                  return var1.with(field19191, RailShape.field254);
            }
         case 2:
            switch (Class8191.field35213[var1.<RailShape>get(field19191).ordinal()]) {
               case 1:
                  return var1.with(field19191, RailShape.field251);
               case 2:
                  return var1.with(field19191, RailShape.field252);
               case 3:
                  return var1.with(field19191, RailShape.field250);
               case 4:
                  return var1.with(field19191, RailShape.field249);
               case 5:
                  return var1.with(field19191, RailShape.field256);
               case 6:
                  return var1.with(field19191, RailShape.field253);
               case 7:
                  return var1.with(field19191, RailShape.field254);
               case 8:
                  return var1.with(field19191, RailShape.field255);
               case 9:
                  return var1.with(field19191, RailShape.field248);
               case 10:
                  return var1.with(field19191, RailShape.field247);
            }
         case 3:
            switch (Class8191.field35213[var1.<RailShape>get(field19191).ordinal()]) {
               case 1:
                  return var1.with(field19191, RailShape.field252);
               case 2:
                  return var1.with(field19191, RailShape.field251);
               case 3:
                  return var1.with(field19191, RailShape.field249);
               case 4:
                  return var1.with(field19191, RailShape.field250);
               case 5:
                  return var1.with(field19191, RailShape.field254);
               case 6:
                  return var1.with(field19191, RailShape.field255);
               case 7:
                  return var1.with(field19191, RailShape.field256);
               case 8:
                  return var1.with(field19191, RailShape.field253);
               case 9:
                  return var1.with(field19191, RailShape.field248);
               case 10:
                  return var1.with(field19191, RailShape.field247);
            }
         default:
            return var1;
      }
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      RailShape var5 = var1.<RailShape>get(field19191);
      switch (Class8191.field35215[var2.ordinal()]) {
         case 1:
            switch (Class8191.field35213[var5.ordinal()]) {
               case 3:
                  return var1.with(field19191, RailShape.field252);
               case 4:
                  return var1.with(field19191, RailShape.field251);
               case 5:
                  return var1.with(field19191, RailShape.field256);
               case 6:
                  return var1.with(field19191, RailShape.field255);
               case 7:
                  return var1.with(field19191, RailShape.field254);
               case 8:
                  return var1.with(field19191, RailShape.field253);
               default:
                  return super.mirror(var1, var2);
            }
         case 2:
            switch (Class8191.field35213[var5.ordinal()]) {
               case 1:
                  return var1.with(field19191, RailShape.field250);
               case 2:
                  return var1.with(field19191, RailShape.field249);
               case 3:
               case 4:
               default:
                  break;
               case 5:
                  return var1.with(field19191, RailShape.field254);
               case 6:
                  return var1.with(field19191, RailShape.field253);
               case 7:
                  return var1.with(field19191, RailShape.field256);
               case 8:
                  return var1.with(field19191, RailShape.field255);
            }
         default:
            return super.mirror(var1, var2);
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19191);
   }
}
