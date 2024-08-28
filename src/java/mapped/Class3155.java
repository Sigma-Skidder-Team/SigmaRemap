package mapped;

public class Class3155 implements Class2982 {
   private static String[] field18386;
   public final Class3913 field18387;

   public Class3155(Class3913 var1) {
      this.field18387 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
      int var5 = var1.<Integer>method30555(Class4750.field22544, 1);
      Class1866 var6 = Class8753.method31579(var5, true);
      var5 = this.field18387.field20172.method21106(var6.method8121());
      Class1873 var7 = Class5990.method18583(var5);
      if (var7 != null) {
         int var8 = var1.<Integer>method30555(Class4750.field22526, 0);
         if (var7.method8127(Class1873.field10746)) {
            var1.method30558(Class4750.field22526, 0, this.field18387.field20173.method19376().method18528(var8));
         } else if (var7.method8127(Class1873.field10862)) {
            switch (var8) {
               case 1:
                  var5 = Class1873.field10860.method8121();
                  break;
               case 2:
                  var5 = Class1873.field10863.method8121();
                  break;
               case 3:
                  var5 = Class1873.field10865.method8121();
                  break;
               case 4:
                  var5 = Class1873.field10866.method8121();
                  break;
               case 5:
                  var5 = Class1873.field10861.method8121();
                  break;
               case 6:
                  var5 = Class1873.field10864.method8121();
            }
         } else if (var7.method8127(Class1873.field10748) && var8 > 0 || var7.method8128(Class1873.field10843)) {
            if (var7.method8128(Class1873.field10843)) {
               var1.method30558(Class4750.field22526, 0, var8 - 1);
            }

            Class8563 var9 = var1.method30573(69);
            var9.method30560(Class4750.field22544, var4);
            var9.method30560(Class4750.field22534, var1.<Short>method30555(Class4750.field22534, 0));
            var9.method30560(Class4750.field22534, var1.<Short>method30555(Class4750.field22534, 1));
            var9.method30560(Class4750.field22534, var1.<Short>method30555(Class4750.field22534, 2));
            var9.method30570(Class6371.class);
         }

         var1.method30580().<Class6058>method22438(Class6058.class).method18666(var4, var7);
      }

      var1.method30558(Class4750.field22544, 1, var5);
   }
}
