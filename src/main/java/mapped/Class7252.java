package mapped;

import java.util.List;

public class Class7252 extends Class7253<Class7255> {
   private final List<Class7255> field31125;

   public Class7252(Class9757 var1, boolean var2, List<Class7255> var3, Class2512 var4, Class2512 var5, Class2214 var6) {
      super(var1, var4, var5, var6);
      if (var3 != null) {
         this.field31125 = var3;
         this.field31134 = var2;
      } else {
         throw new NullPointerException("value in a Node is required.");
      }
   }

   public Class7252(Class9757 var1, List<Class7255> var2, Class2214 var3) {
      this(var1, true, var2, null, null, var3);
   }

   @Override
   public Class2048 method22769() {
      return Class2048.field13365;
   }

   @Override
   public List<Class7255> method22770() {
      return this.field31125;
   }

   public void method22771(Class<? extends Object> var1) {
      for (Class7255 var5 : this.field31125) {
         var5.method22785(var1);
      }
   }

   @Override
   public String toString() {
      return "<" + this.getClass().getName() + " (tag=" + this.method22780() + ", value=" + this.method22770() + ")>";
   }
}
