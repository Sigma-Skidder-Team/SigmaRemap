package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8480;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class1818 implements Class191 {
   @Override
   public Set<String> method579() {
      return Class8480.method29975().method1537().method579();
   }

   @Override
   public Class1783 method580(ResourceLocation var1) throws IOException {
      return (Class1783)(!var1.method8292().equals("jelloblur") ? Class8480.method29975().method1537().method580(var1) : new Class1784());
   }

   @Override
   public boolean method581(ResourceLocation var1) {
      return !var1.method8292().equals("jelloblur") ? Class8480.method29975().method1537().method581(var1) : true;
   }

   @Override
   public List<Class1783> method582(ResourceLocation var1) throws IOException {
      return Class8480.method29975().method1537().method582(var1);
   }

   @Override
   public Collection<ResourceLocation> method583(String var1, Predicate<String> var2) {
      return Class8480.method29975().method1537().method583(var1, var2);
   }

   @Override
   public Stream<Class303> method584() {
      return null;
   }
}
