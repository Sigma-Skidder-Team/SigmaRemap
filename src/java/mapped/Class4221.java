package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4221 extends Class4213 {
   private static String[] field20549;

   public Class4221(Direction var1, Class9312 var2) {
      super(Class7792.field33467, 1, var1, var2, 1, 2, 1);
   }

   public Class4221(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33467, var2);
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      if (Class9312.method35192(this.field20539) / 25 > 0) {
         this.method13006(var1, var5, 0, 0, Class9312.method35193(this.field20539)[Direction.DOWN.getIndex()]);
      }

      Class9312 var10 = Class9312.method35191(this.field20539)[Direction.UP.getIndex()];
      if (Class9312.method35191(var10)[Direction.UP.getIndex()] == null) {
         this.method13007(var1, var5, 1, 8, 1, 6, 8, 6, field20528);
      }

      this.method12927(var1, var5, 0, 4, 0, 0, 4, 7, field20529, field20529, false);
      this.method12927(var1, var5, 7, 4, 0, 7, 4, 7, field20529, field20529, false);
      this.method12927(var1, var5, 1, 4, 0, 6, 4, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 4, 7, 6, 4, 7, field20529, field20529, false);
      this.method12927(var1, var5, 2, 4, 1, 2, 4, 2, field20529, field20529, false);
      this.method12927(var1, var5, 1, 4, 2, 1, 4, 2, field20529, field20529, false);
      this.method12927(var1, var5, 5, 4, 1, 5, 4, 2, field20529, field20529, false);
      this.method12927(var1, var5, 6, 4, 2, 6, 4, 2, field20529, field20529, false);
      this.method12927(var1, var5, 2, 4, 5, 2, 4, 6, field20529, field20529, false);
      this.method12927(var1, var5, 1, 4, 5, 1, 4, 5, field20529, field20529, false);
      this.method12927(var1, var5, 5, 4, 5, 5, 4, 6, field20529, field20529, false);
      this.method12927(var1, var5, 6, 4, 5, 6, 4, 5, field20529, field20529, false);
      Class9312 var11 = this.field20539;

      for (int var12 = 1; var12 <= 5; var12 += 4) {
         int var13 = 0;
         if (!Class9312.method35193(var11)[Direction.SOUTH.getIndex()]) {
            this.method12927(var1, var5, 0, var12, var13, 7, var12 + 2, var13, field20529, field20529, false);
            this.method12927(var1, var5, 0, var12 + 1, var13, 7, var12 + 1, var13, field20528, field20528, false);
         } else {
            this.method12927(var1, var5, 2, var12, var13, 2, var12 + 2, var13, field20529, field20529, false);
            this.method12927(var1, var5, 5, var12, var13, 5, var12 + 2, var13, field20529, field20529, false);
            this.method12927(var1, var5, 3, var12 + 2, var13, 4, var12 + 2, var13, field20529, field20529, false);
         }

         var13 = 7;
         if (!Class9312.method35193(var11)[Direction.NORTH.getIndex()]) {
            this.method12927(var1, var5, 0, var12, var13, 7, var12 + 2, var13, field20529, field20529, false);
            this.method12927(var1, var5, 0, var12 + 1, var13, 7, var12 + 1, var13, field20528, field20528, false);
         } else {
            this.method12927(var1, var5, 2, var12, var13, 2, var12 + 2, var13, field20529, field20529, false);
            this.method12927(var1, var5, 5, var12, var13, 5, var12 + 2, var13, field20529, field20529, false);
            this.method12927(var1, var5, 3, var12 + 2, var13, 4, var12 + 2, var13, field20529, field20529, false);
         }

         int var14 = 0;
         if (!Class9312.method35193(var11)[Direction.WEST.getIndex()]) {
            this.method12927(var1, var5, var14, var12, 0, var14, var12 + 2, 7, field20529, field20529, false);
            this.method12927(var1, var5, var14, var12 + 1, 0, var14, var12 + 1, 7, field20528, field20528, false);
         } else {
            this.method12927(var1, var5, var14, var12, 2, var14, var12 + 2, 2, field20529, field20529, false);
            this.method12927(var1, var5, var14, var12, 5, var14, var12 + 2, 5, field20529, field20529, false);
            this.method12927(var1, var5, var14, var12 + 2, 3, var14, var12 + 2, 4, field20529, field20529, false);
         }

         var14 = 7;
         if (!Class9312.method35193(var11)[Direction.EAST.getIndex()]) {
            this.method12927(var1, var5, var14, var12, 0, var14, var12 + 2, 7, field20529, field20529, false);
            this.method12927(var1, var5, var14, var12 + 1, 0, var14, var12 + 1, 7, field20528, field20528, false);
         } else {
            this.method12927(var1, var5, var14, var12, 2, var14, var12 + 2, 2, field20529, field20529, false);
            this.method12927(var1, var5, var14, var12, 5, var14, var12 + 2, 5, field20529, field20529, false);
            this.method12927(var1, var5, var14, var12 + 2, 3, var14, var12 + 2, 4, field20529, field20529, false);
         }

         var11 = var10;
      }

      return true;
   }
}
