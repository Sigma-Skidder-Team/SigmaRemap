package mapped;

import java.util.function.Predicate;

public abstract class Class3262 extends Class3257 {
   public static final Predicate<Class8848> field18748 = var0 -> var0.method32107().method11743(Class5985.field26119);
   public static final Predicate<Class8848> field18749 = field18748.or(var0 -> var0.method32107() == Class8514.field38068);

   public Class3262(Class5643 var1) {
      super(var1);
   }

   public Predicate<Class8848> method11751() {
      return this.method11752();
   }

   public abstract Predicate<Class8848> method11752();

   public static Class8848 method11774(Class880 var0, Predicate<Class8848> var1) {
      if (!var1.test(var0.method3094(Class79.field183))) {
         return !var1.test(var0.method3094(Class79.field182)) ? Class8848.field39973 : var0.method3094(Class79.field182);
      } else {
         return var0.method3094(Class79.field183);
      }
   }

   @Override
   public int method11736() {
      return 1;
   }

   public abstract int method11771();
}
