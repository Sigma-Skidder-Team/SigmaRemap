package remapped;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8174 implements class_2274 {
   private static final Set<class_6414> field_41850 = Sets.newHashSet(
      new class_6414[]{
         class_4783.field_23365,
         class_4783.field_23579,
         class_4783.field_23764,
         class_4783.field_23876,
         class_4783.field_23189,
         class_4783.field_23197,
         class_4783.field_23442,
         class_4783.field_23912,
         class_4783.field_23732,
         class_4783.field_23270,
         class_4783.field_23241,
         class_4783.field_23199,
         class_4783.field_23882,
         class_4783.field_23171,
         class_4783.field_23537,
         class_4783.field_23780,
         class_4783.field_23539,
         class_4783.field_23493,
         class_4783.field_23467,
         class_4783.field_23386,
         class_4783.field_23756,
         class_4783.field_23268,
         class_4783.field_23273,
         class_4783.field_23490
      }
   );
   private static final ITextComponent field_41847 = new TranslationTextComponent("tutorial.find_tree.title");
   private static final ITextComponent field_41846 = new TranslationTextComponent("tutorial.find_tree.description");
   private final class_8827 field_41851;
   private class_2297 field_41849;
   private int field_41848;

   public class_8174(class_8827 var1) {
      this.field_41851 = var1;
   }

   public void 錌圭훔곻瀧쿨() {
      this.field_41848++;
      if (this.field_41851.method_40539() == class_4666.field_22764) {
         if (this.field_41848 == 1) {
            class_5989 var3 = this.field_41851.method_40530().field_9632;
            if (var3 != null) {
               for (class_6414 var5 : field_41850) {
                  if (var3.field_3853.method_32405(new class_6098(var5))) {
                     this.field_41851.method_40538(class_6240.field_31934);
                     return;
                  }
               }

               if (method_37476(var3)) {
                  this.field_41851.method_40538(class_6240.field_31934);
                  return;
               }
            }
         }

         if (this.field_41848 >= 6000 && this.field_41849 == null) {
            this.field_41849 = new class_2297(class_7856.field_39812, field_41847, field_41846, false);
            this.field_41851.method_40530().method_8519().method_42329(this.field_41849);
         }
      } else {
         this.field_41851.method_40538(class_6240.field_31929);
      }
   }

   public void 湗鏟퉧Ⱋ놣驋() {
      if (this.field_41849 != null) {
         this.field_41849.method_10566();
         this.field_41849 = null;
      }
   }

   public void Ꮤ釒掬㼜塱㨳(class_174 var1, class_7474 var2) {
      if (var2.method_33990() == class_1430.field_7717) {
         class_2522 var5 = var1.method_28262(((class_9529)var2).method_43955());
         if (field_41850.contains(var5.method_8360())) {
            this.field_41851.method_40538(class_6240.field_31932);
         }
      }
   }

   public void 샱瀳筕筕渺䎰(class_6098 var1) {
      for (class_6414 var5 : field_41850) {
         if (var1.method_27960() == var5.method_10803()) {
            this.field_41851.method_40538(class_6240.field_31934);
            return;
         }
      }
   }

   public static boolean method_37476(class_5989 var0) {
      for (class_6414 var4 : field_41850) {
         if (var0.method_27331().method_19276(class_6234.field_31905.method_43790(var4)) > 0) {
            return true;
         }
      }

      return false;
   }
}
