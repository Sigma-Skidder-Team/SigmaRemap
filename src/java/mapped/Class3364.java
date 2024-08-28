package mapped;

public class Class3364 extends Class3241 {
   public static final Class8551 field18931 = Class8820.field39695;

   public Class3364(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18931, Boolean.valueOf(false)));
   }

   @Override
   public void method11563(World var1, BlockPos var2, Class7380 var3, Class880 var4, ItemStack var5) {
      super.method11563(var1, var2, var3, var4, var5);
      Class39 var8 = var5.method32143();
      if (var8.method118("BlockEntityTag")) {
         Class39 var9 = var8.method130("BlockEntityTag");
         if (var9.method118("RecordItem")) {
            var1.method6725(var2, var3.method23465(field18931, Boolean.valueOf(true)), 2);
         }
      }
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      if (!var1.<Boolean>method23463(field18931)) {
         return ActionResultType.field14820;
      } else {
         this.method11942(var2, var3);
         var1 = var1.method23465(field18931, Boolean.valueOf(false));
         var2.method6725(var3, var1, 2);
         return ActionResultType.method9002(var2.field9020);
      }
   }

   public void method11941(Class1660 var1, BlockPos var2, Class7380 var3, ItemStack var4) {
      Class944 var7 = var1.method6759(var2);
      if (var7 instanceof Class947) {
         ((Class947)var7).method3804(var4.copy());
         var1.method6725(var2, var3.method23465(field18931, Boolean.valueOf(true)), 2);
      }
   }

   private void method11942(World var1, BlockPos var2) {
      if (!var1.field9020) {
         Class944 var5 = var1.method6759(var2);
         if (var5 instanceof Class947) {
            Class947 var6 = (Class947)var5;
            ItemStack var7 = var6.method3803();
            if (!var7.method32105()) {
               var1.method6999(1010, var2, 0);
               var6.method3625();
               float var8 = 0.7F;
               double var9 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.15F;
               double var11 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.060000002F + 0.6;
               double var13 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.15F;
               ItemStack var15 = var7.copy();
               ItemEntity var16 = new ItemEntity(
                  var1, (double)var2.method8304() + var9, (double)var2.getY() + var11, (double)var2.method8306() + var13, var15
               );
               var16.method4131();
               var1.method6916(var16);
            }
         }
      }
   }

   @Override
   public void method11513(Class7380 var1, World var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         this.method11942(var2, var3);
         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class947();
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, World var2, BlockPos var3) {
      Class944 var6 = var2.method6759(var3);
      if (var6 instanceof Class947) {
         Class3257 var7 = ((Class947)var6).method3803().method32107();
         if (var7 instanceof Class3283) {
            return ((Class3283)var7).method11812();
         }
      }

      return 0;
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18931);
   }
}
