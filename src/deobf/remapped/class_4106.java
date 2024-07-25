package remapped;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.jetbrains.annotations.Nullable;
import us.myles.ViaVersion.exception.InformativeException;

public abstract class class_4106<C1 extends class_1372, C2 extends class_1372, S1 extends class_7163, S2 extends class_7163> {
   private final Map<class_4999, class_1073> field_20005 = new HashMap<class_4999, class_1073>();
   private final Map<class_4999, class_1073> field_20001 = new HashMap<class_4999, class_1073>();
   private final Map<Class, Object> field_20006 = new HashMap<Class, Object>();
   public final Class<C1> field_20002;
   public final Class<C2> field_20000;
   public final Class<S1> field_20003;
   public final Class<S2> field_20004;

   public class_4106() {
      this(null, null, null, null);
   }

   public class_4106(Class<C1> var1, Class<C2> var2, Class<S1> var3, Class<S2> var4) {
      this.field_20002 = var1;
      this.field_20000 = var2;
      this.field_20003 = var3;
      this.field_20004 = var4;
      this.method_18998();
      if (var1 != null && var2 != null && var1 != var2) {
         this.method_19006();
      }

      if (var3 != null && var4 != null && var3 != var4) {
         this.method_18996();
      }
   }

   public void method_19006() {
      class_1372[] var3 = this.field_20000.getEnumConstants();
      HashMap var4 = new HashMap(var3.length);

      for (class_1372 var8 : var3) {
         var4.put(var8.method_31560(), var8);
      }

      for (class_1372 var15 : (class_1372[])this.field_20002.getEnumConstants()) {
         class_1372 var9 = (class_1372)var4.get(var15.method_31560());
         int var10 = var15.method_31559();
         if (var9 != null) {
            int var11 = var9.method_31559();
            if (!this.method_19021(class_1730.field_8920, var10)) {
               this.method_19016(class_1730.field_8920, var10, var11);
            }
         } else {
            Preconditions.checkArgument(
               this.method_19021(class_1730.field_8920, var10),
               "Packet " + var15 + " in " + this.getClass().getSimpleName() + " has no mapping - it needs to be manually cancelled or remapped!"
            );
         }
      }
   }

   public void method_18996() {
      class_7163[] var3 = this.field_20003.getEnumConstants();
      HashMap var4 = new HashMap(var3.length);

      for (class_7163 var8 : var3) {
         var4.put(var8.method_31560(), var8);
      }

      for (class_7163 var15 : (class_7163[])this.field_20004.getEnumConstants()) {
         class_7163 var9 = (class_7163)var4.get(var15.method_31560());
         int var10 = var15.method_31559();
         if (var9 != null) {
            int var11 = var9.method_31559();
            if (!this.method_18995(class_1730.field_8920, var10)) {
               this.method_18989(class_1730.field_8920, var11, var10);
            }
         } else {
            Preconditions.checkArgument(
               this.method_18995(class_1730.field_8920, var10),
               "Packet " + var15 + " in " + this.getClass().getSimpleName() + " has no mapping - it needs to be manually cancelled or remapped!"
            );
         }
      }
   }

   public boolean method_19000(Class var1) {
      return false;
   }

   public void method_19004(class_1455 var1, Object var2, List var3) throws Exception {
      var3.add(var2);
   }

   public void method_18998() {
   }

   public final void method_19024() {
      this.method_19008().method_28212();
      this.method_19022();
   }

   public void method_19022() {
   }

   public void method_19020(class_5368 var1) {
   }

   public void method_19025(class_1455 var1) {
   }

   public void method_18989(class_1730 var1, int var2, int var3) {
      this.method_18990(var1, var2, var3, null);
   }

   public void method_18990(class_1730 var1, int var2, int var3, class_3893 var4) {
      this.method_18991(var1, var2, var3, var4, false);
   }

   public void method_18991(class_1730 var1, int var2, int var3, class_3893 var4, boolean var5) {
      class_1073 var8 = new class_1073(var1, var2, var3, var4);
      class_4999 var9 = new class_4999(var1, var3);
      if (!var5 && this.field_20005.containsKey(var9)) {
         class_3446.method_15886()
            .method_34617()
            .log(Level.WARNING, var9 + " already registered! If this override is intentional, set override to true. Stacktrace: ", (Throwable)(new Exception()));
      }

      this.field_20005.put(var9, var8);
   }

   public void method_19002(class_1730 var1, int var2, int var3) {
      this.method_18990(var1, var2, var3, new class_458(this));
   }

   public void method_19001(class_1730 var1, int var2) {
      this.method_19002(var1, -1, var2);
   }

   public void method_19016(class_1730 var1, int var2, int var3) {
      this.method_19017(var1, var2, var3, null);
   }

   public void method_19017(class_1730 var1, int var2, int var3, class_3893 var4) {
      this.method_19018(var1, var2, var3, var4, false);
   }

   public void method_19011(class_1730 var1, int var2, int var3) {
      this.method_19017(var1, var2, var3, new class_6140(this));
   }

   public void method_19010(class_1730 var1, int var2) {
      this.method_19011(var1, var2, -1);
   }

   public void method_19018(class_1730 var1, int var2, int var3, class_3893 var4, boolean var5) {
      class_1073 var8 = new class_1073(var1, var2, var3, var4);
      class_4999 var9 = new class_4999(var1, var2);
      if (!var5 && this.field_20001.containsKey(var9)) {
         class_3446.method_15886()
            .method_34617()
            .log(Level.WARNING, var9 + " already registered! If override is intentional, set override to true. Stacktrace: ", (Throwable)(new Exception()));
      }

      this.field_20001.put(var9, var8);
   }

