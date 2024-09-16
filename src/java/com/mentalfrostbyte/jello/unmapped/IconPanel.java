package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import mapped.*;
import totalcross.json.JSONArray;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IconPanel implements IGuiEventListener {
    private final List<IconPanel> field20893 = new ArrayList<IconPanel>();
    private final List<Class6664> field20894 = new ArrayList<Class6664>();
    private final List<IconPanel> field20916 = new ArrayList<IconPanel>();
    private final List<IconPanel> field20918 = new ArrayList<IconPanel>();
    private final List<Class7914> field20920 = new ArrayList<Class7914>();
    private final List<Class8867> field20921 = new ArrayList<Class8867>();
    private final List<Class9781> field20922 = new ArrayList<Class9781>();
    private final List<Class8446> field20923 = new ArrayList<Class8446>();
    private final List<Class7381> field20924 = new ArrayList<Class7381>();
    public String field20891;
    public IconPanel icoPanel;
    public int xA;
    public int yA;
    public int widthA;
    public int heightA;
    public float field20899 = 1.0F;
    public float field20900 = 1.0F;
    public int field20901 = 0;
    public int field20902 = 0;
    public boolean field20903;
    public boolean field20904;
    public boolean field20905;
    public boolean field20906;
    public boolean field20907;
    public boolean field20908;
    public boolean field20909;
    public boolean field20910;
    public boolean field20911;
    public String field20912;
    public ClientResource field20913;
    public ColorHelper textColor;
    private final ArrayList<Runnable> field20915 = new ArrayList<Runnable>();
    private boolean field20917;
    private IconPanel field20919;
    private int field20925;
    private int field20926;

    public IconPanel(IconPanel var1, String var2) {
        this(var1, var2, 0, 0, 0, 0);
    }

    public IconPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
        this(var1, var2, var3, var4, var5, var6, ColorHelper.field27961);
    }

    public IconPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7) {
        this(var1, var2, var3, var4, var5, var6, var7, null);
    }

    public IconPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, ResourceRegistry.JelloLightFont25);
    }

    public IconPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, ClientResource var9) {
        this.field20891 = var2;
        this.icoPanel = var1;
        this.xA = var3;
        this.yA = var4;
        this.widthA = var5;
        this.heightA = var6;
        this.field20912 = var8;
        this.textColor = var7;
        this.field20913 = var9;
        this.field20903 = true;
        this.field20904 = true;
        this.field20910 = true;
        this.field20911 = false;
    }

    private void method13220() {
        for (IconPanel var5 : new ArrayList<IconPanel>(this.field20893)) {
            if (var5.method13291()) {
                this.field20893.remove(var5);
                this.field20893.add(var5);
            }

            if (var5.method13293()) {
                this.field20893.remove(var5);
                this.field20893.add(0, var5);
            }
        }
    }

    public IconPanel method13221(String var1) {
        for (IconPanel var5 : this.field20893) {
            if (var5.method13257().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public void method13222(Runnable var1) {
        synchronized (this) {
            if (var1 != null) {
                this.field20915.add(var1);
            }
        }
    }

    private void method13223() {
        for (IconPanel var4 : this.field20918) {
            this.field20893.remove(var4);
            if (this.field20919 == var4) {
                this.field20919 = null;
            }
        }

        this.field20916.clear();

        for (IconPanel var6 : this.field20916) {
            this.field20893.add(var6);
        }

        this.field20916.clear();
        if (this.field20919 != null) {
            this.field20893.remove(this.field20919);
            this.field20893.add(this.field20919);
        }

        this.method13220();
    }

    public void method13028(int var1, int var2) {
        this.field20926 = var2;
        this.field20925 = var1;
        this.field20908 = this.method13289() && this.method13229(var1, var2);

        for (int var5 = 0; var5 < this.field20915.size(); var5++) {
            Runnable var6 = this.field20915.get(var5);
            if (var6 != null) {
                var6.run();
            }
        }

        this.field20915.clear();
        this.field20917 = true;

        try {
            for (IconPanel var10 : this.field20893) {
                var10.method13028(var1, var2);
            }
        } catch (ConcurrentModificationException var7) {
            var7.printStackTrace();
            Client.getClientLogger().error("FUCK! Why does this shit happen"); //What happens?
        }

        this.field20909 = this.field20909 & this.field20908;

        for (Class6664 var11 : this.method13260()) {
            if (this.field20903) {
                var11.method20320(this, this.getIcoPanel());
            }
        }

        this.method13223();
        this.field20917 = false;
    }

    public void method13224() {
        GL11.glTranslatef((float) (this.getXA() + this.getWidthA() / 2), (float) (this.getYA() + this.getHeightA() / 2), 0.0F);
        GL11.glScalef(this.method13273(), this.method13275(), 0.0F);
        GL11.glTranslatef((float) (-this.getXA() - this.getWidthA() / 2), (float) (-this.getYA() - this.getHeightA() / 2), 0.0F);
    }

    public void method13225() {
        GL11.glTranslatef((float) this.method13280(), (float) this.method13282(), 0.0F);
    }

    public void draw(float var1) {
        this.method13226(var1);
    }

    public final void method13226(float var1) {
        GlStateManager.method23696();
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glTranslatef((float) this.getXA(), (float) this.getYA(), 0.0F);

        for (IconPanel var5 : this.field20893) {
            if (var5.method13287()) {
                GL11.glPushMatrix();
                var5.draw(var1);
                GL11.glPopMatrix();
            }
        }
    }

    public boolean method13227() {
        for (IconPanel var4 : this.method13241()) {
            if (var4 instanceof UIInput && var4.field20905) {
                return true;
            }

            if (var4.method13227()) {
                return true;
            }
        }

        return false;
    }

    public void method13103(int var1) {
        for (IconPanel var5 : this.field20893) {
            if (var5.isHovered() && var5.method13287()) {
                var5.method13103(var1);
            }
        }
    }

    @Override
    public void charTyped(char var1) {
        for (IconPanel var5 : this.field20893) {
            if (var5.isHovered() && var5.method13287()) {
                var5.charTyped(var1);
            }
        }

        this.method13256(var1);
    }

    @Override
    public void keyPressed(int var1) {
        for (IconPanel var5 : this.field20893) {
            if (var5.isHovered() && var5.method13287()) {
                var5.keyPressed(var1);
            }
        }

        this.method13254(var1);
    }

    @Override
    public boolean method13078(int var1, int var2, int var3) {
        boolean var6 = false;

        for (int var7 = this.field20893.size() - 1; var7 >= 0; var7--) {
            IconPanel var8 = this.field20893.get(var7);
            boolean var9 = var8.getIcoPanel() != null
                    && var8.getIcoPanel() instanceof Class4339
                    && var8.getIcoPanel().method13114(var1, var2)
                    && var8.getIcoPanel().method13287()
                    && var8.getIcoPanel().isHovered();
            if (var6 || !var8.isHovered() || !var8.method13287() || !var8.method13114(var1, var2) && !var9) {
                var8.method13145(false);
                if (var8 != null) {
                    for (IconPanel var12 : var8.method13241()) {
                        var12.method13145(false);
                    }
                }
            } else {
                var8.method13078(var1, var2, var3);
                var6 = !var9;
            }
        }

        if (!var6) {
            this.field20909 = this.field20908 = true;
            this.method13242();
            this.method13248(var3);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void method13095(int var1, int var2, int var3) {
        this.field20908 = this.method13114(var1, var2);

        for (IconPanel var7 : this.field20893) {
            if (var7.isHovered() && var7.method13287()) {
                var7.method13095(var1, var2, var3);
            }
        }

        this.method13250(var3);
        if (this.method13212() && this.method13298()) {
            this.method13089(var1, var2, var3);
        }

        this.field20909 = false;
    }

    @Override
    public void method13089(int var1, int var2, int var3) {
        this.method13252(var3);
    }

    @Override
    public void method13079(float var1) {
        for (IconPanel var5 : this.field20893) {
            if (var5.isHovered() && var5.method13287()) {
                var5.method13079(var1);
            }
        }
    }

    public boolean method13114(int var1, int var2) {
        var1 -= this.method13271();
        var2 -= this.method13272();
        return var1 >= 0 && var1 <= this.widthA && var2 >= 0 && var2 <= this.heightA;
    }

    public boolean method13228(int var1, int var2, boolean var3) {
        boolean var6 = this.method13114(var1, var2);
        if (var6 && this.icoPanel != null) {
            if (var3) {
                for (IconPanel var8 : this.method13241()) {
                    if (var8.method13287() && var8.method13114(var1, var2)) {
                        return false;
                    }
                }
            }

            IconPanel var11 = this;

            for (IconPanel var12 = this.getIcoPanel(); var12 != null; var12 = var12.getIcoPanel()) {
                for (int var9 = var12.method13240(var11) + 1; var9 < var12.method13241().size(); var9++) {
                    IconPanel var10 = var12.method13241().get(var9);
                    if (var10 != var11 && var10.method13287() && var10.method13114(var1, var2)) {
                        return false;
                    }
                }

                var11 = var12;
            }
        }

        return var6;
    }

    public boolean method13229(int var1, int var2) {
        return this.method13228(var1, var2, true);
    }

    public void addToList(IconPanel var1) {
        if (var1 != null) {
            for (IconPanel var5 : this.method13241()) {
                if (var5.method13257().equals(var1.method13257())) {
                    throw new RuntimeException(
                            "Children with duplicate IDs! Child with id \"" + var5.method13257() + "\" already exists in view \"" + this.method13257() + "\"!"
                    );
                }
            }

            var1.setIcoPanel(this);
            if (this.field20917) {
                this.field20916.add(var1);
            } else {
                try {
                    this.field20893.add(var1);
                } catch (ConcurrentModificationException var6) {
                    this.field20916.add(var1);
                }
            }
        }
    }

    public boolean method13231(String var1) {
        for (IconPanel var5 : this.method13241()) {
            if (var5.method13257().equals(var1)) {
                return true;
            }
        }

        return false;
    }

    public void method13232(IconPanel var1) {
        if (var1 != null) {
            for (IconPanel var5 : this.method13241()) {
                if (var5.method13257().equals(var1.method13257())) {
                    throw new RuntimeException("Children with duplicate IDs!");
                }
            }

            var1.setIcoPanel(this);
            this.field20916.add(var1);
        }
    }

    public void method13233(IconPanel var1) {
        if (var1 != null) {
            for (IconPanel var5 : this.method13241()) {
                if (var5.method13257().equals(var1.method13257())) {
                    throw new RuntimeException("Children with duplicate IDs!");
                }
            }

            var1.setIcoPanel(this);

            try {
                this.field20893.add(var1);
            } catch (ConcurrentModificationException var6) {
            }
        }
    }

    public void method13234(IconPanel var1) {
        if (this.field20917) {
            this.field20918.add(var1);
        } else {
            this.method13236(var1);
        }
    }

    public void method13235(IconPanel var1) {
        this.field20918.add(var1);
    }

    public void method13236(IconPanel var1) {
        this.field20893.remove(var1);
        if (this.field20919 != null && this.field20919.equals(var1)) {
            this.field20919 = null;
        }

        this.field20916.remove(var1);
    }

    public void method13237(IconPanel var1) {
        for (IconPanel var5 : this.method13241()) {
            if (var5.field20891.equals(var1.field20891)) {
                this.method13234(var5);
            }
        }
    }

    public void method13238() {
        this.field20893.clear();
    }

    public boolean method13239(IconPanel var1) {
        return this.field20893.contains(var1);
    }

    public int method13240(IconPanel var1) {
        return this.field20893.indexOf(var1);
    }

    public List<IconPanel> method13241() {
        return this.field20893;
    }

    public void method13242() {
        this.method13145(true);
        if (this.icoPanel != null) {
            this.icoPanel.field20919 = this;
            this.icoPanel.method13242();
        }
    }

    public void method13243() {
        for (IconPanel var4 : this.icoPanel.method13241()) {
            if (var4 == this) {
                return;
            }

            var4.method13242();
        }
    }

    public void method13244() {
        this.field20893.clear();
    }

    public JSONObject method13160(JSONObject var1) {
        if (this.method13299()) {
            var1.put("id", this.method13257());
            var1.put("x", this.getXA());
            var1.put("y", this.getYA());
            if (this.method13301()) {
                var1.put("width", this.getWidthA());
                var1.put("height", this.getHeightA());
            }

            var1.put("index", this.icoPanel == null ? 0 : this.icoPanel.method13240(this));
            return this.method13245(var1);
        } else {
            return var1;
        }
    }

    public final JSONObject method13245(JSONObject var1) {
        JSONArray var4 = new JSONArray();

        for (IconPanel var6 : this.field20893) {
            if (var6.method13299()) {
                JSONObject var7 = var6.method13160(new JSONObject());
                if (var7.method21779() > 0) {
                    var4.put(var7);
                }
            }
        }

        var1.put("children", var4);
        return var1;
    }

    public void method13161(JSONObject var1) {
        if (this.method13299()) {
            this.xA = Class8000.method27326(var1, "x", this.xA);
            this.yA = Class8000.method27326(var1, "y", this.yA);
            if (this.method13301()) {
                this.widthA = Class8000.method27326(var1, "width", this.widthA);
                this.heightA = Class8000.method27326(var1, "height", this.heightA);
            }

            JSONArray var4 = Class8000.method27332(var1, "children");
            Iterator<String> var5 = var1.method21778().iterator();
            if (var4 != null) {
                List<IconPanel> var6 = new ArrayList<>(this.field20893);

                for (int var7 = 0; var7 < var4.length(); var7++) {
                    JSONObject var8 = var4.getJSONObject(var7);
                    String var9 = Class8000.method27330(var8, "id", null);
                    int var10 = Class8000.method27326(var8, "index", -1);

                    for (IconPanel var12 : var6) {
                        if (var12.method13257().equals(var9)) {
                            var12.method13161(var8);
                            if (var10 >= 0) {
                                this.field20893.remove(var12);
                                if (var10 > this.field20893.size()) {
                                    this.field20893.add(var12);
                                } else {
                                    this.field20893.add(var10, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean equals(Object var1) {
        if (this != var1) {
            if (!(var1 instanceof IconPanel)) {
                return false;
            } else {
                IconPanel var4 = (IconPanel) var1;
                return this.field20891.equals(var4.field20891) && (this.getIcoPanel() == null || this.getIcoPanel().equals(var4.getIcoPanel()));
            }
        } else {
            return true;
        }
    }

    public void method13246(Class7261 var1) {
        var1.method22796(this);
    }

    public final IconPanel method13247(Class7914 var1) {
        this.field20920.add(var1);
        return this;
    }

    public void method13248(int var1) {
        for (Class7914 var5 : this.field20920) {
            var5.method26544(this, var1);
        }
    }

    public IconPanel method13249(Class8867 var1) {
        this.field20921.add(var1);
        return this;
    }

    public void method13250(int var1) {
        for (Class8867 var5 : this.field20921) {
            var5.method32268(this, var1);
        }
    }

    public IconPanel doThis(Class9781 var1) {
        this.field20922.add(var1);
        return this;
    }

    public void method13252(int var1) {
        if (field20891.equals("Item3") && field20912.equals("Yes")) {
            Client.getInstance().getNetworkManager().account = null; // This is so fucking bad code but who cares :trol:
        }
        for (Class9781 var5 : this.field20922) {
            var5.method38555(this, var1);
        }
    }

    public final IconPanel method13253(Class8446 var1) {
        this.field20923.add(var1);
        return this;
    }

    public void method13254(int var1) {
        for (Class8446 var5 : this.field20923) {
            var5.method29709(this, var1);
        }
    }

    public final IconPanel method13255(Class7381 var1) {
        this.field20924.add(var1);
        return this;
    }

    public void method13256(char var1) {
        for (Class7381 var5 : this.field20924) {
            var5.method23497(var1);
        }
    }

    public String method13257() {
        return this.field20891;
    }

    public IconPanel getIcoPanel() {
        return this.icoPanel;
    }

    public void setIcoPanel(IconPanel var1) {
        this.icoPanel = var1;
    }

    public List<Class6664> method13260() {
        return this.field20894;
    }

    public void method13261(Class6664 var1) {
        this.field20894.add(var1);
    }

    public void method13262(Class6664 var1) {
        this.field20894.remove(var1);
    }

    public int getXA() {
        return this.xA;
    }

    public void setXA(int var1) {
        this.xA = var1;
    }

    public int getYA() {
        return this.yA;
    }

    public void setYA(int var1) {
        this.yA = var1;
    }

    public int getWidthA() {
        return this.widthA;
    }

    public void setWidthA(int var1) {
        this.widthA = var1;
    }

    public int getHeightA() {
        return this.heightA;
    }

    public void setHeightA(int var1) {
        this.heightA = var1;
    }

    public int method13271() {
        return this.icoPanel == null ? this.xA : this.icoPanel.method13271() + this.xA;
    }

    public int method13272() {
        return this.icoPanel == null ? this.yA : this.icoPanel.method13272() + this.yA;
    }

    public float method13273() {
        return this.field20899;
    }

    public float method13274() {
        return this.getIcoPanel() == null ? this.method13273() : this.getIcoPanel().method13274() * this.method13273();
    }

    public float method13275() {
        return this.field20900;
    }

    public float method13276() {
        return this.getIcoPanel() == null ? this.method13275() : this.getIcoPanel().method13276() * this.method13275();
    }

    public void method13277(float var1) {
        this.field20899 = var1;
    }

    public void method13278(float var1) {
        this.field20900 = var1;
    }

    public void method13279(float var1, float var2) {
        this.field20899 = var1;
        this.field20900 = var2;
    }

    public int method13280() {
        return this.field20901;
    }

    public int method13281() {
        return this.getIcoPanel() == null ? this.method13280() : this.getIcoPanel().method13281() * this.method13280();
    }

    public int method13282() {
        return this.field20902;
    }

    public int method13283() {
        return this.getIcoPanel() == null ? this.method13282() : this.getIcoPanel().method13283() * this.method13282();
    }

    public void method13284(int var1) {
        this.field20901 = var1;
    }

    public void drawBackground(int var1) {
        this.field20902 = var1;
    }

    public void method13286(int var1, int var2) {
        this.field20901 = var1;
        this.field20902 = var2;
    }

    public boolean method13287() {
        return this.field20903;
    }

    public void method13288(boolean var1) {
        this.field20903 = var1;
    }

    public boolean method13289() {
        return this.icoPanel == null ? this.field20903 : this.field20903 && this.icoPanel.method13289();
    }

    public void method13290(boolean var1) {
        this.field20903 = var1;
        if (this.icoPanel != null) {
            this.icoPanel.method13290(var1);
        }
    }

    public boolean method13291() {
        return this.field20906;
    }

    public void method13292(boolean var1) {
        this.field20906 = var1;
    }

    public boolean method13293() {
        return this.field20907;
    }

    public void method13294(boolean var1) {
        this.field20907 = var1;
    }

    public boolean isHovered() {
        return this.field20904;
    }

    public void method13296(boolean var1) {
        this.field20904 = var1;
    }

    public boolean method13297() {
        return this.field20905;
    }

    public void method13145(boolean var1) {
        this.field20905 = var1;
    }

    public boolean method13298() {
        return this.field20908;
    }

    public boolean method13212() {
        return this.field20909;
    }

    public boolean method13299() {
        return this.field20910;
    }

    public void method13300(boolean var1) {
        this.field20910 = var1;
    }

    public boolean method13301() {
        return this.field20911;
    }

    public void method13302(boolean var1) {
        this.field20911 = var1;
    }

    public String method13303() {
        return this.field20912;
    }

    public void method13304(String var1) {
        this.field20912 = var1;
    }

    public ClientResource method13305() {
        return this.field20913;
    }

    public void method13306(ClientResource var1) {
        this.field20913 = var1;
    }

    public ColorHelper method13307() {
        return this.textColor;
    }

    public void method13308(ColorHelper var1) {
        this.textColor = var1;
    }

    public int method13309() {
        return this.field20925;
    }

    public int method13310() {
        return this.field20926;
    }

    public void method13311(int var1) {
        this.field20925 = var1;
    }

    public void method13312(int var1) {
        this.field20926 = var1;
    }
}
