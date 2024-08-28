package mapped;

import java.io.IOException;

public final class Class7825 {
   public static final Class2003 field33580 = Class2003.method8433("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
   public static final int field33581 = 16384;
   public static final byte field33582 = 0;
   public static final byte field33583 = 1;
   public static final byte field33584 = 2;
   public static final byte field33585 = 3;
   public static final byte field33586 = 4;
   public static final byte field33587 = 5;
   public static final byte field33588 = 6;
   public static final byte field33589 = 7;
   public static final byte field33590 = 8;
   public static final byte field33591 = 9;
   public static final byte field33592 = 0;
   public static final byte field33593 = 1;
   public static final byte field33594 = 1;
   public static final byte field33595 = 4;
   public static final byte field33596 = 4;
   public static final byte field33597 = 8;
   public static final byte field33598 = 32;
   public static final byte field33599 = 32;
   private static final String[] field33600 = new String[]{
      "DATA",  "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
   };
   public static final String[] field33601 = new String[64];
   public static final String[] field33602 = new String[256];

   private Class7825() {
   }

   public static IllegalArgumentException method26192(String var0, Object... var1) {
      throw new IllegalArgumentException(Class9474.method36559(var0, var1));
   }

   public static IOException method26193(String var0, Object... var1) throws IOException {
      throw new IOException(Class9474.method36559(var0, var1));
   }

   public static String method26194(boolean var0, int var1, int var2, byte var3, byte var4) {
      String var7 = var3 >= field33600.length ? Class9474.method36559("0x%02x", var3) : field33600[var3];
      String var8 = method26195(var3, var4);
      return Class9474.method36559("%s 0x%08x %5d %-13s %s", !var0 ? ">>" : "<<", var1, var2, var7, var8);
   }

   public static String method26195(byte var0, byte var1) {
      if (var1 == 0) {
         return "";
      } else {
         switch (var0) {
            case 2:
            case 3:
            case 7:
            case 8:
               return field33602[var1];
            case 4:
            case 6:
               return var1 == 1 ? "ACK" : field33602[var1];
            case 5:
            default:
               String var4 = var1 < field33601.length ? field33601[var1] : field33602[var1];
               if (var0 == 5 && (var1 & 4) != 0) {
                  return var4.replace("HEADERS", "PUSH_PROMISE");
               } else {
                  return var0 == 0 && (var1 & 32) != 0 ? var4.replace("PRIORITY", "COMPRESSED") : var4;
               }
         }
      }
   }

   static {
      for (int var4 = 0; var4 < field33602.length; var4++) {
         field33602[var4] = Class9474.method36559("%8s", Integer.toBinaryString(var4)).replace(' ', '0');
      }

      field33601[0] = "";
      field33601[1] = "END_STREAM";
      int[] var16 = new int[]{1};
      field33601[8] = "PADDED";

      for (int var10 : var16) {
         field33601[var10 | 8] = field33601[var10] + "|PADDED";
      }

      field33601[4] = "END_HEADERS";
      field33601[32] = "PRIORITY";
      field33601[36] = "END_HEADERS|PRIORITY";
      int[] var17 = new int[]{4, 32, 36};

      for (int var11 : var17) {
         for (int var15 : var16) {
            field33601[var15 | var11] = field33601[var15] + '|' + field33601[var11];
            field33601[var15 | var11 | 8] = field33601[var15] + '|' + field33601[var11] + "|PADDED";
         }
      }

      for (int var19 = 0; var19 < field33601.length; var19++) {
         if (field33601[var19] == null) {
            field33601[var19] = field33602[var19];
         }
      }
   }
}
