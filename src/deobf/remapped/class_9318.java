package remapped;

public class class_9318 implements class_6224 {
   private static String[] field_47585;

   public class_9318(class_1144 var1, boolean[] var2, Runnable[] var3, class_2291[] var4) {
      this.field_47587 = var1;
      this.field_47589 = var2;
      this.field_47588 = var3;
      this.field_47586 = var4;
   }

   @Override
   public void method_28452(Object... var1) {
      if (!this.field_47589[0]) {
         this.field_47589[0] = true;
         this.field_47588[0].run();
         this.field_47586[0].method_10547();
         this.field_47586[0] = null;
      }
   }
}
