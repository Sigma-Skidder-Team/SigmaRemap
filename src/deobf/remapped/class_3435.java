package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3435 {
   private final List<class_8869> field_16881 = Lists.newArrayList();
   private final class_5834 field_16886;
   private int field_16884;
   private int field_16887;
   private int field_16882;
   private boolean field_16888;
   private boolean field_16883;
   private String field_16885;

   public class_3435(class_5834 var1) {
      this.field_16886 = var1;
   }

   public void method_15872() {
      this.method_15874();
      Optional var3 = this.field_16886.method_26436();
      if (!var3.isPresent()) {
         if (this.field_16886.method_37285()) {
            this.field_16885 = "water";
         }
      } else {
         class_2522 var4 = this.field_16886.world.method_28262((BlockPos)var3.get());
         if (var4.method_8350(class_4783.field_23748) || var4.method_8349(class_2351.field_11806)) {
            this.field_16885 = "ladder";
         } else if (!var4.method_8350(class_4783.field_23323)) {
            if (var4.method_8350(class_4783.field_23405) || var4.method_8350(class_4783.field_23288)) {
               this.field_16885 = "weeping_vines";
            } else if (var4.method_8350(class_4783.field_23175) || var4.method_8350(class_4783.field_23671)) {
               this.field_16885 = "twisting_vines";
            } else if (!var4.method_8350(class_4783.field_23348)) {
               this.field_16885 = "other_climbable";
            } else {
               this.field_16885 = "scaffolding";
            }
         } else {
            this.field_16885 = "vines";
         }
      }
   }

   public void method_15875(DamageSource var1, float var2, float var3) {
      this.method_15868();
      this.method_15872();
      class_8869 var6 = new class_8869(var1, this.field_16886.field_41697, var2, var3, this.field_16885, this.field_16886.field_41706);
      this.field_16881.add(var6);
      this.field_16884 = this.field_16886.field_41697;
      this.field_16883 = true;
      if (var6.method_40798() && !this.field_16888 && this.field_16886.isAlive()) {
         this.field_16888 = true;
         this.field_16887 = this.field_16886.field_41697;
         this.field_16882 = this.field_16887;
         this.field_16886.method_26546();
      }
   }

   public ITextComponent method_15870() {
      if (this.field_16881.isEmpty()) {
         return new TranslationTextComponent("death.attack.generic", this.field_16886.method_19839());
      } else {
         class_8869 var3 = this.method_15873();
         class_8869 var4 = this.field_16881.get(this.field_16881.size() - 1);
         ITextComponent var5 = var4.method_40803();
         Entity var6 = var4.method_40799().method_28372();
         Object var7;
         if (var3 != null && var4.method_40799() == DamageSource.field_31684) {
            ITextComponent var8 = var3.method_40803();
            if (var3.method_40799() == DamageSource.field_31684 || var3.method_40799() == DamageSource.field_31685) {
               var7 = new TranslationTextComponent("death.fell.accident." + this.method_15869(var3), this.field_16886.method_19839());
            } else if (var8 != null && (var5 == null || !var8.equals(var5))) {
               Entity var11 = var3.method_40799().method_28372();
               ItemStack var10 = !(var11 instanceof class_5834) ? ItemStack.EMPTY : ((class_5834)var11).method_26446();
               if (!var10.method_28022() && var10.method_28018()) {
                  var7 = new TranslationTextComponent("death.fell.assist.item", this.field_16886.method_19839(), var8, var10.method_28001());
               } else {
                  var7 = new TranslationTextComponent("death.fell.assist", this.field_16886.method_19839(), var8);
               }
            } else if (var5 == null) {
               var7 = new TranslationTextComponent("death.fell.killer", this.field_16886.method_19839());
            } else {
               ItemStack var9 = !(var6 instanceof class_5834) ? ItemStack.EMPTY : ((class_5834)var6).method_26446();
               if (!var9.method_28022() && var9.method_28018()) {
                  var7 = new TranslationTextComponent("death.fell.finish.item", this.field_16886.method_19839(), var5, var9.method_28001());
               } else {
                  var7 = new TranslationTextComponent("death.fell.finish", this.field_16886.method_19839(), var5);
               }
            }
         } else {
            var7 = var4.method_40799().method_28362(this.field_16886);
         }

         return (ITextComponent)var7;
      }
   }

   @Nullable
   public class_5834 method_15876() {
      class_5834 var3 = null;
      PlayerEntity var4 = null;
      float var5 = 0.0F;
      float var6 = 0.0F;

      for (class_8869 var8 : this.field_16881) {
         if (var8.method_40799().method_28372() instanceof PlayerEntity && (var4 == null || var8.method_40800() > var6)) {
            var6 = var8.method_40800();
            var4 = (PlayerEntity)var8.method_40799().method_28372();
         }

         if (var8.method_40799().method_28372() instanceof class_5834 && (var3 == null || var8.method_40800() > var5)) {
            var5 = var8.method_40800();
            var3 = (class_5834)var8.method_40799().method_28372();
         }
      }

      return (class_5834)(var4 != null && var6 >= var5 / 3.0F ? var4 : var3);
   }

   @Nullable
   private class_8869 method_15873() {
      class_8869 var3 = null;
      class_8869 var4 = null;
      float var5 = 0.0F;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < this.field_16881.size(); var7++) {
         class_8869 var8 = this.field_16881.get(var7);
         class_8869 var9 = var7 <= 0 ? null : this.field_16881.get(var7 - 1);
         if ((var8.method_40799() == DamageSource.field_31684 || var8.method_40799() == DamageSource.field_31685)
            && var8.method_40804() > 0.0F
            && (var3 == null || var8.method_40804() > var6)) {
            if (var7 <= 0) {
               var3 = var8;
            } else {
               var3 = var9;
            }

            var6 = var8.method_40804();
         }

         if (var8.method_40802() != null && (var4 == null || var8.method_40800() > var5)) {
            var4 = var8;
            var5 = var8.method_40800();
         }
      }

      if (var6 > 5.0F && var3 != null) {
         return var3;
      } else {
         return var5 > 5.0F && var4 != null ? var4 : null;
      }
   }

   private String method_15869(class_8869 var1) {
      return var1.method_40802() != null ? var1.method_40802() : "generic";
   }

   public int method_15866() {
      return !this.field_16888 ? this.field_16882 - this.field_16887 : this.field_16886.field_41697 - this.field_16887;
   }

   private void method_15874() {
      this.field_16885 = null;
   }

   public void method_15868() {
      int var3 = !this.field_16888 ? 100 : 300;
      if (this.field_16883 && (!this.field_16886.isAlive() || this.field_16886.field_41697 - this.field_16884 > var3)) {
         boolean var4 = this.field_16888;
         this.field_16883 = false;
         this.field_16888 = false;
         this.field_16882 = this.field_16886.field_41697;
         if (var4) {
            this.field_16886.method_26592();
         }

         this.field_16881.clear();
      }
   }

   public class_5834 method_15867() {
      return this.field_16886;
   }
}
