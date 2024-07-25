package remapped;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

public abstract class class_3050<T> extends class_1033<T> {
   private final UUID field_14970;
   private final Set<class_1455> field_14964;
   private final Set<class_8961> field_14968;
   private String field_14963;
   private float field_14965;
   private class_7754 field_14969;
   private class_3704 field_14967;
   private boolean field_14966;

   public class_3050(String var1, float var2, class_7754 var3, class_3704 var4) {
      Preconditions.checkNotNull(var1, "Title cannot be null");
      Preconditions.checkArgument(var2 >= 0.0F && var2 <= 1.0F, "Health must be between 0 and 1");
      this.field_14970 = UUID.randomUUID();
      this.field_14963 = var1;
      this.field_14965 = var2;
      this.field_14969 = var3 != null ? var3 : class_7754.field_39329;
      this.field_14967 = var4 != null ? var4 : class_3704.field_18181;
      this.field_14964 = Collections.<class_1455>newSetFromMap(new WeakHashMap<class_1455, Boolean>());
      this.field_14968 = new HashSet<class_8961>();
      this.field_14966 = true;
   }

   @Override
   public class_1033 method_4583(String var1) {
      Preconditions.checkNotNull(var1);
      this.field_14963 = var1;
      this.method_13934(class_847.field_4424);
      return this;
   }

   @Override
   public class_1033 method_4572(float var1) {
      Preconditions.checkArgument(var1 >= 0.0F && var1 <= 1.0F, "Health must be between 0 and 1");
      this.field_14965 = var1;
      this.method_13934(class_847.field_4430);
      return this;
   }

   @Override
   public class_7754 method_4582() {
      return this.field_14969;
   }

   @Override
   public class_1033 method_4563(class_7754 var1) {
      Preconditions.checkNotNull(var1);
      this.field_14969 = var1;
      this.method_13934(class_847.field_4428);
      return this;
   }

   @Override
   public class_1033 method_4571(class_3704 var1) {
      Preconditions.checkNotNull(var1);
      this.field_14967 = var1;
      this.method_13934(class_847.field_4428);
      return this;
   }

   @Override
   public class_1033 method_4565(UUID var1) {
      return this.method_4570(class_3446.method_15883().method_33736(var1));
   }

   @Override
   public class_1033 method_4570(class_1455 var1) {
      if (this.field_14964.add(var1) && this.field_14966) {
         this.method_13937(var1, this.method_13936(class_847.field_4429, var1));
      }

      return this;
   }

   @Override
   public class_1033 method_4574(UUID var1) {
      return this.method_4581(class_3446.method_15883().method_33736(var1));
   }

   @Override
   public class_1033 method_4581(class_1455 var1) {
      if (this.field_14964.remove(var1)) {
         this.method_13937(var1, this.method_13936(class_847.field_4425, var1));
      }

      return this;
   }

   @Override
   public class_1033 method_4576(class_8961 var1) {
      Preconditions.checkNotNull(var1);
      if (!this.method_4587(var1)) {
         this.field_14968.add(var1);
      }

      this.method_13934(class_847.field_4432);
      return this;
   }

   @Override
   public class_1033 method_4575(class_8961 var1) {
      Preconditions.checkNotNull(var1);
      if (this.method_4587(var1)) {
         this.field_14968.remove(var1);
      }

      this.method_13934(class_847.field_4432);
      return this;
   }

   @Override
   public boolean method_4587(class_8961 var1) {
      Preconditions.checkNotNull(var1);
      return this.field_14968.contains(var1);
   }

   @Override
   public Set<UUID> method_4584() {
      return this.field_14964
         .stream()
         .<UUID>map(var0 -> class_3446.method_15883().method_33732(var0))
         .filter(Objects::nonNull)
         .collect(Collectors.<UUID>toSet());
   }

   @Override
   public Set<class_1455> method_4579() {
      return Collections.<class_1455>unmodifiableSet(this.field_14964);
   }

   @Override
   public class_1033 method_4567() {
      this.method_13938(true);
      return this;
   }

   @Override
   public class_1033 method_4580() {
      this.method_13938(false);
      return this;
   }

   @Override
   public boolean method_4586() {
      return this.field_14966;
   }

   private void method_13938(boolean var1) {
      if (this.field_14966 != var1) {
         this.field_14966 = var1;
         this.method_13934(!var1 ? class_847.field_4425 : class_847.field_4429);
      }
   }

   @Override
   public UUID method_4585() {
      return this.field_14970;
   }

   public UUID method_13940() {
      return this.field_14970;
   }

   @Override
   public String method_4569() {
      return this.field_14963;
   }

   @Override
   public float method_4566() {
      return this.field_14965;
   }

   @Override
   public class_3704 method_4577() {
      return this.field_14967;
   }

   public Set<class_8961> method_13939() {
      return this.field_14968;
   }

   private void method_13934(class_847 var1) {
      for (class_1455 var5 : new ArrayList<class_1455>(this.field_14964)) {
         class_5051 var6 = this.method_13936(var1, var5);
         this.method_13937(var5, var6);
      }
   }

   private void method_13937(class_1455 var1, class_5051 var2) {
      if (var1.method_6744() != null && var1.method_6744().method_17596().method_42441(class_6890.class)) {
         try {
            var2.method_23233(class_6890.class);
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      } else {
         this.field_14964.remove(var1);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class_5051 method_13936(class_847 var1, class_1455 var2) {
      try {
         class_5051 var5 = new class_5051(12, null, var2);
         var5.method_23236(class_8039.field_41150, this.field_14970);
         var5.method_23236(class_8039.field_41157, var1.method_3697());
         switch (var1) {
            case field_4429:
               class_6890.field_35446.method_6684(var5, this.field_14963);
               var5.method_23236(class_8039.field_41146, this.field_14965);
               var5.method_23236(class_8039.field_41157, this.field_14969.method_35194());
               var5.method_23236(class_8039.field_41157, this.field_14967.method_17206());
               var5.method_23236(class_8039.field_41133, (byte)this.method_13935());
            case field_4425:
            default:
               break;
            case field_4430:
               var5.method_23236(class_8039.field_41146, this.field_14965);
               break;
            case field_4424:
               class_6890.field_35446.method_6684(var5, this.field_14963);
               break;
            case field_4428:
               var5.method_23236(class_8039.field_41157, this.field_14969.method_35194());
               var5.method_23236(class_8039.field_41157, this.field_14967.method_17206());
               break;
            case field_4432:
               var5.method_23236(class_8039.field_41133, (byte)this.method_13935());
         }

         return var5;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private int method_13935() {
      int var3 = 0;

      for (class_8961 var5 : this.field_14968) {
         var3 |= var5.method_41115();
      }

      return var3;
   }
}
