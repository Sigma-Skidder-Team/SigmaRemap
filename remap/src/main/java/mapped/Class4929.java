// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Class4929 extends Class4800
{
    public static long field21087;
    private int field21088;
    private int field21089;
    private boolean field21090;
    public Class4811 field21091;
    public Class4812 field21092;
    public Class4806 field21093;
    private Class9572 field21094;
    private Class9572 field21095;
    private Class9572 field21096;
    private static Class7776 field21097;
    public List<Class4804> field21098;
    public static float field21099;
    public Class4907 field21100;
    public Class4907 field21101;
    
    public Class4929() {
        super("Main Screen");
        this.field21088 = 0;
        this.field21089 = 0;
        this.field21090 = true;
        this.field21094 = new Class9572(200, 200, Class2186.field12965);
        this.field21095 = new Class9572(325, 325);
        this.field21096 = new Class9572(800, 800);
        this.field21098 = new ArrayList<Class4804>();
        this.method14311(false);
        Class4929.field21087 = System.nanoTime();
        if (Class4929.field21097 == null) {
            Class4929.field21097 = Class7853.method25396("com/mentalfrostbyte/gui/resources/" + Class7853.method25397(), 0.075f, 8);
        }
        this.field21095.method35855(Class2186.field12965);
        this.field21096.method35855(Class2186.field12965);
        final int n = Minecraft.method5277().field4632.method7694() * Minecraft.method5277().field4632.method7695() / 14000;
        final Random random = new Random();
        for (int i = 0; i < n; ++i) {
            this.field21098.add(new Class4804(this, Integer.toString(i), random.nextInt(Minecraft.method5277().field4632.method7694()), random.nextInt(Minecraft.method5277().field4632.method7695()), 7 + random.nextInt(5), (1 + random.nextInt(4)) * (random.nextBoolean() ? -1 : 1), 1 + random.nextInt(2)));
        }
        this.method14239(this.field21091 = new Class4811(this, "main", 0, 0, this.field20480, this.field20481));
        this.method14239(this.field21092 = new Class4812(this, "changelog", 0, 0, this.field20480, this.field20481));
        this.method14239(this.field21093 = new Class4806(this, "redeem", 0, 0, this.field20480, this.field20481));
        this.field21092.method14305(false);
        this.field21092.method14303(true);
        this.field21093.method14305(false);
        this.field21093.method14303(true);
    }
    
    public void method14790() {
        this.field21094.method35855(Class2186.field12965);
        this.field21092.method14305(false);
        this.field21093.method14305(false);
        this.field21093.method14301(false);
        this.field21093.method14303(true);
    }
    
    public void method14791() {
        this.field21094.method35855(Class2186.field12964);
        this.field21092.method14305(true);
    }
    
    public void method14792() {
        this.field21094.method35855(Class2186.field12964);
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
    public void method14205(final float n) {
        float n2 = Class8468.method28270(this.field21094.method35858(), 0.0f, 1.0f, 1.0f);
        if (this.field21094.method35857() == Class2186.field12965) {
            n2 = Class8468.method28269(this.field21094.method35858(), 0.0f, 1.0f, 1.0f);
        }
        final float n3 = 0.07f * n2;
        this.field21091.method14288(1.0f - n3, 1.0f - n3);
        this.field21091.method14305(this.field21094.method35858() == 0.0f);
        Class4929.field21099 = Math.min(10.0f, Math.max(0.0f, (System.nanoTime() - Class4929.field21087) / 1.810361E7f / 2.0f));
        Class4929.field21087 = System.nanoTime();
        final int field21089 = -this.method14320();
        final float n4 = this.method14321() / (float)this.method14276() * -114.0f;
        if (this.field21090) {
            this.field21088 = (int)n4;
            this.field21089 = field21089;
            this.field21090 = false;
        }
        final float n5 = n4 - this.field21088;
        final float n6 = (float)(field21089 - this.field21089);
        if (Minecraft.method5277().field4701 == null) {
            this.field21095.method35855(Class2186.field12964);
            this.field21096.method35855(Class2186.field12964);
            final float n7 = 0.5f - this.field21089 / (float) Minecraft.method5277().field4632.method7694() * -1.0f;
            final float n8 = 1.0f - this.field21095.method35858();
            final float n9 = 1.0f - this.field21096.method35858();
            if (Class9463.method35173().method35185()) {}
            final float n10 = this.method14276() / 1920.0f;
            final int n11 = (int)(600.0f * n10);
            final int n12 = (int)(450.0f * n10);
            final int n13 = 0;
            Class8154.method26905(this.field21089 - n11 * n7, (float)this.field21088, (float)(this.method14276() * 2 + n11), (float)(this.method14278() + 114), Class7853.field32221);
            Class8154.method26905(this.field21089 - n12 * n7, (float)this.field21088, (float)(this.method14276() * 2 + n12), (float)(this.method14278() + 114), Class7853.field32222);
            for (final Class4803 class4803 : this.field21098) {
                GL11.glPushMatrix();
                class4803.method14205(n);
                GL11.glPopMatrix();
            }
            Class8154.method26905(this.field21089 - n13 * n7, (float)this.field21088, (float)(this.method14276() * 2 + n13), (float)(this.method14278() + 114), Class7853.field32220);
            final Class7776 field21090 = Class7853.field32160;
            field21090.method24918();
            field21090.method24917();
            if (Class9000.field37993 > 1.0f) {
                final Class7776 field21091 = Class7853.field32161;
            }
            Class8154.method26900((float)this.field21089, (float)(this.field21088 - 50), (float)(this.method14276() * 2), (float)(this.method14278() + 200), Class4929.field21097, Class6430.method19118(Class265.field1278.field1292, n2), false);
            Class8154.method26874(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1273.field1292, n2 * 0.3f));
            for (final Class4803 class4804 : this.method14250()) {
                if (!class4804.method14296()) {
                    continue;
                }
                GL11.glPushMatrix();
                if (class4804 instanceof Class4812) {
                    if (n2 > 0.0f) {
                        class4804.method14205(n);
                    }
                }
                else {
                    class4804.method14205(n * (1.0f - n2));
                }
                GL11.glPopMatrix();
            }
            if (n9 > 0.0f) {
                if (Class9463.method35173().method35185()) {
                    Class568.method3314(n8, 1.0f);
                    Class9463.method35173().method35186(false);
                }
            }
            Class4929.field21099 *= 0.7f;
            Class4929.field21099 = Math.min(Class4929.field21099, 1.0f);
            if (!this.field21090) {
                if (n9 != 0.0f) {
                    if (this.field21088 == 0) {
                        if (this.field21089 == 0) {
                            return;
                        }
                    }
                }
                if (n4 != this.field21088) {
                    this.field21088 += (int)(n5 * Class4929.field21099);
                }
                if (field21089 != this.field21089) {
                    this.field21089 += (int)(n6 * Class4929.field21099);
                }
            }
            return;
        }
        if (n4 != this.field21088) {
            this.field21088 += (int)(n5 * Class4929.field21099);
        }
        if (field21089 != this.field21089) {
            this.field21089 += (int)(n6 * Class4929.field21099);
        }
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            this.method14790();
        }
    }
    
    public void method14793() {
        if (this.field21100 == null) {
            this.method14225(() -> {
                final ArrayList list = new ArrayList();
                list.add(new Class7976(Class294.field1678, "Agora", 45));
                list.add(new Class7976(Class294.field1675, "Agora is not yet available...", 35));
                list.add(new Class7976(Class294.field1677, "Ok", 55));
                final Class4907 field21100 = new Class4907(this, "music", true, "Dependencies.", (Class7976[])list.toArray(new Class7976[0]));
                this.method14242(this.field21100 = field21100);
                this.field21100.method14745(class4841 -> new Thread(() -> {
                    try {
                        Thread.sleep(114L);
                        this.method14225(() -> {
                            this.method14245(this.field21100);
                            this.field21100 = null;
                        });
                    }
                    catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start());
                this.field21100.method14744(true);
            });
        }
    }
    
    public void method14794() {
        if (this.field21101 == null) {
            this.method14225(() -> {
                final ArrayList list = new ArrayList();
                list.add(new Class7976(Class294.field1678, "Logout", 45));
                list.add(new Class7976(Class294.field1675, "Are you sure?", 35));
                list.add(new Class7976(Class294.field1677, "Yes", 55));
                final Class4907 field21101 = new Class4907(this, "music", true, "Dependencies.", (Class7976[])list.toArray(new Class7976[0]));
                this.method14242(this.field21101 = field21101);
                this.field21101.method14745(class4841 -> new Thread(() -> {
                    try {
                        Thread.sleep(114L);
                        this.method14225(() -> {
                            this.method14245(this.field21101);
                            this.field21101 = null;
                        });
                    }
                    catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start());
                this.field21101.method14516(class4841 -> Class9463.method35173().method35201().method19348());
                this.field21101.method14744(true);
            });
        }
    }
    
    static {
        Class4929.field21087 = 0L;
    }
}
