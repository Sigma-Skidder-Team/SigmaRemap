package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8039 {
   private final List<Class9569> field34541 = Lists.newArrayList();
   private final Class880 field34542;
   private int field34543;
   private int field34544;
   private int field34545;
   private boolean field34546;
   private boolean field34547;
   private String field34548;

   public Class8039(Class880 var1) {
      this.field34542 = var1;
   }

   public void method27598() {
      this.method27605();
      Optional var3 = this.field34542.method3062();
      if (!var3.isPresent()) {
         if (this.field34542.method3250()) {
            this.field34548 = "water";
         }
      } else {
         BlockState var4 = this.field34542.world.getBlockState((BlockPos)var3.get());
         if (var4.method23448(Blocks.LADDER) || var4.method23446(BlockTags.field32768)) {
            this.field34548 = "ladder";
         } else if (!var4.method23448(Blocks.VINE)) {
            if (var4.method23448(Blocks.field37086) || var4.method23448(Blocks.field37087)) {
               this.field34548 = "weeping_vines";
            } else if (var4.method23448(Blocks.field37088) || var4.method23448(Blocks.field37089)) {
               this.field34548 = "twisting_vines";
            } else if (!var4.method23448(Blocks.field37053)) {
               this.field34548 = "other_climbable";
            } else {
               this.field34548 = "scaffolding";
            }
         } else {
            this.field34548 = "vines";
         }
      }
   }

   public void method27599(Class8654 var1, float var2, float var3) {
      this.method27606();
      this.method27598();
      Class9569 var6 = new Class9569(var1, this.field34542.ticksExisted, var2, var3, this.field34548, this.field34542.fallDistance);
      this.field34541.add(var6);
      this.field34543 = this.field34542.ticksExisted;
      this.field34547 = true;
      if (var6.method37103() && !this.field34546 && this.field34542.method3066()) {
         this.field34546 = true;
         this.field34544 = this.field34542.ticksExisted;
         this.field34545 = this.field34544;
         this.field34542.method2730();
      }
   }

   public ITextComponent method27600() {
      if (this.field34541.isEmpty()) {
         return new TranslationTextComponent("death.attack.generic", this.field34542.getDisplayName());
      } else {
         Class9569 var3 = this.method27602();
         Class9569 var4 = this.field34541.get(this.field34541.size() - 1);
         ITextComponent var5 = var4.method37105();
         Entity var6 = var4.method37101().method31109();
         Object var7;
         if (var3 != null && var4.method37101() == Class8654.field39002) {
            ITextComponent var8 = var3.method37105();
            if (var3.method37101() == Class8654.field39002 || var3.method37101() == Class8654.field39004) {
               var7 = new TranslationTextComponent("death.fell.accident." + this.method27603(var3), this.field34542.getDisplayName());
            } else if (var8 != null && (var5 == null || !var8.equals(var5))) {
               Entity var11 = var3.method37101().method31109();
               ItemStack var10 = !(var11 instanceof Class880) ? ItemStack.EMPTY : ((Class880)var11).method3090();
               if (!var10.isEmpty() && var10.method32152()) {
                  var7 = new TranslationTextComponent("death.fell.assist.item", this.field34542.getDisplayName(), var8, var10.method32173());
               } else {
                  var7 = new TranslationTextComponent("death.fell.assist", this.field34542.getDisplayName(), var8);
               }
            } else if (var5 == null) {
               var7 = new TranslationTextComponent("death.fell.killer", this.field34542.getDisplayName());
            } else {
               ItemStack var9 = !(var6 instanceof Class880) ? ItemStack.EMPTY : ((Class880)var6).method3090();
               if (!var9.isEmpty() && var9.method32152()) {
                  var7 = new TranslationTextComponent("death.fell.finish.item", this.field34542.getDisplayName(), var5, var9.method32173());
               } else {
                  var7 = new TranslationTextComponent("death.fell.finish", this.field34542.getDisplayName(), var5);
               }
            }
         } else {
            var7 = var4.method37101().method31110(this.field34542);
         }

         return (ITextComponent)var7;
      }
   }

   @Nullable
   public Class880 method27601() {
      Class880 var3 = null;
      PlayerEntity var4 = null;
      float var5 = 0.0F;
      float var6 = 0.0F;

      for (Class9569 var8 : this.field34541) {
         if (var8.method37101().method31109() instanceof PlayerEntity && (var4 == null || var8.method37102() > var6)) {
            var6 = var8.method37102();
            var4 = (PlayerEntity)var8.method37101().method31109();
         }

         if (var8.method37101().method31109() instanceof Class880 && (var3 == null || var8.method37102() > var5)) {
            var5 = var8.method37102();
            var3 = (Class880)var8.method37101().method31109();
         }
      }

      return (Class880)(var4 != null && var6 >= var5 / 3.0F ? var4 : var3);
   }

   @Nullable
   private Class9569 method27602() {
      Class9569 var3 = null;
      Class9569 var4 = null;
      float var5 = 0.0F;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < this.field34541.size(); var7++) {
         Class9569 var8 = this.field34541.get(var7);
         Class9569 var9 = var7 <= 0 ? null : this.field34541.get(var7 - 1);
         if ((var8.method37101() == Class8654.field39002 || var8.method37101() == Class8654.field39004)
            && var8.method37106() > 0.0F
            && (var3 == null || var8.method37106() > var6)) {
            if (var7 <= 0) {
               var3 = var8;
            } else {
               var3 = var9;
            }

            var6 = var8.method37106();
         }

         if (var8.method37104() != null && (var4 == null || var8.method37102() > var5)) {
            var4 = var8;
            var5 = var8.method37102();
         }
      }

      if (var6 > 5.0F && var3 != null) {
         return var3;
      } else {
         return var5 > 5.0F && var4 != null ? var4 : null;
      }
   }

   private String method27603(Class9569 var1) {
      return var1.method37104() != null ? var1.method37104() : "generic";
   }

   public int method27604() {
      return !this.field34546 ? this.field34545 - this.field34544 : this.field34542.ticksExisted - this.field34544;
   }

   private void method27605() {
      this.field34548 = null;
   }

   public void method27606() {
      int var3 = !this.field34546 ? 100 : 300;
      if (this.field34547 && (!this.field34542.method3066() || this.field34542.ticksExisted - this.field34543 > var3)) {
         boolean var4 = this.field34546;
         this.field34547 = false;
         this.field34546 = false;
         this.field34545 = this.field34542.ticksExisted;
         if (var4) {
            this.field34542.method2731();
         }

         this.field34541.clear();
      }
   }

   public Class880 method27607() {
      return this.field34542;
   }
}
