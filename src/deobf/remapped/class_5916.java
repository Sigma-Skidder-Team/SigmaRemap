package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5916 implements Comparable<class_5916> {
   private static final Map<String, class_5916> field_30026 = Maps.newHashMap();
   private static final Map<class_3654, class_5916> field_30019 = Maps.newHashMap();
   private static final Set<String> field_30023 = Sets.newHashSet();
   private static final Map<String, Integer> field_30022 = class_9665.<Map<String, Integer>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put("key.categories.movement", 1);
      var0.put("key.categories.gameplay", 2);
      var0.put("key.categories.inventory", 3);
      var0.put("key.categories.creative", 4);
      var0.put("key.categories.multiplayer", 5);
      var0.put("key.categories.ui", 6);
      var0.put("key.categories.misc", 7);
   });
   private final String field_30021;
   private final class_3654 field_30029;
   private final String field_30020;
   public class_3654 field_30027;
   public boolean field_30024;
   private int field_30028;

   public static void method_27059(class_3654 var0) {
      class_5916 var3 = field_30019.get(var0);
      if (var3 != null) {
         var3.field_30028++;
      }
   }

   public static void method_27072(class_3654 var0, boolean var1) {
      class_5916 var4 = field_30019.get(var0);
      if (var4 != null) {
         var4.method_27056(var1);
      }
   }

   public static void method_27065() {
      for (class_5916 var3 : field_30026.values()) {
         if (var3.field_30027.method_16990() == class_8863.field_45319 && var3.field_30027.method_16988() != class_9732.field_49455.method_16988()) {
            var3.method_27056(class_9732.method_44934(MinecraftClient.getInstance().method_8552().method_43181(), var3.field_30027.method_16988()));
         }
      }
   }

   public static void method_27064() {
      for (class_5916 var3 : field_30026.values()) {
         var3.method_27063();
      }
   }

   public static void method_27067() {
      field_30019.clear();

      for (class_5916 var3 : field_30026.values()) {
         field_30019.put(var3.field_30027, var3);
      }
   }

   public class_5916(String var1, int var2, String var3) {
      this(var1, class_8863.field_45319, var2, var3);
   }

   public class_5916(String var1, class_8863 var2, int var3, String var4) {
      this.field_30021 = var1;
      this.field_30027 = var2.method_40758(var3);
      this.field_30029 = this.field_30027;
      this.field_30020 = var4;
      field_30026.put(var1, this);
      field_30019.put(this.field_30027, this);
      field_30023.add(var4);
   }

   public boolean method_27060() {
      return this.field_30024;
   }

   public String method_27054() {
      return this.field_30020;
   }

   public boolean method_27074() {
      if (this.field_30028 != 0) {
         this.field_30028--;
         return true;
      } else {
         return false;
      }
   }

   private void method_27063() {
      this.field_30028 = 0;
      this.method_27056(false);
   }

   public String method_27055() {
      return this.field_30021;
   }

   public class_3654 method_27053() {
      return this.field_30029;
   }

   public void method_27057(class_3654 var1) {
      this.field_30027 = var1;
   }

   public int compareTo(class_5916 var1) {
      return !this.field_30020.equals(var1.field_30020)
         ? field_30022.get(this.field_30020).compareTo(field_30022.get(var1.field_30020))
         : class_6956.method_31803(this.field_30021).compareTo(class_6956.method_31803(var1.field_30021));
   }

   public static Supplier<ITextComponent> method_27071(String var0) {
      class_5916 var3 = field_30026.get(var0);
      return var3 != null ? var3::method_27061 : () -> new TranslationTextComponent(var0);
   }

   public boolean method_27058(class_5916 var1) {
      return this.field_30027.equals(var1.field_30027);
   }

   public boolean method_27073() {
      return this.field_30027.equals(class_9732.field_49455);
   }

   public boolean method_27062(int var1, int var2) {
      return var1 != class_9732.field_49455.method_16988()
         ? this.field_30027.method_16990() == class_8863.field_45319 && this.field_30027.method_16988() == var1
         : this.field_30027.method_16990() == class_8863.field_45315 && this.field_30027.method_16988() == var2;
   }

   public boolean method_27070(int var1) {
      return this.field_30027.method_16990() == class_8863.field_45320 && this.field_30027.method_16988() == var1;
   }

   public ITextComponent method_27061() {
      return this.field_30027.method_16989();
   }

   public boolean method_27066() {
      return this.field_30027.equals(this.field_30029);
   }

   public String method_27069() {
      return this.field_30027.method_16985();
   }

   public void method_27056(boolean var1) {
      this.field_30024 = var1;
   }
}
