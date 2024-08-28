package mapped;

import com.google.common.primitives.Ints;

public class Class3989 extends Class3758 {
   private static String[] field20292;
   public final Class6380 field20293;

   public Class3989(Class6380 var1) {
      this.field20293 = var1;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22518);
      this.method12733(var0 -> {
         String var3 = var0.<String>method30559(Class4750.field22539);
         Integer var4;
         if (var3.length() >= 19 && (var4 = Ints.tryParse(var3.substring(18))) != null) {
            var0.method30560(Class4750.field22544, var4);
         } else {
            var0.method30578();
         }
      });
   }
}
