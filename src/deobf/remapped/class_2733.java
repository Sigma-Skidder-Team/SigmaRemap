package remapped;

import java.util.ArrayList;

public abstract class class_2733 {
   private class_222<class_6629, class_133> field_13344;
   private String field_13345;
   private float field_13342;
   private String[] field_13343;

   public class_2733(class_6629 var1, String var2, float var3) {
      this(class_222.<class_6629, class_133>method_939(var1), var2, var3, (String[])null);
   }

   public class_2733(class_6629 var1, String var2, float var3, String[] var4) {
      this(class_222.<class_6629, class_133>method_939(var1), var2, var3, var4);
   }

   public class_2733(class_133 var1, String var2, float var3) {
      this(class_222.method_941(var1), var2, var3, (String[])null);
   }

   public class_2733(class_222<class_6629, class_133> var1, String var2, float var3, String[] var4) {
      this.field_13344 = var1;
      this.field_13345 = var2;
      this.field_13342 = var3;
      this.field_13343 = var4;
   }

   public class_222<class_6629, class_133> method_12298() {
      return this.field_13344;
   }

   public String method_12290() {
      return this.field_13345;
   }

   public String[] method_12294() {
      return this.field_13343;
   }

   public float method_12297() {
      return this.field_13342;
   }

   public abstract class_9873 method_12295();

   public abstract class_1549 method_12291(class_9873 var1, String var2);

   public abstract String[] method_12292();

   public abstract class_8599 method_12293(class_9873 var1, float var2);

   public class_1549[] method_12296(class_9873 var1) {
      String[] var4 = this.method_12292();
      ArrayList var5 = new ArrayList();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         class_1549 var8 = this.method_12291(var1, var7);
         if (var8 != null) {
            var5.add(var8);
         }
      }

      return var5.<class_1549>toArray(new class_1549[var5.size()]);
   }
}
