package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class Class7095 extends Class7092 {
   public static final Codec<Class7095> field30525 = Class7380.field31585
      .xmap(Class7377::method23383, Class3209::method11579)
      .listOf()
      .fieldOf("blocks")
      .xmap(Class7095::new, var0 -> var0.field30529)
      .codec();
   public static final Class7095 field30526 = new Class7095(ImmutableList.of(Class8487.field37113));
   public static final Class7095 field30527 = new Class7095(ImmutableList.of(Class8487.field36387));
   public static final Class7095 field30528 = new Class7095(ImmutableList.of(Class8487.field36387, Class8487.field37113));
   private final ImmutableList<Class3209> field30529;

   public Class7095(List<Class3209> var1) {
      this.field30529 = ImmutableList.copyOf(var1);
   }

   @Nullable
   @Override
   public Class8266 method22068(Class1662 var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      return !this.field30529.contains(var5.field35531.method23383()) ? var5 : null;
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32294;
   }
}
