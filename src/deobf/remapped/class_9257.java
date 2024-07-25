package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class class_9257 {
   private static String[] field_47243;
   private final String field_47245;
   private final Object2IntMap<class_4885> field_47246;
   private final class_4885[] field_47244;

   public class_9257(String var1, class_4885[] var2, Object2IntMap<class_4885> var3) {
      this.field_47245 = var1;
      this.field_47244 = var2;
      this.field_47246 = var3;
   }

   public List<class_8406> method_42652(class_8406 var1) throws CommandSyntaxException {
      List var4 = Collections.<class_8406>singletonList(var1);

      for (class_4885 var8 : this.field_47244) {
         var4 = var8.method_22413(var4);
         if (var4.isEmpty()) {
            throw this.method_42648(var8);
         }
      }

      return var4;
   }

   public int method_42654(class_8406 var1) {
      List var4 = Collections.<class_8406>singletonList(var1);

      for (class_4885 var8 : this.field_47244) {
         var4 = var8.method_22413(var4);
         if (var4.isEmpty()) {
            return 0;
         }
      }

      return var4.size();
   }

   private List<class_8406> method_42647(class_8406 var1) throws CommandSyntaxException {
      List var4 = Collections.<class_8406>singletonList(var1);

      for (int var5 = 0; var5 < this.field_47244.length - 1; var5++) {
         class_4885 var6 = this.field_47244[var5];
         int var7 = var5 + 1;
         var4 = var6.method_22414(var4, this.field_47244[var7]::method_22407);
         if (var4.isEmpty()) {
            throw this.method_42648(var6);
         }
      }

      return var4;
   }

   public List<class_8406> method_42651(class_8406 var1, Supplier<class_8406> var2) throws CommandSyntaxException {
      List var5 = this.method_42647(var1);
      class_4885 var6 = this.field_47244[this.field_47244.length - 1];
      return var6.method_22414(var5, var2);
   }

   private static int method_42650(List<class_8406> var0, Function<class_8406, Integer> var1) {
      return var0.stream().<Integer>map(var1).reduce(0, (var0x, var1x) -> var0x + var1x);
   }

   public int method_42653(class_8406 var1, Supplier<class_8406> var2) throws CommandSyntaxException {
      List var5 = this.method_42647(var1);
      class_4885 var6 = this.field_47244[this.field_47244.length - 1];
      return method_42650(var5, var2x -> var6.method_22412(var2x, var2));
   }

   public int method_42646(class_8406 var1) {
      List var4 = Collections.<class_8406>singletonList(var1);

      for (int var5 = 0; var5 < this.field_47244.length - 1; var5++) {
         var4 = this.field_47244[var5].method_22413(var4);
      }

      class_4885 var6 = this.field_47244[this.field_47244.length - 1];
      return method_42650(var4, var6::method_22410);
   }

   private CommandSyntaxException method_42648(class_4885 var1) {
      int var4 = this.field_47246.getInt(var1);
      return class_4235.field_20554.create(this.field_47245.substring(0, var4));
   }

   @Override
   public String toString() {
      return this.field_47245;
   }
}
