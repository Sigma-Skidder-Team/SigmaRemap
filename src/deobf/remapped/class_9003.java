package remapped;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class class_9003 {
   private static ArrayDeque<int[]> field_46086 = new ArrayDeque<int[]>();
   private static int field_46087 = 10;

   private static synchronized int[] method_41322(int var0) {
      int[] var3 = field_46086.pollLast();
      if (var3 == null || var3.length < var0) {
         var3 = new int[var0];
      }

      return var3;
   }

   public static synchronized void method_41321(int[] var0) {
      if (field_46086.size() < field_46087) {
         field_46086.add(var0);
      }
   }

   public static void main(String[] var0) throws Exception {
      short var3 = 4096;
      int var4 = 500000;
      method_41323(var3, var4);
      method_41324(var3, var4);
      method_41320(var3, var4);
      method_41326(var3, var4);
      method_41319(class_2522.class, var3, var4);
      long var5 = method_41323(var3, var4);
      long var7 = method_41324(var3, var4);
      long var9 = method_41320(var3, var4);
      long var11 = method_41326(var3, var4);
      long var13 = method_41319(class_2522.class, var3, var4);
      Config.method_14277("New: " + var5);
      Config.method_14277("Clone: " + var7);
      Config.method_14277("NewObj: " + var9);
      Config.method_14277("CloneObj: " + var11);
      Config.method_14277("NewObjDyn: " + var13);
   }

   private static long method_41324(int var0, int var1) {
      long var4 = System.currentTimeMillis();
      int[] var6 = new int[var0];

      for (int var7 = 0; var7 < var1; var7++) {
         int[] var10 = (int[])var6.clone();
      }

      long var8 = System.currentTimeMillis();
      return var8 - var4;
   }

   private static long method_41323(int var0, int var1) {
      long var4 = System.currentTimeMillis();

      for (int var6 = 0; var6 < var1; var6++) {
         int[] var9 = (int[])Array.newInstance(int.class, var0);
      }

      long var7 = System.currentTimeMillis();
      return var7 - var4;
   }

   private static long method_41326(int var0, int var1) {
      long var4 = System.currentTimeMillis();
      class_2522[] var6 = new class_2522[var0];

      for (int var7 = 0; var7 < var1; var7++) {
         class_2522[] var10 = (class_2522[])var6.clone();
      }

      long var8 = System.currentTimeMillis();
      return var8 - var4;
   }

   private static long method_41320(int var0, int var1) {
      long var4 = System.currentTimeMillis();

      for (int var6 = 0; var6 < var1; var6++) {
         class_2522[] var9 = new class_2522[var0];
      }

      long var7 = System.currentTimeMillis();
      return var7 - var4;
   }

   private static long method_41319(Class var0, int var1, int var2) {
      long var5 = System.currentTimeMillis();

      for (int var7 = 0; var7 < var2; var7++) {
         Object[] var10 = (Object[])Array.newInstance(var0, var1);
      }

      long var8 = System.currentTimeMillis();
      return var8 - var5;
   }
}
