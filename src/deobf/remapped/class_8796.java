package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class class_8796 {
   private static final Map<Identifier, class_8796> field_45006 = Maps.newHashMap();
   public static final class_8796 field_45008 = new class_8796(
      new Identifier("nether"),
      (var0, var1, var2) -> new class_7258(
            var2,
            ImmutableList.of(
               Pair.of(new class_1428(0.0F, 0.0F, 0.0F, 0.0F, 0.0F), (Supplier<class_6325>)() -> var1.method_39807(class_8606.field_44109)),
               Pair.of(new class_1428(0.0F, -0.5F, 0.0F, 0.0F, 0.0F), (Supplier<class_6325>)() -> var1.method_39807(class_8606.field_44096)),
               Pair.of(new class_1428(0.4F, 0.0F, 0.0F, 0.0F, 0.0F), (Supplier<class_6325>)() -> var1.method_39807(class_8606.field_44146)),
               Pair.of(new class_1428(0.0F, 0.5F, 0.0F, 0.0F, 0.375F), (Supplier<class_6325>)() -> var1.method_39807(class_8606.field_44112)),
               Pair.of(new class_1428(-0.5F, 0.0F, 0.0F, 0.0F, 0.175F), (Supplier<class_6325>)() -> var1.method_39807(class_8606.field_44129))
            ),
            Optional.<Pair>of(Pair.of(var1, var0)),
            null
         )
   );
   private final Identifier field_45007;
   private final Function3<class_8796, class_8669<class_6325>, Long, class_7258> field_45009;

   public class_8796(Identifier var1, Function3<class_8796, class_8669<class_6325>, Long, class_7258> var2) {
      this.field_45007 = var1;
      this.field_45009 = var2;
      field_45006.put(var1, this);
   }

   public class_7258 method_40438(class_8669<class_6325> var1, long var2) {
      return (class_7258)this.field_45009.apply(this, var1, var2);
   }
}
