package net.minecraft.client.renderer;

public class Rectangle2d
{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle2d(int p_i2822_1_, int p_i2822_2_, int p_i2822_3_, int p_i2822_4_)
    {
        this.x = p_i2822_1_;
        this.y = p_i2822_2_;
        this.width = p_i2822_3_;
        this.height = p_i2822_4_;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public boolean contains(int x, int y)
    {
        return x >= this.x && x <= this.x + this.width && y >= this.y && y <= this.y + this.height;
    }
}
