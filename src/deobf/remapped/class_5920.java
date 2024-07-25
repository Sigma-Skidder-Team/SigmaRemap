package remapped;

import java.util.Map;
import java.util.Map.Entry;

public abstract class class_5920<E extends class_5834> {
   public final Map<class_6044<?>, class_561> field_30040;
   private class_1494 field_30039 = class_1494.field_7949;
   private long field_30037;
   private final int field_30041;
   private final int field_30038;

   public class_5920(Map<class_6044<?>, class_561> var1) {
      this(var1, 60);
   }

   public class_5920(Map<class_6044<?>, class_561> var1, int var2) {
      this(var1, var2, var2);
   }

   public class_5920(Map<class_6044<?>, class_561> var1, int var2, int var3) {
      this.field_30041 = var2;
      this.field_30038 = var3;
      this.field_30040 = var1;
   }

   public class_1494 method_27087() {
      return this.field_30039;
   }

   public final boolean method_27083(class_6331 var1, E var2, long var3) {
      if (this.method_27084((E)var2) && this.method_27088(var1, (E)var2)) {
         this.field_30039 = class_1494.field_7948;
         int var7 = this.field_30041 + var1.method_43360().nextInt(this.field_30038 + 1 - this.field_30041);
         this.field_30037 = var3 + (long)var7;
         this.method_27080(var1, (E)var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public void method_27080(class_6331 var1, E var2, long var3) {
   }

   public final void method_27082(class_6331 var1, E var2, long var3) {
      if (!this.method_27085(var3) && this.method_27086(var1, (E)var2, var3)) {
         this.method_27078(var1, (E)var2, var3);
      } else {
         this.method_27079(var1, (E)var2, var3);
      }
   }

   public void method_27078(class_6331 var1, E var2, long var3) {
   }

   public final void method_27079(class_6331 var1, E var2, long var3) {
      this.field_30039 = class_1494.field_7949;
      this.method_27081(var1, (E)var2, var3);
   }

   public void method_27081(class_6331 var1, E var2, long var3) {
   }

   public boolean method_27086(class_6331 var1, E var2, long var3) {
      return false;
   }

   public boolean method_27085(long var1) {
      return var1 > this.field_30037;
   }

   public boolean method_27088(class_6331 var1, E var2) {
      return true;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   private boolean method_27084(E var1) {
      for (Entry var5 : this.field_30040.entrySet()) {
         class_6044 var6 = (class_6044)var5.getKey();
         class_561 var7 = (class_561)var5.getValue();
         if (!var1.method_26525().method_5118(var6, var7)) {
            return false;
         }
      }

      return true;
   }
}
