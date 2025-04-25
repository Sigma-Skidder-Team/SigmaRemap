// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import org.lwjgl.opengl.GL11;
import slick2d.Texture;

import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class MainMenuScreen extends Class4800 {
    public static long field21087;
    private int field21088;
    private int field21089;
    private boolean field21090;
    public Class4811 field21091;
    public Class4812 field21092;
    public RedeemKeyScreen field21093;
    private Animation field21094;
    private Animation field21095;
    private Animation field21096;
    private static Texture field21097;
    public List<Class4804> field21098;
    public static float field21099;
    public Class4907 field21100;
    public Class4907 field21101;

    public MainMenuScreen() {
        super("Main Screen");
        this.field21088 = 0;
        this.field21089 = 0;
        this.field21090 = true;
        this.field21094 = new Animation(200, 200, Direction.FORWARDS);
        this.field21095 = new Animation(325, 325);
        this.field21096 = new Animation(800, 800);
        this.field21098 = new ArrayList<Class4804>();
        this.setListening(false);
        MainMenuScreen.field21087 = System.nanoTime();
        if (MainMenuScreen.field21097 == null) {
            MainMenuScreen.field21097 = ClientAssets.method25396("com/mentalfrostbyte/gui/resources/" + ClientAssets.getPanorama(), 0.075f, 8);
        }
        this.field21095.changeDirection(Direction.FORWARDS);
        this.field21096.changeDirection(Direction.FORWARDS);
        final int n = Minecraft.getInstance().window.method7694() * Minecraft.getInstance().window.method7695() / 14000;
        final Random random = new Random();
        for (int i = 0; i < n; ++i) {
            this.field21098.add(new Class4804(this, Integer.toString(i), random.nextInt(Minecraft.getInstance().window.method7694()), random.nextInt(Minecraft.getInstance().window.method7695()), 7 + random.nextInt(5), (1 + random.nextInt(4)) * (random.nextBoolean() ? -1 : 1), 1 + random.nextInt(2)));
        }
        this.addToList(this.field21091 = new Class4811(this, "main", 0, 0, this.field20480, this.field20481));
        this.addToList(this.field21092 = new Class4812(this, "changelog", 0, 0, this.field20480, this.field20481));
        this.addToList(this.field21093 = new RedeemKeyScreen(this, "redeem", 0, 0, this.field20480, this.field20481));
        this.field21092.method14305(false);
        this.field21092.method14303(true);
        this.field21093.method14305(false);
        this.field21093.method14303(true);
    }

    public void goOut() {
        this.field21094.changeDirection(Direction.FORWARDS);
        this.field21092.method14305(false);
        this.field21093.method14305(false);
        this.field21093.method14301(false);
        this.field21093.method14303(true);
    }

    public void method14791() {
        this.field21094.changeDirection(Direction.BACKWARDS);
        this.field21092.method14305(true);
    }

    public void method14792() {
        this.field21094.changeDirection(Direction.BACKWARDS);
        this.field21093.method14305(true);
        this.field21093.method14301(true);
        this.field21093.method14303(false);
    }

    @Override
    public void method14200(final int n, final int n2) {
        final Iterator<Class4804> iterator = this.field21098.iterator();
        while (iterator.hasNext()) {
            iterator.next().method14200(n, n2);
        }
        super.method14200(n, n2);
    }

    @Override
    public void draw(final float n) {
        float n2 = Class8468.method28270(this.field21094.calcPercent(), 0.0f, 1.0f, 1.0f);
        if (this.field21094.getDirection() == Direction.FORWARDS) {
            n2 = Class8468.method28269(this.field21094.calcPercent(), 0.0f, 1.0f, 1.0f);
        }
        final float n3 = 0.07f * n2;
        this.field21091.method14288(1.0f - n3, 1.0f - n3);
        this.field21091.method14305(this.field21094.calcPercent() == 0.0f);
        MainMenuScreen.field21099 = Math.min(10.0f, Math.max(0.0f, (System.nanoTime() - MainMenuScreen.field21087) / 1.810361E7f / 2.0f));
        MainMenuScreen.field21087 = System.nanoTime();
        final int field21089 = -this.method14320();
        final float n4 = this.method14321() / (float) this.method14276() * -114.0f;
        if (this.field21090) {
            this.field21088 = (int) n4;
            this.field21089 = field21089;
            this.field21090 = false;
        }
        final float n5 = n4 - this.field21088;
        final float n6 = (float) (field21089 - this.field21089);
        if (Minecraft.getInstance().field4701 == null) {
            this.field21095.changeDirection(Direction.BACKWARDS);
            this.field21096.changeDirection(Direction.BACKWARDS);
            final float n7 = 0.5f - this.field21089 / (float) Minecraft.getInstance().window.method7694() * -1.0f;
            final float n8 = 1.0f - this.field21095.calcPercent();
            final float n9 = 1.0f - this.field21096.calcPercent();
            final float n10 = this.method14276() / 1920.0f;
            final int n11 = (int) (600.0f * n10);
            final int n12 = (int) (450.0f * n10);
            final int n13 = 0;
            RenderUtil.method26905(this.field21089 - n11 * n7, (float) this.field21088, (float) (this.method14276() * 2 + n11), (float) (this.method14278() + 114), ClientAssets.background);
            RenderUtil.method26905(this.field21089 - n12 * n7, (float) this.field21088, (float) (this.method14276() * 2 + n12), (float) (this.method14278() + 114), ClientAssets.middle);
            for (final CustomGuiScreen customGuiScreen : this.field21098) {
                GL11.glPushMatrix();
                customGuiScreen.draw(n);
                GL11.glPopMatrix();
            }
            RenderUtil.method26905(this.field21089 - n13 * n7, (float) this.field21088, (float) (this.method14276() * 2 + n13), (float) (this.method14278() + 114), ClientAssets.foreground);
            final Texture field21090 = ClientAssets.logo_large;
            field21090.getImageWidth();
            field21090.getImageHeight();
            if (ScreenManager.guiScale > 1.0f) {
                final Texture field21091 = ClientAssets.logo_large2x;
            }
            RenderUtil.method26900((float) this.field21089, (float) (this.field21088 - 50), (float) (this.method14276() * 2), (float) (this.method14278() + 200), MainMenuScreen.field21097, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n2), false);
            RenderUtil.method26874(0.0f, 0.0f, (float) this.method14276(), (float) this.method14278(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n2 * 0.3f));
            for (final CustomGuiScreen class4804 : this.method14250()) {
                if (!class4804.method14296()) {
                    continue;
                }
                GL11.glPushMatrix();
                if (class4804 instanceof Class4812) {
                    if (n2 > 0.0f) {
                        class4804.draw(n);
                    }
                } else {
                    class4804.draw(n * (1.0f - n2));
                }
                GL11.glPopMatrix();
            }
            if (n9 > 0.0f) {
                Class568.method3314(n8, 1.0f);
            }
            MainMenuScreen.field21099 *= 0.7f;
            MainMenuScreen.field21099 = Math.min(MainMenuScreen.field21099, 1.0f);
            if (!this.field21090) {
                if (n9 != 0.0f) {
                    if (this.field21088 == 0) {
                        if (this.field21089 == 0) {
                            return;
                        }
                    }
                }
                if (n4 != this.field21088) {
                    this.field21088 += (int) (n5 * MainMenuScreen.field21099);
                }
                if (field21089 != this.field21089) {
                    this.field21089 += (int) (n6 * MainMenuScreen.field21099);
                }
            }
            return;
        }
        if (n4 != this.field21088) {
            this.field21088 += (int) (n5 * MainMenuScreen.field21099);
        }
        if (field21089 != this.field21089) {
            this.field21089 += (int) (n6 * MainMenuScreen.field21099);
        }
    }

    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            this.goOut();
        }
    }

    public void method14793() {
        if (this.field21100 == null) {
            this.runThisOnDimensionUpdate(() -> {
                final ArrayList list = new ArrayList();
                list.add(new Class7976(Class294.field1678, "Agora", 45));
                list.add(new Class7976(Class294.field1675, "Agora is not yet available...", 35));
                list.add(new Class7976(Class294.field1677, "Ok", 55));
                final Class4907 field21100 = new Class4907(this, "music", true, "Dependencies.", (Class7976[]) list.toArray(new Class7976[0]));
                this.method14242(this.field21100 = field21100);
                this.field21100.method14745(class4841 -> new Thread(() -> {
                    try {
                        Thread.sleep(114L);
                        this.runThisOnDimensionUpdate(() -> {
                            this.method14245(this.field21100);
                            this.field21100 = null;
                        });
                    } catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start());
                this.field21100.method14744(true);
            });
        }
    }

    public void method14794() {
        if (this.field21101 == null) {
            this.runThisOnDimensionUpdate(() -> {
                final ArrayList list = new ArrayList();
                list.add(new Class7976(Class294.field1678, "Logout", 45));
                list.add(new Class7976(Class294.field1675, "Are you sure?", 35));
                list.add(new Class7976(Class294.field1677, "Yes", 55));
                final Class4907 field21101 = new Class4907(this, "music", true, "Dependencies.", (Class7976[]) list.toArray(new Class7976[0]));
                this.method14242(this.field21101 = field21101);
                this.field21101.method14745(class4841 -> new Thread(() -> {
                    try {
                        Thread.sleep(114L);
                        this.runThisOnDimensionUpdate(() -> {
                            this.method14245(this.field21101);
                            this.field21101 = null;
                        });
                    } catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start());
                this.field21101.method14516(class4841 -> Client.getInstance().getNetworkManager().resetLicense());
                this.field21101.method14744(true);
            });
        }
    }

    static {
        MainMenuScreen.field21087 = 0L;
    }
}
