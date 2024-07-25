package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class class_4492 extends class_5920<class_7666> {
   private static String[] field_21964;
   private BlockPos field_21963;
   private long field_21961;
   private int field_21965;
   private final List<BlockPos> field_21962 = Lists.newArrayList();

   public class_4492() {
      super(
         ImmutableMap.of(
            class_6044.field_30874, class_561.field_3318, class_6044.field_30889, class_561.field_3318, class_6044.field_30887, class_561.field_3320
         )
      );
   }

   public boolean method_20880(class_6331 var1, class_7666 var2) {
      if (!var1.method_29537().method_1285(class_291.field_1047)) {
         return false;
      } else if (var2.method_15891().method_13910() != class_4466.field_21783) {
         return false;
      } else {
         class_2921 var5 = var2.method_37075().method_6089();
         this.field_21962.clear();

         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  var5.method_13361(var2.getPosX() + (double)var6, var2.method_37309() + (double)var7, var2.getPosZ() + (double)var8);
                  if (this.method_20879(var5, var1)) {
                     this.field_21962.add(new BlockPos(var5));
                  }
               }
            }
         }

         this.field_21963 = this.method_20877(var1);
         return this.field_21963 != null;
      }
   }

   @Nullable
   private BlockPos method_20877(class_6331 var1) {
      return !this.field_21962.isEmpty() ? this.field_21962.get(var1.method_43360().nextInt(this.field_21962.size())) : null;
   }

   private boolean method_20879(BlockPos var1, class_6331 var2) {
      class_2522 var5 = var2.method_28262(var1);
      class_6414 var6 = var5.method_8360();
      class_6414 var7 = var2.method_28262(var1.method_6100()).method_8360();
      return var6 instanceof class_8557 && ((class_8557)var6).method_39383(var5) || var5.method_8345() && var7 instanceof class_1653;
   }

   public void method_20875(class_6331 var1, class_7666 var2, long var3) {
      if (var3 > this.field_21961 && this.field_21963 != null) {
         var2.method_26525().method_5105(class_6044.field_30874, new class_2933(this.field_21963));
         var2.method_26525().method_5105(class_6044.field_30889, new class_6651(new class_2933(this.field_21963), 0.5F, 1));
      }
   }

   public void method_20876(class_6331 var1, class_7666 var2, long var3) {
      var2.method_26525().method_5127(class_6044.field_30874);
      var2.method_26525().method_5127(class_6044.field_30889);
      this.field_21965 = 0;
      this.field_21961 = var3 + 40L;
   }

   public void method_20874(class_6331 var1, class_7666 var2, long var3) {
      if (this.field_21963 == null || this.field_21963.method_12170(var2.method_37245(), 1.0)) {
         if (this.field_21963 != null && var3 > this.field_21961) {
            class_2522 var7 = var1.method_28262(this.field_21963);
            class_6414 var8 = var7.method_8360();
            class_6414 var9 = var1.method_28262(this.field_21963.method_6100()).method_8360();
            if (var8 instanceof class_8557 && ((class_8557)var8).method_39383(var7)) {
               var1.method_7511(this.field_21963, true, var2);
            }

            if (var7.method_8345() && var9 instanceof class_1653 && var2.method_34700()) {
               class_4657 var10 = var2.method_2017();

               for (int var11 = 0; var11 < var10.method_31505(); var11++) {
                  ItemStack var12 = var10.method_31498(var11);
                  boolean var13 = false;
                  if (!var12.method_28022()) {
                     if (var12.method_27960() != class_4897.field_24621) {
                        if (var12.method_27960() != class_4897.field_25273) {
                           if (var12.method_27960() != class_4897.field_25136) {
                              if (var12.method_27960() == class_4897.field_24883) {
                                 var1.method_7513(this.field_21963, class_4783.field_23310.method_29260(), 3);
                                 var13 = true;
                              }
                           } else {
                              var1.method_7513(this.field_21963, class_4783.field_23327.method_29260(), 3);
                              var13 = true;
                           }
                        } else {
                           var1.method_7513(this.field_21963, class_4783.field_23638.method_29260(), 3);
                           var13 = true;
                        }
                     } else {
                        var1.method_7513(this.field_21963, class_4783.field_23362.method_29260(), 3);
                        var13 = true;
                     }
                  }

                  if (var13) {
                     var1.method_29528(
                        (class_704)null,
                        (double)this.field_21963.method_12173(),
                        (double)this.field_21963.method_12165(),
                        (double)this.field_21963.method_12185(),
                        class_463.field_2518,
                        class_562.field_3322,
                        1.0F,
                        1.0F
                     );
                     var12.method_27970(1);
                     if (var12.method_28022()) {
                        var10.method_31503(var11, ItemStack.EMPTY);
                     }
                     break;
                  }
               }
            }

            if (var8 instanceof class_8557 && !((class_8557)var8).method_39383(var7)) {
               this.field_21962.remove(this.field_21963);
               this.field_21963 = this.method_20877(var1);
               if (this.field_21963 != null) {
                  this.field_21961 = var3 + 20L;
                  var2.method_26525().method_5105(class_6044.field_30889, new class_6651(new class_2933(this.field_21963), 0.5F, 1));
                  var2.method_26525().method_5105(class_6044.field_30874, new class_2933(this.field_21963));
               }
            }
         }

         this.field_21965++;
      }
   }

   public boolean method_20878(class_6331 var1, class_7666 var2, long var3) {
      return this.field_21965 < 200;
   }
}
