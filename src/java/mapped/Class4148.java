package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Class4148 extends Class4147 {
   private static final Class4159 field20398 = new Class4159();
   private final String field20399;
   private final Set<Integer> field20400 = new HashSet<Integer>();
   private final Map<Byte, Integer> field20401 = new HashMap<Byte, Integer>();

   public Class4148(String var1) {
      this.field20399 = var1;
   }

   public Class8097 method12841(String var1) {
      return var3 -> {
         if (var1.equals(var3.method37757())) {
            if (var3.method37762("waterlogged") && var3.method37761("waterlogged").equals("true")) {
               return;
            }

            this.field20400.add(var3.method37758());
            Class9322.field43276.put(var3.method37758(), this);
            this.field20401.put(this.method12842(var3), var3.method37758());
         }
      };
   }

   public byte method12842(Class9678 var1) {
      byte var4 = 0;
      if (var1.method37761("east").equals("true")) {
         var4 = (byte)(var4 | 1);
      }

      if (var1.method37761("north").equals("true")) {
         var4 = (byte)(var4 | 2);
      }

      if (var1.method37761("south").equals("true")) {
         var4 = (byte)(var4 | 4);
      }

      if (var1.method37761("west").equals("true")) {
         var4 = (byte)(var4 | 8);
      }

      return var4;
   }

   public byte method12843(Class7161 var1, Class9695 var2, int var3) {
      byte var6 = 0;
      boolean var7 = var1.method22465().method18677() < Class5989.field26137.method18573();
      if (this.method12844(Class1983.field12946, this.method12840(var1, var2.method37961(Class1983.field12946)), var7)) {
         var6 = (byte)(var6 | 1);
      }

      if (this.method12844(Class1983.field12944, this.method12840(var1, var2.method37961(Class1983.field12944)), var7)) {
         var6 = (byte)(var6 | 2);
      }

      if (this.method12844(Class1983.field12945, this.method12840(var1, var2.method37961(Class1983.field12945)), var7)) {
         var6 = (byte)(var6 | 4);
      }

      if (this.method12844(Class1983.field12947, this.method12840(var1, var2.method37961(Class1983.field12947)), var7)) {
         var6 = (byte)(var6 | 8);
      }

      return var6;
   }

   @Override
   public int method12840(Class7161 var1, Class9695 var2) {
      return field20398.method12839(var1, var2, super.method12840(var1, var2));
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      Integer var6 = this.field20401.get(this.method12843(var1, var2, var3));
      return var6 != null ? var6 : var3;
   }

   public boolean method12844(Class1983 var1, int var2, boolean var3) {
      if (!this.field20400.contains(var2)) {
         if (this.field20399 == null) {
            return false;
         } else {
            Class9039 var6 = (Class9039)Class9322.field43277.get(var2);
            return var6 != null && var6.method33538(this.field20399, var1.method8265(), var3);
         }
      } else {
         return true;
      }
   }

   public Set<Integer> method12845() {
      return this.field20400;
   }
}
