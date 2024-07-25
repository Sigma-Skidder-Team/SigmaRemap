package remapped;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class class_5487 implements Closeable {
   public static final Logger field_27967 = Logger.getLogger(class_2842.class.getName());
   private final class_8067 field_27968;
   private final class_3203 field_27966;
   private final boolean field_27969;
   public final class_3993 field_27965;

   public class_5487(class_8067 var1, boolean var2) {
      this.field_27968 = var1;
      this.field_27969 = var2;
      this.field_27966 = new class_3203(this.field_27968);
      this.field_27965 = new class_3993(4096, this.field_27966);
   }

   public void method_24933(class_7554 var1) throws IOException {
      if (!this.field_27969) {
         class_9091 var4 = this.field_27968.method_36587((long)class_2842.field_13938.method_41902());
         if (field_27967.isLoggable(Level.FINE)) {
            field_27967.fine(class_8515.method_39218("<< CONNECTION %s", var4.method_41900()));
         }

         if (!class_2842.field_13938.equals(var4)) {
            throw class_2842.method_12941("Expected a connection header but was %s", var4.method_41869());
         }
      } else if (!this.method_24931(true, var1)) {
         throw class_2842.method_12941("Required SETTINGS preface not received");
      }
   }

   public boolean method_24931(boolean var1, class_7554 var2) throws IOException {
      try {
         this.field_27968.method_36608(9L);
      } catch (IOException var9) {
         return false;
      }

      int var5 = method_24939(this.field_27968);
      if (var5 >= 0 && var5 <= 16384) {
         byte var6 = (byte)(this.field_27968.method_36602() & 255);
         if (var1 && var6 != 4) {
            throw class_2842.method_12941("Expected a SETTINGS frame but was %s", var6);
         } else {
            byte var7 = (byte)(this.field_27968.method_36602() & 255);
            int var8 = this.field_27968.method_36603() & 2147483647;
            if (field_27967.isLoggable(Level.FINE)) {
               field_27967.fine(class_2842.method_12940(true, var8, var5, var6, var7));
            }

            switch (var6) {
               case 0:
                  this.method_24930(var2, var5, var7, var8);
                  break;
               case 1:
                  this.method_24941(var2, var5, var7, var8);
                  break;
               case 2:
                  this.method_24935(var2, var5, var7, var8);
                  break;
               case 3:
                  this.method_24932(var2, var5, var7, var8);
                  break;
               case 4:
                  this.method_24936(var2, var5, var7, var8);
                  break;
               case 5:
                  this.method_24937(var2, var5, var7, var8);
                  break;
               case 6:
                  this.method_24942(var2, var5, var7, var8);
                  break;
               case 7:
                  this.method_24938(var2, var5, var7, var8);
                  break;
               case 8:
                  this.method_24940(var2, var5, var7, var8);
                  break;
               default:
                  this.field_27968.method_36583((long)var5);
            }

            return true;
         }
      } else {
         throw class_2842.method_12941("FRAME_SIZE_ERROR: %s", var5);
      }
   }

   private void method_24941(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         boolean var7 = (var3 & 1) != 0;
         short var8 = (var3 & 8) == 0 ? 0 : (short)(this.field_27968.method_36602() & 255);
         if ((var3 & 32) != 0) {
            this.method_24934(var1, var4);
            var2 -= 5;
         }

         var2 = method_24945(var2, var3, var8);
         List var9 = this.method_24943(var2, var8, var3, var4);
         var1.method_34379(var7, var4, -1, var9);
      } else {
         throw class_2842.method_12941("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
      }
   }

   private List<class_4331> method_24943(int var1, short var2, byte var3, int var4) throws IOException {
      this.field_27966.field_15997 = this.field_27966.field_16000 = var1;
      this.field_27966.field_15998 = var2;
      this.field_27966.field_15994 = var3;
      this.field_27966.field_15996 = var4;
      this.field_27965.method_18402();
      return this.field_27965.method_18410();
   }

   private void method_24930(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         boolean var7 = (var3 & 1) != 0;
         boolean var8 = (var3 & 32) != 0;
         if (!var8) {
            short var9 = (var3 & 8) == 0 ? 0 : (short)(this.field_27968.method_36602() & 255);
            var2 = method_24945(var2, var3, var9);
            var1.method_34382(var7, var4, this.field_27968, var2);
            this.field_27968.method_36583((long)var9);
         } else {
            throw class_2842.method_12941("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
         }
      } else {
         throw class_2842.method_12941("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
      }
   }

   private void method_24935(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 5) {
         if (var4 != 0) {
            this.method_24934(var1, var4);
         } else {
            throw class_2842.method_12941("TYPE_PRIORITY streamId == 0");
         }
      } else {
         throw class_2842.method_12941("TYPE_PRIORITY length: %d != 5", var2);
      }
   }

   private void method_24934(class_7554 var1, int var2) throws IOException {
      int var5 = this.field_27968.method_36603();
      boolean var6 = false;
      int var8 = (this.field_27968.method_36602() & 255) + 1;
      byte var7;
      var1.method_34374(var2, var7, var8, var6);
   }

   private void method_24932(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 4) {
         if (var4 != 0) {
            int var7 = this.field_27968.method_36603();
            class_1692 var8 = class_1692.method_7618(var7);
            if (var8 != null) {
               var1.method_34384(var4, var8);
            } else {
               throw class_2842.method_12941("TYPE_RST_STREAM unexpected error code: %d", var7);
            }
         } else {
            throw class_2842.method_12941("TYPE_RST_STREAM streamId == 0");
         }
      } else {
         throw class_2842.method_12941("TYPE_RST_STREAM length: %d != 4", var2);
      }
   }

   private void method_24936(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         throw class_2842.method_12941("TYPE_SETTINGS streamId != 0");
      } else if ((var3 & 1) != 0) {
         if (var2 != 0) {
            throw class_2842.method_12941("FRAME_SIZE_ERROR ack frame should be empty!");
         } else {
            var1.method_34381();
         }
      } else if (var2 % 6 != 0) {
         throw class_2842.method_12941("TYPE_SETTINGS length %% 6 != 0: %s", var2);
      } else {
         class_5605 var7 = new class_5605();

         for (byte var8 = 0; var8 < var2; var8 += 6) {
            short var9 = this.field_27968.method_36588();
            int var10 = this.field_27968.method_36603();
            switch (var9) {
               case 1:
               case 6:
               default:
                  break;
               case 2:
                  if (var10 != 0 && var10 != 1) {
                     throw class_2842.method_12941("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                  }
                  break;
               case 3:
                  var9 = 4;
                  break;
               case 4:
                  var9 = 7;
                  if (var10 < 0) {
                     throw class_2842.method_12941("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                  }
                  break;
               case 5:
                  if (var10 < 16384 || var10 > 16777215) {
                     throw class_2842.method_12941("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", var10);
                  }
            }

            var7.method_25455(var9, var10);
         }

         var1.method_34383(false, var7);
      }
   }

   private void method_24937(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var4 != 0) {
         short var7 = (var3 & 8) == 0 ? 0 : (short)(this.field_27968.method_36602() & 255);
         int var8 = this.field_27968.method_36603() & 2147483647;
         var2 -= 4;
         var2 = method_24945(var2, var3, var7);
         List var9 = this.method_24943(var2, var7, var3, var4);
         var1.method_34378(var4, var8, var9);
      } else {
         throw class_2842.method_12941("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
      }
   }

   private void method_24942(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 8) {
         if (var4 == 0) {
            int var7 = this.field_27968.method_36603();
            int var8 = this.field_27968.method_36603();
            boolean var9 = (var3 & 1) != 0;
            var1.method_34376(var9, var7, var8);
         } else {
            throw class_2842.method_12941("TYPE_PING streamId != 0");
         }
      } else {
         throw class_2842.method_12941("TYPE_PING length != 8: %s", var2);
      }
   }

   private void method_24938(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 >= 8) {
         if (var4 == 0) {
            int var7 = this.field_27968.method_36603();
            int var8 = this.field_27968.method_36603();
            int var9 = var2 - 8;
            class_1692 var10 = class_1692.method_7618(var8);
            if (var10 != null) {
               class_9091 var11 = class_9091.field_46557;
               if (var9 > 0) {
                  var11 = this.field_27968.method_36587((long)var9);
               }

               var1.method_34380(var7, var10, var11);
            } else {
               throw class_2842.method_12941("TYPE_GOAWAY unexpected error code: %d", var8);
            }
         } else {
            throw class_2842.method_12941("TYPE_GOAWAY streamId != 0");
         }
      } else {
         throw class_2842.method_12941("TYPE_GOAWAY length < 8: %s", var2);
      }
   }

   private void method_24940(class_7554 var1, int var2, byte var3, int var4) throws IOException {
      if (var2 == 4) {
         long var7 = (long)this.field_27968.method_36603() & 2147483647L;
         if (var7 != 0L) {
            var1.method_34375(var4, var7);
         } else {
            throw class_2842.method_12941("windowSizeIncrement was 0", var7);
         }
      } else {
         throw class_2842.method_12941("TYPE_WINDOW_UPDATE length !=4: %s", var2);
      }
   }

   @Override
   public void close() throws IOException {
      this.field_27968.close();
   }

   public static int method_24939(class_8067 var0) throws IOException {
      return (var0.method_36602() & 0xFF) << 16 | (var0.method_36602() & 0xFF) << 8 | var0.method_36602() & 0xFF;
   }

   public static int method_24945(int var0, byte var1, short var2) throws IOException {
      if (var2 <= var0) {
         return (short)(var0 - var2);
      } else {
         throw class_2842.method_12941("PROTOCOL_ERROR padding %s > remaining length %s", var2, var0);
      }
   }
}
