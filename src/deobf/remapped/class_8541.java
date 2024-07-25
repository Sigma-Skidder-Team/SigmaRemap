package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_8541 implements class_6157 {
   public static final Codec<class_8541> field_43724 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("valid_base_block").forGetter(var0x -> var0x.field_43717),
               class_2522.field_12489.fieldOf("stem_state").forGetter(var0x -> var0x.field_43723),
               class_2522.field_12489.fieldOf("hat_state").forGetter(var0x -> var0x.field_43720),
               class_2522.field_12489.fieldOf("decor_state").forGetter(var0x -> var0x.field_43714),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter(var0x -> var0x.field_43718)
            )
            .apply(var0, class_8541::new)
   );
   public static final class_8541 field_43719 = new class_8541(
      class_4783.field_23598.method_29260(),
      class_4783.field_23912.method_29260(),
      class_4783.field_23273.method_29260(),
      class_4783.field_23752.method_29260(),
      true
   );
   public static final class_8541 field_43721;
   public static final class_8541 field_43722 = new class_8541(
      class_4783.field_23209.method_29260(),
      class_4783.field_23442.method_29260(),
      class_4783.field_23490.method_29260(),
      class_4783.field_23752.method_29260(),
      true
   );
   public static final class_8541 field_43715;
   public final class_2522 field_43717;
   public final class_2522 field_43723;
   public final class_2522 field_43720;
   public final class_2522 field_43714;
   public final boolean field_43718;

   public class_8541(class_2522 var1, class_2522 var2, class_2522 var3, class_2522 var4, boolean var5) {
      this.field_43717 = var1;
      this.field_43723 = var2;
      this.field_43720 = var3;
      this.field_43714 = var4;
      this.field_43718 = var5;
   }

   static {
      field_43721 = new class_8541(field_43719.field_43717, field_43719.field_43723, field_43719.field_43720, field_43719.field_43714, false);
      field_43715 = new class_8541(field_43722.field_43717, field_43722.field_43723, field_43722.field_43720, field_43722.field_43714, false);
   }
}
