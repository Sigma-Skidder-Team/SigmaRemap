package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class4165 extends Class4147 {
   private static final Set<Integer> field20428 = new HashSet<Integer>();

   public static Class8097 method12890() {
      Class4165 var2 = new Class4165();
      return var1 -> {
         if (var1.method37757().equals("minecraft:vine")) {
            field20428.add(var1.method37758());
            Class9322.field43276.put(var1.method37758(), var2);
         }
      };
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      if (!this.method12891(var1, var2)) {
         Class9695 var6 = var2.method37961(Class1983.field12948);
         int var7 = this.method12840(var1, var6);
         return field20428.contains(var7) && this.method12891(var1, var6) ? var3 : 0;
      } else {
         return var3;
      }
   }

   private boolean method12891(Class7161 var1, Class9695 var2) {
      return this.method12892(var1, var2, Class1983.field12946)
         || this.method12892(var1, var2, Class1983.field12947)
         || this.method12892(var1, var2, Class1983.field12944)
         || this.method12892(var1, var2, Class1983.field12945);
   }

   private boolean method12892(Class7161 var1, Class9695 var2, Class1983 var3) {
      return Class9322.field43278.contains(this.method12840(var1, var2.method37961(var3)));
   }
}
