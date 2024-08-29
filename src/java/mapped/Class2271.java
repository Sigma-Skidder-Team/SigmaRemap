package mapped;

import net.minecraft.util.math.BlockPos;

public enum Class2271 implements Class2272 {
   field14774(Class7377::getCollisionShape),
   field14775(Class7377::method23413),
   field14776(Class7377::method23417);

   private final Class2272 field14777;
   private static final Class2271[] field14778 = new Class2271[]{field14774, field14775, field14776};

   private Class2271(Class2272 var3) {
      this.field14777 = var3;
   }

   @Override
   public VoxelShape method8998(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return this.field14777.method8998(var1, var2, var3, var4);
   }
}
