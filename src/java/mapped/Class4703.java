package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Class4703 implements Class4698 {
   public static final Codec<Class4703> field22305 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class6698.field29330.fieldOf("state_provider").forGetter(var0x -> var0x.field22306),
               Class6166.field27591.fieldOf("block_placer").forGetter(var0x -> var0x.field22307),
               Class7380.field31585
                  .listOf()
                  .fieldOf("whitelist")
                  .forGetter(var0x -> var0x.field22308.stream().<Class7380>map(Block::method11579).collect(Collectors.toList())),
               Class7380.field31585.listOf().fieldOf("blacklist").forGetter(var0x -> ImmutableList.copyOf(var0x.field22309)),
               Codec.INT.fieldOf("tries").orElse(128).forGetter(var0x -> var0x.field22310),
               Codec.INT.fieldOf("xspread").orElse(7).forGetter(var0x -> var0x.field22311),
               Codec.INT.fieldOf("yspread").orElse(3).forGetter(var0x -> var0x.field22312),
               Codec.INT.fieldOf("zspread").orElse(7).forGetter(var0x -> var0x.field22313),
               Codec.BOOL.fieldOf("can_replace").orElse(false).forGetter(var0x -> var0x.field22314),
               Codec.BOOL.fieldOf("project").orElse(true).forGetter(var0x -> var0x.field22315),
               Codec.BOOL.fieldOf("need_water").orElse(false).forGetter(var0x -> var0x.field22316)
            )
            .apply(var0, Class4703::new)
   );
   public final Class6698 field22306;
   public final Class6166 field22307;
   public final Set<Block> field22308;
   public final Set<Class7380> field22309;
   public final int field22310;
   public final int field22311;
   public final int field22312;
   public final int field22313;
   public final boolean field22314;
   public final boolean field22315;
   public final boolean field22316;

   private Class4703(
      Class6698 var1,
      Class6166 var2,
      List<Class7380> var3,
      List<Class7380> var4,
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
         var3.stream().<Block>map(Class7377::method23383).collect(Collectors.<Block>toSet()),
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

   public Class4703(
           Class6698 var1,
           Class6166 var2,
           Set<Block> var3,
           Set<Class7380> var4,
           int var5,
           int var6,
           int var7,
           int var8,
           boolean var9,
           boolean var10,
           boolean var11
   ) {
      this.field22306 = var1;
      this.field22307 = var2;
      this.field22308 = var3;
      this.field22309 = var4;
      this.field22310 = var5;
      this.field22311 = var6;
      this.field22312 = var7;
      this.field22313 = var8;
      this.field22314 = var9;
      this.field22315 = var10;
      this.field22316 = var11;
   }
}
