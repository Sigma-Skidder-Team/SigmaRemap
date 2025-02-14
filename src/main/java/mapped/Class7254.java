package mapped;

import java.util.List;

public class Class7254 extends Class7253<Class9460> {
   private List<Class9460> field31127;
   private boolean field31128 = false;

   public Class7254(Class9757 var1, boolean var2, List<Class9460> var3, Class2512 var4, Class2512 var5, Class2214 var6) {
      super(var1, var4, var5, var6);
      if (var3 != null) {
         this.field31127 = var3;
         this.field31134 = var2;
      } else {
         throw new NullPointerException("value in a Node is required.");
      }
   }

   public Class7254(Class9757 var1, List<Class9460> var2, Class2214 var3) {
      this(var1, true, var2, null, null, var3);
   }

   @Override
   public Class2048 method22769() {
      return Class2048.field13366;
   }

   @Override
   public List<Class9460> method22770() {
      return this.field31127;
   }

   public void method22775(List<Class9460> var1) {
      this.field31127 = var1;
   }

   public void method22776(Class<? extends Object> var1) {
      for (Class9460 var5 : this.field31127) {
         var5.method36417().method22785(var1);
      }
   }

   public void method22777(Class<? extends Object> var1, Class<? extends Object> var2) {
      for (Class9460 var6 : this.field31127) {
         var6.method36418().method22785(var2);
         var6.method36417().method22785(var1);
      }
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();

      for (Class9460 var6 : this.method22770()) {
         var3.append("{ key=");
         var3.append(var6.method36417());
         var3.append("; value=");
         if (!(var6.method36418() instanceof Class7253)) {
            var3.append(var6.toString());
         } else {
            var3.append(System.identityHashCode(var6.method36418()));
         }

         var3.append(" }");
      }

      String var5 = var3.toString();
      return "<" + this.getClass().getName() + " (tag=" + this.method22780() + ", values=" + var5 + ")>";
   }

   public void method22778(boolean var1) {
      this.field31128 = var1;
   }

   public boolean method22779() {
      return this.field31128;
   }
}
