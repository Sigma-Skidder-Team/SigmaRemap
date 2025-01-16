// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import javax.annotation.Nullable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.glfw.GLFWImage$Buffer;
import java.nio.IntBuffer;
import java.io.IOException;
import org.lwjgl.stb.STBImage;
import org.lwjgl.glfw.GLFWImage;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.MemoryStack;
import java.util.function.BiConsumer;
import org.lwjgl.opengl.GL;
import org.lwjgl.glfw.GLFW;
import java.util.Optional;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.apache.logging.log4j.Logger;

public final class Class1925 implements AutoCloseable
{
    private static final Logger field10476;
    private final GLFWErrorCallback field10477;
    private final Class870 field10478;
    private final Class8282 field10479;
    private final long field10480;
    private int field10481;
    private int field10482;
    private int field10483;
    private int field10484;
    private Optional<Class8680> field10485;
    private boolean field10486;
    private boolean field10487;
    private int field10488;
    private int field10489;
    private int field10490;
    private int field10491;
    private int field10492;
    private int field10493;
    private int field10494;
    private int field10495;
    private double field10496;
    private String field10497;
    private boolean field10498;
    private int field10499;
    private boolean field10500;
    private boolean field10501;
    
    public Class1925(final Class870 field10478, final Class8282 field10479, final Class9154 class9154, final String s, final String s2) {
        this.field10477 = GLFWErrorCallback.create(this::method7670);
        this.field10497 = "";
        RenderSystem.method29989(RenderSystem::method29990);
        this.field10479 = field10479;
        this.method7668();
        this.method7667("Pre startup");
        this.field10478 = field10478;
        final Optional<Class8680> method29725 = Class8680.method29725(s);
        if (!method29725.isPresent()) {
            if (class9154.field38789.isPresent() && class9154.field38790.isPresent()) {
                this.field10485 = Optional.of(new Class8680(class9154.field38789.getAsInt(), class9154.field38790.getAsInt(), 8, 8, 8, 60));
            }
            else {
                this.field10485 = Optional.empty();
            }
        }
        else {
            this.field10485 = method29725;
        }
        final boolean field10480 = class9154.field38791;
        this.field10486 = field10480;
        this.field10487 = field10480;
        final Class7646 method29726 = field10479.method27520(GLFW.glfwGetPrimaryMonitor());
        final int n = (class9154.field38787 <= 0) ? 1 : class9154.field38787;
        this.field10490 = n;
        this.field10483 = n;
        final int n2 = (class9154.field38788 <= 0) ? 1 : class9154.field38788;
        this.field10491 = n2;
        this.field10484 = n2;
        GLFW.glfwDefaultWindowHints();
        if (Config.method28926()) {
            GLFW.glfwWindowHint(135181, Config.method28925());
        }
        Class9000.method32149();
        GLFW.glfwWindowHint(139265, 196609);
        GLFW.glfwWindowHint(139275, 221185);
        GLFW.glfwWindowHint(139266, 2);
        GLFW.glfwWindowHint(139267, 0);
        GLFW.glfwWindowHint(139272, 0);
        if (!Class9570.field41210.method22605()) {
            this.field10480 = GLFW.glfwCreateWindow(this.field10490, this.field10491, (CharSequence)s2, (this.field10486 && method29726 != null) ? method29726.method24213() : 0L, 0L);
        }
        else {
            this.field10480 = Class9570.method35822(Class9570.method35827(Class9570.field41209), Class9570.field41210, () -> this.field10490, () -> this.field10491, () -> s3, () -> (this.field10486 && class9155 != null) ? class9155.method24213() : 0L);
        }
        if (method29726 == null) {
            final int[] array = { 0 };
            final int[] array2 = { 0 };
            GLFW.glfwGetWindowPos(this.field10480, array, array2);
            final int n3 = array[0];
            this.field10488 = n3;
            this.field10481 = n3;
            final int n4 = array2[0];
            this.field10489 = n4;
            this.field10482 = n4;
        }
        else {
            final Class8680 method29727 = method29726.method24206(this.field10486 ? this.field10485 : Optional.empty());
            final int n5 = method29726.method24209() + method29727.method29719() / 2 - this.field10490 / 2;
            this.field10488 = n5;
            this.field10481 = n5;
            final int n6 = method29726.method24210() + method29727.method29720() / 2 - this.field10491 / 2;
            this.field10489 = n6;
            this.field10482 = n6;
        }
        GLFW.glfwMakeContextCurrent(this.field10480);
        GL.createCapabilities();
        this.method7684();
        this.method7675();
        GLFW.glfwSetFramebufferSizeCallback(this.field10480, this::method7674);
        GLFW.glfwSetWindowPosCallback(this.field10480, this::method7673);
        GLFW.glfwSetWindowSizeCallback(this.field10480, this::method7676);
        GLFW.glfwSetWindowFocusCallback(this.field10480, this::method7677);
    }
    
