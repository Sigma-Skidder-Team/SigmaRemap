package remapped;

import java.util.Random;

public class class_6095 {
   public static Random field_31190 = new Random();

   public static void main(String[] var0) {
      int var3 = 1000000;
      method_27933("Test math: " + var3);

      for (int var4 = 0; var4 < 1000000; var4++) {
         method_27927();
         method_27931();
         method_27932();
         method_27929();
         method_27926();
         method_27930();
      }

      method_27933("Done");
   }

   private static void method_27927() {
      class_8107 var2 = new class_8107();
      var2.method_36818(field_31190);
      class_8107 var3 = var2.method_36824();
      float var4 = field_31190.nextFloat();
      float var5 = field_31190.nextFloat();
      float var6 = field_31190.nextFloat();
      var2.method_36832(class_8107.method_36813(var4, var5, var6));
      var3.method_36829(var4, var5, var6);
      if (!var3.equals(var2)) {
         method_27933("*** DIFFERENT ***");
         method_27933(var2.toString());
         method_27933(var3.toString());
      }
   }

   private static void method_27931() {
      class_8107 var2 = new class_8107();
      var2.method_36818(field_31190);
      class_8107 var3 = var2.method_36824();
      float var4 = field_31190.nextFloat();
      float var5 = field_31190.nextFloat();
      float var6 = field_31190.nextFloat();
      var2.method_36832(class_8107.method_36814(var4, var5, var6));
      var3.method_36826(var4, var5, var6);
      if (!var3.equals(var2)) {
         method_27933("*** DIFFERENT ***");
         method_27933(var2.toString());
         method_27933(var3.toString());
      }
   }

   private static void method_27932() {
      class_8107 var2 = new class_8107();
      var2.method_36818(field_31190);
      class_8107 var3 = var2.method_36824();
      class_5422 var4 = new class_5422(field_31190.nextFloat(), field_31190.nextFloat(), field_31190.nextFloat(), field_31190.nextFloat());
      var2.method_36832(new class_8107(var4));
      var3.method_36831(var4);
      if (!var3.equals(var2)) {
         method_27933("*** DIFFERENT ***");
         method_27933(var2.toString());
         method_27933(var3.toString());
      }
   }

   private static void method_27929() {
      class_6555 var2 = new class_6555();
      var2.method_29895(field_31190);
      class_6555 var3 = var2.method_29882();
      class_5422 var4 = new class_5422(field_31190.nextFloat(), field_31190.nextFloat(), field_31190.nextFloat(), field_31190.nextFloat());
      var2.method_29891(new class_6555(var4));
      var3.method_29890(var4);
      if (!var3.equals(var2)) {
         method_27933("*** DIFFERENT ***");
         method_27933(var2.toString());
         method_27933(var3.toString());
      }
   }

   private static void method_27930() {
      class_2426 var2 = new class_2426(field_31190.nextFloat(), field_31190.nextFloat(), field_31190.nextFloat());
      class_2426 var3 = var2.method_11060();
      class_6555 var4 = new class_6555();
      var4.method_29895(field_31190);
      var2.method_11059(var4);
      float var5 = var4.method_29896(var3.method_11057(), var3.method_11061(), var3.method_11055());
      float var6 = var4.method_29897(var3.method_11057(), var3.method_11061(), var3.method_11055());
      float var7 = var4.method_29887(var3.method_11057(), var3.method_11061(), var3.method_11055());
      var3 = new class_2426(var5, var6, var7);
      if (!var3.equals(var2)) {
         method_27933("*** DIFFERENT ***");
         method_27933(var2.toString());
         method_27933(var3.toString());
      }
   }

   private static void method_27926() {
      class_2637 var2 = new class_2637(field_31190.nextFloat(), field_31190.nextFloat(), field_31190.nextFloat(), field_31190.nextFloat());
      class_2637 var3 = new class_2637(var2.method_11923(), var2.method_11922(), var2.method_11927(), var2.method_11924());
      class_8107 var4 = new class_8107();
      var4.method_36818(field_31190);
      var2.method_11929(var4);
      float var5 = var4.method_36805(var3.method_11923(), var3.method_11922(), var3.method_11927(), var3.method_11924());
      float var6 = var4.method_36812(var3.method_11923(), var3.method_11922(), var3.method_11927(), var3.method_11924());
      float var7 = var4.method_36815(var3.method_11923(), var3.method_11922(), var3.method_11927(), var3.method_11924());
      float var8 = var4.method_36816(var3.method_11923(), var3.method_11922(), var3.method_11927(), var3.method_11924());
      var3 = new class_2637(var5, var6, var7, var8);
      if (!var3.equals(var2)) {
         method_27933("*** DIFFERENT ***");
         method_27933(var2.toString());
         method_27933(var3.toString());
      }
   }

   private static void method_27933(String var0) {
      System.out.println(var0);
   }
}
