package remapped;

public class class_2921 extends class_1331 {
   public class_2921() {
      this(0, 0, 0);
   }

   public class_2921(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public class_2921(double var1, double var3, double var5) {
      this(class_9299.method_42847(var1), class_9299.method_42847(var3), class_9299.method_42847(var5));
   }

   @Override
   public class_1331 method_6103(double var1, double var3, double var5) {
      return super.method_6103(var1, var3, var5).method_6072();
   }

   @Override
   public class_1331 method_6104(int var1, int var2, int var3) {
      return super.method_6104(var1, var2, var3).method_6072();
   }

   @Override
   public class_1331 method_6099(class_240 var1, int var2) {
      return super.method_6099(var1, var2).method_6072();
   }

   @Override
   public class_1331 method_6068(class_9249 var1, int var2) {
      return super.method_6068(var1, var2).method_6072();
   }

   @Override
   public class_1331 method_6078(class_6631 var1) {
      return super.method_6078(var1).method_6072();
   }

   public class_2921 method_13362(int var1, int var2, int var3) {
      this.method_12167(var1);
      this.method_12184(var2);
      this.method_12172(var3);
      return this;
   }

   public class_2921 method_13361(double var1, double var3, double var5) {
      return this.method_13362(class_9299.method_42847(var1), class_9299.method_42847(var3), class_9299.method_42847(var5));
   }

   public class_2921 method_13364(class_2700 var1) {
      return this.method_13362(var1.method_12173(), var1.method_12165(), var1.method_12185());
   }

   public class_2921 method_13363(long var1) {
      return this.method_13362(method_6080(var1), method_6067(var1), method_6092(var1));
   }

   public class_2921 method_13365(class_5587 var1, int var2, int var3, int var4) {
      return this.method_13362(
         var1.method_25384(var2, var3, var4, class_9249.field_47215),
         var1.method_25384(var2, var3, var4, class_9249.field_47216),
         var1.method_25384(var2, var3, var4, class_9249.field_47219)
      );
   }

   public class_2921 method_13371(class_2700 var1, class_240 var2) {
      return this.method_13362(var1.method_12173() + var2.method_1041(), var1.method_12165() + var2.method_1054(), var1.method_12185() + var2.method_1034());
   }

   public class_2921 method_13360(class_2700 var1, int var2, int var3, int var4) {
      return this.method_13362(var1.method_12173() + var2, var1.method_12165() + var3, var1.method_12185() + var4);
   }

   public class_2921 method_13368(class_240 var1) {
      return this.method_13369(var1, 1);
   }

   public class_2921 method_13369(class_240 var1, int var2) {
      return this.method_13362(
         this.method_12173() + var1.method_1041() * var2, this.method_12165() + var1.method_1054() * var2, this.method_12185() + var1.method_1034() * var2
      );
   }

   public class_2921 method_13367(int var1, int var2, int var3) {
      return this.method_13362(this.method_12173() + var1, this.method_12165() + var2, this.method_12185() + var3);
   }

   public class_2921 method_13366(class_2700 var1) {
      return this.method_13362(this.method_12173() + var1.method_12173(), this.method_12165() + var1.method_12165(), this.method_12185() + var1.method_12185());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_2921 method_13370(class_9249 var1, int var2, int var3) {
      switch (var1) {
         case field_47215:
            return this.method_13362(class_9299.method_42829(this.method_12173(), var2, var3), this.method_12165(), this.method_12185());
         case field_47216:
            return this.method_13362(this.method_12173(), class_9299.method_42829(this.method_12165(), var2, var3), this.method_12185());
         case field_47219:
            return this.method_13362(this.method_12173(), this.method_12165(), class_9299.method_42829(this.method_12185(), var2, var3));
         default:
            throw new IllegalStateException("Unable to clamp axis " + var1);
      }
   }

   @Override
   public void method_12167(int var1) {
      super.method_12167(var1);
   }

   @Override
   public void method_12184(int var1) {
      super.method_12184(var1);
   }

   @Override
   public void method_12172(int var1) {
      super.method_12172(var1);
   }

   @Override
   public class_1331 method_6072() {
      return new class_1331(this);
   }
}
