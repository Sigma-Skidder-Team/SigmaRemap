package remapped;

public class class_1006 implements Runnable {
   public class_1006(class_2315 var1, class_2315 var2, int var3, int var4, class_2700 var5) {
      this.field_5179 = var1;
      this.field_5177 = var2;
      this.field_5178 = var3;
      this.field_5176 = var4;
      this.field_5175 = var5;
   }

   @Override
   public void run() {
      if (this.field_5179.field_11594 == null) {
         this.field_5177
            .method_32148(this.field_5179.field_11594 = new class_556(this.field_5177, "popover", this.field_5178, this.field_5176, this.field_5175));
         class_2315.method_10636(this.field_5179, this.field_5179.field_11594);
      }
   }
}
