package remapped;

public class class_5664 {
   public static final class_5664 field_28709 = new class_5664("Render");
   public static final class_5664 field_28710 = new class_5664("Player");
   public static final class_5664 field_28714 = new class_5664("Combat");
   public static final class_5664 field_28718 = new class_5664("World");
   public static final class_5664 field_28711 = new class_5664("Misc");
   public static final class_5664 field_28717 = new class_5664("Exploit");
   public static final class_5664 field_28716 = new class_5664("Movement");
   public static final class_5664 field_28708 = new class_5664("Gui");
   public static final class_5664 field_28712 = new class_5664("Item");
   private String field_28713;

   public class_5664(String var1) {
      this.field_28713 = var1;
   }

   public String method_25628() {
      return this.field_28713;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_5664 && ((class_5664)var1).field_28713.equals(this.field_28713);
   }

   @Override
   public int hashCode() {
      return this.field_28713.hashCode();
   }

   @Override
   public String toString() {
      return this.field_28713;
   }
}
