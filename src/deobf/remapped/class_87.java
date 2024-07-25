package remapped;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_87 extends class_495 {
   private final Identifier field_165;
   private final Set<UUID> field_162 = Sets.newHashSet();
   private int field_163;
   private int field_164 = 100;

   public class_87(Identifier var1, ITextComponent var2) {
      super(var2, class_1062.field_5823, class_2976.field_14631);
      this.field_165 = var1;
      this.method_43459(0.0F);
   }

   public Identifier method_216() {
      return this.field_165;
   }

   @Override
   public void method_2403(class_9359 var1) {
      super.method_2403(var1);
      this.field_162.add(var1.method_37328());
   }

   public void method_213(UUID var1) {
      this.field_162.add(var1);
   }

   @Override
   public void method_2405(class_9359 var1) {
      super.method_2405(var1);
      this.field_162.remove(var1.method_37328());
   }

   @Override
   public void method_2408() {
      super.method_2408();
      this.field_162.clear();
   }

   public int method_221() {
      return this.field_163;
   }

   public int method_218() {
      return this.field_164;
   }

   public void method_212(int var1) {
      this.field_163 = var1;
      this.method_43459(MathHelper.clamp((float)var1 / (float)this.field_164, 0.0F, 1.0F));
   }

   public void method_219(int var1) {
      this.field_164 = var1;
      this.method_43459(MathHelper.clamp((float)this.field_163 / (float)var1, 0.0F, 1.0F));
   }

   public final ITextComponent method_217() {
      return TextComponentUtils.wrapWithSquareBrackets(this.method_43453())
         .modifyStyle(
            var1 -> var1.setFormatting(this.method_43456().method_4662())
                  .setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new StringTextComponent(this.method_216().toString())))
                  .setInsertion(this.method_216().toString())
         );
   }

   public boolean method_222(Collection<class_9359> var1) {
      HashSet var4 = Sets.newHashSet();
      HashSet var5 = Sets.newHashSet();

      for (UUID var7 : this.field_162) {
         boolean var8 = false;

         for (class_9359 var10 : var1) {
            if (var10.method_37328().equals(var7)) {
               var8 = true;
               break;
            }
         }

         if (!var8) {
            var4.add(var7);
         }
      }

      for (class_9359 var14 : var1) {
         boolean var17 = false;

         for (UUID var21 : this.field_162) {
            if (var14.method_37328().equals(var21)) {
               var17 = true;
               break;
            }
         }

         if (!var17) {
            var5.add(var14);
         }
      }

      for (UUID var15 : var4) {
         for (class_9359 var20 : this.method_2406()) {
            if (var20.method_37328().equals(var15)) {
               this.method_2405(var20);
               break;
            }
         }

         this.field_162.remove(var15);
      }

      for (class_9359 var16 : var5) {
         this.method_2403(var16);
      }

      return !var4.isEmpty() || !var5.isEmpty();
   }

   public CompoundNBT method_223() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25941("Name", ITextComponent$class_40.toJson(this.field_48006));
      var3.putBoolean("Visible", this.method_2409());
      var3.putInt("Value", this.field_163);
      var3.putInt("Max", this.field_164);
      var3.method_25941("Color", this.method_43456().method_4665());
      var3.method_25941("Overlay", this.method_43462().method_13618());
      var3.putBoolean("DarkenScreen", this.method_43460());
      var3.putBoolean("PlayBossMusic", this.method_43464());
      var3.putBoolean("CreateWorldFog", this.method_43455());
      class_3416 var4 = new class_3416();

      for (UUID var6 : this.field_162) {
         var4.add(class_4338.method_20181(var6));
      }

      var3.put("Players", var4);
      return var3;
   }

   public static class_87 method_220(CompoundNBT var0, Identifier var1) {
      class_87 var4 = new class_87(var1, ITextComponent$class_40.func_240643_a_(var0.method_25965("Name")));
      var4.method_2404(var0.getBoolean("Visible"));
      var4.method_212(var0.method_25947("Value"));
      var4.method_219(var0.method_25947("Max"));
      var4.method_43452(class_1062.method_4664(var0.method_25965("Color")));
      var4.method_43458(class_2976.method_13620(var0.method_25965("Overlay")));
      var4.method_43461(var0.getBoolean("DarkenScreen"));
      var4.method_43457(var0.getBoolean("PlayBossMusic"));
      var4.method_43463(var0.getBoolean("CreateWorldFog"));
      class_3416 var5 = var0.method_25927("Players", 11);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         var4.method_213(class_4338.method_20183(var5.get(var6)));
      }

      return var4;
   }

   public void method_214(class_9359 var1) {
      if (this.field_162.contains(var1.method_37328())) {
         this.method_2403(var1);
      }
   }

   public void method_215(class_9359 var1) {
      super.method_2405(var1);
   }
}
