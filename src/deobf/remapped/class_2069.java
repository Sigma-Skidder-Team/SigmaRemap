package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2069 extends class_7114 {
   private static final Identifier field_10438 = new Identifier("textures/gui/recipe_book.png");
   private static final ITextComponent field_10441 = new TranslationTextComponent("gui.recipebook.moreRecipes");
   private class_3954<?> field_10434;
   private class_1147 field_10435;
   private class_7735 field_10433;
   private float field_10440;
   private float field_10439;
   private int field_10436;

   public class_2069() {
      super(0, 0, 25, 25, StringTextComponent.EMPTY);
   }

   public void method_9666(class_7735 var1, class_65 var2) {
      this.field_10433 = var1;
      this.field_10434 = (class_3954<?>)var2.method_48().field_9632.field_3874;
      this.field_10435 = var2.method_59();
      List var5 = var1.method_35017(this.field_10435.method_5079(this.field_10434));

      for (class_8932 var7 : var5) {
         if (this.field_10435.method_5081(var7)) {
            var2.method_56(var5);
            this.field_10439 = 15.0F;
            break;
         }
      }
   }

   public class_7735 method_9663() {
      return this.field_10433;
   }

   public void method_9668(int var1, int var2) {
      this.field_36670 = var1;
      this.field_36674 = var2;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      if (!class_266.method_1185()) {
         this.field_10440 += var4;
      }

      MinecraftClient var7 = MinecraftClient.getInstance();
      var7.method_8577().method_35674(field_10438);
      byte var8 = 29;
      if (!this.field_10433.method_35013()) {
         var8 += 25;
      }

      short var9 = 206;
      if (this.field_10433.method_35017(this.field_10435.method_5079(this.field_10434)).size() > 1) {
         var9 += 25;
      }

      boolean var10 = this.field_10439 > 0.0F;
      if (var10) {
         float var11 = 1.0F + 0.1F * (float)Math.sin((double)(this.field_10439 / 15.0F * (float) Math.PI));
         class_3542.method_16438();
         class_3542.method_16413((float)(this.field_36670 + 8), (float)(this.field_36674 + 12), 0.0F);
         class_3542.method_16403(var11, var11, 1.0F);
         class_3542.method_16413((float)(-(this.field_36670 + 8)), (float)(-(this.field_36674 + 12)), 0.0F);
         this.field_10439 -= var4;
      }

      this.method_9781(var1, this.field_36670, this.field_36674, var8, var9, this.field_36671, this.field_36681);
      List var14 = this.method_9664();
      this.field_10436 = class_9299.method_42848(this.field_10440 / 30.0F) % var14.size();
      class_6098 var12 = ((class_8932)var14.get(this.field_10436)).method_41044();
      int var13 = 4;
      if (this.field_10433.method_35006() && this.method_9664().size() > 1) {
         var7.method_8511().method_40274(var12, this.field_36670 + var13 + 1, this.field_36674 + var13 + 1);
         var13--;
      }

      var7.method_8511().method_40284(var12, this.field_36670 + var13, this.field_36674 + var13);
      if (var10) {
         class_3542.method_16489();
      }
   }

   private List<class_8932<?>> method_9664() {
      List var3 = this.field_10433.method_35011(true);
      if (!this.field_10435.method_5079(this.field_10434)) {
         var3.addAll(this.field_10433.method_35011(false));
      }

      return var3;
   }

   public boolean method_9667() {
      return this.method_9664().size() == 1;
   }

   public class_8932<?> method_9662() {
      List var3 = this.method_9664();
      return (class_8932<?>)var3.get(this.field_10436);
   }

   public List<ITextComponent> method_9665(class_266 var1) {
      class_6098 var4 = this.method_9664().get(this.field_10436).method_41044();
      ArrayList var5 = Lists.newArrayList(var1.method_1179(var4));
      if (this.field_10433.method_35017(this.field_10435.method_5079(this.field_10434)).size() > 1) {
         var5.add(field_10441);
      }

      return var5;
   }

   @Override
   public int method_32699() {
      return 25;
   }

   @Override
   public boolean method_32702(int var1) {
      return var1 == 0 || var1 == 1;
   }
}
