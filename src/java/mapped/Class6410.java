package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class Class6410 extends Class6408 {
   private static String[] field28038;

   public Class6410(Class7938 var1) {
      super(var1);
   }

   @Override
   public DoubleList method19511(Class113 var1) {
      return new Class53(this.field28033.method26732(var1));
   }

   @Override
   public int method19523(Class113 var1, double var2) {
      int var6 = this.field28033.method26732(var1);
      return Class9679.method37775(Class9679.method37769(var2 * (double)var6), -1, var6);
   }
}
