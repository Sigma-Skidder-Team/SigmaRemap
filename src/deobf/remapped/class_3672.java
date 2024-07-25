package remapped;

public class class_3672 {
   private static String[] field_17909;
   private final class_4106 field_17910;
   private final class_5115 field_17907;
   private final class_5115 field_17908;

   public class_3672(class_4106 var1, class_5115 var2, class_5115 var3) {
      this.field_17910 = var1;
      this.field_17907 = var2;
      this.field_17908 = var3;
   }

   public void method_17040(class_1372 var1, class_8039<class_9530[]> var2) {
      this.field_17910.method_19015(var1, new class_9269(this, var2));
   }

   public void method_17038(class_1372 var1, class_8039<class_9530> var2) {
      this.field_17910.method_19015(var1, new class_3641(this, var2));
   }

   public void method_17043(class_1372 var1, class_8039<class_9530> var2) {
      this.field_17910.method_19015(var1, new class_781(this, var2));
   }

   public void method_17046(class_1372 var1, class_8039<class_9530> var2) {
      this.field_17910.method_19015(var1, new class_8596(this, var2));
   }

   public void method_17039(class_7163 var1, class_8039<class_9530> var2) {
      this.field_17910.method_18992(var1, new class_6207(this, var2));
   }

   public void method_17036(class_7163 var1, class_8039<class_9530> var2) {
      this.field_17910.method_18992(var1, new class_5890(this, var2));
   }

   public void method_17042(class_1372 var1) {
      this.field_17910.method_19015(var1, new class_3615(this));
   }

   public void method_17041(class_1372 var1, class_8039<class_9530> var2) {
      this.field_17910.method_19015(var1, new class_8254(this, var2));
   }

   public void method_17045(class_1372 var1, class_8039<class_9530> var2) {
      this.field_17910.method_19015(var1, new class_571(this, var2));
   }

   public void method_17034(class_1372 var1, class_8039<class_9530> var2, class_8039<?> var3) {
      this.field_17910.method_19015(var1, new class_2005(this, var3, var2));
   }

   public class_857 method_17035(class_8039<class_9530[]> var1) {
      return var2 -> {
         class_9530[] var5 = var2.<class_9530[]>method_23248(var1, 0);

         for (class_9530 var9 : var5) {
            this.field_17907.method_23451(var9);
         }
      };
   }

   public class_857 method_17037(class_8039<class_9530> var1) {
      return var2 -> this.field_17907.method_23451(var2.<class_9530>method_23248(var1, 0));
   }

   public class_857 method_17031(class_8039<class_9530> var1) {
      return var2 -> this.field_17908.method_23451(var2.<class_9530>method_23248(var1, 0));
   }
}
