package remapped;

public final class class_1124 {
   private static String[] field_6418;
   private static final int field_6424 = 32768;
   private static final int field_6425 = 32767;
   private int field_6421;
   private int field_6422;
   private int field_6419;
   private final int[] field_6423 = new int[32768];
   private int field_6420;

   public class_1124() {
      this.field_6421 = 0;
      this.field_6422 = 0;
      this.field_6419 = 0;
   }

   public int method_4949() {
      return this.field_6422;
   }

   public int method_4952(int var1) {
      this.field_6422 += var1;
      int var4 = 0;
      int var5 = this.field_6419;
      if (var5 + var1 >= 32768) {
         while (var1-- > 0) {
            var4 <<= 1;
            var4 |= this.field_6423[var5] == 0 ? 0 : 1;
            var5 = var5 + 1 & 32767;
         }
      } else {
         while (var1-- > 0) {
            var4 <<= 1;
            var4 |= this.field_6423[var5++] == 0 ? 0 : 1;
         }
      }

      this.field_6419 = var5;
      return var4;
   }

   public int method_4950() {
      this.field_6422++;
      int var3 = this.field_6423[this.field_6419];
      this.field_6419 = this.field_6419 + 1 & 32767;
      return var3;
   }

   public void method_4947(int var1) {
      int var4 = this.field_6421;
      this.field_6423[var4++] = var1 & 128;
      this.field_6423[var4++] = var1 & 64;
      this.field_6423[var4++] = var1 & 32;
      this.field_6423[var4++] = var1 & 16;
      this.field_6423[var4++] = var1 & 8;
      this.field_6423[var4++] = var1 & 4;
      this.field_6423[var4++] = var1 & 2;
      this.field_6423[var4++] = var1 & 1;
      if (var4 != 32768) {
         this.field_6421 = var4;
      } else {
         this.field_6421 = 0;
      }
   }

   public void method_4948(int var1) {
      this.field_6422 -= var1;
      this.field_6419 -= var1;
      if (this.field_6419 < 0) {
         this.field_6419 += 32768;
      }
   }

   public void method_4951(int var1) {
      int var4 = var1 << 3;
      this.field_6422 -= var4;
      this.field_6419 -= var4;
      if (this.field_6419 < 0) {
         this.field_6419 += 32768;
      }
   }
}
