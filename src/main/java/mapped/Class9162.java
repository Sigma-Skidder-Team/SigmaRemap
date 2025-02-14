package mapped;

import net.minecraft.util.Util;

public class Class9162 {
   private static String[] field42061;
   private final String field42062;
   private final String field42063;
   private long field42064;

   public Class9162(String var1, String var2) {
      this.field42062 = var1;
      this.field42063 = var2;
      this.field42064 = Util.milliTime();
   }

   public String method34207() {
      return this.field42062;
   }

   public String method34208() {
      return this.field42063;
   }

   public void method34209() {
      this.field42064 = Util.milliTime();
   }
}
