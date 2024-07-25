package remapped;

public class class_6399<T extends class_5583> extends class_9067<T> {
   private static String[] field_32669;
   private float field_32670;
   private float field_32671;
   private float field_32672;

   public class_6399(float var1) {
      super(var1);
   }

   public void method_29215(T var1, float var2, float var3, float var4) {
      this.field_32670 = var1.method_25362(var4);
      this.field_32671 = var1.method_25361(var4);
      this.field_32672 = var1.method_25367(var4);
      if (this.field_32670 <= 0.0F) {
         this.field_46396.field_8191 = 0.0F;
         this.field_46396.field_8185 = 0.0F;
         this.field_46392.field_8191 = 0.0F;
         this.field_46392.field_8185 = 0.0F;
         this.field_46398.field_8191 = 0.0F;
         this.field_46398.field_8185 = 0.0F;
         this.field_46398.field_8183 = -1.2F;
         this.field_46393.field_8191 = 0.0F;
         this.field_46399.field_8191 = 0.0F;
         this.field_46399.field_8185 = 0.0F;
         this.field_46399.field_8183 = -1.1F;
         this.field_46399.field_8181 = 18.0F;
      }

      super.method_29702((T)var1, var2, var3, var4);
      if (var1.method_41209()) {
         this.field_46390.field_8191 = (float) (Math.PI / 4);
         this.field_46390.field_8181 += -4.0F;
         this.field_46390.field_8187 += 5.0F;
         this.field_46396.field_8181 += -3.3F;
         this.field_46396.field_8187++;
         this.field_46391.field_8181 += 8.0F;
         this.field_46391.field_8187 += -2.0F;
         this.field_46394.field_8181 += 2.0F;
         this.field_46394.field_8187 += -0.8F;
         this.field_46391.field_8191 = 1.7278761F;
         this.field_46394.field_8191 = 2.670354F;
         this.field_46392.field_8191 = (float) (-Math.PI / 20);
         this.field_46392.field_8181 = 16.1F;
         this.field_46392.field_8187 = -7.0F;
         this.field_46398.field_8191 = (float) (-Math.PI / 20);
         this.field_46398.field_8181 = 16.1F;
         this.field_46398.field_8187 = -7.0F;
         this.field_46393.field_8191 = (float) (-Math.PI / 2);
         this.field_46393.field_8181 = 21.0F;
         this.field_46393.field_8187 = 1.0F;
         this.field_46399.field_8191 = (float) (-Math.PI / 2);
         this.field_46399.field_8181 = 21.0F;
         this.field_46399.field_8187 = 1.0F;
         this.field_46397 = 3;
      }
   }

   public void method_29214(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_29700((T)var1, var2, var3, var4, var5, var6);
      if (this.field_32670 > 0.0F) {
         this.field_46396.field_8185 = class_8746.method_40145(this.field_46396.field_8185, -1.2707963F, this.field_32670);
         this.field_46396.field_8190 = class_8746.method_40145(this.field_46396.field_8190, 1.2707963F, this.field_32670);
         this.field_46392.field_8191 = -1.2707963F;
         this.field_46398.field_8191 = -0.47079635F;
         this.field_46398.field_8185 = -0.2F;
         this.field_46398.field_8183 = -0.2F;
         this.field_46393.field_8191 = -0.4F;
         this.field_46399.field_8191 = 0.5F;
         this.field_46399.field_8185 = -0.5F;
         this.field_46399.field_8183 = -0.3F;
         this.field_46399.field_8181 = 20.0F;
         this.field_46391.field_8191 = class_8746.method_40145(this.field_46391.field_8191, 0.8F, this.field_32671);
         this.field_46394.field_8191 = class_8746.method_40145(this.field_46394.field_8191, -0.4F, this.field_32671);
      }

      if (this.field_32672 > 0.0F) {
         this.field_46396.field_8191 = class_8746.method_40145(this.field_46396.field_8191, -0.58177644F, this.field_32672);
      }
   }
}
