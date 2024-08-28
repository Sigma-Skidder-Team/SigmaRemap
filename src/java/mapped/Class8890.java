package mapped;

public class Class8890 {
   public static final Class8890 field40219 = method32358("core");
   public static final Class8890 field40220 = method32358("idle");
   public static final Class8890 field40221 = method32358("work");
   public static final Class8890 field40222 = method32358("play");
   public static final Class8890 field40223 = method32358("rest");
   public static final Class8890 field40224 = method32358("meet");
   public static final Class8890 field40225 = method32358("panic");
   public static final Class8890 field40226 = method32358("raid");
   public static final Class8890 field40227 = method32358("pre_raid");
   public static final Class8890 field40228 = method32358("hide");
   public static final Class8890 field40229 = method32358("fight");
   public static final Class8890 field40230 = method32358("celebrate");
   public static final Class8890 field40231 = method32358("admire_item");
   public static final Class8890 field40232 = method32358("avoid");
   public static final Class8890 field40233 = method32358("ride");
   private final String field40234;
   private final int field40235;

   private Class8890(String var1) {
      this.field40234 = var1;
      this.field40235 = var1.hashCode();
   }

   public String method32357() {
      return this.field40234;
   }

   private static Class8890 method32358(String var0) {
      return Class2348.<Class8890>method9194(Class2348.field16095, var0, new Class8890(var0));
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class8890 var4 = (Class8890)var1;
            return this.field40234.equals(var4.field40234);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field40235;
   }

   @Override
   public String toString() {
      return this.method32357();
   }
}
