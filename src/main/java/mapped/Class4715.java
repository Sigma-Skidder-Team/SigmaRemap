package mapped;

import com.mojang.serialization.Codec;

public class Class4715 implements Class4716, Class4698 {
   public static final Codec<Class4715> field22359 = Class8045.method27630(-10, 128, 128).fieldOf("count").xmap(Class4715::new, Class4715::method14807).codec();
   private final Class8045 field22360;

   public Class4715(int var1) {
      this.field22360 = Class8045.method27631(var1);
   }

   public Class4715(Class8045 var1) {
      this.field22360 = var1;
   }

   public Class8045 method14807() {
      return this.field22360;
   }
}
