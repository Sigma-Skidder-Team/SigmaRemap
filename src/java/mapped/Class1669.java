package mapped;

import javax.annotation.Nullable;

public final class Class1669 implements Class1665 {
   private static String[] field9086;
   private final Class7380[] field9087;

   public Class1669(Class7380[] var1) {
      this.field9087 = var1;
   }

   @Nullable
   @Override
   public Class944 method6759(BlockPos var1) {
      return null;
   }

   @Override
   public Class7380 method6738(BlockPos var1) {
      int var4 = var1.getY();
      return var4 >= 0 && var4 < this.field9087.length ? this.field9087[var4] : Blocks.AIR.method11579();
   }

   @Override
   public Class7379 method6739(BlockPos var1) {
      return this.method6738(var1).method23449();
   }
}
