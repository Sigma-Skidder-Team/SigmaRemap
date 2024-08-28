package mapped;

import java.util.ArrayList;
import java.util.List;

public final class Class7607 {
   private final List<String> field32650 = new ArrayList<String>();
   private final List<String> field32651 = new ArrayList<String>();

   public Class7607 method24913(String var1, String var2) {
      this.field32650.add(Class7284.method22979(var1, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
      this.field32651.add(Class7284.method22979(var2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
      return this;
   }

   public Class7607 method24914(String var1, String var2) {
      this.field32650.add(Class7284.method22979(var1, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
      this.field32651.add(Class7284.method22979(var2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
      return this;
   }

   public Class4867 method24915() {
      return new Class4867(this.field32650, this.field32651);
   }
}
