package mapped;

public class Class5097 implements Class5093 {
   private static String[] field23191;
   private int field23192;
   private final boolean field23193;
   private final float field23194;

   private Class5097(boolean var1, float var2) {
      this.field23193 = var1;
      this.field23194 = var2;
   }

   public Class5097(boolean var1) {
      this(var1, 0.05F);
   }

   public Class5097(float var1) {
      this(true, var1);
   }

   public int method15580() {
      return this.field23192;
   }

   public void method15581() {
      this.field23192++;
   }

   public boolean method15582() {
      return this.field23193;
   }

   public float method15583() {
      return this.field23194;
   }
}
