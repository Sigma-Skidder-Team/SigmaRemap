package remapped;

import it.unimi.dsi.fastutil.ints.IntList;

public class class_3197 implements class_1504 {
   private static String[] field_15969;
   private final Identifier field_15968;
   private final String field_15970;
   private final class_6098 field_15967;
   private final class_2831<class_8137> field_15966;

   public class_3197(Identifier var1, String var2, class_6098 var3, class_2831<class_8137> var4) {
      this.field_15968 = var1;
      this.field_15970 = var2;
      this.field_15967 = var3;
      this.field_15966 = var4;
   }

   @Override
   public Identifier method_41050() {
      return this.field_15968;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14706;
   }

   @Override
   public String method_41051() {
      return this.field_15970;
   }

   @Override
   public class_6098 method_41044() {
      return this.field_15967;
   }

   @Override
   public class_2831<class_8137> method_41043() {
      return this.field_15966;
   }

   public boolean method_14714(class_6946 var1, class_6486 var2) {
      class_534 var5 = new class_534();
      int var6 = 0;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         class_6098 var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            var6++;
            var5.method_2603(var8, 1);
         }
      }

      return var6 == this.field_15966.size() && var5.method_2613(this, (IntList)null);
   }

   public class_6098 method_14711(class_6946 var1) {
      return this.field_15967.method_27973();
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= this.field_15966.size();
   }
}
