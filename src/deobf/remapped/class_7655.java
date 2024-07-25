package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_7655 {
   public static final Codec<class_7655> field_38896 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 1023).fieldOf("distance").forGetter(class_7655::method_34655),
               Codec.intRange(0, 1023).fieldOf("spread").forGetter(class_7655::method_34652),
               Codec.intRange(1, 4095).fieldOf("count").forGetter(class_7655::method_34653)
            )
            .apply(var0, class_7655::new)
   );
   private final int field_38892;
   private final int field_38894;
   private final int field_38895;

   public class_7655(int var1, int var2, int var3) {
      this.field_38892 = var1;
      this.field_38894 = var2;
      this.field_38895 = var3;
   }

   public int method_34655() {
      return this.field_38892;
   }

   public int method_34652() {
      return this.field_38894;
   }

   public int method_34653() {
      return this.field_38895;
   }
}
