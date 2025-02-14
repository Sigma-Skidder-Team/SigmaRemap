package mapped;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Class1759 extends FilterOutputStream {
   private boolean field9529;
   private int field9530;
   private byte[] field9531;
   private int field9532;
   private int field9533;
   private boolean field9534 = false;
   private byte[] field9535;
   private boolean field9536;
   private int field9537;
   private byte[] field9538;

   public Class1759(OutputStream var1) {
      this(var1, 1);
   }

   public Class1759(OutputStream var1, int var2) {
      super(var1);
      this.field9529 = false;
      this.field9532 = !this.field9529 ? 4 : 3;
      this.field9531 = new byte[this.field9532];
      this.field9530 = 0;
      this.field9533 = 0;
      this.field9536 = false;
      this.field9535 = new byte[4];
      this.field9537 = var2;
      this.field9538 = Class9290.method35025(var2);
   }

   @Override
   public void write(int var1) throws IOException {
      if (!this.field9536) {
         if (!this.field9529) {
            if (this.field9538[var1 & 127] <= -5) {
               if (this.field9538[var1 & 127] != -5) {
                  throw new IOException("Invalid character in Base64 data.");
               }
            } else {
               this.field9531[this.field9530++] = (byte)var1;
               if (this.field9530 >= this.field9532) {
                  int var4 = Class9290.method35027(this.field9531, 0, this.field9535, 0, this.field9537);
                  this.out.write(this.field9535, 0, var4);
                  this.field9530 = 0;
               }
            }
         } else {
            this.field9531[this.field9530++] = (byte)var1;
            if (this.field9530 >= this.field9532) {
               this.out.write(Class9290.method35026(this.field9535, this.field9531, this.field9532, this.field9537));
               this.field9533 += 4;
               if (this.field9534 && this.field9533 >= 76) {
                  this.out.write(10);
                  this.field9533 = 0;
               }

               this.field9530 = 0;
            }
         }
      } else {
         this.out.write(var1);
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if (this.field9536) {
         this.out.write(var1, var2, var3);
      } else {
         for (int var6 = 0; var6 < var3; var6++) {
            this.write(var1[var2 + var6]);
         }
      }
   }

   public void method7700() throws IOException {
      if (this.field9530 > 0) {
         if (!this.field9529) {
            throw new IOException("Base64 input not properly padded.");
         }

         this.out.write(Class9290.method35026(this.field9535, this.field9531, this.field9530, this.field9537));
         this.field9530 = 0;
      }
   }

   @Override
   public void close() throws IOException {
      this.method7700();
      super.close();
      this.field9531 = null;
      this.out = null;
   }
}
