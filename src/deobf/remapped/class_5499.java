package remapped;

public class class_5499<E extends class_5834> extends class_5920<E> {
   private boolean field_27994;
   private boolean field_27993;
   private final class_4376 field_27996;
   private final class_5920<? super E> field_27995;
   private int field_27992;

   public class_5499(class_5920<? super E> var1, class_4376 var2) {
      this(var1, false, var2);
   }

   public class_5499(class_5920<? super E> var1, boolean var2, class_4376 var3) {
      super(var1.field_30040);
      this.field_27995 = var1;
      this.field_27994 = !var2;
      this.field_27996 = var3;
   }

   @Override
   public boolean method_27088(class_6331 var1, E var2) {
      if (!this.field_27995.method_27088(var1, (E)var2)) {
         return false;
      } else {
         if (this.field_27994) {
            this.method_24966(var1);
            this.field_27994 = false;
         }

         if (this.field_27992 > 0) {
            this.field_27992--;
         }

         return !this.field_27993 && this.field_27992 == 0;
      }
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      this.field_27995.method_27080(var1, (E)var2, var3);
   }

   @Override
   public boolean method_27086(class_6331 var1, E var2, long var3) {
      return this.field_27995.method_27086(var1, (E)var2, var3);
   }

   @Override
   public void method_27078(class_6331 var1, E var2, long var3) {
      this.field_27995.method_27078(var1, (E)var2, var3);
      this.field_27993 = this.field_27995.method_27087() == class_1494.field_7948;
   }

   @Override
   public void method_27081(class_6331 var1, E var2, long var3) {
      this.method_24966(var1);
      this.field_27995.method_27081(var1, (E)var2, var3);
   }

   private void method_24966(class_6331 var1) {
      this.field_27992 = this.field_27996.method_20387(var1.field_33033);
   }

   @Override
   public boolean method_27085(long var1) {
      return false;
   }

   @Override
   public String toString() {
      return "RunSometimes: " + this.field_27995;
   }
}
