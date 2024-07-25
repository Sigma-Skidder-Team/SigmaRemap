package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_7743 {
   private List<class_3009> field_39270 = new ArrayList<class_3009>();
   private class_3009 field_39268 = this.method_35053("", class_4349.field_21310, true);

   public class_3009 method_35052(String var1, class_4349 var2, class_3009 var3) {
      int var6 = this.field_39270.size();
      class_3009 var7 = new class_3009(var6, var1, var2, var3);
      this.field_39270.add(var7);
      return var7;
   }

   private class_3009 method_35053(String var1, class_4349 var2, boolean var3) {
      int var6 = this.field_39270.size();
      class_3009 var7 = new class_3009(var6, var1, var2, var3);
      this.field_39270.add(var7);
      return var7;
   }

   public class_3009 method_35041(String var1, class_3009 var2) {
      return this.method_35052(var1, class_4349.field_21309, var2);
   }

   public class_3009 method_35055(String var1) {
      return this.method_35052(var1, class_4349.field_21312, this.field_39268);
   }

   public class_3009 method_35048(String var1) {
      return this.method_35052(var1, class_4349.field_21314, this.field_39268);
   }

   public class_3009 method_35047(String var1, class_3009 var2) {
      return this.method_35052(var1, class_4349.field_21311, var2);
   }

   public class_3009 method_35056(String var1) {
      return this.method_35053(var1, class_4349.field_21310, true);
   }

   public class_3009[] method_35054(String var1, int var2) {
      class_3009[] var5 = new class_3009[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         String var7 = var6 != 0 ? var1 + var6 : var1;
         var5[var6] = this.method_35055(var7);
      }

      return var5;
   }

   public class_3009[] method_35050(String var1, int var2) {
      class_3009[] var5 = new class_3009[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         String var7 = var6 != 0 ? var1 + var6 : var1;
         var5[var6] = this.method_35048(var7);
      }

      return var5;
   }

   public class_3009 method_35042() {
      return this.field_39268;
   }

   public int method_35049() {
      return this.field_39270.size();
   }

   public class_3009 method_35046(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < this.field_39270.size(); var4++) {
            class_3009 var5 = this.field_39270.get(var4);
            String var6 = var5.method_13763();
            if (var6.equals(var1)) {
               return var5;
            }
         }

         return null;
      }
   }

   public String[] method_35051() {
      String[] var3 = new String[this.field_39270.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = this.field_39270.get(var4).method_13763();
      }

      return var3;
   }

   public class_3009[] method_35043() {
      return this.field_39270.<class_3009>toArray(new class_3009[this.field_39270.size()]);
   }

   public class_3009[] method_35044(class_3009 var1, class_3009 var2) {
      int var5 = var1.method_13743();
      int var6 = var2.method_13743();
      if (var5 > var6) {
         int var7 = var5;
         var5 = var6;
         var6 = var7;
      }

      class_3009[] var9 = new class_3009[var6 - var5 + 1];

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = this.field_39270.get(var5 + var8);
      }

      return var9;
   }

   @Override
   public String toString() {
      return this.field_39270.toString();
   }
}
