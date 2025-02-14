package mapped;

import java.util.LinkedList;
import java.util.List;

public final class Class6856 {
   public static final Class6856 field29778 = new Class6856();
   private final List<Class7342> field29779 = new LinkedList<Class7342>();

   private void method20893(Class7342 var1) {
      this.field29779.add(var1);
   }

   public String method20894(String var1) {
      for (Class7342 var5 : this.field29779) {
         String var6 = var5.method23265(var1);
         if (var6 != null) {
            return var6;
         }
      }

      return var1;
   }

   public List<Class7342> method20895() {
      return this.field29779;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (!(var1 instanceof Class6856)) {
            return false;
         } else {
            Class6856 var4 = (Class6856)var1;
            List var5 = this.method20895();
            List var6 = var4.method20895();
            return var5 != null ? var5.equals(var6) : var6 == null;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      byte var3 = 59;
      byte var4 = 1;
      List var5 = this.method20895();
      return var4 * 59 + (var5 != null ? var5.hashCode() : 43);
   }

   @Override
   public String toString() {
      return "TranslationRegistry(providers=" + this.method20895() + ")";
   }

   private Class6856() {
   }

   static {
      try {
         field29778.method20893(new Class7341("/assets/minecraft/lang/en_us.json"));
      } catch (Exception var8) {
      }

      try {
         field29778.method20893(new Class7343("mojang-translations/en_US"));
      } catch (Exception var7) {
      }
   }
}
