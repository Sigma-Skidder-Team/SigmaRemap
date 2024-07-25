package remapped;

import java.util.Random;
import java.util.Set;

public abstract class class_6127<E extends LivingEntity> {
   private static final Random field_31451 = new Random();
   private static final class_4931 field_31450 = new class_4931().method_22607(16.0).method_22601().method_22609();
   private static final class_4931 field_31454 = new class_4931().method_22607(16.0).method_22601().method_22609().method_22608();
   private final int field_31452;
   private long field_31453;

   public class_6127(int var1) {
      this.field_31452 = var1;
      this.field_31453 = (long)field_31451.nextInt(var1);
   }

   public class_6127() {
      this(20);
   }

   public final void method_28151(class_6331 var1, E var2) {
      if (--this.field_31453 <= 0L) {
         this.field_31453 = (long)this.field_31452;
         this.method_28154(var1, (E)var2);
      }
   }

   public abstract void method_28154(class_6331 var1, E var2);

   public abstract Set<class_6044<?>> method_28152();

   public static boolean method_28150(LivingEntity var0, LivingEntity var1) {
      return !var0.method_26525().method_5140(class_6044.field_30884, var1) ? field_31450.method_22604(var0, var1) : field_31454.method_22604(var0, var1);
   }
}
