package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class class_2010 extends class_2103 {
   public static final Codec<class_2010> field_10192 = class_2522.field_12489
      .xmap(class_1873::method_8360, class_6414::method_29260)
      .listOf()
      .fieldOf("blocks")
      .xmap(class_2010::new, var0 -> var0.field_10197)
      .codec();
   public static final class_2010 field_10194 = new class_2010(ImmutableList.of(class_4783.field_23846));
   public static final class_2010 field_10195 = new class_2010(ImmutableList.of(class_4783.field_23184));
   public static final class_2010 field_10193 = new class_2010(ImmutableList.of(class_4783.field_23184, class_4783.field_23846));
   private final ImmutableList<class_6414> field_10197;

   public class_2010(List<class_6414> var1) {
      this.field_10197 = ImmutableList.copyOf(var1);
   }

   @Nullable
   @Override
   public class_4099 method_9859(class_4924 var1, class_1331 var2, class_1331 var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      return !this.field_10197.contains(var5.field_19967.method_8360()) ? var5 : null;
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10589;
   }
}
