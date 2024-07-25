package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class class_7735 {
   private static String[] field_39227;
   private final List<class_8932<?>> field_39226;
   private final boolean field_39223;
   private final Set<class_8932<?>> field_39222 = Sets.newHashSet();
   private final Set<class_8932<?>> field_39225 = Sets.newHashSet();
   private final Set<class_8932<?>> field_39224 = Sets.newHashSet();

   public class_7735(List<class_8932<?>> var1) {
      this.field_39226 = ImmutableList.copyOf(var1);
      if (var1.size() > 1) {
         this.field_39223 = method_35008(var1);
      } else {
         this.field_39223 = true;
      }
   }

   private static boolean method_35008(List<class_8932<?>> var0) {
      int var3 = var0.size();
      ItemStack var4 = ((class_8932)var0.get(0)).method_41044();

      for (int var5 = 1; var5 < var3; var5++) {
         ItemStack var6 = ((class_8932)var0.get(var5)).method_41044();
         if (!ItemStack.method_28019(var4, var6) || !ItemStack.method_27956(var4, var6)) {
            return false;
         }
      }

      return true;
   }

   public boolean method_35012() {
      return !this.field_39224.isEmpty();
   }

   public void method_35015(class_1147 var1) {
      for (class_8932 var5 : this.field_39226) {
         if (var1.method_5072(var5)) {
            this.field_39224.add(var5);
         }
      }
   }

   public void method_35009(class_534 var1, int var2, int var3, class_1147 var4) {
      for (class_8932 var8 : this.field_39226) {
         boolean var9 = var8.method_41047(var2, var3) && var4.method_5072(var8);
         if (!var9) {
            this.field_39225.remove(var8);
         } else {
            this.field_39225.add(var8);
         }

         if (var9 && var1.method_2613(var8, (IntList)null)) {
            this.field_39222.add(var8);
         } else {
            this.field_39222.remove(var8);
         }
      }
   }

   public boolean method_35014(class_8932<?> var1) {
      return this.field_39222.contains(var1);
   }

   public boolean method_35013() {
      return !this.field_39222.isEmpty();
   }

   public boolean method_35010() {
      return !this.field_39225.isEmpty();
   }

   public List<class_8932<?>> method_35016() {
      return this.field_39226;
   }

   public List<class_8932<?>> method_35017(boolean var1) {
      ArrayList var4 = Lists.newArrayList();
      Set var5 = !var1 ? this.field_39225 : this.field_39222;

      for (class_8932 var7 : this.field_39226) {
         if (var5.contains(var7)) {
            var4.add(var7);
         }
      }

      return var4;
   }

   public List<class_8932<?>> method_35011(boolean var1) {
      ArrayList var4 = Lists.newArrayList();

      for (class_8932 var6 : this.field_39226) {
         if (this.field_39225.contains(var6) && this.field_39222.contains(var6) == var1) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public boolean method_35006() {
      return this.field_39223;
   }
}
