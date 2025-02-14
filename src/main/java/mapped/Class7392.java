package mapped;

import java.text.NumberFormat;

public class Class7392 implements Class7391 {
   private int field31650 = 0;

   public Class7392(int var1) {
      this.field31650 = var1;
   }

   @Override
   public String method23609(Class7255 var1) {
      this.field31650++;
      NumberFormat var4 = NumberFormat.getNumberInstance();
      var4.setMinimumIntegerDigits(3);
      var4.setMaximumFractionDigits(0);
      var4.setGroupingUsed(false);
      String var5 = var4.format((long)this.field31650);
      return "id" + var5;
   }
}
