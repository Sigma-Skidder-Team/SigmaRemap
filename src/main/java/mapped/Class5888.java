package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class5888 implements Class5871<Class5888> {
   private static String[] field25693;
   private final List<Class8894> field25694 = Lists.newArrayList();
   private final List<ILootFunction> field25695 = Lists.newArrayList();
   private Class7538 field25696 = Class7318.field31381;

   public Class5888 method18320(Class5870 var1) {
      this.field25694.add(var1.method18294());
      return this;
   }

   public Class5888 method18321(Class7538 var1) {
      this.field25696 = var1;
      return this;
   }

   public Class5888 method18296(Class5885 var1) {
      this.field25695.add(var1.method18309());
      return this;
   }

   public Class5888 method18295() {
      return this;
   }

   public Class7318 method18322() {
      return new Class7318(this.field25696, this.field25694.toArray(new Class8894[0]), this.field25695.toArray(new ILootFunction[0]));
   }
}
