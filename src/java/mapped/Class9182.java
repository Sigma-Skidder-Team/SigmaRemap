package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class Class9182 {
   private static String[] field42163;
   private int field42164;
   private final List<ResourceLocation> field42165 = Lists.newArrayList();
   private final List<ResourceLocation> field42166 = Lists.newArrayList();
   private ResourceLocation field42167;

   public static Class9182 method34343(int var0) {
      return new Class9182().method34344(var0);
   }

   public Class9182 method34344(int var1) {
      this.field42164 += var1;
      return this;
   }

   public static Class9182 method34345(ResourceLocation var0) {
      return new Class9182().method34346(var0);
   }

   public Class9182 method34346(ResourceLocation var1) {
      this.field42166.add(var1);
      return this;
   }

   public Class8588 method34347() {
      return new Class8588(
         this.field42164,
         this.field42165.<ResourceLocation>toArray(new ResourceLocation[0]),
         this.field42166.<ResourceLocation>toArray(new ResourceLocation[0]),
         this.field42167 != null ? new Class9137(this.field42167) : Class9137.field41987
      );
   }
}
