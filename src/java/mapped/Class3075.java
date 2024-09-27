package mapped;

import java.util.LinkedList;

public class Class3075 implements Class2982 {
   private static String[] field18245;
   public final Class4039 field18246;

   public Class3075(Class4039 var1) {
      this.field18246 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      short var4 = var1.<Short>method30561(BruhMotha.field22522);
      if (var4 == 2) {
         Class6058 var5 = var1.method30580().<Class6058>method22438(Class6058.class);
         int var6 = var1.<Integer>method30555(BruhMotha.field22544, 0);
         var5.method18776(var6, false);
         Class8563 var7 = var1.method30573(67);
         var7.method30560(BruhMotha.field22544, var6);
         LinkedList var8 = new LinkedList();
         if (var5.method18670() != var6) {
            var8.add(new Class8656(6, Class1953.field12703, Class6910.method21118(var6, var5)));
         }

         var8.add(new Class8656(12, Class1953.field12695, null));
         var7.method30560(Class9218.field42416, var8);
         var7.method30570(Class6371.class);
      }
   }
}
