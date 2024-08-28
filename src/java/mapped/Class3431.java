package mapped;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Class3431 extends Class3429 {
   private static String[] field19192;
   public static final Class8552<Class96> field19193 = Class8820.field39737;
   public static final Class8551 field19194 = Class8820.field39704;

   public Class3431(Class7929 var1) {
      super(true, var1);
      this.method11578(this.field18612.method35393().method23465(field19194, Boolean.valueOf(false)).method23465(field19193, Class96.field247));
   }

   @Override
   public boolean method11516(Class7380 var1) {
      return true;
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      if (!var2.field9020 && !var1.<Boolean>method23463(field19194)) {
         this.method12094(var2, var3, var1);
      }
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field19194)) {
         this.method12094(var2, var3, var1);
      }
   }

   @Override
   public int method11514(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method23463(field19194) ? 0 : 15;
   }

   @Override
   public int method11515(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      if (var1.<Boolean>method23463(field19194)) {
         return var4 != Direction.field673 ? 0 : 15;
      } else {
         return 0;
      }
   }

   private void method12094(Class1655 var1, BlockPos var2, Class7380 var3) {
      if (this.method11492(var3, var1, var2)) {
         boolean var6 = var3.<Boolean>method23463(field19194);
         boolean var7 = false;
         List var8 = this.<Class916>method12096(var1, var2, Class916.class, (Predicate<Entity>)null);
         if (!var8.isEmpty()) {
            var7 = true;
         }

         if (var7 && !var6) {
            Class7380 var9 = var3.method23465(field19194, Boolean.valueOf(true));
            var1.method6725(var2, var9, 3);
            this.method12095(var1, var2, var9, true);
            var1.method6733(var2, this);
            var1.method6733(var2.method8313(), this);
            var1.method6732(var2, var3, var9);
         }

         if (!var7 && var6) {
            Class7380 var10 = var3.method23465(field19194, Boolean.valueOf(false));
            var1.method6725(var2, var10, 3);
            this.method12095(var1, var2, var10, false);
            var1.method6733(var2, this);
            var1.method6733(var2.method8313(), this);
            var1.method6732(var2, var3, var10);
         }

         if (var7) {
            var1.method6860().method20726(var2, this, 20);
         }

         var1.method6806(var2, this);
      }
   }

   public void method12095(Class1655 var1, BlockPos var2, Class7380 var3, boolean var4) {
      Class9435 var7 = new Class9435(var1, var2, var3);

      for (BlockPos var9 : var7.method36233()) {
         Class7380 var10 = var1.method6738(var9);
         var10.method23423(var1, var9, var10.method23383(), var2, false);
      }
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var4.method23448(var1.method23383())) {
         this.method12094(var2, var3, this.method12089(var1, var2, var3, var5));
      }
   }

   @Override
   public Class8550<Class96> method12093() {
      return field19193;
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      if (var1.<Boolean>method23463(field19194)) {
         List var6 = this.<Class918>method12096(var2, var3, Class918.class, (Predicate<Entity>)null);
         if (!var6.isEmpty()) {
            return ((Class918)var6.get(0)).method3614().method3557();
         }

         List var7 = this.<Class916>method12096(var2, var3, Class916.class, Class8088.field34760);
         if (!var7.isEmpty()) {
            return Class5812.method18152((Class920)var7.get(0));
         }
      }

      return 0;
   }

   public <T extends Class916> List<T> method12096(Class1655 var1, BlockPos var2, Class<T> var3, Predicate<Entity> var4) {
      return var1.<T>method6772(var3, this.method12097(var2), var4);
   }

   private Class6488 method12097(BlockPos var1) {
      double var4 = 0.2;
      return new Class6488(
         (double)var1.method8304() + 0.2,
         (double)var1.getY(),
         (double)var1.method8306() + 0.2,
         (double)(var1.method8304() + 1) - 0.2,
         (double)(var1.getY() + 1) - 0.2,
         (double)(var1.method8306() + 1) - 0.2
      );
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      switch (Class7090.field30515[var2.ordinal()]) {
         case 1:
            switch (Class7090.field30514[var1.<Class96>method23463(field19193).ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field250);
               case 2:
                  return var1.method23465(field19193, Class96.field249);
               case 3:
                  return var1.method23465(field19193, Class96.field252);
               case 4:
                  return var1.method23465(field19193, Class96.field251);
               case 5:
                  return var1.method23465(field19193, Class96.field255);
               case 6:
                  return var1.method23465(field19193, Class96.field256);
               case 7:
                  return var1.method23465(field19193, Class96.field253);
               case 8:
                  return var1.method23465(field19193, Class96.field254);
            }
         case 2:
            switch (Class7090.field30514[var1.<Class96>method23463(field19193).ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field251);
               case 2:
                  return var1.method23465(field19193, Class96.field252);
               case 3:
                  return var1.method23465(field19193, Class96.field250);
               case 4:
                  return var1.method23465(field19193, Class96.field249);
               case 5:
                  return var1.method23465(field19193, Class96.field256);
               case 6:
                  return var1.method23465(field19193, Class96.field253);
               case 7:
                  return var1.method23465(field19193, Class96.field254);
               case 8:
                  return var1.method23465(field19193, Class96.field255);
               case 9:
                  return var1.method23465(field19193, Class96.field248);
               case 10:
                  return var1.method23465(field19193, Class96.field247);
            }
         case 3:
            switch (Class7090.field30514[var1.<Class96>method23463(field19193).ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field252);
               case 2:
                  return var1.method23465(field19193, Class96.field251);
               case 3:
                  return var1.method23465(field19193, Class96.field249);
               case 4:
                  return var1.method23465(field19193, Class96.field250);
               case 5:
                  return var1.method23465(field19193, Class96.field254);
               case 6:
                  return var1.method23465(field19193, Class96.field255);
               case 7:
                  return var1.method23465(field19193, Class96.field256);
               case 8:
                  return var1.method23465(field19193, Class96.field253);
               case 9:
                  return var1.method23465(field19193, Class96.field248);
               case 10:
                  return var1.method23465(field19193, Class96.field247);
            }
         default:
            return var1;
      }
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      Class96 var5 = var1.<Class96>method23463(field19193);
      switch (Class7090.field30516[var2.ordinal()]) {
         case 1:
            switch (Class7090.field30514[var5.ordinal()]) {
               case 3:
                  return var1.method23465(field19193, Class96.field252);
               case 4:
                  return var1.method23465(field19193, Class96.field251);
               case 5:
                  return var1.method23465(field19193, Class96.field256);
               case 6:
                  return var1.method23465(field19193, Class96.field255);
               case 7:
                  return var1.method23465(field19193, Class96.field254);
               case 8:
                  return var1.method23465(field19193, Class96.field253);
               default:
                  return super.method11501(var1, var2);
            }
         case 2:
            switch (Class7090.field30514[var5.ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field250);
               case 2:
                  return var1.method23465(field19193, Class96.field249);
               case 3:
               case 4:
               default:
                  break;
               case 5:
                  return var1.method23465(field19193, Class96.field254);
               case 6:
                  return var1.method23465(field19193, Class96.field253);
               case 7:
                  return var1.method23465(field19193, Class96.field256);
               case 8:
                  return var1.method23465(field19193, Class96.field255);
            }
         default:
            return super.method11501(var1, var2);
      }
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19193, field19194);
   }
}
