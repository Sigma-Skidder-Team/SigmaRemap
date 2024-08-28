package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class Class2007 implements Comparable<Class2007> {
   private static final Map<String, Class2007> field13063 = Maps.newHashMap();
   private static final Map<Class8115, Class2007> field13064 = Maps.newHashMap();
   private static final Set<String> field13065 = Sets.newHashSet();
   private static final Map<String, Integer> field13066 = Util.<Map<String, Integer>>method38508(Maps.newHashMap(), var0 -> {
      var0.put("key.categories.movement", 1);
      var0.put("key.categories.gameplay", 2);
      var0.put("key.categories.inventory", 3);
      var0.put("key.categories.creative", 4);
      var0.put("key.categories.multiplayer", 5);
      var0.put("key.categories.ui", 6);
      var0.put("key.categories.misc", 7);
   });
   private final String field13067;
   private final Class8115 field13068;
   private final String field13069;
   public Class8115 field13070;
   public boolean field13071;
   private int field13072;

   public static void method8504(Class8115 var0) {
      Class2007 var3 = field13064.get(var0);
      if (var3 != null) {
         var3.field13072++;
      }
   }

   public static void method8505(Class8115 var0, boolean var1) {
      Class2007 var4 = field13064.get(var0);
      if (var4 != null) {
         var4.method8524(var1);
      }
   }

   public static void method8506() {
      for (Class2007 var3 : field13063.values()) {
         if (var3.field13070.method28099() == Class1938.field12592 && var3.field13070.method28100() != Class9798.field45819.method28100()) {
            var3.method8524(Class9798.method38639(Minecraft.getInstance().method1580().method8039(), var3.field13070.method28100()));
         }
      }
   }

   public static void method8507() {
      for (Class2007 var3 : field13063.values()) {
         var3.method8512();
      }
   }

   public static void method8508() {
      field13064.clear();

      for (Class2007 var3 : field13063.values()) {
         field13064.put(var3.field13070, var3);
      }
   }

   public Class2007(String var1, int var2, String var3) {
      this(var1, Class1938.field12592, var2, var3);
   }

   public Class2007(String var1, Class1938 var2, int var3, String var4) {
      this.field13067 = var1;
      this.field13070 = var2.method8197(var3);
      this.field13068 = this.field13070;
      this.field13069 = var4;
      field13063.put(var1, this);
      field13064.put(this.field13070, this);
      field13065.add(var4);
   }

   public boolean method8509() {
      return this.field13071;
   }

   public String method8510() {
      return this.field13069;
   }

   public boolean method8511() {
      if (this.field13072 != 0) {
         this.field13072--;
         return true;
      } else {
         return false;
      }
   }

   private void method8512() {
      this.field13072 = 0;
      this.method8524(false);
   }

   public String method8513() {
      return this.field13067;
   }

   public Class8115 method8514() {
      return this.field13068;
   }

   public void method8515(Class8115 var1) {
      this.field13070 = var1;
   }

   public int compareTo(Class2007 var1) {
      return !this.field13069.equals(var1.field13069)
         ? field13066.get(this.field13069).compareTo(field13066.get(var1.field13069))
         : Class9088.method33883(this.field13067).compareTo(Class9088.method33883(var1.field13067));
   }

   public static Supplier<ITextComponent> method8516(String var0) {
      Class2007 var3 = field13063.get(var0);
      return var3 != null ? var3::method8521 : () -> new TranslationTextComponent(var0);
   }

   public boolean method8517(Class2007 var1) {
      return this.field13070.equals(var1.field13070);
   }

   public boolean method8518() {
      return this.field13070.equals(Class9798.field45819);
   }

   public boolean method8519(int var1, int var2) {
      return var1 != Class9798.field45819.method28100()
         ? this.field13070.method28099() == Class1938.field12592 && this.field13070.method28100() == var1
         : this.field13070.method28099() == Class1938.field12593 && this.field13070.method28100() == var2;
   }

   public boolean method8520(int var1) {
      return this.field13070.method28099() == Class1938.field12594 && this.field13070.method28100() == var1;
   }

   public ITextComponent method8521() {
      return this.field13070.method28102();
   }

   public boolean method8522() {
      return this.field13070.equals(this.field13068);
   }

   public String method8523() {
      return this.field13070.method28101();
   }

   public void method8524(boolean var1) {
      this.field13071 = var1;
   }
}
