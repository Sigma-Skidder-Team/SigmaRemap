package remapped;

import java.util.ArrayList;
import java.util.Arrays;

public class class_3892 implements class_7473 {
   private static String[] field_18940;
   private class_8848[] field_18941;
   private class_8848[] field_18938;
   private class_8848[] field_18936;
   private int field_18939 = Integer.MAX_VALUE;
   private static final class_8848[] field_18937 = new class_8848[0];

   public class_3892() {
      this((class_8848[])null, (class_8848[])null, (class_8848[])null);
   }

   public class_3892(class_8848[] var1, class_8848[] var2, class_8848[] var3) {
      this(var1, var2, var3, Integer.MAX_VALUE);
   }

   public class_3892(class_8848[] var1, class_8848[] var2, class_8848[] var3, int var4) {
      this.field_18941 = method_18012(var1);
      this.field_18938 = method_18012(var2);
      this.field_18936 = method_18012(var3);
      this.field_18939 = var4;
   }

   private static class_8848[] method_18012(class_8848[] var0) {
      return var0 != null ? var0 : field_18937;
   }

   public class_8848[] method_18016() {
      return this.field_18941;
   }

   public class_8848[] method_18015() {
      return this.field_18938;
   }

   public class_8848[] method_18013() {
      return this.field_18936;
   }

   public int method_18017() {
      return this.field_18941 != null ? this.field_18941.length : 0;
   }

   @Override
   public class_8848[] method_33989(class_3999[] var1) {
      int var4 = this.field_18941.length + this.field_18936.length;
      int var5 = var1.length - var4;
      int var6 = 0;

      for (int var7 = 0; var7 + this.field_18938.length <= var5 && var4 + var7 + this.field_18938.length <= this.field_18939; var7 += this.field_18938.length) {
         var6++;
      }

      ArrayList var9 = new ArrayList();
      var9.addAll(Arrays.asList(this.field_18941));

      for (int var8 = 0; var8 < var6; var8++) {
         var9.addAll(Arrays.asList(this.field_18938));
      }

      var9.addAll(Arrays.asList(this.field_18936));
      return var9.<class_8848>toArray(new class_8848[var9.size()]);
   }

   public class_3892 method_18019(class_8848... var1) {
      return new class_3892(var1, this.field_18938, this.field_18936);
   }

   public class_3892 method_18018(class_8848... var1) {
      return new class_3892(this.field_18941, var1, this.field_18936);
   }

   public class_3892 method_18011(class_8848... var1) {
      return new class_3892(this.field_18941, this.field_18938, var1);
   }

   public class_3892 method_18014(int var1) {
      return new class_3892(this.field_18941, this.field_18938, this.field_18936, var1);
   }
}
