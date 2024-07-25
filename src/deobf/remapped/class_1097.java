package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public class class_1097 {
   private final Map<String, class_4399> field_6058 = Maps.newHashMap();
   private final Map<class_6810, List<class_4399>> field_6054 = Maps.newHashMap();
   private final Map<String, Map<class_4399, class_8274>> field_6061 = Maps.newHashMap();
   private final class_4399[] field_6057 = new class_4399[19];
   private final Map<String, class_3903> field_6060 = Maps.newHashMap();
   private final Map<String, class_3903> field_6055 = Maps.newHashMap();
   private static String[] field_6059;

   public boolean method_4853(String var1) {
      return this.field_6058.containsKey(var1);
   }

   public class_4399 method_4849(String var1) {
      return this.field_6058.get(var1);
   }

   @Nullable
   public class_4399 method_4858(String var1) {
      return this.field_6058.get(var1);
   }

   public class_4399 method_4830(String var1, class_6810 var2, ITextComponent var3, class_8792 var4) {
      if (var1.length() <= 16) {
         if (!this.field_6058.containsKey(var1)) {
            class_4399 var7 = new class_4399(this, var1, var2, var3, var4);
            this.field_6054.computeIfAbsent(var2, var0 -> Lists.newArrayList()).add(var7);
            this.field_6058.put(var1, var7);
            this.method_4864(var7);
            return var7;
         } else {
            throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
         }
      } else {
         throw new IllegalArgumentException("The objective name '" + var1 + "' is too long!");
      }
   }

   public final void method_4851(class_6810 var1, String var2, Consumer<class_8274> var3) {
      this.field_6054.getOrDefault(var1, Collections.<class_4399>emptyList()).forEach(var3x -> var3.accept(this.method_4855(var2, var3x)));
   }

   public boolean method_4857(String var1, class_4399 var2) {
      Map var5 = this.field_6061.get(var1);
      if (var5 != null) {
         class_8274 var6 = (class_8274)var5.get(var2);
         return var6 != null;
      } else {
         return false;
      }
   }

   public class_8274 method_4855(String var1, class_4399 var2) {
      if (var1.length() <= 40) {
         Map var5 = this.field_6061.computeIfAbsent(var1, var0 -> Maps.newHashMap());
         return var5.computeIfAbsent(var2, var2x -> {
            class_8274 var5x = new class_8274(this, var2x, var1);
            var5x.method_38140(0);
            return var5x;
         });
      } else {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      }
   }

   public Collection<class_8274> method_4863(class_4399 var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Map var6 : this.field_6061.values()) {
         class_8274 var7 = (class_8274)var6.get(var1);
         if (var7 != null) {
            var4.add(var7);
         }
      }

      var4.sort(class_8274.field_42431);
      return var4;
   }

   public Collection<class_4399> method_4836() {
      return this.field_6058.values();
   }

   public Collection<String> method_4832() {
      return this.field_6058.keySet();
   }

   public Collection<String> method_4859() {
      return Lists.newArrayList(this.field_6061.keySet());
   }

   public void method_4869(String var1, class_4399 var2) {
      if (var2 != null) {
         Map var5 = this.field_6061.get(var1);
         if (var5 != null) {
            class_8274 var6 = (class_8274)var5.remove(var2);
            if (var5.size() >= 1) {
               if (var6 != null) {
                  this.method_4839(var1, var2);
               }
            } else {
               Map var7 = this.field_6061.remove(var1);
               if (var7 != null) {
                  this.method_4838(var1);
               }
            }
         }
      } else {
         Map var8 = this.field_6061.remove(var1);
         if (var8 != null) {
            this.method_4838(var1);
         }
      }
   }

   public Map<class_4399, class_8274> method_4870(String var1) {
      Object var4 = this.field_6061.get(var1);
      if (var4 == null) {
         var4 = Maps.newHashMap();
      }

      return (Map<class_4399, class_8274>)var4;
   }

   public void method_4834(class_4399 var1) {
      this.field_6058.remove(var1.method_20490());

      for (int var4 = 0; var4 < 19; var4++) {
         if (this.method_4833(var4) == var1) {
            this.method_4831(var4, (class_4399)null);
         }
      }

      List var7 = this.field_6054.get(var1.method_20491());
      if (var7 != null) {
         var7.remove(var1);
      }

      for (Map var6 : this.field_6061.values()) {
         var6.remove(var1);
      }

      this.method_4844(var1);
   }

   public void method_4831(int var1, class_4399 var2) {
      this.field_6057[var1] = var2;
   }

   @Nullable
   public class_4399 method_4833(int var1) {
      return this.field_6057[var1];
   }

   public class_3903 method_4850(String var1) {
      return this.field_6060.get(var1);
   }

   public class_3903 method_4865(String var1) {
      if (var1.length() <= 16) {
         class_3903 var4 = this.method_4850(var1);
         if (var4 == null) {
            var4 = new class_3903(this, var1);
            this.field_6060.put(var1, var4);
            this.method_4846(var4);
            return var4;
         } else {
            throw new IllegalArgumentException("A team with the name '" + var1 + "' already exists!");
         }
      } else {
         throw new IllegalArgumentException("The team name '" + var1 + "' is too long!");
      }
   }

   public void method_4835(class_3903 var1) {
      this.field_6060.remove(var1.method_23383());

      for (String var5 : var1.method_23378()) {
         this.field_6055.remove(var5);
      }

      this.method_4840(var1);
   }

   public boolean method_4842(String var1, class_3903 var2) {
      if (var1.length() <= 40) {
         if (this.method_4848(var1) != null) {
            this.method_4861(var1);
         }

         this.field_6055.put(var1, var2);
         return var2.method_23378().add(var1);
      } else {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      }
   }

   public boolean method_4861(String var1) {
      class_3903 var4 = this.method_4848(var1);
      if (var4 == null) {
         return false;
      } else {
         this.method_4860(var1, var4);
         return true;
      }
   }

   public void method_4860(String var1, class_3903 var2) {
      if (this.method_4848(var1) == var2) {
         this.field_6055.remove(var1);
         var2.method_23378().remove(var1);
      } else {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + var2.method_23383() + "'.");
      }
   }

   public Collection<String> method_4854() {
      return this.field_6060.keySet();
   }

   public Collection<class_3903> method_4841() {
      return this.field_6060.values();
   }

   @Nullable
   public class_3903 method_4848(String var1) {
      return this.field_6055.get(var1);
   }

   public void method_4864(class_4399 var1) {
   }

   public void method_4845(class_4399 var1) {
   }

   public void method_4844(class_4399 var1) {
   }

   public void method_4868(class_8274 var1) {
   }

   public void method_4838(String var1) {
   }

   public void method_4839(String var1, class_4399 var2) {
   }

   public void method_4846(class_3903 var1) {
   }

   public void method_4862(class_3903 var1) {
   }

   public void method_4840(class_3903 var1) {
   }

   public static String method_4847(int var0) {
      switch (var0) {
         case 0:
            return "list";
         case 1:
            return "sidebar";
         case 2:
            return "belowName";
         default:
            if (var0 >= 3 && var0 <= 18) {
               TextFormatting var3 = TextFormatting.fromColorIndex(var0 - 3);
               if (var3 != null && var3 != TextFormatting.RESET) {
                  return "sidebar.team." + var3.getFriendlyName();
               }
            }

            return null;
      }
   }

   public static int method_4843(String var0) {
      if (!"list".equalsIgnoreCase(var0)) {
         if (!"sidebar".equalsIgnoreCase(var0)) {
            if (!"belowName".equalsIgnoreCase(var0)) {
               if (var0.startsWith("sidebar.team.")) {
                  String var3 = var0.substring("sidebar.team.".length());
                  TextFormatting var4 = TextFormatting.getValueByName(var3);
                  if (var4 != null && var4.getColorIndex() >= 0) {
                     return var4.getColorIndex() + 3;
                  }
               }

               return -1;
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public static String[] method_4867() {
      if (field_6059 == null) {
         field_6059 = new String[19];

         for (int var2 = 0; var2 < 19; var2++) {
            field_6059[var2] = method_4847(var2);
         }
      }

      return field_6059;
   }

   public void method_4866(Entity var1) {
      if (var1 != null && !(var1 instanceof PlayerEntity) && !var1.isAlive()) {
         String var4 = var1.method_37225();
         this.method_4869(var4, (class_4399)null);
         this.method_4861(var4);
      }
   }

   public class_3416 method_4837() {
      class_3416 var3 = new class_3416();
      this.field_6061
         .values()
         .stream()
         .<Collection>map(Map::values)
         .forEach(var1 -> var1.stream().filter(var0x -> var0x.method_38149() != null).forEach(var1x -> {
               CompoundNBT var4 = new CompoundNBT();
               var4.method_25941("Name", var1x.method_38147());
               var4.method_25941("Objective", var1x.method_38149().method_20490());
               var4.method_25931("Score", var1x.method_38146());
               var4.putBoolean("Locked", var1x.method_38148());
               var3.add(var4);
            }));
      return var3;
   }

   public void method_4856(class_3416 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method_15764(var4);
         class_4399 var6 = this.method_4849(var5.method_25965("Objective"));
         String var7 = var5.method_25965("Name");
         if (var7.length() > 40) {
            var7 = var7.substring(0, 40);
         }

         class_8274 var8 = this.method_4855(var7, var6);
         var8.method_38140(var5.method_25947("Score"));
         if (var5.method_25938("Locked")) {
            var8.method_38141(var5.getBoolean("Locked"));
         }
      }
   }
}
