package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mojang.blaze3d.platform.GlStateManager;
import mapped.*;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONArray;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class CustomGuiScreen implements IGuiEventListener {
    private final List<CustomGuiScreen> iconPanelList = new ArrayList<CustomGuiScreen>();
    private final List<Class6664> field20894 = new ArrayList<Class6664>();
    private final List<CustomGuiScreen> field20916 = new ArrayList<CustomGuiScreen>();
    private final List<CustomGuiScreen> field20918 = new ArrayList<CustomGuiScreen>();
    private final List<Class7914> field20920 = new ArrayList<Class7914>();
    private final List<Class8867> field20921 = new ArrayList<Class8867>();
    private final List<Class9781> field20922 = new ArrayList<Class9781>();
    private final List<Class8446> field20923 = new ArrayList<Class8446>();
    private final List<Class7381> field20924 = new ArrayList<Class7381>();
    public String name;
    public CustomGuiScreen screen;
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
    public TrueTypeFont font;
    public ColorHelper textColor;
    private final ArrayList<Runnable> field20915 = new ArrayList<Runnable>();
    private boolean field20917;
    private CustomGuiScreen field20919;
    private int field20925;
    private int field20926;

    public CustomGuiScreen(CustomGuiScreen screen, String name) {
        this(screen, name, 0, 0, 0, 0);
    }

    public CustomGuiScreen(CustomGuiScreen screen, String name, int var3, int var4, int var5, int var6) {
        this(screen, name, var3, var4, var5, var6, ColorHelper.field27961);
    }

    public CustomGuiScreen(CustomGuiScreen screen, String name, int var3, int var4, int var5, int var6, ColorHelper var7) {
        this(screen, name, var3, var4, var5, var6, var7, null);
    }

    public CustomGuiScreen(CustomGuiScreen screen, String name, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
        this(screen, name, var3, var4, var5, var6, var7, var8, ResourceRegistry.JelloLightFont25);
    }

    public CustomGuiScreen(CustomGuiScreen screenIn, String nameIn, int x, int y, int width, int height, ColorHelper color, String var8, TrueTypeFont font) {
        this.name = nameIn;
        this.screen = screenIn;
        this.xA = x;
        this.yA = y;
        this.widthA = width;
        this.heightA = height;
        this.field20912 = var8;
        this.textColor = color;
        this.font = font;
        this.field20903 = true;
        this.field20904 = true;
        this.field20910 = true;
        this.field20911 = false;
    }

    private void method13220() {
        for (CustomGuiScreen var5 : new ArrayList<CustomGuiScreen>(this.iconPanelList)) {
            if (var5.method13291()) {
                this.iconPanelList.remove(var5);
                this.iconPanelList.add(var5);
            }

            if (var5.method13293()) {
                this.iconPanelList.remove(var5);
                this.iconPanelList.add(0, var5);
            }
        }
    }

    public CustomGuiScreen method13221(String var1) {
        for (CustomGuiScreen var5 : this.iconPanelList) {
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
        for (CustomGuiScreen var4 : this.field20918) {
            this.iconPanelList.remove(var4);
            if (this.field20919 == var4) {
                this.field20919 = null;
            }
        }

        this.field20916.clear();

        for (CustomGuiScreen var6 : this.field20916) {
            this.iconPanelList.add(var6);
        }

        this.field20916.clear();
        if (this.field20919 != null) {
            this.iconPanelList.remove(this.field20919);
            this.iconPanelList.add(this.field20919);
        }

        this.method13220();
    }

    public void method13028(int var1, int var2) {
        this.field20926 = var2;
        this.field20925 = var1;
        this.field20908 = this.method13289() && this.method13229(var1, var2);


        for (Runnable var6 : this.field20915) {
            if (var6 != null) {
                var6.run();
            }
        }

        this.field20915.clear();
        this.field20917 = true;

        try {
            for (CustomGuiScreen var10 : this.iconPanelList) {
                var10.method13028(var1, var2);
            }
        } catch (ConcurrentModificationException var7) {
            Client.getClientLogger().error("FUCK! Why does this shit happen"); //What happens?
        }

        this.field20909 = this.field20909 & this.field20908;

        for (Class6664 var11 : this.method13260()) {
            if (this.field20903) {
                var11.method20320(this, this.getScreen());
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
        GlStateManager.enableAlphaTest();
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glTranslatef((float) this.getXA(), (float) this.getYA(), 0.0F);

        for (CustomGuiScreen var5 : this.iconPanelList) {
            if (var5.method13287()) {
                GL11.glPushMatrix();
                var5.draw(var1);
                GL11.glPopMatrix();
            }
        }
    }

    public boolean method13227() {
        for (CustomGuiScreen var4 : this.method13241()) {
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
        for (CustomGuiScreen var5 : this.iconPanelList) {
            if (var5.isHovered() && var5.method13287()) {
                var5.method13103(var1);
            }
        }
    }

    @Override
    public void charTyped(char typed) {
        for (CustomGuiScreen var5 : this.iconPanelList) {
            if (var5.isHovered() && var5.method13287()) {
                var5.charTyped(typed);
            }
        }

        this.method13256(typed);
    }

    @Override
    public void keyPressed(int keyCode) {
        for (CustomGuiScreen var5 : this.iconPanelList) {
            if (var5.isHovered() && var5.method13287()) {
                var5.keyPressed(keyCode);
            }
        }

        this.method13254(keyCode);
    }

    @Override
    public boolean onClick(int mouseX, int mouseY, int mouseButton) {
        boolean var6 = false;

        for (int var7 = this.iconPanelList.size() - 1; var7 >= 0; var7--) {
            CustomGuiScreen var8 = this.iconPanelList.get(var7);
            boolean var9 = var8.getScreen() != null
                    && var8.getScreen() instanceof Class4339
                    && var8.getScreen().method13114(mouseX, mouseY)
                    && var8.getScreen().method13287()
                    && var8.getScreen().isHovered();
            if (var6 || !var8.isHovered() || !var8.method13287() || !var8.method13114(mouseX, mouseY) && !var9) {
                var8.method13145(false);
                if (var8 != null) {
                    for (CustomGuiScreen var12 : var8.method13241()) {
                        var12.method13145(false);
                    }
                }
            } else {
                var8.onClick(mouseX, mouseY, mouseButton);
                var6 = !var9;
            }
        }

        if (!var6) {
            this.field20909 = this.field20908 = true;
            this.method13242();
            this.method13248(mouseButton);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void onClick2(int mouseX, int mouseY, int mouseButton) {
        this.field20908 = this.method13114(mouseX, mouseY);

        for (CustomGuiScreen var7 : this.iconPanelList) {
            if (var7.isHovered() && var7.method13287()) {
                var7.onClick2(mouseX, mouseY, mouseButton);
            }
        }

        this.method13250(mouseButton);
        if (this.method13212() && this.method13298()) {
            this.onClick3(mouseX, mouseY, mouseButton);
        }

        this.field20909 = false;
    }

    @Override
    public void onClick3(int mouseX, int mouseY, int mouseButton) {
        this.method13252(mouseButton);
    }

    @Override
    public void onScrolling(float scroll) {
        for (CustomGuiScreen var5 : this.iconPanelList) {
            if (var5.isHovered() && var5.method13287()) {
                var5.onScrolling(scroll);
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
        if (var6 && this.screen != null) {
            if (var3) {
                for (CustomGuiScreen var8 : this.method13241()) {
                    if (var8.method13287() && var8.method13114(var1, var2)) {
                        return false;
                    }
                }
            }

            CustomGuiScreen var11 = this;

            for (CustomGuiScreen var12 = this.getScreen(); var12 != null; var12 = var12.getScreen()) {
                for (int var9 = var12.method13240(var11) + 1; var9 < var12.method13241().size(); var9++) {
                    CustomGuiScreen var10 = var12.method13241().get(var9);
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

    public void addToList(CustomGuiScreen var1) {
        if (var1 != null) {
            for (CustomGuiScreen var5 : this.method13241()) {
                if (var5.method13257().equals(var1.method13257())) {
                    System.out.println("Children with duplicate IDs! Child with id \"" + var5.method13257() + "\" already exists in view \"" + this.method13257() + "\"!");
                    return;
                }
            }

            var1.setScreen(this);
            if (this.field20917) {
                this.field20916.add(var1);
            } else {
                try {
                    this.iconPanelList.add(var1);
                } catch (ConcurrentModificationException var6) {
                    this.field20916.add(var1);
                }
            }
        }
    }

    public boolean method13231(String var1) {
        for (CustomGuiScreen var5 : this.method13241()) {
            if (var5.method13257().equals(var1)) {
                return true;
            }
        }

        return false;
    }

    public void method13232(CustomGuiScreen var1) {
        if (var1 != null) {
            for (CustomGuiScreen var5 : this.method13241()) {
                if (var5.method13257().equals(var1.method13257())) {
                    throw new RuntimeException("Children with duplicate IDs!");
                }
            }

            var1.setScreen(this);
            this.field20916.add(var1);
        }
    }

    public void method13233(CustomGuiScreen var1) {
        if (var1 != null) {
            for (CustomGuiScreen var5 : this.method13241()) {
                if (var5.method13257().equals(var1.method13257())) {
                    throw new RuntimeException("Children with duplicate IDs!");
                }
            }

            var1.setScreen(this);

            try {
                this.iconPanelList.add(var1);
            } catch (ConcurrentModificationException var6) {
            }
        }
    }

    public void method13234(CustomGuiScreen var1) {
        if (this.field20917) {
            this.field20918.add(var1);
        } else {
            this.method13236(var1);
        }
    }

    public void method13236(CustomGuiScreen guiIn) {
        this.iconPanelList.remove(guiIn);
        if (this.field20919 != null && this.field20919.equals(guiIn)) {
            this.field20919 = null;
        }

        this.field20916.remove(guiIn);
    }

    public void method13237(CustomGuiScreen var1) {
        for (CustomGuiScreen var5 : this.method13241()) {
            if (var5.name.equals(var1.name)) {
                this.method13234(var5);
            }
        }
    }

    public void method13238() {
        this.iconPanelList.clear();
    }

    public boolean method13239(CustomGuiScreen var1) {
        return this.iconPanelList.contains(var1);
    }

    public int method13240(CustomGuiScreen var1) {
        return this.iconPanelList.indexOf(var1);
    }

    public List<CustomGuiScreen> method13241() {
        return this.iconPanelList;
    }

    public void method13242() {
        this.method13145(true);
        if (this.screen != null) {
            this.screen.field20919 = this;
            this.screen.method13242();
        }
    }

    public void method13243() {
        for (CustomGuiScreen var4 : this.screen.method13241()) {
            if (var4 == this) {
                return;
            }

            var4.method13242();
        }
    }

    public void method13244() {
        this.iconPanelList.clear();
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

            var1.put("index", this.screen == null ? 0 : this.screen.method13240(this));
            return this.method13245(var1);
        } else {
            return var1;
        }
    }

    public final JSONObject method13245(JSONObject var1) {
        JSONArray var4 = new JSONArray();

        for (CustomGuiScreen var6 : this.iconPanelList) {
            if (var6.method13299()) {
                JSONObject var7 = var6.method13160(new JSONObject());
                if (var7.length() > 0) {
                    var4.put(var7);
                }
            }
        }

        var1.put("children", var4);
        return var1;
    }

    public void method13161(JSONObject var1){
        if (this.method13299()) {
            this.xA = CJsonUtils.getIntOrDefault(var1, "x", this.xA);
            this.yA = CJsonUtils.getIntOrDefault(var1, "y", this.yA);
            if (this.method13301()) {
                this.widthA = CJsonUtils.getIntOrDefault(var1, "width", this.widthA);
                this.heightA = CJsonUtils.getIntOrDefault(var1, "height", this.heightA);
            }

            JSONArray var4 = CJsonUtils.getJSONArrayOrNull(var1, "children");
            Iterator<String> var5 = var1.keySet().iterator();
            if (var4 != null) {
                List<CustomGuiScreen> var6 = new ArrayList<>(this.iconPanelList);

                for (int var7 = 0; var7 < var4.length(); var7++) {
                    JSONObject var8 = null;
                    try {
                        var8 = var4.getJSONObject(var7);
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                    String var9 = CJsonUtils.getStringOrDefault(var8, "id", null);
                    int var10 = CJsonUtils.getIntOrDefault(var8, "index", -1);

                    for (CustomGuiScreen var12 : var6) {
                        if (var12.method13257().equals(var9)) {
                            var12.method13161(var8);
                            if (var10 >= 0) {
                                this.iconPanelList.remove(var12);
                                if (var10 > this.iconPanelList.size()) {
                                    this.iconPanelList.add(var12);
                                } else {
                                    this.iconPanelList.add(var10, var12);
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
            if (!(var1 instanceof CustomGuiScreen)) {
                return false;
            } else {
                CustomGuiScreen var4 = (CustomGuiScreen) var1;
                return this.name.equals(var4.name) && (this.getScreen() == null || this.getScreen().equals(var4.getScreen()));
            }
        } else {
            return true;
        }
    }

    public void method13246(Class7261 var1) {
        var1.method22796(this);
    }

    public final CustomGuiScreen method13247(Class7914 var1) {
        this.field20920.add(var1);
        return this;
    }

    public void method13248(int var1) {
        for (Class7914 var5 : this.field20920) {
            var5.method26544(this, var1);
        }
    }

    public CustomGuiScreen method13249(Class8867 var1) {
        this.field20921.add(var1);
        return this;
    }

    public void method13250(int var1) {
        for (Class8867 var5 : this.field20921) {
            var5.method32268(this, var1);
        }
    }

    public CustomGuiScreen doThis(Class9781 var1) {
        this.field20922.add(var1);
        return this;
    }

    public void method13252(int var1) {
        if (name.equals("Item3") && field20912.equals("Yes")) {
            Client.getInstance().getNetworkManager().account = null; // This is so fucking bad code but who cares :trol:
        }
        for (Class9781 var5 : this.field20922) {
            var5.method38555(this, var1);
        }
    }

    public final CustomGuiScreen onType(Class8446 var1) {
        this.field20923.add(var1);
        return this;
    }

    public void method13254(int var1) {
        for (Class8446 var5 : this.field20923) {
            var5.method29709(this, var1);
        }
    }

    public void method13256(char var1) {
        for (Class7381 var5 : this.field20924) {
            var5.method23497(var1);
        }
    }

    public String method13257() {
        return this.name;
    }

    public CustomGuiScreen getScreen() {
        return this.screen;
    }

    public void setScreen(CustomGuiScreen screenIn) {
        this.screen = screenIn;
    }

    public List<Class6664> method13260() {
        return this.field20894;
    }

    public void setSize(Class6664 var1) {
        this.field20894.add(var1);
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
        return this.screen == null ? this.xA : this.screen.method13271() + this.xA;
    }

    public int method13272() {
        return this.screen == null ? this.yA : this.screen.method13272() + this.yA;
    }

    public float method13273() {
        return this.field20899;
    }

    public float method13275() {
        return this.field20900;
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

    public int method13282() {
        return this.field20902;
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

    public void setEnabled(boolean var1) {
        this.field20903 = var1;
    }

    public boolean method13289() {
        return this.screen == null ? this.field20903 : this.field20903 && this.screen.method13289();
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

    public String getTypedText() {
        return this.field20912;
    }

    public void method13304(String var1) {
        this.field20912 = var1;
    }

    public TrueTypeFont getFont() {
        return this.font;
    }

    public void setFont(TrueTypeFont var1) {
        this.font = var1;
    }

    public ColorHelper getTextColor() {
        return this.textColor;
    }

    public void method13308(ColorHelper var1) {
        this.textColor = var1;
    }

    public int getHeightO() {
        return this.field20925;
    }

    public int getWidthO() {
        return this.field20926;
    }
}
