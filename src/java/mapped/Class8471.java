package mapped;

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

public class Class8471 {
   public static Class2403 method29869(File var0) {
      try {
         return method29871(new FileInputStream(var0), var0);
      } catch (FileNotFoundException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static Class2403 method29870(InputStream var0) {
      return method29871(var0, null);
   }

   private static Class2403 method29871(InputStream var0, File var1) {
      HashMap var4 = new HashMap();

      try {
         DataInputStream var6 = new DataInputStream(var0);
         short var25 = method29873(var6);
         int var8 = 10;
         byte var9 = 0;
         if (var25 == 0) {
            var9 = var6.readByte();
            var8 = var6.readByte();
            if (var9 >= 3) {
               var25 = method29873(var6);
            }
         }

         int var10 = Class9705.method38024() - var8;
         short var11 = method29873(var6);
         String var12 = method29875(var6);
         String var13 = method29875(var6);
         method29875(var6);
         String var14 = method29875(var6);
         float var15 = (float)method29873(var6) / 100.0F;
         var6.readBoolean();
         var6.readByte();
         var6.readByte();
         method29874(var6);
         method29874(var6);
         method29874(var6);
         method29874(var6);
         method29874(var6);
         method29875(var6);
         short var16 = -1;

         while (true) {
            short var17 = method29873(var6);
            if (var17 == 0) {
               if (var9 > 0 && var9 < 3) {
                  var25 = var16;
               }

               for (int var26 = 0; var26 < var11; var26++) {
                  Class9616 var28 = (Class9616)var4.get(var26);
                  String var30 = method29875(var6);
                  byte var33 = var6.readByte();
                  if (var9 >= 2) {
                     var6.readByte();
                  }

                  if (var28 != null) {
                     var28.method37432(var30);
                     var28.method37436(var33);
                  }
               }

               byte var27 = var6.readByte();
               Class8084[] var29 = new Class8084[var27];

               for (int var31 = 0; var31 < var27; var31++) {
                  var29[var31] = new Class8084((byte)var31, method29875(var6), method29875(var6));
                  var6.readByte();
                  var6.readByte();
               }

               if (var10 < 0) {
                  ArrayList<Class8084> var32 = Class7179.method22534(var8);
                  var32.addAll(Arrays.asList(var29));
                  var29 = var32.toArray(var29);
               } else {
                  var8 += var10;
               }

               return new Class2403(var15, var4, var11, var25, var12, var13, var14, var1, var8, var29);
            }

            var16 += var17;
            short var18 = -1;

            while (true) {
               short var19 = method29873(var6);
               if (var19 == 0) {
                  break;
               }

               var18 += var19;
               byte var20 = var6.readByte();
               if (var10 > 0 && var20 >= var8) {
                  var20 = (byte)(var20 + var10);
               }

               method29872(var18, var16, var20, var6.readByte(), var4);
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

   private static void method29872(int var0, int var1, byte var2, byte var3, HashMap<Integer, Class9616> var4) {
      Class9616 var7 = (Class9616)var4.get(var0);
      if (var7 == null) {
         var7 = new Class9616();
         var4.put(var0, var7);
      }

      var7.method37434(var1, new Class8255(var2, var3));
   }

   private static short method29873(DataInputStream var0) throws IOException {
      int var3 = var0.readUnsignedByte();
      int var4 = var0.readUnsignedByte();
      return (short)(var3 + (var4 << 8));
   }

   private static int method29874(DataInputStream var0) throws IOException {
      int var3 = var0.readUnsignedByte();
      int var4 = var0.readUnsignedByte();
      int var5 = var0.readUnsignedByte();
      int var6 = var0.readUnsignedByte();
      return var3 + (var4 << 8) + (var5 << 16) + (var6 << 24);
   }

   private static String method29875(DataInputStream var0) throws IOException {
      int var3 = method29874(var0);

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
