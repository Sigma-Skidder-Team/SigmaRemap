package remapped;

import java.lang.annotation.Annotation;
import java.util.List;

public abstract class class_3002 implements Comparable<class_3002> {
   private final String field_14732;
   private final Class<?> field_14731;

   public class_3002(String var1, Class<?> var2) {
      this.field_14732 = var1;
      this.field_14731 = var2;
   }

   public Class<?> method_13707() {
      return this.field_14731;
   }

   public abstract Class<?>[] method_13708();

   public String method_13713() {
      return this.field_14732;
   }

   @Override
   public String toString() {
      return this.method_13713() + " of " + this.method_13707();
   }

   public int compareTo(class_3002 var1) {
      return this.method_13713().compareTo(var1.method_13713());
   }

   public boolean method_13710() {
      return true;
   }

   public boolean method_13709() {
      return true;
   }

   public abstract void method_13704(Object var1, Object var2) throws Exception;

   public abstract Object method_13705(Object var1);

   public abstract List<Annotation> method_13712();

   public abstract <A extends Annotation> A method_13706(Class<A> var1);

   @Override
   public int hashCode() {
      return this.method_13713().hashCode() + this.method_13707().hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_3002)) {
         return false;
      } else {
         class_3002 var4 = (class_3002)var1;
         return this.method_13713().equals(var4.method_13713()) && this.method_13707().equals(var4.method_13707());
      }
   }
}
