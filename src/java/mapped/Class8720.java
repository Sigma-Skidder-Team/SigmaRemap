package mapped;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Class8720 {
   public static boolean method31458(Object[] var0, Object var1) {
      if (var0 == null) {
         return false;
      } else {
         for (int var4 = 0; var4 < var0.length; var4++) {
            Object var5 = var0[var4];
            if (var5 == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public static int[] method31459(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length;
         int var5 = var4 + var1.length;
         int[] var6 = new int[var5];
         System.arraycopy(var0, 0, var6, 0, var4);

         for (int var7 = 0; var7 < var1.length; var7++) {
            var6[var7 + var4] = var1[var7];
         }

         return var6;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static int[] method31460(int[] var0, int var1) {
      return method31459(var0, new int[]{var1});
   }

   public static Object[] method31461(Object[] var0, Object[] var1) {
      if (var0 != null) {
         if (var1.length != 0) {
            int var4 = var0.length;
            int var5 = var4 + var1.length;
            Object[] var6 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var5);
            System.arraycopy(var0, 0, var6, 0, var4);
            System.arraycopy(var1, 0, var6, var4, var1.length);
            return var6;
         } else {
            return var0;
         }
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static Object[] method31462(Object[] var0, Object var1) {
      if (var0 != null) {
         int var4 = var0.length;
         int var5 = var4 + 1;
         Object[] var6 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var5);
         System.arraycopy(var0, 0, var6, 0, var4);
         var6[var4] = var1;
         return var6;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static Object[] method31463(Object[] var0, Object var1, int var2) {
      ArrayList var5 = new ArrayList<Object>(Arrays.asList(var0));
      var5.add(var2, var1);
      Object[] var6 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var5.size());
      return var5.<Object>toArray(var6);
   }

   public static String method31464(boolean[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            boolean var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static String method31465(float[] var0) {
      return method31466(var0, ", ");
   }

   public static String method31466(float[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            float var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static String method31467(float[] var0, String var1, String var2) {
      if (var0 != null) {
         StringBuffer var5 = new StringBuffer(var0.length * 5);

         for (int var6 = 0; var6 < var0.length; var6++) {
            float var7 = var0[var6];
            if (var6 > 0) {
               var5.append(var1);
            }

            var5.append(String.format(var2, var7));
         }

         return var5.toString();
      } else {
         return "";
      }
   }

   public static String method31468(int[] var0) {
      return method31469(var0, ", ");
   }

   public static String method31469(int[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            int var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static String method31470(int[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            int var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append("0x");
            var4.append(Integer.toHexString(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static String method31471(Object[] var0) {
      return method31472(var0, ", ");
   }

   public static String method31472(Object[] var0, String var1) {
      if (var0 != null) {
         StringBuffer var4 = new StringBuffer(var0.length * 5);

         for (int var5 = 0; var5 < var0.length; var5++) {
            Object var6 = var0[var5];
            if (var5 > 0) {
               var4.append(var1);
            }

            var4.append(String.valueOf(var6));
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   public static Object[] method31473(Collection var0, Class var1) {
      if (var0 != null) {
         if (var1 != null) {
            if (!var1.isPrimitive()) {
               Object[] var4 = (Object[])Array.newInstance(var1, var0.size());
               return var0.<Object>toArray(var4);
            } else {
               throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + var1);
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static boolean method31474(int var0, int[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4] == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean method31475(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Object var5 = var1[var4];
            if (equals(var0, var5)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean equals(Object var0, Object var1) {
      if (var0 != var1) {
         return var0 != null ? var0.equals(var1) : false;
      } else {
         return true;
      }
   }

   public static boolean method31476(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Object var5 = var1[var4];
            if (var0 == var5) {
               return true;
            }
         }

         return false;
      }
   }

   public static Object[] method31477(Object[] var0, Object var1) {
      ArrayList var4 = new ArrayList<Object>(Arrays.asList(var0));
      var4.remove(var1);
      return method31473(var4, var0.getClass().getComponentType());
   }

   public static int[] method31478(Integer[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return new int[0];
      } else {
         int[] var3 = new int[var0.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = var0[var4];
         }

         return var3;
      }
   }
}
