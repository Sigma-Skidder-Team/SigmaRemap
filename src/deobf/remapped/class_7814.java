package remapped;

import java.io.IOException;

public class class_7814 extends class_6926 {
   private int[] field_39641;
   private int[] field_39642;
   private long[] field_39646;
   private long[][] field_39644;
   private long[][] field_39645;

   public class_7814() {
      super("Item Location Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      long var4 = var1.method_27524(2);
      int var6 = (int)(var4 >> 12) & 15;
      int var7 = (int)(var4 >> 8) & 15;
      int var8 = (int)(var4 >> 4) & 15;
      int var9 = (int)var1.method_27524(2);
      this.field_39642 = new int[var9];
      this.field_39646 = new long[var9];
      this.field_39644 = new long[var9][];
      this.field_39645 = new long[var9][];

      for (int var10 = 0; var10 < var9; var10++) {
         this.field_39641[var10] = (int)var1.method_27524(2);
         this.field_39642[var10] = (int)var1.method_27524(2);
         this.field_39646[var10] = var1.method_27524(var8);
         int var11 = (int)var1.method_27524(2);
         this.field_39644[var10] = new long[var11];
         this.field_39645[var10] = new long[var11];

         for (int var12 = 0; var12 < var11; var12++) {
            this.field_39644[var10][var12] = var1.method_27524(var6);
            this.field_39645[var10][var12] = var1.method_27524(var7);
         }
      }
   }

   public int[] method_35407() {
      return this.field_39641;
   }

   public int[] method_35406() {
      return this.field_39642;
   }

   public long[] method_35409() {
      return this.field_39646;
   }

   public long[][] method_35410() {
      return this.field_39644;
   }

   public long[][] method_35408() {
      return this.field_39645;
   }
}
