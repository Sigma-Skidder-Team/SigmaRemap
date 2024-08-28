package mapped;

public class Class5456 extends Class5455<Class4700> {
   private static String[] field24214;
   private final Class2967 field24215;

   public Class5456(Class2967 var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field24215 = var1;
   }

   public void method17109(Class8904 var1, Class5646 var2, Class8761 var3, int var4, int var5, Class8907 var6, Class4700 var7) {
      BlockPos var10 = new BlockPos(var4 * 16, Class2967.method11379(this.field24215), var5 * 16);
      Class9837.method38885();
      Class8814.method31820(
         var1,
         var7,
         Class4193::new,
         var2,
         var3,
         var10,
         this.field24196,
         this.field24201,
         Class2967.method11380(this.field24215),
         Class2967.method11381(this.field24215)
      );
      this.method17113();
   }
}
