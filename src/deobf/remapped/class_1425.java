package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1425 {
   private final Map<class_225, class_9343> field_7705 = Maps.newHashMap();
   private final class_7822 field_7709;
   private final int field_7706;
   private String field_7708;

   @Nullable
   public static class_1425 method_6538(int var0) {
      return class_8669.field_44436.method_14040(var0);
   }

   public static int method_6536(class_1425 var0) {
      return class_8669.field_44436.method_14041(var0);
   }

   public class_1425(class_7822 var1, int var2) {
      this.field_7709 = var1;
      this.field_7706 = var2;
   }

   public void method_6537(class_5834 var1, int var2) {
      if (this != Effects.field_19742) {
         if (this != Effects.field_19718) {
            if (this != Effects.field_19725) {
               if (this == Effects.field_19747 && var1 instanceof class_704) {
                  ((class_704)var1).method_3170(0.005F * (float)(var2 + 1));
               } else if (this == Effects.field_19734 && var1 instanceof class_704) {
                  if (!var1.field_41768.field_33055) {
                     ((class_704)var1).method_3161().method_42236(var2 + 1, 1.0F);
                  }
               } else if ((this != Effects.field_19749 || var1.method_26563()) && (this != Effects.field_19723 || !var1.method_26563())) {
                  if (this == Effects.field_19723 && !var1.method_26563() || this == Effects.field_19749 && var1.method_26563()) {
                     var1.method_37181(class_6199.field_31686, (float)(6 << var2));
                  }
               } else {
                  var1.method_26457((float)Math.max(4 << var2, 0));
               }
            } else {
               var1.method_37181(class_6199.field_31669, 1.0F);
            }
         } else if (var1.method_26551() > 1.0F) {
            var1.method_37181(class_6199.field_31686, 1.0F);
         }
      } else if (var1.method_26551() < var1.method_26465()) {
         var1.method_26457(1.0F);
      }
   }

   public void method_6539(Entity var1, Entity var2, class_5834 var3, int var4, double var5) {
      if ((this != Effects.field_19749 || var3.method_26563()) && (this != Effects.field_19723 || !var3.method_26563())) {
         if (this == Effects.field_19723 && !var3.method_26563() || this == Effects.field_19749 && var3.method_26563()) {
            int var10 = (int)(var5 * (double)(6 << var4) + 0.5);
            if (var1 != null) {
               var3.method_37181(class_6199.method_28369(var1, var2), (float)var10);
            } else {
               var3.method_37181(class_6199.field_31686, (float)var10);
            }
         } else {
            this.method_6537(var3, var4);
         }
      } else {
         int var9 = (int)(var5 * (double)(4 << var4) + 0.5);
         var3.method_26457((float)var9);
      }
   }

   public boolean method_6549(int var1, int var2) {
      if (this != Effects.field_19742) {
         if (this != Effects.field_19718) {
            if (this != Effects.field_19725) {
               return this == Effects.field_19747;
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

   public boolean method_6535() {
      return false;
   }

   public String method_6548() {
      if (this.field_7708 == null) {
         this.field_7708 = Util.createTranslationKey("effect", class_8669.field_44436.method_39797(this));
      }

      return this.field_7708;
   }

   public String method_6540() {
      return this.method_6548();
   }

   public ITextComponent method_6541() {
      return new TranslationTextComponent(this.method_6540());
   }

   public class_7822 method_6550() {
      return this.field_7709;
   }

   public int method_6544() {
      return this.field_7706;
   }

   public class_1425 method_6545(class_225 var1, String var2, double var3, class_9342 var5) {
      class_9343 var8 = new class_9343(UUID.fromString(var2), this::method_6540, var3, var5);
      this.field_7705.put(var1, var8);
      return this;
   }

   public Map<class_225, class_9343> method_6546() {
      return this.field_7705;
   }

   public void method_6551(class_5834 var1, class_6711 var2, int var3) {
      for (Entry var7 : this.field_7705.entrySet()) {
         class_9747 var8 = var2.method_30808((class_225)var7.getKey());
         if (var8 != null) {
            var8.method_45004((class_9343)var7.getValue());
         }
      }
   }

   public void method_6543(class_5834 var1, class_6711 var2, int var3) {
      for (Entry var7 : this.field_7705.entrySet()) {
         class_9747 var8 = var2.method_30808((class_225)var7.getKey());
         if (var8 != null) {
            class_9343 var9 = (class_9343)var7.getValue();
            var8.method_45004(var9);
            var8.method_45005(new class_9343(var9.method_43122(), this.method_6540() + " " + var3, this.method_6547(var3, var9), var9.method_43121()));
         }
      }
   }

   public double method_6547(int var1, class_9343 var2) {
      return var2.method_43123() * (double)(var1 + 1);
   }

   public boolean method_6542() {
      return this.field_7709 == class_7822.field_39674;
   }
}
