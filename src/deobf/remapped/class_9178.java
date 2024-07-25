package remapped;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class class_9178 extends FilterOutputStream {
   private boolean field_46952;
   private int field_46956;
   private byte[] field_46954;
   private int field_46960;
   private int field_46953;
   private boolean field_46955 = false;
   private byte[] field_46959;
   private boolean field_46957;
   private int field_46958;
   private byte[] field_46961;

   public class_9178(OutputStream var1) {
      this(var1, 1);
   }

   public class_9178(OutputStream var1, int var2) {
      super(var1);
      this.field_46952 = false;
      this.field_46960 = !this.field_46952 ? 4 : 3;
      this.field_46954 = new byte[this.field_46960];
      this.field_46956 = 0;
      this.field_46953 = 0;
      this.field_46957 = false;
      this.field_46959 = new byte[4];
      this.field_46958 = var2;
      this.field_46961 = class_7827.method_35444(var2);
   }

   @Override
   public void write(int var1) throws IOException {
      if (!this.field_46957) {
         if (!this.field_46952) {
            if (this.field_46961[var1 & 127] <= -5) {
               if (this.field_46961[var1 & 127] != -5) {
                  throw new IOException("Invalid character in Base64 data.");
               }
            } else {
               this.field_46954[this.field_46956++] = (byte)var1;
               if (this.field_46956 >= this.field_46960) {
                  int var4 = class_7827.method_35448(this.field_46954, 0, this.field_46959, 0, this.field_46958);
                  this.out.write(this.field_46959, 0, var4);
                  this.field_46956 = 0;
               }
            }
         } else {
            this.field_46954[this.field_46956++] = (byte)var1;
            if (this.field_46956 >= this.field_46960) {
               this.out.write(class_7827.method_35445(this.field_46959, this.field_46954, this.field_46960, this.field_46958));
               this.field_46953 += 4;
               if (this.field_46955 && this.field_46953 >= 76) {
                  this.out.write(10);
                  this.field_46953 = 0;
               }

               this.field_46956 = 0;
            }
         }
      } else {
         this.out.write(var1);
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if (this.field_46957) {
         this.out.write(var1, var2, var3);
      } else {
         for (int var6 = 0; var6 < var3; var6++) {
            this.write(var1[var2 + var6]);
         }
      }
   }

   public void method_42292() throws IOException {
      if (this.field_46956 > 0) {
         if (!this.field_46952) {
            throw new IOException("Base64 input not properly padded.");
         }

         this.out.write(class_7827.method_35445(this.field_46959, this.field_46954, this.field_46956, this.field_46958));
         this.field_46956 = 0;
      }
   }

   @Override
   public void close() throws IOException {
      this.method_42292();
      super.close();
      this.field_46954 = null;
      this.out = null;
   }
}
