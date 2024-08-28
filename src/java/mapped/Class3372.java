package mapped;

public class Class3372 extends Class3241 {
   private static String[] field18962;
   public static final Class8554 field18963 = Class8820.field39759;
   public static final Class8551 field18964 = Class8820.field39697;
   public static final Class6408 field18965 = Block.method11539(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public Class3372(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18963, Integer.valueOf(0)).method23465(field18964, Boolean.valueOf(false)));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18965;
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public int method11514(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.<Integer>method23463(field18963);
   }

   public static void method11966(Class7380 var0, World var1, BlockPos var2) {
      if (var1.method6812().method36875()) {
         int var5 = var1.method7020(Class1977.field12881, var2) - var1.method6808();
         float var6 = var1.method6750(1.0F);
         boolean var7 = var0.<Boolean>method23463(field18964);
         if (!var7) {
            if (var5 > 0) {
               float var8 = !(var6 < (float) Math.PI) ? (float) (Math.PI * 2) : 0.0F;
               var6 += (var8 - var6) * 0.2F;
               var5 = Math.round((float)var5 * MathHelper.method37764(var6));
            }
         } else {
            var5 = 15 - var5;
         }

         var5 = MathHelper.method37775(var5, 0, 15);
         if (var0.<Integer>method23463(field18963) != var5) {
            var1.method6725(var2, var0.method23465(field18963, Integer.valueOf(var5)), 3);
         }
      }
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      if (!var4.method2935()) {
         return super.method11505(var1, var2, var3, var4, var5, var6);
      } else if (!var2.field9020) {
         Class7380 var9 = var1.method23459(field18964);
         var2.method6725(var3, var9, 4);
         method11966(var9, var2, var3);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public boolean method11516(Class7380 var1) {
      return true;
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class961();
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18963, field18964);
   }
}
