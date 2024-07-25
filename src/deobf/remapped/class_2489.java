package remapped;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.lwjgl.BufferUtils;

public class class_2489 implements class_7411 {
   private int field_12390;
   private int field_12388;
   private int field_12387;
   private int field_12385;
   private short field_12389;

   private short method_11394(short var1) {
      byte var4;
      return (short)(var4 << 8 | (var4 & '\uff00') >>> 8);
   }

   @Override
   public int method_5154() {
      return this.field_12389;
   }

   @Override
   public int method_5155() {
      return this.field_12387;
   }

   @Override
   public int method_5153() {
      return this.field_12385;
   }

   @Override
   public int method_5150() {
      return this.field_12390;
   }

   @Override
   public int method_5151() {
      return this.field_12388;
   }

   @Override
   public ByteBuffer method_33768(InputStream var1) throws IOException {
      return this.method_33770(var1, true, null);
   }

   @Override
   public ByteBuffer method_33770(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.method_33769(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer method_33769(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException {
      if (var4 != null) {
         var3 = true;
      }

      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      BufferedInputStream var11 = new BufferedInputStream(var1, 100000);
      DataInputStream var12 = new DataInputStream(var11);
      short var13 = (short)var12.read();
      short var14 = (short)var12.read();
      short var15 = (short)var12.read();
      short var16 = this.method_11394(var12.readShort());
      short var17 = this.method_11394(var12.readShort());
      short var18 = (short)var12.read();
      short var19 = this.method_11394(var12.readShort());
      short var20 = this.method_11394(var12.readShort());
      if (var15 == 2) {
         this.field_12387 = this.method_11394(var12.readShort());
         this.field_12385 = this.method_11394(var12.readShort());
         this.field_12389 = (short)var12.read();
         if (this.field_12389 == 32) {
            var3 = false;
         }

         this.field_12390 = this.method_11392(this.field_12387);
         this.field_12388 = this.method_11392(this.field_12385);
         short var21 = (short)var12.read();
         if ((var21 & 32) == 0) {
            var2 = !var2;
         }

         if (var13 > 0) {
            var11.skip((long)var13);
         }

         Object var22 = null;
         if (this.field_12389 != 32 && !var3) {
            if (this.field_12389 != 24) {
               throw new RuntimeException("Only 24 and 32 bit TGAs are supported");
            }

            var22 = new byte[this.field_12390 * this.field_12388 * 3];
         } else {
            this.field_12389 = 32;
            var22 = new byte[this.field_12390 * this.field_12388 * 4];
         }

         if (this.field_12389 != 24) {
            if (this.field_12389 == 32) {
               if (!var2) {
                  for (int var23 = 0; var23 < this.field_12385; var23++) {
                     for (int var24 = 0; var24 < this.field_12387; var24++) {
                        var9 = var12.readByte();
                        var8 = var12.readByte();
                        var7 = var12.readByte();
                        if (!var3) {
                           var10 = var12.readByte();
                        } else {
                           var10 = -1;
                        }

                        int var25 = (var24 + var23 * this.field_12390) * 4;
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                           ((Object[])var22)[var25] = var7;
                           ((Object[])var22)[var25 + 1] = var8;
                           ((Object[])var22)[var25 + 2] = var9;
                           ((Object[])var22)[var25 + 3] = var10;
                        } else {
                           ((Object[])var22)[var25] = var7;
                           ((Object[])var22)[var25 + 1] = var8;
                           ((Object[])var22)[var25 + 2] = var9;
                           ((Object[])var22)[var25 + 3] = var10;
                        }

                        if (var10 == 0) {
                           ((Object[])var22)[var25 + 2] = 0;
                           ((Object[])var22)[var25 + 1] = 0;
                           ((Object[])var22)[var25] = 0;
                        }
                     }
                  }
               } else {
                  for (int var43 = this.field_12385 - 1; var43 >= 0; var43--) {
                     for (int var48 = 0; var48 < this.field_12387; var48++) {
                        var9 = var12.readByte();
                        var8 = var12.readByte();
                        var7 = var12.readByte();
                        if (!var3) {
                           var10 = var12.readByte();
                        } else {
                           var10 = -1;
                        }

                        int var53 = (var48 + var43 * this.field_12390) * 4;
                        ((Object[])var22)[var53] = var7;
                        ((Object[])var22)[var53 + 1] = var8;
                        ((Object[])var22)[var53 + 2] = var9;
                        ((Object[])var22)[var53 + 3] = var10;
                        if (var10 == 0) {
                           ((Object[])var22)[var53 + 2] = 0;
                           ((Object[])var22)[var53 + 1] = 0;
                           ((Object[])var22)[var53] = 0;
                        }
                     }
                  }
               }
            }
         } else if (!var2) {
            for (int var44 = 0; var44 < this.field_12385; var44++) {
               for (int var49 = 0; var49 < this.field_12387; var49++) {
                  var9 = var12.readByte();
                  var8 = var12.readByte();
                  var7 = var12.readByte();
                  int var54 = (var49 + var44 * this.field_12390) * 3;
                  ((Object[])var22)[var54] = var7;
                  ((Object[])var22)[var54 + 1] = var8;
                  ((Object[])var22)[var54 + 2] = var9;
               }
            }
         } else {
            for (int var45 = this.field_12385 - 1; var45 >= 0; var45--) {
               for (int var50 = 0; var50 < this.field_12387; var50++) {
                  var9 = var12.readByte();
                  var8 = var12.readByte();
                  var7 = var12.readByte();
                  int var55 = (var50 + var45 * this.field_12390) * 3;
                  ((Object[])var22)[var55] = var7;
                  ((Object[])var22)[var55 + 1] = var8;
                  ((Object[])var22)[var55 + 2] = var9;
               }
            }
         }

         var1.close();
         if (var4 != null) {
            for (byte var46 = 0; var46 < ((Object[])var22).length; var46 += 4) {
               boolean var51 = true;

               for (int var56 = 0; var56 < 3; var56++) {
                  if (((Object[])var22)[var46 + var56] != var4[var56]) {
                     var51 = false;
                  }
               }

               if (var51) {
                  ((Object[])var22)[var46 + 3] = 0;
               }
            }
         }

         ByteBuffer var47 = BufferUtils.createByteBuffer(((Object[])var22).length);
         var47.put((byte[])var22);
         int var52 = this.field_12389 / 8;
         if (this.field_12385 < this.field_12388 - 1) {
            int var57 = (this.field_12388 - 1) * this.field_12390 * var52;
            int var26 = (this.field_12385 - 1) * this.field_12390 * var52;

            for (int var27 = 0; var27 < this.field_12390 * var52; var27++) {
               var47.put(var57 + var27, var47.get(var27));
               var47.put(var26 + this.field_12390 * var52 + var27, var47.get(this.field_12390 * var52 + var27));
            }
         }

         if (this.field_12387 < this.field_12390 - 1) {
            for (int var58 = 0; var58 < this.field_12388; var58++) {
               for (int var59 = 0; var59 < var52; var59++) {
                  var47.put((var58 + 1) * this.field_12390 * var52 - var52 + var59, var47.get(var58 * this.field_12390 * var52 + var59));
                  var47.put(
                     var58 * this.field_12390 * var52 + this.field_12387 * var52 + var59,
                     var47.get(var58 * this.field_12390 * var52 + (this.field_12387 - 1) * var52 + var59)
                  );
               }
            }
         }

         ((Buffer)var47).flip();
         return var47;
      } else {
         throw new IOException("Slick only supports uncompressed RGB(A) TGA images");
      }
   }

   private int method_11392(int var1) {
      byte var4 = 2;

      while (var4 < var1) {
         var4 *= 2;
      }

      return var4;
   }

   @Override
   public ByteBuffer method_5152() {
      throw new RuntimeException("TGAImageData doesn't store it's image.");
   }

   @Override
   public void method_33771(boolean var1) {
   }
}
