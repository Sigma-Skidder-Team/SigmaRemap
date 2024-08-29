package mapped;

public class Class3364 extends Class3241 {
   public static final Class8551 field18931 = Class8820.field39695;

   public Class3364(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18931, Boolean.valueOf(false)));
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, Class880 var4, ItemStack var5) {
      super.method11563(var1, var2, var3, var4, var5);
      CompoundNBT var8 = var5.getOrCreateTag();
      if (var8.contains("BlockEntityTag")) {
         CompoundNBT var9 = var8.getCompound("BlockEntityTag");
         if (var9.contains("RecordItem")) {
            var1.method6725(var2, var3.method23465(field18931, Boolean.valueOf(true)), 2);
         }
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var1.<Boolean>method23463(field18931)) {
         return ActionResultType.field14820;
      } else {
         this.method11942(var2, var3);
         var1 = var1.method23465(field18931, Boolean.valueOf(false));
         var2.method6725(var3, var1, 2);
         return ActionResultType.method9002(var2.field9020);
      }
   }

   public void method11941(Class1660 var1, BlockPos var2, BlockState var3, ItemStack var4) {
      TileEntity var7 = var1.getTileEntity(var2);
      if (var7 instanceof Class947) {
         ((Class947)var7).method3804(var4.copy());
         var1.method6725(var2, var3.method23465(field18931, Boolean.valueOf(true)), 2);
      }
   }

   private void method11942(World var1, BlockPos var2) {
      if (!var1.field9020) {
         TileEntity var5 = var1.getTileEntity(var2);
         if (var5 instanceof Class947) {
            Class947 var6 = (Class947)var5;
            ItemStack var7 = var6.method3803();
            if (!var7.isEmpty()) {
               var1.method6999(1010, var2, 0);
               var6.method3625();
               float var8 = 0.7F;
               double var9 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.15F;
               double var11 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.060000002F + 0.6;
               double var13 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.15F;
               ItemStack var15 = var7.copy();
               ItemEntity var16 = new ItemEntity(
                  var1, (double)var2.getX() + var9, (double)var2.getY() + var11, (double)var2.getZ() + var13, var15
               );
               var16.method4131();
               var1.method6916(var16);
            }
         }
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.method23448(var4.getBlock())) {
         this.method11942(var2, var3);
         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class947();
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      TileEntity var6 = var2.getTileEntity(var3);
      if (var6 instanceof Class947) {
         Item var7 = ((Class947)var6).method3803().getItem();
         if (var7 instanceof Class3283) {
            return ((Class3283)var7).method11812();
         }
      }

      return 0;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18931);
   }
}
