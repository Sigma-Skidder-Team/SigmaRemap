package remapped;

import javax.annotation.Nullable;

public class class_7000 extends class_8285 {
   private static String[] field_35924;

   public class_7000(class_4612 var1, double var2, boolean var4) {
      super(var1, var2, 10, var4);
   }

   @Override
   public boolean method_16795() {
      class_6331 var3 = (class_6331)this.field_42465.field_41768;
      class_1331 var4 = this.field_42465.method_37075();
      return !var3.method_28994(var4) ? super.method_16795() : false;
   }

   @Nullable
   @Override
   public class_1343 method_38233() {
      class_6331 var3 = (class_6331)this.field_42465.field_41768;
      class_1331 var4 = this.field_42465.method_37075();
      class_6979 var5 = class_6979.method_31921(var4);
      class_6979 var6 = class_1225.method_5456(var3, var5, 2);
      return var6 == var5 ? null : class_3425.method_15837(this.field_42465, 10, 7, class_1343.method_6200(var6.method_31892()));
   }
}
