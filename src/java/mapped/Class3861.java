package mapped;

import com.google.gson.JsonElement;

public class Class3861 extends Class3758 {
   private static String[] field20090;
   public final Class7080 field20091;

   public Class3861(Class7080 var1) {
      this.field20091 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30561(Class4750.field22544);
         if (var4 >= 0 && var4 <= 2) {
            this.field20091.method21999(var1.<JsonElement>method30561(Class4750.field22538));
         }
      });
   }
}
