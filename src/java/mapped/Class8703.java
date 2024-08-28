package mapped;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class Class8703 {
   private static Class7156[] field39295 = null;
   private static int field39296 = 0;

   public static Class7156 method31387() {
      if (field39295 != null) {
         RegistryKey var2 = PacketThreadUtil.field39630;
         if (var2 != null) {
            int var3 = Class8509.method30145(var2);
            int var4 = var3 - field39296;
            Class7156 var5 = null;
            if (var4 >= 0 && var4 < field39295.length) {
               var5 = field39295[var4];
            }

            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void method31388() {
      field39295 = null;
      field39296 = 0;
      Pair var2 = method31389();
      field39295 = (Class7156[])var2.getLeft();
      field39296 = (Integer)var2.getRight();
   }

   private static Pair<Class7156[], Integer> method31389() {
      String var2 = "optifine/gui/loading/background";
      String var3 = ".png";
      String[] var4 = Class9772.method38436(var2, var3);
      HashMap var5 = new HashMap();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         String var8 = Class9402.method35772(var7, var2, var3);
         int var9 = Class7944.method26899(var8, Integer.MIN_VALUE);
         if (var9 != Integer.MIN_VALUE) {
            var5.put(var9, var7);
         } else {
            method31390("Invalid dimension ID: " + var8 + ", path: " + var7);
         }
      }

      Set<Integer> var17 = var5.keySet();
      Integer[] var18 = var17.toArray(new Integer[var17.size()]);
      Arrays.sort(var18);
      if (var18.length <= 0) {
         return new ImmutablePair((Class7156[])null, 0);
      } else {
         String var19 = "optifine/gui/loading/loading.properties";
         Properties var20 = Class9772.method38445(var19, "CustomLoadingScreens");
         int var10 = var18[0];
         int var11 = var18[var18.length - 1];
         int var12 = var11 - var10 + 1;
         Class7156[] var13 = new Class7156[var12];

         for (int var14 = 0; var14 < var18.length; var14++) {
            Integer var15 = var18[var14];
            String var16 = (String)var5.get(var15);
            var13[var15 - var10] = Class7156.method22324(var16, var15, var20);
         }

         return new ImmutablePair(var13, var10);
      }
   }

   public static void method31390(String var0) {
      Class7944.method26811("CustomLoadingScreen: " + var0);
   }

   public static void method31391(String var0) {
      Class7944.method26810("CustomLoadingScreen: " + var0);
   }
}
