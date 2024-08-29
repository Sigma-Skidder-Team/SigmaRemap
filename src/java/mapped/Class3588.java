package mapped;

import java.util.Comparator;

public class Class3588 implements Comparator<Item> {
   private static String[] field19532;
   public final Class1282 field19533;

   public Class3588(Class1282 var1) {
      this.field19533 = var1;
   }

   public int compare(Item var1, Item var2) {
      int var6;
      int var7;
      if (this.field19533.field6844 != null) {
         if (!this.field19533.field6838.contains(this.field19533.field6844)) {
            Class49 var5 = this.field19533.field6844;
            var6 = Class1305.method6193(this.field19533.field6846).method28960(var5, var1);
            var7 = Class1305.method6193(this.field19533.field6846).method28960(var5, var2);
         } else {
            Class49 var8 = this.field19533.field6844;
            var6 = !(var1 instanceof Class3292) ? -1 : Class1305.method6193(this.field19533.field6846).method28960(var8, ((Class3292)var1).method11845());
            var7 = !(var2 instanceof Class3292) ? -1 : Class1305.method6193(this.field19533.field6846).method28960(var8, ((Class3292)var2).method11845());
         }
      } else {
         var6 = 0;
         var7 = 0;
      }

      return var6 != var7
         ? this.field19533.field6845 * Integer.compare(var6, var7)
         : this.field19533.field6845 * Integer.compare(Item.method11701(var1), Item.method11701(var2));
   }
}
