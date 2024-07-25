package remapped;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8151 extends class_4314 {
   private static final Logger field_41790 = LogManager.getLogger();
   public static final class_6162 field_41791 = class_3266.field_16180;
   public static final class_6720 field_41788 = class_6023.field_30715;

   public class_8151(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_41791, Direction.field_818).method_10308(field_41788, Boolean.valueOf(false)));
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      class_7454 var4 = new class_7454();
      var4.method_33932(this == class_4783.field_23601);
      return var4;
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      if (!var2.field_33055) {
         class_3757 var9 = var2.method_28260(var3);
         if (var9 instanceof class_7454) {
            class_7454 var10 = (class_7454)var9;
            boolean var11 = var2.method_29576(var3);
            boolean var12 = var10.method_33935();
            var10.method_33924(var11);
            if (!var12 && !var10.method_33926() && var10.method_33927() != class_9776.field_49629 && var11) {
               var10.method_33923();
               var2.method_43367().method_14011(var3, this, 1);
            }
         }
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      class_3757 var7 = var2.method_28260(var3);
      if (var7 instanceof class_7454) {
         class_7454 var8 = (class_7454)var7;
         class_8116 var9 = var8.method_33929();
         boolean var10 = !class_6660.method_30576(var9.method_36920());
         class_9776 var11 = var8.method_33927();
         boolean var12 = var8.method_33934();
         if (var11 != class_9776.field_49632) {
            if (var11 == class_9776.field_49631) {
               if (!var12) {
                  if (var8.method_33930()) {
                     var9.method_36925(0);
                  }
               } else {
                  this.method_37412(var1, var2, var3, var9, var10);
               }
            }
         } else {
            var8.method_33923();
            if (!var12) {
               if (var8.method_33930()) {
                  var9.method_36925(0);
               }
            } else {
               this.method_37412(var1, var2, var3, var9, var10);
            }

            if (var8.method_33935() || var8.method_33926()) {
               var2.method_28968().method_14011(var3, this, 1);
            }
         }

         var2.method_29523(var3, this);
      }
   }

   private void method_37412(class_2522 var1, World var2, BlockPos var3, class_8116 var4, boolean var5) {
      if (!var5) {
         var4.method_36925(0);
      } else {
         var4.method_36922(var2);
      }

      method_37413(var2, var3, var1.<Direction>method_10313(field_41791));
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      class_3757 var9 = var2.method_28260(var3);
      if (var9 instanceof class_7454 && var4.method_3184()) {
         var4.method_3193((class_7454)var9);
         return class_6910.method_31659(var2.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, BlockPos var3) {
      class_3757 var6 = var2.method_28260(var3);
      return !(var6 instanceof class_7454) ? 0 : ((class_7454)var6).method_33929().method_36926();
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, LivingEntity var4, ItemStack var5) {
      class_3757 var8 = var1.method_28260(var2);
      if (var8 instanceof class_7454) {
         class_7454 var9 = (class_7454)var8;
         class_8116 var10 = var9.method_33929();
         if (var5.method_28018()) {
            var10.method_36921(var5.method_28008());
         }

         if (!var1.field_33055) {
            if (var5.method_28021("BlockEntityTag") == null) {
               var10.method_36935(var1.method_29537().method_1285(class_291.field_1057));
               var9.method_33932(this == class_4783.field_23601);
            }

            if (var9.method_33927() == class_9776.field_49629) {
               boolean var11 = var1.method_29576(var2);
               var9.method_33924(var11);
            }
         }
      }
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_41791, var2.method_30489(var1.<Direction>method_10313(field_41791)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_41791)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_41791, field_41788);
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_41791, var1.method_1782().method_1046());
   }

   private static void method_37413(World var0, BlockPos var1, Direction var2) {
      class_2921 var5 = var1.method_6089();
      class_291 var6 = var0.method_29537();
      int var7 = var6.method_1295(class_291.field_1055);

      while (var7-- > 0) {
         var5.method_13368(var2);
         class_2522 var8 = var0.method_28262(var5);
         class_6414 var9 = var8.method_8360();
         if (!var8.method_8350(class_4783.field_23601)) {
            break;
         }

         class_3757 var10 = var0.method_28260(var5);
         if (!(var10 instanceof class_7454)) {
            break;
         }

         class_7454 var11 = (class_7454)var10;
         if (var11.method_33927() != class_9776.field_49629) {
            break;
         }

         if (var11.method_33935() || var11.method_33926()) {
            class_8116 var12 = var11.method_33929();
            if (!var11.method_33923()) {
               if (var11.method_33930()) {
                  var12.method_36925(0);
               }
            } else {
               if (!var12.method_36922(var0)) {
                  break;
               }

               var0.method_29523(var5, var9);
            }
         }

         var2 = var8.<Direction>method_10313(field_41791);
      }

      if (var7 <= 0) {
         int var13 = Math.max(var6.method_1295(class_291.field_1055), 0);
         field_41790.warn("Command Block chain tried to execute more than {} steps!", var13);
      }
   }
}
