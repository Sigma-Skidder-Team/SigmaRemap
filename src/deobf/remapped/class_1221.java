package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Triple;

public final class class_1221 {
   private static String[] field_6769;
   private final class_8107 field_6772;
   private boolean field_6768;
   private class_2426 field_6767;
   private Quaternion field_6773;
   private class_2426 field_6770;
   private Quaternion field_6766;
   private static final class_1221 field_6771 = Util.<class_1221>method_44660(() -> {
      class_8107 var2 = new class_8107();
      var2.method_36817();
      class_1221 var3 = new class_1221(var2);
      var3.method_5408();
      return var3;
   });

   public class_1221(class_8107 var1) {
      if (var1 != null) {
         this.field_6772 = var1;
      } else {
         this.field_6772 = field_6771.field_6772;
      }
   }

   public class_1221(class_2426 var1, Quaternion var2, class_2426 var3, Quaternion var4) {
      this.field_6772 = method_5405(var1, var2, var3, var4);
      this.field_6767 = var1 == null ? new class_2426() : var1;
      this.field_6773 = var2 == null ? Quaternion.IDENTITY.method_24651() : var2;
      this.field_6770 = var3 == null ? new class_2426(1.0F, 1.0F, 1.0F) : var3;
      this.field_6766 = var4 == null ? Quaternion.IDENTITY.method_24651() : var4;
      this.field_6768 = true;
   }

   public static class_1221 method_5406() {
      return field_6771;
   }

   public class_1221 method_5404(class_1221 var1) {
      class_8107 var4 = this.method_5410();
      var4.method_36832(var1.method_5410());
      return new class_1221(var4);
   }

   @Nullable
   public class_1221 method_5403() {
      if (this != field_6771) {
         class_8107 var3 = this.method_5410();
         return !var3.method_36809() ? null : new class_1221(var3);
      } else {
         return this;
      }
   }

   private void method_5409() {
      if (!this.field_6768) {
         Pair var3 = method_5407(this.field_6772);
         Triple var4 = ((class_6555)var3.getFirst()).method_29894();
         this.field_6767 = (class_2426)var3.getSecond();
         this.field_6773 = (Quaternion)var4.getLeft();
         this.field_6770 = (class_2426)var4.getMiddle();
         this.field_6766 = (Quaternion)var4.getRight();
         this.field_6768 = true;
      }
   }

   private static class_8107 method_5405(class_2426 var0, Quaternion var1, class_2426 var2, Quaternion var3) {
      class_8107 var6 = new class_8107();
      var6.method_36817();
      if (var1 != null) {
         var6.method_36832(new class_8107(var1));
      }

      if (var2 != null) {
         var6.method_36832(class_8107.method_36814(var2.method_11057(), var2.method_11061(), var2.method_11055()));
      }

      if (var3 != null) {
         var6.method_36832(new class_8107(var3));
      }

      if (var0 != null) {
         var6.field_41517 = var0.method_11057();
         var6.field_41516 = var0.method_11061();
         var6.field_41532 = var0.method_11055();
      }

      return var6;
   }

   public static Pair<class_6555, class_2426> method_5407(class_8107 var0) {
      var0.method_36830(1.0F / var0.field_41527);
      class_2426 var3 = new class_2426(var0.field_41517, var0.field_41516, var0.field_41532);
      class_6555 var4 = new class_6555(var0);
      return Pair.of(var4, var3);
   }

   public class_8107 method_5410() {
      return this.field_6772.method_36824();
   }

   public Quaternion method_5408() {
      this.method_5409();
      return this.field_6773.method_24651();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_1221 var4 = (class_1221)var1;
            return Objects.equals(this.field_6772, var4.field_6772);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_6772);
   }
}
