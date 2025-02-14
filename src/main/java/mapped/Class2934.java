package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import org.apache.commons.lang3.mutable.MutableBoolean;

import java.util.Random;

public class Class2934 extends Class2898<Class4713> {
   public Class2934(Codec<Class4713> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4713 var5) {
      MutableBoolean var8 = new MutableBoolean();
      var5.field22353.method26507(new Class9010(var1, var2), var3, var4).forEach(var5x -> {
         if (var5.field22352.get().func_242765_a(var1, var2, var3, var5x)) {
            var8.setTrue();
         }
      });
      return var8.isTrue();
   }

   @Override
   public String toString() {
      return String.format("< %s [%s] >", this.getClass().getSimpleName(), Registry.FEATURE.getKey(this));
   }
}
