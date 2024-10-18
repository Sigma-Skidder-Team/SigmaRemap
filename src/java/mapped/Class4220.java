package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4220 extends Class4213 {
   private static String[] field20548;

   public Class4220(Direction var1, Class9312 var2) {
      super(Class7792.field33468, 1, var1, var2, 1, 2, 2);
   }

   public Class4220(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33468, var2);
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      Class9312 var10 = Class9312.method35191(this.field20539)[Direction.NORTH.getIndex()];
      Class9312 var11 = this.field20539;
      Class9312 var12 = Class9312.method35191(var10)[Direction.UP.getIndex()];
      Class9312 var13 = Class9312.method35191(var11)[Direction.UP.getIndex()];
      if (Class9312.method35192(this.field20539) / 25 > 0) {
         this.method13006(var1, var5, 0, 8, Class9312.method35193(var10)[Direction.DOWN.getIndex()]);
         this.method13006(var1, var5, 0, 0, Class9312.method35193(var11)[Direction.DOWN.getIndex()]);
      }

      if (Class9312.method35191(var13)[Direction.UP.getIndex()] == null) {
         this.method13007(var1, var5, 1, 8, 1, 6, 8, 7, field20528);
      }

      if (Class9312.method35191(var12)[Direction.UP.getIndex()] == null) {
         this.method13007(var1, var5, 1, 8, 8, 6, 8, 14, field20528);
      }

      for (int var14 = 1; var14 <= 7; var14++) {
         BlockState var15 = field20529;
         if (var14 == 2 || var14 == 6) {
            var15 = field20528;
         }

         this.method12927(var1, var5, 0, var14, 0, 0, var14, 15, var15, var15, false);
         this.method12927(var1, var5, 7, var14, 0, 7, var14, 15, var15, var15, false);
         this.method12927(var1, var5, 1, var14, 0, 6, var14, 0, var15, var15, false);
         this.method12927(var1, var5, 1, var14, 15, 6, var14, 15, var15, var15, false);
      }

      for (int var16 = 1; var16 <= 7; var16++) {
         BlockState var17 = field20530;
         if (var16 == 2 || var16 == 6) {
            var17 = field20532;
         }

         this.method12927(var1, var5, 3, var16, 7, 4, var16, 8, var17, var17, false);
      }

      if (Class9312.method35193(var11)[Direction.SOUTH.getIndex()]) {
         this.method13005(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (Class9312.method35193(var11)[Direction.EAST.getIndex()]) {
         this.method13005(var1, var5, 7, 1, 3, 7, 2, 4);
      }

      if (Class9312.method35193(var11)[Direction.WEST.getIndex()]) {
         this.method13005(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (Class9312.method35193(var10)[Direction.NORTH.getIndex()]) {
         this.method13005(var1, var5, 3, 1, 15, 4, 2, 15);
      }

      if (Class9312.method35193(var10)[Direction.WEST.getIndex()]) {
         this.method13005(var1, var5, 0, 1, 11, 0, 2, 12);
      }

      if (Class9312.method35193(var10)[Direction.EAST.getIndex()]) {
         this.method13005(var1, var5, 7, 1, 11, 7, 2, 12);
      }

      if (Class9312.method35193(var13)[Direction.SOUTH.getIndex()]) {
         this.method13005(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (Class9312.method35193(var13)[Direction.EAST.getIndex()]) {
         this.method13005(var1, var5, 7, 5, 3, 7, 6, 4);
         this.method12927(var1, var5, 5, 4, 2, 6, 4, 5, field20529, field20529, false);
         this.method12927(var1, var5, 6, 1, 2, 6, 3, 2, field20529, field20529, false);
         this.method12927(var1, var5, 6, 1, 5, 6, 3, 5, field20529, field20529, false);
      }

      if (Class9312.method35193(var13)[Direction.WEST.getIndex()]) {
         this.method13005(var1, var5, 0, 5, 3, 0, 6, 4);
         this.method12927(var1, var5, 1, 4, 2, 2, 4, 5, field20529, field20529, false);
         this.method12927(var1, var5, 1, 1, 2, 1, 3, 2, field20529, field20529, false);
         this.method12927(var1, var5, 1, 1, 5, 1, 3, 5, field20529, field20529, false);
      }

      if (Class9312.method35193(var12)[Direction.NORTH.getIndex()]) {
         this.method13005(var1, var5, 3, 5, 15, 4, 6, 15);
      }

      if (Class9312.method35193(var12)[Direction.WEST.getIndex()]) {
         this.method13005(var1, var5, 0, 5, 11, 0, 6, 12);
         this.method12927(var1, var5, 1, 4, 10, 2, 4, 13, field20529, field20529, false);
         this.method12927(var1, var5, 1, 1, 10, 1, 3, 10, field20529, field20529, false);
         this.method12927(var1, var5, 1, 1, 13, 1, 3, 13, field20529, field20529, false);
      }

      if (Class9312.method35193(var12)[Direction.EAST.getIndex()]) {
         this.method13005(var1, var5, 7, 5, 11, 7, 6, 12);
         this.method12927(var1, var5, 5, 4, 10, 6, 4, 13, field20529, field20529, false);
         this.method12927(var1, var5, 6, 1, 10, 6, 3, 10, field20529, field20529, false);
         this.method12927(var1, var5, 6, 1, 13, 6, 3, 13, field20529, field20529, false);
      }

      return true;
   }
}
