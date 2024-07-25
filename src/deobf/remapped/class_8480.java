package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class class_8480 {
   private final class_6331 field_43453;
   private final Map<class_9791<?>, Object> field_43455 = Maps.newIdentityHashMap();
   private final Map<class_4639, class_7006> field_43456 = Maps.newHashMap();
   private Random field_43451;
   private float field_43454;

   public class_8480(class_6331 var1) {
      this.field_43453 = var1;
   }

   public class_8480 method_39068(Random var1) {
      this.field_43451 = var1;
      return this;
   }

   public class_8480 method_39067(long var1) {
      if (var1 != 0L) {
         this.field_43451 = new Random(var1);
      }

      return this;
   }

   public class_8480 method_39070(long var1, Random var3) {
      if (var1 != 0L) {
         this.field_43451 = new Random(var1);
      } else {
         this.field_43451 = var3;
      }

      return this;
   }

   public class_8480 method_39063(float var1) {
      this.field_43454 = var1;
      return this;
   }

   public <T> class_8480 method_39065(class_9791<T> var1, T var2) {
      this.field_43455.put(var1, var2);
      return this;
   }

   public <T> class_8480 method_39069(class_9791<T> var1, T var2) {
      if (var2 != null) {
         this.field_43455.put(var1, var2);
      } else {
         this.field_43455.remove(var1);
      }

      return this;
   }

   public class_8480 method_39066(class_4639 var1, class_7006 var2) {
      class_7006 var5 = this.field_43456.put(var1, var2);
      if (var5 == null) {
         return this;
      } else {
         throw new IllegalStateException("Duplicated dynamic drop '" + this.field_43456 + "'");
      }
   }

   public class_6331 method_39060() {
      return this.field_43453;
   }

   public <T> T method_39062(class_9791<T> var1) {
      Object var4 = this.field_43455.get(var1);
      if (var4 != null) {
         return (T)var4;
      } else {
         throw new IllegalArgumentException("No parameter " + var1);
      }
   }

   @Nullable
   public <T> T method_39071(class_9791<T> var1) {
      return (T)this.field_43455.get(var1);
   }

   public class_2792 method_39064(class_2144 var1) {
      SetView var4 = Sets.difference(this.field_43455.keySet(), var1.method_10020());
      if (var4.isEmpty()) {
         SetView var5 = Sets.difference(var1.method_10022(), this.field_43455.keySet());
         if (var5.isEmpty()) {
            Random var6 = this.field_43451;
            if (var6 == null) {
               var6 = new Random();
            }

            class_341 var7 = this.field_43453.method_29522();
            return new class_2792(
               var6,
               this.field_43454,
               this.field_43453,
               var7.method_1722()::method_4604,
               var7.method_1676()::method_1146,
               this.field_43455,
               this.field_43456,
               null
            );
         } else {
            throw new IllegalArgumentException("Missing required parameters: " + var5);
         }
      } else {
         throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + var4);
      }
   }
}
