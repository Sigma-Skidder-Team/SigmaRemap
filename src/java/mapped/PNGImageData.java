package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

import lol.LoadableImageData;
import org.lwjgl.BufferUtils;

public class PNGImageData implements LoadableImageData {
   private int field30156;
   private int field30157;
   private int field30158;
   private int field30159;
   private PNGDecoder field30160;
   private int field30161;
   private ByteBuffer field30162;

   @Override
   public int method21455() {
      return this.field30161;
   }

   @Override
   public ByteBuffer method21460() {
      return this.field30162;
   }

   @Override
   public int method21459() {
      return this.field30158;
   }

   @Override
   public int method21458() {
      return this.field30159;
   }

   @Override
   public ByteBuffer method21467(InputStream var1) throws IOException {
      return this.method21468(var1, false, null);
   }

   @Override
   public ByteBuffer method21468(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.method21469(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer method21469(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException {
      if (var4 != null) {
         var3 = true;
         throw new IOException("Transparent color not support in custom PNG Decoder");
      } else {
         PNGDecoder var7 = new PNGDecoder(var1);
         if (var7.method22403()) {
            this.field30156 = var7.method22401();
            this.field30157 = var7.method22400();
            this.field30159 = this.method21477(this.field30156);
            this.field30158 = this.method21477(this.field30157);
            int var8 = !var7.method22402() ? 3 : 4;
            this.field30161 = !var7.method22402() ? 24 : 32;
            this.field30162 = BufferUtils.createByteBuffer(this.field30159 * this.field30158 * var8);
            var7.method22405(this.field30162, this.field30159 * var8, var8 != 4 ? PNGDecoder.field30765 : PNGDecoder.field30766);
            if (this.field30157 < this.field30158 - 1) {
               int var9 = (this.field30158 - 1) * this.field30159 * var8;
               int var10 = (this.field30157 - 1) * this.field30159 * var8;

               for (int var11 = 0; var11 < this.field30159; var11++) {
                  for (int var12 = 0; var12 < var8; var12++) {
                     this.field30162.put(var9 + var11 + var12, this.field30162.get(var11 + var12));
                     this.field30162.put(var10 + this.field30159 * var8 + var11 + var12, this.field30162.get(var10 + var11 + var12));
                  }
               }
            }

            if (this.field30156 < this.field30159 - 1) {
               for (int var15 = 0; var15 < this.field30158; var15++) {
                  for (int var18 = 0; var18 < var8; var18++) {
                     this.field30162.put((var15 + 1) * this.field30159 * var8 - var8 + var18, this.field30162.get(var15 * this.field30159 * var8 + var18));
                     this.field30162
                        .put(
                           var15 * this.field30159 * var8 + this.field30156 * var8 + var18,
                           this.field30162.get(var15 * this.field30159 * var8 + (this.field30156 - 1) * var8 + var18)
                        );
                  }
               }
            }

            if (!var7.method22402() && var3) {
               ByteBuffer var16 = BufferUtils.createByteBuffer(this.field30159 * this.field30158 * 4);

               for (int var19 = 0; var19 < this.field30159; var19++) {
                  for (int var21 = 0; var21 < this.field30158; var21++) {
                     int var23 = var21 * 3 + var19 * this.field30158 * 3;
                     int var13 = var21 * 4 + var19 * this.field30158 * 4;
                     var16.put(var13, this.field30162.get(var23));
                     var16.put(var13 + 1, this.field30162.get(var23 + 1));
                     var16.put(var13 + 2, this.field30162.get(var23 + 2));
                     if (var19 < this.method21457() && var21 < this.method21456()) {
                        var16.put(var13 + 3, (byte)-1);
                     } else {
                        var16.put(var13 + 3, (byte)0);
                     }
                  }
               }

               this.field30161 = 32;
               this.field30162 = var16;
            }

            if (var4 != null) {
               for (int var17 = 0; var17 < this.field30159 * this.field30158 * 4; var17 += 4) {
                  boolean var20 = true;

                  for (int var22 = 0; var22 < 3; var22++) {
                     if (this.method21476(this.field30162.get(var17 + var22)) != var4[var22]) {
                        var20 = false;
                     }
                  }

                  if (var20) {
                     this.field30162.put(var17 + 3, (byte)0);
                  }
               }
            }

            ((Buffer)this.field30162).position(0);
            return this.field30162;
         } else {
            throw new IOException("Only RGB formatted images are supported by the PNGLoader");
         }
      }
   }

   private int method21476(byte var1) {
      return var1 >= 0 ? var1 : 256 + var1;
   }

   private int method21477(int var1) {
      int var4 = 2;

      while (var4 < var1) {
         var4 *= 2;
      }

      return var4;
   }

   @Override
   public void method21466(boolean var1) {
   }

   @Override
   public int method21456() {
      return this.field30156;
   }

   @Override
   public int method21457() {
      return this.field30157;
   }
}
