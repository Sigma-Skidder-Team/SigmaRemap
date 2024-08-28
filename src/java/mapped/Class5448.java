package mapped;

public class Class5448 extends Class5444<Class4728> {
   private static String[] field24206;

   public Class5448(Class2961<Class4728> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(Class8904 var1, Class5646 var2, Class8761 var3, int var4, int var5, Class8907 var6, Class4728 var7) {
      int var10 = var4 * 16;
      int var11 = var5 * 16;
      BlockPos var12 = new BlockPos(var10 + 9, 90, var11 + 9);
      this.field24196.add(new Class4179(var12));
      this.method17113();
   }

   @Override
   public BlockPos method17120() {
      return new BlockPos((this.method17118() << 4) + 9, 0, (this.method17119() << 4) + 9);
   }
}
