package mapped;

public class Class3464 extends Class3462 {
   private static String[] field19303;

   public Class3464(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      ItemStack var9 = var4.method3094(var5);
      if (var9.method32107() != Class8514.field37956) {
         return super.method11505(var1, var2, var3, var4, var5, var6);
      } else {
         if (!var2.field9020) {
            Direction var10 = var6.method31424();
            Direction var11 = var10.method544() != Class113.field414 ? var10 : var4.method3386().method536();
            var2.method6742((PlayerEntity)null, var3, Class6067.field26986, Class2266.field14732, 1.0F, 1.0F);
            var2.method6725(var3, Blocks.field36589.method11579().method23465(Class3342.field18848, var11), 11);
            Class1000 var12 = new Class1000(
               var2,
               (double)var3.method8304() + 0.5 + (double)var11.method539() * 0.65,
               (double)var3.getY() + 0.1,
               (double)var3.method8306() + 0.5 + (double)var11.method541() * 0.65,
               new ItemStack(Class8514.field37959, 4)
            );
            var12.method3435(
               0.05 * (double)var11.method539() + var2.field9016.nextDouble() * 0.02,
               0.05,
               0.05 * (double)var11.method541() + var2.field9016.nextDouble() * 0.02
            );
            var2.method6916(var12);
            var9.method32121(1, var4, var1x -> var1x.method3185(var5));
         }

         return Class2274.method9002(var2.field9020);
      }
   }

   @Override
   public Class3486 method12146() {
      return (Class3486) Blocks.PUMPKIN_STEM;
   }

   @Override
   public Class3493 method12147() {
      return (Class3493) Blocks.ATTACHED_PUMPKIN_STEM;
   }
}
