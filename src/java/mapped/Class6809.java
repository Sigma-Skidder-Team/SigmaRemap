package mapped;

public class Class6809 {
   private static String[] field29635;
   private final Vector3d field29636;
   private final Vector3d field29637;
   private final Class2271 field29638;
   private final Class1985 field29639;
   private final ISelectionContext field29640;

   public Class6809(Vector3d var1, Vector3d var2, Class2271 var3, Class1985 var4, Entity var5) {
      this.field29636 = var1;
      this.field29637 = var2;
      this.field29638 = var3;
      this.field29639 = var4;
      this.field29640 = ISelectionContext.forEntity(var5);
   }

   public Vector3d method20744() {
      return this.field29637;
   }

   public Vector3d method20745() {
      return this.field29636;
   }

   public VoxelShape method20746(BlockState var1, Class1665 var2, BlockPos var3) {
      return this.field29638.method8998(var1, var2, var3, this.field29640);
   }

   public VoxelShape method20747(FluidState var1, Class1665 var2, BlockPos var3) {
      return !this.field29639.method8273(var1) ? VoxelShapes.method27425() : var1.method23489(var2, var3);
   }
}
