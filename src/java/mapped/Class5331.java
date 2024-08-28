package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.List;

public class Class5331 extends Class5325 {
    public Class5331() {
        super(ModuleCategory.ITEM, "AutoGapple", "Automatically eat golden apples", new Class5218(), new Class5264());
        this.method15972(new Class6009<Float>("Health", "Maximum health before eating gapple.", 7.0F, Float.class, 0.5F, 10.0F, 0.5F));
    }

    public int method16749(boolean var1) {
        for (int var4 = 36; var4 < 45; var4++) {
            if (field23386.field1339.field4904.method18131(var4).method18266()) {
                Class8848 var5 = field23386.field1339.field4904.method18131(var4).method18265();
                if (var5 != null) {
                    if (!var1) {
                        if (var5.method32107() == Class8514.field37872 || var5.method32107() == Class8514.field37873) {
                            return var4 - 36;
                        }
                    } else {
                        List<Class2023> var6 = Class7789.method25858(var5);
                        if (var6 != null) {
                            for (Class2023 var8 : var6) {
                                if (var8.method8627() == Class8254.field35478) {
                                    return var4 - 36;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int var9 = 9; var9 < 36; var9++) {
            if (field23386.field1339.field4904.method18131(var9).method18266()) {
                Class8848 var10 = field23386.field1339.field4904.method18131(var9).method18265();
                if (!var1) {
                    if (var10.method32107() == Class8514.field37872 || var10.method32107() == Class8514.field37873) {
                        Class7789.method25873(var9, 4);
                        return -1;
                    }
                } else {
                    List<Class2023> var11 = Class7789.method25858(var10);
                    if (var11 != null) {
                        for (Class2023 var13 : var11) {
                            if (var13.method8627() == Class8254.field35478) {
                                Class7789.method25873(var9, 4);
                                return -1;
                            }
                        }
                    }
                }
            }
        }

        return -1;
    }
}
