package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.ResourceLocation;

public class Class9837 {
   public static final RegistryKey<Class9369> field45937 = RegistryKey.<Class9369>getOrCreateKey(Registry.field16105, new ResourceLocation("empty"));
   private static final Class9369 field45938 = method38884(
      new Class9369(field45937.getLocation(), field45937.getLocation(), ImmutableList.of(), Class109.field367)
   );

   public static Class9369 method38884(Class9369 var0) {
      return Class6714.<Class9369, Class9369>method20497(Class6714.field29429, var0.method35537(), var0);
   }

   public static Class9369 method38885() {
      Class8382.method29375();
      Class8685.method31293();
      Class9355.method35421();
      return field45938;
   }

   static {
      method38885();
   }
}
