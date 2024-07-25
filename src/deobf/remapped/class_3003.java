package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class class_3003 extends class_2451 {
   private static final Map<class_6629<?>, class_3003> field_14733 = Maps.newIdentityHashMap();
   private final int field_14734;
   private final int field_14736;
   private final class_6629<?> field_14737;

   public class_3003(class_6629<?> var1, int var2, int var3, class_317 var4) {
      super(var4);
      this.field_14737 = var1;
      this.field_14734 = var2;
      this.field_14736 = var3;
      field_14733.put(var1, this);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      if (!(var4 instanceof class_6331)) {
         return class_6910.field_35520;
      } else {
         ItemStack var5 = var1.method_21867();
         BlockPos var6 = var1.method_21858();
         Direction var7 = var1.method_21857();
         class_2522 var8 = var4.method_28262(var6);
         if (var8.method_8350(class_4783.field_23617)) {
            class_3757 var9 = var4.method_28260(var6);
            if (var9 instanceof class_1896) {
               class_3521 var13 = ((class_1896)var9).method_8621();
               class_6629 var11 = this.method_13719(var5.method_27990());
               var13.method_16253(var11);
               var9.method_17407();
               var4.method_29572(var6, var8, var8, 3);
               var5.method_27970(1);
               return class_6910.field_35518;
            }
         }

         BlockPos var12;
         if (!var8.method_8324(var4, var6).method_19485()) {
            var12 = var6.method_6098(var7);
         } else {
            var12 = var6;
         }

         class_6629 var10 = this.method_13719(var5.method_27990());
         if (var10.method_30479(
               (class_6331)var4, var5, var1.method_21868(), var12, class_2417.field_12030, true, !Objects.equals(var6, var12) && var7 == Direction.field_817
            )
            != null) {
            var5.method_27970(1);
         }

         return class_6910.field_35518;
      }
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      class_9529 var7 = method_11238(var1, var2, class_9583.field_48749);
      if (var7.method_33990() == class_1430.field_7717) {
         if (var1 instanceof class_6331) {
            class_9529 var8 = var7;
            BlockPos var9 = var8.method_43955();
            if (var1.method_28262(var9).method_8360() instanceof class_7855) {
               if (var1.method_29538(var2, var9) && var2.method_3208(var9, var8.method_43956(), var6)) {
                  class_6629 var10 = this.method_13719(var6.method_27990());
                  if (var10.method_30479((class_6331)var1, var6, var2, var9, class_2417.field_12030, false, false) != null) {
                     if (!var2.playerAbilities.isCreativeMode) {
                        var6.method_27970(1);
                     }

                     var2.method_3211(class_6234.field_31907.method_43790(this));
                     return class_954.<ItemStack>method_4206(var6);
                  } else {
                     return class_954.<ItemStack>method_4207(var6);
                  }
               } else {
                  return class_954.<ItemStack>method_4202(var6);
               }
            } else {
               return class_954.<ItemStack>method_4207(var6);
            }
         } else {
            return class_954.<ItemStack>method_4205(var6);
         }
      } else {
         return class_954.<ItemStack>method_4207(var6);
      }
   }

   public boolean method_13717(CompoundNBT var1, class_6629<?> var2) {
      return Objects.equals(this.method_13719(var1), var2);
   }

   public int method_13718(int var1) {
      return var1 != 0 ? this.field_14736 : this.field_14734;
   }

   @Nullable
   public static class_3003 method_13715(class_6629<?> var0) {
      return field_14733.get(var0);
   }

   public static Iterable<class_3003> method_13716() {
      return Iterables.unmodifiableIterable(field_14733.values());
   }

   public class_6629<?> method_13719(CompoundNBT var1) {
      if (var1 != null && var1.contains("EntityTag", 10)) {
         CompoundNBT var4 = var1.getCompound("EntityTag");
         if (var4.contains("id", 8)) {
            return class_6629.method_30460(var4.method_25965("id")).orElse(this.field_14737);
         }
      }

      return this.field_14737;
   }

   public Optional<class_5886> method_13714(
      class_704 var1, class_5886 var2, class_6629<? extends class_5886> var3, class_6331 var4, class_1343 var5, ItemStack var6
   ) {
      if (this.method_13717(var6.method_27990(), var3)) {
         Object var9;
         if (!(var2 instanceof class_1899)) {
            var9 = (class_5886)var3.method_30484(var4);
         } else {
            var9 = ((class_1899)var2).method_8638(var4, (class_1899)var2);
         }

         if (var9 != null) {
            ((class_5886)var9).method_26910(true);
            if (((class_5886)var9).method_26449()) {
               ((class_5886)var9).method_37144(var5.method_61(), var5.method_60(), var5.method_62(), 0.0F, 0.0F);
               var4.method_7065((Entity)var9);
               if (var6.method_28018()) {
                  ((class_5886)var9).method_37303(var6.method_28008());
               }

               if (!var1.playerAbilities.isCreativeMode) {
                  var6.method_27970(1);
               }

               return Optional.<class_5886>of((class_5886)var9);
            } else {
               return Optional.<class_5886>empty();
            }
         } else {
            return Optional.<class_5886>empty();
         }
      } else {
         return Optional.<class_5886>empty();
      }
   }
}
