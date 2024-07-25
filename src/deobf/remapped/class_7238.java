package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class class_7238 {
   private final Class<? extends class_3261> field_37134;
   public final class_4106 field_37136;
   private Int2IntMap field_37135;

   public class_7238(class_4106 var1, Class<? extends class_3261> var2) {
      this.field_37136 = var1;
      this.field_37134 = var2;
      var1.method_19019(this);
   }

   public final void method_33131(int var1, List<class_5407> var2, class_1455 var3) {
      class_754 var6 = var3.method_6746(this.field_37134).method_14879(var1);

      for (class_5407 var8 : new ArrayList(var2)) {
         try {
            this.method_33132(var1, var6, var8, var2, var3);
         } catch (Exception var11) {
            var2.remove(var8);
            if (!class_3446.method_15884().method_25836() || class_3446.method_15883().method_33731()) {
               Logger var10 = class_3446.method_15886().method_34617();
               var10.warning("An error occurred with entity metadata handler");
               var10.warning(
                  "This is most likely down to one of your plugins sending bad datawatchers. Please test if this occurs without any plugins except ViaVersion before reporting it on GitHub"
               );
               var10.warning("Also make sure that all your plugins are compatible with your server version.");
               var10.warning("Entity type: " + var6);
               var10.warning("Metadata: " + var8);
               var11.printStackTrace();
            }
         }
      }
   }

   public void method_33119(class_5167 var1) {
      class_6452 var4 = this.field_37136.method_19008().method_28203();
      int var5 = var1.method_23691();
      if (var5 == var4.method_29413() || var5 == var4.method_29416()) {
         class_7579 var7 = var1.method_23687().get(0);
         var7.method_34441(this.field_37136.method_19008().method_28217(var7.<Integer>method_34442()));
      } else if (var5 == var4.method_29415()) {
         class_7579 var6 = var1.method_23687().get(0);
         var6.method_34441(this.field_37136.method_19008().method_28210(var6.<Integer>method_34442()));
      }

      var1.method_23689(this.field_37136.method_19008().method_28202(var5));
   }

   public void method_33124(class_1372 var1) {
      this.field_37136.method_19015(var1, new class_8851(this));
   }

   public void method_33121(class_1372 var1, class_754 var2) {
      this.field_37136.method_19015(var1, new class_4994(this, var2));
   }

   public void method_33125(class_1372 var1, class_754 var2) {
      this.field_37136.method_19015(var1, new class_5646(this, var2));
   }

   public void method_33112(class_1372 var1) {
      this.field_37136.method_19015(var1, new class_398(this));
   }

   public void method_33129(class_1372 var1, class_8039<List<class_5407>> var2, class_8039<List<class_5407>> var3) {
      this.field_37136.method_19015(var1, new class_7374(this, var2, var3));
   }

   public void method_33128(class_1372 var1, class_8039<List<class_5407>> var2) {
      this.method_33129(var1, null, var2);
   }

   public <T extends Enum<T> & class_754> void method_33113(class_754[] var1, Class<T> var2) {
      if (this.field_37135 == null) {
         this.field_37135 = new Int2IntOpenHashMap(var1.length, 1.0F);
         this.field_37135.defaultReturnValue(-1);
      }

      for (class_754 var8 : var1) {
         try {
            class_754 var9 = this.method_33120(var2, var8.method_3419());
            this.field_37135.put(var8.method_3416(), var9.method_3416());
         } catch (IllegalArgumentException | NullPointerException var10) {
            if (!this.field_37135.containsKey(var8.method_3416())) {
               class_3446.method_15886()
                  .method_34617()
                  .warning(
                     "Could not find new entity type for "
                        + var8
                        + "! Old type: "
                        + var8.getClass().getEnclosingClass().getSimpleName()
                        + ", new type: "
                        + var2.getEnclosingClass().getSimpleName()
                  );
            }
         }
      }
   }

   public class_754 method_33120(Class<class_754> var1, String var2) {
      for (class_754 var8 : (class_754[])var1.getEnumConstants()) {
         if (var8.method_3419().equals(var2)) {
            return var8;
         }
      }

      return null;
   }

   public void method_33118(class_754 var1, class_754 var2) {
      if (this.field_37135 == null) {
         this.field_37135 = new Int2IntOpenHashMap();
         this.field_37135.defaultReturnValue(-1);
      }

      this.field_37135.put(var1.method_3416(), var2.method_3416());
   }

   public class_857 method_33126() {
      return this.method_33122(null);
   }

   public class_857 method_33122(class_8039<List<class_5407>> var1) {
      return var2 -> {
         int var5 = var2.<Integer>method_23248(class_8039.field_41157, 0);
         int var6 = var2.<Integer>method_23248(class_8039.field_41157, 1);
         int var7 = this.method_33115(var6);
         if (var7 != var6) {
            var2.method_23257(class_8039.field_41157, 1, var7);
         }

         class_754 var8 = this.method_33127(var7);
         var2.method_23255().method_6746(this.field_37134).method_14878(var5, var8);
         if (var1 != null) {
            this.method_33131(var5, var2.<List<class_5407>>method_23248(var1, 0), var2.method_23255());
         }
      };
   }

   public class_857 method_33123(class_8039<List<class_5407>> var1, class_754 var2) {
      return var3 -> {
         int var6 = var3.<Integer>method_23248(class_8039.field_41157, 0);
         var3.method_23255().method_6746(this.field_37134).method_14878(var6, var2);
         if (var1 != null) {
            this.method_33131(var6, var3.<List<class_5407>>method_23248(var1, 0), var3.method_23255());
         }
      };
   }

   public class_857 method_33111() {
      return var1 -> {
         int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
         byte var5 = var1.<Byte>method_23248(class_8039.field_41133, 0);
         class_754 var6 = this.method_33114(var5);
         var1.method_23255().method_6746(this.field_37134).method_14878(var4, var6);
      };
   }

   public abstract class_754 method_33127(int var1);

   public class_754 method_33114(int var1) {
      return this.method_33127(var1);
   }

   public int method_33115(int var1) {
      return this.field_37135 == null ? var1 : this.field_37135.getOrDefault(var1, var1);
   }

   public abstract void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) throws Exception;

   @Nullable
   public class_5407 method_33117(int var1, List<class_5407> var2) {
      for (class_5407 var6 : var2) {
         if (var6.method_24602() == var1) {
            return var6;
         }
      }

      return null;
   }
}
