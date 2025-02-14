package mapped;

import com.mojang.serialization.Codec;

public class Class4726 implements Class4698 {
   public static final Codec<Class4726> field22392 = Class107.field343.fieldOf("portal_type").xmap(Class4726::new, var0 -> var0.field22393).codec();
   public final Class107 field22393;

   public Class4726(Class107 var1) {
      this.field22393 = var1;
   }
}
