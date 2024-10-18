package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4223 extends Class4213 {
   private static String[] field20551;

   public Class4223(Direction var1, Class9312 var2) {
      super(Class7792.field33465, 1, var1, var2, 2, 1, 1);
   }

   public Class4223(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33465, var2);
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      Class9312 var10 = Class9312.method35191(this.field20539)[Direction.EAST.getIndex()];
      Class9312 var11 = this.field20539;
      if (Class9312.method35192(this.field20539) / 25 > 0) {
         this.method13006(var1, var5, 8, 0, Class9312.method35193(var10)[Direction.DOWN.getIndex()]);
         this.method13006(var1, var5, 0, 0, Class9312.method35193(var11)[Direction.DOWN.getIndex()]);
      }

      if (Class9312.method35191(var11)[Direction.UP.getIndex()] == null) {
         this.method13007(var1, var5, 1, 4, 1, 7, 4, 6, field20528);
      }

      if (Class9312.method35191(var10)[Direction.UP.getIndex()] == null) {
         this.method13007(var1, var5, 8, 4, 1, 14, 4, 6, field20528);
      }

      this.method12927(var1, var5, 0, 3, 0, 0, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 15, 3, 0, 15, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 0, 15, 3, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 7, 14, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 0, 2, 0, 0, 2, 7, field20528, field20528, false);
      this.method12927(var1, var5, 15, 2, 0, 15, 2, 7, field20528, field20528, false);
      this.method12927(var1, var5, 1, 2, 0, 15, 2, 0, field20528, field20528, false);
      this.method12927(var1, var5, 1, 2, 7, 14, 2, 7, field20528, field20528, false);
      this.method12927(var1, var5, 0, 1, 0, 0, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 15, 1, 0, 15, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 0, 15, 1, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 7, 14, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 5, 1, 0, 10, 1, 4, field20529, field20529, false);
      this.method12927(var1, var5, 6, 2, 0, 9, 2, 3, field20528, field20528, false);
      this.method12927(var1, var5, 5, 3, 0, 10, 3, 4, field20529, field20529, false);
      this.method12923(var1, field20532, 6, 2, 3, var5);
      this.method12923(var1, field20532, 9, 2, 3, var5);
      if (Class9312.method35193(var11)[Direction.SOUTH.getIndex()]) {
         this.method13005(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (Class9312.method35193(var11)[Direction.NORTH.getIndex()]) {
         this.method13005(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (Class9312.method35193(var11)[Direction.WEST.getIndex()]) {
         this.method13005(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (Class9312.method35193(var10)[Direction.SOUTH.getIndex()]) {
         this.method13005(var1, var5, 11, 1, 0, 12, 2, 0);
      }

      if (Class9312.method35193(var10)[Direction.NORTH.getIndex()]) {
         this.method13005(var1, var5, 11, 1, 7, 12, 2, 7);
      }

      if (Class9312.method35193(var10)[Direction.EAST.getIndex()]) {
         this.method13005(var1, var5, 15, 1, 3, 15, 2, 4);
      }

      return true;
   }
}
