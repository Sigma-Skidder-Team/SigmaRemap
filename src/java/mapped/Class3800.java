package mapped;

import com.google.gson.JsonElement;

public class Class3800 extends Class3758 {
   private static String[] field19987;
   public final Class7080 field19988;

   public Class3800(Class7080 var1) {
      this.field19988 = var1;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22541);
      this.map(Class4750.field22544);
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
         if (var4 == 0 || var4 == 3) {
            this.field19988.method21999(var1.<JsonElement>method30561(Class4750.field22538));
         }
      });
   }
}
