package mapped;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class968 extends Class944 implements Class935 {
   private static Class8805 field5424;
   private static MinecraftSessionService field5425;
   private GameProfile field5426;
   private int field5427;
   private boolean field5428;

   public Class968() {
      super(Class4387.field21435);
   }

   public static void method4002(Class8805 var0) {
      field5424 = var0;
   }

   public static void method4003(MinecraftSessionService var0) {
      field5425 = var0;
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      if (this.field5426 != null) {
         Class39 var4 = new Class39();
         Class8354.method29279(var4, this.field5426);
         var1.method99("SkullOwner", var4);
      }

      return var1;
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      if (!var2.method119("SkullOwner", 10)) {
         if (var2.method119("ExtraType", 8)) {
            String var5 = var2.method126("ExtraType");
            if (!Class9001.method33256(var5)) {
               this.method4006(new GameProfile((UUID)null, var5));
            }
         }
      } else {
         this.method4006(Class8354.method29278(var2.method130("SkullOwner")));
      }
   }

   @Override
   public void method3647() {
      Class7380 var3 = this.method3775();
      if (var3.method23448(Class8487.field36711) || var3.method23448(Class8487.field36712)) {
         if (!this.field5324.method6780(this.field5325)) {
            this.field5428 = false;
         } else {
            this.field5428 = true;
            this.field5427++;
         }
      }
   }

   public float method4004(float var1) {
      return !this.field5428 ? (float)this.field5427 : (float)this.field5427 + var1;
   }

   @Nullable
   public GameProfile method4005() {
      return this.field5426;
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      return new Class5610(this.field5325, 4, this.method3777());
   }

   @Override
   public Class39 method3777() {
      return this.method3646(new Class39());
   }

   public void method4006(GameProfile var1) {
      this.field5426 = var1;
      this.method4007();
   }

   private void method4007() {
      this.field5426 = method4008(this.field5426);
      this.method3622();
   }

   @Nullable
   public static GameProfile method4008(GameProfile var0) {
      if (var0 != null && !Class9001.method33256(var0.getName())) {
         if (var0.isComplete() && var0.getProperties().containsKey("textures")) {
            return var0;
         } else if (field5424 != null && field5425 != null) {
            GameProfile var3 = field5424.method31792(var0.getName());
            if (var3 != null) {
               Property var4 = (Property)Iterables.getFirst(var3.getProperties().get("textures"), (Property)null);
               if (var4 == null) {
                  var3 = field5425.fillProfileProperties(var3, true);
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
