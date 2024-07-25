package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class class_9632 {
   private final Map<class_225, class_9747> field_49056;

   public class_9632(Map<class_225, class_9747> var1) {
      this.field_49056 = ImmutableMap.copyOf(var1);
   }

   private class_9747 method_44448(class_225 var1) {
      class_9747 var4 = this.field_49056.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new IllegalArgumentException("Can't find attribute " + class_8669.field_44403.method_39797(var1));
      }
   }

   public double method_44446(class_225 var1) {
      return this.method_44448(var1).method_44998();
   }

   public double method_44449(class_225 var1) {
      return this.method_44448(var1).method_44996();
   }

   public double method_44454(class_225 var1, UUID var2) {
      class_9343 var5 = this.method_44448(var1).method_44997(var2);
      if (var5 != null) {
         return var5.method_43123();
      } else {
         throw new IllegalArgumentException("Can't find modifier " + var2 + " on attribute " + class_8669.field_44403.method_39797(var1));
      }
   }

   @Nullable
   public class_9747 method_44450(Consumer<class_9747> var1, class_225 var2) {
      class_9747 var5 = this.field_49056.get(var2);
      if (var5 != null) {
         class_9747 var6 = new class_9747(var2, var1);
         var6.method_45010(var5);
         return var6;
      } else {
         return null;
      }
   }

   public static MutableAttribute method_44452() {
      return new MutableAttribute();
   }

   public boolean method_44451(class_225 var1) {
      return this.field_49056.containsKey(var1);
   }

   public boolean method_44453(class_225 var1, UUID var2) {
      class_9747 var5 = this.field_49056.get(var1);
      return var5 != null && var5.method_44997(var2) != null;
   }
}
