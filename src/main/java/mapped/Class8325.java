package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;

public interface Class8325<P extends Class7487> {
   Class8325<Class7488> field35770 = method29187("single_pool_element", Class7488.field32186);
   Class8325<Class7491> field35771 = method29187("list_pool_element", Class7491.field32193);
   Class8325<Class7490> field35772 = method29187("feature_pool_element", Class7490.field32190);
   Class8325<Class7486> field35773 = method29187("empty_pool_element", Class7486.field32181);
   Class8325<Class7489> field35774 = method29187("legacy_single_pool_element", Class7489.field32189);

   Codec<P> method29186();

   static <P extends Class7487> Class8325<P> method29187(String var0, Codec<P> var1) {
      return Registry.<Class8325<P>>register(Registry.field16138, var0, () -> var1);
   }
}
