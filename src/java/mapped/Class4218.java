package mapped;

import java.util.Random;

public class Class4218 extends Class4213 {
   private static String[] field20546;

   public Class4218(Direction var1, Class9312 var2) {
      super(Class7792.field33466, 1, var1, var2, 2, 2, 1);
   }

   public Class4218(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33466, var2);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      Class9312 var10 = Class9312.method35191(this.field20539)[Direction.EAST.method533()];
      Class9312 var11 = this.field20539;
      Class9312 var12 = Class9312.method35191(var11)[Direction.field673.method533()];
      Class9312 var13 = Class9312.method35191(var10)[Direction.field673.method533()];
      if (Class9312.method35192(this.field20539) / 25 > 0) {
         this.method13006(var1, var5, 8, 0, Class9312.method35193(var10)[Direction.DOWN.method533()]);
         this.method13006(var1, var5, 0, 0, Class9312.method35193(var11)[Direction.DOWN.method533()]);
      }

      if (Class9312.method35191(var12)[Direction.field673.method533()] == null) {
         this.method13007(var1, var5, 1, 8, 1, 7, 8, 6, field20528);
      }

      if (Class9312.method35191(var13)[Direction.field673.method533()] == null) {
         this.method13007(var1, var5, 8, 8, 1, 14, 8, 6, field20528);
      }

      for (int var14 = 1; var14 <= 7; var14++) {
         BlockState var15 = field20529;
         if (var14 == 2 || var14 == 6) {
            var15 = field20528;
         }

         this.method12927(var1, var5, 0, var14, 0, 0, var14, 7, var15, var15, false);
         this.method12927(var1, var5, 15, var14, 0, 15, var14, 7, var15, var15, false);
         this.method12927(var1, var5, 1, var14, 0, 15, var14, 0, var15, var15, false);
         this.method12927(var1, var5, 1, var14, 7, 14, var14, 7, var15, var15, false);
      }

      this.method12927(var1, var5, 2, 1, 3, 2, 7, 4, field20529, field20529, false);
      this.method12927(var1, var5, 3, 1, 2, 4, 7, 2, field20529, field20529, false);
      this.method12927(var1, var5, 3, 1, 5, 4, 7, 5, field20529, field20529, false);
      this.method12927(var1, var5, 13, 1, 3, 13, 7, 4, field20529, field20529, false);
      this.method12927(var1, var5, 11, 1, 2, 12, 7, 2, field20529, field20529, false);
      this.method12927(var1, var5, 11, 1, 5, 12, 7, 5, field20529, field20529, false);
      this.method12927(var1, var5, 5, 1, 3, 5, 3, 4, field20529, field20529, false);
      this.method12927(var1, var5, 10, 1, 3, 10, 3, 4, field20529, field20529, false);
      this.method12927(var1, var5, 5, 7, 2, 10, 7, 5, field20529, field20529, false);
      this.method12927(var1, var5, 5, 5, 2, 5, 7, 2, field20529, field20529, false);
      this.method12927(var1, var5, 10, 5, 2, 10, 7, 2, field20529, field20529, false);
      this.method12927(var1, var5, 5, 5, 5, 5, 7, 5, field20529, field20529, false);
      this.method12927(var1, var5, 10, 5, 5, 10, 7, 5, field20529, field20529, false);
      this.method12923(var1, field20529, 6, 6, 2, var5);
      this.method12923(var1, field20529, 9, 6, 2, var5);
      this.method12923(var1, field20529, 6, 6, 5, var5);
      this.method12923(var1, field20529, 9, 6, 5, var5);
      this.method12927(var1, var5, 5, 4, 3, 6, 4, 4, field20529, field20529, false);
      this.method12927(var1, var5, 9, 4, 3, 10, 4, 4, field20529, field20529, false);
      this.method12923(var1, field20532, 5, 4, 2, var5);
      this.method12923(var1, field20532, 5, 4, 5, var5);
      this.method12923(var1, field20532, 10, 4, 2, var5);
      this.method12923(var1, field20532, 10, 4, 5, var5);
      if (Class9312.method35193(var11)[Direction.SOUTH.method533()]) {
         this.method13005(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (Class9312.method35193(var11)[Direction.NORTH.method533()]) {
         this.method13005(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (Class9312.method35193(var11)[Direction.WEST.method533()]) {
         this.method13005(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (Class9312.method35193(var10)[Direction.SOUTH.method533()]) {
         this.method13005(var1, var5, 11, 1, 0, 12, 2, 0);
      }

      if (Class9312.method35193(var10)[Direction.NORTH.method533()]) {
         this.method13005(var1, var5, 11, 1, 7, 12, 2, 7);
      }

      if (Class9312.method35193(var10)[Direction.EAST.method533()]) {
         this.method13005(var1, var5, 15, 1, 3, 15, 2, 4);
      }

      if (Class9312.method35193(var12)[Direction.SOUTH.method533()]) {
         this.method13005(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (Class9312.method35193(var12)[Direction.NORTH.method533()]) {
         this.method13005(var1, var5, 3, 5, 7, 4, 6, 7);
      }

      if (Class9312.method35193(var12)[Direction.WEST.method533()]) {
         this.method13005(var1, var5, 0, 5, 3, 0, 6, 4);
      }

      if (Class9312.method35193(var13)[Direction.SOUTH.method533()]) {
         this.method13005(var1, var5, 11, 5, 0, 12, 6, 0);
      }

      if (Class9312.method35193(var13)[Direction.NORTH.method533()]) {
         this.method13005(var1, var5, 11, 5, 7, 12, 6, 7);
      }

      if (Class9312.method35193(var13)[Direction.EAST.method533()]) {
         this.method13005(var1, var5, 15, 5, 3, 15, 6, 4);
      }

      return true;
   }
}
