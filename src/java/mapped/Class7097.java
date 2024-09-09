package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import javax.annotation.Nullable;

public class Class7097 extends Class7092 {
   public static final Codec<Class7097> field30533 = Codec.FLOAT.fieldOf("mossiness").xmap(Class7097::new, var0 -> var0.field30534).codec();
   private final float field30534;

   public Class7097(float var1) {
      this.field30534 = var1;
   }

   @Nullable
   @Override
   public Class8266 method22068(Class1662 var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      Random var9 = var6.method36439(var5.field35530);
      BlockState var10 = var5.field35531;
      BlockPos var11 = var5.field35530;
      BlockState var12 = null;
      if (var10.isIn(Blocks.field36615) || var10.isIn(Blocks.STONE) || var10.isIn(Blocks.field36618)) {
         var12 = this.method22076(var9);
      } else if (!var10.method23446(BlockTags.field32762)) {
         if (!var10.method23446(BlockTags.field32763)) {
            if (!var10.method23446(BlockTags.field32764)) {
               if (var10.isIn(Blocks.field36527)) {
                  var12 = this.method22080(var9);
               }
            } else {
               var12 = this.method22079(var9);
            }
         } else {
            var12 = this.method22078(var9);
         }
      } else {
         var12 = this.method22077(var9, var5.field35531);
      }

      return var12 == null ? var5 : new Class8266(var11, var12, var5.field35532);
   }

   @Nullable
   private BlockState method22076(Random var1) {
      if (!(var1.nextFloat() >= 0.5F)) {
         BlockState[] var4 = new BlockState[]{Blocks.field36617.method11579(), method22081(var1, Blocks.STONE_BRICK_STAIRS)};
         BlockState[] var5 = new BlockState[]{Blocks.field36616.method11579(), method22081(var1, Blocks.field37016)};
         return this.method22082(var1, var4, var5);
      } else {
         return null;
      }
   }

   @Nullable
   private BlockState method22077(Random var1, BlockState var2) {
      Direction var5 = var2.<Direction>method23463(Class3421.field19131);
      Class99 var6 = var2.<Class99>method23463(Class3421.field19132);
      if (!(var1.nextFloat() >= 0.5F)) {
         BlockState[] var7 = new BlockState[]{Blocks.field36845.method11579(), Blocks.field36852.method11579()};
         BlockState[] var8 = new BlockState[]{
            Blocks.field37016.method11579().method23465(Class3421.field19131, var5).method23465(Class3421.field19132, var6),
            Blocks.field37030.method11579()
         };
         return this.method22082(var1, var7, var8);
      } else {
         return null;
      }
   }

   @Nullable
   private BlockState method22078(Random var1) {
      return !(var1.nextFloat() < this.field30534) ? null : Blocks.field37030.method11579();
   }

   @Nullable
   private BlockState method22079(Random var1) {
      return !(var1.nextFloat() < this.field30534) ? null : Blocks.field37044.method11579();
   }

   @Nullable
   private BlockState method22080(Random var1) {
      return !(var1.nextFloat() < 0.15F) ? null : Blocks.field37123.method11579();
   }

   private static BlockState method22081(Random var0, Block var1) {
      return var1.method11579()
         .method23465(Class3421.field19131, Class76.field161.method247(var0))
         .method23465(Class3421.field19132, Class99.values()[var0.nextInt(Class99.values().length)]);
   }

   private BlockState method22082(Random var1, BlockState[] var2, BlockState[] var3) {
      return !(var1.nextFloat() < this.field30534) ? method22083(var1, var2) : method22083(var1, var3);
   }

   private static BlockState method22083(Random var0, BlockState[] var1) {
      return var1[var0.nextInt(var1.length)];
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32300;
   }
}
