package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Effect {
   private final Map<Attribute, AttributeModifier> field30707 = Maps.newHashMap();
   private final EffectType field30708;
   private final int field30709;
   private String field30710;

   @Nullable
   public static Effect method22287(int var0) {
      return Registry.EFFECTS.method9172(var0);
   }

   public static int method22288(Effect var0) {
      return Registry.EFFECTS.getId(var0);
   }

   public Effect(EffectType var1, int var2) {
      this.field30708 = var1;
      this.field30709 = var2;
   }

   public void method22289(LivingEntity var1, int var2) {
      if (this != Effects.REGENERATION) {
         if (this != Effects.POISON) {
            if (this != Effects.WITHER) {
               if (this == Effects.HUNGER && var1 instanceof PlayerEntity) {
                  ((PlayerEntity)var1).method2931(0.005F * (float)(var2 + 1));
               } else if (this == Effects.SATURATION && var1 instanceof PlayerEntity) {
                  if (!var1.world.isRemote) {
                     ((PlayerEntity)var1).getFoodStats().method37569(var2 + 1, 1.0F);
                  }
               } else if ((this != Effects.INSTANT_HEALTH || var1.isEntityUndead()) && (this != Effects.INSTANT_DAMAGE || !var1.isEntityUndead())) {
                  if (this == Effects.INSTANT_DAMAGE && !var1.isEntityUndead() || this == Effects.INSTANT_HEALTH && var1.isEntityUndead()) {
                     var1.attackEntityFrom(DamageSource.field39006, (float)(6 << var2));
                  }
               } else {
                  var1.heal((float)Math.max(4 << var2, 0));
               }
            } else {
               var1.attackEntityFrom(DamageSource.field39007, 1.0F);
            }
         } else if (var1.getHealth() > 1.0F) {
            var1.attackEntityFrom(DamageSource.field39006, 1.0F);
         }
      } else if (var1.getHealth() < var1.method3075()) {
         var1.heal(1.0F);
      }
   }

   public void method22290(Entity var1, Entity var2, LivingEntity var3, int var4, double var5) {
      if ((this != Effects.INSTANT_HEALTH || var3.isEntityUndead()) && (this != Effects.INSTANT_DAMAGE || !var3.isEntityUndead())) {
         if (this == Effects.INSTANT_DAMAGE && !var3.isEntityUndead() || this == Effects.INSTANT_HEALTH && var3.isEntityUndead()) {
            int var10 = (int)(var5 * (double)(6 << var4) + 0.5);
            if (var1 != null) {
               var3.attackEntityFrom(DamageSource.method31124(var1, var2), (float)var10);
            } else {
               var3.attackEntityFrom(DamageSource.field39006, (float)var10);
            }
         } else {
            this.method22289(var3, var4);
         }
      } else {
         int var9 = (int)(var5 * (double)(4 << var4) + 0.5);
         var3.heal((float)var9);
      }
   }

   public boolean method22291(int var1, int var2) {
      if (this != Effects.REGENERATION) {
         if (this != Effects.POISON) {
            if (this != Effects.WITHER) {
               return this == Effects.HUNGER;
            } else {
               int var7 = 40 >> var2;
               return var7 <= 0 ? true : var1 % var7 == 0;
            }
         } else {
            int var6 = 25 >> var2;
            return var6 <= 0 ? true : var1 % var6 == 0;
         }
      } else {
         int var5 = 50 >> var2;
         return var5 <= 0 ? true : var1 % var5 == 0;
      }
   }

   public boolean method22292() {
      return false;
   }

   public String method22293() {
      if (this.field30710 == null) {
         this.field30710 = Util.method38486("effect", Registry.EFFECTS.getKey(this));
      }

      return this.field30710;
   }

   public String method22294() {
      return this.method22293();
   }

   public ITextComponent method22295() {
      return new TranslationTextComponent(this.method22294());
   }

   public EffectType method22296() {
      return this.field30708;
   }

   public int method22297() {
      return this.field30709;
   }

   public Effect addAttributesModifier(Attribute var1, String var2, double var3, AttributeModifierOperation var5) {
      AttributeModifier var8 = new AttributeModifier(UUID.fromString(var2), this::method22294, var3, var5);
      this.field30707.put(var1, var8);
      return this;
   }

   public Map<Attribute, AttributeModifier> method22299() {
      return this.field30707;
   }

   public void removeAttributesModifiersFromEntity(LivingEntity var1, AttributeModifierManager var2, int var3) {
      for (Entry var7 : this.field30707.entrySet()) {
         ModifiableAttributeInstance var8 = var2.createInstanceIfAbsent((Attribute)var7.getKey());
         if (var8 != null) {
            var8.method38670((AttributeModifier)var7.getValue());
         }
      }
   }

   public void applyAttributesModifiersToEntity(LivingEntity var1, AttributeModifierManager var2, int var3) {
      for (Entry var7 : this.field30707.entrySet()) {
         ModifiableAttributeInstance var8 = var2.createInstanceIfAbsent((Attribute)var7.getKey());
         if (var8 != null) {
            AttributeModifier var9 = (AttributeModifier)var7.getValue();
            var8.method38670(var9);
            var8.method38668(new AttributeModifier(var9.method37930(), this.method22294() + " " + var3, this.method22302(var3, var9), var9.method37932()));
         }
      }
   }

   public double method22302(int var1, AttributeModifier var2) {
      return var2.method37933() * (double)(var1 + 1);
   }

   public boolean method22303() {
      return this.field30708 == EffectType.BENEFICIAL;
   }
}
