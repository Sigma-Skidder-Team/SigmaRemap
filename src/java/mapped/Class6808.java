package mapped;

public class Class6808 {
   private final BlockPos field29631;
   private final Block field29632;
   private final int field29633;
   private final int field29634;

   public Class6808(BlockPos var1, Block var2, int var3, int var4) {
      this.field29631 = var1;
      this.field29632 = var2;
      this.field29633 = var3;
      this.field29634 = var4;
   }

   public BlockPos method20740() {
      return this.field29631;
   }

   public Block method20741() {
      return this.field29632;
   }

   public int method20742() {
      return this.field29633;
   }

   public int method20743() {
      return this.field29634;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class6808)) {
         return false;
      } else {
         Class6808 var4 = (Class6808)var1;
         return this.field29631.equals(var4.field29631)
            && this.field29633 == var4.field29633
            && this.field29634 == var4.field29634
            && this.field29632 == var4.field29632;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field29631.hashCode();
      var3 = 31 * var3 + this.field29632.hashCode();
      var3 = 31 * var3 + this.field29633;
      return 31 * var3 + this.field29634;
   }

   @Override
   public String toString() {
      return "TE(" + this.field29631 + ")," + this.field29633 + "," + this.field29634 + "," + this.field29632;
   }
}
