package mapped;

import com.google.common.collect.AbstractIterator;
import net.minecraft.util.math.BlockPos;

public final class Class4550 extends AbstractIterator<BlockPos> {
   private static String[] field21922;
   private final BlockPos.Mutable field21923;
   private int field21924;
   private int field21925;
   private int field21926;
   private int field21927;
   private int field21928;
   private boolean field21929;
   public final int field21930;
   public final int field21931;
   public final int field21932;
   public final int field21933;
   public final int field21934;
   public final int field21935;
   public final int field21936;

   public Class4550(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field21930 = var1;
      this.field21931 = var2;
      this.field21932 = var3;
      this.field21933 = var4;
      this.field21934 = var5;
      this.field21935 = var6;
      this.field21936 = var7;
      this.field21923 = new BlockPos.Mutable();
   }

   public BlockPos computeNext() {
      if (!this.field21929) {
         BlockPos.Mutable var3;
         for (var3 = null; var3 == null; this.field21928++) {
            if (this.field21928 > this.field21926) {
               this.field21927++;
               if (this.field21927 > this.field21925) {
                  this.field21924++;
                  if (this.field21924 > this.field21931) {
                     return (BlockPos)this.endOfData();
                  }

                  this.field21925 = Math.min(this.field21932, this.field21924);
                  this.field21927 = -this.field21925;
               }

               this.field21926 = Math.min(this.field21933, this.field21924 - Math.abs(this.field21927));
               this.field21928 = -this.field21926;
            }

            int var4 = this.field21927;
            int var5 = this.field21928;
            int var6 = this.field21924 - Math.abs(var4) - Math.abs(var5);
            if (var6 <= this.field21934) {
               this.field21929 = var6 != 0;
               var3 = this.field21923.method8372(this.field21935 + var4, this.field21936 + var5, this.field21930 + var6);
            }
         }

         return var3;
      } else {
         this.field21929 = false;
         this.field21923.method8309(this.field21930 - (this.field21923.getZ() - this.field21930));
         return this.field21923;
      }
   }
}
