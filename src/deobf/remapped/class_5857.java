package remapped;

import java.io.IOException;

public class class_5857 extends class_6926 {
   private long field_29765;
   private int field_29770;
   private long[] field_29766;
   private long[] field_29763;
   private long[] field_29764;
   private long[] field_29767;
   private long[] field_29769;

   public class_5857() {
      super("Track Fragment Random Access Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_29765 = var1.method_27524(4);
      long var4 = var1.method_27524(4);
      int var6 = (int)(var4 >> 4 & 3L) + 1;
      int var7 = (int)(var4 >> 2 & 3L) + 1;
      int var8 = (int)(var4 & 3L) + 1;
      this.field_29770 = (int)var1.method_27524(4);
      int var9 = this.field_35590 != 1 ? 4 : 8;

      for (int var10 = 0; var10 < this.field_29770; var10++) {
         this.field_29766[var10] = var1.method_27524(var9);
         this.field_29763[var10] = var1.method_27524(var9);
         this.field_29764[var10] = var1.method_27524(var6);
         this.field_29767[var10] = var1.method_27524(var7);
         this.field_29769[var10] = var1.method_27524(var8);
      }
   }

   public long method_26703() {
      return this.field_29765;
   }

   public int method_26700() {
      return this.field_29770;
   }

   public long[] method_26702() {
      return this.field_29766;
   }

   public long[] method_26704() {
      return this.field_29763;
   }

   public long[] method_26701() {
      return this.field_29764;
   }

   public long[] method_26705() {
      return this.field_29767;
   }

   public long[] method_26706() {
      return this.field_29769;
   }
}
