package mapped;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Class9598<T extends Class7373> {
   private static Class9598<?>[] field44895 = new Class9598[0];
   public static final Class9598<Class7369> field44896 = method37262(Class7369.class, "HoldingPattern");
   public static final Class9598<Class7374> field44897 = method37262(Class7374.class, "StrafePlayer");
   public static final Class9598<Class7372> field44898 = method37262(Class7372.class, "LandingApproach");
   public static final Class9598<Class7366> field44899 = method37262(Class7366.class, "Landing");
   public static final Class9598<Class7368> field44900 = method37262(Class7368.class, "Takeoff");
   public static final Class9598<Class7365> field44901 = method37262(Class7365.class, "SittingFlaming");
   public static final Class9598<Class7363> field44902 = method37262(Class7363.class, "SittingScanning");
   public static final Class9598<Class7364> field44903 = method37262(Class7364.class, "SittingAttacking");
   public static final Class9598<Class7371> field44904 = method37262(Class7371.class, "ChargingPlayer");
   public static final Class9598<Class7370> field44905 = method37262(Class7370.class, "Dying");
   public static final Class9598<Class7367> field44906 = method37262(Class7367.class, "Hover");
   private final Class<? extends Class7373> field44907;
   private final int field44908;
   private final String field44909;

   private Class9598(int var1, Class<? extends Class7373> var2, String var3) {
      this.field44908 = var1;
      this.field44907 = var2;
      this.field44909 = var3;
   }

   public Class7373 method37257(EnderDragonEntity var1) {
      try {
         Constructor var4 = this.method37258();
         return (Class7373)var4.newInstance(var1);
      } catch (Exception var5) {
         throw new Error(var5);
      }
   }

   public Constructor<? extends Class7373> method37258() throws NoSuchMethodException {
      return this.field44907.getConstructor(EnderDragonEntity.class);
   }

   public int method37259() {
      return this.field44908;
   }

   @Override
   public String toString() {
      return this.field44909 + " (#" + this.field44908 + ")";
   }

   public static Class9598<?> method37260(int var0) {
      return var0 >= 0 && var0 < field44895.length ? field44895[var0] : field44896;
   }

   public static int method37261() {
      return field44895.length;
   }

   private static <T extends Class7373> Class9598<T> method37262(Class<T> var0, String var1) {
      Class9598 var4 = new Class9598(field44895.length, var0, var1);
      field44895 = Arrays.<Class9598<?>>copyOf(field44895, field44895.length + 1);
      field44895[var4.method37259()] = var4;
      return var4;
   }
}
