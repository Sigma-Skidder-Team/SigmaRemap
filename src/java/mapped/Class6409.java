package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;

import java.util.Arrays;

public final class Class6409 extends VoxelShape {
   private final DoubleList field28035;
   private final DoubleList field28036;
   private final DoubleList field28037;

   public Class6409(Class7938 var1, double[] var2, double[] var3, double[] var4) {
      this(
         var1,
         DoubleArrayList.wrap(Arrays.copyOf(var2, var1.method26733() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var3, var1.method26734() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var4, var1.method26735() + 1))
      );
   }

   public Class6409(Class7938 var1, DoubleList var2, DoubleList var3, DoubleList var4) {
      super(var1);
      int var7 = var1.method26733() + 1;
      int var8 = var1.method26734() + 1;
      int var9 = var1.method26735() + 1;
      if (var7 == var2.size() && var8 == var3.size() && var9 == var4.size()) {
         this.field28035 = var2;
         this.field28036 = var3;
         this.field28037 = var4;
      } else {
         throw (IllegalArgumentException) Util.pauseDevMode(
            new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape.")
         );
      }
   }

   @Override
   public DoubleList method19511(Direction.Axis var1) {
      switch (Class8724.field39363[var1.ordinal()]) {
         case 1:
            return this.field28035;
         case 2:
            return this.field28036;
         case 3:
            return this.field28037;
         default:
            throw new IllegalArgumentException();
      }
   }
}
