package remapped;

public class class_3158 {
   private int field_15688 = -1;
   private Object field_15686;

   public class_3158(JSONObjectImpl var1) {
      this.method_14558(var1);
   }

   public class_3158(int var1, Module var2) {
      this.field_15688 = var1;
      this.field_15686 = var2;
   }

   public class_3158(int var1, Class<? extends Screen> var2) {
      this.field_15688 = var1;
      this.field_15686 = var2;
   }

   public void method_14558(JSONObjectImpl var1) {
      if (var1.method_5850("target")) {
         if (var1.method_5850("key")) {
            this.field_15688 = var1.method_5813("key");
         }

         if (var1.method_5850("type")) {
            String var4 = var1.method_5861("type");
            switch (var4) {
               case "mod":
                  for (Module var7 : SigmaMainClass.getInstance().getModuleManager().method_843().values()) {
                     if (var1.method_5861("target").equals(var7.getName())) {
                        this.field_15686 = var7;
                     }
                  }
               case "screen":
                  Class var8 = SigmaMainClass.getInstance().method_3299().method_31007(var1.method_5861("target"));
                  if (var8 != null) {
                     this.field_15686 = var8;
                  }
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JSONObjectImpl method_14564() {
      JSONObjectImpl var3 = new JSONObjectImpl();
      switch (this.method_14566()) {
         case field_25372:
            var3.method_5820("type", "mod");
            var3.method_5820("target", ((Module)this.field_15686).getName());
            break;
         case field_25373:
            var3.method_5820("type", "screen");
            var3.method_5820("target", SigmaMainClass.getInstance().method_3299().method_31010((Class<? extends Screen>)this.field_15686));
      }

      var3.method_5818("key", this.field_15688);
      return var3;
   }

   public boolean method_14561() {
      return this.field_15686 != null;
   }

   public int method_14565() {
      return this.field_15688;
   }

   public void method_14563(int var1) {
      this.field_15688 = var1;
   }

   public class_4906 method_14566() {
      return !(this.field_15686 instanceof Module) ? class_4906.field_25373 : class_4906.field_25372;
   }

   public Object method_14567() {
      return this.field_15686;
   }

   public Class<? extends Screen> method_14559() {
      return (Class<? extends Screen>)this.field_15686;
   }

   public Module method_14560() {
      return (Module)this.field_15686;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (var1 instanceof class_3158) {
            class_3158 var4 = (class_3158)var1;
            return this.method_14567().equals(var4.method_14567());
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}