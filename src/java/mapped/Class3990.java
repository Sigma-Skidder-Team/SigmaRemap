package mapped;

import com.google.gson.JsonElement;

public class Class3990 extends Class3758 {
   private static String[] field20294;
   public final Class7080 field20295;
   public final Class6356 field20296;

   public Class3990(Class6356 var1, Class7080 var2) {
      this.field20296 = var1;
      this.field20295 = var2;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22538);
      this.map(Class4750.field22518);
      this.method12733(var1 -> {
         field20295.method21999(var1.<JsonElement>method30555(Class4750.field22538, 0));
         var1.method30560(Class4750.field22541, Class6356.method19379());
      });
   }
}
