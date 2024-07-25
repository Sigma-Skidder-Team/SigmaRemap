package remapped;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class class_4713 {
   public static class_2800 method_21789(File var0) {
      try {
         return method_21791(new FileInputStream(var0), var0);
      } catch (FileNotFoundException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static class_2800 method_21790(InputStream var0) {
      return method_21791(var0, null);
   }

   private static class_2800 method_21791(InputStream var0, File var1) {
      HashMap var4 = new HashMap();
      byte var5 = -1;

      try {
         DataInputStream var6 = new DataInputStream(var0);
         short var25 = method_21793(var6);
         int var8 = 10;
         byte var9 = 0;
         if (var25 == 0) {
            var9 = var6.readByte();
            var8 = var6.readByte();
            if (var9 >= 3) {
               var25 = method_21793(var6);
            }
         }

         int var10 = class_9418.method_43607() - var8;
         short var11 = method_21793(var6);
         String var12 = method_21794(var6);
         String var13 = method_21794(var6);
         method_21794(var6);
         String var14 = method_21794(var6);
         float var15 = (float)method_21793(var6) / 100.0F;
         var6.readBoolean();
         var6.readByte();
         var6.readByte();
         method_21788(var6);
         method_21788(var6);
         method_21788(var6);
         method_21788(var6);
         method_21788(var6);
         method_21794(var6);
         short var16 = -1;

         while (true) {
            short var17 = method_21793(var6);
            if (var17 == 0) {
               if (var9 > 0 && var9 < 3) {
                  var25 = var16;
               }

               for (int var26 = 0; var26 < var11; var26++) {
                  class_9036 var28 = (class_9036)var4.get(var26);
                  String var30 = method_21794(var6);
                  byte var33 = var6.readByte();
                  if (var9 >= 2) {
                     var6.readByte();
                  }

                  if (var28 != null) {
                     var28.method_41486(var30);
                     var28.method_41483(var33);
                  }
               }

               byte var27 = var6.readByte();
               class_3566[] var29 = new class_3566[var27];

               for (int var31 = 0; var31 < var27; var31++) {
                  var29[var31] = new class_3566((byte)var31, method_21794(var6), method_21794(var6));
                  var6.readByte();
                  var6.readByte();
               }

               if (var10 < 0) {
                  ArrayList var32 = class_1485.method_6834(var8);
                  var32.addAll(Arrays.asList(var29));
                  var29 = var32.<class_3566>toArray(var29);
               } else {
                  var8 += var10;
               }

               return new class_2800(var15, var4, var11, var25, var12, var13, var14, var1, var8, var29);
            }

            var16 += var17;
            short var18 = -1;

            while (true) {
               short var19 = method_21793(var6);
               if (var19 == 0) {
                  break;
               }

               var18 += var19;
               byte var20 = var6.readByte();
               if (var10 > 0 && var20 >= var8) {
                  var20 = (byte)(var20 + var10);
               }

               method_21792(var18, var16, var20, var6.readByte(), var4);
            }
         }
      } catch (FileNotFoundException var21) {
         var21.printStackTrace();
      } catch (EOFException var22) {
         String var7 = "";
         if (var1 != null) {
            var7 = var1.getName();
         }
      } catch (IOException var23) {
         var23.printStackTrace();
      }

      return null;
   }

   private static void method_21792(int var0, int var1, byte var2, byte var3, HashMap<Integer, class_9036> var4) {
      class_9036 var7 = (class_9036)var4.get(var0);
      if (var7 == null) {
         var7 = new class_9036();
         var4.put(var0, var7);
      }

      var7.method_41480(var1, new class_4057(var2, var3));
   }

   private static short method_21793(DataInputStream var0) throws IOException {
      int var3 = var0.readUnsignedByte();
      int var4 = var0.readUnsignedByte();
      return (short)(var3 + (var4 << 8));
   }

   private static int method_21788(DataInputStream var0) throws IOException {
      int var3 = var0.readUnsignedByte();
      int var4 = var0.readUnsignedByte();
      int var5 = var0.readUnsignedByte();
      int var6 = var0.readUnsignedByte();
      return var3 + (var4 << 8) + (var5 << 16) + (var6 << 24);
   }

   private static String method_21794(DataInputStream var0) throws IOException {
      int var3 = method_21788(var0);

      StringBuilder var4;
      for (var4 = new StringBuilder(var3); var3 > 0; var3--) {
         char var5 = (char)var0.readByte();
         if (var5 == '\r') {
            var5 = ' ';
         }

         var4.append(var5);
      }

      return var4.toString();
   }
}
