package remapped;

import com.google.common.base.Preconditions;

public class class_5433 {
   private static String[] field_27681;
   private final String field_27680;
   private final int field_27679;
   private final int field_27678;

   public class_5433(String var1, int var2, int var3) {
      Preconditions.checkNotNull(var1);
      Preconditions.checkArgument(var2 >= 0);
      Preconditions.checkArgument(var3 > var2);
      this.field_27680 = var1;
      this.field_27679 = var2;
      this.field_27678 = var3;
   }

   public String method_24767() {
      return this.field_27680;
   }

   public int method_24768() {
      return this.field_27679;
   }

   public int method_24765() {
      return this.field_27678;
   }
}
