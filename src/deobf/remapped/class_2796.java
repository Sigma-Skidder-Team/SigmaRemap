package remapped;

import java.io.IOException;

public class class_2796 extends class_1237 {
   private static String[] field_13733;
   private int field_13737;
   private boolean field_13734;
   private boolean field_13730;
   private String field_13728;
   private int field_13731;
   private int field_13736;
   private int field_13729;
   private int field_13732;
   private int field_13735;

   @Override
   public void method_5498(class_6041 var1) throws IOException {
      int var4 = (int)var1.method_27524(2);
      this.field_13737 = var4 >> 6 & 1023;
      this.field_13734 = (var4 >> 5 & 1) == 1;
      this.field_13730 = (var4 >> 4 & 1) == 1;
      if (!this.field_13734) {
         this.field_13731 = var1.method_27531();
         this.field_13736 = var1.method_27531();
         this.field_13729 = var1.method_27531();
         this.field_13732 = var1.method_27531();
         this.field_13735 = var1.method_27531();
      } else {
         this.field_13728 = var1.method_27533(this.field_6828 - 2);
      }

      this.method_5493(var1);
   }

   public int method_12715() {
      return this.field_13737;
   }

   public boolean method_12724() {
      return this.field_13730;
   }

   public boolean method_12719() {
      return this.field_13734;
   }

   public String method_12720() {
      return this.field_13728;
   }

   public boolean method_12716() {
      return !this.field_13734;
   }

   public int method_12717() {
      return this.field_13731;
   }

   public int method_12722() {
      return this.field_13736;
   }

   public int method_12723() {
      return this.field_13729;
   }

   public int method_12718() {
      return this.field_13732;
   }

   public int method_12721() {
      return this.field_13735;
   }
}
