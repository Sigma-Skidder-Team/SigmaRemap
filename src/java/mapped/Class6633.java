package mapped;

import net.optifine.reflect.IFieldLocator;

import java.lang.reflect.Field;

public class Class6633 implements Class6632 {
   private static String[] field29172;
   private IFieldLocator field29173 = null;
   private boolean field29174 = false;
   private Field field29175 = null;

   public Class6633(Class6636 var1, String var2) {
      this(new Class7110(var1, var2));
   }

   public Class6633(Class6636 var1, Class var2) {
      this(var1, var2, 0);
   }

   public Class6633(Class6636 var1, Class var2, int var3) {
      this(new Class7111(var1, var2, var3));
   }

   public Class6633(Field var1) {
      this(new Class7107(var1));
   }

   public Class6633(IFieldLocator var1) {
      this.field29173 = var1;
      Class9787.method38574(this);
   }

   public Field method20233() {
      if (!this.field29174) {
         this.field29174 = true;
         this.field29175 = this.field29173.method22145();
         if (this.field29175 != null) {
            this.field29175.setAccessible(true);
         }

         return this.field29175;
      } else {
         return this.field29175;
      }
   }

   public Object method20234() {
      return Reflector.method35072(null, this);
   }

   public Object method20235(Object var1) {
      return Reflector.method35072(var1, this);
   }

   public void method20236(Object var1) {
      Reflector.method35082(null, this, var1);
   }

   public void method20237(Object var1, Object var2) {
      Reflector.method35082(var1, this, var2);
   }

   public boolean exists() {
      return this.method20233() != null;
   }

   @Override
   public void method20232() {
      Field var3 = this.method20233();
   }
}
