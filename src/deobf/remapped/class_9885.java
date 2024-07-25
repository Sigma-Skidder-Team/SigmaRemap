package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class class_9885 {
   private static final Random field_50136 = new Random(0L);

   public static void method_45538(class_7373 var0) {
      if (var0 != null) {
         class_3111.method_14277(
            "Model: "
               + var0
               + ", ao: "
               + var0.method_33581()
               + ", gui3d: "
               + var0.method_33583()
               + ", builtIn: "
               + var0.method_33582()
               + ", particle: "
               + var0.method_33587()
         );
         Direction[] var3 = Direction.field_803;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Direction var5 = var3[var4];
            List var6 = var0.method_33580((class_2522)null, var5, field_50136);
            method_45534(var5.method_21049(), var6, "  ");
         }

         List var7 = var0.method_33580((class_2522)null, (Direction)null, field_50136);
         method_45534("General", var7, "  ");
      }
   }

   private static void method_45534(String var0, List<class_5024> var1, String var2) {
      for (class_5024 var6 : var1) {
         method_45536(var0, var6, var2);
      }
   }

   public static void method_45536(String var0, class_5024 var1, String var2) {
      class_3111.method_14277(
         var2
            + "Quad: "
            + var1.getClass().getName()
            + ", type: "
            + var0
            + ", face: "
            + var1.method_23150()
            + ", tint: "
            + var1.method_23160()
            + ", sprite: "
            + var1.method_23148()
      );
      method_45540(var1.method_23155(), "  " + var2);
   }

   public static void method_45540(int[] var0, String var1) {
      int var4 = var0.length / 4;
      class_3111.method_14277(var1 + "Length: " + var0.length + ", step: " + var4);

      for (int var5 = 0; var5 < 4; var5++) {
         int var6 = var5 * var4;
         float var7 = Float.intBitsToFloat(var0[var6 + 0]);
         float var8 = Float.intBitsToFloat(var0[var6 + 1]);
         float var9 = Float.intBitsToFloat(var0[var6 + 2]);
         int var10 = var0[var6 + 3];
         float var11 = Float.intBitsToFloat(var0[var6 + 4]);
         float var12 = Float.intBitsToFloat(var0[var6 + 5]);
         class_3111.method_14277(var1 + var5 + " xyz: " + var7 + "," + var8 + "," + var9 + " col: " + var10 + " u,v: " + var11 + "," + var12);
      }
   }

   public static class_7373 method_45535(class_7373 var0) {
      List var3 = method_45541(var0.method_33580((class_2522)null, (Direction)null, field_50136));
      Direction[] var4 = Direction.field_803;
      HashMap var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         Direction var7 = var4[var6];
         List var8 = var0.method_33580((class_2522)null, var7, field_50136);
         List var9 = method_45541(var8);
         var5.put(var7, var9);
      }

      return new class_6221(var3, var5, var0.method_33581(), var0.method_33583(), true, var0.method_33587(), var0.method_33586(), var0.method_33584());
   }

   public static List method_45541(List<class_5024> var0) {
      ArrayList var3 = new ArrayList();

      for (class_5024 var5 : var0) {
         class_5024 var6 = method_45539(var5);
         var3.add(var6);
      }

      return var3;
   }

   public static class_5024 method_45539(class_5024 var0) {
      return new class_5024((int[])var0.method_23155().clone(), var0.method_23160(), var0.method_23150(), var0.method_23148(), var0.method_23168());
   }
}
