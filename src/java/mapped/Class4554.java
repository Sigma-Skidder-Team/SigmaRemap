package mapped;

import com.google.common.collect.AbstractIterator;
import net.minecraft.util.math.BlockPos;

public final class Class4554 extends AbstractIterator<BlockPos> {
   private static String[] field21956;
   private final Mutable field21957;
   private int field21958;
   public final int field21959;
   public final int field21960;
   public final int field21961;
   public final int field21962;
   public final int field21963;
   public final int field21964;

   public Class4554(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field21959 = var1;
      this.field21960 = var2;
      this.field21961 = var3;
      this.field21962 = var4;
      this.field21963 = var5;
      this.field21964 = var6;
      this.field21957 = new Mutable();
   }

   public BlockPos computeNext() {
      if (this.field21958 != this.field21959) {
         int var3 = this.field21958 % this.field21960;
         int var4 = this.field21958 / this.field21960;
         int var5 = var4 % this.field21961;
         int var6 = var4 / this.field21961;
         this.field21958++;
         return this.field21957.method8372(this.field21962 + var3, this.field21963 + var5, this.field21964 + var6);
      } else {
         return (BlockPos)this.endOfData();
      }
   }
}
