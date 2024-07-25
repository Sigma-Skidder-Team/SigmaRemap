package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class class_1626 {
   private static final class_4639 field_8472 = new class_4639("tick");
   private static final class_4639 field_8471 = new class_4639("load");
   private final class_341 field_8466;
   private boolean field_8468;
   private final ArrayDeque<class_1446> field_8465 = new ArrayDeque<class_1446>();
   private final List<class_1446> field_8464 = Lists.newArrayList();
   private final List<class_2581> field_8473 = Lists.newArrayList();
   private boolean field_8467;
   private class_8229 field_8469;

   public class_1626(class_341 var1, class_8229 var2) {
      this.field_8466 = var1;
      this.field_8469 = var2;
      this.method_7256(var2);
   }

   public int method_7250() {
      return this.field_8466.method_1683().method_1295(class_291.field_1055);
   }

   public CommandDispatcher<class_9155> method_7254() {
      return this.field_8466.method_1631().method_2229();
   }

   public void method_7255() {
      this.method_7245(this.field_8473, field_8472);
      if (this.field_8467) {
         this.field_8467 = false;
         List var3 = this.field_8469.method_37682().method_43145(field_8471).method_10608();
         this.method_7245(var3, field_8471);
      }
   }

   private void method_7245(Collection<class_2581> var1, class_4639 var2) {
      this.field_8466.method_1704().method_16057(var2::toString);

      for (class_2581 var6 : var1) {
         this.method_7251(var6, this.method_7248());
      }

      this.field_8466.method_1704().method_16054();
   }

   public int method_7251(class_2581 var1, class_9155 var2) {
      int var5 = this.method_7250();
      if (this.field_8468) {
         if (this.field_8465.size() + this.field_8464.size() < var5) {
            this.field_8464.add(new class_1446(this, var2, new class_3834(var1)));
         }

         return 0;
      } else {
         int var18;
         try {
            this.field_8468 = true;
            int var6 = 0;
            class_3315[] var7 = var1.method_11748();

            for (int var8 = var7.length - 1; var8 >= 0; var8--) {
               this.field_8465.push(new class_1446(this, var2, var7[var8]));
            }

            do {
               if (this.field_8465.isEmpty()) {
                  return var6;
               }

               try {
                  class_1446 var17 = this.field_8465.removeFirst();
                  this.field_8466.method_1704().method_16057(var17::toString);
                  var17.method_6626(this.field_8465, var5);
                  if (!this.field_8464.isEmpty()) {
                     Lists.reverse(this.field_8464).forEach(this.field_8465::addFirst);
                     this.field_8464.clear();
                  }
               } finally {
                  this.field_8466.method_1704().method_16054();
               }
            } while (++var6 < var5);

            var18 = var6;
         } finally {
            this.field_8465.clear();
            this.field_8464.clear();
            this.field_8468 = false;
         }

         return var18;
      }
   }

   public void method_7246(class_8229 var1) {
      this.field_8469 = var1;
      this.method_7256(var1);
   }

   private void method_7256(class_8229 var1) {
      this.field_8473.clear();
      this.field_8473.addAll(var1.method_37682().method_43145(field_8472).method_10608());
      this.field_8467 = true;
   }

   public class_9155 method_7248() {
      return this.field_8466.method_1730().method_42194(2).method_42185();
   }

   public Optional<class_2581> method_7252(class_4639 var1) {
      return this.field_8469.method_37679(var1);
   }

   public class_2307<class_2581> method_7249(class_4639 var1) {
      return this.field_8469.method_37680(var1);
   }

   public Iterable<class_4639> method_7247() {
      return this.field_8469.method_37681().keySet();
   }

   public Iterable<class_4639> method_7244() {
      return this.field_8469.method_37682().method_43141();
   }
}
