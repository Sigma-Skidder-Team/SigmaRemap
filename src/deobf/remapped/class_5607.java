package remapped;

public class class_5607 extends class_9394 {
   private static String[] field_28467;
   public float field_28466;
   public long field_28468;

   public class_5607(class_9889 var1) {
      super(var1.method_45554(), var1.method_45562(), var1.method_45556(), var1.method_45566());
      this.field_28466 = var1.method_45559();
      this.field_48004 = var1.method_45559();
      this.field_28468 = class_9665.method_44650();
      this.method_43461(var1.method_45564());
      this.method_43457(var1.method_45555());
      this.method_43463(var1.method_45561());
   }

   @Override
   public void method_43459(float var1) {
      this.field_48004 = this.method_43450();
      this.field_28466 = var1;
      this.field_28468 = class_9665.method_44650();
   }

   @Override
   public float method_43450() {
      long var3 = class_9665.method_44650() - this.field_28468;
      float var5 = class_9299.method_42828((float)var3 / 100.0F, 0.0F, 1.0F);
      return class_9299.method_42795(var5, this.field_48004, this.field_28466);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_25459(class_9889 var1) {
      switch (var1.method_45557()) {
         case field_45608:
            this.method_43451(var1.method_45562());
            break;
         case field_45612:
            this.method_43459(var1.method_45559());
            break;
         case field_45609:
            this.method_43452(var1.method_45556());
            this.method_43458(var1.method_45566());
            break;
         case field_45610:
            this.method_43461(var1.method_45564());
            this.method_43457(var1.method_45555());
      }
   }
}
