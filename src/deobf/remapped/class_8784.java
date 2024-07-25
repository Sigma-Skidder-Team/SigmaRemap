package remapped;

import java.io.IOException;

public class class_8784 extends class_2159 {
   private int field_44955;
   private int field_44952;
   private int[] field_44954;
   private int[] field_44960;
   private int[] field_44953;
   private int[] field_44956;
   private int[] field_44958;
   private int[] field_44957;
   private boolean[] field_44959;

   public class_8784() {
      super("EAC-3 Specific Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      long var4 = var1.method_27524(2);
      this.field_44955 = (int)(var4 >> 3 & 8191L);
      this.field_44952 = (int)(var4 & 7L);

      for (int var6 = 0; var6 < this.field_44952; var6++) {
         var4 = var1.method_27524(3);
         this.field_44954[var6] = (int)(var4 >> 22 & 3L);
         this.field_44960[var6] = (int)(var4 >> 17 & 31L);
         this.field_44953[var6] = (int)(var4 >> 12 & 31L);
         this.field_44956[var6] = (int)(var4 >> 9 & 7L);
         this.field_44959[var6] = (var4 >> 5 & 1L) == 1L;
         this.field_44958[var6] = (int)(var4 >> 1 & 15L);
         if (this.field_44958[var6] > 0) {
            var4 = var4 << 8 | (long)var1.method_27531();
            this.field_44957[var6] = (int)(var4 & 511L);
         }
      }
   }

   public int method_40374() {
      return this.field_44955;
   }

   public int method_40379() {
      return this.field_44952;
   }

   public int[] method_40377() {
      return this.field_44954;
   }

   public int[] method_40375() {
      return this.field_44960;
   }

   public int[] method_40380() {
      return this.field_44953;
   }

   public int[] method_40376() {
      return this.field_44956;
   }

   public boolean[] method_40378() {
      return this.field_44959;
   }

   public int[] method_40381() {
      return this.field_44958;
   }

   public int[] method_40382() {
      return this.field_44957;
   }
}
