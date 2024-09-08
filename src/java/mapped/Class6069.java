package mapped;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class Class6069 {
   private final Class2106[] field27306;
   private final Class1937 field27307;
   public final Class2242 field27308;
   public String field27309;

   @Nullable
   public static Class6069 method18810(int var0) {
      return Registry.field16073.method9172(var0);
   }

   public Class6069(Class1937 var1, Class2242 var2, Class2106[] var3) {
      this.field27307 = var1;
      this.field27308 = var2;
      this.field27306 = var3;
   }

   public Map<Class2106, ItemStack> method18811(LivingEntity var1) {
      EnumMap var4 = Maps.newEnumMap(Class2106.class);

      for (Class2106 var8 : this.field27306) {
         ItemStack var9 = var1.method2943(var8);
         if (!var9.isEmpty()) {
            var4.put(var8, var9);
         }
      }

      return var4;
   }

   public Class1937 method18812() {
      return this.field27307;
   }

   public int method18813() {
      return 1;
   }

   public int method18809() {
      return 1;
   }

   public int method18807(int var1) {
      return 1 + var1 * 10;
   }

   public int method18808(int var1) {
      return this.method18807(var1) + 5;
   }

   public int method18814(int var1, DamageSource var2) {
      return 0;
   }

   public float method18815(int var1, Class7809 var2) {
      return 0.0F;
   }

   public final boolean method18816(Class6069 var1) {
      return this.method18817(var1) && var1.method18817(this);
   }

   public boolean method18817(Class6069 var1) {
      return this != var1;
   }

   public String method18818() {
      if (this.field27309 == null) {
         this.field27309 = Util.method38486("enchantment", Registry.field16073.getKey(this));
      }

      return this.field27309;
   }

   public String method18819() {
      return this.method18818();
   }

   public ITextComponent method18820(int var1) {
      TranslationTextComponent var4 = new TranslationTextComponent(this.method18819());
      if (!this.method18825()) {
         var4.mergeStyle(TextFormatting.GRAY);
      } else {
         var4.mergeStyle(TextFormatting.RED);
      }

      if (var1 != 1 || this.method18809() != 1) {
         var4.appendString(" ").append(new TranslationTextComponent("enchantment.level." + var1));
      }

      return var4;
   }

   public boolean method18821(ItemStack var1) {
      return this.field27308.method8990(var1.getItem());
   }

   public void method18822(LivingEntity var1, Entity var2, int var3) {
   }

   public void method18823(LivingEntity var1, Entity var2, int var3) {
   }

   public boolean method18824() {
      return false;
   }

   public boolean method18825() {
      return false;
   }

   public boolean method18826() {
      return true;
   }

   public boolean method18827() {
      return true;
   }
}
