package mapped;

import com.mentalfrostbyte.jello.unmapped.BlurUtil;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class1818 implements IResourceManager {
   @Override
   public Set<String> method579() {
      return BlurUtil.method29975().getResourceManager().method579();
   }

   @Override
   public Class1783 method580(ResourceLocation var1) throws IOException {
      return (Class1783)(!var1.getPath().equals("jelloblur") ? BlurUtil.method29975().getResourceManager().method580(var1) : new Class1784());
   }

   @Override
   public boolean method581(ResourceLocation var1) {
      return !var1.getPath().equals("jelloblur") ? BlurUtil.method29975().getResourceManager().method581(var1) : true;
   }

   @Override
   public List<Class1783> method582(ResourceLocation var1) throws IOException {
      return BlurUtil.method29975().getResourceManager().method582(var1);
   }

   @Override
   public Collection<ResourceLocation> method583(String var1, Predicate<String> var2) {
      return BlurUtil.method29975().getResourceManager().method583(var1, var2);
   }

   @Override
   public Stream<IResourcePack> method584() {
      return null;
   }
}
