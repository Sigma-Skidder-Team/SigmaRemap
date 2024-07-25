package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3071 extends class_1147 {
   private static final Logger field_15087 = LogManager.getLogger();

   public int method_14039(Collection<class_8932<?>> var1, class_9359 var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;

      for (class_8932 var8 : var1) {
         Identifier var9 = var8.method_41050();
         if (!this.field_6530.contains(var9) && !var8.method_41053()) {
            this.method_5083(var9);
            this.method_5077(var9);
            var5.add(var9);
            class_8807.field_45065.method_38806(var2, var8);
            var6++;
         }
      }

      this.method_14037(class_6265.field_32011, var2, var5);
      return var6;
   }

   public int method_14038(Collection<class_8932<?>> var1, class_9359 var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;

      for (class_8932 var8 : var1) {
         Identifier var9 = var8.method_41050();
         if (this.field_6530.contains(var9)) {
            this.method_5069(var9);
            var5.add(var9);
            var6++;
         }
      }

      this.method_14037(class_6265.field_32010, var2, var5);
      return var6;
   }

   private void method_14037(class_6265 var1, class_9359 var2, List<Identifier> var3) {
      var2.field_47794.method_4156(new class_6791(var1, var3, Collections.<Identifier>emptyList(), this.method_5074()));
   }

   public CompoundNBT method_14033() {
      CompoundNBT var3 = new CompoundNBT();
      this.method_5074().method_34309(var3);
      class_3416 var4 = new class_3416();

      for (Identifier var6 : this.field_6530) {
         var4.add(class_473.method_2261(var6.toString()));
      }

      var3.method_25946("recipes", var4);
      class_3416 var8 = new class_3416();

      for (Identifier var7 : this.field_6531) {
         var8.add(class_473.method_2261(var7.toString()));
      }

      var3.method_25946("toBeDisplayed", var8);
      return var3;
   }

   public void method_14034(CompoundNBT var1, class_5023 var2) {
      this.method_5080(class_7529.method_34304(var1));
      class_3416 var5 = var1.method_25927("recipes", 8);
      this.method_14036(var5, this::method_5084, var2);
      class_3416 var6 = var1.method_25927("toBeDisplayed", 8);
      this.method_14036(var6, this::method_5078, var2);
   }

   private void method_14036(class_3416 var1, Consumer<class_8932<?>> var2, class_5023 var3) {
      for (int var6 = 0; var6 < var1.size(); var6++) {
         String var7 = var1.method_15770(var6);

         try {
            Identifier var8 = new Identifier(var7);
            Optional var9 = var3.method_23139(var8);
            if (!var9.isPresent()) {
               field_15087.error("Tried to load unrecognized recipe: {} removed now.", var8);
            } else {
               var2.accept(var9.get());
            }
         } catch (class_7485 var10) {
            field_15087.error("Tried to load improperly formatted recipe: {} removed now.", var7);
         }
      }
   }

   public void method_14035(class_9359 var1) {
      var1.field_47794.method_4156(new class_6791(class_6265.field_32013, this.field_6530, this.field_6531, this.method_5074()));
   }
}
