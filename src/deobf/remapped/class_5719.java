package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface class_5719 {
   List<Entity> method_25867(Entity var1, Box var2, Predicate<? super Entity> var3);

   <T extends Entity> List<T> method_25869(Class<? extends T> var1, Box var2, Predicate<? super T> var3);

   default <T extends Entity> List<T> method_25875(Class<? extends T> var1, Box var2, Predicate<? super T> var3) {
      return this.<T>method_25869(var1, var2, var3);
   }

   List<? extends PlayerEntity> method_25873();

   default List<Entity> method_25870(Entity var1, Box var2) {
      return this.method_25867(var1, var2, class_3572.field_17483);
   }

   default boolean method_6678(Entity var1, class_4190 var2) {
      if (var2.method_19485()) {
         return true;
      } else {
         for (Entity var6 : this.method_25870(var1, var2.method_19483())) {
            if (!var6.removed
               && var6.preventEntitySpawning
               && (var1 == null || !var6.method_37308(var1))
               && class_3370.method_15537(var2, class_3370.method_15523(var6.getBoundingBox()), class_8529.field_43655)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends Entity> List<T> method_25868(Class<? extends T> var1, Box var2) {
      return this.<T>method_25869(var1, var2, class_3572.field_17483);
   }

   default <T extends Entity> List<T> method_25874(Class<? extends T> var1, Box var2) {
      return this.<T>method_25875(var1, var2, class_3572.field_17483);
   }

   default Stream<class_4190> method_6679(Entity var1, Box var2, Predicate<Entity> var3) {
      if (!(var2.method_18906() < 1.0E-7)) {
         Box var6 = var2.grow(1.0E-7);
         return this.method_25867(var1, var6, var3.and(var2x -> {
            if (var2x.getBoundingBox().method_18909(var6)) {
               if (var1 != null) {
                  if (var1.method_37325(var2x)) {
                     return true;
                  }
               } else if (var2x.method_37173()) {
                  return true;
               }
            }

            return false;
         })).stream().<Box>map(Entity::getBoundingBox).<class_4190>map(class_3370::method_15523);
      } else {
         return Stream.<class_4190>empty();
      }
   }

   @Nullable
   default PlayerEntity method_25856(double var1, double var3, double var5, double var7, Predicate<Entity> var9) {
      double var12 = -1.0;
      PlayerEntity var14 = null;

      for (PlayerEntity var16 : this.method_25873()) {
         if (var9 == null || var9.test(var16)) {
            double var17 = var16.method_37273(var1, var3, var5);
            if ((var7 < 0.0 || var17 < var7 * var7) && (var12 == -1.0 || var17 < var12)) {
               var12 = var17;
               var14 = var16;
            }
         }
      }

      return var14;
   }

   @Nullable
   default PlayerEntity method_25861(Entity var1, double var2) {
      return this.method_25857(var1.getPosX(), var1.method_37309(), var1.getPosZ(), var2, false);
   }

   @Nullable
   default PlayerEntity method_25857(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate var12 = !var9 ? class_3572.field_17483 : class_3572.field_17479;
      return this.method_25856(var1, var3, var5, var7, var12);
   }

   default boolean method_25866(double var1, double var3, double var5, double var7) {
      for (PlayerEntity var12 : this.method_25873()) {
         if (class_3572.field_17483.test(var12) && class_3572.field_17482.test(var12)) {
            double var13 = var12.method_37273(var1, var3, var5);
            if (var7 < 0.0 || var13 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default PlayerEntity method_25859(class_4931 var1, LivingEntity var2) {
      return this.<PlayerEntity>method_25864(this.method_25873(), var1, var2, var2.getPosX(), var2.method_37309(), var2.getPosZ());
   }

   @Nullable
   default PlayerEntity method_25860(class_4931 var1, LivingEntity var2, double var3, double var5, double var7) {
      return this.<PlayerEntity>method_25864(this.method_25873(), var1, var2, var3, var5, var7);
   }

   @Nullable
   default PlayerEntity method_25858(class_4931 var1, double var2, double var4, double var6) {
      return this.<PlayerEntity>method_25864(this.method_25873(), var1, (LivingEntity)null, var2, var4, var6);
   }

   @Nullable
   default <T extends LivingEntity> T method_25865(
           Class<? extends T> var1, class_4931 var2, LivingEntity var3, double var4, double var6, double var8, Box var10
   ) {
      return this.<T>method_25864(this.method_25869(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   @Nullable
   default <T extends LivingEntity> T method_25872(
           Class<? extends T> var1, class_4931 var2, LivingEntity var3, double var4, double var6, double var8, Box var10
   ) {
      return this.<T>method_25864(this.method_25875(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   @Nullable
   default <T extends LivingEntity> T method_25864(List<? extends T> var1, class_4931 var2, LivingEntity var3, double var4, double var6, double var8) {
      double var12 = -1.0;
      LivingEntity var14 = null;

      for (LivingEntity var16 : var1) {
         if (var2.method_22604(var3, var16)) {
            double var17 = var16.method_37273(var4, var6, var8);
            if (var12 == -1.0 || var17 < var12) {
               var12 = var17;
               var14 = var16;
            }
         }
      }

      return (T)var14;
   }

   default List<PlayerEntity> method_25871(class_4931 var1, LivingEntity var2, Box var3) {
      ArrayList var6 = Lists.newArrayList();

      for (PlayerEntity var8 : this.method_25873()) {
         if (var3.method_18902(var8.getPosX(), var8.method_37309(), var8.getPosZ()) && var1.method_22604(var2, var8)) {
            var6.add(var8);
         }
      }

      return var6;
   }

   default <T extends LivingEntity> List<T> method_25863(Class<? extends T> var1, class_4931 var2, LivingEntity var3, Box var4) {
      List var7 = this.method_25869(var1, var4, (Predicate<? super T>)null);
      ArrayList var8 = Lists.newArrayList();

      for (LivingEntity var10 : var7) {
         if (var2.method_22604(var3, var10)) {
            var8.add(var10);
         }
      }

      return var8;
   }

   @Nullable
   default PlayerEntity method_25862(UUID var1) {
      for (int var4 = 0; var4 < this.method_25873().size(); var4++) {
         PlayerEntity var5 = this.method_25873().get(var4);
         if (var1.equals(var5.method_37328())) {
            return var5;
         }
      }

      return null;
   }
}
