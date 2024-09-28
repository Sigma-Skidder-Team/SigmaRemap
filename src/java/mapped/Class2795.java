package mapped;

public abstract class Class2795<T extends Class1009> extends BipedModel<T> {
   public Class2795(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      ModelHelper.method27109(this.bipedLeftArm, this.bipedRightArm, this.method11000((T)var1), this.swingProgress, var4);
   }

   public abstract boolean method11000(T var1);
}
