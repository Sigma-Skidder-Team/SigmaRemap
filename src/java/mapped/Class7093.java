package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class Class7093 extends Class7092 {
   public static final Codec<Class7093> field30521 = Class7872.field33733.listOf().fieldOf("rules").xmap(Class7093::new, var0 -> var0.field30522).codec();
   private final ImmutableList<Class7872> field30522;

   public Class7093(List<? extends Class7872> var1) {
      this.field30522 = ImmutableList.copyOf(var1);
   }

   @Nullable
   @Override
   public Class8266 method22068(Class1662 var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      Random var9 = new Random(MathHelper.method37809(var5.field35530));
      BlockState var10 = var1.getBlockState(var5.field35530);
      UnmodifiableIterator var11 = this.field30522.iterator();

      while (var11.hasNext()) {
         Class7872 var12 = (Class7872)var11.next();
         if (var12.method26393(var5.field35531, var10, var4.field35530, var5.field35530, var3, var9)) {
            return new Class8266(var5.field35530, var12.method26394(), var12.method26395());
         }
      }

      return var5;
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32298;
   }
}
