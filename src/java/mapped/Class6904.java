package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class Class6904 {
   private final Class<? extends Class6036> field29901;
   public final Class6355 field29902;
   private Int2IntMap field29903;

   public Class6904(Class6355 var1, Class<? extends Class6036> var2) {
      this.field29902 = var1;
      this.field29901 = var2;
      var1.method19374(this);
   }

   public final void method21090(int var1, List<Class8656> var2, Class7161 var3) {
      Class1867 var6 = var3.method22438(this.field29901).method18668(var1);

      for (Class8656 var8 : new ArrayList<>(var2)) {
         try {
            this.method21088(var1, var6, var8, var2, var3);
         } catch (Exception var11) {
            var2.remove(var8);
            if (!Class8042.method27612().method21894() || Class8042.method27614().method34425()) {
               Logger var10 = Class8042.method27613().method27366();
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

   public void method21091(Class8600 var1) {
      Class8939 var4 = this.field29902.method19376().method18534();
      int var5 = var1.method30771();
      if (var5 == var4.method32667() || var5 == var4.method32668()) {
         Class9231 var7 = var1.method30773().get(0);
         var7.method34723(this.field29902.method19376().method18528(var7.<Integer>method34722()));
      } else if (var5 == var4.method32669()) {
         Class9231 var6 = var1.method30773().get(0);
         var6.method34723(this.field29902.method19376().method18530(var6.<Integer>method34722()));
      }

      var1.method30772(this.field29902.method19376().method18532(var5));
   }

   public void method21092(Class1913 var1) {
      this.field29902.method19360(var1, new Class3763(this));
   }

   public void method21093(Class1913 var1, Class1867 var2) {
      this.field29902.method19360(var1, new Class3859(this, var2));
   }

   public void method21094(Class1913 var1, Class1867 var2) {
      this.field29902.method19360(var1, new Class3884(this, var2));
   }

   public void method21095(Class1913 var1) {
      this.field29902.method19360(var1, new Class4006(this));
   }

   public void method21096(Class1913 var1, Class4750<List<Class8656>> var2, Class4750<List<Class8656>> var3) {
      this.field29902.method19360(var1, new Class3781(this, var2, var3));
   }

   public void method21097(Class1913 var1, Class4750<List<Class8656>> var2) {
      this.method21096(var1, null, var2);
   }

   public <T extends Enum<T>> void method21098(Class1867[] class1867Array, Class<T> clazz) {
      if (this.field29903 == null) {
         this.field29903 = new Int2IntOpenHashMap(class1867Array.length, 1.0f);
         this.field29903.defaultReturnValue(-1);
      }
      for (Class1867 class1867 : class1867Array) {
         try {
            Class1867 class18672 = this.method21099(((Class) clazz), class1867.method8124());
            this.field29903.put(class1867.method8121(), class18672.method8121());
         }
         catch (IllegalArgumentException | NullPointerException runtimeException) {
            if (this.field29903.containsKey(class1867.method8121())) continue;
            Class8042.method27613().method27366().warning("Could not find new entity type for " + class1867 + "! Old type: " + class1867.getClass().getEnclosingClass().getSimpleName() + ", new type: " + clazz.getEnclosingClass().getSimpleName());
         }
      }
   }

   public Class1867 method21099(Class<Class1867> var1, String var2) {
      for (Class1867 var8 : (Class1867[])var1.getEnumConstants()) {
         if (var8.method8124().equals(var2)) {
            return var8;
         }
      }

      return null;
   }

   public void method21100(Class1867 var1, Class1867 var2) {
      if (this.field29903 == null) {
         this.field29903 = new Int2IntOpenHashMap();
         this.field29903.defaultReturnValue(-1);
      }

      this.field29903.put(var1.method8121(), var2.method8121());
   }

   public Class2982 method21101() {
      return this.method21102(null);
   }

   public Class2982 method21102(Class4750<List<Class8656>> var1) {
      return var2 -> {
         int var5 = var2.<Integer>method30555(Class4750.field22544, 0);
         int var6 = var2.<Integer>method30555(Class4750.field22544, 1);
         int var7 = this.method21106(var6);
         if (var7 != var6) {
            var2.method30558(Class4750.field22544, 1, var7);
         }

         Class1867 var8 = this.method21089(var7);
         var2.method30580().method22438(this.field29901).method18666(var5, var8);
         if (var1 != null) {
            this.method21090(var5, var2.<List<Class8656>>method30555(var1, 0), var2.method30580());
         }
      };
   }

   public Class2982 method21103(Class4750<List<Class8656>> var1, Class1867 var2) {
      return var3 -> {
         int var6 = var3.<Integer>method30555(Class4750.field22544, 0);
         var3.method30580().method22438(this.field29901).method18666(var6, var2);
         if (var1 != null) {
            this.method21090(var6, var3.<List<Class8656>>method30555(var1, 0), var3.method30580());
         }
      };
   }

   public Class2982 method21104() {
      return var1 -> {
         int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
         byte var5 = var1.<Byte>method30555(Class4750.field22518, 0);
         Class1867 var6 = this.method21105(var5);
         var1.method30580().method22438(this.field29901).method18666(var4, var6);
      };
   }

   public abstract Class1867 method21089(int var1);

   public Class1867 method21105(int var1) {
      return this.method21089(var1);
   }

   public int method21106(int var1) {
      return this.field29903 == null ? var1 : this.field29903.getOrDefault(var1, var1);
   }

   public abstract void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) throws Exception;

   @Nullable
   public Class8656 method21107(int var1, List<Class8656> var2) {
      for (Class8656 var6 : var2) {
         if (var6.method31148() == var1) {
            return var6;
         }
      }

      return null;
   }

   // $VF: synthetic method
   public static Class method21111(Class6904 var0) {
      return var0.field29901;
   }
}
