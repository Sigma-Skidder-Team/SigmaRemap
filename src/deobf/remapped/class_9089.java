package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class class_9089 extends class_2609 {
   public static final Codec<class_9089> field_46545 = RecordCodecBuilder.create(
      var0 -> var0.group(class_5927.field_30061.fieldOf("feature").forGetter(var0x -> var0x.field_46546), method_11825()).apply(var0, class_9089::new)
   );
   private final Supplier<class_5927<?, ?>> field_46546;
   private final CompoundNBT field_46544;

   public class_9089(Supplier<class_5927<?, ?>> var1, class_7599 var2) {
      super(var2);
      this.field_46546 = var1;
      this.field_46544 = this.method_41856();
   }

   private CompoundNBT method_41856() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25941("name", "minecraft:bottom");
      var3.method_25941("final_state", "minecraft:air");
      var3.method_25941("pool", "minecraft:empty");
      var3.method_25941("target", "minecraft:empty");
      var3.method_25941("joint", class_1252.field_6897.method_21049());
      return var3;
   }

   public BlockPos method_41855(class_5799 var1, class_6631 var2) {
      return BlockPos.field_7306;
   }

   @Override
   public List<class_4099> method_11829(class_5799 var1, BlockPos var2, class_6631 var3, Random var4) {
      ArrayList var7 = Lists.newArrayList();
      var7.add(
         new class_4099(
            var2,
            class_4783.field_23319.method_29260().method_10308(class_195.field_655, class_7660.method_34669(Direction.field_802, Direction.field_800)),
            this.field_46544
         )
      );
      return var7;
   }

   @Override
   public class_9616 method_11832(class_5799 var1, BlockPos var2, class_6631 var3) {
      BlockPos var6 = this.method_41855(var1, var3);
      return new class_9616(
         var2.getX(),
         var2.getY(),
         var2.getZ(),
         var2.getX() + var6.getX(),
         var2.getY() + var6.getY(),
         var2.getZ() + var6.getZ()
      );
   }

   @Override
   public boolean method_11827(
      class_5799 var1,
      class_700 var2,
      class_2033 var3,
      class_6541 var4,
      BlockPos var5,
      BlockPos var6,
      class_6631 var7,
      class_9616 var8,
      Random var9,
      boolean var10
   ) {
      return this.field_46546.get().method_27104(var2, var4, var9, var5);
   }

   @Override
   public class_4263<?> method_11836() {
      return class_4263.field_20658;
   }

   @Override
   public String toString() {
      return "Feature[" + class_8669.field_44417.method_39797(this.field_46546.get().method_27103()) + "]";
   }
}
