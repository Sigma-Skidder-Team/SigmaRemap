package mapped;

import java.lang.annotation.Annotation;
import java.util.List;

public abstract class Class2013 implements Comparable<Class2013> {
   private final String field13086;
   private final Class<?> field13087;

   public Class2013(String var1, Class<?> var2) {
      this.field13086 = var1;
      this.field13087 = var2;
   }

   public Class<?> method8537() {
      return this.field13087;
   }

   public abstract Class<?>[] method8538();

   public String method8539() {
      return this.field13086;
   }

   @Override
   public String toString() {
      return this.method8539() + " of " + this.method8537();
   }

   public int compareTo(Class2013 var1) {
      return this.method8539().compareTo(var1.method8539());
   }

   public boolean method8540() {
      return true;
   }

   public boolean method8541() {
      return true;
   }

   public abstract void method8542(Object var1, Object var2) throws Exception;

   public abstract Object method8543(Object var1);

   public abstract List<Annotation> method8544();

   public abstract <A extends Annotation> A method8545(Class<A> var1);

   @Override
   public int hashCode() {
      return this.method8539().hashCode() + this.method8537().hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class2013)) {
         return false;
      } else {
         Class2013 var4 = (Class2013)var1;
         return this.method8539().equals(var4.method8539()) && this.method8537().equals(var4.method8537());
      }
   }
}
