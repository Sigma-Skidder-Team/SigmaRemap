package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import com.mentalfrostbyte.jello.unmapped.Class6001;

import java.util.ArrayList;
import java.util.List;

@InDevelopment
public class Class5325 extends Module {
    private final List<Class6547> field23882 = new ArrayList<Class6547>();
    public Module[] field23878;
    public Module field23879;
    public Class6005 field23881;
    private final List<String> field23880 = new ArrayList<String>();

    public Class5325(ModuleCategory var1, String var2, String var3, Module... var4) {
        super(var1, var2, var3);
        this.field23878 = var4;

        for (Module var10 : this.field23878) {
            Client.getInstance().getEventManager().register(var10);
            this.field23880.add(var10.method15991());
            var10.method16003(this);
        }

        this.method15972(this.field23881 = new Class6005("Type", var2 + " mode", 0, this.field23880.toArray(new String[0])));
        this.field23881.method18616(var1x -> this.method16724());
        this.method16724();
    }

    public void method16724() {
        this.method16725();

        for (Module var6 : this.field23878) {
            boolean var7 = this.method15978("Type").equals(var6.name);
            if (this.method15996() && mc.field1339 != null) {
                var6.setState(var7);
                if (var7) {
                    this.field23879 = var6;
                }
            } else if (this.method15996()) {
                var6.method15998(var7);
            }

            this.method16728(var6, var7);
        }
    }

    private void method16725() {
        boolean var3 = false;

        for (Module var7 : this.field23878) {
            if (this.method15978("Type").equals(var7.name)) {
                var3 = true;
            }
        }

        if (!var3) {
            this.method15984("Type", this.field23878[0].name);
        }
    }

    public Module method16726() {
        this.method16725();

        for (Module var6 : this.field23878) {
            if (this.method15978("Type").equals(var6.name)) {
                return var6;
            }
        }

        return null;
    }

    @Override
    public boolean method15988() {
        if (this.field23879 == null) {
            this.method16724();
        }

        return this.field23879 != null ? this.field23879.method15988() : this.method15996();
    }

    @Override
    public JSONObject method15986(JSONObject var1) {
        JSONObject var4 = Class8000.method27331(var1, "sub-options");
        if (var4 != null) {
            for (Module var8 : this.field23878) {
                Class2344 var9 = Class8000.method27332(var4, var8.method15991());
                if (var9 != null) {
                    for (int var10 = 0; var10 < var9.method9134(); var10++) {
                        JSONObject var11 = var9.method9129(var10);
                        String var12 = Class8000.method27330(var11, "name", null);

                        for (Class6001 var14 : var8.field23397.values()) {
                            if (var14.method18625().equals(var12)) {
                                try {
                                    var14.method18610(var11);
                                } catch (Class2499 var16) {
                                    Client.getInstance()
                                            .getLogger()
                                            .method20357("Could not initialize settings of " + var8.method15991() + "." + var14.method18625() + " from config.");
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }

        JSONObject var18 = super.method15986(var1);
        if (this.enabled) {
            this.method16724();
        }

        return var18;
    }

    @Override
    public JSONObject method15987(JSONObject var1) {
        try {
            JSONObject var4 = new JSONObject();

            for (Module var8 : this.field23878) {
                Class2344 var9 = new Class2344();

                for (Class6001 var11 : var8.field23397.values()) {
                    var9.method9158(var11.method18611(new JSONObject()));
                }

                var4.method21806(var8.method15991(), var9);
            }

            var1.method21806("sub-options", var4);
            return super.method15987(var1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void method15966() {
        this.method16724();
        if (this.field23879 instanceof PremiumModule && !Client.getInstance().getNetworkManager().isPremium()) {
            this.method15998(false);
        }
    }

    @Override
    public void method15965() {
        for (Module var6 : this.field23878) {
            var6.method15999(false);
        }
    }

    @Override
    public void method15985() {
        for (Module var6 : this.field23878) {
            var6.setState(false);
        }

        super.method15985();
    }

    public final Class5325 method16727(Class6547 var1) {
        this.field23882.add(var1);
        return this;
    }

    public final void method16728(Module var1, boolean var2) {
        for (Class6547 var6 : this.field23882) {
            var6.method19891(this, var1, var2);
        }
    }

    @Override
    public void method15953() {
        super.method15953();

        for (Module var6 : this.field23878) {
            var6.method15953();
        }
    }
}
