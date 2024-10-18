package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4214 extends Class4213 {
   private static String[] field20540;

   public Class4214(Direction var1, Class9312 var2) {
      super(Class7792.field33473, 1, var1, var2, 1, 1, 1);
   }

   public Class4214(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33473, var2);
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      if (Class9312.method35192(this.field20539) / 25 > 0) {
         this.method13006(var1, var5, 0, 0, Class9312.method35193(this.field20539)[Direction.DOWN.getIndex()]);
      }

      if (Class9312.method35191(this.field20539)[Direction.UP.getIndex()] == null) {
         this.method13007(var1, var5, 1, 4, 1, 6, 4, 6, field20528);
      }

      for (int var10 = 1; var10 <= 6; var10++) {
         for (int var11 = 1; var11 <= 6; var11++) {
            if (var4.nextInt(3) != 0) {
               int var12 = 2 + (var4.nextInt(4) != 0 ? 1 : 0);
               BlockState var13 = Blocks.field36453.getDefaultState();
               this.method12927(var1, var5, var10, var12, var11, var10, 3, var11, var13, var13, false);
            }
         }
      }

      this.method12927(var1, var5, 0, 1, 0, 0, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 7, 1, 0, 7, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 0, 6, 1, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 7, 6, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 0, 2, 0, 0, 2, 7, field20530, field20530, false);
      this.method12927(var1, var5, 7, 2, 0, 7, 2, 7, field20530, field20530, false);
      this.method12927(var1, var5, 1, 2, 0, 6, 2, 0, field20530, field20530, false);
      this.method12927(var1, var5, 1, 2, 7, 6, 2, 7, field20530, field20530, false);
      this.method12927(var1, var5, 0, 3, 0, 0, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 7, 3, 0, 7, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 0, 6, 3, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 7, 6, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 0, 1, 3, 0, 2, 4, field20530, field20530, false);
      this.method12927(var1, var5, 7, 1, 3, 7, 2, 4, field20530, field20530, false);
      this.method12927(var1, var5, 3, 1, 0, 4, 2, 0, field20530, field20530, false);
      this.method12927(var1, var5, 3, 1, 7, 4, 2, 7, field20530, field20530, false);
      if (Class9312.method35193(this.field20539)[Direction.SOUTH.getIndex()]) {
         this.method13005(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      return true;
   }
}
