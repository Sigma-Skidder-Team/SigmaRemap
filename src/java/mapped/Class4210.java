package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4210 extends Class4209 {
   private boolean field20520;
   private boolean field20521;

   public Class4210(Random var1, int var2, int var3) {
      super(Class7792.field33461, var1, var2, 64, var3, 7, 7, 9);
   }

   public Class4210(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33461, var2);
      this.field20520 = var2.getBoolean("Witch");
      this.field20521 = var2.getBoolean("Cat");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putBoolean("Witch", this.field20520);
      var1.putBoolean("Cat", this.field20521);
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      if (!this.method13002(var1, var5, 0)) {
         return false;
      } else {
         this.method12927(var1, var5, 1, 1, 1, 5, 1, 7, Blocks.SPRUCE_PLANKS.getDefaultState(), Blocks.SPRUCE_PLANKS.getDefaultState(), false);
         this.method12927(var1, var5, 1, 4, 2, 5, 4, 7, Blocks.SPRUCE_PLANKS.getDefaultState(), Blocks.SPRUCE_PLANKS.getDefaultState(), false);
         this.method12927(var1, var5, 2, 1, 0, 4, 1, 0, Blocks.SPRUCE_PLANKS.getDefaultState(), Blocks.SPRUCE_PLANKS.getDefaultState(), false);
         this.method12927(var1, var5, 2, 2, 2, 3, 3, 2, Blocks.SPRUCE_PLANKS.getDefaultState(), Blocks.SPRUCE_PLANKS.getDefaultState(), false);
         this.method12927(var1, var5, 1, 2, 3, 1, 3, 6, Blocks.SPRUCE_PLANKS.getDefaultState(), Blocks.SPRUCE_PLANKS.getDefaultState(), false);
         this.method12927(var1, var5, 5, 2, 3, 5, 3, 6, Blocks.SPRUCE_PLANKS.getDefaultState(), Blocks.SPRUCE_PLANKS.getDefaultState(), false);
         this.method12927(var1, var5, 2, 2, 7, 4, 3, 7, Blocks.SPRUCE_PLANKS.getDefaultState(), Blocks.SPRUCE_PLANKS.getDefaultState(), false);
         this.method12927(var1, var5, 1, 0, 2, 1, 3, 2, Blocks.field36422.getDefaultState(), Blocks.field36422.getDefaultState(), false);
         this.method12927(var1, var5, 5, 0, 2, 5, 3, 2, Blocks.field36422.getDefaultState(), Blocks.field36422.getDefaultState(), false);
         this.method12927(var1, var5, 1, 0, 7, 1, 3, 7, Blocks.field36422.getDefaultState(), Blocks.field36422.getDefaultState(), false);
         this.method12927(var1, var5, 5, 0, 7, 5, 3, 7, Blocks.field36422.getDefaultState(), Blocks.field36422.getDefaultState(), false);
         this.method12923(var1, Blocks.OAK_FENCE.getDefaultState(), 2, 3, 2, var5);
         this.method12923(var1, Blocks.OAK_FENCE.getDefaultState(), 3, 3, 7, var5);
         this.method12923(var1, Blocks.AIR.getDefaultState(), 1, 3, 4, var5);
         this.method12923(var1, Blocks.AIR.getDefaultState(), 5, 3, 4, var5);
         this.method12923(var1, Blocks.AIR.getDefaultState(), 5, 3, 5, var5);
         this.method12923(var1, Blocks.field36689.getDefaultState(), 1, 3, 5, var5);
         this.method12923(var1, Blocks.CRAFTING_TABLE.getDefaultState(), 3, 2, 6, var5);
         this.method12923(var1, Blocks.field36648.getDefaultState(), 4, 2, 6, var5);
         this.method12923(var1, Blocks.OAK_FENCE.getDefaultState(), 1, 2, 1, var5);
         this.method12923(var1, Blocks.OAK_FENCE.getDefaultState(), 5, 2, 1, var5);
         BlockState var10 = Blocks.SPRUCE_STAIRS.getDefaultState().with(StairsBlock.FACING, Direction.NORTH);
         BlockState var11 = Blocks.SPRUCE_STAIRS.getDefaultState().with(StairsBlock.FACING, Direction.EAST);
         BlockState var12 = Blocks.SPRUCE_STAIRS.getDefaultState().with(StairsBlock.FACING, Direction.WEST);
         BlockState var13 = Blocks.SPRUCE_STAIRS.getDefaultState().with(StairsBlock.FACING, Direction.SOUTH);
         this.method12927(var1, var5, 0, 4, 1, 6, 4, 1, var10, var10, false);
         this.method12927(var1, var5, 0, 4, 2, 0, 4, 7, var11, var11, false);
         this.method12927(var1, var5, 6, 4, 2, 6, 4, 7, var12, var12, false);
         this.method12927(var1, var5, 0, 4, 8, 6, 4, 8, var13, var13, false);
         this.method12923(var1, var10.with(StairsBlock.SHAPE, StairsShape.OUTER_RIGHT), 0, 4, 1, var5);
         this.method12923(var1, var10.with(StairsBlock.SHAPE, StairsShape.OUTER_LEFT), 6, 4, 1, var5);
         this.method12923(var1, var13.with(StairsBlock.SHAPE, StairsShape.OUTER_LEFT), 0, 4, 8, var5);
         this.method12923(var1, var13.with(StairsBlock.SHAPE, StairsShape.OUTER_RIGHT), 6, 4, 8, var5);

         for (int var14 = 2; var14 <= 7; var14 += 5) {
            for (int var15 = 1; var15 <= 5; var15 += 4) {
               this.method12932(var1, Blocks.field36422.getDefaultState(), var15, -1, var14, var5);
            }
         }

         if (!this.field20520) {
            int var18 = this.method12920(2, 5);
            int var19 = this.method12921(2);
            int var16 = this.method12922(2, 5);
            if (var5.method38396(new BlockPos(var18, var19, var16))) {
               this.field20520 = true;
               WitchEntity var17 = EntityType.WITCH.create(var1.method6970());
               var17.method4278();
               var17.setLocationAndAngles((double)var18 + 0.5, (double)var19, (double)var16 + 0.5, 0.0F, 0.0F);
               var17.method4276(var1, var1.method6807(new BlockPos(var18, var19, var16)), SpawnReason.field14394, (Class5093)null, (CompoundNBT)null);
               var1.method6995(var17);
            }
         }

         this.method13003(var1, var5);
         return true;
      }
   }

   private void method13003(ServerWorldAccess var1, MutableBoundingBox var2) {
      if (!this.field20521) {
         int var5 = this.method12920(2, 5);
         int var6 = this.method12921(2);
         int var7 = this.method12922(2, 5);
         if (var2.method38396(new BlockPos(var5, var6, var7))) {
            this.field20521 = true;
            CatEntity var8 = EntityType.CAT.create(var1.method6970());
            var8.method4278();
            var8.setLocationAndAngles((double)var5 + 0.5, (double)var6, (double)var7 + 0.5, 0.0F, 0.0F);
            var8.method4276(var1, var1.method6807(new BlockPos(var5, var6, var7)), SpawnReason.field14394, (Class5093)null, (CompoundNBT)null);
            var1.method6995(var8);
         }
      }
   }
}
