package mapped;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Class1791 implements Closeable {
   public static final Logger field9659 = Logger.getLogger(Class7825.class.getName());
   private final Class1735 field9660;
   private final Class1745 field9661;
   private final boolean field9662;
   public final Class8237 field9663;

   public Class1791(Class1735 var1, boolean var2) {
      this.field9660 = var1;
      this.field9662 = var2;
      this.field9661 = new Class1745(this.field9660);
      this.field9663 = new Class8237(4096, this.field9661);
   }

   public void method7813(Class1557 var1) throws IOException {
      if (!this.field9662) {
         Class2003 var4 = this.field9660.method7607((long)Class7825.field33580.method8458());
         if (field9659.isLoggable(Level.FINE)) {
            field9659.fine(Class9474.method36559("<< CONNECTION %s", var4.method8449()));
         }

         if (!Class7825.field33580.equals(var4)) {
            throw Class7825.method26193("Expected a connection header but was %s", var4.method8435());
         }
      } else if (!this.method7814(true, var1)) {
         throw Class7825.method26193("Required SETTINGS preface not received");
      }
   }

   public boolean method7814(boolean var1, Class1557 var2) throws IOException {
      try {
         this.field9660.method7584(9L);
      } catch (IOException var9) {
         return false;
      }

      int var5 = method7826(this.field9660);
      if (var5 >= 0 && var5 <= 16384) {
         byte var6 = (byte)(this.field9660.method7596() & 255);
         if (var1 && var6 != 4) {
            throw Class7825.method26193("Expected a SETTINGS frame but was %s", var6);
         } else {
            byte var7 = (byte)(this.field9660.method7596() & 255);
            int var8 = this.field9660.method7599() & 2147483647;
            if (field9659.isLoggable(Level.FINE)) {
               field9659.fine(Class7825.method26194(true, var8, var5, var6, var7));
            }

            switch (var6) {
               case 0:
                  this.method7817(var2, var5, var7, var8);
                  break;
               case 1:
                  this.method7815(var2, var5, var7, var8);
                  break;
               case 2:
                  this.method7818(var2, var5, var7, var8);
                  break;
               case 3:
                  this.method7820(var2, var5, var7, var8);
                  break;
               case 4:
                  this.method7821(var2, var5, var7, var8);
                  break;
               case 5:
                  this.method7822(var2, var5, var7, var8);
                  break;
               case 6:
                  this.method7823(var2, var5, var7, var8);
                  break;
               case 7:
                  this.method7824(var2, var5, var7, var8);
                  break;
               case 8:
                  this.method7825(var2, var5, var7, var8);
                  break;
               default:
                  this.field9660.method7627((long)var5);
            }

            return true;
         }
      } else {
         throw Class7825.method26193("FRAME_SIZE_ERROR: %s", var5);
      }
   }

   private void method7815(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         boolean var7 = (var3 & 1) != 0;
         short var8 = (var3 & 8) == 0 ? 0 : (short)(this.field9660.method7596() & 255);
         if ((var3 & 32) != 0) {
            this.method7819(var1, var4);
            var2 -= 5;
         }

         var2 = method7827(var2, var3, var8);
         List var9 = this.method7816(var2, var8, var3, var4);
         var1.method6474(var7, var4, -1, var9);
      } else {
         throw Class7825.method26193("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
      }
   }

   private List<Class8350> method7816(int var1, short var2, byte var3, int var4) throws IOException {
      this.field9661.field9459 = this.field9661.field9462 = var1;
      this.field9661.field9463 = var2;
      this.field9661.field9460 = var3;
      this.field9661.field9461 = var4;
      this.field9663.method28677();
      return this.field9663.method28678();
   }

   private void method7817(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         boolean var7 = (var3 & 1) != 0;
         boolean var8 = (var3 & 32) != 0;
         if (!var8) {
            short var9 = (var3 & 8) == 0 ? 0 : (short)(this.field9660.method7596() & 255);
            var2 = method7827(var2, var3, var9);
            var1.method6473(var7, var4, this.field9660, var2);
            this.field9660.method7627((long)var9);
         } else {
            throw Class7825.method26193("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
         }
      } else {
         throw Class7825.method26193("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
      }
   }

   private void method7818(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 5) {
         if (var4 != 0) {
            this.method7819(var1, var4);
         } else {
            throw Class7825.method26193("TYPE_PRIORITY streamId == 0");
         }
      } else {
         throw Class7825.method26193("TYPE_PRIORITY length: %d != 5", var2);
      }
   }

   private void method7819(Class1557 var1, int var2) throws IOException {
      int var5 = this.field9660.method7599();
      boolean var6 = false;
      int var8 = (this.field9660.method7596() & 255) + 1;
      int var7 =  var5 & Integer.MAX_VALUE;
      var1.method6482(var2, var7, var8, var6);
   }

   private void method7820(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 4) {
         if (var4 != 0) {
            int var7 = this.field9660.method7599();
            Class2077 var8 = Class2077.method8733(var7);
            if (var8 != null) {
               var1.method6475(var4, var8);
            } else {
               throw Class7825.method26193("TYPE_RST_STREAM unexpected error code: %d", var7);
            }
         } else {
            throw Class7825.method26193("TYPE_RST_STREAM streamId == 0");
         }
      } else {
         throw Class7825.method26193("TYPE_RST_STREAM length: %d != 4", var2);
      }
   }

   private void method7821(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         throw Class7825.method26193("TYPE_SETTINGS streamId != 0");
      } else if ((var3 & 1) != 0) {
         if (var2 != 0) {
            throw Class7825.method26193("FRAME_SIZE_ERROR ack frame should be empty!");
         } else {
            var1.method6478();
         }
      } else if (var2 % 6 != 0) {
         throw Class7825.method26193("TYPE_SETTINGS length %% 6 != 0: %s", var2);
      } else {
         Class8702 var7 = new Class8702();

         for (int var8 = 0; var8 < var2; var8 += 6) {
            short var9 = this.field9660.method7598();
            int var10 = this.field9660.method7599();
            switch (var9) {
               case 1:
               case 6:
               default:
                  break;
               case 2:
                  if (var10 != 0 && var10 != 1) {
                     throw Class7825.method26193("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                  }
                  break;
               case 3:
                  var9 = 4;
                  break;
               case 4:
                  var9 = 7;
                  if (var10 < 0) {
                     throw Class7825.method26193("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                  }
                  break;
               case 5:
                  if (var10 < 16384 || var10 > 16777215) {
                     throw Class7825.method26193("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", var10);
                  }
            }

            var7.method31376(var9, var10);
         }

         var1.method6476(false, var7);
      }
   }

   private void method7822(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         short var7 = (var3 & 8) == 0 ? 0 : (short)(this.field9660.method7596() & 255);
         int var8 = this.field9660.method7599() & 2147483647;
         var2 -= 4;
         var2 = method7827(var2, var3, var7);
         List var9 = this.method7816(var2, var7, var3, var4);
         var1.method6483(var4, var8, var9);
      } else {
         throw Class7825.method26193("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
      }
   }

   private void method7823(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 8) {
         if (var4 == 0) {
            int var7 = this.field9660.method7599();
            int var8 = this.field9660.method7599();
            boolean var9 = (var3 & 1) != 0;
            var1.method6479(var9, var7, var8);
         } else {
            throw Class7825.method26193("TYPE_PING streamId != 0");
         }
      } else {
         throw Class7825.method26193("TYPE_PING length != 8: %s", var2);
      }
   }

   private void method7824(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 >= 8) {
         if (var4 == 0) {
            int var7 = this.field9660.method7599();
            int var8 = this.field9660.method7599();
            int var9 = var2 - 8;
            Class2077 var10 = Class2077.method8733(var8);
            if (var10 != null) {
               Class2003 var11 = Class2003.field13051;
               if (var9 > 0) {
                  var11 = this.field9660.method7607((long)var9);
               }

               var1.method6480(var7, var10, var11);
            } else {
               throw Class7825.method26193("TYPE_GOAWAY unexpected error code: %d", var8);
            }
         } else {
            throw Class7825.method26193("TYPE_GOAWAY streamId != 0");
         }
      } else {
         throw Class7825.method26193("TYPE_GOAWAY length < 8: %s", var2);
      }
   }

   private void method7825(Class1557 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 4) {
         long var7 = (long)this.field9660.method7599() & 2147483647L;
         if (var7 != 0L) {
            var1.method6481(var4, var7);
         } else {
            throw Class7825.method26193("windowSizeIncrement was 0", var7);
         }
      } else {
         throw Class7825.method26193("TYPE_WINDOW_UPDATE length !=4: %s", var2);
      }
   }

   @Override
   public void close() throws IOException {
      this.field9660.close();
   }

   public static int method7826(Class1735 var0) throws IOException {
      return (var0.method7596() & 0xFF) << 16 | (var0.method7596() & 0xFF) << 8 | var0.method7596() & 0xFF;
   }

   public static int method7827(int var0, byte var1, short var2) throws IOException {
      if (var2 <= var0) {
         return (short)(var0 - var2);
      } else {
         throw Class7825.method26193("PROTOCOL_ERROR padding %s > remaining length %s", var2, var0);
      }
   }
}
