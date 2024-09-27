package mapped;

import java.util.LinkedList;

public class Class3132 implements Class2982 {
   private static String[] field18345;
   public final Class3831 field18346;

   public Class3132(Class3831 var1) {
      this.field18346 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6058 var4 = var1.method30580().<Class6058>method22438(Class6058.class);
      int var5 = var1.<Integer>method30555(BruhMotha.field22544, 0);
      var4.method18776(var5, true);
      Class9695 var6 = var1.<Class9695>method30559(BruhMotha.field22551);
      LinkedList var7 = new LinkedList();
      var7.add(new Class8656(12, Class1953.field12695, var6));
      if (var4.method18670() != var5) {
         var7.add(new Class8656(6, Class1953.field12703, Class6910.method21118(var5, var4)));
      }

      var1.method30560(Class9218.field42416, var7);
   }
}
