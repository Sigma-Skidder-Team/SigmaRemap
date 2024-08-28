package mapped;

import java.util.*;

public abstract class Class4155 extends Class4147 {
   private static final Class1983[] field20406 = new Class1983[]{Class1983.field12946, Class1983.field12944, Class1983.field12945, Class1983.field12947};
   private final int field20407;
   private final Set<Integer> field20408 = new HashSet<Integer>();
   private final Map<Class1983, Integer> field20409 = new HashMap<Class1983, Integer>();

   public Class4155(String var1) {
      this.field20407 = Class9322.method35234(var1);
   }

   public Class8097 method12859(String var1, String var2) {
      return var4 -> {
         if (var4.method37758() == this.field20407 || var1.equals(var4.method37757())) {
            if (var4.method37758() != this.field20407) {
               this.field20408.add(var4.method37758());
            }

            Class9322.field43276.put(var4.method37758(), this);
         }

         if (var4.method37757().equals(var2)) {
            String var7 = var4.method37761("facing").toUpperCase(Locale.ROOT);
            this.field20409.put(Class1983.valueOf(var7), var4.method37758());
         }
      };
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      if (var3 != this.field20407) {
         return var3;
      } else {
         for (Class1983 var9 : field20406) {
            if (this.field20408.contains(this.method12840(var1, var2.method37961(var9)))) {
               return this.field20409.get(var9);
            }
         }

         return this.field20407;
      }
   }
}
