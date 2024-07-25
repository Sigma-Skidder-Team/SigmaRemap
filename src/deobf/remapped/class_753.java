package remapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_753 {
   private final GameProfile field_4088;
   private final Map<Type, class_4639> field_4087 = Maps.newEnumMap(Type.class);
   private class_4666 field_4083;
   private int field_4090;
   private boolean field_4091;
   private String field_4095;
   private ITextComponent field_4086;
   private int field_4089;
   private int field_4085;
   private long field_4093;
   private long field_4094;
   private long field_4092;

   public class_753(class_5902 var1) {
      this.field_4088 = var1.method_27005();
      this.field_4083 = var1.method_27003();
      this.field_4090 = var1.method_27002();
      this.field_4086 = var1.method_27001();
   }

   public GameProfile method_3392() {
      return this.field_4088;
   }

   @Nullable
   public class_4666 method_3393() {
      return this.field_4083;
   }

   public void method_3395(class_4666 var1) {
      this.field_4083 = var1;
   }

   public int method_3394() {
      return this.field_4090;
   }

   public void method_3415(int var1) {
      this.field_4090 = var1;
   }

   public boolean method_3404() {
      return this.method_3402() != null;
   }

   public String method_3409() {
      return this.field_4095 != null ? this.field_4095 : class_1512.method_6923(this.field_4088.getId());
   }

   public class_4639 method_3402() {
      this.method_3412();
      return (class_4639)MoreObjects.firstNonNull(this.field_4087.get(Type.SKIN), class_1512.method_6921(this.field_4088.getId()));
   }

   @Nullable
   public class_4639 method_3397() {
      this.method_3412();
      return this.field_4087.get(Type.CAPE);
   }

   @Nullable
   public class_4639 method_3413() {
      this.method_3412();
      return this.field_4087.get(Type.ELYTRA);
   }

   @Nullable
   public class_3903 method_3403() {
      return MinecraftClient.getInstance().field_9601.method_29562().method_4848(this.method_3392().getName());
   }

   public void method_3412() {
      synchronized (this) {
         if (!this.field_4091) {
            this.field_4091 = true;
            MinecraftClient.getInstance().method_8557().method_44309(this.field_4088, (var1, var2, var3) -> {
               this.field_4087.put(var1, var2);
               if (var1 == Type.SKIN) {
                  this.field_4095 = var3.getMetadata("model");
                  if (this.field_4095 == null) {
                     this.field_4095 = "default";
                  }
               }
            }, true);
         }
      }
   }

   public void method_3414(ITextComponent var1) {
      this.field_4086 = var1;
   }

   @Nullable
   public ITextComponent method_3410() {
      return this.field_4086;
   }

   public int method_3407() {
      return this.field_4089;
   }

   public void method_3406(int var1) {
      this.field_4089 = var1;
   }

   public int method_3396() {
      return this.field_4085;
   }

   public void method_3399(int var1) {
      this.field_4085 = var1;
   }

   public long method_3408() {
      return this.field_4093;
   }

   public void method_3405(long var1) {
      this.field_4093 = var1;
   }

   public long method_3411() {
      return this.field_4094;
   }

   public void method_3398(long var1) {
      this.field_4094 = var1;
   }

   public long method_3391() {
      return this.field_4092;
   }

   public void method_3400(long var1) {
      this.field_4092 = var1;
   }
}
