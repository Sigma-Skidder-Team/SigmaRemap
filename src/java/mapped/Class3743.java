package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.Optional;

public class Class3743<E extends Class1034> extends Class3676<E> {
   private static String[] field19877;
   private final int field19878;

   public Class3743(int var1) {
      super(ImmutableMap.of(Class8830.field39851, Class2217.field14484, Class8830.field39847, Class2217.field14486));
      this.field19878 = var1;
   }

   public boolean method12508(Class1657 var1, E var2) {
      if (var2.method3091().method32105()) {
         Optional var5 = var2.method2992().<Class1000>method21410(Class8830.field39847);
         return var5.isPresent() ? !((Class1000)var5.get()).method3213(var2, (double)this.field19878) : true;
      } else {
         return false;
      }
   }

   public void method12502(Class1657 var1, E var2, long var3) {
      var2.method2992().method21405(Class8830.field39851);
   }
}
