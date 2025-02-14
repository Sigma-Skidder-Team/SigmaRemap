package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

public class Class8976 implements Class8975 {
   private static String[] field40573;
   private List<TextureAtlasSprite> field40574;
   public final ParticleManager field40575;

   public Class8976(ParticleManager var1) {
      this.field40575 = var1;
   }

   @Override
   public TextureAtlasSprite method32937(int var1, int var2) {
      return this.field40574.get(var1 * (this.field40574.size() - 1) / var2);
   }

   @Override
   public TextureAtlasSprite method32938(Random var1) {
      return this.field40574.get(var1.nextInt(this.field40574.size()));
   }

   public void method32939(List<TextureAtlasSprite> var1) {
      this.field40574 = ImmutableList.copyOf(var1);
   }
}
