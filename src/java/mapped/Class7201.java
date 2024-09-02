package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;
import org.apache.commons.lang3.tuple.Pair;

public class Class7201 implements IBakedModel {
   private static String[] field30908;
   private final List<Pair<Predicate<BlockState>, IBakedModel>> field30909;
   public final boolean field30910;
   public final boolean field30911;
   public final boolean field30912;
   public final TextureAtlasSprite field30913;
   public final Class9264 field30914;
   public final Class6391 field30915;
   private final Map<BlockState, BitSet> field30916 = new Object2ObjectOpenCustomHashMap(Util.method38509());

   public Class7201(List<Pair<Predicate<BlockState>, IBakedModel>> var1) {
      this.field30909 = var1;
      IBakedModel var4 = (IBakedModel)((Pair)var1.iterator().next()).getRight();
      this.field30910 = var4.method22620();
      this.field30911 = var4.method22621();
      this.field30912 = var4.method22622();
      this.field30913 = var4.getParticleTexture();
      this.field30914 = var4.method22625();
      this.field30915 = var4.method22626();
   }

   @Override
   public List<Class8557> method22619(BlockState var1, Direction var2, Random var3) {
      if (var1 == null) {
         return Collections.<Class8557>emptyList();
      } else {
         BitSet var6 = this.field30916.get(var1);
         if (var6 == null) {
            var6 = new BitSet();

            for (int var7 = 0; var7 < this.field30909.size(); var7++) {
               Pair var11 = this.field30909.get(var7);
               if (((Predicate)var11.getLeft()).test(var1)) {
                  var6.set(var7);
               }
            }

            this.field30916.put(var1, var6);
         }

         ArrayList var12 = Lists.newArrayList();
         long var8 = var3.nextLong();

         for (int var10 = 0; var10 < var6.length(); var10++) {
            if (var6.get(var10)) {
               var12.addAll(((IBakedModel)this.field30909.get(var10).getRight()).method22619(var1, var2, new Random(var8)));
            }
         }

         return var12;
      }
   }

   @Override
   public boolean method22620() {
      return this.field30910;
   }

   @Override
   public boolean method22621() {
      return this.field30911;
   }

   @Override
   public boolean method22622() {
      return this.field30912;
   }

   @Override
   public boolean method22623() {
      return false;
   }

   @Override
   public TextureAtlasSprite getParticleTexture() {
      return this.field30913;
   }

   @Override
   public Class9264 method22625() {
      return this.field30914;
   }

   @Override
   public Class6391 method22626() {
      return this.field30915;
   }
}
