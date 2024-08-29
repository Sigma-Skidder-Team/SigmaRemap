package mapped;

public class Class6996 extends Class6995 {
   private static String[] field30269;
   public final Class1017 field30270;

   public Class6996(Class1017 var1, Class1006 var2, World var3) {
      super(var2, var3);
      this.field30270 = var1;
   }

   @Override
   public boolean method21672(BlockPos var1) {
      return !this.field30244.getBlockState(var1.method8313()).isAir();
   }

   @Override
   public void method21658() {
      if (!Class2663.method10870(Class1017.method4451(this.field30270))) {
         super.method21658();
      }
   }
}
