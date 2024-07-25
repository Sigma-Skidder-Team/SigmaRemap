package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum class_3144 implements class_7832 {
   field_15638;

   @Override
   public Set<String> method_35455() {
      return ImmutableSet.of();
   }

   @Override
   public class_4038 method_35458(Identifier var1) throws IOException {
      throw new FileNotFoundException(var1.toString());
   }

   @Override
   public boolean method_35456(Identifier var1) {
      return false;
   }

   @Override
   public List<class_4038> method_35457(Identifier var1) {
      return ImmutableList.of();
   }

   @Override
   public Collection<Identifier> method_35460(String var1, Predicate<String> var2) {
      return ImmutableSet.of();
   }

   @Override
   public Stream<class_8169> method_35459() {
      return Stream.<class_8169>of();
   }
}
