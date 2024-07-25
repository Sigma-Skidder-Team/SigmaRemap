package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class class_7871 {
   public final boolean field_40294;
   public final class_8067 field_40298;
   public final class_3889 field_40288;
   public boolean field_40290;
   public int field_40296;
   public long field_40292;
   public long field_40297;
   public boolean field_40293;
   public boolean field_40295;
   public boolean field_40289;
   public final byte[] field_40291 = new byte[4];
   public final byte[] field_40300 = new byte[8192];

   public class_7871(boolean var1, class_8067 var2, class_3889 var3) {
      if (var2 != null) {
         if (var3 != null) {
            this.field_40294 = var1;
            this.field_40298 = var2;
            this.field_40288 = var3;
         } else {
            throw new NullPointerException("frameCallback == null");
         }
      } else {
         throw new NullPointerException("source == null");
      }
   }

   public void method_35621() throws IOException {
      this.method_35623();
      if (!this.field_40295) {
         this.method_35622();
      } else {
         this.method_35625();
      }
   }

   private void method_35623() throws IOException {
      if (this.field_40290) {
         throw new IOException("closed");
      } else {
         long var3 = this.field_40298.method_19192().method_1078();
         this.field_40298.method_19192().method_1075();

         int var5;
         try {
            var5 = this.field_40298.method_36602() & 255;
         } finally {
            this.field_40298.method_19192().method_1070(var3, TimeUnit.NANOSECONDS);
         }

         this.field_40296 = var5 & 15;
         this.field_40293 = (var5 & 128) != 0;
         this.field_40295 = (var5 & 8) != 0;
         if (this.field_40295 && !this.field_40293) {
            throw new ProtocolException("Control frames must be final.");
         } else {
            boolean var6 = (var5 & 64) != 0;
            boolean var7 = (var5 & 32) != 0;
            boolean var8 = (var5 & 16) != 0;
            if (!var6 && !var7 && !var8) {
               int var9 = this.field_40298.method_36602() & 255;
               this.field_40289 = (var9 & 128) != 0;
               if (this.field_40289 == this.field_40294) {
                  throw new ProtocolException(this.field_40294 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
               } else {
                  this.field_40292 = (long)(var9 & 127);
                  if (this.field_40292 == 126L) {
                     this.field_40292 = (long)this.field_40298.method_36588() & 65535L;
                  } else if (this.field_40292 == 127L) {
                     this.field_40292 = this.field_40298.method_36594();
                     if (this.field_40292 < 0L) {
                        throw new ProtocolException("Frame length 0x" + Long.toHexString(this.field_40292) + " > 0x7FFFFFFFFFFFFFFF");
                     }
                  }

                  this.field_40297 = 0L;
                  if (this.field_40295 && this.field_40292 > 125L) {
                     throw new ProtocolException("Control frame must be less than 125B.");
                  } else {
                     if (this.field_40289) {
                        this.field_40298.method_36576(this.field_40291);
                     }
                  }
               }
            } else {
               throw new ProtocolException("Reserved flags are unsupported.");
            }
         }
      }
   }

   private void method_35625() throws IOException {
      class_7059 var3 = new class_7059();
      if (this.field_40297 < this.field_40292) {
         if (this.field_40294) {
            this.field_40298.method_36575(var3, this.field_40292);
         } else {
            while (this.field_40297 < this.field_40292) {
               int var4 = (int)Math.min(this.field_40292 - this.field_40297, (long)this.field_40300.length);
               int var5 = this.field_40298.method_36578(this.field_40300, 0, var4);
               if (var5 == -1) {
                  throw new EOFException();
               }

               class_9294.method_42771(this.field_40300, (long)var5, this.field_40291, this.field_40297);
               var3.method_32489(this.field_40300, 0, var5);
               this.field_40297 += (long)var5;
            }
         }
      }

      switch (this.field_40296) {
         case 8:
            short var9 = 1005;
            String var10 = "";
            long var6 = var3.method_32468();
            if (var6 == 1L) {
               throw new ProtocolException("Malformed close payload length of 1.");
            }

            if (var6 != 0L) {
               var9 = var3.method_36588();
               var10 = var3.method_36592();
               String var8 = class_9294.method_42767(var9);
               if (var8 != null) {
                  throw new ProtocolException(var8);
               }
            }

            this.field_40288.method_17997(var9, var10);
            this.field_40290 = true;
            break;
         case 9:
            this.field_40288.method_17998(var3.method_36586());
            break;
         case 10:
            this.field_40288.method_18001(var3.method_36586());
            break;
         default:
            throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.field_40296));
      }
   }

   private void method_35622() throws IOException {
      int var3 = this.field_40296;
      if (var3 != 1 && var3 != 2) {
         throw new ProtocolException("Unknown opcode: " + Integer.toHexString(var3));
      } else {
         class_7059 var4 = new class_7059();
         this.method_35626(var4);
         if (var3 != 1) {
            this.field_40288.method_18000(var4.method_36586());
         } else {
            this.field_40288.method_17999(var4.method_36592());
         }
      }
   }

   public void method_35627() throws IOException {
      while (!this.field_40290) {
         this.method_35623();
         if (this.field_40295) {
            this.method_35625();
            continue;
         }
         break;
      }
   }

   private void method_35626(class_7059 var1) throws IOException {
      while (!this.field_40290) {
         if (this.field_40297 == this.field_40292) {
            if (this.field_40293) {
               return;
            }

            this.method_35627();
            if (this.field_40296 != 0) {
               throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.field_40296));
            }

            if (this.field_40293 && this.field_40292 == 0L) {
               return;
            }
         }

         long var4 = this.field_40292 - this.field_40297;
         long var6;
         if (!this.field_40289) {
            var6 = this.field_40298.method_24273(var1, var4);
            if (var6 == -1L) {
               throw new EOFException();
            }
         } else {
            var4 = Math.min(var4, (long)this.field_40300.length);
            var6 = (long)this.field_40298.method_36578(this.field_40300, 0, (int)var4);
            if (var6 == -1L) {
               throw new EOFException();
            }

            class_9294.method_42771(this.field_40300, var6, this.field_40291, this.field_40297);
            var1.method_32489(this.field_40300, 0, (int)var6);
         }

         this.field_40297 += var6;
      }

      throw new IOException("closed");
   }
}
