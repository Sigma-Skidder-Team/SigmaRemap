package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.potion.EffectInstance;

import java.util.List;

public class Class8141 {
   private static String[] field35033;
   private int field35034;
   private float field35035;
   private boolean field35036;
   private boolean field35037;
   private boolean field35038;
   private final List<Pair<EffectInstance, Float>> field35039 = Lists.newArrayList();

   public Class8141 method28229(int var1) {
      this.field35034 = var1;
      return this;
   }

   public Class8141 method28230(float var1) {
      this.field35035 = var1;
      return this;
   }

   public Class8141 method28231() {
      this.field35036 = true;
      return this;
   }

   public Class8141 method28232() {
      this.field35037 = true;
      return this;
   }

   public Class8141 method28233() {
      this.field35038 = true;
      return this;
   }

   public Class8141 method28234(EffectInstance var1, float var2) {
      this.field35039.add(Pair.of(var1, var2));
      return this;
   }

   public Class9427 method28235() {
      return new Class9427(this.field35034, this.field35035, this.field35036, this.field35037, this.field35038, this.field35039);
   }
}
