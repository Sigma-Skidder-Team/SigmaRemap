package mapped;

public class Class3470 extends Class3468 {
   private static String[] field19319;
   public static final Class8554 field19320 = Class8820.field39759;
   private final int field19321;

   public Class3470(int var1, AbstractBlock var2) {
      super(var2);
      this.method11578(this.field18612.method35393().method23465(field19320, Integer.valueOf(0)));
      this.field19321 = var1;
   }

   @Override
   public int method12157(World var1, BlockPos var2) {
      int var5 = Math.min(var1.<Entity>method7182(Entity.class, field19315.method19668(var2)).size(), this.field19321);
      if (var5 <= 0) {
         return 0;
      } else {
         float var6 = (float)Math.min(this.field19321, var5) / (float)this.field19321;
         return MathHelper.method37773(var6 * 15.0F);
      }
   }

   @Override
   public void method12154(Class1660 var1, BlockPos var2) {
      var1.method6742((PlayerEntity)null, var2, Class6067.field26761, Class2266.field14732, 0.3F, 0.90000004F);
   }

   @Override
   public void method12155(Class1660 var1, BlockPos var2) {
      var1.method6742((PlayerEntity)null, var2, Class6067.field26760, Class2266.field14732, 0.3F, 0.75F);
   }

   @Override
   public int method12158(BlockState var1) {
      return var1.<Integer>method23463(field19320);
   }

   @Override
   public BlockState method12159(BlockState var1, int var2) {
      return var1.method23465(field19320, Integer.valueOf(var2));
   }

   @Override
   public int method12152() {
      return 10;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19320);
   }
}
