package remapped;

import java.io.IOException;

public class class_7752 extends class_6926 {
   private int field_39322;
   private boolean field_39309;
   private boolean field_39312;
   private long field_39311;
   private long field_39313;
   private boolean field_39321;
   private boolean field_39319;
   private boolean field_39318;
   private boolean field_39315;
   private long[] field_39320;
   private long[] field_39317;
   private long[] field_39310;
   private long[] field_39316;

   public class_7752() {
      super("Track Fragment Run Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_39322 = (int)var1.method_27524(4);
      this.field_39309 = (this.field_35591 & 1) == 1;
      if (this.field_39309) {
         this.field_39311 = var1.method_27524(4);
      }

      this.field_39312 = (this.field_35591 & 4) == 4;
      if (this.field_39312) {
         this.field_39313 = var1.method_27524(4);
      }

      this.field_39321 = (this.field_35591 & 256) == 256;
      if (this.field_39321) {
         this.field_39320 = new long[this.field_39322];
      }

      this.field_39319 = (this.field_35591 & 512) == 512;
      if (this.field_39319) {
         this.field_39317 = new long[this.field_39322];
      }

      this.field_39318 = (this.field_35591 & 1024) == 1024;
      if (this.field_39318) {
         this.field_39310 = new long[this.field_39322];
      }

      this.field_39315 = (this.field_35591 & 2048) == 2048;
      if (this.field_39315) {
         this.field_39316 = new long[this.field_39322];
      }

      for (int var4 = 0; var4 < this.field_39322 && this.method_18113(var1) > 0L; var4++) {
         if (this.field_39321) {
            this.field_39320[var4] = var1.method_27524(4);
         }

         if (this.field_39319) {
            this.field_39317[var4] = var1.method_27524(4);
         }

         if (this.field_39318) {
            this.field_39310[var4] = var1.method_27524(4);
         }

         if (this.field_39315) {
            this.field_39316[var4] = var1.method_27524(4);
         }
      }
   }

   public int method_35179() {
      return this.field_39322;
   }

   public boolean method_35180() {
      return this.field_39309;
   }

   public long method_35185() {
      return this.field_39311;
   }

   public boolean method_35182() {
      return this.field_39312;
   }

   public long method_35183() {
      return this.field_39313;
   }

   public boolean method_35191() {
      return this.field_39321;
   }

   public long[] method_35188() {
      return this.field_39320;
   }

   public boolean method_35186() {
      return this.field_39319;
   }

   public long[] method_35184() {
      return this.field_39317;
   }

   public boolean method_35187() {
      return this.field_39318;
   }

   public long[] method_35190() {
      return this.field_39310;
   }

   public boolean method_35189() {
      return this.field_39315;
   }

   public long[] method_35181() {
      return this.field_39316;
   }
}
