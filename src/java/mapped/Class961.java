package mapped;

public class Class961 extends TileEntity implements Class935 {
   private static String[] field5391;

   public Class961() {
      super(Class4387.field21436);
   }

   @Override
   public void method3647() {
      if (this.field5324 != null && !this.field5324.field9020 && this.field5324.method6783() % 20L == 0L) {
         BlockState var3 = this.method3775();
         Block var4 = var3.getBlock();
         if (var4 instanceof Class3372) {
            Class3372.method11966(var3, this.field5324, this.field5325);
         }
      }
   }
}
