package mapped;

public interface Class6612 {
   int method20029();

   int method20030();

   int method20031();

   float method20032();

   long method20033();

   long method20034();

   boolean method20042();

   boolean method20043();

   void method20044(boolean var1);

   boolean isHardcore();

   Class5462 method20046();

   Class2197 method20047();

   boolean method20048();

   default void method20049(CrashReportCategory var1) {
      var1.addDetail("Level spawn location", () -> CrashReportCategory.method32805(this.method20029(), this.method20030(), this.method20031()));
      var1.addDetail("Level time", () -> String.format("%d game time, %d day time", this.method20033(), this.method20034()));
   }
}
