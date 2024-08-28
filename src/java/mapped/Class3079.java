package mapped;

public class Class3079 implements Class2982 {
   public final Class4000 field18253;

   public Class3079(Class4000 var1) {
      this.field18253 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30561(Class4750.field22544);

      for (int var5 = 0; var5 < var4; var5++) {
         var1.<String>method30561(Class4750.field22539);
         String var6 = var1.<String>method30561(Class4750.field22539);
         if (!var6.equals("crafting_shapeless")) {
            if (!var6.equals("crafting_shaped")) {
               if (var6.equals("smelting")) {
                  var1.<String>method30561(Class4750.field22539);
                  var1.method30560(Class4750.field22573, var1.<Class9738[]>method30559(Class4750.field22572));
                  var1.method30560(Class4750.field22569, var1.<Class9738>method30559(Class4750.field22568));
                  var1.<Float>method30561(Class4750.field22532);
                  var1.<Integer>method30561(Class4750.field22544);
               }
            } else {
               int var9 = var1.<Integer>method30561(Class4750.field22544) * var1.<Integer>method30561(Class4750.field22544);
               var1.<String>method30561(Class4750.field22539);

               for (int var10 = 0; var10 < var9; var10++) {
                  var1.method30560(Class4750.field22573, var1.<Class9738[]>method30559(Class4750.field22572));
               }

               var1.method30560(Class4750.field22569, var1.<Class9738>method30559(Class4750.field22568));
            }
         } else {
            var1.<String>method30561(Class4750.field22539);
            int var7 = var1.<Integer>method30561(Class4750.field22544);

            for (int var8 = 0; var8 < var7; var8++) {
               var1.method30560(Class4750.field22573, var1.<Class9738[]>method30559(Class4750.field22572));
            }

            var1.method30560(Class4750.field22569, var1.<Class9738>method30559(Class4750.field22568));
         }
      }
   }
}
