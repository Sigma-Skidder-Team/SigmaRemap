package mapped;

import net.minecraft.block.BlockState;
import net.optifine.Config;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class Class9606 {
   private static ArrayDeque<int[]> field44926 = new ArrayDeque<int[]>();
   private static int field44927 = 10;

   private static synchronized int[] method37338(int var0) {
      int[] var3 = field44926.pollLast();
      if (var3 == null || var3.length < var0) {
         var3 = new int[var0];
      }

      return var3;
   }

   public static synchronized void method37339(int[] var0) {
      if (field44926.size() < field44927) {
         field44926.add(var0);
      }
   }

   public static void main(String[] var0) throws Exception {
      short var3 = 4096;
      int var4 = 500000;
      method37341(var3, var4);
      method37340(var3, var4);
      method37343(var3, var4);
      method37342(var3, var4);
      method37344(BlockState.class, var3, var4);
      long var5 = method37341(var3, var4);
      long var7 = method37340(var3, var4);
      long var9 = method37343(var3, var4);
      long var11 = method37342(var3, var4);
      long var13 = method37344(BlockState.class, var3, var4);
      Config.method26810("New: " + var5);
      Config.method26810("Clone: " + var7);
      Config.method26810("NewObj: " + var9);
      Config.method26810("CloneObj: " + var11);
      Config.method26810("NewObjDyn: " + var13);
   }

   private static long method37340(int var0, int var1) {
      long var4 = System.currentTimeMillis();
      int[] var6 = new int[var0];

      for (int var7 = 0; var7 < var1; var7++) {
         int[] var10 = (int[])var6.clone();
      }

      long var8 = System.currentTimeMillis();
      return var8 - var4;
   }

   private static long method37341(int var0, int var1) {
      long var4 = System.currentTimeMillis();

      for (int var6 = 0; var6 < var1; var6++) {
         int[] var9 = (int[])Array.newInstance(int.class, var0);
      }

      long var7 = System.currentTimeMillis();
      return var7 - var4;
   }

   private static long method37342(int var0, int var1) {
      long var4 = System.currentTimeMillis();
      BlockState[] var6 = new BlockState[var0];

      for (int var7 = 0; var7 < var1; var7++) {
         BlockState[] var10 = (BlockState[])var6.clone();
      }

      long var8 = System.currentTimeMillis();
      return var8 - var4;
   }

   private static long method37343(int var0, int var1) {
      long var4 = System.currentTimeMillis();

      for (int var6 = 0; var6 < var1; var6++) {
         BlockState[] var9 = new BlockState[var0];
      }

      long var7 = System.currentTimeMillis();
      return var7 - var4;
   }

   private static long method37344(Class var0, int var1, int var2) {
      long var5 = System.currentTimeMillis();

      for (int var7 = 0; var7 < var2; var7++) {
         Object[] var10 = (Object[])Array.newInstance(var0, var1);
      }

      long var8 = System.currentTimeMillis();
      return var8 - var5;
   }
}
