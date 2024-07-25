package remapped;

import java.io.IOException;

public class class_8611 extends class_6926 {
   private long field_44166;
   private boolean field_44161;
   private boolean field_44164;
   private boolean field_44159;
   private boolean field_44169;
   private boolean field_44158;
   private boolean field_44167;
   private long field_44157;
   private long field_44162;
   private long field_44160;
   private long field_44168;
   private long field_44163;

   public class_8611() {
      super("Track Fragment Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_44166 = var1.method_27524(4);
      this.field_44161 = (this.field_35591 & 1) == 1;
      this.field_44157 = !this.field_44161 ? 0L : var1.method_27524(8);
      this.field_44164 = (this.field_35591 & 2) == 2;
      this.field_44162 = !this.field_44164 ? 0L : var1.method_27524(4);
      this.field_44159 = (this.field_35591 & 8) == 8;
      this.field_44160 = !this.field_44159 ? 0L : var1.method_27524(4);
      this.field_44169 = (this.field_35591 & 16) == 16;
      this.field_44168 = !this.field_44169 ? 0L : var1.method_27524(4);
      this.field_44158 = (this.field_35591 & 32) == 32;
      this.field_44163 = !this.field_44158 ? 0L : var1.method_27524(4);
      this.field_44167 = (this.field_35591 & 65536) == 65536;
   }

   public long method_39571() {
      return this.field_44166;
   }

   public boolean method_39580() {
      return this.field_44161;
   }

   public long method_39574() {
      return this.field_44157;
   }

   public boolean method_39576() {
      return this.field_44164;
   }

   public long method_39577() {
      return this.field_44162;
   }

   public boolean method_39573() {
      return this.field_44159;
   }

   public long method_39570() {
      return this.field_44160;
   }

   public boolean method_39581() {
      return this.field_44169;
   }

   public long method_39572() {
      return this.field_44168;
   }

   public boolean method_39579() {
      return this.field_44158;
   }

   public long method_39575() {
      return this.field_44163;
   }

   public boolean method_39578() {
      return this.field_44167;
   }
}
