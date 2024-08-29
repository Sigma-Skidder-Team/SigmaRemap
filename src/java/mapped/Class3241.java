package mapped;

import javax.annotation.Nullable;

public abstract class Class3241 extends Block implements Class3245 {
   public Class3241(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      super.method11647(var1, var2, var3, var4, var5);
      TileEntity var8 = var2.getTileEntity(var3);
      return var8 != null ? var8.method3751(var4, var5) : false;
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      TileEntity var6 = var2.getTileEntity(var3);
      return !(var6 instanceof Class949) ? null : (Class949)var6;
   }
}
