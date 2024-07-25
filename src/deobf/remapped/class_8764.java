package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_8764 {
   public static final Codec<class_8764> field_44867 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(class_8764::method_40252),
               class_8669.field_44462.fieldOf("block").orElse(class_4783.field_23184).forGetter(var0x -> var0x.method_40255().method_8360())
            )
            .apply(var0, class_8764::new)
   );
   private final class_2522 field_44869;
   private final int field_44871;
   private int field_44870;

   public class_8764(int var1, class_6414 var2) {
      this.field_44871 = var1;
      this.field_44869 = var2.method_29260();
   }

   public int method_40252() {
      return this.field_44871;
   }

   public class_2522 method_40255() {
      return this.field_44869;
   }

   public int method_40254() {
      return this.field_44870;
   }

   public void method_40253(int var1) {
      this.field_44870 = var1;
   }

   @Override
   public String toString() {
      return (this.field_44871 == 1 ? "" : this.field_44871 + "*") + class_8669.field_44462.method_39797(this.field_44869.method_8360());
   }
}
