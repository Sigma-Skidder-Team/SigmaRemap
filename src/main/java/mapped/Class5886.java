package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class5886 extends Class5876<Class5886> {
   private static String[] field25689;
   private final List<Class4688> field25690 = Lists.newArrayList();

   public Class5886 method18305() {
      return this;
   }

   public Class5886 method18319(Class5873<?> var1) {
      this.field25690.add(var1.method18304());
      return this;
   }

   @Override
   public ILootFunction method18309() {
      return new Class146(this.method18306(), this.field25690);
   }
}
