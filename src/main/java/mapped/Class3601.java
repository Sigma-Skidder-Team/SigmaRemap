package mapped;

import it.unimi.dsi.fastutil.ints.IntComparator;

public class Class3601 implements IntComparator {
   private static String[] field19558;
   public final int[] field19559;
   public final int[] field19560;
   public final Class7736 field19561;

   public Class3601(Class7736 var1, int[] var2, int[] var3) {
      this.field19561 = var1;
      this.field19559 = var2;
      this.field19560 = var3;
   }

   public int compare(int var1, int var2) {
      return this.field19559[var1] != this.field19559[var2]
         ? Integer.compare(this.field19559[var1], this.field19559[var2])
         : Integer.compare(this.field19560[var1], this.field19560[var2]);
   }

   public int compare(Integer var1, Integer var2) {
      return this.compare(var1.intValue(), var2.intValue());
   }
}
