package mapped;

public class Class6755 extends Class6754<Class6755> {
   public Class6755(String var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public Class6755 method20589() {
      try {
         this.field29461.setDoOutput(true);
         this.field29461.setRequestMethod("DELETE");
         this.field29461.connect();
         return this;
      } catch (Exception var4) {
         throw new Class2505(var4.getMessage(), var4);
      }
   }
}
