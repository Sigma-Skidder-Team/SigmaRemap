package mapped;

public class Class6636 implements Class6632 {
   private String field29181 = null;
   private boolean field29182 = false;
   private Class field29183 = null;

   public Class6636(String var1) {
      this.field29181 = var1;
      Class9787.method38574(this);
   }

   public Class6636(Class var1) {
      this.field29183 = var1;
      this.field29181 = var1.getName();
      this.field29182 = true;
   }

   public Class method20244() {
      if (this.field29182) {
         return this.field29183;
      } else {
         this.field29182 = true;

         try {
            this.field29183 = Class.forName(this.field29181);
         } catch (ClassNotFoundException ignored) {

         } catch (Throwable var5) {
            var5.printStackTrace();
         }

         return this.field29183;
      }
   }

   public boolean method20245() {
      return this.method20244() != null;
   }

   public String method20246() {
      return this.field29181;
   }

   public boolean method20247(Object var1) {
      return this.method20244() != null ? this.method20244().isInstance(var1) : false;
   }

   public Class6633 method20248(String var1) {
      return new Class6633(this, var1);
   }

   public Class6631 method20249(String var1) {
      return new Class6631(this, var1);
   }

   public Class6631 method20250(String var1, Class[] var2) {
      return new Class6631(this, var1, var2);
   }

   @Override
   public void method20232() {
      Class var3 = this.method20244();
   }
}
