package mapped;

public final class Class8570 {
   private static String[] field38528;
   private final BlockState field38529;
   private final BlockState field38530;
   private final Direction field38531;

   public Class8570(BlockState var1, BlockState var2, Direction var3) {
      this.field38529 = var1;
      this.field38530 = var2;
      this.field38531 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class8570)) {
            return false;
         } else {
            Class8570 var4 = (Class8570)var1;
            return this.field38529 == var4.field38529 && this.field38530 == var4.field38530 && this.field38531 == var4.field38531;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field38529.hashCode();
      var3 = 31 * var3 + this.field38530.hashCode();
      return 31 * var3 + this.field38531.hashCode();
   }
}
