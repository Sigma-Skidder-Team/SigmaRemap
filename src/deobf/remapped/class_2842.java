package remapped;

import java.io.IOException;

public final class class_2842 {
   public static final class_9091 field_13938 = class_9091.method_41889("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
   public static final int field_13926 = 16384;
   public static final byte field_13931 = 0;
   public static final byte field_13936 = 1;
   public static final byte field_13922 = 2;
   public static final byte field_13920 = 3;
   public static final byte field_13930 = 4;
   public static final byte field_13921 = 5;
   public static final byte field_13927 = 6;
   public static final byte field_13935 = 7;
   public static final byte field_13932 = 8;
   public static final byte field_13929 = 9;
   public static final byte field_13933 = 0;
   public static final byte field_13925 = 1;
   public static final byte field_13918 = 1;
   public static final byte field_13940 = 4;
   public static final byte field_13923 = 4;
   public static final byte field_13939 = 8;
   public static final byte field_13928 = 32;
   public static final byte field_13917 = 32;
   private static final String[] field_13924 = new String[]{
      "DATA", field_13919[6], field_13919[8], "RST_STREAM", "SETTINGS", field_13919[7], "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
   };
   public static final String[] field_13934 = new String[64];
   public static final String[] field_13937 = new String[256];

   private class_2842() {
   }

   public static IllegalArgumentException method_12942(String var0, Object... var1) {
      throw new IllegalArgumentException(class_8515.method_39218(var0, var1));
   }

   public static IOException method_12941(String var0, Object... var1) throws IOException {
      throw new IOException(class_8515.method_39218(var0, var1));
   }

   public static String method_12940(boolean var0, int var1, int var2, byte var3, byte var4) {
      String var7 = var3 >= field_13924.length ? class_8515.method_39218("0x%02x", var3) : field_13924[var3];
      String var8 = method_12938(var3, var4);
      return class_8515.method_39218("%s 0x%08x %5d %-13s %s", !var0 ? ">>" : "<<", var1, var2, var7, var8);
   }

   public static String method_12938(byte var0, byte var1) {
      if (var1 == 0) {
         return "";
      } else {
         switch (var0) {
            case 2:
            case 3:
            case 7:
            case 8:
               return field_13937[var1];
            case 4:
            case 6:
               return var1 == 1 ? "ACK" : field_13937[var1];
            case 5:
            default:
               String var4 = var1 < field_13934.length ? field_13934[var1] : field_13937[var1];
               if (var0 == 5 && (var1 & 4) != 0) {
                  return var4.replace("HEADERS", "PUSH_PROMISE");
               } else {
                  return var0 == 0 && (var1 & 32) != 0 ? var4.replace("PRIORITY", "COMPRESSED") : var4;
               }
         }
      }
   }

   static {
      for (int var4 = 0; var4 < field_13937.length; var4++) {
         field_13937[var4] = class_8515.method_39218("%8s", Integer.toBinaryString(var4)).replace(' ', '0');
      }

      field_13934[0] = field_13919[4];
      field_13934[1] = "END_STREAM";
      int[] var16 = new int[]{1};
      field_13934[8] = "PADDED";

      for (int var10 : var16) {
         field_13934[var10 | 8] = field_13934[var10] + "|PADDED";
      }

      field_13934[4] = "END_HEADERS";
      field_13934[32] = field_13919[8];
      field_13934[36] = "END_HEADERS|PRIORITY";
      int[] var17 = new int[]{4, 32, 36};

      for (int var11 : var17) {
         for (int var15 : var16) {
            field_13934[var15 | var11] = field_13934[var15] + '|' + field_13934[var11];
            field_13934[var15 | var11 | 8] = field_13934[var15] + '|' + field_13934[var11] + "|PADDED";
         }
      }

      for (int var19 = 0; var19 < field_13934.length; var19++) {
         if (field_13934[var19] == null) {
            field_13934[var19] = field_13937[var19];
         }
      }
   }
}
