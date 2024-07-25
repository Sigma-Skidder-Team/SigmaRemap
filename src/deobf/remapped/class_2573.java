package remapped;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;

public final class class_2573 extends class_4190 {
   private final DoubleList field_12733;
   private final DoubleList field_12732;
   private final DoubleList field_12731;

   public class_2573(class_5791 var1, double[] var2, double[] var3, double[] var4) {
      this(
         var1,
         DoubleArrayList.wrap(Arrays.copyOf(var2, var1.method_26209() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var3, var1.method_26207() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var4, var1.method_26196() + 1))
      );
   }

   public class_2573(class_5791 var1, DoubleList var2, DoubleList var3, DoubleList var4) {
      super(var1);
      int var7 = var1.method_26209() + 1;
      int var8 = var1.method_26207() + 1;
      int var9 = var1.method_26196() + 1;
      if (var7 == var2.size() && var8 == var3.size() && var9 == var4.size()) {
         this.field_12733 = var2;
         this.field_12732 = var3;
         this.field_12731 = var4;
      } else {
         throw (IllegalArgumentException)class_9665.method_44658(
            new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape.")
         );
      }
   }

   @Override
   public DoubleList method_19486(class_9249 var1) {
      switch (var1) {
         case field_47215:
            return this.field_12733;
         case field_47216:
            return this.field_12732;
         case field_47219:
            return this.field_12731;
         default:
            throw new IllegalArgumentException();
      }
   }
}
