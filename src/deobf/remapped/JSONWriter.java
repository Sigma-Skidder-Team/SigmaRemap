package remapped;

public class JSONWriter {
   private static String[] field_16438;

   public static boolean saveBooleanValue(JSONObjectImpl var0, String var1, boolean var2) {
      try {
         return var0.method_5826(var1);
      } catch (class_7584 var6) {
         return var2;
      }
   }

   public static byte saveStringValue(JSONObjectImpl var0, String var1, byte var2) {
      try {
         return (byte)var0.method_5813(var1);
      } catch (class_7584 var6) {
         return var2;
      }
   }

   public static int saveIntValue(JSONObjectImpl var0, String var1, int var2) {
      try {
         return var0.method_5813(var1);
      } catch (class_7584 var6) {
         return var2;
      }
   }

   public static long saveLongValue(JSONObjectImpl var0, String var1, long var2) {
      try {
         return var0.method_5840(var1);
      } catch (class_7584 var7) {
         return var2;
      }
   }

   public static float saveFloatValue(JSONObjectImpl var0, String var1, float var2) {
      try {
         return (float)var0.method_5808(var1);
      } catch (class_7584 var6) {
         return var2;
      }
   }

   public static double saveDoubleValue(JSONObjectImpl var0, String var1, double var2) {
      try {
         return var0.method_5808(var1);
      } catch (class_7584 var7) {
         return var2;
      }
   }

   public static String saveStringValue(JSONObjectImpl var0, String var1, String var2) {
      try {
         return var0.method_5861(var1);
      } catch (class_7584 var6) {
         return var2;
      }
   }

   public static JSONObjectImpl saveStringValue(JSONObjectImpl var0, String var1) {
      try {
         return var0.method_5848(var1);
      } catch (class_7584 var5) {
         return null;
      }
   }

   public static class_1336 saveStringValue2ig(JSONObjectImpl var0, String var1) {
      try {
         return var0.method_5849(var1);
      } catch (class_7584 var5) {
         return null;
      }
   }
}
