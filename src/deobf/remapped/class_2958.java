package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class class_2958 {
   public static final Codec<class_2958> field_14447 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2710.field_13257.fieldOf("input_predicate").forGetter(var0x -> var0x.field_14444),
               class_2710.field_13257.fieldOf("location_predicate").forGetter(var0x -> var0x.field_14441),
               class_5892.field_29930.optionalFieldOf("position_predicate", class_7607.field_38728).forGetter(var0x -> var0x.field_14445),
               class_2522.field_12489.fieldOf("output_state").forGetter(var0x -> var0x.field_14446),
               CompoundNBT.field_28974.optionalFieldOf("output_nbt").forGetter(var0x -> Optional.<CompoundNBT>ofNullable(var0x.field_14442))
            )
            .apply(var0, class_2958::new)
   );
   private final class_2710 field_14444;
   private final class_2710 field_14441;
   private final class_5892 field_14445;
   private final class_2522 field_14446;
   private final CompoundNBT field_14442;

   public class_2958(class_2710 var1, class_2710 var2, class_2522 var3) {
      this(var1, var2, class_7607.field_38728, var3, Optional.<CompoundNBT>empty());
   }

   public class_2958(class_2710 var1, class_2710 var2, class_5892 var3, class_2522 var4) {
      this(var1, var2, var3, var4, Optional.<CompoundNBT>empty());
   }

   public class_2958(class_2710 var1, class_2710 var2, class_5892 var3, class_2522 var4, Optional<CompoundNBT> var5) {
      this.field_14444 = var1;
      this.field_14441 = var2;
      this.field_14445 = var3;
      this.field_14446 = var4;
      this.field_14442 = (CompoundNBT)var5.orElse((CompoundNBT)null);
   }

   public boolean method_13531(class_2522 var1, class_2522 var2, BlockPos var3, BlockPos var4, BlockPos var5, Random var6) {
      return this.field_14444.method_12207(var1, var6) && this.field_14441.method_12207(var2, var6) && this.field_14445.method_26953(var3, var4, var5, var6);
   }

   public class_2522 method_13533() {
      return this.field_14446;
   }

   @Nullable
   public CompoundNBT method_13530() {
      return this.field_14442;
   }
}
