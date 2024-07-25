package remapped;

import com.google.gson.JsonObject;

public class class_3780 extends class_4569 {
   private final class_8938 field_18451;
   private final class_8772 field_18449;

   public class_3780(class_4639 var1, class_8938 var2, class_8938 var3, class_8772 var4) {
      super(var1, var2);
      this.field_18451 = var3;
      this.field_18449 = var4;
   }

   public static class_3780 method_17504(class_2184 var0) {
      return new class_3780(
         class_2544.method_11579(class_8807.field_45078), class_8938.field_45798, class_8938.method_41064(var0.method_10139()), class_8772.field_44906
      );
   }

   public static class_3780 method_17503() {
      return new class_3780(class_2544.method_11579(class_8807.field_45078), class_8938.field_45798, class_8938.field_45798, class_8772.field_44906);
   }

   public static class_3780 method_17505(class_2184 var0, class_9447 var1) {
      return new class_3780(
         class_2544.method_11579(class_8807.field_45078), class_8938.field_45798, class_8938.method_41064(var0.method_10139()), var1.method_43693()
      );
   }

   public static class_3780 method_17506() {
      return new class_3780(class_2544.method_11579(class_8807.field_45060), class_8938.field_45798, class_8938.field_45798, class_8772.field_44906);
   }

   public boolean method_17507(class_9359 var1, class_2792 var2, class_6199 var3) {
      return this.field_18449.method_40300(var1, var3) ? this.field_18451.method_41071(var2) : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("entity", this.field_18451.method_41067(var1));
      var4.add("killing_blow", this.field_18449.method_40297());
      return var4;
   }
}
