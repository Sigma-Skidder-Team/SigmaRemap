package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8115 {
   private static final Logger field_41587 = LogManager.getLogger();
   public static final Codec<class_8115> field_41594 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Identifier.field_22655.fieldOf("name").forGetter(class_8115::method_36915),
               Identifier.field_22655.fieldOf("fallback").forGetter(class_8115::method_36911),
               Codec.mapPair(class_2609.field_12888.fieldOf("element"), Codec.INT.fieldOf("weight"))
                  .codec()
                  .listOf()
                  .promotePartial(Util.method_44690("Pool element: ", field_41587::error))
                  .fieldOf("elements")
                  .forGetter(var0x -> var0x.field_41592)
            )
            .apply(var0, class_8115::new)
   );
   public static final Codec<Supplier<class_8115>> field_41595 = class_6833.<Supplier<class_8115>>method_31333(class_8669.field_44413, field_41594);
   private final Identifier field_41588;
   private final List<Pair<class_2609, Integer>> field_41592;
   private final List<class_2609> field_41590;
   private final Identifier field_41591;
   private int field_41589 = Integer.MIN_VALUE;

   public class_8115(Identifier var1, Identifier var2, List<Pair<class_2609, Integer>> var3) {
      this.field_41588 = var1;
      this.field_41592 = var3;
      this.field_41590 = Lists.newArrayList();

      for (Pair var7 : var3) {
         class_2609 var8 = (class_2609)var7.getFirst();

         for (int var9 = 0; var9 < var7.getSecond(); var9++) {
            this.field_41590.add(var8);
         }
      }

      this.field_41591 = var2;
   }

   public class_8115(Identifier var1, Identifier var2, List<Pair<Function<class_7599, ? extends class_2609>, Integer>> var3, class_7599 var4) {
      this.field_41588 = var1;
      this.field_41592 = Lists.newArrayList();
      this.field_41590 = Lists.newArrayList();

      for (Pair var8 : var3) {
         class_2609 var9 = (class_2609)((Function)var8.getFirst()).apply(var4);
         this.field_41592.add(Pair.of(var9, var8.getSecond()));

         for (int var10 = 0; var10 < var8.getSecond(); var10++) {
            this.field_41590.add(var9);
         }
      }

      this.field_41591 = var2;
   }

   public int method_36913(class_5799 var1) {
      if (this.field_41589 == Integer.MIN_VALUE) {
         this.field_41589 = this.field_41590
            .stream()
            .mapToInt(var1x -> var1x.method_11832(var1, BlockPos.field_7306, class_6631.field_34340).method_44398())
            .max()
            .orElse(0);
      }

      return this.field_41589;
   }

   public Identifier method_36911() {
      return this.field_41591;
   }

   public class_2609 method_36912(Random var1) {
      return this.field_41590.get(var1.nextInt(this.field_41590.size()));
   }

   public List<class_2609> method_36917(Random var1) {
      return ImmutableList.copyOf(ObjectArrays.shuffle(this.field_41590.<Object>toArray(new class_2609[0]), var1));
   }

   public Identifier method_36915() {
      return this.field_41588;
   }

   public int method_36914() {
      return this.field_41590.size();
   }
}