    public int method7662() {
        RenderSystem.method29989(RenderSystem::method29984);
        return Class8543.method28663(this);
    }
    
    public boolean method7663() {
        return Class8543.method28667(this);
    }
    
    public static void method7664(final BiConsumer<Integer, String> biConsumer) {
        RenderSystem.method29989(RenderSystem::method29990);
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final PointerBuffer mallocPointer = stackPush.mallocPointer(1);
            final int glfwGetError = GLFW.glfwGetError(mallocPointer);
            if (glfwGetError != 0) {
                final long value = mallocPointer.get();
                biConsumer.accept(glfwGetError, (value == 0L) ? "" : MemoryUtil.memUTF8(value));
            }
        }
    }
    
    public void method7665(final InputStream inputStream, final InputStream inputStream2) {
        RenderSystem.method29989(RenderSystem::method29990);
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            if (inputStream == null) {
                throw new FileNotFoundException("icons/icon_16x16.png");
            }
            if (inputStream2 == null) {
                throw new FileNotFoundException("icons/icon_32x32.png");
            }
            final IntBuffer mallocInt = stackPush.mallocInt(1);
            final IntBuffer mallocInt2 = stackPush.mallocInt(1);
            final IntBuffer mallocInt3 = stackPush.mallocInt(1);
            final GLFWImage$Buffer mallocStack = GLFWImage.mallocStack(2, stackPush);
            final ByteBuffer method7666 = this.method7666(inputStream, mallocInt, mallocInt2, mallocInt3);
            if (method7666 == null) {
                throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }
            mallocStack.position(0);
            mallocStack.width(mallocInt.get(0));
            mallocStack.height(mallocInt2.get(0));
            mallocStack.pixels(method7666);
            final ByteBuffer method7667 = this.method7666(inputStream2, mallocInt, mallocInt2, mallocInt3);
            if (method7667 == null) {
                throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }
            mallocStack.position(1);
            mallocStack.width(mallocInt.get(0));
            mallocStack.height(mallocInt2.get(0));
            mallocStack.pixels(method7667);
            mallocStack.position(0);
            GLFW.glfwSetWindowIcon(this.field10480, mallocStack);
            STBImage.stbi_image_free(method7666);
            STBImage.stbi_image_free(method7667);
        }
        catch (final IOException ex) {
            Class1925.field10476.error("Couldn't set icon", (Throwable)ex);
        }
    }
    
    @Nullable
    private ByteBuffer method7666(final InputStream inputStream, final IntBuffer intBuffer, final IntBuffer intBuffer2, final IntBuffer intBuffer3) throws IOException {
        RenderSystem.method29989(RenderSystem::method29990);
        ByteBuffer method32108 = null;
        ByteBuffer stbi_load_from_memory;
        try {
            method32108 = Class8995.method32108(inputStream);
            method32108.rewind();
            stbi_load_from_memory = STBImage.stbi_load_from_memory(method32108, intBuffer, intBuffer2, intBuffer3, 0);
        }
        finally {
            if (method32108 != null) {
                MemoryUtil.memFree((Buffer)method32108);
            }
        }
        return stbi_load_from_memory;
    }
    
    public void method7667(final String field10497) {
        this.field10497 = field10497;
        if (field10497.equals("Startup")) {
            Class8969.method31827();
        }
    }
    
    private void method7668() {
        RenderSystem.method29989(RenderSystem::method29990);
        GLFW.glfwSetErrorCallback(Class1925::method7669);
    }
    
    private static void method7669(final int i, final long n) {
        RenderSystem.method29989(RenderSystem::method29990);
        final String string = "GLFW error " + i + ": " + MemoryUtil.memUTF8(n);
        TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)(string + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."), (CharSequence)"ok", (CharSequence)"error", false);
        throw new Class2368(string, (Class9001)null);
    }
    
    public void method7670(final int i, final long n) {
        RenderSystem.method29989(RenderSystem::method29984);
        final String memUTF8 = MemoryUtil.memUTF8(n);
        Class1925.field10476.error("########## GL ERROR ##########");
        Class1925.field10476.error("@ {}", (Object)this.field10497);
        Class1925.field10476.error("{}: {}", (Object)i, (Object)memUTF8);
    }
    
    public void method7671() {
        final GLFWErrorCallback glfwSetErrorCallback = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)this.field10477);
        if (glfwSetErrorCallback != null) {
            glfwSetErrorCallback.free();
        }
        Class8969.method31826();
    }
    
    public void method7672(final boolean field10500) {
        RenderSystem.method29989(RenderSystem::method29985);
        GLFW.glfwSwapInterval((int)((this.field10500 = field10500) ? 1 : 0));
    }
    
    @Override
    public void close() {
        RenderSystem.method29989(RenderSystem::method29984);
        this.field10501 = true;
        Callbacks.glfwFreeCallbacks(this.field10480);
        this.field10477.close();
        GLFW.glfwDestroyWindow(this.field10480);
        GLFW.glfwTerminate();
    }
    
    private void method7673(final long n, final int field10488, final int field10489) {
        this.field10488 = field10488;
        this.field10489 = field10489;
    }
    
    private void method7674(final long n, final int field10492, final int field10493) {
        if (n == this.field10480) {
            final int method7692 = this.method7692();
            final int method7693 = this.method7693();
            if (field10492 != 0) {
                if (field10493 != 0) {
                    this.field10492 = field10492;
                    this.field10493 = field10493;
                    if (this.method7692() != method7692 || this.method7693() != method7693) {
                        this.field10478.method5248();
                    }
                }
            }
        }
    }
    
    private void method7675() {
        RenderSystem.method29989(RenderSystem::method29990);
        final int[] array = { 0 };
        final int[] array2 = { 0 };
        GLFW.glfwGetFramebufferSize(this.field10480, array, array2);
        this.field10492 = array[0];
        this.field10493 = array2[0];
    }
    
    private void method7676(final long n, final int field10490, final int field10491) {
        this.field10490 = field10490;
        this.field10491 = field10491;
        Class9463.method35173().method35193().method32153();
    }
    
    private void method7677(final long n, final boolean b) {
        if (n == this.field10480) {
            this.field10478.method5326(b);
        }
    }
    
    public void method7678(final int field10499) {
        this.field10499 = field10499;
    }
    
    public int method7679() {
        return this.field10499;
    }
    
    public void method7680() {
        RenderSystem.method29992(this.field10480);
        if (this.field10486 != this.field10487) {
            this.field10487 = this.field10486;
            this.method7686(this.field10500);
        }
    }
    
    public Optional<Class8680> method7681() {
        return this.field10485;
    }
    
    public void method7682(final Optional<Class8680> field10485) {
        final boolean b = !field10485.equals(this.field10485);
        this.field10485 = field10485;
        if (b) {
            this.field10498 = true;
        }
    }
    
    public void method7683() {
        if (this.field10486) {
            if (this.field10498) {
                this.field10498 = false;
                this.method7684();
                this.field10478.method5248();
            }
        }
    }
    
    private void method7684() {
        RenderSystem.method29989(RenderSystem::method29990);
        final boolean b = GLFW.glfwGetWindowMonitor(this.field10480) != 0L;
        if (!this.field10486) {
            this.field10488 = this.field10481;
            this.field10489 = this.field10482;
            this.field10490 = this.field10483;
            this.field10491 = this.field10484;
            GLFW.glfwSetWindowMonitor(this.field10480, 0L, this.field10488, this.field10489, this.field10490, this.field10491, -1);
        }
        else {
            final Class7646 method27521 = this.field10479.method27521(this);
            if (method27521 != null) {
                final Class8680 method27522 = method27521.method24206(this.field10485);
                if (!b) {
                    this.field10481 = this.field10488;
                    this.field10482 = this.field10489;
                    this.field10483 = this.field10490;
                    this.field10484 = this.field10491;
                }
                this.field10488 = 0;
                this.field10489 = 0;
                this.field10490 = method27522.method29719();
                this.field10491 = method27522.method29720();
                GLFW.glfwSetWindowMonitor(this.field10480, method27521.method24213(), this.field10488, this.field10489, this.field10490, this.field10491, method27522.method29724());
            }
            else {
                Class1925.field10476.warn("Failed to find suitable monitor for fullscreen mode");
                this.field10486 = false;
            }
        }
    }
    
    public void method7685() {
        this.field10486 = !this.field10486;
    }
    
    private void method7686(final boolean b) {
        RenderSystem.method29989(RenderSystem::method29984);
        try {
            this.method7684();
            this.field10478.method5248();
            this.method7672(b);
            this.method7680();
        }
        catch (final Exception ex) {
            Class1925.field10476.error("Couldn't toggle fullscreen", (Throwable)ex);
        }
    }
    
    public int method7687(final int n, final boolean b) {
        int i;
        for (i = 1; i != n; ++i) {
            if (i >= this.field10492) {
                break;
            }
            if (i >= this.field10493) {
                break;
            }
            if (this.field10492 / (i + 1) < 320) {
                break;
            }
            if (this.field10493 / (i + 1) < 240) {
                break;
            }
        }
        if (b) {
            if (i % 2 != 0) {
                ++i;
            }
        }
        return i;
    }
    
    public void method7688(final double field10496) {
        this.field10496 = field10496;
        final int n = (int)(this.field10492 / field10496);
        this.field10494 = ((this.field10492 / field10496 <= n) ? n : (n + 1));
        final int n2 = (int)(this.field10493 / field10496);
        this.field10495 = ((this.field10493 / field10496 <= n2) ? n2 : (n2 + 1));
    }
    
    public void method7689(final String s) {
        GLFW.glfwSetWindowTitle(this.field10480, (CharSequence)s);
    }
    
    public long method7690() {
        return this.field10480;
    }
    
    public boolean method7691() {
        return this.field10486;
    }
    
    public int method7692() {
        return this.field10492;
    }
    
    public int method7693() {
        return this.field10493;
    }
    
    public int method7694() {
        return this.field10490;
    }
    
    public int method7695() {
        return this.field10491;
    }
    
    public int method7696() {
        return this.field10494;
    }
    
    public int method7697() {
        return this.field10495;
    }
    
    public int method7698() {
        return this.field10488;
    }
    
    public int method7699() {
        return this.field10489;
    }
    
    public double method7700() {
        return this.field10496;
    }
    
    @Nullable
    public Class7646 method7701() {
        return this.field10479.method27521(this);
    }
    
    public void method7702(final boolean b) {
        Class8341.method27803(this.field10480, b);
    }
    
    public void method7703(final int n, final int n2) {
        this.method7674(this.field10480, n, n2);
    }
    
    public boolean method7704() {
        return this.field10501;
    }
    
    static {
        field10476 = LogManager.getLogger();
    }
}
