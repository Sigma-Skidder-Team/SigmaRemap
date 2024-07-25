package remapped;

import java.text.NumberFormat;

public class class_5690 implements class_1889 {
   private int field_28817 = 0;

   public class_5690(int var1) {
      this.field_28817 = var1;
   }

   @Override
   public String method_8428(class_1621 var1) {
      this.field_28817++;
      NumberFormat var4 = NumberFormat.getNumberInstance();
      var4.setMinimumIntegerDigits(3);
      var4.setMaximumFractionDigits(0);
      var4.setGroupingUsed(false);
      String var5 = var4.format((long)this.field_28817);
      return "id" + var5;
   }
}
