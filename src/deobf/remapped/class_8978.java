package remapped;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class class_8978<T extends class_5120> {
   private static class_8978<?>[] field_46004 = new class_8978[0];
   public static final class_8978<class_9040> field_46006 = method_41165(class_9040.class, "HoldingPattern");
   public static final class_8978<class_3394> field_46007 = method_41165(class_3394.class, "StrafePlayer");
   public static final class_8978<class_4341> field_45996 = method_41165(class_4341.class, "LandingApproach");
   public static final class_8978<class_5536> field_45995 = method_41165(class_5536.class, "Landing");
   public static final class_8978<class_2173> field_46003 = method_41165(class_2173.class, "Takeoff");
   public static final class_8978<class_7659> field_45997 = method_41165(class_7659.class, "SittingFlaming");
   public static final class_8978<class_3948> field_45998 = method_41165(class_3948.class, "SittingScanning");
   public static final class_8978<class_8568> field_46001 = method_41165(class_8568.class, "SittingAttacking");
   public static final class_8978<class_3317> field_46002 = method_41165(class_3317.class, "ChargingPlayer");
   public static final class_8978<class_3936> field_46005 = method_41165(class_3936.class, "Dying");
   public static final class_8978<class_5832> field_46000 = method_41165(class_5832.class, "Hover");
   private final Class<? extends class_5120> field_45994;
   private final int field_45999;
   private final String field_46009;

   private class_8978(int var1, Class<? extends class_5120> var2, String var3) {
      this.field_45999 = var1;
      this.field_45994 = var2;
      this.field_46009 = var3;
   }

   public class_5120 method_41166(class_2770 var1) {
      try {
         Constructor var4 = this.method_41167();
         return (class_5120)var4.newInstance(var1);
      } catch (Exception var5) {
         throw new Error(var5);
      }
   }

   public Constructor<? extends class_5120> method_41167() throws NoSuchMethodException {
      return this.field_45994.getConstructor(class_2770.class);
   }

   public int method_41171() {
      return this.field_45999;
   }

   @Override
   public String toString() {
      return this.field_46009 + " (#" + this.field_45999 + ")";
   }

   public static class_8978<?> method_41168(int var0) {
      return var0 >= 0 && var0 < field_46004.length ? field_46004[var0] : field_46006;
   }

   public static int method_41170() {
      return field_46004.length;
   }

   private static <T extends class_5120> class_8978<T> method_41165(Class<T> var0, String var1) {
      class_8978 var4 = new class_8978(field_46004.length, var0, var1);
      field_46004 = Arrays.<class_8978<?>>copyOf(field_46004, field_46004.length + 1);
      field_46004[var4.method_41171()] = var4;
      return var4;
   }
}
