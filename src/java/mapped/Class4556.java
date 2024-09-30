package mapped;

import com.google.common.collect.AbstractIterator;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public final class Class4556 extends AbstractIterator<BlockPos.Mutable> {
   private static String[] field21968;
   private final Direction[] field21969;
   private final BlockPos.Mutable field21970;
   private final int field21971;
   private int field21972;
   private int field21973;
   private int field21974;
   private int field21975;
   private int field21976;
   private int field21977;
   public final Direction field21978;
   public final Direction field21979;
   public final BlockPos field21980;
   public final int field21981;

   public Class4556(Direction var1, Direction var2, BlockPos var3, int var4) {
      this.field21978 = var1;
      this.field21979 = var2;
      this.field21980 = var3;
      this.field21981 = var4;
      this.field21969 = new Direction[]{this.field21978, this.field21979, this.field21978.getOpposite(), this.field21979.getOpposite()};
      this.field21970 = this.field21980.method8354().method8379(this.field21979);
      this.field21971 = 4 * this.field21981;
      this.field21972 = -1;
      this.field21975 = this.field21970.getX();
      this.field21976 = this.field21970.getY();
      this.field21977 = this.field21970.getZ();
   }

   public BlockPos.Mutable computeNext() {
      this.field21970.setPos(this.field21975, this.field21976, this.field21977).method8379(this.field21969[(this.field21972 + 4) % 4]);
      this.field21975 = this.field21970.getX();
      this.field21976 = this.field21970.getY();
      this.field21977 = this.field21970.getZ();
      if (this.field21974 >= this.field21973) {
         if (this.field21972 >= this.field21971) {
            return (BlockPos.Mutable)this.endOfData();
         }

         this.field21972++;
         this.field21974 = 0;
         this.field21973 = this.field21972 / 2 + 1;
      }

      this.field21974++;
      return this.field21970;
   }
}
