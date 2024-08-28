package mapped;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class3355 extends Class3241 {
   private static final Logger field18892 = LogManager.getLogger();
   public static final Class8553 field18893 = Class3433.field19198;
   public static final Class8551 field18894 = Class8820.field39684;

   public Class3355(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18893, Direction.NORTH).method23465(field18894, Boolean.valueOf(false)));
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      Class969 var4 = new Class969();
      var4.method4013(this == Blocks.field36888);
      return var4;
   }

   @Override
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.field9020) {
         Class944 var9 = var2.method6759(var3);
         if (var9 instanceof Class969) {
            Class969 var10 = (Class969)var9;
            boolean var11 = var2.method6780(var3);
            boolean var12 = var10.method4011();
            var10.method4010(var11);
            if (!var12 && !var10.method4012() && var10.method4020() != Class2037.field13323 && var11) {
               var10.method4017();
               var2.method6860().method20726(var3, this, 1);
            }
         }
      }
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      Class944 var7 = var2.method6759(var3);
      if (var7 instanceof Class969) {
         Class969 var8 = (Class969)var7;
         Class911 var9 = var8.method4009();
         boolean var10 = !Class9001.method33256(var9.method3563());
         Class2037 var11 = var8.method4020();
         boolean var12 = var8.method4016();
         if (var11 != Class2037.field13324) {
            if (var11 == Class2037.field13325) {
               if (!var12) {
                  if (var8.method4021()) {
                     var9.method3558(0);
                  }
               } else {
                  this.method11927(var1, var2, var3, var9, var10);
               }
            }
         } else {
            var8.method4017();
            if (!var12) {
               if (var8.method4021()) {
                  var9.method3558(0);
               }
            } else {
               this.method11927(var1, var2, var3, var9, var10);
            }

            if (var8.method4011() || var8.method4012()) {
               var2.method6860().method20726(var3, this, 1);
            }
         }

         var2.method6806(var3, this);
      }
   }

   private void method11927(Class7380 var1, Class1655 var2, BlockPos var3, Class911 var4, boolean var5) {
      if (!var5) {
         var4.method3558(0);
      } else {
         var4.method3564(var2);
      }

      method11928(var2, var3, var1.<Direction>method23463(field18893));
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      Class944 var9 = var2.method6759(var3);
      if (var9 instanceof Class969 && var4.method2979()) {
         var4.method2770((Class969)var9);
         return Class2274.method9002(var2.field9020);
      } else {
         return Class2274.field14820;
      }
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      Class944 var6 = var2.method6759(var3);
      return !(var6 instanceof Class969) ? 0 : ((Class969)var6).method4009().method3557();
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      Class944 var8 = var1.method6759(var2);
      if (var8 instanceof Class969) {
         Class969 var9 = (Class969)var8;
         Class911 var10 = var9.method4009();
         if (var5.method32152()) {
            var10.method3566(var5.method32149());
         }

         if (!var1.field9020) {
            if (var5.method32145("BlockEntityTag") == null) {
               var10.method3570(var1.method6789().method17135(Class5462.field24236));
               var9.method4013(this == Blocks.field36888);
            }

            if (var9.method4020() == Class2037.field13323) {
               boolean var11 = var1.method6780(var2);
               var9.method4010(var11);
            }
         }
      }
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18893, var2.method252(var1.<Direction>method23463(field18893)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18893)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18893, field18894);
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field18893, var1.method18348().method536());
   }

   private static void method11928(Class1655 var0, BlockPos var1, Direction var2) {
      Mutable var5 = var1.method8354();
      Class5462 var6 = var0.method6789();
      int var7 = var6.method17136(Class5462.field24244);

      while (var7-- > 0) {
         var5.method8379(var2);
         Class7380 var8 = var0.method6738(var5);
         Block var9 = var8.method23383();
         if (!var8.method23448(Blocks.field36888)) {
            break;
         }

         Class944 var10 = var0.method6759(var5);
         if (!(var10 instanceof Class969)) {
            break;
         }

         Class969 var11 = (Class969)var10;
         if (var11.method4020() != Class2037.field13323) {
            break;
         }

         if (var11.method4011() || var11.method4012()) {
            Class911 var12 = var11.method4009();
            if (!var11.method4017()) {
               if (var11.method4021()) {
                  var12.method3558(0);
               }
            } else {
               if (!var12.method3564(var0)) {
                  break;
               }

               var0.method6806(var5, var9);
            }
         }

         var2 = var8.<Direction>method23463(field18893);
      }

      if (var7 <= 0) {
         int var13 = Math.max(var6.method17136(Class5462.field24244), 0);
         field18892.warn("Command Block chain tried to execute more than {} steps!", var13);
      }
   }
}
