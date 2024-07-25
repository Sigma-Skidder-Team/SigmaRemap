package remapped;

import com.mojang.datafixers.util.Pair;

public class class_1327 extends class_7934 {
   private static String[] field_7297;

   public class_1327(class_3683 var1, class_6867 var2, int var3, int var4, int var5, class_6943 var6) {
      super(var2, var3, var4, var5);
      this.field_7296 = var1;
      this.field_7298 = var6;
   }

   @Override
   public int method_35897() {
      return 1;
   }

   @Override
   public boolean method_35889(class_6098 var1) {
      return this.field_7298 == class_5886.method_26896(var1);
   }

   @Override
   public boolean method_35895(class_704 var1) {
      class_6098 var4 = this.method_35898();
      return !var4.method_28022() && !var1.method_3186() && class_2931.method_13421(var4) ? false : super.method_35895(var1);
   }

   @Override
   public Pair<Identifier, Identifier> method_35900() {
      return Pair.of(class_3683.field_18059, class_3683.method_17104()[this.field_7298.method_31767()]);
   }
}
