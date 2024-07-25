package remapped;

public enum class_4536 {
   field_22134(Direction.field_802),
   field_22124(Direction.field_817),
   field_22133(Direction.field_818),
   field_22120(Direction.field_800),
   field_22117(Direction.field_809),
   field_22131(Direction.field_804),
   field_22136(Direction.field_818, Direction.field_809),
   field_22132(Direction.field_818, Direction.field_804),
   field_22130(Direction.field_800, Direction.field_809),
   field_22118(Direction.field_800, Direction.field_804),
   field_22122(Direction.field_802, Direction.field_818),
   field_22116(Direction.field_802, Direction.field_800),
   field_22128(Direction.field_817, Direction.field_818),
   field_22135(Direction.field_817, Direction.field_800),
   field_22123(Direction.field_802, Direction.field_809),
   field_22129(Direction.field_802, Direction.field_804),
   field_22126(Direction.field_817, Direction.field_809),
   field_22125(Direction.field_817, Direction.field_804);

   private Direction field_22121;
   private Direction field_22137;

   private class_4536(Direction var3) {
      this.field_22121 = var3;
   }

   private class_4536(Direction var3, Direction var4) {
      this.field_22121 = var3;
      this.field_22137 = var4;
   }

   public Direction method_21063() {
      return this.field_22121;
   }

   public Direction method_21058() {
      return this.field_22137;
   }

   public BlockPos method_21056(BlockPos var1) {
      var1 = var1.method_6099(this.field_22121, 1);
      if (this.field_22137 != null) {
         var1 = var1.method_6099(this.field_22137, 1);
      }

      return var1;
   }

   public int method_21057() {
      int var3 = this.field_22121.method_1041();
      if (this.field_22137 != null) {
         var3 += this.field_22137.method_1041();
      }

      return var3;
   }

   public int method_21059() {
      int var3 = this.field_22121.method_1054();
      if (this.field_22137 != null) {
         var3 += this.field_22137.method_1054();
      }

      return var3;
   }

   public int method_21061() {
      int var3 = this.field_22121.method_1034();
      if (this.field_22137 != null) {
         var3 += this.field_22137.method_1034();
      }

      return var3;
   }

   public boolean method_21062() {
      return this.field_22137 != null;
   }
}
