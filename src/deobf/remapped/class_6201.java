package remapped;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_6201 extends class_2451 {
   /** @deprecated */
   private final class_6414 field_31703;

   public class_6201(class_6414 var1, class_317 var2) {
      super(var2);
      this.field_31703 = var1;
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      class_6910 var4 = this.method_28394(new class_353(var1));
      return !var4.method_31662() && this.method_11247()
         ? this.method_11231(var1.method_21862(), var1.method_21868(), var1.method_21860()).method_4204()
         : var4;
   }

   public class_6910 method_28394(class_353 var1) {
      if (!var1.method_1785()) {
         return class_6910.field_35517;
      } else {
         class_353 var4 = this.method_28395(var1);
         if (var4 != null) {
            class_2522 var5 = this.method_28385(var4);
            if (var5 == null) {
               return class_6910.field_35517;
            } else if (this.method_28389(var4, var5)) {
               class_1331 var6 = var4.method_21858();
               class_6486 var7 = var4.method_21862();
               class_704 var8 = var4.method_21868();
               class_6098 var9 = var4.method_21867();
               class_2522 var10 = var7.method_28262(var6);
               class_6414 var11 = var10.method_8360();
               if (var11 == var5.method_8360()) {
                  var10 = this.method_28386(var6, var7, var9, var10);
                  this.method_28391(var6, var7, var8, var9, var10);
                  var11.method_29257(var7, var6, var10, var8, var9);
                  if (var8 instanceof class_9359) {
                     class_8807.field_45052.method_10661((class_9359)var8, var6, var9);
                  }
               }

               class_4618 var12 = var10.method_8316();
               var7.method_43359(var8, var6, this.method_28393(var10), class_562.field_3322, (var12.method_21395() + 1.0F) / 2.0F, var12.method_21393() * 0.8F);
               if (var8 == null || !var8.field_3876.field_4944) {
                  var9.method_27970(1);
               }

               return class_6910.method_31659(var7.field_33055);
            } else {
               return class_6910.field_35517;
            }
         } else {
            return class_6910.field_35517;
         }
      }
   }

   public class_8461 method_28393(class_2522 var1) {
      return var1.method_8316().method_21391();
   }

   @Nullable
   public class_353 method_28395(class_353 var1) {
      return var1;
   }

   public boolean method_28391(class_1331 var1, class_6486 var2, class_704 var3, class_6098 var4, class_2522 var5) {
      return method_28388(var2, var3, var1, var4);
   }

   @Nullable
   public class_2522 method_28385(class_353 var1) {
      class_2522 var4 = this.method_28392().method_29302(var1);
      return var4 != null && this.method_28384(var1, var4) ? var4 : null;
   }

   private class_2522 method_28386(class_1331 var1, class_6486 var2, class_6098 var3, class_2522 var4) {
      class_2522 var7 = var4;
      class_5734 var8 = var3.method_27990();
      if (var8 != null) {
         class_5734 var9 = var8.method_25937("BlockStateTag");
         class_8021 var10 = var4.method_8360().method_29306();

         for (String var12 : var9.method_25952()) {
            class_5019 var13 = var10.method_36440(var12);
            if (var13 != null) {
               String var14 = var9.method_25929(var12).method_38710();
               var7 = method_28396(var7, var13, var14);
            }
         }
      }

      if (var7 != var4) {
         var2.method_7513(var1, var7, 2);
      }

      return var7;
   }

   private static <T extends Comparable<T>> class_2522 method_28396(class_2522 var0, class_5019<T> var1, String var2) {
      return var1.method_23108(var2).<class_2522>map(var2x -> var0.method_10308(var1, var2x)).orElse(var0);
   }

   public boolean method_28384(class_353 var1, class_2522 var2) {
      class_704 var5 = var1.method_21868();
      class_214 var6 = var5 != null ? class_214.method_926(var5) : class_214.method_928();
      return (!this.method_28390() || var2.method_8309(var1.method_21862(), var1.method_21858()))
         && var1.method_21862().method_6671(var2, var1.method_21858(), var6);
   }

   public boolean method_28390() {
      return true;
   }

   public boolean method_28389(class_353 var1, class_2522 var2) {
      return var1.method_21862().method_7513(var1.method_21858(), var2, 11);
   }

   public static boolean method_28388(class_6486 var0, class_704 var1, class_1331 var2, class_6098 var3) {
      class_341 var6 = var0.method_29522();
      if (var6 == null) {
         return false;
      } else {
         class_5734 var7 = var3.method_28021("BlockEntityTag");
         if (var7 != null) {
            class_3757 var8 = var0.method_28260(var2);
            if (var8 != null) {
               if (!var0.field_33055 && var8.method_17397() && (var1 == null || !var1.method_3184())) {
                  return false;
               }

               class_5734 var9 = var8.method_17396(new class_5734());
               class_5734 var10 = var9.method_25944();
               var9.method_25925(var7);
               var9.method_25931("x", var2.method_12173());
               var9.method_25931("y", var2.method_12165());
               var9.method_25931("z", var2.method_12185());
               if (!var9.equals(var10)) {
                  var8.method_17394(var0.method_28262(var2), var9);
                  var8.method_17407();
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public String method_11216() {
      return this.method_28392().method_29271();
   }

   @Override
   public void method_11239(class_8230 var1, class_2831<class_6098> var2) {
      if (this.method_11224(var1)) {
         this.method_28392().method_29268(var1, var2);
      }
   }

   @Override
   public void method_11218(class_6098 var1, class_6486 var2, List<ITextComponent> var3, class_4605 var4) {
      super.method_11218(var1, var2, var3, var4);
      this.method_28392().method_29272(var1, var2, var3, var4);
   }

   public class_6414 method_28392() {
      return this.field_31703;
   }

   public void method_28387(Map<class_6414, class_2451> var1, class_2451 var2) {
      var1.put(this.method_28392(), var2);
   }
}
