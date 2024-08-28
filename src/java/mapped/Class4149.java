package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class4149 extends Class4148 {
   private static final Class1983[] field20402 = new Class1983[]{Class1983.field12946, Class1983.field12944, Class1983.field12945, Class1983.field12947};
   private static final int[] field20403 = new int[]{3, 2, 1, 0};

   public static List<Class8097> method12847() {
      ArrayList var2 = new ArrayList(2);
      var2.add(new Class4149("cobbleWallConnections").method12841("minecraft:cobblestone_wall"));
      var2.add(new Class4149("cobbleWallConnections").method12841("minecraft:mossy_cobblestone_wall"));
      return var2;
   }

   public Class4149(String var1) {
      super(var1);
   }

   @Override
   public byte method12842(Class9678 var1) {
      byte var4 = super.method12842(var1);
      if (var1.method37761("up").equals("true")) {
         var4 = (byte)(var4 | 16);
      }

      return var4;
   }

   @Override
   public byte method12843(Class7161 var1, Class9695 var2, int var3) {
      byte var6 = super.method12843(var1, var2, var3);
      if (this.method12848(var1, var2)) {
         var6 = (byte)(var6 | 16);
      }

      return var6;
   }

   public boolean method12848(Class7161 var1, Class9695 var2) {
      if (!this.method12850(this.method12840(var1, var2.method37961(Class1983.field12949)))
         && !this.method12850(this.method12840(var1, var2.method37961(Class1983.field12948)))) {
         int var5 = this.method12849(var1, var2);
         if (var5 != 0 && var5 != 15) {
            for (int var6 = 0; var6 < field20402.length; var6++) {
               if ((var5 & 1 << var6) != 0 && (var5 & 1 << field20403[var6]) == 0) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private int method12849(Class7161 var1, Class9695 var2) {
      int var5 = 0;

      for (int var6 = 0; var6 < field20402.length; var6++) {
         if (this.method12850(this.method12840(var1, var2.method37961(field20402[var6])))) {
            var5 |= 1 << var6;
         }
      }

      return var5;
   }

   private boolean method12850(int var1) {
      return this.method12845().contains(var1);
   }
}
