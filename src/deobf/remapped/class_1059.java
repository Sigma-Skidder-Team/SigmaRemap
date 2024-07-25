package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class class_1059 implements class_6157 {
   public static final Codec<class_1059> field_5812 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_7732.field_39221.fieldOf("state_provider").forGetter(var0x -> var0x.field_5814),
               class_502.field_3123.fieldOf("block_placer").forGetter(var0x -> var0x.field_5806),
               class_2522.field_12489
                  .listOf()
                  .fieldOf("whitelist")
                  .forGetter(var0x -> var0x.field_5815.stream().<class_2522>map(class_6414::method_29260).collect(Collectors.toList())),
               class_2522.field_12489.listOf().fieldOf("blacklist").forGetter(var0x -> ImmutableList.copyOf(var0x.field_5809)),
               Codec.INT.fieldOf("tries").orElse(128).forGetter(var0x -> var0x.field_5810),
               Codec.INT.fieldOf("xspread").orElse(7).forGetter(var0x -> var0x.field_5805),
               Codec.INT.fieldOf("yspread").orElse(3).forGetter(var0x -> var0x.field_5808),
               Codec.INT.fieldOf("zspread").orElse(7).forGetter(var0x -> var0x.field_5811),
               Codec.BOOL.fieldOf("can_replace").orElse(false).forGetter(var0x -> var0x.field_5804),
               Codec.BOOL.fieldOf("project").orElse(true).forGetter(var0x -> var0x.field_5807),
               Codec.BOOL.fieldOf("need_water").orElse(false).forGetter(var0x -> var0x.field_5803)
            )
            .apply(var0, class_1059::new)
   );
   public final class_7732 field_5814;
   public final class_502 field_5806;
   public final Set<class_6414> field_5815;
   public final Set<class_2522> field_5809;
   public final int field_5810;
   public final int field_5805;
   public final int field_5808;
   public final int field_5811;
   public final boolean field_5804;
   public final boolean field_5807;
   public final boolean field_5803;

   private class_1059(
      class_7732 var1,
      class_502 var2,
      List<class_2522> var3,
      List<class_2522> var4,
      int var5,
      int var6,
      int var7,
      int var8,
      boolean var9,
      boolean var10,
      boolean var11
   ) {
      this(
         var1,
         var2,
         var3.stream().<class_6414>map(class_1873::method_8360).collect(Collectors.<class_6414>toSet()),
         ImmutableSet.copyOf(var4),
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11
      );
   }

   private class_1059(
      class_7732 var1,
      class_502 var2,
      Set<class_6414> var3,
      Set<class_2522> var4,
      int var5,
      int var6,
      int var7,
      int var8,
      boolean var9,
      boolean var10,
      boolean var11
   ) {
      this.field_5814 = var1;
      this.field_5806 = var2;
      this.field_5815 = var3;
      this.field_5809 = var4;
      this.field_5810 = var5;
      this.field_5805 = var6;
      this.field_5808 = var7;
      this.field_5811 = var8;
      this.field_5804 = var9;
      this.field_5807 = var10;
      this.field_5803 = var11;
   }
}
