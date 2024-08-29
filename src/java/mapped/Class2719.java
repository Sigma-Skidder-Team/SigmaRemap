package mapped;

public class Class2719 extends Class2709<Class880> {
   private static String[] field17187;

   public Class2719(Class1057 var1) {
      super(var1, Class880.class, 10, true, false, var0 -> var0 instanceof Class1008);
   }

   @Override
   public boolean method10803() {
      return this.field17153.getTeam() != null ? super.method10803() : false;
   }

   @Override
   public AxisAlignedBB method10921(double var1) {
      Direction var5 = ((Class1057)this.field17153).method4848();
      if (var5.method544() != Class113.field413) {
         return var5.method544() != Class113.field415
            ? this.field17153.getBoundingBox().method19663(var1, 4.0, var1)
            : this.field17153.getBoundingBox().method19663(var1, var1, 4.0);
      } else {
         return this.field17153.getBoundingBox().method19663(4.0, var1, var1);
      }
   }
}
