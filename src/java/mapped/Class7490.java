package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Class7490 extends Class7487 {
   public static final Codec<Class7490> field32190 = RecordCodecBuilder.create(
      var0 -> var0.group(Class7909.field33883.fieldOf("feature").forGetter(var0x -> var0x.field32191), method24379()).apply(var0, Class7490::new)
   );
   private final Supplier<Class7909<?, ?>> field32191;
   private final CompoundNBT field32192;

   public Class7490(Supplier<Class7909<?, ?>> var1, Class109 var2) {
      super(var2);
      this.field32191 = var1;
      this.field32192 = this.method24414();
   }

   private CompoundNBT method24414() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method109("name", "minecraft:bottom");
      var3.method109("final_state", "minecraft:air");
      var3.method109("pool", "minecraft:empty");
      var3.method109("target", "minecraft:empty");
      var3.method109("joint", Class92.field237.method257());
      return var3;
   }

   public BlockPos method24415(Class8761 var1, Class80 var2) {
      return BlockPos.ZERO;
   }

   @Override
   public List<Class8266> method24374(Class8761 var1, BlockPos var2, Class80 var3, Random var4) {
      ArrayList var7 = Lists.newArrayList();
      var7.add(
         new Class8266(
            var2,
            Blocks.field37114.method11579().method23465(Class3249.field18712, Class182.method526(Direction.DOWN, Direction.SOUTH)),
            this.field32192
         )
      );
      return var7;
   }

   @Override
   public Class9764 method24375(Class8761 var1, BlockPos var2, Class80 var3) {
      BlockPos var6 = this.method24415(var1, var3);
      return new Class9764(
         var2.getX(),
         var2.getY(),
         var2.getZ(),
         var2.getX() + var6.getX(),
         var2.getY() + var6.getY(),
         var2.getZ() + var6.getZ()
      );
   }

   @Override
   public boolean method24376(
           Class8761 var1, Class1658 var2, Class7480 var3, Class5646 var4, BlockPos var5, BlockPos var6, Class80 var7, Class9764 var8, Random var9, boolean var10
   ) {
      return this.field32191.get().method26521(var2, var4, var9, var5);
   }

   @Override
   public Class8325<?> method24377() {
      return Class8325.field35772;
   }

   @Override
   public String toString() {
      return "Feature[" + Registry.field16112.getKey(this.field32191.get().method26518()) + "]";
   }
}
