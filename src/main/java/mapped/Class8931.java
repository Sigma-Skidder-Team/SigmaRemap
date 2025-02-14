package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

import net.minecraft.block.BlockState;
import org.apache.commons.lang3.tuple.Pair;

public class Class8931 {
   private static String[] field40414;
   private final List<Pair<Predicate<BlockState>, IBakedModel>> field40415 = Lists.newArrayList();

   public void method32655(Predicate<BlockState> var1, IBakedModel var2) {
      this.field40415.add(Pair.of(var1, var2));
   }

   public IBakedModel method32656() {
      return new Class7201(this.field40415);
   }
}