   public void method_19015(C1 var1, class_3893 var2) {
      this.method_18994(var1, var1.getClass() == this.field_20002);
      class_1372 var5 = this.field_20002 != this.field_20000
         ? Arrays.<C2>stream(this.field_20000.getEnumConstants()).filter(var1x -> var1x.method_31560().equals(var1.method_31560())).findAny().orElse(null)
         : var1;
      Preconditions.checkNotNull(var5, "Packet type " + var1 + " in " + var1.getClass().getSimpleName() + " could not be automatically mapped!");
      int var6 = var1.method_31559();
      int var7 = var5.method_31559();
      this.method_19017(class_1730.field_8920, var6, var7, var2);
   }

   public void method_19014(C1 var1, C2 var2, class_3893 var3) {
      this.method_18994(var1, var1.getClass() == this.field_20002);
      this.method_18994(var2, var2 == null || var2.getClass() == this.field_20000);
      this.method_19017(class_1730.field_8920, var1.method_31559(), var2 == null ? -1 : var2.method_31559(), var3);
   }

   public void method_19013(C1 var1, C2 var2) {
      this.method_19014((C1)var1, (C2)var2, null);
   }

   public void method_19009(C1 var1) {
      this.method_19011(class_1730.field_8920, var1.method_31559(), var1.method_31559());
   }

   public void method_18992(S2 var1, class_3893 var2) {
      this.method_18994(var1, var1.getClass() == this.field_20004);
      class_7163 var5 = this.field_20003 != this.field_20004
         ? Arrays.<S1>stream(this.field_20003.getEnumConstants()).filter(var1x -> var1x.method_31560().equals(var1.method_31560())).findAny().orElse(null)
         : var1;
      Preconditions.checkNotNull(var5, "Packet type " + var1 + " in " + var1.getClass().getSimpleName() + " could not be automatically mapped!");
      int var6 = var5.method_31559();
      int var7 = var1.method_31559();
      this.method_18990(class_1730.field_8920, var6, var7, var2);
   }

   public void method_18993(S2 var1, S1 var2, class_3893 var3) {
      this.method_18994(var1, var1.getClass() == this.field_20004);
      this.method_18994(var2, var2 == null || var2.getClass() == this.field_20003);
      this.method_18990(class_1730.field_8920, var2 == null ? -1 : var2.method_31559(), var1.method_31559(), var3);
   }

   public void method_19003(S2 var1) {
      Preconditions.checkArgument(var1.getClass() == this.field_20004);
      this.method_19002(class_1730.field_8920, -1, var1.method_31559());
   }

   public boolean method_19021(class_1730 var1, int var2) {
      class_4999 var5 = new class_4999(var1, var2);
      return this.field_20001.containsKey(var5);
   }

   public boolean method_18995(class_1730 var1, int var2) {
      class_4999 var5 = new class_4999(var1, var2);
      return this.field_20005.containsKey(var5);
   }

   public void method_18999(class_3842 var1, class_1730 var2, class_5051 var3) throws Exception {
      class_4999 var6 = new class_4999(var2, var3.method_23250());
      Map var7 = var1 == class_3842.field_18754 ? this.field_20001 : this.field_20005;
      class_1073 var8 = (class_1073)var7.get(var6);
      if (var8 != null) {
         int var9 = var3.method_23250();
         int var10 = var1 == class_3842.field_18754 ? var8.method_4700() : var8.method_4699();
         var3.method_23253(var10);
         class_3893 var11 = var8.method_4702();
         if (var11 != null) {
            try {
               var11.method_18024(var3);
            } catch (class_9699 var13) {
               this.method_19005(var1, var2, var9, var10, var13);
               return;
            }

            if (var3.method_23243()) {
               throw class_6400.method_29217();
            }
         }
      }
   }

   private void method_19005(class_3842 var1, class_1730 var2, int var3, int var4, class_9699 var5) throws InformativeException {
      if (var2 != class_1730.field_8923) {
         Class var8 = var2 != class_1730.field_8920 ? null : (var1 != class_3842.field_18754 ? this.field_20004 : this.field_20002);
         if (var8 == null) {
            class_3446.method_15886()
               .method_34617()
               .warning("ERROR IN " + this.getClass().getSimpleName() + " IN REMAP OF " + this.method_19007(var3) + "->" + this.method_19007(var4));
         } else {
            class_6881[] var9 = (class_6881[])var8.getEnumConstants();
            class_6881 var10 = var3 < var9.length && var3 >= 0 ? var9[var3] : null;
            class_3446.method_15886()
               .method_34617()
               .warning("ERROR IN " + this.getClass().getSimpleName() + " IN REMAP OF " + var10 + " (" + this.method_19007(var3) + ")");
         }

         throw var5;
      } else {
         throw var5;
      }
   }

   private String method_19007(int var1) {
      String var4 = Integer.toHexString(var1).toUpperCase();
      return (var4.length() != 1 ? "0x" : "0x0") + var4;
   }

   private void method_18994(class_6881 var1, boolean var2) {
      if (!var2) {
         throw new IllegalArgumentException("Packet type " + var1 + " in " + var1.getClass().getSimpleName() + " is taken from the wrong enum");
      }
   }

   @Nullable
   public <T> T method_18997(Class<T> var1) {
      return (T)this.field_20006.get(var1);
   }

   public void method_19019(Object var1) {
      this.field_20006.put(var1.getClass(), var1);
   }

   public boolean method_19023() {
      return this.method_19008() != null;
   }

   @Nullable
   public class_6150 method_19008() {
      return null;
   }

   @Override
   public String toString() {
      return "Protocol:" + this.getClass().getSimpleName();
   }
}
