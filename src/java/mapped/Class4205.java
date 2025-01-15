package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class Class4205 extends Class4194 {
   public final int field20512;

   public Class4205(int var1, Random var2, MutableBoundingBox var3, Direction var4) {
      super(Class7792.field33452, var1);
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
      this.field20512 = var2.nextInt(5);
   }

   public Class4205(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33452, var2);
      this.field20512 = var2.getInt("Type");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putInt("Type", this.field20512);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12986((Class4196)var1, var2, var3, 4, 1);
      this.method12987((Class4196)var1, var2, var3, 1, 4);
      this.method12988((Class4196)var1, var2, var3, 1, 4);
   }

   public static Class4205 method12998(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      MutableBoundingBox var9 = MutableBoundingBox.method38388(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4205(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 10, 6, 10, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 4, 1, 0);
      this.method12927(var1, var5, 4, 1, 10, 6, 3, 10, field20443, field20443, false);
      this.method12927(var1, var5, 0, 1, 4, 0, 3, 6, field20443, field20443, false);
      this.method12927(var1, var5, 10, 1, 4, 10, 3, 6, field20443, field20443, false);
      switch (this.field20512) {
         case 0:
            this.method12923(var1, Blocks.field36615.getDefaultState(), 5, 1, 5, var5);
            this.method12923(var1, Blocks.field36615.getDefaultState(), 5, 2, 5, var5);
            this.method12923(var1, Blocks.field36615.getDefaultState(), 5, 3, 5, var5);
            this.method12923(var1, Blocks.WALL_TORCH.getDefaultState().with(Class3382.field18985, Direction.WEST), 4, 3, 5, var5);
            this.method12923(var1, Blocks.WALL_TORCH.getDefaultState().with(Class3382.field18985, Direction.EAST), 6, 3, 5, var5);
            this.method12923(var1, Blocks.WALL_TORCH.getDefaultState().with(Class3382.field18985, Direction.SOUTH), 5, 3, 4, var5);
            this.method12923(var1, Blocks.WALL_TORCH.getDefaultState().with(Class3382.field18985, Direction.NORTH), 5, 3, 6, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 4, 1, 4, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 4, 1, 5, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 4, 1, 6, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 6, 1, 4, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 6, 1, 5, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 6, 1, 6, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 5, 1, 4, var5);
            this.method12923(var1, Blocks.field36846.getDefaultState(), 5, 1, 6, var5);
            break;
         case 1:
            for (int var15 = 0; var15 < 5; var15++) {
               this.method12923(var1, Blocks.field36615.getDefaultState(), 3, 1, 3 + var15, var5);
               this.method12923(var1, Blocks.field36615.getDefaultState(), 7, 1, 3 + var15, var5);
               this.method12923(var1, Blocks.field36615.getDefaultState(), 3 + var15, 1, 3, var5);
               this.method12923(var1, Blocks.field36615.getDefaultState(), 3 + var15, 1, 7, var5);
            }

            this.method12923(var1, Blocks.field36615.getDefaultState(), 5, 1, 5, var5);
            this.method12923(var1, Blocks.field36615.getDefaultState(), 5, 2, 5, var5);
            this.method12923(var1, Blocks.field36615.getDefaultState(), 5, 3, 5, var5);
            this.method12923(var1, Blocks.WATER.getDefaultState(), 5, 4, 5, var5);
            break;
         case 2:
            for (int var10 = 1; var10 <= 9; var10++) {
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 1, 3, var10, var5);
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 9, 3, var10, var5);
            }

            for (int var11 = 1; var11 <= 9; var11++) {
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), var11, 3, 1, var5);
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), var11, 3, 9, var5);
            }

            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 5, 1, 4, var5);
            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 5, 1, 6, var5);
            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 5, 3, 4, var5);
            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 5, 3, 6, var5);
            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 4, 1, 5, var5);
            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 6, 1, 5, var5);
            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 4, 3, 5, var5);
            this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 6, 3, 5, var5);

            for (int var12 = 1; var12 <= 3; var12++) {
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 4, var12, 4, var5);
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 6, var12, 4, var5);
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 4, var12, 6, var5);
               this.method12923(var1, Blocks.COBBLESTONE.getDefaultState(), 6, var12, 6, var5);
            }

            this.method12923(var1, Blocks.TORCH.getDefaultState(), 5, 3, 5, var5);

            for (int var13 = 2; var13 <= 8; var13++) {
               this.method12923(var1, Blocks.OAK_PLANKS.getDefaultState(), 2, 3, var13, var5);
               this.method12923(var1, Blocks.OAK_PLANKS.getDefaultState(), 3, 3, var13, var5);
               if (var13 <= 3 || var13 >= 7) {
                  this.method12923(var1, Blocks.OAK_PLANKS.getDefaultState(), 4, 3, var13, var5);
                  this.method12923(var1, Blocks.OAK_PLANKS.getDefaultState(), 5, 3, var13, var5);
                  this.method12923(var1, Blocks.OAK_PLANKS.getDefaultState(), 6, 3, var13, var5);
               }

               this.method12923(var1, Blocks.OAK_PLANKS.getDefaultState(), 7, 3, var13, var5);
               this.method12923(var1, Blocks.OAK_PLANKS.getDefaultState(), 8, 3, var13, var5);
            }

            BlockState var14 = Blocks.LADDER.getDefaultState().with(Class3423.field19154, Direction.WEST);
            this.method12923(var1, var14, 9, 1, 3, var5);
            this.method12923(var1, var14, 9, 2, 3, var5);
            this.method12923(var1, var14, 9, 3, 3, var5);
            this.method12933(var1, var5, var4, 3, 4, 8, Class8793.field39556);
      }

      return true;
   }
}
