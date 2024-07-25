package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_8869 {
   private static String[] field_45346;
   private final DamageSource field_45341;
   private final int field_45342;
   private final float field_45345;
   private final float field_45343;
   private final String field_45344;
   private final float field_45347;

   public class_8869(DamageSource var1, int var2, float var3, float var4, String var5, float var6) {
      this.field_45341 = var1;
      this.field_45342 = var2;
      this.field_45345 = var4;
      this.field_45343 = var3;
      this.field_45344 = var5;
      this.field_45347 = var6;
   }

   public DamageSource method_40799() {
      return this.field_45341;
   }

   public float method_40800() {
      return this.field_45345;
   }

   public boolean method_40798() {
      return this.field_45341.method_28372() instanceof LivingEntity;
   }

   @Nullable
   public String method_40802() {
      return this.field_45344;
   }

   @Nullable
   public ITextComponent method_40803() {
      return this.method_40799().method_28372() != null ? this.method_40799().method_28372().method_19839() : null;
   }

   public float method_40804() {
      return this.field_45341 != DamageSource.field_31685 ? this.field_45347 : Float.MAX_VALUE;
   }
}
