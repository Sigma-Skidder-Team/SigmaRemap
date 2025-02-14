package mapped;

import javax.annotation.Nullable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;

public class Class9569 {
   private static String[] field44556;
   private final DamageSource field44557;
   private final int field44558;
   private final float field44559;
   private final float field44560;
   private final String field44561;
   private final float field44562;

   public Class9569(DamageSource var1, int var2, float var3, float var4, String var5, float var6) {
      this.field44557 = var1;
      this.field44558 = var2;
      this.field44559 = var4;
      this.field44560 = var3;
      this.field44561 = var5;
      this.field44562 = var6;
   }

   public DamageSource method37101() {
      return this.field44557;
   }

   public float method37102() {
      return this.field44559;
   }

   public boolean method37103() {
      return this.field44557.getTrueSource() instanceof LivingEntity;
   }

   @Nullable
   public String method37104() {
      return this.field44561;
   }

   @Nullable
   public ITextComponent method37105() {
      return this.method37101().getTrueSource() != null ? this.method37101().getTrueSource().getDisplayName() : null;
   }

   public float method37106() {
      return this.field44557 != DamageSource.OUT_OF_WORLD ? this.field44562 : Float.MAX_VALUE;
   }
}
