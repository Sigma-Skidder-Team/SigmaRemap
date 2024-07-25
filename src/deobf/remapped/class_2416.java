package remapped;

import java.io.IOException;
import java.util.Arrays;

public class class_2416 extends class_6926 {
   private long field_12023;
   private long[] field_12022;

   public class_2416() {
      super("Sample Size Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      boolean var4 = this.field_19002 == 1937013298L;
      int var5;
      if (!var4) {
         var5 = (int)var1.method_27524(4);
      } else {
         var1.method_27527(3L);
         var5 = var1.method_27531();
      }

      this.field_12023 = var1.method_27524(4);
      this.field_12022 = new long[(int)this.field_12023];
      if (!var4) {
         if (var5 != 0) {
            Arrays.fill(this.field_12022, (long)var5);
         } else {
            this.method_11022(var1, 4);
         }
      } else if (var5 != 4) {
         this.method_11022(var1, var5 / 8);
      } else {
         for (byte var6 = 0; (long)var6 < this.field_12023; var6 += 2) {
            int var7 = var1.method_27531();
            this.field_12022[var6] = (long)(var7 >> 4 & 15);
            this.field_12022[var6 + 1] = (long)(var7 & 15);
         }
      }
   }

   private void method_11022(class_6041 var1, int var2) throws IOException {
      for (int var5 = 0; (long)var5 < this.field_12023; var5++) {
         this.field_12022[var5] = var1.method_27524(var2);
      }
   }

   public int method_11023() {
      return (int)this.field_12023;
   }

   public long[] method_11024() {
      return this.field_12022;
   }
}
