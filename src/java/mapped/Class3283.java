package mapped;

import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class Class3283 extends Item {
   private static final Map<SoundEvent, Class3283> field18793 = Maps.newHashMap();
   private final int field18794;
   private final SoundEvent field18795;

   public Class3283(int var1, SoundEvent var2, Properties var3) {
      super(var3);
      this.field18794 = var1;
      this.field18795 = var2;
      field18793.put(this.field18795, this);
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockState var6 = var4.getBlockState(var5);
      if (var6.isIn(Blocks.JUKEBOX) && !var6.<Boolean>get(Class3364.field18931)) {
         ItemStack var7 = var1.method18357();
         if (!var4.isRemote) {
            ((Class3364) Blocks.JUKEBOX).method11941(var4, var5, var6, var7);
            var4.method6869((PlayerEntity)null, 1010, var5, Item.method11701(this));
            var7.shrink(1);
            PlayerEntity var8 = var1.method18358();
            if (var8 != null) {
               var8.method2911(Stats.field40158);
            }
         }

         return ActionResultType.method9002(var4.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   public int method11812() {
      return this.field18794;
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      var3.add(this.method11813().mergeStyle(TextFormatting.GRAY));
   }

   public IFormattableTextComponent method11813() {
      return new TranslationTextComponent(this.getTranslationKey() + ".desc");
   }

   @Nullable
   public static Class3283 method11814(SoundEvent var0) {
      return field18793.get(var0);
   }

   public SoundEvent method11815() {
      return this.field18795;
   }
}
