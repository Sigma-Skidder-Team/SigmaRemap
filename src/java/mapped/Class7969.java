package mapped;

import javax.annotation.concurrent.Immutable;

@Immutable
public class Class7969 {
   public static final Class7969 field34259 = new Class7969("");
   private final String field34260;

   public Class7969(String var1) {
      this.field34260 = var1;
   }

   public boolean method27091(Class8848 var1) {
      return this.field34260.isEmpty() || !var1.method32105() && var1.method32152() && this.field34260.equals(var1.method32149().getString());
   }

   public void method27092(Class39 var1) {
      if (!this.field34260.isEmpty()) {
         var1.method109("Lock", this.field34260);
      }
   }

   public static Class7969 method27093(Class39 var0) {
      return !var0.method119("Lock", 8) ? field34259 : new Class7969(var0.method126("Lock"));
   }
}
