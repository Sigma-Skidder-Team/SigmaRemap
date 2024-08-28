package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Class9266 {
   private static String[] field42624;
   private final List<Class4843<?>> field42625;
   private final boolean field42626;
   private final Set<Class4843<?>> field42627 = Sets.newHashSet();
   private final Set<Class4843<?>> field42628 = Sets.newHashSet();
   private final Set<Class4843<?>> field42629 = Sets.newHashSet();

   public Class9266(List<Class4843<?>> var1) {
      this.field42625 = ImmutableList.copyOf(var1);
      if (var1.size() > 1) {
         this.field42626 = method34885(var1);
      } else {
         this.field42626 = true;
      }
   }

   private static boolean method34885(List<Class4843<?>> var0) {
      int var3 = var0.size();
      Class8848 var4 = ((Class4843)var0.get(0)).method14966();

      for (int var5 = 1; var5 < var3; var5++) {
         Class8848 var6 = ((Class4843)var0.get(var5)).method14966();
         if (!Class8848.method32130(var4, var6) || !Class8848.method32127(var4, var6)) {
            return false;
         }
      }

      return true;
   }

   public boolean method34886() {
      return !this.field42629.isEmpty();
   }

   public void method34887(Class6941 var1) {
      for (Class4843 var5 : this.field42625) {
         if (var1.method21360(var5)) {
            this.field42629.add(var5);
         }
      }
   }

   public void method34888(Class6207 var1, int var2, int var3, Class6941 var4) {
      for (Class4843 var8 : this.field42625) {
         boolean var9 = var8.method14960(var2, var3) && var4.method21360(var8);
         if (!var9) {
            this.field42628.remove(var8);
         } else {
            this.field42628.add(var8);
         }

         if (var9 && var1.method19123(var8, (IntList)null)) {
            this.field42627.add(var8);
         } else {
            this.field42627.remove(var8);
         }
      }
   }

   public boolean method34889(Class4843<?> var1) {
      return this.field42627.contains(var1);
   }

   public boolean method34890() {
      return !this.field42627.isEmpty();
   }

   public boolean method34891() {
      return !this.field42628.isEmpty();
   }

   public List<Class4843<?>> method34892() {
      return this.field42625;
   }

   public List<Class4843<?>> method34893(boolean var1) {
      ArrayList var4 = Lists.newArrayList();
      Set var5 = !var1 ? this.field42628 : this.field42627;

      for (Class4843 var7 : this.field42625) {
         if (var5.contains(var7)) {
            var4.add(var7);
         }
      }

      return var4;
   }

   public List<Class4843<?>> method34894(boolean var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Class4843 var6 : this.field42625) {
         if (this.field42628.contains(var6) && this.field42627.contains(var6) == var1) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public boolean method34895() {
      return this.field42626;
   }
}
