package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class Class7537 {
   private static String[] field32344;
   private final Class8234 field32345;
   private final List<Class7790> field32346 = Lists.newArrayList();

   public Class7537(Class8234 var1) {
      this.field32345 = var1;
   }

   public Class7537 method24639(int var1, Class8890 var2) {
      this.field32346.add(new Class7790(var1, var2));
      return this;
   }

   public Class8234 method24640() {
      this.field32346.stream().<Class8890>map(Class7790::method25880).collect(Collectors.toSet()).forEach(this.field32345::method28660);
      this.field32346.forEach(var1 -> {
         Class8890 var4 = var1.method25880();
         this.field32345.method28662(var4).forEach(var1x -> var1x.method23288(var1.method25879(), 0.0F));
         this.field32345.method28661(var4).method23288(var1.method25879(), 1.0F);
      });
      return this.field32345;
   }
}
