package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class5877 extends Class5876<Class5877> {
   private static String[] field25666;
   private final Class2343 field25667;
   private final List<Class9603> field25668 = Lists.newArrayList();

   public Class5877(Class2343 var1) {
      this.field25667 = var1;
   }

   public Class5877 method18307(String var1, String var2, Class1819 var3) {
      this.field25668.add(new Class9603(var1, var2, var3));
      return this;
   }

   public Class5877 method18308(String var1, String var2) {
      return this.method18307(var1, var2, Class1819.field9817);
   }

   public Class5877 method18305() {
      return this;
   }

   @Override
   public ILootFunction method18309() {
      return new Class142(this.method18306(), this.field25667, this.field25668);
   }
}
