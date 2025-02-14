package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class Class9303 {
   public final boolean field43182;
   public final Class1735 field43183;
   public final Class8211 field43184;
   public boolean field43185;
   public int field43186;
   public long field43187;
   public long field43188;
   public boolean field43189;
   public boolean field43190;
   public boolean field43191;
   public final byte[] field43192 = new byte[4];
   public final byte[] field43193 = new byte[8192];

   public Class9303(boolean var1, Class1735 var2, Class8211 var3) {
      if (var2 != null) {
         if (var3 != null) {
            this.field43182 = var1;
            this.field43183 = var2;
            this.field43184 = var3;
         } else {
            throw new NullPointerException("frameCallback == null");
         }
      } else {
         throw new NullPointerException("source == null");
      }
   }

   public void method35107() throws IOException {
      this.method35108();
      if (!this.field43190) {
         this.method35110();
      } else {
         this.method35109();
      }
   }

   private void method35108() throws IOException {
      if (this.field43185) {
         throw new IOException("closed");
      } else {
         long var3 = this.field43183.method7541().method15210();
         this.field43183.method7541().method15215();

         int var5;
         try {
            var5 = this.field43183.method7596() & 255;
         } finally {
            this.field43183.method7541().method15209(var3, TimeUnit.NANOSECONDS);
         }

         this.field43186 = var5 & 15;
         this.field43189 = (var5 & 128) != 0;
         this.field43190 = (var5 & 8) != 0;
         if (this.field43190 && !this.field43189) {
            throw new ProtocolException("Control frames must be final.");
         } else {
            boolean var6 = (var5 & 64) != 0;
            boolean var7 = (var5 & 32) != 0;
            boolean var8 = (var5 & 16) != 0;
            if (!var6 && !var7 && !var8) {
               int var9 = this.field43183.method7596() & 255;
               this.field43191 = (var9 & 128) != 0;
               if (this.field43191 == this.field43182) {
                  throw new ProtocolException(this.field43182 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
               } else {
                  this.field43187 = (long)(var9 & 127);
                  if (this.field43187 == 126L) {
                     this.field43187 = (long)this.field43183.method7598() & 65535L;
                  } else if (this.field43187 == 127L) {
                     this.field43187 = this.field43183.method7600();
                     if (this.field43187 < 0L) {
                        throw new ProtocolException("Frame length 0x" + Long.toHexString(this.field43187) + " > 0x7FFFFFFFFFFFFFFF");
                     }
                  }

                  this.field43188 = 0L;
                  if (this.field43190 && this.field43187 > 125L) {
                     throw new ProtocolException("Control frame must be less than 125B.");
                  } else {
                     if (this.field43191) {
                        this.field43183.method7624(this.field43192);
                     }
                  }
               }
            } else {
               throw new ProtocolException("Reserved flags are unsupported.");
            }
         }
      }
   }

   private void method35109() throws IOException {
      Class1734 var3 = new Class1734();
      if (this.field43188 < this.field43187) {
         if (this.field43182) {
            this.field43183.method7610(var3, this.field43187);
         } else {
            while (this.field43188 < this.field43187) {
               int var4 = (int)Math.min(this.field43187 - this.field43188, (long)this.field43193.length);
               int var5 = this.field43183.method7625(this.field43193, 0, var4);
               if (var5 == -1) {
                  throw new EOFException();
               }

               Class9677.method37751(this.field43193, (long)var5, this.field43192, this.field43188);
               var3.method7631(this.field43193, 0, var5);
               this.field43188 += (long)var5;
            }
         }
      }

      switch (this.field43186) {
         case 8:
            short var9 = 1005;
            String var10 = "";
            long var6 = var3.method7582();
            if (var6 == 1L) {
               throw new ProtocolException("Malformed close payload length of 1.");
            }

            if (var6 != 0L) {
               var9 = var3.method7598();
               var10 = var3.method7612();
               String var8 = Class9677.method37752(var9);
               if (var8 != null) {
                  throw new ProtocolException(var8);
               }
            }

            this.field43184.method28537(var9, var10);
            this.field43185 = true;
            break;
         case 9:
            this.field43184.method28535(var3.method7606());
            break;
         case 10:
            this.field43184.method28536(var3.method7606());
            break;
         default:
            throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.field43186));
      }
   }

   private void method35110() throws IOException {
      int var3 = this.field43186;
      if (var3 != 1 && var3 != 2) {
         throw new ProtocolException("Unknown opcode: " + Integer.toHexString(var3));
      } else {
         Class1734 var4 = new Class1734();
         this.method35112(var4);
         if (var3 != 1) {
            this.field43184.method28534(var4.method7606());
         } else {
            this.field43184.method28533(var4.method7612());
         }
      }
   }

   public void method35111() throws IOException {
      while (!this.field43185) {
         this.method35108();
         if (this.field43190) {
            this.method35109();
            continue;
         }
         break;
      }
   }

   private void method35112(Class1734 var1) throws IOException {
      while (!this.field43185) {
         if (this.field43188 == this.field43187) {
            if (this.field43189) {
               return;
            }

            this.method35111();
            if (this.field43186 != 0) {
               throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.field43186));
            }

            if (this.field43189 && this.field43187 == 0L) {
               return;
            }
         }

         long var4 = this.field43187 - this.field43188;
         long var6;
         if (!this.field43191) {
            var6 = this.field43183.method7633(var1, var4);
            if (var6 == -1L) {
               throw new EOFException();
            }
         } else {
            var4 = Math.min(var4, (long)this.field43193.length);
            var6 = (long)this.field43183.method7625(this.field43193, 0, (int)var4);
            if (var6 == -1L) {
               throw new EOFException();
            }

            Class9677.method37751(this.field43193, var6, this.field43192, this.field43188);
            var1.method7631(this.field43193, 0, (int)var6);
         }

         this.field43188 += var6;
      }

      throw new IOException("closed");
   }
}
