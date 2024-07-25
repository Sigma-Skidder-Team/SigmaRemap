package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TextComponentUtils;

public class class_4550 {
   private static String[] field_22181;
   private final int field_22174;
   private final boolean field_22184;
   private final boolean field_22182;
   private final Predicate<class_8145> field_22178;
   private final class_6115 field_22173;
   private final Function<class_1343, class_1343> field_22185;
   private final class_4092 field_22175;
   private final BiConsumer<class_1343, List<? extends class_8145>> field_22183;
   private final boolean field_22176;
   private final String field_22180;
   private final UUID field_22186;
   private final class_6629<?> field_22177;
   private final boolean field_22179;

   public class_4550(
      int var1,
      boolean var2,
      boolean var3,
      Predicate<class_8145> var4,
      class_6115 var5,
      Function<class_1343, class_1343> var6,
      class_4092 var7,
      BiConsumer<class_1343, List<? extends class_8145>> var8,
      boolean var9,
      String var10,
      UUID var11,
      class_6629<?> var12,
      boolean var13
   ) {
      this.field_22174 = var1;
      this.field_22184 = var2;
      this.field_22182 = var3;
      this.field_22178 = var4;
      this.field_22173 = var5;
      this.field_22185 = var6;
      this.field_22175 = var7;
      this.field_22183 = var8;
      this.field_22176 = var9;
      this.field_22180 = var10;
      this.field_22186 = var11;
      this.field_22177 = var12;
      this.field_22179 = var13;
   }

   public int method_21107() {
      return this.field_22174;
   }

   public boolean method_21109() {
      return this.field_22184;
   }

   public boolean method_21104() {
      return this.field_22176;
   }

   public boolean method_21108() {
      return this.field_22182;
   }

   private void method_21105(class_9155 var1) throws CommandSyntaxException {
      if (this.field_22179 && !var1.method_40314(2)) {
         throw class_5601.field_28407.create();
      }
   }

   public class_8145 method_21100(class_9155 var1) throws CommandSyntaxException {
      this.method_21105(var1);
      List var4 = this.method_21106(var1);
      if (!var4.isEmpty()) {
         if (var4.size() <= 1) {
            return (class_8145)var4.get(0);
         } else {
            throw class_5601.field_28402.create();
         }
      } else {
         throw class_5601.field_28399.create();
      }
   }

   public List<? extends class_8145> method_21106(class_9155 var1) throws CommandSyntaxException {
      this.method_21105(var1);
      if (!this.field_22184) {
         return this.method_21103(var1);
      } else if (this.field_22180 != null) {
         class_9359 var10 = var1.method_42177().method_1600().method_39993(this.field_22180);
         return (List<? extends class_8145>)(var10 != null ? Lists.newArrayList(new class_9359[]{var10}) : Collections.emptyList());
      } else if (this.field_22186 == null) {
         class_1343 var9 = this.field_22185.apply(var1.method_42192());
         Predicate var11 = this.method_21102(var9);
         if (!this.field_22176) {
            ArrayList var12 = Lists.newArrayList();
            if (!this.method_21108()) {
               for (class_6331 var8 : var1.method_42177().method_1719()) {
                  this.method_21112(var12, var8, var9, var11);
               }
            } else {
               this.method_21112(var12, var1.method_42198(), var9, var11);
            }

            return this.method_21113(var9, var12);
         } else {
            return (List<? extends class_8145>)(var1.method_42200() != null && var11.test(var1.method_42200())
               ? Lists.newArrayList(new class_8145[]{var1.method_42200()})
               : Collections.emptyList());
         }
      } else {
         for (class_6331 var5 : var1.method_42177().method_1719()) {
            class_8145 var6 = var5.method_28925(this.field_22186);
            if (var6 != null) {
               return Lists.newArrayList(new class_8145[]{var6});
            }
         }

         return Collections.emptyList();
      }
   }

   private void method_21112(List<class_8145> var1, class_6331 var2, class_1343 var3, Predicate<class_8145> var4) {
      if (this.field_22175 == null) {
         var1.addAll(var2.method_28926(this.field_22177, var4));
      } else {
         var1.addAll(var2.method_29583(this.field_22177, this.field_22175.method_18920(var3), var4));
      }
   }

   public class_9359 method_21110(class_9155 var1) throws CommandSyntaxException {
      this.method_21105(var1);
      List var4 = this.method_21103(var1);
      if (var4.size() == 1) {
         return (class_9359)var4.get(0);
      } else {
         throw class_5601.field_28403.create();
      }
   }

   public List<class_9359> method_21103(class_9155 var1) throws CommandSyntaxException {
      this.method_21105(var1);
      if (this.field_22180 != null) {
         class_9359 var10 = var1.method_42177().method_1600().method_39993(this.field_22180);
         return (List<class_9359>)(var10 != null ? Lists.newArrayList(new class_9359[]{var10}) : Collections.<class_9359>emptyList());
      } else if (this.field_22186 == null) {
         class_1343 var9 = this.field_22185.apply(var1.method_42192());
         Predicate var5 = this.method_21102(var9);
         if (this.field_22176) {
            if (var1.method_42200() instanceof class_9359) {
               class_9359 var11 = (class_9359)var1.method_42200();
               if (var5.test(var11)) {
                  return Lists.newArrayList(new class_9359[]{var11});
               }
            }

            return Collections.<class_9359>emptyList();
         } else {
            Object var6;
            if (!this.method_21108()) {
               var6 = Lists.newArrayList();

               for (class_9359 var8 : var1.method_42177().method_1600().method_39951()) {
                  if (var5.test(var8)) {
                     var6.add(var8);
                  }
               }
            } else {
               var6 = var1.method_42198().method_28990(var5::test);
            }

            return this.<class_9359>method_21113(var9, (List<class_9359>)var6);
         }
      } else {
         class_9359 var4 = var1.method_42177().method_1600().method_39982(this.field_22186);
         return (List<class_9359>)(var4 != null ? Lists.newArrayList(new class_9359[]{var4}) : Collections.<class_9359>emptyList());
      }
   }

   private Predicate<class_8145> method_21102(class_1343 var1) {
      Predicate var4 = this.field_22178;
      if (this.field_22175 != null) {
         class_4092 var5 = this.field_22175.method_18920(var1);
         var4 = var4.and(var1x -> var5.method_18909(var1x.method_37241()));
      }

      if (!this.field_22173.method_27852()) {
         var4 = var4.and(var2 -> this.field_22173.method_28087(var2.method_37274(var1)));
      }

      return var4;
   }

   private <T extends class_8145> List<T> method_21113(class_1343 var1, List<T> var2) {
      if (var2.size() > 1) {
         this.field_22183.accept(var1, var2);
      }

      return var2.subList(0, Math.min(this.field_22174, var2.size()));
   }

   public static IFormattableTextComponent method_21101(List<? extends class_8145> var0) {
      return TextComponentUtils.func_240649_b_(var0, class_8145::method_19839);
   }
}
