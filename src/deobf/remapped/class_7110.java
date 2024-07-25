package remapped;

import com.mojang.serialization.Codec;

public class class_7110 implements class_5079 {
   public static final class_7981<class_7110> field_36663 = new class_9106();
   private final class_8583<class_7110> field_36662;
   private final class_2522 field_36661;

   public static Codec<class_7110> method_32669(class_8583<class_7110> var0) {
      return class_2522.field_12489.xmap(var1 -> new class_7110(var0, var1), var0x -> var0x.field_36661);
   }

   public class_7110(class_8583<class_7110> var1, class_2522 var2) {
      this.field_36662 = var1;
      this.field_36661 = var2;
   }

   @Override
   public void method_23359(class_8248 var1) {
      var1.method_37743(class_6414.field_32758.method_14041(this.field_36661));
   }

   @Override
   public String method_23358() {
      return class_8669.field_44387.method_39797(this.method_23357()) + " " + class_4104.toString(this.field_36661);
   }

   @Override
   public class_8583<class_7110> method_23357() {
      return this.field_36662;
   }

   public class_2522 method_32671() {
      return this.field_36661;
   }
}
