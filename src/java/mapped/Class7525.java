package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface Class7525<P extends Class7092> {
   Class7525<Class7095> field32294 = method24568("block_ignore", Class7095.field30525);
   Class7525<Class7094> field32295 = method24568("block_rot", Class7094.field30523);
   Class7525<Class7098> field32296 = method24568("gravity", Class7098.field30535);
   Class7525<Class7099> field32297 = method24568("jigsaw_replacement", Class7099.field30538);
   Class7525<Class7093> field32298 = method24568("rule", Class7093.field30521);
   Class7525<Class7100> field32299 = method24568("nop", Class7100.field30541);
   Class7525<Class7097> field32300 = method24568("block_age", Class7097.field30533);
   Class7525<Class7091> field32301 = method24568("blackstone_replace", Class7091.field30518);
   Class7525<Class7096> field32302 = method24568("lava_submerged_block", Class7096.field30531);
   Codec<Class7092> field32303 = Class2348.field16137.dispatch("processor_type", Class7092::method22069, Class7525::method24567);
   Codec<Class3622> field32304 = field32303.listOf().xmap(Class3622::new, Class3622::method12261);
   Codec<Class3622> field32305 = Codec.either(field32304.fieldOf("processors").codec(), field32304)
      .xmap(var0 -> (Class3622)var0.map(var0x -> var0x, var0x -> var0x), Either::left);
   Codec<Supplier<Class3622>> field32306 = Class9054.method33671(Class2348.field16104, field32305);

   Codec<P> method24567();

   static <P extends Class7092> Class7525<P> method24568(String var0, Codec<P> var1) {
      return Class2348.<Class7525<P>>method9194(Class2348.field16137, var0, () -> var1);
   }
}
