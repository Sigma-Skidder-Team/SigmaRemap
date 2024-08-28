package mapped;

import java.util.Random;
import java.util.Set;

public abstract class Class7882<E extends Class880> {
   private static final Random field33825 = new Random();
   private static final Class8522 field33826 = new Class8522().method30203(16.0).method30205().method30207();
   private static final Class8522 field33827 = new Class8522().method30203(16.0).method30205().method30207().method30208();
   private final int field33828;
   private long field33829;

   public Class7882(int var1) {
      this.field33828 = var1;
      this.field33829 = (long)field33825.nextInt(var1);
   }

   public Class7882() {
      this(20);
   }

   public final void method26429(Class1657 var1, E var2) {
      if (--this.field33829 <= 0L) {
         this.field33829 = (long)this.field33828;
         this.method26425(var1, (E)var2);
      }
   }

   public abstract void method26425(Class1657 var1, E var2);

   public abstract Set<Class8830<?>> method26424();

   public static boolean method26430(Class880 var0, Class880 var1) {
      return !var0.method2992().method21411(Class8830.field39826, var1) ? field33826.method30210(var0, var1) : field33827.method30210(var0, var1);
   }
}
