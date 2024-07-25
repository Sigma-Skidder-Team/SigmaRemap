package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class class_8700 implements class_7411 {
   private int field_44601;
   private int field_44600;
   private int field_44607;
   private int field_44605;
   private class_1447 field_44604;
   private int field_44606;
   private ByteBuffer field_44603;

   @Override
   public int method_5154() {
      return this.field_44606;
   }

   @Override
   public ByteBuffer method_5152() {
      return this.field_44603;
   }

   @Override
   public int method_5151() {
      return this.field_44607;
   }

   @Override
   public int method_5150() {
      return this.field_44605;
   }

   @Override
   public ByteBuffer method_33768(InputStream var1) throws IOException {
      return this.method_33770(var1, false, null);
   }

   @Override
   public ByteBuffer method_33770(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.method_33769(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer method_33769(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException {
      if (var4 != null) {
         var3 = true;
         throw new IOException("Transparent color not support in custom PNG Decoder");
      } else {
         class_1447 var7 = new class_1447(var1);
         if (var7.method_6644()) {
            this.field_44601 = var7.method_6648();
            this.field_44600 = var7.method_6663();
            this.field_44605 = this.method_39932(this.field_44601);
            this.field_44607 = this.method_39932(this.field_44600);
            int var8 = !var7.method_6653() ? 3 : 4;
            this.field_44606 = !var7.method_6653() ? 24 : 32;
            this.field_44603 = BufferUtils.createByteBuffer(this.field_44605 * this.field_44607 * var8);
            var7.method_6660(this.field_44603, this.field_44605 * var8, var8 != 4 ? class_1447.field_7793 : class_1447.field_7809);
            if (this.field_44600 < this.field_44607 - 1) {
               int var9 = (this.field_44607 - 1) * this.field_44605 * var8;
               int var10 = (this.field_44600 - 1) * this.field_44605 * var8;

               for (int var11 = 0; var11 < this.field_44605; var11++) {
                  for (int var12 = 0; var12 < var8; var12++) {
                     this.field_44603.put(var9 + var11 + var12, this.field_44603.get(var11 + var12));
                     this.field_44603.put(var10 + this.field_44605 * var8 + var11 + var12, this.field_44603.get(var10 + var11 + var12));
                  }
               }
            }

            if (this.field_44601 < this.field_44605 - 1) {
               for (int var15 = 0; var15 < this.field_44607; var15++) {
                  for (int var18 = 0; var18 < var8; var18++) {
                     this.field_44603.put((var15 + 1) * this.field_44605 * var8 - var8 + var18, this.field_44603.get(var15 * this.field_44605 * var8 + var18));
                     this.field_44603
                        .put(
                           var15 * this.field_44605 * var8 + this.field_44601 * var8 + var18,
                           this.field_44603.get(var15 * this.field_44605 * var8 + (this.field_44601 - 1) * var8 + var18)
                        );
                  }
               }
            }

            if (!var7.method_6653() && var3) {
               ByteBuffer var16 = BufferUtils.createByteBuffer(this.field_44605 * this.field_44607 * 4);

               for (int var19 = 0; var19 < this.field_44605; var19++) {
                  for (int var21 = 0; var21 < this.field_44607; var21++) {
                     int var23 = var21 * 3 + var19 * this.field_44607 * 3;
                     int var13 = var21 * 4 + var19 * this.field_44607 * 4;
                     var16.put(var13, this.field_44603.get(var23));
                     var16.put(var13 + 1, this.field_44603.get(var23 + 1));
                     var16.put(var13 + 2, this.field_44603.get(var23 + 2));
                     if (var19 < this.method_5153() && var21 < this.method_5155()) {
                        var16.put(var13 + 3, (byte)-1);
                     } else {
                        var16.put(var13 + 3, (byte)0);
                     }
                  }
               }

               this.field_44606 = 32;
               this.field_44603 = var16;
            }

            if (var4 != null) {
               for (byte var17 = 0; var17 < this.field_44605 * this.field_44607 * 4; var17 += 4) {
                  boolean var20 = true;

                  for (int var22 = 0; var22 < 3; var22++) {
                     if (this.method_39933(this.field_44603.get(var17 + var22)) != var4[var22]) {
                        var20 = false;
                     }
                  }

                  if (var20) {
                     this.field_44603.put(var17 + 3, (byte)0);
                  }
               }
            }

            ((Buffer)this.field_44603).position(0);
            return this.field_44603;
         } else {
            throw new IOException("Only RGB formatted images are supported by the PNGLoader");
         }
      }
   }

   private int method_39933(byte var1) {
      return var1 >= 0 ? var1 : 256 + var1;
   }

   private int method_39932(int var1) {
      byte var4 = 2;

      while (var4 < var1) {
         var4 *= 2;
      }

      return var4;
   }

   @Override
   public void method_33771(boolean var1) {
   }

   @Override
   public int method_5155() {
      return this.field_44601;
   }

   @Override
   public int method_5153() {
      return this.field_44600;
   }
}
