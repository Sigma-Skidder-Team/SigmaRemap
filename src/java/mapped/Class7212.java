package mapped;

import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;

import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class Class7212 {
   private static String[] field31009;
   private static final int field31010 = (int)Math.pow(16.0, 0.0);
   private static final int field31011 = (int)Math.pow(16.0, 1.0);
   private static final int field31012 = (int)Math.pow(16.0, 2.0);
   private static final Direction[] field31013 = Direction.values();
   private final BitSet field31014 = new BitSet(4096);
   private static final int[] field31015 = Util.<int[]>make(new int[1352], var0 -> {
      boolean var3 = false;
      byte var4 = 15;
      int var5 = 0;

      for (int var6 = 0; var6 < 16; var6++) {
         for (int var7 = 0; var7 < 16; var7++) {
            for (int var8 = 0; var8 < 16; var8++) {
               if (var6 == 0 || var6 == 15 || var7 == 0 || var7 == 15 || var8 == 0 || var8 == 15) {
                  var0[var5++] = method22648(var6, var7, var8);
               }
            }
         }
      }
   });
   private int field31016 = 4096;

   public void method22646(BlockPos var1) {
      this.field31014.set(method22647(var1), true);
      this.field31016--;
   }

   private static int method22647(BlockPos var0) {
      return method22648(var0.getX() & 15, var0.getY() & 15, var0.getZ() & 15);
   }

   private static int method22648(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }

   public Class9045 method22649() {
      Class9045 var3 = new Class9045();
      if (4096 - this.field31016 >= 256) {
         if (this.field31016 != 0) {
            for (int var7 : field31015) {
               if (!this.field31014.get(var7)) {
                  var3.method33632(this.method22650(var7));
               }
            }
         } else {
            var3.method33634(false);
         }
      } else {
         var3.method33634(true);
      }

      return var3;
   }

   private Set<Direction> method22650(int var1) {
      EnumSet var4 = EnumSet.<Direction>noneOf(Direction.class);
      IntArrayFIFOQueue var5 = new IntArrayFIFOQueue(384);
      var5.enqueue(var1);
      this.field31014.set(var1, true);

      while (!var5.isEmpty()) {
         int var6 = var5.dequeueInt();
         this.method22651(var6, var4);

         for (Direction var10 : field31013) {
            int var11 = this.method22652(var6, var10);
            if (var11 >= 0 && !this.field31014.get(var11)) {
               this.field31014.set(var11, true);
               var5.enqueue(var11);
            }
         }
      }

      return var4;
   }

   private void method22651(int var1, Set<Direction> var2) {
      int var5 = var1 >> 0 & 15;
      if (var5 != 0) {
         if (var5 == 15) {
            var2.add(Direction.EAST);
         }
      } else {
         var2.add(Direction.WEST);
      }

      int var6 = var1 >> 8 & 15;
      if (var6 != 0) {
         if (var6 == 15) {
            var2.add(Direction.field673);
         }
      } else {
         var2.add(Direction.DOWN);
      }

      int var7 = var1 >> 4 & 15;
      if (var7 != 0) {
         if (var7 == 15) {
            var2.add(Direction.SOUTH);
         }
      } else {
         var2.add(Direction.NORTH);
      }
   }

   private int method22652(int var1, Direction var2) {
      switch (Class9461.field43961[var2.ordinal()]) {
         case 1:
            if ((var1 >> 8 & 15) == 0) {
               return -1;
            }

            return var1 - field31012;
         case 2:
            if ((var1 >> 8 & 15) == 15) {
               return -1;
            }

            return var1 + field31012;
         case 3:
            if ((var1 >> 4 & 15) == 0) {
               return -1;
            }

            return var1 - field31011;
         case 4:
            if ((var1 >> 4 & 15) == 15) {
               return -1;
            }

            return var1 + field31011;
         case 5:
            if ((var1 >> 0 & 15) == 0) {
               return -1;
            }

            return var1 - field31010;
         case 6:
            if ((var1 >> 0 & 15) == 15) {
               return -1;
            }

            return var1 + field31010;
         default:
            return -1;
      }
   }
}
