package remapped;

public final class class_4079 extends class_5791 {
   private static String[] field_19852;
   private final class_5791 field_19851;
   private final int field_19855;
   private final int field_19857;
   private final int field_19856;
   private final int field_19853;
   private final int field_19850;
   private final int field_19854;

   public class_4079(class_5791 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5 - var2, var6 - var3, var7 - var4);
      this.field_19851 = var1;
      this.field_19855 = var2;
      this.field_19857 = var3;
      this.field_19856 = var4;
      this.field_19853 = var5;
      this.field_19850 = var6;
      this.field_19854 = var7;
   }

   @Override
   public boolean method_26194(int var1, int var2, int var3) {
      return this.field_19851.method_26194(this.field_19855 + var1, this.field_19857 + var2, this.field_19856 + var3);
   }

   @Override
   public void method_26202(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.field_19851.method_26202(this.field_19855 + var1, this.field_19857 + var2, this.field_19856 + var3, var4, var5);
   }

   @Override
   public int method_26201(class_9249 var1) {
      return Math.max(0, this.field_19851.method_26201(var1) - var1.method_42631(this.field_19855, this.field_19857, this.field_19856));
   }

   @Override
   public int method_26206(class_9249 var1) {
      return Math.min(
         var1.method_42631(this.field_19853, this.field_19850, this.field_19854),
         this.field_19851.method_26206(var1) - var1.method_42631(this.field_19855, this.field_19857, this.field_19856)
      );
   }
}
