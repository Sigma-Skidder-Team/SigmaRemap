package mapped;

public enum Class2132 {
   field13908(0.0F, 1.0F, Class5234.method16307().gameSettings.field44633),
   field13909(2.0F, 1.0F, Class5234.method16308().gameSettings.field44635),
   field13910(1.0F, 0.0F, Class5234.method16309().gameSettings.field44632),
   field13911(1.0F, 1.0F, Class5234.method16310().gameSettings.field44634),
   field13912(0.0F, 2.0F, 74, Class5234.method16311().gameSettings.keyBindAttack),
   field13913(1.02F, 2.0F, 73, Class5234.method16312().gameSettings.keyBindUseItem);

   public float field13914;
   public float field13915;
   public int field13916 = 48;
   public int field13917 = 48;
   public int field13918 = 3;
   public KeyBinding field13919;
   private static final Class2132[] field13920 = new Class2132[]{field13908, field13909, field13910, field13911, field13912, field13913};

   private Class2132(float var3, float var4, KeyBinding var5) {
      this.field13914 = var3;
      this.field13915 = var4;
      this.field13919 = var5;
   }

   private Class2132(float var3, float var4, int var5, KeyBinding var6) {
      this.field13914 = var3;
      this.field13915 = var4;
      this.field13919 = var6;
      this.field13916 = var5;
   }

   public Class9268 method8814() {
      return new Class9268(
         this, (int)(this.field13914 * (float)(this.field13916 + this.field13918)), (int)(this.field13915 * (float)(this.field13917 + this.field13918))
      );
   }

   public Class9268 method8815() {
      return new Class9268(this, this.field13916, this.field13917);
   }

   public KeyBinding method8816() {
      if (this != field13908) {
         if (this != field13909) {
            if (this != field13910) {
               if (this != field13911) {
                  if (this != field13912) {
                     return this != field13913 ? null : Class5234.method16318().gameSettings.keyBindUseItem;
                  } else {
                     return Class5234.method16317().gameSettings.keyBindAttack;
                  }
               } else {
                  return Class5234.method16316().gameSettings.field44634;
               }
            } else {
               return Class5234.method16315().gameSettings.field44632;
            }
         } else {
            return Class5234.method16314().gameSettings.field44635;
         }
      } else {
         return Class5234.method16313().gameSettings.field44633;
      }
   }
}
