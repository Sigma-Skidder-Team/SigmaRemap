package mapped;

import com.google.common.collect.AbstractIterator;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public final class Class4551 extends AbstractIterator<BlockPos> {
   private static String[] field21937;
   public final BlockPos.Mutable field21938;
   public int field21939;
   public final int field21940;
   public final int field21941;
   public final Random field21942;
   public final int field21943;
   public final int field21944;
   public final int field21945;
   public final int field21946;
   public final int field21947;

   public Class4551(int var1, int var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      this.field21940 = var1;
      this.field21941 = var2;
      this.field21942 = var3;
      this.field21943 = var4;
      this.field21944 = var5;
      this.field21945 = var6;
      this.field21946 = var7;
      this.field21947 = var8;
      this.field21938 = new BlockPos.Mutable();
      this.field21939 = this.field21940;
   }

   public BlockPos computeNext() {
      if (this.field21939 > 0) {
         BlockPos.Mutable var3 = this.field21938
            .setPos(
               this.field21941 + this.field21942.nextInt(this.field21943),
               this.field21944 + this.field21942.nextInt(this.field21945),
               this.field21946 + this.field21942.nextInt(this.field21947)
            );
         this.field21939--;
         return var3;
      } else {
         return (BlockPos)this.endOfData();
      }
   }
}
