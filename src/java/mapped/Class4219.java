package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class4219 extends Class4213 {
   private static String[] field20547;

   public Class4219(Direction var1, Class9312 var2) {
      super(Class7792.field33469, 1, var1, var2, 1, 1, 2);
   }

   public Class4219(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33469, var2);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      Class9312 var10 = Class9312.method35191(this.field20539)[Direction.NORTH.method533()];
      Class9312 var11 = this.field20539;
      if (Class9312.method35192(this.field20539) / 25 > 0) {
         this.method13006(var1, var5, 0, 8, Class9312.method35193(var10)[Direction.DOWN.method533()]);
         this.method13006(var1, var5, 0, 0, Class9312.method35193(var11)[Direction.DOWN.method533()]);
      }

      if (Class9312.method35191(var11)[Direction.field673.method533()] == null) {
         this.method13007(var1, var5, 1, 4, 1, 6, 4, 7, field20528);
      }

      if (Class9312.method35191(var10)[Direction.field673.method533()] == null) {
         this.method13007(var1, var5, 1, 4, 8, 6, 4, 14, field20528);
      }

      this.method12927(var1, var5, 0, 3, 0, 0, 3, 15, field20529, field20529, false);
      this.method12927(var1, var5, 7, 3, 0, 7, 3, 15, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 0, 7, 3, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 15, 6, 3, 15, field20529, field20529, false);
      this.method12927(var1, var5, 0, 2, 0, 0, 2, 15, field20528, field20528, false);
      this.method12927(var1, var5, 7, 2, 0, 7, 2, 15, field20528, field20528, false);
      this.method12927(var1, var5, 1, 2, 0, 7, 2, 0, field20528, field20528, false);
      this.method12927(var1, var5, 1, 2, 15, 6, 2, 15, field20528, field20528, false);
      this.method12927(var1, var5, 0, 1, 0, 0, 1, 15, field20529, field20529, false);
      this.method12927(var1, var5, 7, 1, 0, 7, 1, 15, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 0, 7, 1, 0, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 15, 6, 1, 15, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 1, 1, 1, 2, field20529, field20529, false);
      this.method12927(var1, var5, 6, 1, 1, 6, 1, 2, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 1, 1, 3, 2, field20529, field20529, false);
      this.method12927(var1, var5, 6, 3, 1, 6, 3, 2, field20529, field20529, false);
      this.method12927(var1, var5, 1, 1, 13, 1, 1, 14, field20529, field20529, false);
      this.method12927(var1, var5, 6, 1, 13, 6, 1, 14, field20529, field20529, false);
      this.method12927(var1, var5, 1, 3, 13, 1, 3, 14, field20529, field20529, false);
      this.method12927(var1, var5, 6, 3, 13, 6, 3, 14, field20529, field20529, false);
      this.method12927(var1, var5, 2, 1, 6, 2, 3, 6, field20529, field20529, false);
      this.method12927(var1, var5, 5, 1, 6, 5, 3, 6, field20529, field20529, false);
      this.method12927(var1, var5, 2, 1, 9, 2, 3, 9, field20529, field20529, false);
      this.method12927(var1, var5, 5, 1, 9, 5, 3, 9, field20529, field20529, false);
      this.method12927(var1, var5, 3, 2, 6, 4, 2, 6, field20529, field20529, false);
      this.method12927(var1, var5, 3, 2, 9, 4, 2, 9, field20529, field20529, false);
      this.method12927(var1, var5, 2, 2, 7, 2, 2, 8, field20529, field20529, false);
      this.method12927(var1, var5, 5, 2, 7, 5, 2, 8, field20529, field20529, false);
      this.method12923(var1, field20532, 2, 2, 5, var5);
      this.method12923(var1, field20532, 5, 2, 5, var5);
      this.method12923(var1, field20532, 2, 2, 10, var5);
      this.method12923(var1, field20532, 5, 2, 10, var5);
      this.method12923(var1, field20529, 2, 3, 5, var5);
      this.method12923(var1, field20529, 5, 3, 5, var5);
      this.method12923(var1, field20529, 2, 3, 10, var5);
      this.method12923(var1, field20529, 5, 3, 10, var5);
      if (Class9312.method35193(var11)[Direction.SOUTH.method533()]) {
         this.method13005(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (Class9312.method35193(var11)[Direction.EAST.method533()]) {
         this.method13005(var1, var5, 7, 1, 3, 7, 2, 4);
      }

      if (Class9312.method35193(var11)[Direction.WEST.method533()]) {
         this.method13005(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (Class9312.method35193(var10)[Direction.NORTH.method533()]) {
         this.method13005(var1, var5, 3, 1, 15, 4, 2, 15);
      }

      if (Class9312.method35193(var10)[Direction.WEST.method533()]) {
         this.method13005(var1, var5, 0, 1, 11, 0, 2, 12);
      }

      if (Class9312.method35193(var10)[Direction.EAST.method533()]) {
         this.method13005(var1, var5, 7, 1, 11, 7, 2, 12);
      }

      return true;
   }
}
