package remapped;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class_4660 implements class_7832 {
   @Override
   public Set<String> method_35455() {
      return class_4746.method_21922().method_8498().method_35455();
   }

   @Override
   public class_4038 method_35458(Identifier var1) throws IOException {
      return (class_4038)(!var1.method_21456().equals("jelloblur") ? class_4746.method_21922().method_8498().method_35458(var1) : new class_7686());
   }

   @Override
   public boolean method_35456(Identifier var1) {
      return !var1.method_21456().equals("jelloblur") ? class_4746.method_21922().method_8498().method_35456(var1) : true;
   }

   @Override
   public List<class_4038> method_35457(Identifier var1) throws IOException {
      return class_4746.method_21922().method_8498().method_35457(var1);
   }

   @Override
   public Collection<Identifier> method_35460(String var1, Predicate<String> var2) {
      return class_4746.method_21922().method_8498().method_35460(var1, var2);
   }

   @Override
   public Stream<class_8169> method_35459() {
      return null;
   }
}
