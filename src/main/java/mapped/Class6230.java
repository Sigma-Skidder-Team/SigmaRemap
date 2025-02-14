package mapped;

import net.minecraft.dispenser.IBlockSource;

public abstract class Class6230 extends Class6218 {
   private boolean field27726 = true;

   public boolean method19203() {
      return this.field27726;
   }

   public void method19204(boolean var1) {
      this.field27726 = var1;
   }

   @Override
   public void method19193(IBlockSource var1) {
      var1.method11326().playEvent(!this.method19203() ? 1001 : 1000, var1.method11323(), 0);
   }
}
