package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class4222 extends Class4213 {
   private static String[] field20550;

   public Class4222(Direction var1, Class9312 var2) {
      super(Class7792.field33470, 1, var1, var2, 1, 1, 1);
   }

   public Class4222(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33470, var2);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12927(var1, var5, 0, 3, 0, 2, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 5, 3, 0, 7, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 0, 2, 0, 1, 2, 7, field20529, field20529, false);
      this.method12927(var1, var5, 6, 2, 0, 7, 2, 7, field20529, field20529, false);
      this.method12927(var1, var5, 0, 1, 0, 0, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 7, 1, 0, 7, 1, 7, field20529, field20529, false);
      this.method12927(var1, var5, 0, 1, 7, 7, 3, 7, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 0, 2, 3, 0, field20529, field20529, false);
      this.method12927(var1, var5, 5, 1, 0, 6, 3, 0, field20529, field20529, false);
      if (Class9312.method35193(this.field20539)[Direction.NORTH.method533()]) {
         this.method13005(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (Class9312.method35193(this.field20539)[Direction.WEST.method533()]) {
         this.method13005(var1, var5, 0, 1, 3, 1, 2, 4);
      }

      if (Class9312.method35193(this.field20539)[Direction.EAST.method533()]) {
         this.method13005(var1, var5, 6, 1, 3, 7, 2, 4);
      }

      return true;
   }
}
