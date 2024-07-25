package remapped;

import java.util.ArrayList;

public class class_6086 extends class_1859 {
   public class_3004 field_31142;
   public String field_31143;

   public class_6086(class_7038 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.method_32148(this.field_31142 = new class_3004(this, "search", 50, 0, var5 - 60, var6 - 2, class_3004.field_14738, "", "Search..."));
      this.field_31142.method_13724(false);
      this.field_31142.method_13721(var1x -> this.field_31143 = this.field_31142.method_32165());
   }

   @Override
   public void method_32178(float var1) {
      this.field_31142.method_32177(true);
      byte var4 = 10;
      class_73.method_128(
         (float)(this.field_36270 + var4 / 2),
         (float)(this.field_36261 + var4 / 2),
         (float)(this.field_36278 - var4),
         (float)(this.field_36257 - var4),
         9.0F,
         var1 * 0.9F
      );
      class_73.method_128(
         (float)(this.field_36270 + var4 / 2),
         (float)(this.field_36261 + var4 / 2),
         (float)(this.field_36278 - var4),
         (float)(this.field_36257 - var4),
         30.0F,
         var1 * 0.4F
      );
      class_73.method_108(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         (float)var4,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.97F)
      );
      class_73.method_99(
         (float)(this.field_36270 + 20),
         (float)(this.field_36261 + 20),
         20.0F,
         20.0F,
         class_2209.field_11036,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.3F)
      );
      ArrayList var5 = this.method_27867();
      if (var5.size() > 0 && this.method_27865(this.field_31143, ((class_9128)var5.get(0)).method_41992())) {
         String var6 = ((class_9128)var5.get(0)).method_41992();
         String var7 = this.field_31143
            + ((class_9128)var5.get(0)).method_41992().substring(this.field_31143.length(), var6.length())
            + (!((class_9128)var5.get(0)).method_42015() ? " - Disabled" : " - Enabled");
         class_73.method_87(
            this.field_31142.method_32097(),
            (float)(this.field_36270 + 54),
            (float)(this.field_36261 + 14),
            var7,
            class_314.method_1444(class_1255.field_6929.field_6917, 0.25F)
         );
      }

      super.method_32178(var1);
   }

   public ArrayList<class_9128> method_27867() {
      ArrayList var3 = new ArrayList();
      if (this.field_31143 != null && this.field_31143.length() != 0) {
         for (class_9128 var5 : class_727.method_3328().method_3298().method_843().values()) {
            if (this.method_27865(this.field_31143, var5.method_41992())) {
               var3.add(var5);
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 257) {
         ArrayList var4 = this.method_27867();
         if (var4.size() > 0) {
            ((class_9128)var4.get(0)).method_41999();
         }

         class_1893.method_8510().method_8609(null);
      }
   }

   private boolean method_27866(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().contains(var1.toLowerCase()) : true;
   }

   private boolean method_27865(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().startsWith(var1.toLowerCase()) : true;
   }
}
