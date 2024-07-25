package remapped;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import javax.annotation.Nullable;

public class class_4797 extends class_3757 implements class_3745 {
   private static class_5969 field_23979;
   private static MinecraftSessionService field_23980;
   private GameProfile field_23978;
   private int field_23983;
   private boolean field_23981;

   public class_4797() {
      super(class_133.field_386);
   }

   public static void method_22114(class_5969 var0) {
      field_23979 = var0;
   }

   public static void method_22111(MinecraftSessionService var0) {
      field_23980 = var0;
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      if (this.field_23978 != null) {
         class_5734 var4 = new class_5734();
         class_4338.method_20177(var4, this.field_23978);
         var1.method_25946("SkullOwner", var4);
      }

      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      if (!var2.method_25939("SkullOwner", 10)) {
         if (var2.method_25939("ExtraType", 8)) {
            String var5 = var2.method_25965("ExtraType");
            if (!class_6660.method_30576(var5)) {
               this.method_22109(new GameProfile((UUID)null, var5));
            }
         }
      } else {
         this.method_22109(class_4338.method_20184(var2.method_25937("SkullOwner")));
      }
   }

   @Override
   public void method_17353() {
      class_2522 var3 = this.method_17403();
      if (var3.method_8350(class_4783.field_23363) || var3.method_8350(class_4783.field_23376)) {
         if (!this.field_18364.method_29576(this.field_18358)) {
            this.field_23981 = false;
         } else {
            this.field_23981 = true;
            this.field_23983++;
         }
      }
   }

   public float method_22110(float var1) {
      return !this.field_23981 ? (float)this.field_23983 : (float)this.field_23983 + var1;
   }

   @Nullable
   public GameProfile method_22113() {
      return this.field_23978;
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 4, this.method_17414());
   }

   @Override
   public class_5734 method_17414() {
      return this.method_17396(new class_5734());
   }

   public void method_22109(GameProfile var1) {
      this.field_23978 = var1;
      this.method_22112();
   }

   private void method_22112() {
      this.field_23978 = method_22108(this.field_23978);
      this.method_17407();
   }

   @Nullable
   public static GameProfile method_22108(GameProfile var0) {
      if (var0 != null && !class_6660.method_30576(var0.getName())) {
         if (var0.isComplete() && var0.getProperties().containsKey("textures")) {
            return var0;
         } else if (field_23979 != null && field_23980 != null) {
            GameProfile var3 = field_23979.method_27255(var0.getName());
            if (var3 != null) {
               Property var4 = (Property)Iterables.getFirst(var3.getProperties().get("textures"), (Property)null);
               if (var4 == null) {
                  var3 = field_23980.fillProfileProperties(var3, true);
               }

               return var3;
            } else {
               return var0;
            }
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }
}
