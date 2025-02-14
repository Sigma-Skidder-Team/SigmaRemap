package mapped;

import com.google.common.base.Preconditions;

public class VersionRange {
   private static String[] field39040;
   private final String field39041;
   private final int field39042;
   private final int field39043;

   public VersionRange(String var1, int var2, int var3) {
      Preconditions.checkNotNull(var1);
      Preconditions.checkArgument(var2 >= 0);
      Preconditions.checkArgument(var3 > var2);
      this.field39041 = var1;
      this.field39042 = var2;
      this.field39043 = var3;
   }

   public String getBaseVersion() {
      return this.field39041;
   }

   public int getMinVersion() {
      return this.field39042;
   }

   public int getMaxVersion() {
      return this.field39043;
   }
}
