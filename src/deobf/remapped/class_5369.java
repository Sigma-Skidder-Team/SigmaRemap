package remapped;

public class class_5369 extends class_2520 {
   public class_5369() {
      super(class_6629.field_34297, "zombie", 0.5F);
   }

   public class_5369(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7939(0.0F, false);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_1171 var6 = new class_1171(var5);
      var6.field_32487 = (class_7939<class_2811>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
