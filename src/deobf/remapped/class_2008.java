package remapped;

import com.google.common.collect.Lists;

public final class class_2008 extends class_5155 {
   private static final class_4639 field_10189 = new class_4639("missingno");
   private static class_7884 field_10188;
   private static final class_3642<class_5797> field_10190 = new class_3642<class_5797>(() -> {
      class_5797 var2 = new class_5797(16, 16, false);

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            if (!(var5 < 8 ^ var6 < 8)) {
               var2.method_26242(var6, var5, -16777216);
            } else {
               var2.method_26242(var6, var5, -524040);
            }
         }
      }

      var2.method_26245();
      return var2;
   });
   private static final class_8353 field_10191 = new class_8353(
      field_10189, 16, 16, new class_4016(Lists.newArrayList(new class_9417[]{new class_9417(0, -1)}), 16, 16, 1, false)
   );

   public class_2008(class_8359 var1, class_8353 var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, var7, method_9323(var2.method_38453(), var2.method_38456()));
   }

   private class_2008(class_8359 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, field_10191, var2, var3, var4, var5, var6, field_10190.method_16960());
   }

   public static class_2008 method_9324(class_8359 var0, int var1, int var2, int var3, int var4, int var5) {
      return new class_2008(var0, var1, var2, var3, var4, var5);
   }

   public static class_4639 method_9327() {
      return field_10189;
   }

   public static class_8353 method_9326() {
      return field_10191;
   }

   @Override
   public void close() {
      super.close();
   }

   public static class_7884 method_9325() {
      if (field_10188 == null) {
         field_10188 = new class_7884(field_10190.method_16960());
         class_1893.method_8510().method_8577().method_35682(field_10189, field_10188);
      }

      return field_10188;
   }

   private static class_5797 method_9323(int var0, int var1) {
      int var4 = var0 / 2;
      int var5 = var1 / 2;
      class_5797 var6 = new class_5797(var0, var1, false);
      int var7 = -16777216;
      int var8 = -524040;

      for (int var9 = 0; var9 < var1; var9++) {
         for (int var10 = 0; var10 < var0; var10++) {
            if (!(var9 < var5 ^ var10 < var4)) {
               var6.method_26242(var10, var9, var7);
            } else {
               var6.method_26242(var10, var9, var8);
            }
         }
      }

      return var6;
   }
}
