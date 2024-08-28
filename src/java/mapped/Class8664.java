package mapped;

import com.google.common.base.Preconditions;

public class Class8664 {
   private static String[] field39040;
   private final String field39041;
   private final int field39042;
   private final int field39043;

   public Class8664(String var1, int var2, int var3) {
      Preconditions.checkNotNull(var1);
      Preconditions.checkArgument(var2 >= 0);
      Preconditions.checkArgument(var3 > var2);
      this.field39041 = var1;
      this.field39042 = var2;
      this.field39043 = var3;
   }

   public String method31197() {
      return this.field39041;
   }

   public int method31198() {
      return this.field39042;
   }

   public int method31199() {
      return this.field39043;
   }
}
