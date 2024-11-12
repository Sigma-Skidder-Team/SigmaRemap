package mapped;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.newdawn.slick.opengl.LoadableImageData;
import org.lwjgl.BufferUtils;

public class Class6960 implements LoadableImageData {
   private int field30151;
   private int field30152;
   private int field30153;
   private int field30154;
   private short field30155;

   private short method21474(short var1) {
      int var4 = var1 & 0xFFFF;
      return (short)(var4 << 8 | (var4 & '\uff00') >>> 8);
   }

   @Override
   public int getDepth() {
      return this.field30155;
   }

   @Override
   public int getWidth() {
      return this.field30153;
   }

   @Override
   public int getHeight() {
      return this.field30154;
   }

   @Override
   public int getTexWidth() {
      return this.field30151;
   }

   @Override
   public int getTexHeight() {
      return this.field30152;
   }

   @Override
   public ByteBuffer loadImage(InputStream var1) throws IOException {
      return this.loadImage(var1, true, null);
   }

   @Override
   public ByteBuffer loadImage(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.loadImage(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer loadImage(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException {
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
      short var16 = this.method21474(var12.readShort());
      short var17 = this.method21474(var12.readShort());
      short var18 = (short)var12.read();
      short var19 = this.method21474(var12.readShort());
      short var20 = this.method21474(var12.readShort());
      if (var15 == 2) {
         this.field30153 = this.method21474(var12.readShort());
         this.field30154 = this.method21474(var12.readShort());
         this.field30155 = (short)var12.read();
         if (this.field30155 == 32) {
            var3 = false;
         }

         this.field30151 = this.method21475(this.field30153);
         this.field30152 = this.method21475(this.field30154);
         short var21 = (short)var12.read();
         if ((var21 & 32) == 0) {
            var2 = !var2;
         }

         if (var13 > 0) {
            var11.skip((long)var13);
         }

         byte[] var22 = null;
         if (this.field30155 != 32 && !var3) {
            if (this.field30155 != 24) {
               throw new RuntimeException("Only 24 and 32 bit TGAs are supported");
            }

            var22 = new byte[this.field30151 * this.field30152 * 3];
         } else {
            this.field30155 = 32;
            var22 = new byte[this.field30151 * this.field30152 * 4];
         }

         if (this.field30155 != 24) {
            if (this.field30155 == 32) {
               if (!var2) {
                  for (int var23 = 0; var23 < this.field30154; var23++) {
                     for (int var24 = 0; var24 < this.field30153; var24++) {
                        var9 = var12.readByte();
                        var8 = var12.readByte();
                        var7 = var12.readByte();
                        if (!var3) {
                           var10 = var12.readByte();
                        } else {
                           var10 = -1;
                        }

                        int var25 = (var24 + var23 * this.field30151) * 4;
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                           var22[var25] = var7;
                           var22[var25 + 1] = var8;
                           var22[var25 + 2] = var9;
                           var22[var25 + 3] = var10;
                        } else {
                           var22[var25] = var7;
                           var22[var25 + 1] = var8;
                           var22[var25 + 2] = var9;
                           var22[var25 + 3] = var10;
                        }

                        if (var10 == 0) {
                           var22[var25 + 2] = 0;
                           var22[var25 + 1] = 0;
                           var22[var25] = 0;
                        }
                     }
                  }
               } else {
                  for (int var43 = this.field30154 - 1; var43 >= 0; var43--) {
                     for (int var48 = 0; var48 < this.field30153; var48++) {
                        var9 = var12.readByte();
                        var8 = var12.readByte();
                        var7 = var12.readByte();
                        if (!var3) {
                           var10 = var12.readByte();
                        } else {
                           var10 = -1;
                        }

                        int var53 = (var48 + var43 * this.field30151) * 4;
                        var22[var53] = var7;
                        var22[var53 + 1] = var8;
                        var22[var53 + 2] = var9;
                        var22[var53 + 3] = var10;
                        if (var10 == 0) {
                            var22[var53 + 2] = 0;
                            var22[var53 + 1] = 0;
                            var22[var53] = 0;
                        }
                     }
                  }
               }
            }
         } else if (!var2) {
            for (int var44 = 0; var44 < this.field30154; var44++) {
               for (int var49 = 0; var49 < this.field30153; var49++) {
                  var9 = var12.readByte();
                  var8 = var12.readByte();
                  var7 = var12.readByte();
                  int var54 = (var49 + var44 * this.field30151) * 3;
                   var22[var54] = var7;
                   var22[var54 + 1] = var8;
                   var22[var54 + 2] = var9;
               }
            }
         } else {
            for (int var45 = this.field30154 - 1; var45 >= 0; var45--) {
               for (int var50 = 0; var50 < this.field30153; var50++) {
                  var9 = var12.readByte();
                  var8 = var12.readByte();
                  var7 = var12.readByte();
                  int var55 = (var50 + var45 * this.field30151) * 3;
                  var22[var55] = var7;
                  var22[var55 + 1] = var8;
                  var22[var55 + 2] = var9;
               }
            }
         }

         var1.close();
         if (var4 != null) {
            for (int var46 = 0; var46 < var22.length; var46 += 4) {
               boolean var51 = true;

               for (int var56 = 0; var56 < 3; var56++) {
                  if ((var22)[var46 + var56] != var4[var56]) {
                     var51 = false;
                  }
               }

               if (var51) {
                  (var22)[var46 + 3] = 0;
               }
            }
         }

         ByteBuffer var47 = BufferUtils.createByteBuffer(var22.length);
         var47.put((byte[])var22);
         int var52 = this.field30155 / 8;
         if (this.field30154 < this.field30152 - 1) {
            int var57 = (this.field30152 - 1) * this.field30151 * var52;
            int var26 = (this.field30154 - 1) * this.field30151 * var52;

            for (int var27 = 0; var27 < this.field30151 * var52; var27++) {
               var47.put(var57 + var27, var47.get(var27));
               var47.put(var26 + this.field30151 * var52 + var27, var47.get(this.field30151 * var52 + var27));
            }
         }

         if (this.field30153 < this.field30151 - 1) {
            for (int var58 = 0; var58 < this.field30152; var58++) {
               for (int var59 = 0; var59 < var52; var59++) {
                  var47.put((var58 + 1) * this.field30151 * var52 - var52 + var59, var47.get(var58 * this.field30151 * var52 + var59));
                  var47.put(
                     var58 * this.field30151 * var52 + this.field30153 * var52 + var59,
                     var47.get(var58 * this.field30151 * var52 + (this.field30153 - 1) * var52 + var59)
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

   private int method21475(int var1) {
      int var4 = 2;

      while (var4 < var1) {
         var4 *= 2;
      }

      return var4;
   }

   @Override
   public ByteBuffer getImageBufferData() {
      throw new RuntimeException("TGAImageData doesn't store it's image.");
   }

   @Override
   public void configureEdging(boolean var1) {
   }
}
