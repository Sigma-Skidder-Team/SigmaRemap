package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;

public class class_4736 extends class_2089 {
   private static final Identifier field_22950 = new Identifier("textures/gui/bars.png");
   private final MinecraftClient field_22948;
   private final Map<UUID, class_5607> field_22947 = Maps.newLinkedHashMap();

   public class_4736(MinecraftClient var1) {
      this.field_22948 = var1;
   }

   public void method_21875(class_7966 var1) {
      if (!this.field_22947.isEmpty()) {
         int var4 = this.field_22948.method_8552().method_43165();
         byte var5 = 12;

         for (class_5607 var7 : this.field_22947.values()) {
            int var8 = var4 / 2 - 91;
            class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
            this.field_22948.method_8577().method_35674(field_22950);
            this.method_21871(var1, var8, var5, var7);
            ITextComponent var9 = var7.method_43453();
            int var10 = this.field_22948.textRenderer.method_45379(var9);
            int var11 = var4 / 2 - var10 / 2;
            int var12 = var5 - 9;
            this.field_22948.textRenderer.method_45392(var1, var9, (float)var11, (float)var12, 16777215);
            var5 += 19;
            if (var5 >= this.field_22948.method_8552().method_43177() / 3) {
               break;
            }
         }
      }
   }

   private void method_21871(class_7966 var1, int var2, int var3, class_9394 var4) {
      this.method_9781(var1, var2, var3, 0, var4.method_43456().ordinal() * 5 * 2, 182, 5);
      if (var4.method_43462() != class_2976.field_14631) {
         this.method_9781(var1, var2, var3, 0, 80 + (var4.method_43462().ordinal() - 1) * 5 * 2, 182, 5);
      }

      int var7 = (int)(var4.method_43450() * 183.0F);
      if (var7 > 0) {
         this.method_9781(var1, var2, var3, 0, var4.method_43456().ordinal() * 5 * 2 + 5, var7, 5);
         if (var4.method_43462() != class_2976.field_14631) {
            this.method_9781(var1, var2, var3, 0, 80 + (var4.method_43462().ordinal() - 1) * 5 * 2 + 5, var7, 5);
         }
      }
   }

   public void method_21874(class_9889 var1) {
      if (var1.method_45557() != class_8891.field_45606) {
         if (var1.method_45557() != class_8891.field_45607) {
            if (this.field_22947.get(var1.method_45554()) != null) {
               this.field_22947.get(var1.method_45554()).method_25459(var1);
            }
         } else {
            this.field_22947.remove(var1.method_45554());
         }
      } else {
         this.field_22947.put(var1.method_45554(), new class_5607(var1));
      }
   }

   public void method_21873() {
      this.field_22947.clear();
   }

   public boolean method_21876() {
      if (!this.field_22947.isEmpty()) {
         for (class_9394 var4 : this.field_22947.values()) {
            if (var4.method_43464()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method_21872() {
      if (!this.field_22947.isEmpty()) {
         for (class_9394 var4 : this.field_22947.values()) {
            if (var4.method_43460()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method_21877() {
      if (!this.field_22947.isEmpty()) {
         for (class_9394 var4 : this.field_22947.values()) {
            if (var4.method_43455()) {
               return true;
            }
         }
      }

      return false;
   }
}
